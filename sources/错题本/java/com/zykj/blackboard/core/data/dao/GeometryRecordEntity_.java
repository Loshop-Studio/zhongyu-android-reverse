package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor;
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
public final class GeometryRecordEntity_ implements EntityInfo<GeometryRecordEntity> {
    public static final Property<GeometryRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "GeometryRecordEntity";
    public static final int __ENTITY_ID = 22;
    public static final String __ENTITY_NAME = "GeometryRecordEntity";
    public static final Property<GeometryRecordEntity> __ID_PROPERTY;
    public static final GeometryRecordEntity_ __INSTANCE;
    public static final Property<GeometryRecordEntity> fileName;
    public static final RelationInfo<GeometryRecordEntity, GeometryInfoEntity> geometryInfoEntityList;

    /* renamed from: id */
    public static final Property<GeometryRecordEntity> f5219id;
    public static final RelationInfo<GeometryRecordEntity, RecordEntity> record;
    public static final Property<GeometryRecordEntity> recordId;
    public static final Property<GeometryRecordEntity> validate;
    public static final Class<GeometryRecordEntity> __ENTITY_CLASS = GeometryRecordEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new GeometryRecordEntityCursor.Factory();

    @Internal
    static final GeometryRecordEntityIdGetter __ID_GETTER = new GeometryRecordEntityIdGetter();

    @Internal
    public static final class GeometryRecordEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(GeometryRecordEntity geometryRecordEntity) {
            return geometryRecordEntity.getId();
        }
    }

    static {
        GeometryRecordEntity_ geometryRecordEntity_ = new GeometryRecordEntity_();
        __INSTANCE = geometryRecordEntity_;
        Class cls = Long.TYPE;
        Property<GeometryRecordEntity> property = new Property<>(geometryRecordEntity_, 0, 1, cls, "id", true, "id");
        f5219id = property;
        Property<GeometryRecordEntity> property2 = new Property<>(geometryRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<GeometryRecordEntity> property3 = new Property<>(geometryRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<GeometryRecordEntity> property4 = new Property<>(geometryRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(geometryRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
        geometryInfoEntityList = new RelationInfo<>(geometryRecordEntity_, GeometryInfoEntity_.__INSTANCE, new ToManyGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<GeometryInfoEntity> getToMany(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.geometryInfoEntityList;
            }
        }, 11);
    }

    @Override // io.objectbox.EntityInfo
    public Property<GeometryRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "GeometryRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<GeometryRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 22;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "GeometryRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<GeometryRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
