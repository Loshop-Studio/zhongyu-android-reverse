package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AuthorEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class AuthorEntity_ implements EntityInfo<AuthorEntity> {

    /* renamed from: a */
    public static final Class f8499a = AuthorEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8500b = new AuthorEntityCursor.C6960a();

    /* renamed from: c */
    public static final C6961a f8501c = new C6961a();

    /* renamed from: d */
    public static final AuthorEntity_ f8502d;

    /* renamed from: e */
    public static final Property f8503e;

    /* renamed from: f */
    public static final Property f8504f;

    /* renamed from: g */
    public static final Property f8505g;

    /* renamed from: h */
    public static final Property f8506h;

    /* renamed from: i */
    public static final Property f8507i;

    /* renamed from: j */
    public static final Property f8508j;

    /* renamed from: k */
    public static final Property f8509k;

    /* renamed from: l */
    public static final Property[] f8510l;

    /* renamed from: m */
    public static final Property f8511m;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntity_$a */
    public static final class C6961a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(AuthorEntity authorEntity) {
            return authorEntity.getId();
        }
    }

    static {
        AuthorEntity_ authorEntity_ = new AuthorEntity_();
        f8502d = authorEntity_;
        Property property = new Property(authorEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8503e = property;
        Property property2 = new Property(authorEntity_, 1, 2, String.class, "authorName");
        f8504f = property2;
        Property property3 = new Property(authorEntity_, 2, 3, String.class, "authorId");
        f8505g = property3;
        Property property4 = new Property(authorEntity_, 3, 4, String.class, "schoolId");
        f8506h = property4;
        Property property5 = new Property(authorEntity_, 4, 5, String.class, "url");
        f8507i = property5;
        Property property6 = new Property(authorEntity_, 5, 6, Long.class, "startTime");
        f8508j = property6;
        Property property7 = new Property(authorEntity_, 6, 8, Long.class, TypedValues.TransitionType.S_DURATION);
        f8509k = property7;
        f8510l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f8511m = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8510l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8499a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8500b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 19;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8501c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "AuthorEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "AuthorEntity";
    }
}
