package com.saro.challenge.dao;

/**
 * Created by sbalakrishnan on 7/6/15.
 */
import java.util.List;
import com.saro.challenge.model.Assignment;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface AssignmentDAO {


    @Results({
            @Result(property = "assigneeId", column = "assignee_id"),
            @Result(property = "assigneeName", column = "assignee_name"),
            @Result(property = "assignmentName", column = "assignment_name"),
            @Result(property = "creationDate", column = "creation_date"),
            @Result(property = "dueDate", column = "due_date")
    })

    @Select("select * from assignment")
    List<Assignment> selectAllAssignment();

    @Results({
            @Result(property = "assigneeId", column = "assignee_id"),
            @Result(property = "assigneeName", column = "assignee_name"),
            @Result(property = "assignmentName", column = "assignment_name"),
            @Result(property = "creationDate", column = "creation_date"),
            @Result(property = "dueDate", column = "due_date")
    })
    @Select("select * from assignment where assignee_id = #{assigneeId}")
    Assignment selectAssignmentById(int assigneeId);



}
