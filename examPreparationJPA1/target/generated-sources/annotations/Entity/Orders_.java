package Entity;

import Entity.OrderLine;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-25T13:03:11")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile CollectionAttribute<Orders, OrderLine> orderLineCollection;
    public static volatile SingularAttribute<Orders, Long> id;

}