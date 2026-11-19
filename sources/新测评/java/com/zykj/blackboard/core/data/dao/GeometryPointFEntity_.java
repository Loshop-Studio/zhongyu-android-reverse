package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class GeometryPointFEntity_ implements EntityInfo<GeometryPointFEntity> {

    /* renamed from: a */
    public static final Class f7367a = GeometryPointFEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7368b = new GeometryPointFEntityCursor.C6669a();

    /* renamed from: c */
    public static final C6671a f7369c = new C6671a();

    /* renamed from: d */
    public static final GeometryPointFEntity_ f7370d;

    /* renamed from: e */
    public static final Property f7371e;

    /* renamed from: f */
    public static final Property f7372f;

    /* renamed from: g */
    public static final Property f7373g;

    /* renamed from: h */
    public static final Property f7374h;

    /* renamed from: i */
    public static final Property[] f7375i;

    /* renamed from: j */
    public static final Property f7376j;

    /* renamed from: k */
    public static final RelationInfo f7377k;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_$a */
    public static final class C6671a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(GeometryPointFEntity geometryPointFEntity) {
            return geometryPointFEntity.getId();
        }
    }

    static {
        GeometryPointFEntity_ geometryPointFEntity_ = new GeometryPointFEntity_();
        f7370d = geometryPointFEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryPointFEntity_, 0, 1, cls, "id", true, "id");
        f7371e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryPointFEntity_, 1, 2, cls2, "x");
        f7372f = property2;
        Property property3 = new Property(geometryPointFEntity_, 2, 3, cls2, "y");
        f7373g = property3;
        Property property4 = new Property(geometryPointFEntity_, 3, 4, cls, "recordId", true);
        f7374h = property4;
        f7375i = new Property[]{property, property2, property3, property4};
        f7376j = property;
        f7377k = new RelationInfo(geometryPointFEntity_, GeometryInfoEntity_.f7348d, property4, new ToOneGetter<GeometryPointFEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryPointFEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(GeometryPointFEntity geometryPointFEntity) {
                return geometryPointFEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7375i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7367a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7368b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 23;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7369c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "GeometryPointFEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "GeometryPointFEntity";
    }
}
