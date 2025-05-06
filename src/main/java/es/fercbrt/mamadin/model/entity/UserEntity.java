package es.fercbrt.mamadin.model.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO: Return a basic granted authority as a normal user
        return null;
    }

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(
                name = "user_id", referencedColumnName = "id"
                ),
            inverseJoinColumns = @JoinColumn(
                name = "role_id", referencedColumnName = "id"
                )
            )
    private Collection<RoleEntity> roles;

    @Override
    public String getUsername() {
        return username;
    }
}
