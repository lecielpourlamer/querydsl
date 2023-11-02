package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

/**
 * @Description:
 * @author: shlim
 * @since: 2023-11-02
 * <p>
 * << 개정 이력(Modification Information) >>
 * <p>
 * 수정일          수정자         수정 내용
 * -----------    ----------    -------------
 * 2023-11-02        shlim       최초 생성
 */

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);

    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
