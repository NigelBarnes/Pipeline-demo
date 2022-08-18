package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet{
	//Will catch the exception that could be thrown here in TOMCAT, will be handled there. Will throw a 5xx status code.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String URI = request.getRequestURI();
		System.out.println(URI);
		
		PrintWriter print = response.getWriter();
		print.print("<h1>Hello from your doGet method!</h1>");
		
		response.setStatus(218);
		response.setHeader("content-type", "text/html");
	}
	
	

}
