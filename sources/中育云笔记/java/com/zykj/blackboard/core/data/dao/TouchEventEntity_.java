package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TouchEventEntityCursor;
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
public final class TouchEventEntity_ implements EntityInfo<TouchEventEntity> {

    /* renamed from: c */
    public static final Class f18459c = TouchEventEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18460d = new TouchEventEntityCursor.C8423a();

    /* renamed from: e */
    public static final C8426a f18461e = new C8426a();

    /* renamed from: f */
    public static final TouchEventEntity_ f18462f;

    /* renamed from: g */
    public static final Property f18463g;

    /* renamed from: h */
    public static final Property f18464h;

    /* renamed from: i */
    public static final Property f18465i;

    /* renamed from: j */
    public static final Property f18466j;

    /* renamed from: k */
    public static final Property f18467k;

    /* renamed from: l */
    public static final Property f18468l;

    /* renamed from: m */
    public static final Property f18469m;

    /* renamed from: n */
    public static final Property f18470n;

    /* renamed from: o */
    public static final Property[] f18471o;

    /* renamed from: p */
    public static final Property f18472p;

    /* renamed from: q */
    public static final RelationInfo f18473q;

    /* renamed from: r */
    public static final RelationInfo f18474r;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntity_$a */
    public static final class C8426a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(TouchEventEntity touchEventEntity) {
            return touchEventEntity.m14315b();
        }
    }

    static {
        TouchEventEntity_ touchEventEntity_ = new TouchEventEntity_();
        f18462f = touchEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchEventEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18463g = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(touchEventEntity_, 1, 2, cls2, "width");
        f18464h = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(touchEventEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f18465i = property3;
        Property property4 = new Property(touchEventEntity_, 3, 4, cls2, "spacing");
        f18466j = property4;
        Property property5 = new Property(touchEventEntity_, 4, 5, cls2, "itemLength");
        f18467k = property5;
        Property property6 = new Property(touchEventEntity_, 5, 6, cls3, "style");
        f18468l = property6;
        Property property7 = new Property(touchEventEntity_, 6, 7, cls2, "textSize");
        f18469m = property7;
        Property property8 = new Property(touchEventEntity_, 7, 8, cls, "recordId", true);
        f18470n = property8;
        f18471o = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f18472p = property;
        f18473q = new RelationInfo(touchEventEntity_, TouchRecordEntity_.f18503f, property8, new ToOneGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TouchEventEntity touchEventEntity) {
                return touchEventEntity.record;
            }
        });
        f18474r = new RelationInfo(touchEventEntity_, TouchInfoEntity_.f18486f, new ToManyGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(TouchEventEntity touchEventEntity) {
                return touchEventEntity.touchInfoList;
            }
        }, 7);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "TouchEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18471o;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18459c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18460d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 4;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18461e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "TouchEventEntity";
    }
}
