package xin.keepmoving.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: wxfw
 * <p>@since: v1.1
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity(name = "sys_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime createdDate;

    @Column
    private Long createdUserId;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private Long updatedUserId;


    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String salt;

    @Column
    private boolean adminFlag;
}
