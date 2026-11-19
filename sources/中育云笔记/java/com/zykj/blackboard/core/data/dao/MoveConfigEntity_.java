package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class MoveConfigEntity_ implements EntityInfo<MoveConfigEntity> {

    /* renamed from: c */
    public static final Class f18352c = MoveConfigEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18353d = new MoveConfigEntityCursor.C8392a();

    /* renamed from: e */
    public static final C8393a f18354e = new C8393a();

    /* renamed from: f */
    public static final MoveConfigEntity_ f18355f;

    /* renamed from: g */
    public static final Property f18356g;

    /* renamed from: h */
    public static final Property f18357h;

    /* renamed from: i */
    public static final Property f18358i;

    /* renamed from: j */
    public static final Property f18359j;

    /* renamed from: k */
    public static final Property f18360k;

    /* renamed from: l */
    public static final Property f18361l;

    /* renamed from: m */
    public static final Property f18362m;

    /* renamed from: n */
    public static final Property f18363n;

    /* renamed from: o */
    public static final Property[] f18364o;

    /* renamed from: p */
    public static final Property f18365p;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntity_$a */
    public static final class C8393a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(MoveConfigEntity moveConfigEntity) {
            return moveConfigEntity.m14223b();
        }
    }

    static {
        MoveConfigEntity_ moveConfigEntity_ = new MoveConfigEntity_();
        f18355f = moveConfigEntity_;
        Property property = new Property(moveConfigEntity_, 0, 1, Long.TYPE, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18356g = property;
        Class cls = Boolean.TYPE;
        Property property2 = new Property(moveConfigEntity_, 1, 2, cls, "isEnable");
        f18357h = property2;
        Property property3 = new Property(moveConfigEntity_, 2, 3, cls, "verticalTranslate");
        f18358i = property3;
        Property property4 = new Property(moveConfigEntity_, 3, 4, cls, "horizontalTranslate");
        f18359j = property4;
        Property property5 = new Property(moveConfigEntity_, 4, 5, cls, "scale");
        f18360k = property5;
        Property property6 = new Property(moveConfigEntity_, 5, 6, cls, "rotate");
        f18361l = property6;
        Class cls2 = Integer.TYPE;
        Property property7 = new Property(moveConfigEntity_, 6, 7, cls2, "maxHeightTimes");
        f18362m = property7;
        Property property8 = new Property(moveConfigEntity_, 7, 8, cls2, "maxWidthTimes");
        f18363n = property8;
        f18364o = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f18365p = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "MoveConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18364o;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18352c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18353d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 20;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18354e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "MoveConfigEntity";
    }
}
