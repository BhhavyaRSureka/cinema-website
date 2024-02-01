// ********RoostGPT********
/*
Test generated by RoostGPT for test JavaTesting using AI Type Open Source AI and AI Model deepseek-6.7B

Sure, here are some test scenarios you can use to validate the `isCredentialsNonExpired()` method:

1. **Test with a User with Expired Credentials**

   Create a User with an expired credential. Then call `isCredentialsNonExpired()` on this User. The method should return `false`.

2. **Test with a User with Non-Expired Credentials**

   Create a User with a non-expired credential. Then call `isCredentialsNonExpired()` on this User. The method should return `true`.

3. **Test with a User with No Credentials**

   Create a User with no credential. Then call `isCredentialsNonExpired()` on this User. The method should return `true`, as no credential means no expiration.

4. **Test with a Null User**

   Call `isCredentialsNonExpired()` on a null User. The method should throw a NullPointerException.

5. **Test with a User with Expired Role**

   Create a User with a Role that is expired. Then call `isCredentialsNonExpired()` on this User. The method should return `false`.

6. **Test with a User with Non-Expired Role**

   Create a User with a Role that is not expired. Then call `isCredentialsNonExpired()` on this User. The method should return `true`.

7. **Test with a User with No Role**

   Create a User with no Role. Then call `isCredentialsNonExpired()` on this User. The method should return `true`, as no Role means no expiration.

8. **Test with a Null Role**

   Create a User with a Role that is null. Then call `isCredentialsNonExpired()` on this User. The method should return `true`, as null Role means no expiration.

Remember, the `isCredentialsNonExpired()` method should only consider the credential expiration of the User, not the Role.

*/

// ********RoostGPT********
```java
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.core.userdetails.UserDetails;
import com.qa.QACinema.Entities.User;
import com.qa.QACinema.Entities.Role;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomUserDetails_isCredentialsNonExpired_8b4fc66884_Test {

    @InjectMocks
    private CustomUserDetails userDetails;

    @Mock
    private User user;

    @Mock
    private Role role;

    @Test
    public void testIsCredentialsNonExpired_withExpiredCredentials() {
        Mockito.when(user.getRoles()).thenReturn(null);
        Assert.assertFalse(userDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsNonExpired_withNonExpiredCredentials() {
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        Mockito.when(user.getRoles()).thenReturn(roles);
        Assert.assertTrue(userDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsNonExpired_withNoCredentials() {
        Mockito.when(user.getRoles()).thenReturn(new ArrayList<>());
        Assert.assertTrue(userDetails.isCredentialsNonExpired());
    }

    @Test(expected = NullPointerException.class)
    public void testIsCredentialsNonExpired_withNullUser() {
        userDetails.isCredentialsNonExpired();
    }

    @Test
    public void testIsCredentialsNonExpired_withExpiredRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        Mockito.when(user.getRoles()).thenReturn(roles);
        Mockito.when(role.isExpired()).thenReturn(true);
        Assert.assertFalse(userDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsNonExpired_withNonExpiredRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        Mockito.when(user.getRoles()).thenReturn(roles);
        Mockito.when(role.isExpired()).thenReturn(false);
        Assert.assertTrue(userDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsNonExpired_withNoRole() {
        Mockito.when(user.getRoles()).thenReturn(new ArrayList<>());
        Assert.assertTrue(userDetails.isCredentialsNonExpired());
    }

    @Test
    public void testIsCredentialsNonExpired_withNullRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(null);
        Mockito.when(user.getRoles()).thenReturn(roles);
        Assert.assertTrue(userDetails.isCredentialsNonExpired());
    }
}
```
