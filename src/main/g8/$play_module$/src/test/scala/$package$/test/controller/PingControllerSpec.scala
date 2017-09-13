package $package$.controller.test

import $package$.controller.PingController
import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import $package$.controller._

class PingControllerSpec extends PlaySpec with GuiceOneAppPerTest {

  "PingController GET" should {

    "return pong string" in {
      val request = FakeRequest(GET, routes.PingController.ping().url)
      val ping    = route(app, request).get

      status(ping) mustBe OK
      contentType(ping) mustBe Some("text/plain")
      contentAsString(ping) must include("pong")
    }
  }
}
