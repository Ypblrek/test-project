//package com.tms.Controller;
//
//import com.tms.Domain.Role;
//import com.tms.Domain.UserInfo;
//import com.tms.service.UserService;
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static java.nio.file.Paths.get;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(UserController.class)
//public class UserControllerTest {
//
//    @MockBean
//    UserService userService;
//
//    static  UserInfo userInfo;
//    @BeforeAll
//    public static void beforeAll(){
//        userInfo = new UserInfo();
//        userInfo.setId(10);
//        userInfo.setFirstName("DIma");
//        userInfo.setLastName("Pozniak");
//        userInfo.setRole(Role.USER);
//
//    }
////    @BeforeEach
////
////    public void beforeEach(){
////        System.out.println("Before Each!!");
////    }
////    @AfterAll
////    public static void afterAll(){
////        System.out.println("afterAll all!!");
////
////    }
////    @AfterEach
////
////    public void afterEach() {
////        System.out.println("after Each!!");
////    }
//    @Test
////    @DisplayName("Наш метод")
////    @RepeatedTest(5)
////    @Tag("user")
//    public void getUserTest(){
//        int
//
//
//        Mockito.when(userService.getUser(10).thenReturn(userInfo);
//
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", Matchers.hasSize(1)))
//                .andExpect(jsonPath("$[0].firstName", Matchers.is("Dima")));
        //что на метод+путь будет отрабатывать нужный метод
        // статус код возврощается
        //сколько объектов должно возврощатся
        //

//    }
//    @Test
//    public void getUserSecondTest(){
//
//    }
//}
