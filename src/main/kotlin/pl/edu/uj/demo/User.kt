package pl.edu.uj.demo


import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


@Entity
@Table(name="USERS")
class User {

        @get:Id
        @get:NotBlank
        @Column
        var username: String? = ""

        @get:NotBlank
        @Column
        var password: String? = ""


}