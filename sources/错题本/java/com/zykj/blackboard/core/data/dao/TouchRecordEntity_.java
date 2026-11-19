package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class TouchRecordEntity_ implements EntityInfo<TouchRecordEntity> {
    public static final Property<TouchRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "TouchRecordEntity";
    public static final int __ENTITY_ID = 10;
    public static final String __ENTITY_NAME = "TouchRecordEntity";
    public static final Property<TouchRecordEntity> __ID_PROPERTY;
    public static final TouchRecordEntity_ __INSTANCE;
    public static final Property<TouchRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<TouchRecordEntity> f5247id;
    public static final RelationInfo<TouchRecordEntity, RecordEntity> record;
    public static final Property<TouchRecordEntity> recordId;
    public static final RelationInfo<TouchRecordEntity, TouchEventEntity> touchEventList;
    public static final Property<TouchRecordEntity> validate;
    public static final Class<TouchRecordEntity> __ENTITY_CLASS = TouchRecordEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new TouchRecordEntityCursor.Factory();

    @Internal
    static final TouchRecordEntityIdGetter __ID_GETTER = new TouchRecordEntityIdGetter();

    @Internal
    public static final class TouchRecordEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(TouchRecordEntity touchRecordEntity) {
            return touchRecordEntity.getId();
        }
    }

    static {
        TouchRecordEntity_ touchRecordEntity_ = new TouchRecordEntity_();
        __INSTANCE = touchRecordEntity_;
        Class cls = Long.TYPE;
        Property<TouchRecordEntity> property = new Property<>(touchRecordEntity_, 0, 1, cls, "id", true, "id");
        f5247id = property;
        Property<TouchRecordEntity> property2 = new Property<>(touchRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<TouchRecordEntity> property3 = new Property<>(touchRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<TouchRecordEntity> property4 = new Property<>(touchRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(touchRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        touchEventList = new RelationInfo<>(touchRecordEntity_, TouchEventEntity_.__INSTANCE, new ToManyGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<TouchEventEntity> getToMany(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.touchEventList;
            }
        }, 4);
    }

    @Override // io.objectbox.EntityInfo
    public Property<TouchRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "TouchRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<TouchRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 10;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "TouchRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<TouchRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
