package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TextRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class TextRecordEntity_ implements EntityInfo<TextRecordEntity> {

    /* renamed from: c */
    public static final Class f18438c = TextRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18439d = new TextRecordEntityCursor.C8419a();

    /* renamed from: e */
    public static final C8422a f18440e = new C8422a();

    /* renamed from: f */
    public static final TextRecordEntity_ f18441f;

    /* renamed from: g */
    public static final Property f18442g;

    /* renamed from: h */
    public static final Property f18443h;

    /* renamed from: i */
    public static final Property f18444i;

    /* renamed from: j */
    public static final Property f18445j;

    /* renamed from: k */
    public static final Property[] f18446k;

    /* renamed from: l */
    public static final Property f18447l;

    /* renamed from: m */
    public static final RelationInfo f18448m;

    /* renamed from: n */
    public static final RelationInfo f18449n;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntity_$a */
    public static final class C8422a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(TextRecordEntity textRecordEntity) {
            return textRecordEntity.m14302b();
        }
    }

    static {
        TextRecordEntity_ textRecordEntity_ = new TextRecordEntity_();
        f18441f = textRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18442g = property;
        Property property2 = new Property(textRecordEntity_, 1, 2, String.class, "fileName");
        f18443h = property2;
        Property property3 = new Property(textRecordEntity_, 2, 3, String.class, "validate");
        f18444i = property3;
        Property property4 = new Property(textRecordEntity_, 3, 4, cls, "recordId", true);
        f18445j = property4;
        f18446k = new Property[]{property, property2, property3, property4};
        f18447l = property;
        f18448m = new RelationInfo(textRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f18449n = new RelationInfo(textRecordEntity_, TextInfoEntity_.f18422f, new ToManyGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(TextRecordEntity textRecordEntity) {
                return textRecordEntity.textInfoEntityList;
            }
        }, 2);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "TextRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18446k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18438c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18439d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 2;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18440e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "TextRecordEntity";
    }
}
