package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/patryk")
public class Patryk {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Patryk</title>
		</head>
		<body>
		<p>Jestem <strong>Patryk</stong></p>
		</body>
		</html>
		""";
	}
}
