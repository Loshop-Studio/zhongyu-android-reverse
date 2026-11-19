package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class GeometryInfoEntity_ implements EntityInfo<GeometryInfoEntity> {
    public static final Property<GeometryInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "GeometryInfoEntity";
    public static final int __ENTITY_ID = 21;
    public static final String __ENTITY_NAME = "GeometryInfoEntity";
    public static final Property<GeometryInfoEntity> __ID_PROPERTY;
    public static final GeometryInfoEntity_ __INSTANCE;
    public static final Property<GeometryInfoEntity> color;
    public static final Property<GeometryInfoEntity> geometryType;

    /* renamed from: id */
    public static final Property<GeometryInfoEntity> f8727id;
    public static final RelationInfo<GeometryInfoEntity, GeometryPointFEntity> pointList;
    public static final RelationInfo<GeometryInfoEntity, GeometryRecordEntity> record;
    public static final Property<GeometryInfoEntity> recordId;
    public static final Property<GeometryInfoEntity> style;
    public static final Property<GeometryInfoEntity> textSize;
    public static final Property<GeometryInfoEntity> width;
    public static final Class<GeometryInfoEntity> __ENTITY_CLASS = GeometryInfoEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new GeometryInfoEntityCursor.Factory();
    static final GeometryInfoEntityIdGetter __ID_GETTER = new GeometryInfoEntityIdGetter();

    public static final class GeometryInfoEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(GeometryInfoEntity geometryInfoEntity) {
            return geometryInfoEntity.getId();
        }
    }

    static {
        GeometryInfoEntity_ geometryInfoEntity_ = new GeometryInfoEntity_();
        __INSTANCE = geometryInfoEntity_;
        Class cls = Long.TYPE;
        Property<GeometryInfoEntity> property = new Property<>(geometryInfoEntity_, 0, 1, cls, "id", true, "id");
        f8727id = property;
        Class cls2 = Float.TYPE;
        Property<GeometryInfoEntity> property2 = new Property<>(geometryInfoEntity_, 1, 2, cls2, "width");
        width = property2;
        Class cls3 = Integer.TYPE;
        Property<GeometryInfoEntity> property3 = new Property<>(geometryInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        color = property3;
        Property<GeometryInfoEntity> property4 = new Property<>(geometryInfoEntity_, 3, 4, cls2, "textSize");
        textSize = property4;
        Property<GeometryInfoEntity> property5 = new Property<>(geometryInfoEntity_, 4, 5, cls3, "style");
        style = property5;
        Property<GeometryInfoEntity> property6 = new Property<>(geometryInfoEntity_, 5, 6, cls3, "geometryType");
        geometryType = property6;
        Property<GeometryInfoEntity> property7 = new Property<>(geometryInfoEntity_, 6, 7, cls, "recordId", true);
        recordId = property7;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(geometryInfoEntity_, GeometryRecordEntity_.__INSTANCE, property7, new ToOneGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<GeometryRecordEntity> getToOne(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.record;
            }
        });
        pointList = new RelationInfo<>(geometryInfoEntity_, GeometryPointFEntity_.__INSTANCE, new ToManyGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<GeometryPointFEntity> getToMany(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.pointList;
            }
        }, 10);
    }

    @Override // io.objectbox.EntityInfo
    public Property<GeometryInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "GeometryInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<GeometryInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 21;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "GeometryInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<GeometryInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
