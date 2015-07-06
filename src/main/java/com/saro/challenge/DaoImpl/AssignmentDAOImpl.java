package com.saro.challenge.DaoImpl;

/**
 * Created by sbalakrishnan on 7/6/15.
 */
import com.saro.challenge.dao.AssignmentDAO;
import com.saro.challenge.model.Assignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by sbalakrishnan on 7/5/15.
 */
@Component
public class AssignmentDAOImpl implements AssignmentDAO{

    protected Logger logger = LoggerFactory.getLogger(getClass().getName());
    @Autowired
    AssignmentDAO assignmentDao;

    @Autowired
    Assignment assignment;

    public List<Assignment> selectAllAssignment(){
        logger.info("Call made to list all the names in the drop down to select from");
        List<Assignment> listAll = assignmentDao.selectAllAssignment();
        return listAll;

    }

    public Assignment selectAssignmentById(int assigneeId) {
        logger.info("Call made to list an assignment for the assigneeId" + assigneeId );
        return assignmentDao.selectAssignmentById(assigneeId);
    }


}
