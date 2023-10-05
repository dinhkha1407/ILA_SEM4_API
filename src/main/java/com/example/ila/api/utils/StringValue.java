package com.example.ila.api.utils;

public class StringValue {

	// ADMIN

	// account user and supp , login , change pass
	public static final String Admin_Login = " select * from Admin where username = ? and password = ?";

	// filter supplier
	public static final String Admin_FilterSupplier = "select * from Supplier where isActive=?";

	public static final String Admin_CheckEmailPwd = "select * from Admin where email = ?";

	public static final String Admin_UpdatePwd = "Update Admin SET password = ? where email = ?";

	public static final String Admin_UpdateAccountUser = "Update Account SET isActive = ? Where id = ?";

	public static final String Admin_SelectUser = "select * from Account";

	public static final String Admin_UpdateAccountSupplier = "Update Supplier SET isActive = ? Where id = ?";

	public static final String Admin_SelectSupplier = "select * from Supplier";

	// Prod Admin
	// select prod of all supp
	public static final String Admin_SelectProd = "select p.* , c.title as nameCate , s.title as nameSupp "
			+ "from Product p " + "join Category c ON p.idcate = c.id " + "join Supplier s ON p.idSupplier = s.id ";

	// Update prod
	public static final String Admin_UpdateProd = "Update Product SET isActive=? Where id=?";

	// Filter Prod theo trang thai cua supp
	public static final String Admin_FilterActiveProdOfSup = "select p.*,c.title as nameCate,s.title as nameSupp"
			+ " from Product p " + " join Category c on p.idcate=c.id " + " join Supplier s on p.idSupplier = s.id "
			+ " where p.isActive=? and p.idSupplier=? ";

	// filter prod theo trạng thái
	public static final String Admin_FilterActiveProd = "select p.*,c.title as nameCate,s.title as nameSupp"
			+ " from Product p " + " join Category c on p.idcate=c.id " + " join Supplier s on p.idSupplier = s.id "
			+ " where p.isActive=? ";

	// filter prod theo supp
	public static final String Admin_FilterProdSupp = "select p.*,c.title as nameCate,s.title as nameSupp"
			+ " from Product p " + " join Category c on p.idcate=c.id " + " join Supplier s on p.idSupplier = s.id "
			+ " where p.idSupplier=? ";

	// Category

	// Insert cate
	public static final String Admin_InsertCate = "Insert into Category(title,createDate,isActive) Values(?,?,?)";

	// select cate
	public static final String Admin_SelectCate = "Select * from Category";

	// get cate theo id
	public static final String Admin_GetCateById = "Select * from category where id=?";

	// update cate
	public static final String Admin_UpdateCate = "Update Category SET title = ? , createDate = ? , isActive = ?  where id = ?";

	// update active cate
	public static final String Admin_UpdateActive = "Update Category SET isActive = ? Where id = ?";

	// Filter cate
	public static final String Admin_FilterCategory = "Select * from Category WHERE isActive = ?";

	// Blog
	// Insert
	public static final String Admin_InsertBlog = "insert into Blog(title,image,description,createDate,idAccount,userCreate,isStatus) VALUES (?,?,?,?,?,?,?)";

	// getBlog
	public static final String Admin_SelectBlog = "select * from Blog where userCreate = 0";

	// xem chi tiết của blog đó
	public static final String Admin_SelectDetailBlog = "select b.title,b.image,b.description,b.createDate,b.isStatus\r\n"
			+ "from Blog b where b.id = ?";

