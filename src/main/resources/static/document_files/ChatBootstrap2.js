

javascript:(
	function add() {
		checkBot=document.getElementById('chatbot-btn');
		if (checkBot) {
			console.log('button already exists');
		} else {				
			var br = document.createElement("br");
			document.getElementById('footbrand').appendChild(br);
			var element = document.createElement("input");
			element.setAttribute("id", "chatbot-btn");
			element.setAttribute("type", "button");
			element.setAttribute("value", "Chat now (beta)");
			element.setAttribute("name", "button3");
			element.setAttribute("style", "padding: 0; border: none; font: inherit; color: inherit; background-color: transparent; cursor: pointer;");
			document.getElementById('footbrand').appendChild(element);
			var element2 = document.createElement("div");
			element2.setAttribute("id", "root");	
			var parentDiv = document.getElementById('banner').parentNode;
			var sp2 = document.getElementById('banner');
			parentDiv.insertBefore(element2,sp2);
			
			var fileref2=document.createElement("link");
			fileref2.setAttribute("rel", "stylesheet");
			fileref2.setAttribute("type", "text/css");
			fileref2.setAttribute("href", "https://grantsgovchatwidget.s3.amazonaws.com/bundle.css");
			document.getElementsByTagName('head')[0].appendChild(fileref2);
			
			var fileref=document.createElement('script');
			fileref.setAttribute("type","text/javascript");
			fileref.setAttribute("src", "https://grantsgovchatwidget.s3.amazonaws.com/bundle.js");
			document.getElementsByTagName('body')[0].appendChild(fileref);
		}   
	}
	)();