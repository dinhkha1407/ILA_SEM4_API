package com.example.ila.api.utils;

public class StringValue {
	
	
	//ADMIN
	
	public static final String Admin_Login =" select * from Admin where username = ? and password = ?";
	
	public static final String Admin_RequestRegisterSupplier = "";
	
	public static final String Admin_CheckEmailPwd = "";
	
	public static final String Admin_UpdatePwd = "";
	
	public static final String Admin_UpdateAccountUser = "";
	
	public static final String Admin_SelectUser = "select * from Account";
	
	public static final String Admin_UpdateAccountSupplier = "";
	
	public static final String Admin_SelectSupplier = "";
	
	public static final String Admin_SearchIsActive = "";
	
	public static final String Admin_CreateVoucher = "";
	
	public static final String Admin_UpdateVoucher = "";
	
	public static final String Admin_CheckVoucherExist = "";
	//where id = ?
	
	public static final String Admin_SelectVoucherOfAdmin = "";
	//where usercreate = admin
	
	public static final String Admin_RequestProductSupplier = "";

	public static final String Admin_SelectProdByCate = "";
	//join category
	
	public static final String Admin_SearchProdByIdSupplier = "";
	//join category
	
	public static final String Admin_SearchProdByIsActive = "";
	//join category
	
	public static final String Admin_SearchProdByIdSupplierAndIsActive = "";
	//join category
	
	public static final String Admin_InsertCate = "";
	
	public static final String Admin_SelectCate = "";
	
	public static final String Admin_CreateBlog = "";
	
	public static final String Admin_RequestBlog = "";
	
	public static final String Admin_SelectBlog = "";
	
	public static final String Admin_UpdateBlog = "";
	
	//doanh thu admin ....
	
	
	
	
	
	
	// ----> Supplier
	
	
	//quan li don hang, join invoice theo id supplier login vao
	public static final String Supplier_SelectInvoiceOfSup = " select DISTINCT i.isStatus, i.id, a.name as nameCus, vA.coupon as VoucherA,vS.coupon as VoucherS, i.TotalPrice, i.createDate\r\n"
			+ " from Invoice i\r\n"
			+ " join InvoiceSupplier isu on i.id = isu.idInvoice\r\n"
			+ " join Account a on i.idAccount = a.id\r\n"
			+ " join Voucher vA on i.idVoucherA=vA.id  \r\n"
			+ " join Voucher vS on i.idVoucherS=vS.id\r\n"
			+ " join InvoiceDetails ide on i.id=ide.idInvoice\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n"
			+ " join Product p on ca.idProduct = p.id\r\n"
			+ " where p.idSupplier = ? ";
	
	//xem chi tiet don hang theo id invoice
	public static final String Supplier_SelectInvoiceDetails = "Select p.title as nameProduct,p.price as unitPrice , ca.Amount, ca.Price from Invoice i\r\n"
			+ " join InvoiceDetails ide on i.id=ide.idInvoice\r\n"
			+ " join Account a on i.idAccount = a.id\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n"
			+ " join Product p on ca.idProduct = p.id\r\n"
			+ " where ide.idInvoice = ? ";

	
	
	//confirm don hang 
	public static final String Supplier_UpdateInvoice = " UPDATE Invoice SET isStatus = ? WHERE id = ?";
	
	
	
	//search don hang filter theo trang thai
	public static final String Supplier_SearchInvoiceFilter = "select DISTINCT i.id, a.name as nameCus, vA.coupon as VoucherA,vS.coupon as VoucherS, i.TotalPrice, i.createDate\r\n"
			+ " from Invoice i\r\n"
			+ " join InvoiceSupplier isu on i.id = isu.idInvoice\r\n"
			+ " join Account a on i.idAccount = a.id\r\n"
			+ " join Voucher vA on i.idVoucherA=vA.id  \r\n"
			+ " join Voucher vS on i.idVoucherS=vS.id\r\n"
			+ " join InvoiceDetails ide on i.id=ide.idInvoice\r\n"
			+ " join Cart ca on ide.idCart = ca.id\r\n"
			+ " join Product p on ca.idProduct = p.id\r\n"
			+ " where p.idSupplier = ? and i.isStatus = ? ";
	
