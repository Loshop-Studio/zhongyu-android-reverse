package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class GeometryPointFEntity_ implements EntityInfo<GeometryPointFEntity> {

    /* renamed from: c */
    public static final Class f18210c = GeometryPointFEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18211d = new GeometryPointFEntityCursor.C8366a();

    /* renamed from: e */
    public static final C8368a f18212e = new C8368a();

    /* renamed from: f */
    public static final GeometryPointFEntity_ f18213f;

    /* renamed from: g */
    public static final Property f18214g;

    /* renamed from: h */
    public static final Property f18215h;

    /* renamed from: i */
    public static final Property f18216i;

    /* renamed from: j */
    public static final Property f18217j;

    /* renamed from: k */
    public static final Property[] f18218k;

    /* renamed from: l */
    public static final Property f18219l;

    /* renamed from: m */
    public static final RelationInfo f18220m;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_$a */
    public static final class C8368a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(GeometryPointFEntity geometryPointFEntity) {
            return geometryPointFEntity.m14120a();
        }
    }

    static {
        GeometryPointFEntity_ geometryPointFEntity_ = new GeometryPointFEntity_();
        f18213f = geometryPointFEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryPointFEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18214g = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryPointFEntity_, 1, 2, cls2, "x");
        f18215h = property2;
        Property property3 = new Property(geometryPointFEntity_, 2, 3, cls2, "y");
        f18216i = property3;
        Property property4 = new Property(geometryPointFEntity_, 3, 4, cls, "recordId", true);
        f18217j = property4;
        f18218k = new Property[]{property, property2, property3, property4};
        f18219l = property;
        f18220m = new RelationInfo(geometryPointFEntity_, GeometryInfoEntity_.f18191f, property4, new ToOneGetter<GeometryPointFEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(GeometryPointFEntity geometryPointFEntity) {
                return geometryPointFEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "GeometryPointFEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18218k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18210c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18211d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 23;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18212e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "GeometryPointFEntity";
    }
}
