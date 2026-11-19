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
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class TouchEventEntity_ implements EntityInfo<TouchEventEntity> {

    /* renamed from: a */
    public static final Class f8898a = TouchEventEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8899b = new TouchEventEntityCursor.C7043a();

    /* renamed from: c */
    public static final C7046a f8900c = new C7046a();

    /* renamed from: d */
    public static final TouchEventEntity_ f8901d;

    /* renamed from: e */
    public static final Property f8902e;

    /* renamed from: f */
    public static final Property f8903f;

    /* renamed from: g */
    public static final Property f8904g;

    /* renamed from: h */
    public static final Property f8905h;

    /* renamed from: i */
    public static final Property f8906i;

    /* renamed from: j */
    public static final Property f8907j;

    /* renamed from: k */
    public static final Property f8908k;

    /* renamed from: l */
    public static final Property f8909l;

    /* renamed from: m */
    public static final Property[] f8910m;

    /* renamed from: n */
    public static final Property f8911n;

    /* renamed from: o */
    public static final RelationInfo f8912o;

    /* renamed from: p */
    public static final RelationInfo f8913p;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntity_$a */
    public static final class C7046a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(TouchEventEntity touchEventEntity) {
            return touchEventEntity.getId();
        }
    }

    static {
        TouchEventEntity_ touchEventEntity_ = new TouchEventEntity_();
        f8901d = touchEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchEventEntity_, 0, 1, cls, "id", true, "id");
        f8902e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(touchEventEntity_, 1, 2, cls2, "width");
        f8903f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(touchEventEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f8904g = property3;
        Property property4 = new Property(touchEventEntity_, 3, 4, cls2, "spacing");
        f8905h = property4;
        Property property5 = new Property(touchEventEntity_, 4, 5, cls2, "itemLength");
        f8906i = property5;
        Property property6 = new Property(touchEventEntity_, 5, 6, cls3, "style");
        f8907j = property6;
        Property property7 = new Property(touchEventEntity_, 6, 7, cls2, "textSize");
        f8908k = property7;
        Property property8 = new Property(touchEventEntity_, 7, 8, cls, "recordId", true);
        f8909l = property8;
        f8910m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f8911n = property;
        f8912o = new RelationInfo(touchEventEntity_, TouchRecordEntity_.f8942d, property8, new ToOneGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TouchEventEntity touchEventEntity) {
                return touchEventEntity.record;
            }
        });
        f8913p = new RelationInfo(touchEventEntity_, TouchInfoEntity_.f8925d, new ToManyGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(TouchEventEntity touchEventEntity) {
                return touchEventEntity.touchInfoList;
            }
        }, 7);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8910m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8898a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8899b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 4;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8900c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "TouchEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "TouchEventEntity";
    }
}
