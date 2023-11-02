package study.querydsl.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import javax.persistence.EntityManager;
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

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    List<Member> findByUsername(String username);

















}
