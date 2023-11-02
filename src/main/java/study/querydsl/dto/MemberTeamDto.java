package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
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
public class MemberTeamDto {

    private Long memberId;
    private String username;
    private int age;
    private Long teamId;
    private String teamName;

    @QueryProjection
    public MemberTeamDto(Long memberId, String username, int age, Long teamId, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
