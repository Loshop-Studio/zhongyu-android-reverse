package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.RecordEntityCursor;
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
public final class RecordEntity_ implements EntityInfo<RecordEntity> {
    public static final Property<RecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "RecordEntity";
    public static final int __ENTITY_ID = 8;
    public static final String __ENTITY_NAME = "RecordEntity";
    public static final Property<RecordEntity> __ID_PROPERTY;
    public static final RecordEntity_ __INSTANCE;
    public static final RelationInfo<RecordEntity, AudioRecordEntity> audioList;
    public static final RelationInfo<RecordEntity, CommandRecordEntity> commandList;
    public static final RelationInfo<RecordEntity, FileRecordEntity> fileList;
    public static final RelationInfo<RecordEntity, GeometryRecordEntity> geometryList;

    /* renamed from: id */
    public static final Property<RecordEntity> f8749id;
    public static final RelationInfo<RecordEntity, MatrixRecordEntity> matrixList;
    public static final RelationInfo<RecordEntity, PageEntity> page;
    public static final Property<RecordEntity> pageId;
    public static final RelationInfo<RecordEntity, TextRecordEntity> textList;
    public static final RelationInfo<RecordEntity, TouchRecordEntity> touchList;
    public static final Class<RecordEntity> __ENTITY_CLASS = RecordEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new RecordEntityCursor.Factory();
    static final RecordEntityIdGetter __ID_GETTER = new RecordEntityIdGetter();

    public static final class RecordEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(RecordEntity recordEntity) {
            return recordEntity.getId();
        }
    }

    static {
        RecordEntity_ recordEntity_ = new RecordEntity_();
        __INSTANCE = recordEntity_;
        Class cls = Long.TYPE;
        Property<RecordEntity> property = new Property<>(recordEntity_, 0, 1, cls, "id", true, "id");
        f8749id = property;
        Property<RecordEntity> property2 = new Property<>(recordEntity_, 1, 2, cls, "pageId", true);
        pageId = property2;
        __ALL_PROPERTIES = new Property[]{property, property2};
        __ID_PROPERTY = property;
        page = new RelationInfo<>(recordEntity_, PageEntity_.__INSTANCE, property2, new ToOneGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<PageEntity> getToOne(RecordEntity recordEntity) {
                return recordEntity.page;
            }
        });
        commandList = new RelationInfo<>(recordEntity_, CommandRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<CommandRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.commandList;
            }
        }, CommandRecordEntity_.recordId, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        fileList = new RelationInfo<>(recordEntity_, FileRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.4
            @Override // io.objectbox.internal.ToManyGetter
            public List<FileRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.fileList;
            }
        }, FileRecordEntity_.recordId, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        touchList = new RelationInfo<>(recordEntity_, TouchRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            public List<TouchRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.touchList;
            }
        }, TouchRecordEntity_.recordId, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.7
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        matrixList = new RelationInfo<>(recordEntity_, MatrixRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.8
            @Override // io.objectbox.internal.ToManyGetter
            public List<MatrixRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.matrixList;
            }
        }, MatrixRecordEntity_.recordId, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.9
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        audioList = new RelationInfo<>(recordEntity_, AudioRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.10
            @Override // io.objectbox.internal.ToManyGetter
            public List<AudioRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.audioList;
            }
        }, AudioRecordEntity_.recordId, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.11
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        textList = new RelationInfo<>(recordEntity_, TextRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.12
            @Override // io.objectbox.internal.ToManyGetter
            public List<TextRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.textList;
            }
        }, TextRecordEntity_.recordId, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.13
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        geometryList = new RelationInfo<>(recordEntity_, GeometryRecordEntity_.__INSTANCE, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.14
            @Override // io.objectbox.internal.ToManyGetter
            public List<GeometryRecordEntity> getToMany(RecordEntity recordEntity) {
                return recordEntity.geometryList;
            }
        }, GeometryRecordEntity_.recordId, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.15
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<RecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "RecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<RecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 8;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "RecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<RecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
