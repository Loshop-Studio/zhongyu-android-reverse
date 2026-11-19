package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor;
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
public final class MatrixEventEntity_ implements EntityInfo<MatrixEventEntity> {

    /* renamed from: a */
    public static final Class f8723a = MatrixEventEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8724b = new MatrixEventEntityCursor.C7001a();

    /* renamed from: c */
    public static final C7004a f8725c = new C7004a();

    /* renamed from: d */
    public static final MatrixEventEntity_ f8726d;

    /* renamed from: e */
    public static final Property f8727e;

    /* renamed from: f */
    public static final Property f8728f;

    /* renamed from: g */
    public static final Property[] f8729g;

    /* renamed from: h */
    public static final Property f8730h;

    /* renamed from: i */
    public static final RelationInfo f8731i;

    /* renamed from: j */
    public static final RelationInfo f8732j;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntity_$a */
    public static final class C7004a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(MatrixEventEntity matrixEventEntity) {
            return matrixEventEntity.getId();
        }
    }

    static {
        MatrixEventEntity_ matrixEventEntity_ = new MatrixEventEntity_();
        f8726d = matrixEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixEventEntity_, 0, 1, cls, "id", true, "id");
        f8727e = property;
        Property property2 = new Property(matrixEventEntity_, 1, 2, cls, "recordId", true);
        f8728f = property2;
        f8729g = new Property[]{property, property2};
        f8730h = property;
        f8731i = new RelationInfo(matrixEventEntity_, MatrixRecordEntity_.f8773d, property2, new ToOneGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.record;
            }
        });
        f8732j = new RelationInfo(matrixEventEntity_, MatrixInfoEntity_.f8749d, new ToManyGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.matrixInfo;
            }
        }, 5);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8729g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8723a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8724b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 15;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8725c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "MatrixEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "MatrixEventEntity";
    }
}
