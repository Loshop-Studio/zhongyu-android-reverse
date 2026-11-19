package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes4.dex */
public final class MoveConfigEntity_ implements EntityInfo<MoveConfigEntity> {
    public static final Property<MoveConfigEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "MoveConfigEntity";
    public static final int __ENTITY_ID = 20;
    public static final String __ENTITY_NAME = "MoveConfigEntity";
    public static final Property<MoveConfigEntity> __ID_PROPERTY;
    public static final MoveConfigEntity_ __INSTANCE;
    public static final Property<MoveConfigEntity> horizontalTranslate;

    /* renamed from: id */
    public static final Property<MoveConfigEntity> f8745id;
    public static final Property<MoveConfigEntity> isEnable;
    public static final Property<MoveConfigEntity> maxHeightTimes;
    public static final Property<MoveConfigEntity> maxWidthTimes;
    public static final Property<MoveConfigEntity> rotate;
    public static final Property<MoveConfigEntity> scale;
    public static final Property<MoveConfigEntity> verticalTranslate;
    public static final Class<MoveConfigEntity> __ENTITY_CLASS = MoveConfigEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new MoveConfigEntityCursor.Factory();
    static final MoveConfigEntityIdGetter __ID_GETTER = new MoveConfigEntityIdGetter();

    public static final class MoveConfigEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(MoveConfigEntity moveConfigEntity) {
            return moveConfigEntity.getId();
        }
    }

    static {
        MoveConfigEntity_ moveConfigEntity_ = new MoveConfigEntity_();
        __INSTANCE = moveConfigEntity_;
        Property<MoveConfigEntity> property = new Property<>(moveConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8745id = property;
        Class cls = Boolean.TYPE;
        Property<MoveConfigEntity> property2 = new Property<>(moveConfigEntity_, 1, 2, cls, "isEnable");
        isEnable = property2;
        Property<MoveConfigEntity> property3 = new Property<>(moveConfigEntity_, 2, 3, cls, "verticalTranslate");
        verticalTranslate = property3;
        Property<MoveConfigEntity> property4 = new Property<>(moveConfigEntity_, 3, 4, cls, "horizontalTranslate");
        horizontalTranslate = property4;
        Property<MoveConfigEntity> property5 = new Property<>(moveConfigEntity_, 4, 5, cls, "scale");
        scale = property5;
        Property<MoveConfigEntity> property6 = new Property<>(moveConfigEntity_, 5, 6, cls, "rotate");
        rotate = property6;
        Class cls2 = Integer.TYPE;
        Property<MoveConfigEntity> property7 = new Property<>(moveConfigEntity_, 6, 7, cls2, "maxHeightTimes");
        maxHeightTimes = property7;
        Property<MoveConfigEntity> property8 = new Property<>(moveConfigEntity_, 7, 8, cls2, "maxWidthTimes");
        maxWidthTimes = property8;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        __ID_PROPERTY = property;
    }

    @Override // io.objectbox.EntityInfo
    public Property<MoveConfigEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "MoveConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<MoveConfigEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 20;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "MoveConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<MoveConfigEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
