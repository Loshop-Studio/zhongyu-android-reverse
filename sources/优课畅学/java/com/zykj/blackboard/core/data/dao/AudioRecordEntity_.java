package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor;
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
public final class AudioRecordEntity_ implements EntityInfo<AudioRecordEntity> {
    public static final Property<AudioRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "AudioRecordEntity";
    public static final int __ENTITY_ID = 3;
    public static final String __ENTITY_NAME = "AudioRecordEntity";
    public static final Property<AudioRecordEntity> __ID_PROPERTY;
    public static final AudioRecordEntity_ __INSTANCE;
    public static final RelationInfo<AudioRecordEntity, AudioInfoEntity> audioInfoEntity;
    public static final Property<AudioRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<AudioRecordEntity> f8711id;
    public static final RelationInfo<AudioRecordEntity, RecordEntity> record;
    public static final Property<AudioRecordEntity> recordId;
    public static final Property<AudioRecordEntity> validate;
    public static final Class<AudioRecordEntity> __ENTITY_CLASS = AudioRecordEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new AudioRecordEntityCursor.Factory();
    static final AudioRecordEntityIdGetter __ID_GETTER = new AudioRecordEntityIdGetter();

    public static final class AudioRecordEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(AudioRecordEntity audioRecordEntity) {
            return audioRecordEntity.getId();
        }
    }

    static {
        AudioRecordEntity_ audioRecordEntity_ = new AudioRecordEntity_();
        __INSTANCE = audioRecordEntity_;
        Class cls = Long.TYPE;
        Property<AudioRecordEntity> property = new Property<>(audioRecordEntity_, 0, 1, cls, "id", true, "id");
        f8711id = property;
        Property<AudioRecordEntity> property2 = new Property<>(audioRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<AudioRecordEntity> property3 = new Property<>(audioRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<AudioRecordEntity> property4 = new Property<>(audioRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(audioRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        audioInfoEntity = new RelationInfo<>(audioRecordEntity_, AudioInfoEntity_.__INSTANCE, new ToManyGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<AudioInfoEntity> getToMany(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.audioInfoEntity;
            }
        }, 3);
    }

    @Override // io.objectbox.EntityInfo
    public Property<AudioRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "AudioRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<AudioRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 3;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "AudioRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<AudioRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
