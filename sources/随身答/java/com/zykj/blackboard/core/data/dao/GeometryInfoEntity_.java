package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor;
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
public final class GeometryInfoEntity_ implements EntityInfo<GeometryInfoEntity> {

    /* renamed from: a */
    public static final Class f8627a = GeometryInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8628b = new GeometryInfoEntityCursor.C6982a();

    /* renamed from: c */
    public static final C6985a f8629c = new C6985a();

    /* renamed from: d */
    public static final GeometryInfoEntity_ f8630d;

    /* renamed from: e */
    public static final Property f8631e;

    /* renamed from: f */
    public static final Property f8632f;

    /* renamed from: g */
    public static final Property f8633g;

    /* renamed from: h */
    public static final Property f8634h;

    /* renamed from: i */
    public static final Property f8635i;

    /* renamed from: j */
    public static final Property f8636j;

    /* renamed from: k */
    public static final Property f8637k;

    /* renamed from: l */
    public static final Property[] f8638l;

    /* renamed from: m */
    public static final Property f8639m;

    /* renamed from: n */
    public static final RelationInfo f8640n;

    /* renamed from: o */
    public static final RelationInfo f8641o;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_$a */
    public static final class C6985a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(GeometryInfoEntity geometryInfoEntity) {
            return geometryInfoEntity.getId();
        }
    }

    static {
        GeometryInfoEntity_ geometryInfoEntity_ = new GeometryInfoEntity_();
        f8630d = geometryInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryInfoEntity_, 0, 1, cls, "id", true, "id");
        f8631e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryInfoEntity_, 1, 2, cls2, "width");
        f8632f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(geometryInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f8633g = property3;
        Property property4 = new Property(geometryInfoEntity_, 3, 4, cls2, "textSize");
        f8634h = property4;
        Property property5 = new Property(geometryInfoEntity_, 4, 5, cls3, "style");
        f8635i = property5;
        Property property6 = new Property(geometryInfoEntity_, 5, 6, cls3, "geometryType");
        f8636j = property6;
        Property property7 = new Property(geometryInfoEntity_, 6, 7, cls, "recordId", true);
        f8637k = property7;
        f8638l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f8639m = property;
        f8640n = new RelationInfo(geometryInfoEntity_, GeometryRecordEntity_.f8668d, property7, new ToOneGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.record;
            }
        });
        f8641o = new RelationInfo(geometryInfoEntity_, GeometryPointFEntity_.f8652d, new ToManyGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.pointList;
            }
        }, 10);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8638l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8627a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8628b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 21;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8629c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "GeometryInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "GeometryInfoEntity";
    }
}
