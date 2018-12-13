<?php


$host = "localhost"; 
$usuario = "";  
$password = ""; 
$nameDB = "happyclient";


$con = mysql_connect($host,$usuario,$senha)or die (mysql_error());
$db = msql_select_db($nameDB,$con)or die (mysql_error());


?>