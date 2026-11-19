package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TouchRecordEntityCursor;
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
public final class TouchRecordEntity_ implements EntityInfo<TouchRecordEntity> {

    /* renamed from: a */
    public static final Class f8939a = TouchRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8940b = new TouchRecordEntityCursor.C7050a();

    /* renamed from: c */
    public static final C7053a f8941c = new C7053a();

    /* renamed from: d */
    public static final TouchRecordEntity_ f8942d;

    /* renamed from: e */
    public static final Property f8943e;

    /* renamed from: f */
    public static final Property f8944f;

    /* renamed from: g */
    public static final Property f8945g;

    /* renamed from: h */
    public static final Property f8946h;

    /* renamed from: i */
    public static final Property[] f8947i;

    /* renamed from: j */
    public static final Property f8948j;

    /* renamed from: k */
    public static final RelationInfo f8949k;

    /* renamed from: l */
    public static final RelationInfo f8950l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TouchRecordEntity_$a */
    public static final class C7053a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(TouchRecordEntity touchRecordEntity) {
            return touchRecordEntity.getId();
        }
    }

    static {
        TouchRecordEntity_ touchRecordEntity_ = new TouchRecordEntity_();
        f8942d = touchRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(touchRecordEntity_, 0, 1, cls, "id", true, "id");
        f8943e = property;
        Property property2 = new Property(touchRecordEntity_, 1, 2, String.class, "fileName");
        f8944f = property2;
        Property property3 = new Property(touchRecordEntity_, 2, 3, String.class, "validate");
        f8945g = property3;
        Property property4 = new Property(touchRecordEntity_, 3, 4, cls, "recordId", true);
        f8946h = property4;
        f8947i = new Property[]{property, property2, property3, property4};
        f8948j = property;
        f8949k = new RelationInfo(touchRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f8950l = new RelationInfo(touchRecordEntity_, TouchEventEntity_.f8901d, new ToManyGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TouchRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.touchEventList;
            }
        }, 4);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8947i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8939a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8940b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 10;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8941c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "TouchRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "TouchRecordEntity";
    }
}
