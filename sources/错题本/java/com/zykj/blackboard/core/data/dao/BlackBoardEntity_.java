package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor;
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
public final class BlackBoardEntity_ implements EntityInfo<BlackBoardEntity> {
    public static final Property<BlackBoardEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "BlackBoardEntity";
    public static final int __ENTITY_ID = 12;
    public static final String __ENTITY_NAME = "BlackBoardEntity";
    public static final Property<BlackBoardEntity> __ID_PROPERTY;
    public static final BlackBoardEntity_ __INSTANCE;
    public static final Property<BlackBoardEntity> dir;

    /* renamed from: id */
    public static final Property<BlackBoardEntity> f5201id;
    public static final RelationInfo<BlackBoardEntity, PageEntity> pages;
    public static final Class<BlackBoardEntity> __ENTITY_CLASS = BlackBoardEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new BlackBoardEntityCursor.Factory();

    @Internal
    static final BlackBoardEntityIdGetter __ID_GETTER = new BlackBoardEntityIdGetter();

    @Internal
    public static final class BlackBoardEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(BlackBoardEntity blackBoardEntity) {
            return blackBoardEntity.getId();
        }
    }

    static {
        BlackBoardEntity_ blackBoardEntity_ = new BlackBoardEntity_();
        __INSTANCE = blackBoardEntity_;
        Property<BlackBoardEntity> property = new Property<>(blackBoardEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f5201id = property;
        Property<BlackBoardEntity> property2 = new Property<>(blackBoardEntity_, 1, 2, String.class, "dir");
        dir = property2;
        __ALL_PROPERTIES = new Property[]{property, property2};
        __ID_PROPERTY = property;
        pages = new RelationInfo<>(blackBoardEntity_, PageEntity_.__INSTANCE, new ToManyGetter<BlackBoardEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.1
            @Override // io.objectbox.internal.ToManyGetter
            public List<PageEntity> getToMany(BlackBoardEntity blackBoardEntity) {
                return blackBoardEntity.pages;
            }
        }, PageEntity_.blackBoardEntityId, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<BlackBoardEntity> getToOne(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<BlackBoardEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "BlackBoardEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<BlackBoardEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 12;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "BlackBoardEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<BlackBoardEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
