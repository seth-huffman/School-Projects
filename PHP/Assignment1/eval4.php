<?php
function oLF()
{
return("\n");
}

$x=(int)$argc;
--$x;

if($argc != 4)
{
 echo "ERROR W/ ARGS " .$x.oLF();
 exit;
}
