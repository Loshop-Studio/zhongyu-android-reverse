package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class MatrixInfoEntity_ implements EntityInfo<MatrixInfoEntity> {

    /* renamed from: c */
    public static final Class f18307c = MatrixInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18308d = new MatrixInfoEntityCursor.C8385a();

    /* renamed from: e */
    public static final C8387a f18309e = new C8387a();

    /* renamed from: f */
    public static final MatrixInfoEntity_ f18310f;

    /* renamed from: g */
    public static final Property f18311g;

    /* renamed from: h */
    public static final Property f18312h;

    /* renamed from: i */
    public static final Property f18313i;

    /* renamed from: j */
    public static final Property f18314j;

    /* renamed from: k */
    public static final Property f18315k;

    /* renamed from: l */
    public static final Property f18316l;

    /* renamed from: m */
    public static final Property f18317m;

    /* renamed from: n */
    public static final Property f18318n;

    /* renamed from: o */
    public static final Property f18319o;

    /* renamed from: p */
    public static final Property f18320p;

    /* renamed from: q */
    public static final Property f18321q;

    /* renamed from: r */
    public static final Property f18322r;

    /* renamed from: s */
    public static final Property[] f18323s;

    /* renamed from: t */
    public static final Property f18324t;

    /* renamed from: u */
    public static final RelationInfo f18325u;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_$a */
    public static final class C8387a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(MatrixInfoEntity matrixInfoEntity) {
            return matrixInfoEntity.m14191b();
        }
    }

    static {
        MatrixInfoEntity_ matrixInfoEntity_ = new MatrixInfoEntity_();
        f18310f = matrixInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18311g = property;
        Property property2 = new Property(matrixInfoEntity_, 1, 2, cls, "eventTime");
        f18312h = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(matrixInfoEntity_, 2, 3, cls2, "scaleX");
        f18313i = property3;
        Property property4 = new Property(matrixInfoEntity_, 3, 4, cls2, "skewX");
        f18314j = property4;
        Property property5 = new Property(matrixInfoEntity_, 4, 5, cls2, "transX");
        f18315k = property5;
        Property property6 = new Property(matrixInfoEntity_, 5, 6, cls2, "skewY");
        f18316l = property6;
        Property property7 = new Property(matrixInfoEntity_, 6, 7, cls2, "scaleY");
        f18317m = property7;
        Property property8 = new Property(matrixInfoEntity_, 7, 8, cls2, "transY");
        f18318n = property8;
        Property property9 = new Property(matrixInfoEntity_, 8, 9, cls2, "perSp0");
        f18319o = property9;
        Property property10 = new Property(matrixInfoEntity_, 9, 10, cls2, "perSp1");
        f18320p = property10;
        Property property11 = new Property(matrixInfoEntity_, 10, 11, cls2, "perSp2");
        f18321q = property11;
        Property property12 = new Property(matrixInfoEntity_, 11, 12, cls, "recordId", true);
        f18322r = property12;
        f18323s = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12};
        f18324t = property;
        f18325u = new RelationInfo(matrixInfoEntity_, MatrixEventEntity_.f18287f, property12, new ToOneGetter<MatrixInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(MatrixInfoEntity matrixInfoEntity) {
                return matrixInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "MatrixInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18323s;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18307c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18308d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 9;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18309e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "MatrixInfoEntity";
    }
}
