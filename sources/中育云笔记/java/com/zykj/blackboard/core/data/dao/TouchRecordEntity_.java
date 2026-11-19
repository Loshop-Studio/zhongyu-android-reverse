package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor;
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
public final class TouchRecordEntity_ implements EntityInfo<TouchRecordEntity> {

    /* renamed from: c */
    public static final Class f18500c = TouchRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18501d = new TouchRecordEntityCursor.C8430a();

    /* renamed from: e */
    public static final C8433a f18502e = new C8433a();

    /* renamed from: f */
    public static final TouchRecordEntity_ f18503f;

    /* renamed from: g */
    public static final Property f18504g;

    /* renamed from: h */
    public static final Property f18505h;

    /* renamed from: i */
    public static final Property f18506i;

    /* renamed from: j */
    public static final Property f18507j;

    /* renamed from: k */
    public static final Property[] f18508k;

    /* renamed from: l */
    public static final Property f18509l;

    /* renamed from: m */
    public static final RelationInfo f18510m;

    /* renamed from: n */
    public static final RelationInfo f18511n;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntity_$a */
    public static final class C8433a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(TouchRecordEntity touchRecordEntity) {
            return touchRecordEntity.m14344b();
        }
    }

    static {
        TouchRecordEntity_ touchRecordEntity_ = new TouchRecordEntity_();
        f18503f = touchRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18504g = property;
        Property property2 = new Property(touchRecordEntity_, 1, 2, String.class, "fileName");
        f18505h = property2;
        Property property3 = new Property(touchRecordEntity_, 2, 3, String.class, "validate");
        f18506i = property3;
        Property property4 = new Property(touchRecordEntity_, 3, 4, cls, "recordId", true);
        f18507j = property4;
        f18508k = new Property[]{property, property2, property3, property4};
        f18509l = property;
        f18510m = new RelationInfo(touchRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f18511n = new RelationInfo(touchRecordEntity_, TouchEventEntity_.f18462f, new ToManyGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.touchEventList;
            }
        }, 4);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "TouchRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18508k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18500c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18501d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 10;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18502e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "TouchRecordEntity";
    }
}
