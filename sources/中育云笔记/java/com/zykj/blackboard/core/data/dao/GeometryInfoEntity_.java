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
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class GeometryInfoEntity_ implements EntityInfo<GeometryInfoEntity> {

    /* renamed from: c */
    public static final Class f18188c = GeometryInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18189d = new GeometryInfoEntityCursor.C8362a();

    /* renamed from: e */
    public static final C8365a f18190e = new C8365a();

    /* renamed from: f */
    public static final GeometryInfoEntity_ f18191f;

    /* renamed from: g */
    public static final Property f18192g;

    /* renamed from: h */
    public static final Property f18193h;

    /* renamed from: i */
    public static final Property f18194i;

    /* renamed from: j */
    public static final Property f18195j;

    /* renamed from: k */
    public static final Property f18196k;

    /* renamed from: l */
    public static final Property f18197l;

    /* renamed from: m */
    public static final Property f18198m;

    /* renamed from: n */
    public static final Property[] f18199n;

    /* renamed from: o */
    public static final Property f18200o;

    /* renamed from: p */
    public static final RelationInfo f18201p;

    /* renamed from: q */
    public static final RelationInfo f18202q;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_$a */
    public static final class C8365a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(GeometryInfoEntity geometryInfoEntity) {
            return geometryInfoEntity.m14106c();
        }
    }

    static {
        GeometryInfoEntity_ geometryInfoEntity_ = new GeometryInfoEntity_();
        f18191f = geometryInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(geometryInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18192g = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(geometryInfoEntity_, 1, 2, cls2, "width");
        f18193h = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(geometryInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f18194i = property3;
        Property property4 = new Property(geometryInfoEntity_, 3, 4, cls2, "textSize");
        f18195j = property4;
        Property property5 = new Property(geometryInfoEntity_, 4, 5, cls3, "style");
        f18196k = property5;
        Property property6 = new Property(geometryInfoEntity_, 5, 6, cls3, "geometryType");
        f18197l = property6;
        Property property7 = new Property(geometryInfoEntity_, 6, 7, cls, "recordId", true);
        f18198m = property7;
        f18199n = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f18200o = property;
        f18201p = new RelationInfo(geometryInfoEntity_, GeometryRecordEntity_.f18229f, property7, new ToOneGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.record;
            }
        });
        f18202q = new RelationInfo(geometryInfoEntity_, GeometryPointFEntity_.f18213f, new ToManyGetter<GeometryInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.GeometryInfoEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(GeometryInfoEntity geometryInfoEntity) {
                return geometryInfoEntity.pointList;
            }
        }, 10);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "GeometryInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18199n;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18188c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18189d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 21;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18190e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "GeometryInfoEntity";
    }
}
