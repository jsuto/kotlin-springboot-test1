package com.mycorp.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HealthzController {

  @GetMapping("/healthz")
  fun healthz(): String {
    return "ok.txt"
  }

}
