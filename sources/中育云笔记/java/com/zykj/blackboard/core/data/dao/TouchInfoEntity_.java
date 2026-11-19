package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class TouchInfoEntity_ implements EntityInfo<TouchInfoEntity> {

    /* renamed from: c */
    public static final Class f18483c = TouchInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18484d = new TouchInfoEntityCursor.C8427a();

    /* renamed from: e */
    public static final C8429a f18485e = new C8429a();

    /* renamed from: f */
    public static final TouchInfoEntity_ f18486f;

    /* renamed from: g */
    public static final Property f18487g;

    /* renamed from: h */
    public static final Property f18488h;

    /* renamed from: i */
    public static final Property f18489i;

    /* renamed from: j */
    public static final Property f18490j;

    /* renamed from: k */
    public static final Property f18491k;

    /* renamed from: l */
    public static final Property[] f18492l;

    /* renamed from: m */
    public static final Property f18493m;

    /* renamed from: n */
    public static final RelationInfo f18494n;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntity_$a */
    public static final class C8429a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(TouchInfoEntity touchInfoEntity) {
            return touchInfoEntity.m14332b();
        }
    }

    static {
        TouchInfoEntity_ touchInfoEntity_ = new TouchInfoEntity_();
        f18486f = touchInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18487g = property;
        Property property2 = new Property(touchInfoEntity_, 1, 2, cls, "eventTime");
        f18488h = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(touchInfoEntity_, 2, 3, cls2, "x");
        f18489i = property3;
        Property property4 = new Property(touchInfoEntity_, 3, 4, cls2, "y");
        f18490j = property4;
        Property property5 = new Property(touchInfoEntity_, 4, 6, cls, "recordId", true);
        f18491k = property5;
        f18492l = new Property[]{property, property2, property3, property4, property5};
        f18493m = property;
        f18494n = new RelationInfo(touchInfoEntity_, TouchEventEntity_.f18462f, property5, new ToOneGetter<TouchInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TouchInfoEntity touchInfoEntity) {
                return touchInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "TouchInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18492l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18483c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18484d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 13;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18485e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "TouchInfoEntity";
    }
}
