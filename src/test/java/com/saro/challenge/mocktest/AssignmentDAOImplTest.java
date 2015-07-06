package com.saro.challenge.mocktest;

/**
 * Created by sbalakrishnan on 7/6/15.
 */
import com.saro.challenge.DaoImpl.AssignmentDAOImpl;
import com.saro.challenge.model.Assignment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.Collection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:resources/spring-servlet.xml")
public class AssignmentDAOImplTest {
    @Autowired
    private AssignmentDAOImpl assignmentDAO;


    @Test
    public void testFindById() {
        Assignment assignment = assignmentDAO.selectAssignmentById(1);

        Assert.assertEquals("Jim", assignment.getAssigneeName());
        Assert.assertEquals("Java application", assignment.getAssignmentName());

    }

    @Test
    public void testFindAll() {
        Collection collection = new ArrayList();
        collection = assignmentDAO.selectAllAssignment();
        assertNotNull(collection);

    }
}