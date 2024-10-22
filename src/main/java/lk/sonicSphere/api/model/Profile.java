package lk.sonicSphere.api.model;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String bio;
    private String editableAnswers;
    private String creatorLink;
    private Integer dashboardViewCount;
}
