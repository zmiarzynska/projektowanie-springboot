package pl.edu.uj.demo.service

import pl.edu.uj.demo.User
import pl.edu.uj.demo.repository.AuthRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired


@Service
@Transactional
class AuthService @Autowired constructor(
        private val authenticationRepository: AuthRepository,
){

        fun createUser(user: User) : User{

          return authenticationRepository.save(user)          
        }

        fun loginUser(user: User) : User{

          return authenticationRepository.findByUsernameAndPassword(user.username.toString(),user.password.toString())        
        }

        fun logoutUser(user: User) : User{

          return authenticationRepository.findByUsername(user.username.toString())        
        }

}