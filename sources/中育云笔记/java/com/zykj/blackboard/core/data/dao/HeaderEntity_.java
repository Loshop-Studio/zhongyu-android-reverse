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
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class HeaderEntity_ implements EntityInfo<HeaderEntity> {

    /* renamed from: A */
    public static final RelationInfo f18254A;

    /* renamed from: B */
    public static final RelationInfo f18255B;

    /* renamed from: C */
    public static final RelationInfo f18256C;

    /* renamed from: c */
    public static final Class f18257c = HeaderEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18258d = new HeaderEntityCursor.C8373a();

    /* renamed from: e */
    public static final C8380a f18259e = new C8380a();

    /* renamed from: f */
    public static final HeaderEntity_ f18260f;

    /* renamed from: g */
    public static final Property f18261g;

    /* renamed from: h */
    public static final Property f18262h;

    /* renamed from: i */
    public static final Property f18263i;

    /* renamed from: j */
    public static final Property f18264j;

    /* renamed from: k */
    public static final Property f18265k;

    /* renamed from: l */
    public static final Property f18266l;

    /* renamed from: m */
    public static final Property f18267m;

    /* renamed from: n */
    public static final Property f18268n;

    /* renamed from: o */
    public static final Property f18269o;

    /* renamed from: p */
    public static final Property f18270p;

    /* renamed from: q */
    public static final Property f18271q;

    /* renamed from: r */
    public static final Property f18272r;

    /* renamed from: s */
    public static final Property f18273s;

    /* renamed from: t */
    public static final Property f18274t;

    /* renamed from: u */
    public static final Property f18275u;

    /* renamed from: v */
    public static final Property[] f18276v;

    /* renamed from: w */
    public static final Property f18277w;

    /* renamed from: x */
    public static final RelationInfo f18278x;

    /* renamed from: y */
    public static final RelationInfo f18279y;

    /* renamed from: z */
    public static final RelationInfo f18280z;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntity_$a */
    public static final class C8380a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(HeaderEntity headerEntity) {
            return headerEntity.m14151h();
        }
    }

    static {
        HeaderEntity_ headerEntity_ = new HeaderEntity_();
        f18260f = headerEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(headerEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18261g = property;
        Class cls2 = Integer.TYPE;
        Property property2 = new Property(headerEntity_, 1, 2, cls2, "version");
        f18262h = property2;
        Property property3 = new Property(headerEntity_, 2, 3, cls2, "width");
        f18263i = property3;
        Property property4 = new Property(headerEntity_, 3, 4, cls2, "height");
        f18264j = property4;
        Property property5 = new Property(headerEntity_, 4, 5, cls, "createDate");
        f18265k = property5;
        Property property6 = new Property(headerEntity_, 5, 6, cls, "updateDate");
        f18266l = property6;
        Property property7 = new Property(headerEntity_, 6, 7, cls, TypedValues.TransitionType.S_DURATION);
        f18267m = property7;
        Property property8 = new Property(headerEntity_, 7, 11, String.class, "convertUrl");
        f18268n = property8;
        Property property9 = new Property(headerEntity_, 8, 12, cls2, "defaultBackgroundColor");
        f18269o = property9;
        Property property10 = new Property(headerEntity_, 9, 13, cls2, "lastBackgroundColor");
        f18270p = property10;
        Property property11 = new Property(headerEntity_, 10, 9, cls, "pageId", true);
        f18271q = property11;
        Property property12 = new Property(headerEntity_, 11, 15, cls, "defaultBackgroundLineConfigId", true);
        f18272r = property12;
        Property property13 = new Property(headerEntity_, 12, 16, cls, "lastBackgroundLineConfigId", true);
        f18273s = property13;
        Property property14 = new Property(headerEntity_, 13, 10, cls, "authorId", true);
        f18274t = property14;
        Property property15 = new Property(headerEntity_, 14, 14, cls, "moveConfigId", true);
        f18275u = property15;
        f18276v = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12, property13, property14, property15};
        f18277w = property;
        f18278x = new RelationInfo(headerEntity_, PageEntity_.f18378f, property11, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(HeaderEntity headerEntity) {
                return headerEntity.page;
            }
        });
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = BackgroundLineConfigEntity_.f18083f;
        f18279y = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property12, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(HeaderEntity headerEntity) {
                return headerEntity.defaultBackgroundLineConfig;
            }
        });
        f18280z = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property13, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(HeaderEntity headerEntity) {
                return headerEntity.lastBackgroundLineConfig;
            }
        });
        AuthorEntity_ authorEntity_ = AuthorEntity_.f18063f;
        f18254A = new RelationInfo(headerEntity_, authorEntity_, property14, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.4
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(HeaderEntity headerEntity) {
                return headerEntity.author;
            }
        });
        f18255B = new RelationInfo(headerEntity_, MoveConfigEntity_.f18355f, property15, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(HeaderEntity headerEntity) {
                return headerEntity.moveConfig;
            }
        });
        f18256C = new RelationInfo(headerEntity_, authorEntity_, new ToManyGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(HeaderEntity headerEntity) {
                return headerEntity.provider;
            }
        }, 9);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "HeaderEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18276v;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18257c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18258d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 6;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18259e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "HeaderEntity";
    }
}
