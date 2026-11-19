package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.HeaderEntityCursor;
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
public final class HeaderEntity_ implements EntityInfo<HeaderEntity> {
    public static final Property<HeaderEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "HeaderEntity";
    public static final int __ENTITY_ID = 6;
    public static final String __ENTITY_NAME = "HeaderEntity";
    public static final Property<HeaderEntity> __ID_PROPERTY;
    public static final HeaderEntity_ __INSTANCE;
    public static final RelationInfo<HeaderEntity, AuthorEntity> author;
    public static final Property<HeaderEntity> authorId;
    public static final Property<HeaderEntity> convertUrl;
    public static final Property<HeaderEntity> createDate;
    public static final Property<HeaderEntity> defaultBackgroundColor;
    public static final RelationInfo<HeaderEntity, BackgroundLineConfigEntity> defaultBackgroundLineConfig;
    public static final Property<HeaderEntity> defaultBackgroundLineConfigId;
    public static final Property<HeaderEntity> duration;
    public static final Property<HeaderEntity> height;

    /* renamed from: id */
    public static final Property<HeaderEntity> f5221id;
    public static final Property<HeaderEntity> lastBackgroundColor;
    public static final RelationInfo<HeaderEntity, BackgroundLineConfigEntity> lastBackgroundLineConfig;
    public static final Property<HeaderEntity> lastBackgroundLineConfigId;
    public static final RelationInfo<HeaderEntity, MoveConfigEntity> moveConfig;
    public static final Property<HeaderEntity> moveConfigId;
    public static final RelationInfo<HeaderEntity, PageEntity> page;
    public static final Property<HeaderEntity> pageId;
    public static final RelationInfo<HeaderEntity, AuthorEntity> provider;
    public static final Property<HeaderEntity> updateDate;
    public static final Property<HeaderEntity> version;
    public static final Property<HeaderEntity> width;
    public static final Class<HeaderEntity> __ENTITY_CLASS = HeaderEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new HeaderEntityCursor.Factory();

    @Internal
    static final HeaderEntityIdGetter __ID_GETTER = new HeaderEntityIdGetter();

    @Internal
    public static final class HeaderEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(HeaderEntity headerEntity) {
            return headerEntity.getId();
        }
    }

    static {
        HeaderEntity_ headerEntity_ = new HeaderEntity_();
        __INSTANCE = headerEntity_;
        Class cls = Long.TYPE;
        Property<HeaderEntity> property = new Property<>(headerEntity_, 0, 1, cls, "id", true, "id");
        f5221id = property;
        Class cls2 = Integer.TYPE;
        Property<HeaderEntity> property2 = new Property<>(headerEntity_, 1, 2, cls2, "version");
        version = property2;
        Property<HeaderEntity> property3 = new Property<>(headerEntity_, 2, 3, cls2, "width");
        width = property3;
        Property<HeaderEntity> property4 = new Property<>(headerEntity_, 3, 4, cls2, "height");
        height = property4;
        Property<HeaderEntity> property5 = new Property<>(headerEntity_, 4, 5, cls, "createDate");
        createDate = property5;
        Property<HeaderEntity> property6 = new Property<>(headerEntity_, 5, 6, cls, "updateDate");
        updateDate = property6;
        Property<HeaderEntity> property7 = new Property<>(headerEntity_, 6, 7, cls, TypedValues.TransitionType.S_DURATION);
        duration = property7;
        Property<HeaderEntity> property8 = new Property<>(headerEntity_, 7, 11, String.class, "convertUrl");
        convertUrl = property8;
        Property<HeaderEntity> property9 = new Property<>(headerEntity_, 8, 12, cls2, "defaultBackgroundColor");
        defaultBackgroundColor = property9;
        Property<HeaderEntity> property10 = new Property<>(headerEntity_, 9, 13, cls2, "lastBackgroundColor");
        lastBackgroundColor = property10;
        Property<HeaderEntity> property11 = new Property<>(headerEntity_, 10, 9, cls, "pageId", true);
        pageId = property11;
        Property<HeaderEntity> property12 = new Property<>(headerEntity_, 11, 15, cls, "defaultBackgroundLineConfigId", true);
        defaultBackgroundLineConfigId = property12;
        Property<HeaderEntity> property13 = new Property<>(headerEntity_, 12, 16, cls, "lastBackgroundLineConfigId", true);
        lastBackgroundLineConfigId = property13;
        Property<HeaderEntity> property14 = new Property<>(headerEntity_, 13, 10, cls, "authorId", true);
        authorId = property14;
        Property<HeaderEntity> property15 = new Property<>(headerEntity_, 14, 14, cls, "moveConfigId", true);
        moveConfigId = property15;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12, property13, property14, property15};
        __ID_PROPERTY = property;
        page = new RelationInfo<>(headerEntity_, PageEntity_.__INSTANCE, property11, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<PageEntity> getToOne(HeaderEntity headerEntity) {
                return headerEntity.page;
            }
        });
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = BackgroundLineConfigEntity_.__INSTANCE;
        defaultBackgroundLineConfig = new RelationInfo<>(headerEntity_, backgroundLineConfigEntity_, property12, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<BackgroundLineConfigEntity> getToOne(HeaderEntity headerEntity) {
                return headerEntity.defaultBackgroundLineConfig;
            }
        });
        lastBackgroundLineConfig = new RelationInfo<>(headerEntity_, backgroundLineConfigEntity_, property13, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<BackgroundLineConfigEntity> getToOne(HeaderEntity headerEntity) {
                return headerEntity.lastBackgroundLineConfig;
            }
        });
        AuthorEntity_ authorEntity_ = AuthorEntity_.__INSTANCE;
        author = new RelationInfo<>(headerEntity_, authorEntity_, property14, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.4
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<AuthorEntity> getToOne(HeaderEntity headerEntity) {
                return headerEntity.author;
            }
        });
        moveConfig = new RelationInfo<>(headerEntity_, MoveConfigEntity_.__INSTANCE, property15, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<MoveConfigEntity> getToOne(HeaderEntity headerEntity) {
                return headerEntity.moveConfig;
            }
        });
        provider = new RelationInfo<>(headerEntity_, authorEntity_, new ToManyGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            public List<AuthorEntity> getToMany(HeaderEntity headerEntity) {
                return headerEntity.provider;
            }
        }, 9);
    }

    @Override // io.objectbox.EntityInfo
    public Property<HeaderEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "HeaderEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<HeaderEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 6;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "HeaderEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<HeaderEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
