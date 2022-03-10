package com.codegym.controller;

import com.codegym.dao.part.IPartDAO;
import com.codegym.dao.partImage.IPartImageDAO;
import com.codegym.dao.partImage.PartImageDAO;

import com.codegym.dao.story.IStoryDAO;
import com.codegym.dao.part.PartDAO;
import com.codegym.dao.story.StoryDAO;
import com.codegym.model.Part;
import com.codegym.model.PartImage;
import com.codegym.model.Story;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StoryServlet", value = "/StoryServlet")
public class StoryServlet extends HttpServlet {
    private IStoryDAO storyDAO = new StoryDAO();
    private IPartDAO partDAO = new PartDAO();
    private IPartImageDAO partImageDAO = new PartImageDAO();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view1" : {
                int id = Integer.parseInt(request.getParameter("storyId"));
                List<Part> parts = this.partDAO.seleceAllPartOfStory(id);
                request.setAttribute("parts", parts);
                RequestDispatcher dispatcher = request.getRequestDispatcher("story/viewContent1.jsp");

                dispatcher.forward(request, response);
            }
            case "view": {
                int id = Integer.parseInt(request.getParameter("id"));
                List<Part> parts = this.partDAO.seleceAllPartOfStory(id);
                request.setAttribute("parts", parts);
                RequestDispatcher dispatcher = request.getRequestDispatcher("story/viewPart.jsp");

                dispatcher.forward(request, response);


                break;
            }
            case "viewByCategory": {
                int id = Integer.parseInt(request.getParameter("id"));
                if (id == 1) {
                    List<Story> storyList = this.storyDAO.selectByCategoryId(id);
                    request.setAttribute("storyList", storyList);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("story/list1.jsp");
                    dispatcher.forward(request,response);
                } else if (id == 2) {
                    List<Story> storyList = this.storyDAO.selectByCategoryId(id);
                    request.setAttribute("storyList", storyList);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("story/list2.jsp");
                    dispatcher.forward(request,response);
                }

                break;
            }
            case "read" : {
                int storyId = Integer.parseInt(request.getParameter("storyId"));
                int partId = Integer.parseInt(request.getParameter("id"));
                int categoryId = Integer.parseInt(request.getParameter("categoryId"));
                if (categoryId == 1){
                    List<PartImage> images = this.partImageDAO.selectAllImg(storyId,partId);
                    Part part = this.partDAO.selectById(partId);
                    request.setAttribute("part",part);
                    request.setAttribute("images",images);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("story/viewContent.jsp");
                    dispatcher.forward(request,response);

                }
                if (categoryId == 2){
                    Part part = this.partDAO.selectById(partId);
                    List<Part> parts = this.partDAO.seleceAllPartOfStory(storyId);
                    request.setAttribute("part",part);
                    request.setAttribute("parts",parts);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("story/viewContent1.jsp");
                    dispatcher.forward(request,response);
                }


            }
            default: {
                List<Story> storyList = this.storyDAO.selectAllStory();
                request.setAttribute("storyList", storyList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("story/list.jsp");
                dispatcher.forward(request, response);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "find": {
                String name = request.getParameter("name");
               String name1 = "%" + name + "%";
                List<Story> storyList = this.storyDAO.selectByName(name1);
                request.setAttribute("storyList", storyList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("story/list3.jsp");
                dispatcher.forward(request, response);
                break;
            }
        }
    }
}
