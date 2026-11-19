package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class MatrixInfoEntity_ implements EntityInfo<MatrixInfoEntity> {

    /* renamed from: a */
    public static final Class f7464a = MatrixInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7465b = new MatrixInfoEntityCursor.C6688a();

    /* renamed from: c */
    public static final C6690a f7466c = new C6690a();

    /* renamed from: d */
    public static final MatrixInfoEntity_ f7467d;

    /* renamed from: e */
    public static final Property f7468e;

    /* renamed from: f */
    public static final Property f7469f;

    /* renamed from: g */
    public static final Property f7470g;

    /* renamed from: h */
    public static final Property f7471h;

    /* renamed from: i */
    public static final Property f7472i;

    /* renamed from: j */
    public static final Property f7473j;

    /* renamed from: k */
    public static final Property f7474k;

    /* renamed from: l */
    public static final Property f7475l;

    /* renamed from: m */
    public static final Property f7476m;

    /* renamed from: n */
    public static final Property f7477n;

    /* renamed from: o */
    public static final Property f7478o;

    /* renamed from: p */
    public static final Property f7479p;

    /* renamed from: q */
    public static final Property[] f7480q;

    /* renamed from: r */
    public static final Property f7481r;

    /* renamed from: s */
    public static final RelationInfo f7482s;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_$a */
    public static final class C6690a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(MatrixInfoEntity matrixInfoEntity) {
            return matrixInfoEntity.getId();
        }
    }

    static {
        MatrixInfoEntity_ matrixInfoEntity_ = new MatrixInfoEntity_();
        f7467d = matrixInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixInfoEntity_, 0, 1, cls, "id", true, "id");
        f7468e = property;
        Property property2 = new Property(matrixInfoEntity_, 1, 2, cls, "eventTime");
        f7469f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(matrixInfoEntity_, 2, 3, cls2, "scaleX");
        f7470g = property3;
        Property property4 = new Property(matrixInfoEntity_, 3, 4, cls2, "skewX");
        f7471h = property4;
        Property property5 = new Property(matrixInfoEntity_, 4, 5, cls2, "transX");
        f7472i = property5;
        Property property6 = new Property(matrixInfoEntity_, 5, 6, cls2, "skewY");
        f7473j = property6;
        Property property7 = new Property(matrixInfoEntity_, 6, 7, cls2, "scaleY");
        f7474k = property7;
        Property property8 = new Property(matrixInfoEntity_, 7, 8, cls2, "transY");
        f7475l = property8;
        Property property9 = new Property(matrixInfoEntity_, 8, 9, cls2, "perSp0");
        f7476m = property9;
        Property property10 = new Property(matrixInfoEntity_, 9, 10, cls2, "perSp1");
        f7477n = property10;
        Property property11 = new Property(matrixInfoEntity_, 10, 11, cls2, "perSp2");
        f7478o = property11;
        Property property12 = new Property(matrixInfoEntity_, 11, 12, cls, "recordId", true);
        f7479p = property12;
        f7480q = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12};
        f7481r = property;
        f7482s = new RelationInfo(matrixInfoEntity_, MatrixEventEntity_.f7444d, property12, new ToOneGetter<MatrixInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(MatrixInfoEntity matrixInfoEntity) {
                return matrixInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7480q;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7464a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7465b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 9;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7466c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "MatrixInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "MatrixInfoEntity";
    }
}
