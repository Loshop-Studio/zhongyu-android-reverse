package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class GeometryInfoEntity_ implements EntityInfo<GeometryInfoEntity> {

    /* renamed from: a */
    public static final Class f7345a = GeometryInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7346b = new GeometryInfoEntityCursor.C6665a();

    /* renamed from: c */
    public static final C6668a f7347c = new C6668a();

    /* renamed from: d */
    public static final GeometryInfoEntity_ f7348d;

    /* renamed from: e */
    public static final Property f7349e;

    /* renamed from: f */
    public static final Property f7350f;

    /* renamed from: g */
    public static final Property f7351g;

    /* renamed from: h */
    public static final Property f7352h;

    /* renamed from: i */
    public static final Property f7353i;

    /* renamed from: j */
    public static final Property f7354j;

    /* renamed from: k */
    public static final Property f7355k;

    /* renamed from: l */
    public static final Property[] f7356l;

    /* renamed from: m */
    public static final Property f7357m;

    /* renamed from: n */
    public static final RelationInfo f7358n;

    /* renamed from: o */
    public static final RelationInfo f7359o;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_$a */
    public static final class C6668a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(GeometryInfoEntity geometryInfoEntity) {
            return geometryInfoEntity.getId();
        }
    }

    static {
        GeometryInfoEntity_ geometryInfoEntity_ = new GeometryInfoEntity_();
        f7348d = geometryInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryInfoEntity_, 0, 1, cls, "id", true, "id");
        f7349e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryInfoEntity_, 1, 2, cls2, "width");
        f7350f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(geometryInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f7351g = property3;
        Property property4 = new Property(geometryInfoEntity_, 3, 4, cls2, "textSize");
        f7352h = property4;
        Property property5 = new Property(geometryInfoEntity_, 4, 5, cls3, "style");
        f7353i = property5;
        Property property6 = new Property(geometryInfoEntity_, 5, 6, cls3, "geometryType");
        f7354j = property6;
        Property property7 = new Property(geometryInfoEntity_, 6, 7, cls, "recordId", true);
        f7355k = property7;
        f7356l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f7357m = property;
        f7358n = new RelationInfo(geometryInfoEntity_, GeometryRecordEntity_.f7386d, property7, new ToOneGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.record;
            }
        });
        f7359o = new RelationInfo(geometryInfoEntity_, GeometryPointFEntity_.f7370d, new ToManyGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.pointList;
            }
        }, 10);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7356l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7345a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7346b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 21;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7347c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "GeometryInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "GeometryInfoEntity";
    }
}
