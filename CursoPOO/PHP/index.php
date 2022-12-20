<?php

require_once('Car.php');
require_once('UberX.php');
require_once('Account.php');
require_once('UberPool.php');

$UberX = new UberX("Licensia", new Account("Andres de Res", "Documentos"), "Mazda", "Modelo");
$UberX->PrintDataCar();

$UberPool = new UberPool("Licensia", new Account("Andres de Res", "Documentos"), "Mazda", "Modelo");
$UberPool->PrintDataCar();


?>