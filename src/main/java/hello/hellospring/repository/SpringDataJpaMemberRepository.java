package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Jparepository<엔티티, 식별자(id)의 자료형>, MemberRepository
// interface만 만들어 놓으면 spring에서 bean으로 인식해 injection이 가능하다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

        // select m from Member m from where m.name = ?
        @Override
        Optional<Member> findByName(String name);
}
