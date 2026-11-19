package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class TouchInfoEntity_ implements EntityInfo<TouchInfoEntity> {

    /* renamed from: a */
    public static final Class f8922a = TouchInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8923b = new TouchInfoEntityCursor.C7047a();

    /* renamed from: c */
    public static final C7049a f8924c = new C7049a();

    /* renamed from: d */
    public static final TouchInfoEntity_ f8925d;

    /* renamed from: e */
    public static final Property f8926e;

    /* renamed from: f */
    public static final Property f8927f;

    /* renamed from: g */
    public static final Property f8928g;

    /* renamed from: h */
    public static final Property f8929h;

    /* renamed from: i */
    public static final Property f8930i;

    /* renamed from: j */
    public static final Property[] f8931j;

    /* renamed from: k */
    public static final Property f8932k;

    /* renamed from: l */
    public static final RelationInfo f8933l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntity_$a */
    public static final class C7049a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(TouchInfoEntity touchInfoEntity) {
            return touchInfoEntity.getId();
        }
    }

    static {
        TouchInfoEntity_ touchInfoEntity_ = new TouchInfoEntity_();
        f8925d = touchInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchInfoEntity_, 0, 1, cls, "id", true, "id");
        f8926e = property;
        Property property2 = new Property(touchInfoEntity_, 1, 2, cls, "eventTime");
        f8927f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(touchInfoEntity_, 2, 3, cls2, "x");
        f8928g = property3;
        Property property4 = new Property(touchInfoEntity_, 3, 4, cls2, "y");
        f8929h = property4;
        Property property5 = new Property(touchInfoEntity_, 4, 6, cls, "recordId", true);
        f8930i = property5;
        f8931j = new Property[]{property, property2, property3, property4, property5};
        f8932k = property;
        f8933l = new RelationInfo(touchInfoEntity_, TouchEventEntity_.f8901d, property5, new ToOneGetter<TouchInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TouchInfoEntity touchInfoEntity) {
                return touchInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8931j;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8922a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8923b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 13;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8924c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "TouchInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "TouchInfoEntity";
    }
}
