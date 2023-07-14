<?php 
include "config/koneksi.php";
?>
<form method="post">
<table border="1" align="center">
  <tr>
    <td>
      <div class="utama">
		<table align="center">
      		<tr>
        		<td width="7%" rowspan="3" align="center" valign="top"><img src="img/icons8-receipt-50.png" style="width:75px; height:70px;"></td>
        		<td width="93%" valign="top">&nbsp;<b>STRUK TOKO ALAT KEBERSIHAN!</b></td>
      		</tr>
      		<tr>
       			<td valign="top">&nbsp;Jl.Sadewa 3 No.17,Semarang Tengah, Kota Semarang, Jawa Tengah</td>
      		</tr>
    	</table>
    	<table width="100%">
      	<tr><td><hr></td></tr>
    	</table>
  		<table cellspacing="0" align="center">  
			
  		<?php $sql = "SELECT * FROM order_masuk";
		      $query = mysqli_query($con,$sql);
		      $row = mysqli_fetch_array($query);
		 ?>
		<tr>
			<td>Nama      </td><td>: </td><td> &nbsp;<?php echo $row['nama_pelanggan'];?></td>
		</tr>
		<tr>
      		<td>Tanggal     </td><td>: </td><td> &nbsp;<?php echo $row['tgl_masuk']; ?></td>
     	</tr>
      	<tr>
      		<td>Total </td><td>: </td><td> &nbsp;Rp.<?php echo $row['t_bayar']; ?></td>
      	</tr>
        <tr>
          <td>Bayar </td><td>: </td><td> &nbsp;<?php echo $row['bayar']; ?></td>
        </tr>
        <tr>
          <td>Status </td><td>: </td><td> &nbsp;<?php echo $row['status']; ?></td>
        </tr>
    	<table  width="100%">
      		<tr><td><hr></td></tr>
      		<tr><td><center> SELAMAT DATANG KEMBALI </center><hr></td></tr>
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


<script type="text/javascript">
  window.onload=function(){
  window.print();
}
</script> 