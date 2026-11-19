package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class MatrixInfoEntity_ implements EntityInfo<MatrixInfoEntity> {
    public static final Property<MatrixInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "MatrixInfoEntity";
    public static final int __ENTITY_ID = 9;
    public static final String __ENTITY_NAME = "MatrixInfoEntity";
    public static final Property<MatrixInfoEntity> __ID_PROPERTY;
    public static final MatrixInfoEntity_ __INSTANCE;
    public static final Property<MatrixInfoEntity> eventTime;

    /* renamed from: id */
    public static final Property<MatrixInfoEntity> f8741id;
    public static final Property<MatrixInfoEntity> perSp0;
    public static final Property<MatrixInfoEntity> perSp1;
    public static final Property<MatrixInfoEntity> perSp2;
    public static final RelationInfo<MatrixInfoEntity, MatrixEventEntity> record;
    public static final Property<MatrixInfoEntity> recordId;
    public static final Property<MatrixInfoEntity> scaleX;
    public static final Property<MatrixInfoEntity> scaleY;
    public static final Property<MatrixInfoEntity> skewX;
    public static final Property<MatrixInfoEntity> skewY;
    public static final Property<MatrixInfoEntity> transX;
    public static final Property<MatrixInfoEntity> transY;
    public static final Class<MatrixInfoEntity> __ENTITY_CLASS = MatrixInfoEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new MatrixInfoEntityCursor.Factory();
    static final MatrixInfoEntityIdGetter __ID_GETTER = new MatrixInfoEntityIdGetter();

    public static final class MatrixInfoEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(MatrixInfoEntity matrixInfoEntity) {
            return matrixInfoEntity.getId();
        }
    }

    static {
        MatrixInfoEntity_ matrixInfoEntity_ = new MatrixInfoEntity_();
        __INSTANCE = matrixInfoEntity_;
        Class cls = Long.TYPE;
        Property<MatrixInfoEntity> property = new Property<>(matrixInfoEntity_, 0, 1, cls, "id", true, "id");
        f8741id = property;
        Property<MatrixInfoEntity> property2 = new Property<>(matrixInfoEntity_, 1, 2, cls, "eventTime");
        eventTime = property2;
        Class cls2 = Float.TYPE;
        Property<MatrixInfoEntity> property3 = new Property<>(matrixInfoEntity_, 2, 3, cls2, "scaleX");
        scaleX = property3;
        Property<MatrixInfoEntity> property4 = new Property<>(matrixInfoEntity_, 3, 4, cls2, "skewX");
        skewX = property4;
        Property<MatrixInfoEntity> property5 = new Property<>(matrixInfoEntity_, 4, 5, cls2, "transX");
        transX = property5;
        Property<MatrixInfoEntity> property6 = new Property<>(matrixInfoEntity_, 5, 6, cls2, "skewY");
        skewY = property6;
        Property<MatrixInfoEntity> property7 = new Property<>(matrixInfoEntity_, 6, 7, cls2, "scaleY");
        scaleY = property7;
        Property<MatrixInfoEntity> property8 = new Property<>(matrixInfoEntity_, 7, 8, cls2, "transY");
        transY = property8;
        Property<MatrixInfoEntity> property9 = new Property<>(matrixInfoEntity_, 8, 9, cls2, "perSp0");
        perSp0 = property9;
        Property<MatrixInfoEntity> property10 = new Property<>(matrixInfoEntity_, 9, 10, cls2, "perSp1");
        perSp1 = property10;
        Property<MatrixInfoEntity> property11 = new Property<>(matrixInfoEntity_, 10, 11, cls2, "perSp2");
        perSp2 = property11;
        Property<MatrixInfoEntity> property12 = new Property<>(matrixInfoEntity_, 11, 12, cls, "recordId", true);
        recordId = property12;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(matrixInfoEntity_, MatrixEventEntity_.__INSTANCE, property12, new ToOneGetter<MatrixInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<MatrixEventEntity> getToOne(MatrixInfoEntity matrixInfoEntity) {
                return matrixInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<MatrixInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "MatrixInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<MatrixInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 9;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "MatrixInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<MatrixInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
