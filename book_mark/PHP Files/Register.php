<?php
    $con = mysqli_connect("host", "username", "password", "database_names");
    
	if($link === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
	$json['access']="denied";
	echo json_encode(json);
}
	
    $name = $_POST["name"];
    $age = $_POST["age"];
    $username = $_POST["username"];
    $password = $_POST["password"];
   // $statement = mysqli_prepare($con, "INSERT INTO user (name, username, age, password) VALUES (?, ?, ?, ?)");
   
   $query = "INSERT INTO user_info (name, age, username, password) VALUES ('$name','$age' ,'$username' ,'$password' )";
   mysqli_query($con,$query);
   
   
   
   /* mysqli_stmt_bind_param($statement, "siss", $name, $age, $username, $password);
    mysqli_stmt_execute($statement);*/
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>