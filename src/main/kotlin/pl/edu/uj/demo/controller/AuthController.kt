package pl.edu.uj.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.edu.uj.demo.service.AuthService

@RestController
@RequestMapping("/authorization")
class AuthController(
    private val authService: AuthService,
) {

    @PostMapping("/register")
    fun register(@RequestBody user: User): User {
        return authService.createUser(user)
    }

    @GetMapping("/login")
    fun login(@RequestBody user: User): User {
        return authService.loginUser(user)
    }

    @GetMapping("/logout")
    fun logout(@RequestBody user: User): User {
        return authService.logoutUser(user)
    }
}
