package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor;
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
public final class CommandInfoEntity_ implements EntityInfo<CommandInfoEntity> {
    public static final Property<CommandInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "CommandInfoEntity";
    public static final int __ENTITY_ID = 5;
    public static final String __ENTITY_NAME = "CommandInfoEntity";
    public static final Property<CommandInfoEntity> __ID_PROPERTY;
    public static final CommandInfoEntity_ __INSTANCE;
    public static final Property<CommandInfoEntity> commandEnum;
    public static final Property<CommandInfoEntity> data;
    public static final Property<CommandInfoEntity> delayTime;
    public static final Property<CommandInfoEntity> duration;

    /* renamed from: id */
    public static final Property<CommandInfoEntity> f5203id;
    public static final Property<CommandInfoEntity> isPlay;
    public static final RelationInfo<CommandInfoEntity, CommandRecordEntity> record;
    public static final Property<CommandInfoEntity> recordId;
    public static final Class<CommandInfoEntity> __ENTITY_CLASS = CommandInfoEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new CommandInfoEntityCursor.Factory();

    @Internal
    static final CommandInfoEntityIdGetter __ID_GETTER = new CommandInfoEntityIdGetter();

    @Internal
    public static final class CommandInfoEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(CommandInfoEntity commandInfoEntity) {
            return commandInfoEntity.getId();
        }
    }

    static {
        CommandInfoEntity_ commandInfoEntity_ = new CommandInfoEntity_();
        __INSTANCE = commandInfoEntity_;
        Class cls = Long.TYPE;
        Property<CommandInfoEntity> property = new Property<>(commandInfoEntity_, 0, 1, cls, "id", true, "id");
        f5203id = property;
        Property<CommandInfoEntity> property2 = new Property<>(commandInfoEntity_, 1, 2, cls, "delayTime");
        delayTime = property2;
        Property<CommandInfoEntity> property3 = new Property<>(commandInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        duration = property3;
        Property<CommandInfoEntity> property4 = new Property<>(commandInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        isPlay = property4;
        Property<CommandInfoEntity> property5 = new Property<>(commandInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum$CommandEnum.class);
        commandEnum = property5;
        Property<CommandInfoEntity> property6 = new Property<>(commandInfoEntity_, 5, 6, byte[].class, "data");
        data = property6;
        Property<CommandInfoEntity> property7 = new Property<>(commandInfoEntity_, 6, 7, cls, "recordId", true);
        recordId = property7;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(commandInfoEntity_, CommandRecordEntity_.__INSTANCE, property7, new ToOneGetter<CommandInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<CommandRecordEntity> getToOne(CommandInfoEntity commandInfoEntity) {
                return commandInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<CommandInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "CommandInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<CommandInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 5;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "CommandInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<CommandInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
