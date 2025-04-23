package Solve.lecture.ch12.sec03.exam05;

import lombok.Getter;

import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class Member {
    private String id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}