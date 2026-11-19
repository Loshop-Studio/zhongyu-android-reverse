package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class GeometryPointFEntity_ implements EntityInfo<GeometryPointFEntity> {
    public static final Property<GeometryPointFEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "GeometryPointFEntity";
    public static final int __ENTITY_ID = 23;
    public static final String __ENTITY_NAME = "GeometryPointFEntity";
    public static final Property<GeometryPointFEntity> __ID_PROPERTY;
    public static final GeometryPointFEntity_ __INSTANCE;

    /* renamed from: id */
    public static final Property<GeometryPointFEntity> f5215id;
    public static final RelationInfo<GeometryPointFEntity, GeometryInfoEntity> record;
    public static final Property<GeometryPointFEntity> recordId;

    /* renamed from: x */
    public static final Property<GeometryPointFEntity> f5216x;

    /* renamed from: y */
    public static final Property<GeometryPointFEntity> f5217y;
    public static final Class<GeometryPointFEntity> __ENTITY_CLASS = GeometryPointFEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new GeometryPointFEntityCursor.Factory();

    @Internal
    static final GeometryPointFEntityIdGetter __ID_GETTER = new GeometryPointFEntityIdGetter();

    @Internal
    public static final class GeometryPointFEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(GeometryPointFEntity geometryPointFEntity) {
            return geometryPointFEntity.getId();
        }
    }

    static {
        GeometryPointFEntity_ geometryPointFEntity_ = new GeometryPointFEntity_();
        __INSTANCE = geometryPointFEntity_;
        Class cls = Long.TYPE;
        Property<GeometryPointFEntity> property = new Property<>(geometryPointFEntity_, 0, 1, cls, "id", true, "id");
        f5215id = property;
        Class cls2 = Float.TYPE;
        Property<GeometryPointFEntity> property2 = new Property<>(geometryPointFEntity_, 1, 2, cls2, "x");
        f5216x = property2;
        Property<GeometryPointFEntity> property3 = new Property<>(geometryPointFEntity_, 2, 3, cls2, "y");
        f5217y = property3;
        Property<GeometryPointFEntity> property4 = new Property<>(geometryPointFEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(geometryPointFEntity_, GeometryInfoEntity_.__INSTANCE, property4, new ToOneGetter<GeometryPointFEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<GeometryInfoEntity> getToOne(GeometryPointFEntity geometryPointFEntity) {
                return geometryPointFEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<GeometryPointFEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "GeometryPointFEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<GeometryPointFEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 23;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "GeometryPointFEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<GeometryPointFEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
