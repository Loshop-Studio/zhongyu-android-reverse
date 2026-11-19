package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class MatrixInfoEntity_ implements EntityInfo<MatrixInfoEntity> {

    /* renamed from: a */
    public static final Class f8746a = MatrixInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8747b = new MatrixInfoEntityCursor.C7005a();

    /* renamed from: c */
    public static final C7007a f8748c = new C7007a();

    /* renamed from: d */
    public static final MatrixInfoEntity_ f8749d;

    /* renamed from: e */
    public static final Property f8750e;

    /* renamed from: f */
    public static final Property f8751f;

    /* renamed from: g */
    public static final Property f8752g;

    /* renamed from: h */
    public static final Property f8753h;

    /* renamed from: i */
    public static final Property f8754i;

    /* renamed from: j */
    public static final Property f8755j;

    /* renamed from: k */
    public static final Property f8756k;

    /* renamed from: l */
    public static final Property f8757l;

    /* renamed from: m */
    public static final Property f8758m;

    /* renamed from: n */
    public static final Property f8759n;

    /* renamed from: o */
    public static final Property f8760o;

    /* renamed from: p */
    public static final Property f8761p;

    /* renamed from: q */
    public static final Property[] f8762q;

    /* renamed from: r */
    public static final Property f8763r;

    /* renamed from: s */
    public static final RelationInfo f8764s;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_$a */
    public static final class C7007a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(MatrixInfoEntity matrixInfoEntity) {
            return matrixInfoEntity.getId();
        }
    }

    static {
        MatrixInfoEntity_ matrixInfoEntity_ = new MatrixInfoEntity_();
        f8749d = matrixInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixInfoEntity_, 0, 1, cls, "id", true, "id");
        f8750e = property;
        Property property2 = new Property(matrixInfoEntity_, 1, 2, cls, "eventTime");
        f8751f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(matrixInfoEntity_, 2, 3, cls2, "scaleX");
        f8752g = property3;
        Property property4 = new Property(matrixInfoEntity_, 3, 4, cls2, "skewX");
        f8753h = property4;
        Property property5 = new Property(matrixInfoEntity_, 4, 5, cls2, "transX");
        f8754i = property5;
        Property property6 = new Property(matrixInfoEntity_, 5, 6, cls2, "skewY");
        f8755j = property6;
        Property property7 = new Property(matrixInfoEntity_, 6, 7, cls2, "scaleY");
        f8756k = property7;
        Property property8 = new Property(matrixInfoEntity_, 7, 8, cls2, "transY");
        f8757l = property8;
        Property property9 = new Property(matrixInfoEntity_, 8, 9, cls2, "perSp0");
        f8758m = property9;
        Property property10 = new Property(matrixInfoEntity_, 9, 10, cls2, "perSp1");
        f8759n = property10;
        Property property11 = new Property(matrixInfoEntity_, 10, 11, cls2, "perSp2");
        f8760o = property11;
        Property property12 = new Property(matrixInfoEntity_, 11, 12, cls, "recordId", true);
        f8761p = property12;
        f8762q = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12};
        f8763r = property;
        f8764s = new RelationInfo(matrixInfoEntity_, MatrixEventEntity_.f8726d, property12, new ToOneGetter<MatrixInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(MatrixInfoEntity matrixInfoEntity) {
                return matrixInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8762q;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8746a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8747b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 9;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8748c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "MatrixInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "MatrixInfoEntity";
    }
}
