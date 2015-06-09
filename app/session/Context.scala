package session

import play.api.i18n.Messages
import play.api.mvc.{Request, WrappedRequest}

case class Context[A](messages: Messages, request: Request[A]) extends WrappedRequest(request)

