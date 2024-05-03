package com.mycorp.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import mu.KotlinLogging

@Controller
class HelloController {

  private val logger = KotlinLogging.logger {}

  @GetMapping("/")
  fun blog(model: Model): String {
    model["title"] = "Blog"

    logger.info {"An INFO Message" }

    return "blog"
  }

}
