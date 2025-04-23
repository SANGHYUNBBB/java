//package basic0423.lecture.dto;
//// Data Transfer Object;
//// DTO 는 데이터 전달용 오브젝트구나!
////@Data
////@Getter
//// Data Transfer Object
//// -> 데이터 전달용 객체
//import lombok.*;
//
//@NoArgsConstructor // 매개변수 없는 생성자
//@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자
//@RequiredArgsConstructor // final 키워드 붙어있는, 필수적으로
//@ToString //
//@Getter//
//@Setter//
//// @Data -> RequiredArgsConstructor, getter, setter 다 들어있는 것. 권장되지는 않음.
//// 필요없는데도 다 써버리면 동작이 의도하지 않았는데 하게 될 수 있음.;
//public class StudentDTO {
//    private String name;
//    private int age;
//    private String email;
//}