package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TextInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

/* loaded from: classes3.dex */
public final class TextInfoEntity_ implements EntityInfo<TextInfoEntity> {
    public static final Property<TextInfoEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "TextInfoEntity";
    public static final int __ENTITY_ID = 11;
    public static final String __ENTITY_NAME = "TextInfoEntity";
    public static final Property<TextInfoEntity> __ID_PROPERTY;
    public static final TextInfoEntity_ __INSTANCE;
    public static final Property<TextInfoEntity> color;
    public static final Property<TextInfoEntity> content;

    /* renamed from: id */
    public static final Property<TextInfoEntity> f5235id;
    public static final RelationInfo<TextInfoEntity, TextRecordEntity> record;
    public static final Property<TextInfoEntity> recordId;
    public static final Property<TextInfoEntity> style;
    public static final Property<TextInfoEntity> textSize;
    public static final Property<TextInfoEntity> width;
    public static final Class<TextInfoEntity> __ENTITY_CLASS = TextInfoEntity.class;
    public static final InterfaceC6109a __CURSOR_FACTORY = new TextInfoEntityCursor.Factory();

    @Internal
    static final TextInfoEntityIdGetter __ID_GETTER = new TextInfoEntityIdGetter();

    @Internal
    public static final class TextInfoEntityIdGetter implements InterfaceC6110b {
        @Override // p116m5.InterfaceC6110b
        public long getId(TextInfoEntity textInfoEntity) {
            return textInfoEntity.getId();
        }
    }

    static {
        TextInfoEntity_ textInfoEntity_ = new TextInfoEntity_();
        __INSTANCE = textInfoEntity_;
        Class cls = Long.TYPE;
        Property<TextInfoEntity> property = new Property<>(textInfoEntity_, 0, 1, cls, "id", true, "id");
        f5235id = property;
        Class cls2 = Float.TYPE;
        Property<TextInfoEntity> property2 = new Property<>(textInfoEntity_, 1, 2, cls2, "width");
        width = property2;
        Class cls3 = Integer.TYPE;
        Property<TextInfoEntity> property3 = new Property<>(textInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        color = property3;
        Property<TextInfoEntity> property4 = new Property<>(textInfoEntity_, 3, 4, cls2, "textSize");
        textSize = property4;
        Property<TextInfoEntity> property5 = new Property<>(textInfoEntity_, 4, 5, cls3, "style");
        style = property5;
        Property<TextInfoEntity> property6 = new Property<>(textInfoEntity_, 5, 6, String.class, "content");
        content = property6;
        Property<TextInfoEntity> property7 = new Property<>(textInfoEntity_, 6, 7, cls, "recordId", true);
        recordId = property7;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4, property5, property6, property7};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(textInfoEntity_, TextRecordEntity_.__INSTANCE, property7, new ToOneGetter<TextInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<TextRecordEntity> getToOne(TextInfoEntity textInfoEntity) {
                return textInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    public Property<TextInfoEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6109a getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "TextInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<TextInfoEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 11;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "TextInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC6110b getIdGetter() {
        return __ID_GETTER;
    }

    @Override // io.objectbox.EntityInfo
    public Property<TextInfoEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
