package com.learn.spring.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.learn.spring.mybatis.dao.LectureMapper;
import com.learn.spring.mybatis.dao.RoleMapper;
import com.learn.spring.mybatis.dao.StudentLectureMapper;
import com.learn.spring.mybatis.dao.StudentMapper;
import com.learn.spring.mybatis.dao.StudentSelfcardMapper;
import com.learn.spring.mybatis.model.Lecture;
import com.learn.spring.mybatis.model.Role;
import com.learn.spring.mybatis.model.Student;
import com.learn.spring.mybatis.model.StudentLecture;
import com.learn.spring.mybatis.model.StudentSelfcard;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class SpringMybatisAutoApplicationTests {
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private StudentSelfcardMapper studentSelfcardMapper;
	@Autowired
	private LectureMapper lectureMapper;
	@Autowired
	private StudentLectureMapper studentLectureMapper;

	//@Test
	public void contextLoads() {
		Role r = new Role();
//		r.setId(1);
		r.setNote("note tome");
		r.setRoleName("liutao");
		roleMapper.insert(r);
		System.out.println("==="+r.getRoleName());
		
	}
	//@Test
	public void insertStCard(){
		StudentSelfcard sc = new StudentSelfcard();
		sc.setStudentId(1);
		sc.setNative("xinzhou");
		studentSelfcardMapper.insert(sc);
	}
	
	public void insertSt(){
		Student s = new Student();
		s.setCnname("cname");
//		s.setId(1);
		s.setNote("note");
		s.setSex("nan");
		studentMapper.insert(s);
	}
	
	//@Test
	public void insertLecture(){
		Lecture l = new Lecture();
		l.setLectureName("数学");
		l.setNote("shuxue");
		lectureMapper.insert(l);
	}
	
	@Test
	public void insertStLecture(){
		StudentLecture sl = new StudentLecture();
		sl.setGrade("99");
		sl.setLectureId(2);
		sl.setStudentId(1);
		studentLectureMapper.insert(sl);
		
	}
	
	@Test
	public void testStudent(){
		
		Student ss = studentMapper.selectByPrimaryKey(1);
		
		System.out.println(ss);
//		com.learn.spring.mybatis.dao.StudentSelfcardMapper.selectByStudentId();
	}

}
