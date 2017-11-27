<?php
include 'config.inc.php';
/*$connect = mysqli_connect("localhost", "root", "root", "9tutorials"); */
$sql = "SELECT * FROM tbl_histo";  
$result = mysqli_query($connect, $sql);  
$json_array = array();  
while($row = mysqli_fetch_assoc($result))  
{  
     $json_array[] = $row;  
}  
echo json_encode($json_array);  
?>