package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor;
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
public final class CommandRecordEntity_ implements EntityInfo<CommandRecordEntity> {
    public static final Property<CommandRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "CommandRecordEntity";
    public static final int __ENTITY_ID = 17;
    public static final String __ENTITY_NAME = "CommandRecordEntity";
    public static final Property<CommandRecordEntity> __ID_PROPERTY;
    public static final CommandRecordEntity_ __INSTANCE;
    public static final RelationInfo<CommandRecordEntity, CommandInfoEntity> commandInfoEntity;
    public static final Property<CommandRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<CommandRecordEntity> f5205id;
    public static final RelationInfo<CommandRecordEntity, RecordEntity> record;
    public static final Property<CommandRecordEntity> recordId;
    public static final Property<CommandRecordEntity> validate;
    public static final Class<CommandRecordEntity> __ENTITY_CLASS = CommandRecordEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new CommandRecordEntityCursor.Factory();

    @Internal
    static final CommandRecordEntityIdGetter __ID_GETTER = new CommandRecordEntityIdGetter();

    @Internal
    public static final class CommandRecordEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(CommandRecordEntity commandRecordEntity) {
            return commandRecordEntity.getId();
        }
    }

    static {
        CommandRecordEntity_ commandRecordEntity_ = new CommandRecordEntity_();
        __INSTANCE = commandRecordEntity_;
        Class cls = Long.TYPE;
        Property<CommandRecordEntity> property = new Property<>(commandRecordEntity_, 0, 1, cls, "id", true, "id");
        f5205id = property;
        Property<CommandRecordEntity> property2 = new Property<>(commandRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<CommandRecordEntity> property3 = new Property<>(commandRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<CommandRecordEntity> property4 = new Property<>(commandRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(commandRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        commandInfoEntity = new RelationInfo<>(commandRecordEntity_, CommandInfoEntity_.__INSTANCE, new ToManyGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<CommandInfoEntity> getToMany(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.commandInfoEntity;
            }
        }, 8);
    }

    @Override // io.objectbox.EntityInfo
    public Property<CommandRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "CommandRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<CommandRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 17;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "CommandRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<CommandRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
