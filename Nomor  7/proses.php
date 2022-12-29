<?php
include 'connection.php';

$nim = $_POST['NIM'];
$nama = $_POST['Nama'];
$gender = $_POST['Gender'];
$alamat = $_POST['Alamat'];
$prodi = $_POST['Prodi'];
$foto = "img1.jpg";
$email = $_POST['Email'];

$query = "INSERT INTO tbl_mhs VALUES(null, '$nim', '$nama', '$gender', '$alamat', '$prodi', '$foto', '$email')";
$sql = mysqli_query($conn, $query);

if ($sql) {
    header("location: index.php");
} else {
    echo $query;
}
