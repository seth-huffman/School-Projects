<?php
function oLF()
{
  return("\n");
}

$x=(int)$argc;
--$x;

if($argc != 3)
{
  echo "Expected 2 args got ".$x.oLF();
  exit;
}

$cnt=(int)$argv[2];

//for loop
for($i=0;$i<$cnt;++$i)
{
  echo $argv[1].oLF();
}

$len=strlen($argv[1]);
echo "The length of ".$argv[1]." is ".$len.oLF();

$bcnt=0;
echo "The character for ".$argv[1]." are:".oLF();

//for loop
for($i=0;$i<$len;++$i)
{
  echo $argv[1][$i].oLF();
  //if statement
  if($argv[1][$i]=='b')
  {
    ++$bcnt;
  }
  //if statement
  if($argv[1][$i]==',')
  {
    //if statement
    if($argv[1][$i]==';')
  }
}

echo "There are ".$bcnt." b's in ".$argv[1].oLF();
exit;



//String Compare -- Compares two strings
//if statement
if(!strcmp($argv[1],"bob"))
{
  echo $argv[1]." is ok".oLF();
}
else {
  echo $argv[1]." is bad".oLF();
}
