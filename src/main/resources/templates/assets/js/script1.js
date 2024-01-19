const checkItem = () => {
  let searchValue = document.getElementById("trackerInput").value;
 	location.href = "/search/" + searchValue;
   displayLocation();
};

const displayLocation = () => {
  document.getElementById("trackerForm").style.display = " none";
  document.getElementById("trackerInfoMain").style.display = " block";
  
  /*let text = "Your Item is currently in " + items[trackingId.indexOf(id)];
  document.getElementById("trackerInfo").innerHTML = text;*/
};

const closeLocation = () => {
  document.getElementById("trackerForm").style.display = " block";
  document.getElementById("trackerInfoMain").style.display = " none";
  document.getElementById("trackerInfo").innerHTML = "";
};

closeLocation();
