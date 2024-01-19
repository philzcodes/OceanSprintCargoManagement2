/*******************************************************/
/**************** DepartmentOfHealth&HumanServices JAVASCRIPT ****************/
/****************  Created 01/24/2013 ******************/
/*******************************************************/

/**************** Global Search Widget ****************/
/* Script to Redirect Page and Pass Keywords to Search Pages */
function search() {
  var keywords = document.getElementById("keywords").value;
  var searchType = document.getElementById("jumpMenu").value;
  var url = window.location.protocol + "//" + window.location.host;
  var DEFAULT_MSG = "Enter Keyword...";

  if (searchType == "search-site") {
    if (keywords != DEFAULT_MSG) {
      url =
        url +
        "/web/grants/search-site.html#keywords=" +
        encodeURIComponent(keywords);
    } else {
      url = url + "/web/grants/search-site.html";
    } //if
  } else if (searchType == "search-grants") {
    if (keywords != DEFAULT_MSG) {
      url =
        url +
        "/web/grants/user/dashboard?keywords=" +
        encodeURIComponent(keywords);
    } else {
      url = url + "/web/grants/user/dashboard";
    } //if
  }

  window.location.href = url;
}

/* Script to Clear Search Box Default Text */
function clickclear(thisfield, defaulttext) {
  if (thisfield.value == defaulttext) {
    thisfield.value = "";
  }
}
function clickrecall(thisfield, defaulttext) {
  if (thisfield.value == "") {
    thisfield.value = defaulttext;
  }
}

/**************** LIFERAY JAVASCRIPT ****************/
AUI().ready(
  /*
	This function gets loaded when all the HTML, not including the portlets, is
	loaded.
	*/

  function () {}
);

Liferay.Portlet.ready(
  /*
	This function gets loaded after each and every portlet on the page.

	portletId: the current portlet's id
	node: the Alloy Node object of the current portlet
	*/

  function (portletId, node) {}
);

Liferay.on(
  "allPortletsReady",

  /*
	This function gets loaded when everything, including the portlets, is on
	the page.
	*/

  function () {}
);
