package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor;
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
public final class MatrixEventEntity_ implements EntityInfo<MatrixEventEntity> {
    public static final Property<MatrixEventEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "MatrixEventEntity";
    public static final int __ENTITY_ID = 15;
    public static final String __ENTITY_NAME = "MatrixEventEntity";
    public static final Property<MatrixEventEntity> __ID_PROPERTY;
    public static final MatrixEventEntity_ __INSTANCE;

    /* renamed from: id */
    public static final Property<MatrixEventEntity> f5223id;
    public static final RelationInfo<MatrixEventEntity, MatrixInfoEntity> matrixInfo;
    public static final RelationInfo<MatrixEventEntity, MatrixRecordEntity> record;
    public static final Property<MatrixEventEntity> recordId;
    public static final Class<MatrixEventEntity> __ENTITY_CLASS = MatrixEventEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new MatrixEventEntityCursor.Factory();

    @Internal
    static final MatrixEventEntityIdGetter __ID_GETTER = new MatrixEventEntityIdGetter();

    @Internal
    public static final class MatrixEventEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(MatrixEventEntity matrixEventEntity) {
            return matrixEventEntity.getId();
        }
    }

    static {
        MatrixEventEntity_ matrixEventEntity_ = new MatrixEventEntity_();
        __INSTANCE = matrixEventEntity_;
        Class cls = Long.TYPE;
        Property<MatrixEventEntity> property = new Property<>(matrixEventEntity_, 0, 1, cls, "id", true, "id");
        f5223id = property;
        Property<MatrixEventEntity> property2 = new Property<>(matrixEventEntity_, 1, 2, cls, "recordId", true);
        recordId = property2;
        __ALL_PROPERTIES = new Property[]{property, property2};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(matrixEventEntity_, MatrixRecordEntity_.__INSTANCE, property2, new ToOneGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<MatrixRecordEntity> getToOne(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.record;
            }
        });
        matrixInfo = new RelationInfo<>(matrixEventEntity_, MatrixInfoEntity_.__INSTANCE, new ToManyGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<MatrixInfoEntity> getToMany(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.matrixInfo;
            }
        }, 5);
    }

    @Override // io.objectbox.EntityInfo
    public Property<MatrixEventEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "MatrixEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<MatrixEventEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 15;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "MatrixEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<MatrixEventEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
