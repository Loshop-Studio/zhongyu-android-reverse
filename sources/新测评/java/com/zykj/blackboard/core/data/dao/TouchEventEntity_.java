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
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class TouchEventEntity_ implements EntityInfo<TouchEventEntity> {

    /* renamed from: a */
    public static final Class f7616a = TouchEventEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7617b = new TouchEventEntityCursor.C6726a();

    /* renamed from: c */
    public static final C6729a f7618c = new C6729a();

    /* renamed from: d */
    public static final TouchEventEntity_ f7619d;

    /* renamed from: e */
    public static final Property f7620e;

    /* renamed from: f */
    public static final Property f7621f;

    /* renamed from: g */
    public static final Property f7622g;

    /* renamed from: h */
    public static final Property f7623h;

    /* renamed from: i */
    public static final Property f7624i;

    /* renamed from: j */
    public static final Property f7625j;

    /* renamed from: k */
    public static final Property f7626k;

    /* renamed from: l */
    public static final Property f7627l;

    /* renamed from: m */
    public static final Property[] f7628m;

    /* renamed from: n */
    public static final Property f7629n;

    /* renamed from: o */
    public static final RelationInfo f7630o;

    /* renamed from: p */
    public static final RelationInfo f7631p;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchEventEntity_$a */
    public static final class C6729a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(TouchEventEntity touchEventEntity) {
            return touchEventEntity.getId();
        }
    }

    static {
        TouchEventEntity_ touchEventEntity_ = new TouchEventEntity_();
        f7619d = touchEventEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchEventEntity_, 0, 1, cls, "id", true, "id");
        f7620e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(touchEventEntity_, 1, 2, cls2, "width");
        f7621f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(touchEventEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f7622g = property3;
        Property property4 = new Property(touchEventEntity_, 3, 4, cls2, "spacing");
        f7623h = property4;
        Property property5 = new Property(touchEventEntity_, 4, 5, cls2, "itemLength");
        f7624i = property5;
        Property property6 = new Property(touchEventEntity_, 5, 6, cls3, "style");
        f7625j = property6;
        Property property7 = new Property(touchEventEntity_, 6, 7, cls2, "textSize");
        f7626k = property7;
        Property property8 = new Property(touchEventEntity_, 7, 8, cls, "recordId", true);
        f7627l = property8;
        f7628m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f7629n = property;
        f7630o = new RelationInfo(touchEventEntity_, TouchRecordEntity_.f7660d, property8, new ToOneGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TouchEventEntity touchEventEntity) {
                return touchEventEntity.record;
            }
        });
        f7631p = new RelationInfo(touchEventEntity_, TouchInfoEntity_.f7643d, new ToManyGetter<TouchEventEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchEventEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(TouchEventEntity touchEventEntity) {
                return touchEventEntity.touchInfoList;
            }
        }, 7);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7628m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7616a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7617b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 4;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7618c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "TouchEventEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "TouchEventEntity";
    }
}
