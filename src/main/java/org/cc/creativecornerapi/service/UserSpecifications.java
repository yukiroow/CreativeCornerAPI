package org.cc.creativecornerapi.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Expression;
import org.cc.creativecornerapi.entity.User;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecifications {
    public static Specification<User> maxId() {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(
                root.get("userId"),
                criteriaBuilder.max(root.<Integer>get("userId")));
    }
}
