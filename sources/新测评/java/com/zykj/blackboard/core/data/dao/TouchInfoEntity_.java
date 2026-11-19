package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class TouchInfoEntity_ implements EntityInfo<TouchInfoEntity> {

    /* renamed from: a */
    public static final Class f7640a = TouchInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7641b = new TouchInfoEntityCursor.C6730a();

    /* renamed from: c */
    public static final C6732a f7642c = new C6732a();

    /* renamed from: d */
    public static final TouchInfoEntity_ f7643d;

    /* renamed from: e */
    public static final Property f7644e;

    /* renamed from: f */
    public static final Property f7645f;

    /* renamed from: g */
    public static final Property f7646g;

    /* renamed from: h */
    public static final Property f7647h;

    /* renamed from: i */
    public static final Property f7648i;

    /* renamed from: j */
    public static final Property[] f7649j;

    /* renamed from: k */
    public static final Property f7650k;

    /* renamed from: l */
    public static final RelationInfo f7651l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchInfoEntity_$a */
    public static final class C6732a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(TouchInfoEntity touchInfoEntity) {
            return touchInfoEntity.getId();
        }
    }

    static {
        TouchInfoEntity_ touchInfoEntity_ = new TouchInfoEntity_();
        f7643d = touchInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchInfoEntity_, 0, 1, cls, "id", true, "id");
        f7644e = property;
        Property property2 = new Property(touchInfoEntity_, 1, 2, cls, "eventTime");
        f7645f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(touchInfoEntity_, 2, 3, cls2, "x");
        f7646g = property3;
        Property property4 = new Property(touchInfoEntity_, 3, 4, cls2, "y");
        f7647h = property4;
        Property property5 = new Property(touchInfoEntity_, 4, 6, cls, "recordId", true);
        f7648i = property5;
        f7649j = new Property[]{property, property2, property3, property4, property5};
        f7650k = property;
        f7651l = new RelationInfo(touchInfoEntity_, TouchEventEntity_.f7619d, property5, new ToOneGetter<TouchInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TouchInfoEntity touchInfoEntity) {
                return touchInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7649j;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7640a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7641b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 13;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7642c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "TouchInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "TouchInfoEntity";
    }
}
