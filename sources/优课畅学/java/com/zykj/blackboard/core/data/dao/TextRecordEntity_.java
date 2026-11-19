package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TextRecordEntityCursor;
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
public final class TextRecordEntity_ implements EntityInfo<TextRecordEntity> {
    public static final Property<TextRecordEntity>[] __ALL_PROPERTIES;
    public static final String __DB_NAME = "TextRecordEntity";
    public static final int __ENTITY_ID = 2;
    public static final String __ENTITY_NAME = "TextRecordEntity";
    public static final Property<TextRecordEntity> __ID_PROPERTY;
    public static final TextRecordEntity_ __INSTANCE;
    public static final Property<TextRecordEntity> fileName;

    /* renamed from: id */
    public static final Property<TextRecordEntity> f8753id;
    public static final RelationInfo<TextRecordEntity, RecordEntity> record;
    public static final Property<TextRecordEntity> recordId;
    public static final RelationInfo<TextRecordEntity, TextInfoEntity> textInfoEntityList;
    public static final Property<TextRecordEntity> validate;
    public static final Class<TextRecordEntity> __ENTITY_CLASS = TextRecordEntity.class;
    public static final InterfaceC9429b __CURSOR_FACTORY = new TextRecordEntityCursor.Factory();
    static final TextRecordEntityIdGetter __ID_GETTER = new TextRecordEntityIdGetter();

    public static final class TextRecordEntityIdGetter implements InterfaceC9430c {
        @Override // p189n6.InterfaceC9430c
        public long getId(TextRecordEntity textRecordEntity) {
            return textRecordEntity.getId();
        }
    }

    static {
        TextRecordEntity_ textRecordEntity_ = new TextRecordEntity_();
        __INSTANCE = textRecordEntity_;
        Class cls = Long.TYPE;
        Property<TextRecordEntity> property = new Property<>(textRecordEntity_, 0, 1, cls, "id", true, "id");
        f8753id = property;
        Property<TextRecordEntity> property2 = new Property<>(textRecordEntity_, 1, 2, String.class, "fileName");
        fileName = property2;
        Property<TextRecordEntity> property3 = new Property<>(textRecordEntity_, 2, 3, String.class, "validate");
        validate = property3;
        Property<TextRecordEntity> property4 = new Property<>(textRecordEntity_, 3, 4, cls, "recordId", true);
        recordId = property4;
        __ALL_PROPERTIES = new Property[]{property, property2, property3, property4};
        __ID_PROPERTY = property;
        record = new RelationInfo<>(textRecordEntity_, RecordEntity_.__INSTANCE, property4, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            public ToOne<RecordEntity> getToOne(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        textInfoEntityList = new RelationInfo<>(textRecordEntity_, TextInfoEntity_.__INSTANCE, new ToManyGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            public List<TextInfoEntity> getToMany(TextRecordEntity textRecordEntity) {
                return textRecordEntity.textInfoEntityList;
            }
        }, 2);
    }

    @Override // io.objectbox.EntityInfo
    public Property<TextRecordEntity>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9429b getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Override // io.objectbox.EntityInfo
    public String getDbName() {
        return "TextRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public Class<TextRecordEntity> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override // io.objectbox.EntityInfo
    public int getEntityId() {
        return 2;
    }

    @Override // io.objectbox.EntityInfo
    public String getEntityName() {
        return "TextRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    public InterfaceC9430c getIdGetter() {
        return __ID_GETTER;
    }

    public Property<TextRecordEntity> getIdProperty() {
        return __ID_PROPERTY;
    }
}
