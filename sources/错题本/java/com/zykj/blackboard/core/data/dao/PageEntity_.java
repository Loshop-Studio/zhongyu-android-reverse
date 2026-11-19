package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.PageEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class PageEntity_ implements EntityInfo<PageEntity> {
    public static final Property<PageEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "PageEntity";
    public static final int __ENTITY_ID = 14;
    public static final String __ENTITY_NAME = "PageEntity";
    public static final Property<PageEntity> __ID_PROPERTY;
    public static final PageEntity_ __INSTANCE;
    public static final RelationInfo<PageEntity, BlackBoardEntity> blackBoardEntity;
    public static final Property<PageEntity> blackBoardEntityId;
    public static final Property<PageEntity> commandFileName;
    public static final Property<PageEntity> commandIndex;
    public static final Property<PageEntity> dirName;
    public static final RelationInfo<PageEntity, HeaderEntity> headerEntity;
    public static final Property<PageEntity> headerEntityId;

    /* renamed from: id */
    public static final Property<PageEntity> f5231id;
    public static final Property<PageEntity> isChange;
    public static final RelationInfo<PageEntity, RecordEntity> recordEntity;
    public static final Property<PageEntity> recordEntityId;
    public static final Class<PageEntity> __ENTITY_CLASS = PageEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new PageEntityCursor.Factory();

    @Internal
    static final PageEntityIdGetter __ID_GETTER = new PageEntityIdGetter();

    @Internal
    public static final class PageEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(PageEntity pageEntity) {
            return pageEntity.getId();
        }
    }

    static {
        PageEntity_ pageEntity_ = new PageEntity_();
        __INSTANCE = pageEntity_;
        Class cls = Long.TYPE;
        Property<PageEntity> property = new Property<>(pageEntity_, 0, 1, cls, "id", true, "id");
        f5231id = property;
        Property<PageEntity> property2 = new Property<>(pageEntity_, 1, 2, String.class, "dirName");
        dirName = property2;
        Property<PageEntity> property3 = new Property<>(pageEntity_, 2, 3, Boolean.TYPE, "isChange");
        isChange = property3;
        Property<PageEntity> property4 = new Property<>(pageEntity_, 3, 4, String.class, "commandFileName");
        commandFileName = property4;
        Property<PageEntity> property5 = new Property<>(pageEntity_, 4, 5, Integer.TYPE, "commandIndex");
        commandIndex = property5;
        Property<PageEntity> property6 = new Property<>(pageEntity_, 5, 6, cls, "blackBoardEntityId", true);
        blackBoardEntityId = property6;
        Property<PageEntity> property7 = new Property<>(pageEntity_, 6, 7, cls, "recordEntityId", true);
        recordEntityId = property7;
        Property<PageEntity> property8 = new Property<>(pageEntity_, 7, 8, cls, "headerEntityId", true);
        headerEntityId = property8;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        __ID_PROPERTY = property;
        blackBoardEntity = new RelationInfo<>(pageEntity_, BlackBoardEntity_.__INSTANCE, property6, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<BlackBoardEntity> getToOne(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
        recordEntity = new RelationInfo<>(pageEntity_, RecordEntity_.__INSTANCE, property7, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(PageEntity pageEntity) {
                return pageEntity.recordEntity;
            }
        });
        headerEntity = new RelationInfo<>(pageEntity_, HeaderEntity_.__INSTANCE, property8, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<HeaderEntity> getToOne(PageEntity pageEntity) {
                return pageEntity.headerEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<PageEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "PageEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<PageEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 14;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "PageEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<PageEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
