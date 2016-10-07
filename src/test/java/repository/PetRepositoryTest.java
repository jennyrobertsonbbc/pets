package repository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.Statement;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


import static junit.framework.TestCase.assertEquals;

/**
 * Created by roberj78 on 07/10/2016.
 */
public class PetRepositoryTest {
    @Mock
    Statement statement;
    @Mock
    Connection connection;
    @Mock
    DBConnection dbConnection;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        given(dbConnection.connect()).willReturn(connection);
        given(connection.createStatement()).willReturn(statement);



    }

    @Test
    public void testSave() throws Exception{



        String expectedQuerySent = "blah";
        String actualQuerySent = "blah";


        //test if the same
        assertEquals(expectedQuerySent,actualQuerySent);

        verify(statement).executeQuery(expectedQuerySent);


    }
}