	// xem các cmt của blog chi tiết đó
	public static final String Admin_GetCMTDetailBlog = "select cm.id, cm.comment, cm.reply ,cm.commentDate, cm.replyDate , a.name as nameCus\r\n"
			+ " from CommentBlog cm \r\n" + " join Blog b ON cm.idBlog = b.id \r\n"
			+ " join Account a ON cm.idAccount = a.id \r\n" + " where cm.idBlog = ?";
	// xem các cmt Main của blog chi tiết đó
	public static final String Admin_GetCMTMainDetailBlog = "  Select * From CommentBlog \r\n"
			+ "  Where idBlog = ? And indC = 0 And status = 0 And mnC = 0";
	// xem các cmt Sub của blog chi tiết đó
	public static final String Admin_GetCMTSubDetailBlog = "  SELECT * FROM CommentBlog Where idBlog=? and indC != 0 And mnC !=0 \r\n"
			+ "  ORDER BY mnC,indC ";

	// get ID Blog
	public static final String Admin_GetByIdBlog = "Select * from Blog where id = ?";

	// edit Blog
	public static final String Admin_EditBlog = "Update Blog SET title = ? , image = ? , description = ? , createDate = ? , idAccount = ? , userCreate = ? , isStatus = ?  where id=?";

	// Filter Blog
	public static final String Admin_FilterBlog = "Select * from Blog where userCreate!=0 And isStatus=?";

	// admin quan li Blog cua supp
	// select
	public static final String Admin_SelectBlogOfSupp = "Select * from Blog where userCreate != 0";

	// detail blog of supp
	public static final String Admin_BlogDetailsOfSup = "select b.title,b.image,b.description,b.createDate,b.isStatus\r\n"
			+ "from Blog b where id = ?";

	// update Blog of sup
	public static final String Admin_UpdateBlogDetailOfSup = "update Blog set isStatus =? Where id =?";

	// Voucher
	// insert
	public static final String Admin_InsertVoucher = "insert into Voucher (id,condition,discount,usercreate,startDate,endDate,isActive) VALUES(?,?,?,?,?,?,?)";

	// check voucher exist
	public static final String Admin_CheckVoucherExist = "select * from Voucher where id = ?";

	// select voucher of admin
	public static final String Admin_GetVoucher = "select * from Voucher where usercreate = 0";

	// filter voucher sắp diễn ra
	public static final String Admin_FilterVoucher1 = "select * from Voucher where usercreate =0 and getdate()<startDate ";

	// filter voucher dang dien ra
	public static final String Admin_FilterVoucher2 = "select * from Voucher where usercreate =0 and (getdate()between startDate and endDate)";

	// filter voucher sap het han
	public static final String Admin_FilterVoucher3 = "select * from Voucher where usercreate =0 and getdate()>endDate";

	// get ID voucher
	public static final String Admin_GetIDVoucher = "select * from Voucher where id= ?";

	// Update Voucher
	public static final String Admin_UpdateVoucher = "update Voucher set condition=?, discount=?,startDate=?,endDate=? ,isActive=? where id=?";

	// Delete Voucher
	public static final String Admin_DeleteVoucher = "DELETE FROM Voucher WHERE id=?";

	// Chart and Doanh Thu
	// 30 day chart
	public static final String Admin_Chart30Days = "  select sum(ia.price) as total,i.createDate as date\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  where MONTH(i.createDate)=?\r\n" + "  group by i.createDate";

	// 12 thang
	public static final String Admin_Chart12Months = "  select sum(ia.price) as total,MONTH(i.createDate) as month\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  where YEAR(i.createDate)=?\r\n" + "  group by MONTH(i.createDate)";

	// doanh thu 30 ngay
	public static final String Admin_Total30Days = "  select ia.idInvoice, v.discount,v.condition, i.totalPrice as totalInvoice, \r\n"
			+ "  v.discount as iLAPay, ia.price as totalA, ia.price as amountReceived, i.createDate as dateInvoice\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  join Voucher v on i.idVoucherA=v.id\r\n" + "  where MONTH(i.createDate)=?";

	// doanh thu 12 thang
	public static final String Admin_Total12Months = "select ia.idInvoice, v.discount,v.condition, i.totalPrice as totalInvoice, \r\n"
			+ "	v.discount as iLAPay, ia.price as totalA, ia.price as amountReceived, i.createDate as dateInvoice\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  join Voucher v on i.idVoucherA=v.id\r\n" + "  where YEAR(i.createDate)=?";

