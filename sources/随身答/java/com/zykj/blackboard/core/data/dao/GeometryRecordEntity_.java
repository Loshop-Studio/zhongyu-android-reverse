package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.GeometryRecordEntityCursor;
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
public final class GeometryRecordEntity_ implements EntityInfo<GeometryRecordEntity> {

    /* renamed from: a */
    public static final Class f8665a = GeometryRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8666b = new GeometryRecordEntityCursor.C6989a();

    /* renamed from: c */
    public static final C6992a f8667c = new C6992a();

    /* renamed from: d */
    public static final GeometryRecordEntity_ f8668d;

    /* renamed from: e */
    public static final Property f8669e;

    /* renamed from: f */
    public static final Property f8670f;

    /* renamed from: g */
    public static final Property f8671g;

    /* renamed from: h */
    public static final Property f8672h;

    /* renamed from: i */
    public static final Property[] f8673i;

    /* renamed from: j */
    public static final Property f8674j;

    /* renamed from: k */
    public static final RelationInfo f8675k;

    /* renamed from: l */
    public static final RelationInfo f8676l;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_$a */
    public static final class C6992a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(GeometryRecordEntity geometryRecordEntity) {
            return geometryRecordEntity.getId();
        }
    }

    static {
        GeometryRecordEntity_ geometryRecordEntity_ = new GeometryRecordEntity_();
        f8668d = geometryRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryRecordEntity_, 0, 1, cls, "id", true, "id");
        f8669e = property;
        Property property2 = new Property(geometryRecordEntity_, 1, 2, String.class, "fileName");
        f8670f = property2;
        Property property3 = new Property(geometryRecordEntity_, 2, 3, String.class, "validate");
        f8671g = property3;
        Property property4 = new Property(geometryRecordEntity_, 3, 4, cls, "recordId", true);
        f8672h = property4;
        f8673i = new Property[]{property, property2, property3, property4};
        f8674j = property;
        f8675k = new RelationInfo(geometryRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
        f8676l = new RelationInfo(geometryRecordEntity_, GeometryInfoEntity_.f8630d, new ToManyGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.geometryInfoEntityList;
            }
        }, 11);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8673i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8665a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8666b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 22;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8667c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "GeometryRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "GeometryRecordEntity";
    }
}
