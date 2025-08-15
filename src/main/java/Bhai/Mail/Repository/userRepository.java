package Bhai.Mail.Repository;
import Bhai.Mail.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Long> {
}
