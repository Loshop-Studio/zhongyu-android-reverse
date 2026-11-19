package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor;
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
public final class MatrixRecordEntity_ implements EntityInfo<MatrixRecordEntity> {

    /* renamed from: a */
    public static final Class f7488a = MatrixRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7489b = new MatrixRecordEntityCursor.C6691a();

    /* renamed from: c */
    public static final C6694a f7490c = new C6694a();

    /* renamed from: d */
    public static final MatrixRecordEntity_ f7491d;

    /* renamed from: e */
    public static final Property f7492e;

    /* renamed from: f */
    public static final Property f7493f;

    /* renamed from: g */
    public static final Property f7494g;

    /* renamed from: h */
    public static final Property f7495h;

    /* renamed from: i */
    public static final Property[] f7496i;

    /* renamed from: j */
    public static final Property f7497j;

    /* renamed from: k */
    public static final RelationInfo f7498k;

    /* renamed from: l */
    public static final RelationInfo f7499l;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_$a */
    public static final class C6694a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(MatrixRecordEntity matrixRecordEntity) {
            return matrixRecordEntity.getId();
        }
    }

    static {
        MatrixRecordEntity_ matrixRecordEntity_ = new MatrixRecordEntity_();
        f7491d = matrixRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixRecordEntity_, 0, 1, cls, "id", true, "id");
        f7492e = property;
        Property property2 = new Property(matrixRecordEntity_, 1, 2, String.class, "fileName");
        f7493f = property2;
        Property property3 = new Property(matrixRecordEntity_, 2, 3, String.class, "validate");
        f7494g = property3;
        Property property4 = new Property(matrixRecordEntity_, 3, 4, cls, "recordId", true);
        f7495h = property4;
        f7496i = new Property[]{property, property2, property3, property4};
        f7497j = property;
        f7498k = new RelationInfo(matrixRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        f7499l = new RelationInfo(matrixRecordEntity_, MatrixEventEntity_.f7444d, new ToManyGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.matrixEventEntity;
            }
        }, 6);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7496i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7488a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7489b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 18;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7490c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "MatrixRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "MatrixRecordEntity";
    }
}
