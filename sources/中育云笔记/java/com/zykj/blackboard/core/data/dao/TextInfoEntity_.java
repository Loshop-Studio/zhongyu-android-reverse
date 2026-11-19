package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TextInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class TextInfoEntity_ implements EntityInfo<TextInfoEntity> {

    /* renamed from: c */
    public static final Class f18419c = TextInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18420d = new TextInfoEntityCursor.C8416a();

    /* renamed from: e */
    public static final C8418a f18421e = new C8418a();

    /* renamed from: f */
    public static final TextInfoEntity_ f18422f;

    /* renamed from: g */
    public static final Property f18423g;

    /* renamed from: h */
    public static final Property f18424h;

    /* renamed from: i */
    public static final Property f18425i;

    /* renamed from: j */
    public static final Property f18426j;

    /* renamed from: k */
    public static final Property f18427k;

    /* renamed from: l */
    public static final Property f18428l;

    /* renamed from: m */
    public static final Property f18429m;

    /* renamed from: n */
    public static final Property[] f18430n;

    /* renamed from: o */
    public static final Property f18431o;

    /* renamed from: p */
    public static final RelationInfo f18432p;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntity_$a */
    public static final class C8418a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(TextInfoEntity textInfoEntity) {
            return textInfoEntity.m14289c();
        }
    }

    static {
        TextInfoEntity_ textInfoEntity_ = new TextInfoEntity_();
        f18422f = textInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18423g = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(textInfoEntity_, 1, 2, cls2, "width");
        f18424h = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(textInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f18425i = property3;
        Property property4 = new Property(textInfoEntity_, 3, 4, cls2, "textSize");
        f18426j = property4;
        Property property5 = new Property(textInfoEntity_, 4, 5, cls3, "style");
        f18427k = property5;
        Property property6 = new Property(textInfoEntity_, 5, 6, String.class, "content");
        f18428l = property6;
        Property property7 = new Property(textInfoEntity_, 6, 7, cls, "recordId", true);
        f18429m = property7;
        f18430n = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f18431o = property;
        f18432p = new RelationInfo(textInfoEntity_, TextRecordEntity_.f18441f, property7, new ToOneGetter<TextInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TextInfoEntity textInfoEntity) {
                return textInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "TextInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18430n;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18419c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18420d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 11;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18421e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "TextInfoEntity";
    }
}
