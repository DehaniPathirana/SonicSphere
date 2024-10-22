package lk.sonicSphere.api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FileUpload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String fileUrl;
    private String fileType;
    private LocalDateTime uploadedAt;
}
