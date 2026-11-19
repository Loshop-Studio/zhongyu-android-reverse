package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class TouchInfoEntity_ implements EntityInfo<TouchInfoEntity> {
    public static final Property<TouchInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "TouchInfoEntity";
    public static final int __ENTITY_ID = 13;
    public static final String __ENTITY_NAME = "TouchInfoEntity";
    public static final Property<TouchInfoEntity> __ID_PROPERTY;
    public static final TouchInfoEntity_ __INSTANCE;
    public static final Property<TouchInfoEntity> eventTime;

    /* renamed from: id */
    public static final Property<TouchInfoEntity> f8759id;
    public static final RelationInfo<TouchInfoEntity, TouchEventEntity> record;
    public static final Property<TouchInfoEntity> recordId;

    /* renamed from: x */
    public static final Property<TouchInfoEntity> f8760x;

    /* renamed from: y */
    public static final Property<TouchInfoEntity> f8761y;
    public static final Class<TouchInfoEntity> __ENTITY_CLASS = TouchInfoEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new TouchInfoEntityCursor.Factory();
    static final TouchInfoEntityIdGetter __ID_GETTER = new TouchInfoEntityIdGetter();

    public static final class TouchInfoEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(TouchInfoEntity touchInfoEntity) {
            return touchInfoEntity.getId();
        }
    }

    static {
        TouchInfoEntity_ touchInfoEntity_ = new TouchInfoEntity_();
        __INSTANCE = touchInfoEntity_;
        Class cls = Long.TYPE;
        Property<TouchInfoEntity> property = new Property<>(touchInfoEntity_, 0, 1, cls, "id", true, "id");
        f8759id = property;
        Property<TouchInfoEntity> property2 = new Property<>(touchInfoEntity_, 1, 2, cls, "eventTime");
        eventTime = property2;
        Class cls2 = Float.TYPE;
        Property<TouchInfoEntity> property3 = new Property<>(touchInfoEntity_, 2, 3, cls2, "x");
        f8760x = property3;
        Property<TouchInfoEntity> property4 = new Property<>(touchInfoEntity_, 3, 4, cls2, "y");
        f8761y = property4;
        Property<TouchInfoEntity> property5 = new Property<>(touchInfoEntity_, 4, 6, cls, "recordId", true);
        recordId = property5;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(touchInfoEntity_, TouchEventEntity_.__INSTANCE, property5, new ToOneGetter<TouchInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<TouchEventEntity> getToOne(TouchInfoEntity touchInfoEntity) {
                return touchInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<TouchInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "TouchInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<TouchInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 13;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "TouchInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<TouchInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
