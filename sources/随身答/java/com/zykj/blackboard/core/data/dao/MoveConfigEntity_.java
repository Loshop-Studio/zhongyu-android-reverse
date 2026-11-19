package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class MoveConfigEntity_ implements EntityInfo<MoveConfigEntity> {

    /* renamed from: a */
    public static final Class f8791a = MoveConfigEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8792b = new MoveConfigEntityCursor.C7012a();

    /* renamed from: c */
    public static final C7013a f8793c = new C7013a();

    /* renamed from: d */
    public static final MoveConfigEntity_ f8794d;

    /* renamed from: e */
    public static final Property f8795e;

    /* renamed from: f */
    public static final Property f8796f;

    /* renamed from: g */
    public static final Property f8797g;

    /* renamed from: h */
    public static final Property f8798h;

    /* renamed from: i */
    public static final Property f8799i;

    /* renamed from: j */
    public static final Property f8800j;

    /* renamed from: k */
    public static final Property f8801k;

    /* renamed from: l */
    public static final Property f8802l;

    /* renamed from: m */
    public static final Property[] f8803m;

    /* renamed from: n */
    public static final Property f8804n;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntity_$a */
    public static final class C7013a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(MoveConfigEntity moveConfigEntity) {
            return moveConfigEntity.getId();
        }
    }

    static {
        MoveConfigEntity_ moveConfigEntity_ = new MoveConfigEntity_();
        f8794d = moveConfigEntity_;
        Property property = new Property(moveConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8795e = property;
        Class cls = Boolean.TYPE;
        Property property2 = new Property(moveConfigEntity_, 1, 2, cls, "isEnable");
        f8796f = property2;
        Property property3 = new Property(moveConfigEntity_, 2, 3, cls, "verticalTranslate");
        f8797g = property3;
        Property property4 = new Property(moveConfigEntity_, 3, 4, cls, "horizontalTranslate");
        f8798h = property4;
        Property property5 = new Property(moveConfigEntity_, 4, 5, cls, "scale");
        f8799i = property5;
        Property property6 = new Property(moveConfigEntity_, 5, 6, cls, "rotate");
        f8800j = property6;
        Class cls2 = Integer.TYPE;
        Property property7 = new Property(moveConfigEntity_, 6, 7, cls2, "maxHeightTimes");
        f8801k = property7;
        Property property8 = new Property(moveConfigEntity_, 7, 8, cls2, "maxWidthTimes");
        f8802l = property8;
        f8803m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f8804n = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8803m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8791a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8792b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 20;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8793c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "MoveConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "MoveConfigEntity";
    }
}
