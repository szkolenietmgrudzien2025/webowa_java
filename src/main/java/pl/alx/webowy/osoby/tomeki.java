package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/tomeki")
public class tomeki {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Tomeki</title>
		</head>
		<body>
		<p>Jestem <strong>Tomeki</stong></p>
		</body>
		</html>
		""";
	}
}
