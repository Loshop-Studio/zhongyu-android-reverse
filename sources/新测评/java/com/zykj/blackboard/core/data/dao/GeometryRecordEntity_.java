package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor;
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
public final class GeometryRecordEntity_ implements EntityInfo<GeometryRecordEntity> {

    /* renamed from: a */
    public static final Class f7383a = GeometryRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7384b = new GeometryRecordEntityCursor.C6672a();

    /* renamed from: c */
    public static final C6675a f7385c = new C6675a();

    /* renamed from: d */
    public static final GeometryRecordEntity_ f7386d;

    /* renamed from: e */
    public static final Property f7387e;

    /* renamed from: f */
    public static final Property f7388f;

    /* renamed from: g */
    public static final Property f7389g;

    /* renamed from: h */
    public static final Property f7390h;

    /* renamed from: i */
    public static final Property[] f7391i;

    /* renamed from: j */
    public static final Property f7392j;

    /* renamed from: k */
    public static final RelationInfo f7393k;

    /* renamed from: l */
    public static final RelationInfo f7394l;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_$a */
    public static final class C6675a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(GeometryRecordEntity geometryRecordEntity) {
            return geometryRecordEntity.getId();
        }
    }

    static {
        GeometryRecordEntity_ geometryRecordEntity_ = new GeometryRecordEntity_();
        f7386d = geometryRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryRecordEntity_, 0, 1, cls, "id", true, "id");
        f7387e = property;
        Property property2 = new Property(geometryRecordEntity_, 1, 2, String.class, "fileName");
        f7388f = property2;
        Property property3 = new Property(geometryRecordEntity_, 2, 3, String.class, "validate");
        f7389g = property3;
        Property property4 = new Property(geometryRecordEntity_, 3, 4, cls, "recordId", true);
        f7390h = property4;
        f7391i = new Property[]{property, property2, property3, property4};
        f7392j = property;
        f7393k = new RelationInfo(geometryRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
        f7394l = new RelationInfo(geometryRecordEntity_, GeometryInfoEntity_.f7348d, new ToManyGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.geometryInfoEntityList;
            }
        }, 11);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7391i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7383a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7384b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 22;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7385c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "GeometryRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "GeometryRecordEntity";
    }
}
