package controllers

import javax.inject.Inject

import play.api.i18n.MessagesApi
import play.api.mvc._
import session.Context

import scala.concurrent.Future

class Application @Inject() (messagesApi: MessagesApi) extends Controller {

  def index = ContextAction { implicit ctx =>
    // Uses messages without having to declare an implicit m:Messages in the template:
    Ok(views.html.index())
  }

  object ContextAction extends ActionBuilder[Context] {
    override def invokeBlock[A](request: Request[A], block: (Context[A]) => Future[Result]): Future[Result] = {
      val messages = messagesApi.preferred(request)
      val ctx = Context(messages, request)
      block(ctx)
    }
  }

}
