<?php

function oLF()
  {
  return("\n");
}




echo "1)".oLF();
$len=strlen($argv[1]);
for($i=0;$i<$len;++$i)
{
  echo $argv[1] .oLF();
}

echo "2)".oLF();

echo $argv[1][0].oLF();
echo $argv[2][0].oLF();
echo $argv[3][0].oLF();

echo "3)".oLF();

{
if ($argv[2] == $argv[3]) echo "same";
if ($argv[2] !== $argv[3]) echo "different";
}




?>
