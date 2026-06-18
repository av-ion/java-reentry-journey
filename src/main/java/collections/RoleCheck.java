package collections;

import java.util.Set;

public class RoleCheck {
    public static void main(String[] args) {
       Set<String> allowedRoles = Set.of();

        System.out.println(isAllowedRole(allowedRoles, null));
    }

    public static boolean isAllowedRole(Set<String> allowedRoles, String role) {
        if (allowedRoles == null) throw new IllegalArgumentException("allowed roles can't be null");

        if (role == null) throw new IllegalArgumentException("role can't be null");


        return allowedRoles.contains(role);

    }
}
