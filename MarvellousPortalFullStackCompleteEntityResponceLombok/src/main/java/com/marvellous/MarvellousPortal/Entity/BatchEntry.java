package com.marvellous.MarvellousPortal.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "BatchDetails")
@Data  // gives all
/*@Getter
@Setter
@NoArgsConstructor //not required here (default cons)
@AllArgsConstructor // (parametrised)*/
public class BatchEntry
{
    private ObjectId id;
    private String name;
    private int fees;

}