	public static final String Admin_Chart30DaysYear = "  select sum(ia.price) as total,i.createDate as date\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  where MONTH(i.createDate)=? and YEAR(i.createDate)=?\r\n" + "  group by i.createDate";

	public static final String Admin_Total30DaysYear = "select ia.idInvoice, v.discount,v.condition, i.totalPrice as totalInvoice, \r\n"
			+ "  v.discount as iLAPay, ia.price as totalA, ia.price as amountReceived, i.createDate as dateInvoice\r\n"
			+ "  from InvoiceAdmin ia\r\n" + "  join Invoice i on ia.idInvoice=i.id\r\n"
			+ "  join Voucher v on i.idVoucherA=v.id\r\n" + "  where MONTH(i.createDate)=? and YEAR(i.createDate)=?";

	// ----> Supplier

	// quan li don hang, join invoice theo id supplier login vao
	public static final String Supplier_SelectInvoiceOfSup = " select DISTINCT i.isStatus, i.id, a.name as nameCus, vA.coupon as VoucherA,vS.coupon as VoucherS, i.TotalPrice, i.createDate\r\n"
			+ " from Invoice i\r\n" + " join InvoiceSupplier isu on i.id = isu.idInvoice\r\n"
			+ " join Account a on i.idAccount = a.id\r\n" + " join Voucher vA on i.idVoucherA=vA.id  \r\n"
			+ " join Voucher vS on i.idVoucherS=vS.id\r\n" + " join InvoiceDetails ide on i.id=ide.idInvoice\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n" + " join Product p on ca.idProduct = p.id\r\n"
			+ " where p.idSupplier = ? ";

	// xem chi tiet don hang theo id invoice
	public static final String Supplier_SelectInvoiceDetails = "Select p.title as nameProduct,p.price as unitPrice , ca.Amount, ca.Price from Invoice i\r\n"
			+ " join InvoiceDetails ide on i.id=ide.idInvoice\r\n" + " join Account a on i.idAccount = a.id\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n" + " join Product p on ca.idProduct = p.id\r\n"
			+ " where ide.idInvoice = ? ";

	// confirm don hang
	public static final String Supplier_UpdateInvoice = " UPDATE Invoice SET isStatus = ? WHERE id = ?";

	// search don hang filter theo trang thai
	public static final String Supplier_SearchInvoiceFilter = "select DISTINCT i.id, a.name as nameCus, vA.coupon as VoucherA,vS.coupon as VoucherS, i.TotalPrice, i.createDate\r\n"
			+ " from Invoice i\r\n" + " join InvoiceSupplier isu on i.id = isu.idInvoice\r\n"
			+ " join Account a on i.idAccount = a.id\r\n" + " join Voucher vA on i.idVoucherA=vA.id  \r\n"
			+ " join Voucher vS on i.idVoucherS=vS.id\r\n" + " join InvoiceDetails ide on i.id=ide.idInvoice\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n" + " join Product p on ca.idProduct = p.id\r\n"
			+ " where p.idSupplier = ? and i.isStatus = ? ";

	// quan li PRODUCT

	// count filter Supplier
	public static final String Supplier_CountFilterActive = "select count (id) as countID FROM Product WHERE idSupplier = ? AND isActive = ?";

	// view all product of supplier
	public static final String Supplier_SelectProductOfSup = "select p.id , p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price, \r\n"
			+ " p.isActive, p.idcate , p.idSupplier , c.title as nameCate \r\n" + " from Product p\r\n"
			+ " join Category c ON p.idcate = c.id\r\n" + " where p.idSupplier = ? ";

	// select category
	public static final String Supplier_Cate = "Select * From Category where isActive = 1";

	// ínert product
	public static final String Supplier_InsertProdOfSup = "insert into Product (title,image,image1,image2,image3,description,price,idSupplier,isActive,idcate)"
			+ " values(?,?,?,?,?,?,?,?,?,?)";

