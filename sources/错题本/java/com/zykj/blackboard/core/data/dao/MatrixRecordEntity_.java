package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor;
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
public final class MatrixRecordEntity_ implements EntityInfo<MatrixRecordEntity> {
    public static final Property<MatrixRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "MatrixRecordEntity";
    public static final int __ENTITY_ID = 18;
    public static final String __ENTITY_NAME = "MatrixRecordEntity";
    public static final Property<MatrixRecordEntity> __ID_PROPERTY;
    public static final MatrixRecordEntity_ __INSTANCE;
    public static final Property<MatrixRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<MatrixRecordEntity> f5227id;
    public static final RelationInfo<MatrixRecordEntity, MatrixEventEntity> matrixEventEntity;
    public static final RelationInfo<MatrixRecordEntity, RecordEntity> record;
    public static final Property<MatrixRecordEntity> recordId;
    public static final Property<MatrixRecordEntity> validate;
    public static final Class<MatrixRecordEntity> __ENTITY_CLASS = MatrixRecordEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new MatrixRecordEntityCursor.Factory();

    @Internal
    static final MatrixRecordEntityIdGetter __ID_GETTER = new MatrixRecordEntityIdGetter();

    @Internal
    public static final class MatrixRecordEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(MatrixRecordEntity matrixRecordEntity) {
            return matrixRecordEntity.getId();
        }
    }

    static {
        MatrixRecordEntity_ matrixRecordEntity_ = new MatrixRecordEntity_();
        __INSTANCE = matrixRecordEntity_;
        Class cls = Long.TYPE;
        Property<MatrixRecordEntity> property = new Property<>(matrixRecordEntity_, 0, 1, cls, "id", true, "id");
        f5227id = property;
        Property<MatrixRecordEntity> property2 = new Property<>(matrixRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<MatrixRecordEntity> property3 = new Property<>(matrixRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<MatrixRecordEntity> property4 = new Property<>(matrixRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(matrixRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        matrixEventEntity = new RelationInfo<>(matrixRecordEntity_, MatrixEventEntity_.__INSTANCE, new ToManyGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<MatrixEventEntity> getToMany(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.matrixEventEntity;
            }
        }, 6);
    }

    @Override // io.objectbox.EntityInfo
    public Property<MatrixRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "MatrixRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<MatrixRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 18;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "MatrixRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<MatrixRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
