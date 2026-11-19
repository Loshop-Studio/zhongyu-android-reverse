package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class MatrixRecordEntity_ implements EntityInfo<MatrixRecordEntity> {

    /* renamed from: a */
    public static final Class f8770a = MatrixRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8771b = new MatrixRecordEntityCursor.C7008a();

    /* renamed from: c */
    public static final C7011a f8772c = new C7011a();

    /* renamed from: d */
    public static final MatrixRecordEntity_ f8773d;

    /* renamed from: e */
    public static final Property f8774e;

    /* renamed from: f */
    public static final Property f8775f;

    /* renamed from: g */
    public static final Property f8776g;

    /* renamed from: h */
    public static final Property f8777h;

    /* renamed from: i */
    public static final Property[] f8778i;

    /* renamed from: j */
    public static final Property f8779j;

    /* renamed from: k */
    public static final RelationInfo f8780k;

    /* renamed from: l */
    public static final RelationInfo f8781l;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_$a */
    public static final class C7011a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(MatrixRecordEntity matrixRecordEntity) {
            return matrixRecordEntity.getId();
        }
    }

    static {
        MatrixRecordEntity_ matrixRecordEntity_ = new MatrixRecordEntity_();
        f8773d = matrixRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixRecordEntity_, 0, 1, cls, "id", true, "id");
        f8774e = property;
        Property property2 = new Property(matrixRecordEntity_, 1, 2, String.class, "fileName");
        f8775f = property2;
        Property property3 = new Property(matrixRecordEntity_, 2, 3, String.class, "validate");
        f8776g = property3;
        Property property4 = new Property(matrixRecordEntity_, 3, 4, cls, "recordId", true);
        f8777h = property4;
        f8778i = new Property[]{property, property2, property3, property4};
        f8779j = property;
        f8780k = new RelationInfo(matrixRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        f8781l = new RelationInfo(matrixRecordEntity_, MatrixEventEntity_.f8726d, new ToManyGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.matrixEventEntity;
            }
        }, 6);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8778i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8770a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8771b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 18;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8772c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "MatrixRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "MatrixRecordEntity";
    }
}
