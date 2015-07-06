package com.saro.challenge.rest;

/**
 * Created by sbalakrishnan on 7/6/15.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.saro.challenge.DaoImpl.AssignmentDAOImpl;
import com.saro.challenge.model.Assignment;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/filterby")
public class AssignmentService {

    protected Logger logger = LoggerFactory.getLogger(getClass().getName());
    @Autowired
    AssignmentDAOImpl assignmentDAOImpl;

    @Autowired
    Assignment assignment;

    Gson gson = new Gson();

    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAssignmentById(@PathParam("id") String id) {
        logger.info(" Service calling to retrive assignment object for an assignee id " + id );
        assignment =  assignmentDAOImpl.selectAssignmentById(Integer.parseInt(id));
        String retValue = gson.toJson(assignment);
        if(assignment == null) {
            logger.info(" Sorry no object found for an assigne id  " + id );
            return Response.noContent().build();
        }else {
            return Response.ok(assignment).build();
        }
    }

}