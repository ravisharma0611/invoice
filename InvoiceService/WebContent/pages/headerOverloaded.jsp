<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

<head>


</head>

<body id="page-top" class="index">
<form id="dashBoardId">
    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <%-- <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button> --%>
                <a class="navbar-brand" href="javascript:void(0)" onclick="loadDashBoard()">Invoice Service</a>
                
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <!-- <li class="hidden">
                        <a href="#page-top"></a>
                    </li> -->
                    <li class="page-scroll">
                        <a href="javascript:void(0)" onclick="moveToNextAction('create')">Create</a>
                    </li>
                    <li class="page-scroll">
                        <a href="javascript:void(0)" onclick="moveToNextAction('search')">Search</a>
                    </li>
                    <li class="page-scroll">
                        <a href="javascript:void(0)" onclick="moveToNextAction('logOff')">Log Off</a>
                    </li>
					<li class="page-scroll">
                        <a href="javascript:void(0)">Signed In as: <s:property value="%{#session.SESSION_DATA.firstName}"/></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

   
</form>

</body>

</html>
