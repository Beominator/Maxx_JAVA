
package com.members.Repository;

import com.members.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    void findByUserIdAndPassword(String userId, String password);



    com.members.entity.Member findByUserId(String userId);
}
