package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor;
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
public final class TouchRecordEntity_ implements EntityInfo<TouchRecordEntity> {

    /* renamed from: a */
    public static final Class f7657a = TouchRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7658b = new TouchRecordEntityCursor.C6733a();

    /* renamed from: c */
    public static final C6736a f7659c = new C6736a();

    /* renamed from: d */
    public static final TouchRecordEntity_ f7660d;

    /* renamed from: e */
    public static final Property f7661e;

    /* renamed from: f */
    public static final Property f7662f;

    /* renamed from: g */
    public static final Property f7663g;

    /* renamed from: h */
    public static final Property f7664h;

    /* renamed from: i */
    public static final Property[] f7665i;

    /* renamed from: j */
    public static final Property f7666j;

    /* renamed from: k */
    public static final RelationInfo f7667k;

    /* renamed from: l */
    public static final RelationInfo f7668l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntity_$a */
    public static final class C6736a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(TouchRecordEntity touchRecordEntity) {
            return touchRecordEntity.getId();
        }
    }

    static {
        TouchRecordEntity_ touchRecordEntity_ = new TouchRecordEntity_();
        f7660d = touchRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchRecordEntity_, 0, 1, cls, "id", true, "id");
        f7661e = property;
        Property property2 = new Property(touchRecordEntity_, 1, 2, String.class, "fileName");
        f7662f = property2;
        Property property3 = new Property(touchRecordEntity_, 2, 3, String.class, "validate");
        f7663g = property3;
        Property property4 = new Property(touchRecordEntity_, 3, 4, cls, "recordId", true);
        f7664h = property4;
        f7665i = new Property[]{property, property2, property3, property4};
        f7666j = property;
        f7667k = new RelationInfo(touchRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f7668l = new RelationInfo(touchRecordEntity_, TouchEventEntity_.f7619d, new ToManyGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.touchEventList;
            }
        }, 4);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7665i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7657a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7658b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 10;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7659c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "TouchRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "TouchRecordEntity";
    }
}
