package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AuthorEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class AuthorEntity_ implements EntityInfo<AuthorEntity> {
    public static final Property<AuthorEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "AuthorEntity";
    public static final int __ENTITY_ID = 19;
    public static final String __ENTITY_NAME = "AuthorEntity";
    public static final Property<AuthorEntity> __ID_PROPERTY;
    public static final AuthorEntity_ __INSTANCE;
    public static final Property<AuthorEntity> authorId;
    public static final Property<AuthorEntity> authorName;
    public static final Property<AuthorEntity> duration;

    /* renamed from: id */
    public static final Property<AuthorEntity> f5197id;
    public static final Property<AuthorEntity> schoolId;
    public static final Property<AuthorEntity> startTime;
    public static final Property<AuthorEntity> url;
    public static final Class<AuthorEntity> __ENTITY_CLASS = AuthorEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new AuthorEntityCursor.Factory();

    @Internal
    static final AuthorEntityIdGetter __ID_GETTER = new AuthorEntityIdGetter();

    @Internal
    public static final class AuthorEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(AuthorEntity authorEntity) {
            return authorEntity.getId();
        }
    }

    static {
        AuthorEntity_ authorEntity_ = new AuthorEntity_();
        __INSTANCE = authorEntity_;
        Property<AuthorEntity> property = new Property<>(authorEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f5197id = property;
        Property<AuthorEntity> property2 = new Property<>(authorEntity_, 1, 2, String.class, "authorName");
        authorName = property2;
        Property<AuthorEntity> property3 = new Property<>(authorEntity_, 2, 3, String.class, "authorId");
        authorId = property3;
        Property<AuthorEntity> property4 = new Property<>(authorEntity_, 3, 4, String.class, "schoolId");
        schoolId = property4;
        Property<AuthorEntity> property5 = new Property<>(authorEntity_, 4, 5, String.class, "url");
        url = property5;
        Property<AuthorEntity> property6 = new Property<>(authorEntity_, 5, 6, Long.class, "startTime");
        startTime = property6;
        Property<AuthorEntity> property7 = new Property<>(authorEntity_, 6, 8, Long.class, TypedValues.TransitionType.S_DURATION);
        duration = property7;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7};
        __ID_PROPERTY = property;
    }

    @Override // io.objectbox.EntityInfo
    public Property<AuthorEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "AuthorEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<AuthorEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 19;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "AuthorEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<AuthorEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
