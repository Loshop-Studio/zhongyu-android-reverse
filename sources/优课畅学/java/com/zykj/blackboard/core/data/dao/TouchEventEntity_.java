package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TouchEventEntityCursor;
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
public final class TouchEventEntity_ implements EntityInfo<TouchEventEntity> {
    public static final Property<TouchEventEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "TouchEventEntity";
    public static final int __ENTITY_ID = 4;
    public static final String __ENTITY_NAME = "TouchEventEntity";
    public static final Property<TouchEventEntity> __ID_PROPERTY;
    public static final TouchEventEntity_ __INSTANCE;
    public static final Property<TouchEventEntity> color;

    /* renamed from: id */
    public static final Property<TouchEventEntity> f8755id;
    public static final Property<TouchEventEntity> itemLength;
    public static final RelationInfo<TouchEventEntity, TouchRecordEntity> record;
    public static final Property<TouchEventEntity> recordId;
    public static final Property<TouchEventEntity> spacing;
    public static final Property<TouchEventEntity> style;
    public static final Property<TouchEventEntity> textSize;
    public static final RelationInfo<TouchEventEntity, TouchInfoEntity> touchInfoList;
    public static final Property<TouchEventEntity> width;
    public static final Class<TouchEventEntity> __ENTITY_CLASS = TouchEventEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new TouchEventEntityCursor.Factory();
    static final TouchEventEntityIdGetter __ID_GETTER = new TouchEventEntityIdGetter();

    public static final class TouchEventEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(TouchEventEntity touchEventEntity) {
            return touchEventEntity.getId();
        }
    }

    static {
        TouchEventEntity_ touchEventEntity_ = new TouchEventEntity_();
        __INSTANCE = touchEventEntity_;
        Class cls = Long.TYPE;
        Property<TouchEventEntity> property = new Property<>(touchEventEntity_, 0, 1, cls, "id", true, "id");
        f8755id = property;
        Class cls2 = Float.TYPE;
        Property<TouchEventEntity> property2 = new Property<>(touchEventEntity_, 1, 2, cls2, "width");
        width = property2;
        Class cls3 = Integer.TYPE;
        Property<TouchEventEntity> property3 = new Property<>(touchEventEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        color = property3;
        Property<TouchEventEntity> property4 = new Property<>(touchEventEntity_, 3, 4, cls2, "spacing");
        spacing = property4;
        Property<TouchEventEntity> property5 = new Property<>(touchEventEntity_, 4, 5, cls2, "itemLength");
        itemLength = property5;
        Property<TouchEventEntity> property6 = new Property<>(touchEventEntity_, 5, 6, cls3, "style");
        style = property6;
        Property<TouchEventEntity> property7 = new Property<>(touchEventEntity_, 6, 7, cls2, "textSize");
        textSize = property7;
        Property<TouchEventEntity> property8 = new Property<>(touchEventEntity_, 7, 8, cls, "recordId", true);
        recordId = property8;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(touchEventEntity_, TouchRecordEntity_.__INSTANCE, property8, new ToOneGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<TouchRecordEntity> getToOne(TouchEventEntity touchEventEntity) {
                return touchEventEntity.record;
            }
        });
        touchInfoList = new RelationInfo<>(touchEventEntity_, TouchInfoEntity_.__INSTANCE, new ToManyGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<TouchInfoEntity> getToMany(TouchEventEntity touchEventEntity) {
                return touchEventEntity.touchInfoList;
            }
        }, 7);
    }

    @Override // io.objectbox.EntityInfo
    public Property<TouchEventEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "TouchEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<TouchEventEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 4;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "TouchEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<TouchEventEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
