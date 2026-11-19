package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AuthorEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class AuthorEntity_ implements EntityInfo<AuthorEntity> {

    /* renamed from: c */
    public static final Class f18060c = AuthorEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18061d = new AuthorEntityCursor.C8340a();

    /* renamed from: e */
    public static final C8341a f18062e = new C8341a();

    /* renamed from: f */
    public static final AuthorEntity_ f18063f;

    /* renamed from: g */
    public static final Property f18064g;

    /* renamed from: h */
    public static final Property f18065h;

    /* renamed from: i */
    public static final Property f18066i;

    /* renamed from: j */
    public static final Property f18067j;

    /* renamed from: k */
    public static final Property f18068k;

    /* renamed from: l */
    public static final Property f18069l;

    /* renamed from: m */
    public static final Property f18070m;

    /* renamed from: n */
    public static final Property[] f18071n;

    /* renamed from: o */
    public static final Property f18072o;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntity_$a */
    public static final class C8341a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(AuthorEntity authorEntity) {
            return authorEntity.m14020d();
        }
    }

    static {
        AuthorEntity_ authorEntity_ = new AuthorEntity_();
        f18063f = authorEntity_;
        Property property = new Property(authorEntity_, 0, 1, Long.TYPE, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18064g = property;
        Property property2 = new Property(authorEntity_, 1, 2, String.class, "authorName");
        f18065h = property2;
        Property property3 = new Property(authorEntity_, 2, 3, String.class, "authorId");
        f18066i = property3;
        Property property4 = new Property(authorEntity_, 3, 4, String.class, "schoolId");
        f18067j = property4;
        Property property5 = new Property(authorEntity_, 4, 5, String.class, "url");
        f18068k = property5;
        Property property6 = new Property(authorEntity_, 5, 6, Long.class, "startTime");
        f18069l = property6;
        Property property7 = new Property(authorEntity_, 6, 8, Long.class, TypedValues.TransitionType.S_DURATION);
        f18070m = property7;
        f18071n = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f18072o = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "AuthorEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18071n;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18060c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18061d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 19;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18062e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "AuthorEntity";
    }
}
