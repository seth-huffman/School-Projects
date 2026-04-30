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

{
if ($argv[1] == $argv[2]) echo "same";
if ($argv[1] !== $argv[2]) echo "different";
}



echo "3)".oLF();

echo $argv[1][0].oLF();
echo $argv[2][1].oLF();
echo $argv[3][2].oLF();




echo "4)".oLF();
//echo str_word_count(" cat dog fish frog ");
  //if($pet > 3)
  //{
    //echo "Correct";
  //}
  //if($pet = 4){
    //echo "Usage Error";
  //}


$x=(int)$argc;
--$x;

if($argc != 4)
{
 echo "ERROR W/ ARGS " .$x.oLF();
 exit;
}
?>
