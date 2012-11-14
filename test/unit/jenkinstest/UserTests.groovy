package jenkinstest



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {
    @Test
    void samplTestOne() {
       assert 1 == 1
    }

   @Test
   void sampleTestTwo(){
	assert 2==2
    }
}
