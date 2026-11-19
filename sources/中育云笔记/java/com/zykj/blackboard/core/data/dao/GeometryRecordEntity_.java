package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor;
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
public final class GeometryRecordEntity_ implements EntityInfo<GeometryRecordEntity> {

    /* renamed from: c */
    public static final Class f18226c = GeometryRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18227d = new GeometryRecordEntityCursor.C8369a();

    /* renamed from: e */
    public static final C8372a f18228e = new C8372a();

    /* renamed from: f */
    public static final GeometryRecordEntity_ f18229f;

    /* renamed from: g */
    public static final Property f18230g;

    /* renamed from: h */
    public static final Property f18231h;

    /* renamed from: i */
    public static final Property f18232i;

    /* renamed from: j */
    public static final Property f18233j;

    /* renamed from: k */
    public static final Property[] f18234k;

    /* renamed from: l */
    public static final Property f18235l;

    /* renamed from: m */
    public static final RelationInfo f18236m;

    /* renamed from: n */
    public static final RelationInfo f18237n;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_$a */
    public static final class C8372a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(GeometryRecordEntity geometryRecordEntity) {
            return geometryRecordEntity.m14133c();
        }
    }

    static {
        GeometryRecordEntity_ geometryRecordEntity_ = new GeometryRecordEntity_();
        f18229f = geometryRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18230g = property;
        Property property2 = new Property(geometryRecordEntity_, 1, 2, String.class, "fileName");
        f18231h = property2;
        Property property3 = new Property(geometryRecordEntity_, 2, 3, String.class, "validate");
        f18232i = property3;
        Property property4 = new Property(geometryRecordEntity_, 3, 4, cls, "recordId", true);
        f18233j = property4;
        f18234k = new Property[]{property, property2, property3, property4};
        f18235l = property;
        f18236m = new RelationInfo(geometryRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
        f18237n = new RelationInfo(geometryRecordEntity_, GeometryInfoEntity_.f18191f, new ToManyGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.geometryInfoEntityList;
            }
        }, 11);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "GeometryRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18234k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18226c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18227d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 22;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18228e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "GeometryRecordEntity";
    }
}
