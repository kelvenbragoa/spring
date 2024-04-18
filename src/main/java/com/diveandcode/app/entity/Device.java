package com.diveandcode.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String make;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String serial;
    @Column(nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn( // this will add a user_id column to the message table as a foreign key
            name = "type_device_id", // specifies the name of the foreign key column in the database
            referencedColumnName = "id" // primary key of the user who owns this MESSAGE
    )
    private TypeDevice typeDevice;

    @ManyToOne
    @JoinColumn( // this will add a user_id column to the message table as a foreign key
            name = "device_status_id", // specifies the name of the foreign key column in the database
            referencedColumnName = "id" // primary key of the user who owns this MESSAGE
    )
    private DeviceStatus devicestatusid;
    @ManyToOne
    @JoinColumn( // this will add a user_id column to the message table as a foreign key
            name = "device_availability_id", // specifies the name of the foreign key column in the database
            referencedColumnName = "id" // primary key of the user who owns this MESSAGE
    )
    private DeviceAvailability deviceavailability;

//    @Column(nullable = false)
//    private Integer type_device_id;
//    @Column(nullable = false)
//    private Integer device_status_id;
//    @Column(nullable = false)
//    private Integer device_availability_id;

}