	// update product
	public static final String Supplier_UpdateProdOfSup = "UPDATE Product SET title = ? , image = ? , image1 = ? , image2 = ? , image3 = ? , description = ? , price = ? , isActive = ? , idcate = ? \r\n"
			+ " WHERE id = ? ";

	// filter theo Active
	public static final String Supplier_SearchActiveProdSup = "select p.id, p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price, \r\n"
			+ " p.isActive,p.idcate , p.idSupplier, c.title as nameCate \r\n" + " from Product p\r\n"
			+ " join Category c ON p.idcate = c.id\r\n" + " where p.isActive = ? and p.idSupplier = ? ";

	// filter high to low prod
	public static final String Supplier_SearchHighToLow = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price,"
			+ " p.isActive,p.idcate , p.idSupplier, c.title as nameCate " + " from Product p "
			+ " join Category c ON p.idcate = c.id " + " ORDER BY price DESC ";

	// filter low to high prod
	public static final String Supplier_SearchLowToHigh = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price,\"\r\n"
			+ " p.isActive,p.idcate , p.idSupplier, c.title as nameCate " + " from Product p "
			+ " join Category c ON p.idcate = c.id " + " ORDER BY price ASC ";

	// filter discount cho prod (ngay bat dau va ngay ket thuc)
	public static final String Supplier_SearchDiscountOfSup = "select p.id, p.title, p.image , p.image1, p.image2 , p.image3 , p.description, p.price , \r\n"
			+ " p.idSupplier , p.isActive , p.idcate ,p.price - d.discount as \"finalPrice\" \r\n" + " FROM Product p "
			+ " JOIN Discount d on p.id = d.idProduct " + " where getdate() between d.dateBegin and d.dateEnd";

	// quan li voucher and discount
	// view discount
	public static final String Supplier_SelectDiscount = "select d.id , d.discount , d.dateBegin , d.dateEnd , d.idProduct , d.isStatus , p.title , p.price ,p.price - d.discount as SalePrice "
			+ " from Discount d " + " join Product p ON d.idProduct = p.id ";

	// insert discount --> dung ben insert prod
	public static final String Supplier_InsertDiscount = "insert into Discount(discount,dateBegin,dateEnd,idProduct,isStatus) values(?,?,?,?,?)";

	// update discount
	public static final String Supplier_UpdateDiscount = "update Discount SET  discount = ? , dateBegin = ? , dateEnd = ? , idProduct = ? , isStatus = ? where id = ?";

	// filter discount sap dien ra
	public static final String Supplier_FilterDiscount1 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice\r\n"
			+ "  from Discount d " + "  join Product p on d.idProduct=p.id "
			+ "  where p.idSupplier = ? and getdate()<d.dateBegin";

	// filter discount dang dien ra
	public static final String Supplier_FilterDiscount2 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice\r\n"
			+ "  from Discount d " + "  join Product p on d.idProduct=p.id "
			+ "  where p.idSupplier = ? and (getdate() between d.dateBegin and d.dateEnd)";

	// filter discount da het han
	public static final String Supplier_FilterDiscount3 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice"
			+ "  from Discount d " + "  join Product p on d.idProduct=p.id "
			+ "  where p.idSupplier=? and getdate()>d.dateEnd";

	// view voucher
	public static final String Supplier_SelectVoucher = "select * from Voucher where usercreate = ?";

	// insert voucher --> ap dung cho client
	public static final String Supplier_InsertVoucher = "insert into Voucher(id,condition,discount,usercreate,startDate,endDate,isActive) values (?,?,?,?,?,?,?)";

	// update voucher
	public static final String Supplier_UpdateVoucher = "update Voucher SET condition = ? , discount = ? , usercreate = ? , startDate = ? , endDate = ? , isActive = ? where id = ?";

	// filter voucher sắp diễn ra
	public static final String Supplier_FilterVoucher1 = "select *" + "	from Voucher "
			+ "	where usercreate = ? and getdate()<startDate";

