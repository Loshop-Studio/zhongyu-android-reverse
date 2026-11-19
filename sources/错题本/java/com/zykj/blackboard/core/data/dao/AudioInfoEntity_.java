package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class AudioInfoEntity_ implements EntityInfo<AudioInfoEntity> {
    public static final Property<AudioInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "AudioInfoEntity";
    public static final int __ENTITY_ID = 16;
    public static final String __ENTITY_NAME = "AudioInfoEntity";
    public static final Property<AudioInfoEntity> __ID_PROPERTY;
    public static final AudioInfoEntity_ __INSTANCE;
    public static final Property<AudioInfoEntity> commandEnum;
    public static final Property<AudioInfoEntity> data;
    public static final Property<AudioInfoEntity> delayTime;
    public static final Property<AudioInfoEntity> duration;

    /* renamed from: id */
    public static final Property<AudioInfoEntity> f5193id;
    public static final Property<AudioInfoEntity> isPlay;
    public static final RelationInfo<AudioInfoEntity, AudioRecordEntity> record;
    public static final Property<AudioInfoEntity> recordId;
    public static final Class<AudioInfoEntity> __ENTITY_CLASS = AudioInfoEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new AudioInfoEntityCursor.Factory();

    @Internal
    static final AudioInfoEntityIdGetter __ID_GETTER = new AudioInfoEntityIdGetter();

    @Internal
    public static final class AudioInfoEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(AudioInfoEntity audioInfoEntity) {
            return audioInfoEntity.getId();
        }
    }

    static {
        AudioInfoEntity_ audioInfoEntity_ = new AudioInfoEntity_();
        __INSTANCE = audioInfoEntity_;
        Class cls = Long.TYPE;
        Property<AudioInfoEntity> property = new Property<>(audioInfoEntity_, 0, 1, cls, "id", true, "id");
        f5193id = property;
        Property<AudioInfoEntity> property2 = new Property<>(audioInfoEntity_, 1, 2, cls, "delayTime");
        delayTime = property2;
        Property<AudioInfoEntity> property3 = new Property<>(audioInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        duration = property3;
        Property<AudioInfoEntity> property4 = new Property<>(audioInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        isPlay = property4;
        Property<AudioInfoEntity> property5 = new Property<>(audioInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum$CommandEnum.class);
        commandEnum = property5;
        Property<AudioInfoEntity> property6 = new Property<>(audioInfoEntity_, 5, 6, byte[].class, "data");
        data = property6;
        Property<AudioInfoEntity> property7 = new Property<>(audioInfoEntity_, 6, 7, cls, "recordId", true);
        recordId = property7;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(audioInfoEntity_, AudioRecordEntity_.__INSTANCE, property7, new ToOneGetter<AudioInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<AudioRecordEntity> getToOne(AudioInfoEntity audioInfoEntity) {
                return audioInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<AudioInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "AudioInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<AudioInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 16;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "AudioInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<AudioInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
