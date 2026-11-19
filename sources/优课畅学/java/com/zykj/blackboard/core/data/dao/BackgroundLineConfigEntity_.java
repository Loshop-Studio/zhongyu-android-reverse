package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntity_ implements EntityInfo<BackgroundLineConfigEntity> {
    public static final Property<BackgroundLineConfigEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "BackgroundLineConfigEntity";
    public static final int __ENTITY_ID = 24;
    public static final String __ENTITY_NAME = "BackgroundLineConfigEntity";
    public static final Property<BackgroundLineConfigEntity> __ID_PROPERTY;
    public static final BackgroundLineConfigEntity_ __INSTANCE;

    /* renamed from: id */
    public static final Property<BackgroundLineConfigEntity> f8715id;
    public static final Property<BackgroundLineConfigEntity> lineColor;
    public static final Property<BackgroundLineConfigEntity> lineSpace;
    public static final Property<BackgroundLineConfigEntity> lineType;
    public static final Property<BackgroundLineConfigEntity> lineWidth;
    public static final Class<BackgroundLineConfigEntity> __ENTITY_CLASS = BackgroundLineConfigEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new BackgroundLineConfigEntityCursor.Factory();
    static final BackgroundLineConfigEntityIdGetter __ID_GETTER = new BackgroundLineConfigEntityIdGetter();

    public static final class BackgroundLineConfigEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(BackgroundLineConfigEntity backgroundLineConfigEntity) {
            return backgroundLineConfigEntity.getId();
        }
    }

    static {
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = new BackgroundLineConfigEntity_();
        __INSTANCE = backgroundLineConfigEntity_;
        Property<BackgroundLineConfigEntity> property = new Property<>(backgroundLineConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8715id = property;
        Class cls = Integer.TYPE;
        Property<BackgroundLineConfigEntity> property2 = new Property<>(backgroundLineConfigEntity_, 1, 2, cls, "lineColor");
        lineColor = property2;
        Class cls2 = Float.TYPE;
        Property<BackgroundLineConfigEntity> property3 = new Property<>(backgroundLineConfigEntity_, 2, 3, cls2, "lineSpace");
        lineSpace = property3;
        Property<BackgroundLineConfigEntity> property4 = new Property<>(backgroundLineConfigEntity_, 3, 4, cls, "lineType", false, "lineType", BackgroundLineTypeEnumConverter.class, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.class);
        lineType = property4;
        Property<BackgroundLineConfigEntity> property5 = new Property<>(backgroundLineConfigEntity_, 4, 5, cls2, "lineWidth");
        lineWidth = property5;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5};
        __ID_PROPERTY = property;
    }

    @Override // io.objectbox.EntityInfo
    public Property<BackgroundLineConfigEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "BackgroundLineConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<BackgroundLineConfigEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 24;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "BackgroundLineConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<BackgroundLineConfigEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
