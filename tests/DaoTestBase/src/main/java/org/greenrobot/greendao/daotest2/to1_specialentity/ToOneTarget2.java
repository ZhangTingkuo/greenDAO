package org.greenrobot.greendao.daotest2.to1_specialentity;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "TO_ONE_TARGET2".
 */
@Entity
public class ToOneTarget2 {

    @Id
    private Long id;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public ToOneTarget2() {
    }

    @Generated
    public ToOneTarget2(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}