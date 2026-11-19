package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor;
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
public final class MatrixEventEntity_ implements EntityInfo<MatrixEventEntity> {

    /* renamed from: a */
    public static final Class f7441a = MatrixEventEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7442b = new MatrixEventEntityCursor.C6684a();

    /* renamed from: c */
    public static final C6687a f7443c = new C6687a();

    /* renamed from: d */
    public static final MatrixEventEntity_ f7444d;

    /* renamed from: e */
    public static final Property f7445e;

    /* renamed from: f */
    public static final Property f7446f;

    /* renamed from: g */
    public static final Property[] f7447g;

    /* renamed from: h */
    public static final Property f7448h;

    /* renamed from: i */
    public static final RelationInfo f7449i;

    /* renamed from: j */
    public static final RelationInfo f7450j;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntity_$a */
    public static final class C6687a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(MatrixEventEntity matrixEventEntity) {
            return matrixEventEntity.getId();
        }
    }

    static {
        MatrixEventEntity_ matrixEventEntity_ = new MatrixEventEntity_();
        f7444d = matrixEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixEventEntity_, 0, 1, cls, "id", true, "id");
        f7445e = property;
        Property property2 = new Property(matrixEventEntity_, 1, 2, cls, "recordId", true);
        f7446f = property2;
        f7447g = new Property[]{property, property2};
        f7448h = property;
        f7449i = new RelationInfo(matrixEventEntity_, MatrixRecordEntity_.f7491d, property2, new ToOneGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.record;
            }
        });
        f7450j = new RelationInfo(matrixEventEntity_, MatrixInfoEntity_.f7467d, new ToManyGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.matrixInfo;
            }
        }, 5);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7447g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7441a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7442b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 15;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7443c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "MatrixEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "MatrixEventEntity";
    }
}
