<?php

include "config/koneksi.php";

?>

<!DOCTYPE html>
<html>
<head>
	<title>LAPORAN TOKO ALAT KEBERSIHAN!</title>
</head>
<body>
	<form method="post">
		<table align="center">
			<tr>
				<td>
					<div class="mainutama">
						<table align="center">
							<tr>
								<td width="7%" rowspan="3" align="center" valign="top"><img src="img/icons8-clean-50.png" style="width:75px; height:70px;"></td>
       						<td width="93%" valign="bottom">&nbsp;LAPORAN TOKO ALAT KEBERSIHAN!</td>
							</tr>
							<tr>
								<td colspan="2">Jl.Sadewa 3 No.17, Semarang Tengah, Kota Semarang, Jawa Tengah</td>
							</tr>
						</table>
						<table width="100%">
						<tr><td><hr></td></tr>
					</table>
					<table align="center" border="1">
						<tr>
							<th bgcolor="#00FF00">No Order</th>
							<th bgcolor="#00FF00">Nama</th>
							<th bgcolor="#00FF00">No Telepon</th>
							<th bgcolor="#00FF00">Alamat</th>
							<th bgcolor="#00FF00">Jenis Barang</th>
							<th bgcolor="#00FF00">Harga</th>
							<th bgcolor="#00FF00">Tanggal Masuk</th>
							<th bgcolor="#00FF00">Total</th>
							<th bgcolor="#00FF00">Bayar</th>
							<th bgcolor="#00FF00">Status</th>
							<th bgcolor="#00FF00">Keterangan</th>
						</tr>
						<?php
					      @$sql = "SELECT * FROM order_masuk INNER JOIN pelanggan USING(id_pelanggan)";
					      @$query = mysqli_query($con, $sql);
					      while($data = mysqli_fetch_array($query)){
					    ?>
					    <tr>
					        <td align="center"><?= $data['no_order'] ?></td>
					        <td><?= $data['nama_pelanggan'] ?></td>
					        <td><?= $data['telp'] ?></td>
					        <td><?= $data['alamat'] ?></td>
					        <td><?= $data['jenis_barang'] ?></td>
					        <td>Rp.<?= $data['harga'] ?></td>
					        <td><?= $data['tgl_masuk'] ?></td>
					        <td align="center">Rp.<?= $data['t_bayar'] ?></td>
					        <td align="right">Rp.<?= $data['bayar'] ?></td>
					        <td><?= $data['status'] ?></td>
					        <td><?= $data['keterangan'] ?></td>
					      </tr>
					      <?php } ?>
					</table>
					<table width="100%">
			      		<tr><td><hr></td></tr>
			    	</table> 
			    	<table align="center">
			      		<tr>
			        	<td>&copy; <?php echo date('Y'); ?> TOKO ALAT KEBERSIHAN</td>
			      		</tr>
			    	</table>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>