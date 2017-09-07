import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;

	public StudentGroup(int length) {

	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		Student[] student = new Student[index];
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[index]);
		}
		return student;

	}

	@Override
	public void setStudent(Student student, int index) {

	}

	@Override
	public void addFirst(Student student) {

	}

	@Override
	public void addLast(Student student) {
		Student[] student1 = new Student[students.length + 1];
		for (int i = 0; i < students.length; i ++) {
			student1[i] = students[i];
		}
		student1[student1.length-1] = student;
		this.students = student1;
	}

	@Override
	public void remove(int index) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		index = 0;
		Student[] student1 = new Student[index];
		int buf = index;
		for (int i = 0, j = 0; j < buf; i++, j++) {
			if (students[j].getFullName().equalsIgnoreCase(n)) {
				i--;
				index--;
				continue;
			}
			student1[i] = students[j];
		}
		students = student1;
	}

	@Override
	public void remove(Student student) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int index = 0;
		Student[] student1 = new Student[index];
		int buf = index;
		for (int i = 0, j = 0; j < buf; i++, j++) {
			if (students[j].getFullName().equalsIgnoreCase(n)) {
				i--;
				index--;
				continue;
			}
			student1[i] = students[j];
		}
		students = student1;
	}

	@Override
	public void removeFromIndex(int index) {

	}

	@Override
	public void removeFromElement(Student student) {

	}

	@Override
	public void removeToIndex(int index) {

	}

	@Override
	public void removeToElement(Student student) {

	}

	@Override
	public void bubbleSort() {
		for (int i = students.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				int s = Integer.parseInt(students[j].getFullName());
				int s1 = Integer.parseInt(students[j + 1].getFullName());
				if (s > s1) {
					Student x = students[j];
					students[j] = students[j + 1];
					students[j + 1] = x;
				}
			}
			System.out.println(students[i].getFullName());
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {
		index = 0;
		if (index < students.length) {
			students[index] = student;
		} else {
			int oldindex = students.length;
			Student[] newStudent = new Student[oldindex + 10];
			for (int i = 0; i < students.length; i++) {
				newStudent[i] = students[i];
			}
			newStudent[index] = student;
			students = newStudent;
			index++;
		}
	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {

	}
}