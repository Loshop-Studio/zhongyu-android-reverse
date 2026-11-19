package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class FileInfoEntity_ implements EntityInfo<FileInfoEntity> {
    public static final Property<FileInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "FileInfoEntity";
    public static final int __ENTITY_ID = 7;
    public static final String __ENTITY_NAME = "FileInfoEntity";
    public static final Property<FileInfoEntity> __ID_PROPERTY;
    public static final FileInfoEntity_ __INSTANCE;
    public static final Property<FileInfoEntity> fileName;
    public static final Property<FileInfoEntity> height;

    /* renamed from: id */
    public static final Property<FileInfoEntity> f8723id;
    public static final RelationInfo<FileInfoEntity, FileRecordEntity> record;
    public static final Property<FileInfoEntity> recordId;
    public static final Property<FileInfoEntity> validate;
    public static final Property<FileInfoEntity> width;
    public static final Class<FileInfoEntity> __ENTITY_CLASS = FileInfoEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new FileInfoEntityCursor.Factory();
    static final FileInfoEntityIdGetter __ID_GETTER = new FileInfoEntityIdGetter();

    public static final class FileInfoEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(FileInfoEntity fileInfoEntity) {
            return fileInfoEntity.getId();
        }
    }

    static {
        FileInfoEntity_ fileInfoEntity_ = new FileInfoEntity_();
        __INSTANCE = fileInfoEntity_;
        Class cls = Long.TYPE;
        Property<FileInfoEntity> property = new Property<>(fileInfoEntity_, 0, 1, cls, "id", true, "id");
        f8723id = property;
        Property<FileInfoEntity> property2 = new Property<>(fileInfoEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Class cls2 = Integer.TYPE;
        Property<FileInfoEntity> property3 = new Property<>(fileInfoEntity_, 2, 3, cls2, "width");
        width = property3;
        Property<FileInfoEntity> property4 = new Property<>(fileInfoEntity_, 3, 4, cls2, "height");
        height = property4;
        Property<FileInfoEntity> property5 = new Property<>(fileInfoEntity_, 4, 5, String.class, "validate");
        validate = property5;
        Property<FileInfoEntity> property6 = new Property<>(fileInfoEntity_, 5, 6, cls, "recordId", true);
        recordId = property6;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(fileInfoEntity_, FileRecordEntity_.__INSTANCE, property6, new ToOneGetter<FileInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<FileRecordEntity> getToOne(FileInfoEntity fileInfoEntity) {
                return fileInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<FileInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "FileInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<FileInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 7;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "FileInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<FileInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
