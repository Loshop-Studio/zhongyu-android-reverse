package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileRecordEntityCursor;
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
public final class FileRecordEntity_ implements EntityInfo<FileRecordEntity> {
    public static final Property<FileRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "FileRecordEntity";
    public static final int __ENTITY_ID = 1;
    public static final String __ENTITY_NAME = "FileRecordEntity";
    public static final Property<FileRecordEntity> __ID_PROPERTY;
    public static final FileRecordEntity_ __INSTANCE;
    public static final RelationInfo<FileRecordEntity, FileInfoEntity> fileInfoEntity;
    public static final Property<FileRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<FileRecordEntity> f8725id;
    public static final RelationInfo<FileRecordEntity, RecordEntity> record;
    public static final Property<FileRecordEntity> recordId;
    public static final Property<FileRecordEntity> validate;
    public static final Class<FileRecordEntity> __ENTITY_CLASS = FileRecordEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new FileRecordEntityCursor.Factory();
    static final FileRecordEntityIdGetter __ID_GETTER = new FileRecordEntityIdGetter();

    public static final class FileRecordEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(FileRecordEntity fileRecordEntity) {
            return fileRecordEntity.getId();
        }
    }

    static {
        FileRecordEntity_ fileRecordEntity_ = new FileRecordEntity_();
        __INSTANCE = fileRecordEntity_;
        Class cls = Long.TYPE;
        Property<FileRecordEntity> property = new Property<>(fileRecordEntity_, 0, 1, cls, "id", true, "id");
        f8725id = property;
        Property<FileRecordEntity> property2 = new Property<>(fileRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<FileRecordEntity> property3 = new Property<>(fileRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<FileRecordEntity> property4 = new Property<>(fileRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(fileRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        fileInfoEntity = new RelationInfo<>(fileRecordEntity_, FileInfoEntity_.__INSTANCE, new ToManyGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<FileInfoEntity> getToMany(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.fileInfoEntity;
            }
        }, 1);
    }

    @Override // io.objectbox.EntityInfo
    public Property<FileRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "FileRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<FileRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 1;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "FileRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<FileRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