	// filter voucher dang dien ra
	public static final String Supplier_FilterVoucher2 = "select *" + " from Voucher "
			+ " where usercreate = ? and (getdate()between startDate and endDate)";

	// filter voucher het han
	public static final String Supplier_FilterVoucher3 = "select *" + " from Voucher "
			+ " where usercreate = ? and getdate()>endDate";

	// Blog
	// Ínert blog
	public static final String Supplier_InsertBlog = "insert into Blog (title,image,description,createDate,idAccount,userCreate,isStatus) values (?,?,?,?,?,?,0)";

	// update blog
	public static final String Supplier_UpdateBlog = "update Blog SET title = ? , image = ? , description = ? , createDate = ? , idAccount = ? , userCreate = ? , isStatus = ? where id = ?";

	// view Blog
	public static final String Supplier_SelectBlog = "select * from Blog where userCreate = ?";

	// view details
	// get ID
	public static final String Supplier_DetailBlog = "select b.title as title,b.id as id,b.image as image,b.description as description,b.createDate as createDate,b.idAccount as idAccount,b.userCreate as userCreate,b.isStatus as isStatus from Blog b where b.id = ? ";

	// Filter trang thai
	public static final String Supplier_FilterBlog = "select * from Blog where userCreate = ? and isStatus = ?";

	// commentBlogDetail
	public static final String Supplier_CommentDetailBlog = "select cm.id, cm.comment, cm.reply ,cm.commentDate, cm.replyDate ,"
			+ " a.name as nameCus ,a.id as idCus " + " s.title as nameSupp " + " from CommentBlog cm "
			+ " join Blog b ON cm.idBlog = b.id " + " join Account a ON cm.idAccount = a.id "
			+ " join Supplier s on b.userCreate=s.id " + " where cm.idBlog = ?";

	// update comment blog
	public static final String Supplier_UpdateCommentBlog = "update CommentBlog set reply = ?, replyDate =? where id=?";

	// getData_CommentBlog
	public static final String Supplier_GetDataCMT = "select cm.reply" + " from CommentBlog cm " + "  where cm.id=?";

	// xem thong tin review cua prod
	public static final String Supplier_SelectReviewProd = "select distinct p.id as idProduct, p.title as nameProd,"
			+ " avg(cast(r.review as float)) as avgReview,"
			+ " count(r.id) as countReview from Review r join Product p on r.idProduct=p.id where r.idProduct= ?  group by p.id, p.title";

	// xem chi tiết các review của sản phẩm
	public static final String Supplier_DetailReview = "select a.name as nameCus, r.review,r.createDate,r.idProduct"
			+ " from Review r " + " join Account a on r.idAccount=a.id " + " where r.idProduct=?";

	// Filter Star Review
	public static final String Supplier_FilterReview = "select a.name as nameCus, r.review,r.createDate "
			+ " from Review r " + " join Account a on r.idAccount=a.id " + " where r.idProduct=? and r.review=?";

	// count star review
	public static final String Supplier_CountReview = "Select count (*) as countReview from Review where idProduct = ?";

	// count filter star review
	public static final String Supplier_CountFilterReview = "select count (*) as countFilter from Review where idProduct = ? and review = ?";

	// quan li doanh thu ... 

	public static final String Supplier_Revenue_Month = "select SUM(totalS) as totalS from Invoice i join InvoiceSupplier ins\r\n"
			+ "on i.id = ins.idInvoice\r\n" + "where MONTH(i.createDate) = ?\r\n" + "and YEAR(i.createDate) = 2023";
	public static final String Supplier_Revenue_Day = "select SUM(totalS) as totalS from Invoice i join InvoiceSupplier ins\r\n"
			+ "on i.id = ins.idInvoice\r\n" + "where DAY(i.createDate) = ?\r\n" + "and MONTH(i.createDate) = ?\r\n"
			+ "and YEAR(i.createDate) = 2023";

	// watch list
	public static final String Supplier_WatchList = "select count (*) as countWatch from WatchList where idProduct = ?";

