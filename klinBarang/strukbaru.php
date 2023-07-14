<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>cetak print struck</title>
</head>
<body>

    <center>
        <h2>Struk Toko Alat Kebersihan</h2>
        <h3>Kebersihan sebagian dari iman</h3>
    </center>

    <?php
            include 'config/koneksi.php'
    ?>
    <table border="1" style="width: 100%;">
        <tr>
            <th width="1%"> no</th>
            <th > nama </th>
            <th > tanggal </th>
            <th > total </th>
            <th > bayar </th>
        </tr>
        <?php
            $no =1;
            $sql = mysqli_query($con, "SELECT * FROM order_masuk ");
            while($row +mysqli_fetch_array($sql)){
                ?>
                <tr>
                        <td><php echo $no++; ?></td>
                        <td><php echo $row[nama_pelanggan]; ?></td>
                        <td><php echo $row[tgl_masuk]; ?></td>
                        <td><php echo $row[t_bayar]; ?></td>
                        <td><php echo $row[bayar]; ?></td>
                    </tr>
                <?php

                    }
                ?>
            
    </table>
    <script>
        window.print()
    </script>
    
</body>
</html>