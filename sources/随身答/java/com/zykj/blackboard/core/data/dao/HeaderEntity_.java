package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.HeaderEntityCursor;
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
public final class HeaderEntity_ implements EntityInfo<HeaderEntity> {

    /* renamed from: A */
    public static final RelationInfo f8693A;

    /* renamed from: a */
    public static final Class f8694a = HeaderEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8695b = new HeaderEntityCursor.C6993a();

    /* renamed from: c */
    public static final C7000a f8696c = new C7000a();

    /* renamed from: d */
    public static final HeaderEntity_ f8697d;

    /* renamed from: e */
    public static final Property f8698e;

    /* renamed from: f */
    public static final Property f8699f;

    /* renamed from: g */
    public static final Property f8700g;

    /* renamed from: h */
    public static final Property f8701h;

    /* renamed from: i */
    public static final Property f8702i;

    /* renamed from: j */
    public static final Property f8703j;

    /* renamed from: k */
    public static final Property f8704k;

    /* renamed from: l */
    public static final Property f8705l;

    /* renamed from: m */
    public static final Property f8706m;

    /* renamed from: n */
    public static final Property f8707n;

    /* renamed from: o */
    public static final Property f8708o;

    /* renamed from: p */
    public static final Property f8709p;

    /* renamed from: q */
    public static final Property f8710q;

    /* renamed from: r */
    public static final Property f8711r;

    /* renamed from: s */
    public static final Property f8712s;

    /* renamed from: t */
    public static final Property[] f8713t;

    /* renamed from: u */
    public static final Property f8714u;

    /* renamed from: v */
    public static final RelationInfo f8715v;

    /* renamed from: w */
    public static final RelationInfo f8716w;

    /* renamed from: x */
    public static final RelationInfo f8717x;

    /* renamed from: y */
    public static final RelationInfo f8718y;

    /* renamed from: z */
    public static final RelationInfo f8719z;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntity_$a */
    public static final class C7000a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(HeaderEntity headerEntity) {
            return headerEntity.getId();
        }
    }

    static {
        HeaderEntity_ headerEntity_ = new HeaderEntity_();
        f8697d = headerEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(headerEntity_, 0, 1, cls, "id", true, "id");
        f8698e = property;
        Class cls2 = Integer.TYPE;
        Property property2 = new Property(headerEntity_, 1, 2, cls2, "version");
        f8699f = property2;
        Property property3 = new Property(headerEntity_, 2, 3, cls2, "width");
        f8700g = property3;
        Property property4 = new Property(headerEntity_, 3, 4, cls2, "height");
        f8701h = property4;
        Property property5 = new Property(headerEntity_, 4, 5, cls, "createDate");
        f8702i = property5;
        Property property6 = new Property(headerEntity_, 5, 6, cls, "updateDate");
        f8703j = property6;
        Property property7 = new Property(headerEntity_, 6, 7, cls, TypedValues.TransitionType.S_DURATION);
        f8704k = property7;
        Property property8 = new Property(headerEntity_, 7, 11, String.class, "convertUrl");
        f8705l = property8;
        Property property9 = new Property(headerEntity_, 8, 12, cls2, "defaultBackgroundColor");
        f8706m = property9;
        Property property10 = new Property(headerEntity_, 9, 13, cls2, "lastBackgroundColor");
        f8707n = property10;
        Property property11 = new Property(headerEntity_, 10, 9, cls, "pageId", true);
        f8708o = property11;
        Property property12 = new Property(headerEntity_, 11, 15, cls, "defaultBackgroundLineConfigId", true);
        f8709p = property12;
        Property property13 = new Property(headerEntity_, 12, 16, cls, "lastBackgroundLineConfigId", true);
        f8710q = property13;
        Property property14 = new Property(headerEntity_, 13, 10, cls, "authorId", true);
        f8711r = property14;
        Property property15 = new Property(headerEntity_, 14, 14, cls, "moveConfigId", true);
        f8712s = property15;
        f8713t = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12, property13, property14, property15};
        f8714u = property;
        f8715v = new RelationInfo(headerEntity_, PageEntity_.f8817d, property11, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(HeaderEntity headerEntity) {
                return headerEntity.page;
            }
        });
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = BackgroundLineConfigEntity_.f8522d;
        f8716w = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property12, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(HeaderEntity headerEntity) {
                return headerEntity.defaultBackgroundLineConfig;
            }
        });
        f8717x = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property13, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(HeaderEntity headerEntity) {
                return headerEntity.lastBackgroundLineConfig;
            }
        });
        AuthorEntity_ authorEntity_ = AuthorEntity_.f8502d;
        f8718y = new RelationInfo(headerEntity_, authorEntity_, property14, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.4
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(HeaderEntity headerEntity) {
                return headerEntity.author;
            }
        });
        f8719z = new RelationInfo(headerEntity_, MoveConfigEntity_.f8794d, property15, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(HeaderEntity headerEntity) {
                return headerEntity.moveConfig;
            }
        });
        f8693A = new RelationInfo(headerEntity_, authorEntity_, new ToManyGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(HeaderEntity headerEntity) {
                return headerEntity.provider;
            }
        }, 9);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8713t;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8694a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8695b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 6;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8696c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "HeaderEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "HeaderEntity";
    }
}