	//quan li PRODUCT
	//view all product of supplier
	public static final String Supplier_SelectProductOfSup = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price, \r\n"
			+ " p.isActive, p.idcate , p.idSupplier , c.title as nameCate \r\n"
			+ " from Product p\r\n"
			+ " join Category c ON p.idcate = c.id\r\n"
			+ " where p.idSupplier = ? ";
	
	//select category
	public static final String Supplier_Cate = "Select * From Category where isStatus = 1";
	
	//ínert product
	public static final String Supplier_InsertProdOfSup = "insert into Product (title,image,image1,image2,image3,description,price,idSupplier,isActive,idcate)"
			+ "values(?,?,?,?,?,?,?,?,?,?)";
	
	//update product
	public static final String Supplier_UpdateProdOfSup = "UPDATE Product SET title = ? , image = ? , image1 = ? , image2 = ? , image3 , description = ? , price = ? , isActive = ? , idcate = ? \r\n"
			+ " WHERE id = ? ";
	
	//filter theo Active
	public static final String Supplier_SearchActiveProdSup = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price, \r\n"
			+ " p.isActive,p.idcate , p.idSupplier, c.title as nameCate \r\n"
			+ " from Product p\r\n"
			+ " join Category c ON p.idcate = c.id\r\n"
			+ " where p.isActive = ? ";	
	
	//filter high to low prod
	public static final String Supplier_SearchHighToLow = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price,"
			+ " p.isActive,p.idcate , p.idSupplier, c.title as nameCate"
			+ " from Product p"
			+ " join Category c ON p.idcate = c.id"
			+ " ORDER BY price DESC ";
	
	//filter low to high prod
	public static final String Supplier_SearchLowToHigh = "select p.title, p.image, p.image1 , p.image2, p.image3 , p.description , p.price,\"\r\n"
			+" p.isActive,p.idcate , p.idSupplier, c.title as nameCate"
			+" from Product p"
			+" join Category c ON p.idcate = c.id"
			+" ORDER BY price ASC ";
	
	//filter discount cho prod (ngay bat dau va ngay ket thuc)
	public static final String Supplier_SearchDiscountOfSup = "select p.id, p.title, p.image , p.image1, p.image2 , p.image3 , p.description, p.price , \r\n"
			+ " p.idSupplier , p.isActive , p.idcate ,p.price - d.discount as \"finalPrice\" \r\n"
			+ " FROM Product p"
			+ " JOIN Discount d on p.id = d.idProduct"
			+ " where getdate() between d.dateBegin and d.dateEnd";
	
	//quan li voucher and discount
	//view discount
	public static final String Supplier_SelectDiscount = "select d.id , d.discount , d.dateBegin , d.dateEnd , d.idProduct , d.isStatus , p.title , p.price ,p.price - d.discount as SalePrice"
			+ "from Discount d"
			+ "join Product p ON d.idProduct = p.id";
	
	//insert discount --> dung ben insert prod
	public static final String Supplier_InsertDiscount = "insert into Discount(discount,dateBegin,dateEnd,idProduct,isStatus) values(?,?,?,?,?)";
	
	//update discount
	public static final String Supplier_UpdateDiscount = "update Discount SET  discount = ? , dateBegin = ? , dateEnd = ? , idProduct = ? , isStatus = ? where id = ?";
	
	
	//filter discount sap dien ra
	public static final String Supplier_FilterDiscount1 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice\r\n"
			+ "  from Discount d"
			+ "  join Product p on d.idProduct=p.id"
			+ "  where p.idSupplier = ? and getdate()<d.dateBegin";
	
	//filter discount dang dien ra
	public static final String Supplier_FilterDiscount2 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice\r\n"
			+ "  from Discount d"
			+ "  join Product p on d.idProduct=p.id"
			+ "  where p.idSupplier = ? and (getdate() between d.dateBegin and d.dateEnd)";
	
	//filter discount da het han
	public static final String Supplier_FilterDiscount3 = "select d.*,p.title ,p.price, (p.price-d.discount) as salePrice"
			+ "  from Discount d"
			+ "  join Product p on d.idProduct=p.id"
			+ "  where p.idSupplier=? and getdate()>d.dateEnd";
	
	
	
	//view voucher
	public static final String Supplier_SelectVoucher = "select * from Voucher where usercreate = ?";
	