	// view so luong da ban
	public static final String Supplier_CountCart = " select count (*) as countCart from Cart where Status = 3";
	
	
	
	
	//NEW - CHINH SUA 30/9/2023 - FUNC MOI NHAT
	
	
	//NEW don hang supplier
	//detail order supplier - 30/9/2023
	public static final String Supplier_detailOrders = "select p.title as nameProduct , (c.price / c.amount) as priceOrder , c.amount , c.price , inv.isStatus , inv.id as idInvoiceDetail , i.id as idInvoice\r\n"
			+ "from Invoice i \r\n"
			+ "join InvoiceDetails inv ON i.id = inv.idInvoice \r\n"
			+ "join Cart c ON inv.idCart = c.id  \r\n"
			+ "join Product p ON c.idProduct = p.id;";
	
	
	//confirm detail order -- 2 ham 
	public static final String Supplier_ConfirmInvDetail = "update InvoiceDetails set isStatus = ? where id = ?";
	
	public static final String Supplier_ConfirmInv = "update Invoice set isStatus = 1 where id = ?";
	
	
	
	//Order Supplier NEW - 30/9/2023
	public static final String Supplier_GetNameAddDate = "select a.name as nameCus, i.address, i.createDate\r\n"
			+ "from Invoice i\r\n"
			+ "join Account a ON i.idAccount = a.id where i.id = ?";
	
	
	public static final String Supplier_GetTotalOrderAmount = "select sum(c.price) as TotalOrderAmount , p.idSupplier\r\n"
			+ "from InvoiceDetails inv \r\n"
			+ "join Cart c ON inv.idCart = c.id\r\n"
			+ "join Product p ON c.idProduct = p.id\r\n"
			+ "where p.idSupplier = ? GROUP BY p.idSupplier";
	
	public static final String Supplier_GetTotalAmountOfProduct = "select sum(c.price) as TotalAmountOfProduct , p.idSupplier\r\n"
			+ "from InvoiceDetails inv\r\n"
			+ "join Cart c ON inv.idCart = c.id\r\n"
			+ "join Product p ON c.idProduct = p.id\r\n"
			+ "where inv.isStatus = 1 and p.idSupplier = ? GROUP BY p.idSupplier";
	
	//public static final String Supplier_GetPriceVoucher1 = "select idVoucherS from Invoice";
	public static final String Supplier_GetPriceVoucher = "select * from Voucher where id IN(?) AND usercreate  = ? ";
	
	//public static final String Supplier_GetPriceVoucher2 = "select discount from Voucher where usercreate = ?";
	
	
	public static final String Supplier_GetRefundtoCustomers = "select sum(c.price) as RefundtoCustomers,p.idSupplier\r\n"
			+ "from InvoiceDetails inv\r\n"
			+ "join Cart c ON inv.idCart = c.id\r\n"
			+ "join Product p ON c.idProduct = p.id\r\n"
			+ "where isStatus = 2 and idSupplier = ? GROUP BY p.idSupplier";
	
	
	public static final String Supplier_GetMoneyReceived = "select ins.price from InvoiceSupplier ins where status = 1 and idSupplier = ?";
	
	
	public static final String Supplier_GetXacNhanDaNhanTienSupp = "update InvoiceSupplier set status = 2"; 
	
	
	public static final String Supplier_ActionOrder = "select inv.isStatus as sttInvoice, ins.status \r\n"
			+ "from InvoiceSupplier ins\r\n"
			+ "join Invoice inv ON ins.idInvoice = inv.id\r\n"
			+ "where inv.isStatus = ? and ins.status = ?";
	
	
	//update active prod NEW 1/10/2023
	public static final String Supplier_UpdateActiveProd = "update Product set isActive = ? where id = ?";
	

	//DELETE VOUCHER KHI TRANG THAI LA SAP DIEN RA 
	public static final String Supplier_DeleteVoucher = "delete from Voucher where id = ?";
	
	
	
	
}
