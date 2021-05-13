
package pl.edu.uj.demo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.lang.Nullable
import org.springframework.stereotype.Repository
import pl.edu.uj.demo.User

@Repository
interface AuthRepository : CrudRepository<User, String> {
    @Nullable
    fun findByUsernameAndPassword(username: String, password: String): User

    @Nullable
    fun findByUsername(username: String): User
}
