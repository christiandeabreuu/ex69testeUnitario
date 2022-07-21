package br.com.zup.movieflix.register.repositorio

import br.com.zup.movieflix.register.model.RegisterModel
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class RegisterRepositoryTest {

    @Test
    fun registerUser() {

        val user = RegisterModel(
            "Felipe",
            "felipe.dearaujo@zup.com.br",
            "melhorProfessorDoMundo"
        )

        val result = RegisterRepository().registerUser(user)

        Assert.assertEquals(result.email, "felipe.dearaujo@zup.com.br")
        Assert.assertEquals(result.password, "melhorProfessorDoMundo")
        Assert.assertEquals(result.userName, "Felipe")
    }
}

//internal class RegisterRepositoryTestKate {
//    private lateinit var registerModel: RegisterModel
//    val userName = "Felipe"
//    val email = "felipe.dearaujo@zup.com.br"
//    val password = "melhorProfessorDoMundo"
//
//    @Before
//    fun beforeView() {
//        registerModel = RegisterModel(userName = userName, email = email, password = password)
//    }
//
//    @Test
//    fun `check validation of RegisterModel object`() {
//        assertEquals(userName, registerModel.userName)
//        assertEquals(email, registerModel.email)
//        assertEquals(password, registerModel.password)
//    }
//}
