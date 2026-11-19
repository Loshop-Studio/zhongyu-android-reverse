package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TextRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class TextRecordEntity_ implements EntityInfo<TextRecordEntity> {

    /* renamed from: a */
    public static final Class f8877a = TextRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8878b = new TextRecordEntityCursor.C7039a();

    /* renamed from: c */
    public static final C7042a f8879c = new C7042a();

    /* renamed from: d */
    public static final TextRecordEntity_ f8880d;

    /* renamed from: e */
    public static final Property f8881e;

    /* renamed from: f */
    public static final Property f8882f;

    /* renamed from: g */
    public static final Property f8883g;

    /* renamed from: h */
    public static final Property f8884h;

    /* renamed from: i */
    public static final Property[] f8885i;

    /* renamed from: j */
    public static final Property f8886j;

    /* renamed from: k */
    public static final RelationInfo f8887k;

    /* renamed from: l */
    public static final RelationInfo f8888l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntity_$a */
    public static final class C7042a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(TextRecordEntity textRecordEntity) {
            return textRecordEntity.getId();
        }
    }

    static {
        TextRecordEntity_ textRecordEntity_ = new TextRecordEntity_();
        f8880d = textRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textRecordEntity_, 0, 1, cls, "id", true, "id");
        f8881e = property;
        Property property2 = new Property(textRecordEntity_, 1, 2, String.class, "fileName");
        f8882f = property2;
        Property property3 = new Property(textRecordEntity_, 2, 3, String.class, "validate");
        f8883g = property3;
        Property property4 = new Property(textRecordEntity_, 3, 4, cls, "recordId", true);
        f8884h = property4;
        f8885i = new Property[]{property, property2, property3, property4};
        f8886j = property;
        f8887k = new RelationInfo(textRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f8888l = new RelationInfo(textRecordEntity_, TextInfoEntity_.f8861d, new ToManyGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(TextRecordEntity textRecordEntity) {
                return textRecordEntity.textInfoEntityList;
            }
        }, 2);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8885i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8877a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8878b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 2;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8879c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "TextRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "TextRecordEntity";
    }
}
