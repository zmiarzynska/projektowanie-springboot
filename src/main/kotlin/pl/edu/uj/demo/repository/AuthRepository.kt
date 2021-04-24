
package pl.edu.uj.demo.repository

import pl.edu.uj.demo.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.lang.Nullable

@Repository
interface AuthRepository: CrudRepository<User, String> {
	@Nullable 
	fun findByUsernameAndPassword(username: String, password: String): User
	
	@Nullable
	fun findByUsername(username: String): User
}