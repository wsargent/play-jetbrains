= Play Jetbrains Project

Project written to show discussed issues:

* If <i>TwirlKeys.templateImports</i> is defined in build.sbt, a type imported there it should not appear in red in Intellij IDEA.
* Scala classes created under the views package should contain "html" package so that they match up with the generated Scala files.
* Link to Nightly build on the Jetbrains Scala blog is broken.
* Using the @ symbol should bring up Scala language and live templates (currently requires @ { } syntax)
* Say in documentation / IDE that the Javascript plugin must be enabled for Scala to work.
* Using @ with braces uses Scala formatting, causing braces to be on multiple lines -- better to have Twirl defaults distinct.
* Generalize Twirl templates so that view.scala.js and view.scala.xml are supported
* messages file should not rely on "playframework" plugin