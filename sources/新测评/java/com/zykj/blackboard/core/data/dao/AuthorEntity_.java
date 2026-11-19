package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AuthorEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class AuthorEntity_ implements EntityInfo<AuthorEntity> {

    /* renamed from: a */
    public static final Class f7217a = AuthorEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7218b = new AuthorEntityCursor.C6643a();

    /* renamed from: c */
    public static final C6644a f7219c = new C6644a();

    /* renamed from: d */
    public static final AuthorEntity_ f7220d;

    /* renamed from: e */
    public static final Property f7221e;

    /* renamed from: f */
    public static final Property f7222f;

    /* renamed from: g */
    public static final Property f7223g;

    /* renamed from: h */
    public static final Property f7224h;

    /* renamed from: i */
    public static final Property f7225i;

    /* renamed from: j */
    public static final Property f7226j;

    /* renamed from: k */
    public static final Property f7227k;

    /* renamed from: l */
    public static final Property[] f7228l;

    /* renamed from: m */
    public static final Property f7229m;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntity_$a */
    public static final class C6644a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(AuthorEntity authorEntity) {
            return authorEntity.getId();
        }
    }

    static {
        AuthorEntity_ authorEntity_ = new AuthorEntity_();
        f7220d = authorEntity_;
        Property property = new Property(authorEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f7221e = property;
        Property property2 = new Property(authorEntity_, 1, 2, String.class, "authorName");
        f7222f = property2;
        Property property3 = new Property(authorEntity_, 2, 3, String.class, "authorId");
        f7223g = property3;
        Property property4 = new Property(authorEntity_, 3, 4, String.class, "schoolId");
        f7224h = property4;
        Property property5 = new Property(authorEntity_, 4, 5, String.class, "url");
        f7225i = property5;
        Property property6 = new Property(authorEntity_, 5, 6, Long.class, "startTime");
        f7226j = property6;
        Property property7 = new Property(authorEntity_, 6, 8, Long.class, TypedValues.TransitionType.S_DURATION);
        f7227k = property7;
        f7228l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f7229m = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7228l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7217a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7218b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 19;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7219c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "AuthorEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "AuthorEntity";
    }
}
