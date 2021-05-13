package pl.edu.uj.demo

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "USERS")
class User {

    @get:Id
    @get:NotBlank
    @Column
    var username: String? = ""

    @get:NotBlank
    @Column
    var password: String? = ""
}
