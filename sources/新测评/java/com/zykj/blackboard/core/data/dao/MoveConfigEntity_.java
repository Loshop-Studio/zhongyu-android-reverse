package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class MoveConfigEntity_ implements EntityInfo<MoveConfigEntity> {

    /* renamed from: a */
    public static final Class f7509a = MoveConfigEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7510b = new MoveConfigEntityCursor.C6695a();

    /* renamed from: c */
    public static final C6696a f7511c = new C6696a();

    /* renamed from: d */
    public static final MoveConfigEntity_ f7512d;

    /* renamed from: e */
    public static final Property f7513e;

    /* renamed from: f */
    public static final Property f7514f;

    /* renamed from: g */
    public static final Property f7515g;

    /* renamed from: h */
    public static final Property f7516h;

    /* renamed from: i */
    public static final Property f7517i;

    /* renamed from: j */
    public static final Property f7518j;

    /* renamed from: k */
    public static final Property f7519k;

    /* renamed from: l */
    public static final Property f7520l;

    /* renamed from: m */
    public static final Property[] f7521m;

    /* renamed from: n */
    public static final Property f7522n;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntity_$a */
    public static final class C6696a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(MoveConfigEntity moveConfigEntity) {
            return moveConfigEntity.getId();
        }
    }

    static {
        MoveConfigEntity_ moveConfigEntity_ = new MoveConfigEntity_();
        f7512d = moveConfigEntity_;
        Property property = new Property(moveConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f7513e = property;
        Class cls = Boolean.TYPE;
        Property property2 = new Property(moveConfigEntity_, 1, 2, cls, "isEnable");
        f7514f = property2;
        Property property3 = new Property(moveConfigEntity_, 2, 3, cls, "verticalTranslate");
        f7515g = property3;
        Property property4 = new Property(moveConfigEntity_, 3, 4, cls, "horizontalTranslate");
        f7516h = property4;
        Property property5 = new Property(moveConfigEntity_, 4, 5, cls, "scale");
        f7517i = property5;
        Property property6 = new Property(moveConfigEntity_, 5, 6, cls, "rotate");
        f7518j = property6;
        Class cls2 = Integer.TYPE;
        Property property7 = new Property(moveConfigEntity_, 6, 7, cls2, "maxHeightTimes");
        f7519k = property7;
        Property property8 = new Property(moveConfigEntity_, 7, 8, cls2, "maxWidthTimes");
        f7520l = property8;
        f7521m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f7522n = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7521m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7509a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7510b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 20;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7511c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "MoveConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "MoveConfigEntity";
    }
}
