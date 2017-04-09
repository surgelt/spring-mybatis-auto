package com.learn.spring.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.learn.spring.mybatis.dao.LectureMapper;
import com.learn.spring.mybatis.dao.RoleMapper;
import com.learn.spring.mybatis.dao.StudentHealthMaleMapper;
import com.learn.spring.mybatis.dao.StudentLectureMapper;
import com.learn.spring.mybatis.dao.StudentMapper;
import com.learn.spring.mybatis.dao.StudentSelfcardMapper;
import com.learn.spring.mybatis.model.Lecture;
import com.learn.spring.mybatis.model.Role;
import com.learn.spring.mybatis.model.Student;
import com.learn.spring.mybatis.model.StudentHealthMale;
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
	@Autowired
	private StudentHealthMaleMapper studentHealthMaleMapper;

	//@Test
	public void contextLoads() {
		Role r = new Role();
//		r.setId(1);
		r.setNote("note tome");
		r.setRoleName("liutao");
		roleMapper.insert(r);
		System.out.println("==="+r.getRoleName());
		
	}
	@Test
	public void insertStCard(){
		StudentSelfcard sc = new StudentSelfcard();
		sc.setStudentId(1);
		sc.setNative("xinzhou");
		studentSelfcardMapper.insert(sc);
	}
	@Test
	public void insertSt(){
		Student s = new Student();
		s.setCnname("cname");
//		s.setId(1);
		s.setNote("note");
		s.setSex("1");
		studentMapper.insert(s);
	}
	
	@Test
	public void insertLecture(){
		Lecture l = new Lecture();
		l.setLectureName("数学");
		l.setNote("shuxue");
		lectureMapper.insert(l);
		
		Lecture l2 = new Lecture();
		l2.setLectureName("英语");
		l2.setNote("英语");
		lectureMapper.insert(l2);
	}
	
	@Test
	public void insertStLecture(){
		StudentLecture sl = new StudentLecture();
		sl.setGrade("99");
		sl.setLectureId(2);
		sl.setStudentId(1);
		studentLectureMapper.insert(sl);
		
		StudentLecture sl2 = new StudentLecture();
		sl2.setGrade("89");
		sl2.setLectureId(1);
		sl2.setStudentId(1);
		studentLectureMapper.insert(sl2);
		
	}
	
	
	@Test
	public void insertHealth(){
		StudentHealthMale studentHealthMale = new StudentHealthMale();
		studentHealthMale.setHeart("henhao");
		studentHealthMale.setStudentId(1);
		
		StudentHealthMale studentHealthMale2 = new StudentHealthMale();
		studentHealthMale2.setHeart("henhao2");
		studentHealthMale2.setStudentId(1);
		
		studentHealthMaleMapper.insert(studentHealthMale);
		studentHealthMaleMapper.insert(studentHealthMale2);
	}
	
	@Test
	public void testStudent(){
		
		Student ss = studentMapper.selectByPrimaryKey(1);
		
		System.out.println(ss);
//		com.learn.spring.mybatis.dao.StudentSelfcardMapper.selectByStudentId();
	}


}
