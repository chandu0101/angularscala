#!/bin/sh

# requires jq library to parse json ,you can install usin brew install jq command if you have hombrew on u r mac


# colored echo function to print text in yellow
function cEcho(){
local exp=$1;
local color=$2;
if ! [[ $color =~ '^[0-9]$' ]] ; then
case $(echo $color | tr '[:upper:]' '[:lower:]') in
black) color=0 ;;
red) color=1 ;;
green) color=2 ;;
yellow) color=3 ;;
blue) color=4 ;;
magenta) color=5 ;;
cyan) color=6 ;;
white|*) color=7 ;; # white or invalid color
esac
fi
tput setaf $color;
echo $exp;
tput sgr0;
}



# get comment
comment="$1"

if [ "$comment" == "" ]; then
comment="adding gh-pages"
cEcho "no comment specified to deploy using default : adding gh-pages" yellow
fi

#get directories

cssPath=($(jq -r '.css' file.json))

htmlPath=($(jq -r '.html' file.json))

jsPath=($(jq -r '.js' file.json))

imagesPath=($(jq -r '.images' file.json))


# validating directories

if [ -d "$cssPath" ]; then
 isCssPath=true
fi

if [ -d "$htmlPath" ]; then
 isHtmlPath=true
fi

if [ -d "$jsPath" ]; then
 isJsPath=true
fi

if [ -d "$imagesPath" ]; then
 isImagesPath=true
fi



# check if gh-pages branch exist ,command below return 0 for success 128 for failure
git show-branch gh-pages

if [ $? != 0 ]; then
git checkout --orphan gh-pages # create pages branch
git rm -rf .

else
git checkout gh-pages
fi

cEcho "In gh-pages branch , copying deployment files from master" yellow

if [ $isCssPath ]; then
  git checkout master -- "$cssPath"
fi

if [ $isHtmlPath ]; then
  git checkout master -- "$htmlPath"
fi

if [ $isJsPath ]; then
  git checkout master -- "$jsPath"
fi

if [ $isImagesPath ]; then
  git checkout master -- "$imagesPath"
fi

git checkout master -- index.html
git checkout master -- README.md


cEcho " pushing changes to gh-pages" yellow

git commit -a -m "$comment"
git push origin gh-pages

cEcho " successfully deployed changes to gh-pages" yellow

cEcho " switching back to master branch" yellow

git checkout -f master