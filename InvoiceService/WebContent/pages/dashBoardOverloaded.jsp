<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

<head>


    <title>Invoice- Dashboard</title>



</head>

<body id="page-top" class="index">
<s:hidden name="%{#session.Session_Data.firstName}" value="%{#session.SESSION_DATA.firstName}"></s:hidden>
<form id="dashBoardId">
	<br>
	<div class="row">
				<div class="col-lg-12 ">
					<div class="alert alert-info">
						Welcome&nbsp; <b><s:property value='%{#session.SESSION_DATA.firstName}'/></b>
					</div>

				</div>
	</div>
	
    <section id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Dashboard</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4 portfolio-item">
                    <a href="javascript:void(0)" onclick="moveToNextAction('create')">
                       <img src="image/portfolio/cabin.png" class="img-responsive" alt="New Invoice">
                    </a>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="javascript:void(0)" onclick="moveToNextAction('search')">
                        <img src="image/portfolio/cake.png" class="img-responsive" alt="Search Invoice">
                    </a>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="javascript:void(0)" onclick="moveToNextAction('mail')">
                        <img src="image/portfolio/circus.png" class="img-responsive" alt="Mail Box">
                    </a>
                </div>
            </div>
        </div>
    </section>
</form>
</body>

</html>
