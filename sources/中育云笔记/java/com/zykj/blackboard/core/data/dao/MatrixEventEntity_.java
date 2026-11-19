package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MatrixEventEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class MatrixEventEntity_ implements EntityInfo<MatrixEventEntity> {

    /* renamed from: c */
    public static final Class f18284c = MatrixEventEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18285d = new MatrixEventEntityCursor.C8381a();

    /* renamed from: e */
    public static final C8384a f18286e = new C8384a();

    /* renamed from: f */
    public static final MatrixEventEntity_ f18287f;

    /* renamed from: g */
    public static final Property f18288g;

    /* renamed from: h */
    public static final Property f18289h;

    /* renamed from: i */
    public static final Property[] f18290i;

    /* renamed from: j */
    public static final Property f18291j;

    /* renamed from: k */
    public static final RelationInfo f18292k;

    /* renamed from: l */
    public static final RelationInfo f18293l;

    /* renamed from: com.zykj.blackboard.core.data.dao.MatrixEventEntity_$a */
    public static final class C8384a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(MatrixEventEntity matrixEventEntity) {
            return matrixEventEntity.m14179a();
        }
    }

    static {
        MatrixEventEntity_ matrixEventEntity_ = new MatrixEventEntity_();
        f18287f = matrixEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(matrixEventEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18288g = property;
        Property property2 = new Property(matrixEventEntity_, 1, 2, cls, "recordId", true);
        f18289h = property2;
        f18290i = new Property[]{property, property2};
        f18291j = property;
        f18292k = new RelationInfo(matrixEventEntity_, MatrixRecordEntity_.f18334f, property2, new ToOneGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.record;
            }
        });
        f18293l = new RelationInfo(matrixEventEntity_, MatrixInfoEntity_.f18310f, new ToManyGetter<MatrixEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.MatrixEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(MatrixEventEntity matrixEventEntity) {
                return matrixEventEntity.matrixInfo;
            }
        }, 5);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "MatrixEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18290i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18284c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18285d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 15;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18286e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "MatrixEventEntity";
    }
}
