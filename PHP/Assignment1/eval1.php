<?php
function oLF ()
{
 return("\n");
}

$len=strlen($argv[1]);
echo $len.oLF();

echo $argv[1].oLF();
echo $argv[1].oLF();
echo $argv[1].oLF();

?>
