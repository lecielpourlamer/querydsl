package study.querydsl.dto;

import lombok.Data;

/**
 * @Description:
 * @author: shlim
 * @since: 2023-11-01
 * <p>
 * << 개정 이력(Modification Information) >>
 * <p>
 * 수정일          수정자         수정 내용
 * -----------    ----------    -------------
 * 2023-11-01        shlim       최초 생성
 */

@Data
public class MemberDto {

    private String username;

    private int age;

    public MemberDto() {

    }

    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
