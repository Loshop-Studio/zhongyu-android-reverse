package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class GeometryPointFEntity_ implements EntityInfo<GeometryPointFEntity> {

    /* renamed from: a */
    public static final Class f8649a = GeometryPointFEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8650b = new GeometryPointFEntityCursor.C6986a();

    /* renamed from: c */
    public static final C6988a f8651c = new C6988a();

    /* renamed from: d */
    public static final GeometryPointFEntity_ f8652d;

    /* renamed from: e */
    public static final Property f8653e;

    /* renamed from: f */
    public static final Property f8654f;

    /* renamed from: g */
    public static final Property f8655g;

    /* renamed from: h */
    public static final Property f8656h;

    /* renamed from: i */
    public static final Property[] f8657i;

    /* renamed from: j */
    public static final Property f8658j;

    /* renamed from: k */
    public static final RelationInfo f8659k;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_$a */
    public static final class C6988a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(GeometryPointFEntity geometryPointFEntity) {
            return geometryPointFEntity.getId();
        }
    }

    static {
        GeometryPointFEntity_ geometryPointFEntity_ = new GeometryPointFEntity_();
        f8652d = geometryPointFEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryPointFEntity_, 0, 1, cls, "id", true, "id");
        f8653e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryPointFEntity_, 1, 2, cls2, "x");
        f8654f = property2;
        Property property3 = new Property(geometryPointFEntity_, 2, 3, cls2, "y");
        f8655g = property3;
        Property property4 = new Property(geometryPointFEntity_, 3, 4, cls, "recordId", true);
        f8656h = property4;
        f8657i = new Property[]{property, property2, property3, property4};
        f8658j = property;
        f8659k = new RelationInfo(geometryPointFEntity_, GeometryInfoEntity_.f8630d, property4, new ToOneGetter<GeometryPointFEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(GeometryPointFEntity geometryPointFEntity) {
                return geometryPointFEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8657i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8649a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8650b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 23;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8651c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "GeometryPointFEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "GeometryPointFEntity";
    }
}
