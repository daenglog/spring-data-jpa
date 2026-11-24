package com.study.data_jpa.repository;

import com.study.data_jpa.entity.Member;
import com.study.data_jpa.entity.Team;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.domain.Specification;

public class MemberSpec {

    public static Specification<Member> teamName(final String teamName) {
        return (Specification<Member>) (root, query, builder) -> {

            if (teamName.isEmpty())
                return null;

            Join<Member, Team> t = root.join("team", JoinType.INNER);
            return builder.equal(t.get("name"), teamName);
        };
    }

    public static Specification<Member> username(final String username) {
        return (Specification<Member>) (root, query, builder) -> {
            return builder.equal(root.get("username"), username);
        };
    }
}
