<?php
/*$connect = mysqli_connect("localhost", "root", "root", "9tutorials"); */

$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "9tutorials";

try {
    	$conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    	$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }
catch(PDOException $e)
    {
    	die("OOPs something went wrong");
    }
 
?>
