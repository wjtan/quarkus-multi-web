package sg.wjtan.mod2;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

@ApplicationScoped
@RouteBase(path = "mod2", produces = MediaType.TEXT_HTML) 
public class IndexPage {
	@GET
    @Route(path = "", methods = HttpMethod.GET)
    void index(RoutingContext rc) {
		rc.response().end("hello");
    }
}