	//insert voucher --> ap dung cho client
	public static final String Supplier_InsertVoucher = "insert into Voucher(id,coupon,condition,discount,usercreate,startDate,endDate,isActive) values (?,?,?,?,?,?,?,?)";
	
	//update voucher
	public static final String Supplier_UpdateVoucher = "update Voucher SET coupon = ? , condition = ? , discount = ? , usercreate = ? , startDate = ? , endDate = ? , isActive = ? where id = ?";
	
	//filter voucher sắp diễn ra
	public static final String Supplier_FilterVoucher1 = "select *"
			+ "	from Voucher "
			+ "	where usercreate = ? and getdate()<startDate";
	
	//filter voucher dang dien ra
	public static final String Supplier_FilterVoucher2 = "select *"
			+ "from Voucher "
			+ "where usercreate = ? and (getdate()between startDate and endDate)";
	
	//filter voucher het han
	public static final String Supplier_FilterVoucher3 = "select *"
			+ "from Voucher "
			+ "where usercreate = ? and getdate()>endDate";
	
	//Blog
	//Ínert blog
	public static final String Supplier_InsertBlog = "insert into Blog (title,image,description,createDate,idAccount,userCreate) values (?,?,?,?,?,?)";
	
	//update blog 
	public static final String Supplier_UpdateBlog = "update Blog SET title = ? , image = ? , description = ? , createDate = ? , idAccount = ? , userCreate = ? where id = ?";
	
	//view Blog 
	public static final String Supplier_SelectBlog = "select * from Blog where userCreate = ?";
	
	//view details
	public static final String Supplier_DetailBlog = "select b.title,b.image,b.description,b.createDate"
			+ "from Blog b"
			+ "where b.id = ?";
	
	//commentBlogDetail
	public static final String Supplier_CommentDetailBlog= "select cm.id, cm.comment, cm.reply ,cm.commentDate, cm.replyDate ,"
			+ "a.name as nameCus ,a.id as idCus "
			+ "s.title as nameSupp"
			+ "from CommentBlog cm"
			+ "join Blog b ON cm.idBlog = b.id"
			+ "join Account a ON cm.idAccount = a.id"
			+ "join Supplier s on b.userCreate=s.id"
			+ "where cm.idBlog = ?";
	
	//update comment blog
	public static final String Supplier_UpdateCommentBlog = "update CommentBlog set reply = ?, replyDate =? where id=?";
	
	
	//getData_CommentBlog
	public static final String Supplier_GetDataCMT = "select cm.reply"
			+ "from CommentBlog cm"
			+ "where cm.id=?";
	
	//xem thong tin review cua prod
	public static final String Supplier_SelectReviewProd = "select distinct p.id as idProduct, p.title as nameProd, avg(cast(r.review as float)) as avgReview, count(r.id) as countReview"
			+ "from Review r"
			+ "join Product p on r.idProduct=p.id"
			+ "where r.idProduct=?"
			+ "group by p.id, p.title ";
	
	//xem chi tiết các review của sản phẩm
	public static final String Supplier_DetailReview = "select a.name as nameCus, r.review,r.createDate"
			+ "from Review r"
			+ "join Account a on r.idAccount=a.id"
			+ "where r.idProduct=?";
	
	//Filter Star Reviewb 
	public static final String Supplier_FilterReview = "select a.name as nameCus, r.review,r.createDate"
			+ "from Review r"
			+ "join Account a on r.idAccount=a.id"
			+ "where r.idProduct=? and r.review=?";
	
	
	//quan li doanh thu ...
	
	public static final String Supplier_Revenue_Month = "select SUM(totalS) as totalS from Invoice i join InvoiceSupplier ins\r\n"
			+ "on i.id = ins.idInvoice\r\n"
			+ "where MONTH(i.createDate) = ?\r\n"
			+ "and YEAR(i.createDate) = 2023";
	public static final String Supplier_Revenue_Day = "select SUM(totalS) as totalS from Invoice i join InvoiceSupplier ins\r\n"
			+ "on i.id = ins.idInvoice\r\n"
			+ "where DAY(i.createDate) = ?\r\n"
			+ "and MONTH(i.createDate) = ?\r\n"
			+ "and YEAR(i.createDate) = 2023";
	
	
	
	
	
	
	
	
	
}
