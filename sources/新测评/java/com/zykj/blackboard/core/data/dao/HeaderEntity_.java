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
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class HeaderEntity_ implements EntityInfo<HeaderEntity> {

    /* renamed from: A */
    public static final RelationInfo f7411A;

    /* renamed from: a */
    public static final Class f7412a = HeaderEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7413b = new HeaderEntityCursor.C6676a();

    /* renamed from: c */
    public static final C6683a f7414c = new C6683a();

    /* renamed from: d */
    public static final HeaderEntity_ f7415d;

    /* renamed from: e */
    public static final Property f7416e;

    /* renamed from: f */
    public static final Property f7417f;

    /* renamed from: g */
    public static final Property f7418g;

    /* renamed from: h */
    public static final Property f7419h;

    /* renamed from: i */
    public static final Property f7420i;

    /* renamed from: j */
    public static final Property f7421j;

    /* renamed from: k */
    public static final Property f7422k;

    /* renamed from: l */
    public static final Property f7423l;

    /* renamed from: m */
    public static final Property f7424m;

    /* renamed from: n */
    public static final Property f7425n;

    /* renamed from: o */
    public static final Property f7426o;

    /* renamed from: p */
    public static final Property f7427p;

    /* renamed from: q */
    public static final Property f7428q;

    /* renamed from: r */
    public static final Property f7429r;

    /* renamed from: s */
    public static final Property f7430s;

    /* renamed from: t */
    public static final Property[] f7431t;

    /* renamed from: u */
    public static final Property f7432u;

    /* renamed from: v */
    public static final RelationInfo f7433v;

    /* renamed from: w */
    public static final RelationInfo f7434w;

    /* renamed from: x */
    public static final RelationInfo f7435x;

    /* renamed from: y */
    public static final RelationInfo f7436y;

    /* renamed from: z */
    public static final RelationInfo f7437z;

    /* renamed from: com.zykj.blackboard.core.data.dao.HeaderEntity_$a */
    public static final class C6683a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(HeaderEntity headerEntity) {
            return headerEntity.getId();
        }
    }

    static {
        HeaderEntity_ headerEntity_ = new HeaderEntity_();
        f7415d = headerEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(headerEntity_, 0, 1, cls, "id", true, "id");
        f7416e = property;
        Class cls2 = Integer.TYPE;
        Property property2 = new Property(headerEntity_, 1, 2, cls2, "version");
        f7417f = property2;
        Property property3 = new Property(headerEntity_, 2, 3, cls2, "width");
        f7418g = property3;
        Property property4 = new Property(headerEntity_, 3, 4, cls2, "height");
        f7419h = property4;
        Property property5 = new Property(headerEntity_, 4, 5, cls, "createDate");
        f7420i = property5;
        Property property6 = new Property(headerEntity_, 5, 6, cls, "updateDate");
        f7421j = property6;
        Property property7 = new Property(headerEntity_, 6, 7, cls, TypedValues.TransitionType.S_DURATION);
        f7422k = property7;
        Property property8 = new Property(headerEntity_, 7, 11, String.class, "convertUrl");
        f7423l = property8;
        Property property9 = new Property(headerEntity_, 8, 12, cls2, "defaultBackgroundColor");
        f7424m = property9;
        Property property10 = new Property(headerEntity_, 9, 13, cls2, "lastBackgroundColor");
        f7425n = property10;
        Property property11 = new Property(headerEntity_, 10, 9, cls, "pageId", true);
        f7426o = property11;
        Property property12 = new Property(headerEntity_, 11, 15, cls, "defaultBackgroundLineConfigId", true);
        f7427p = property12;
        Property property13 = new Property(headerEntity_, 12, 16, cls, "lastBackgroundLineConfigId", true);
        f7428q = property13;
        Property property14 = new Property(headerEntity_, 13, 10, cls, "authorId", true);
        f7429r = property14;
        Property property15 = new Property(headerEntity_, 14, 14, cls, "moveConfigId", true);
        f7430s = property15;
        f7431t = new Property[]{property, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12, property13, property14, property15};
        f7432u = property;
        f7433v = new RelationInfo(headerEntity_, PageEntity_.f7535d, property11, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(HeaderEntity headerEntity) {
                return headerEntity.page;
            }
        });
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = BackgroundLineConfigEntity_.f7240d;
        f7434w = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property12, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(HeaderEntity headerEntity) {
                return headerEntity.defaultBackgroundLineConfig;
            }
        });
        f7435x = new RelationInfo(headerEntity_, backgroundLineConfigEntity_, property13, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(HeaderEntity headerEntity) {
                return headerEntity.lastBackgroundLineConfig;
            }
        });
        AuthorEntity_ authorEntity_ = AuthorEntity_.f7220d;
        f7436y = new RelationInfo(headerEntity_, authorEntity_, property14, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.4
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(HeaderEntity headerEntity) {
                return headerEntity.author;
            }
        });
        f7437z = new RelationInfo(headerEntity_, MoveConfigEntity_.f7512d, property15, new ToOneGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(HeaderEntity headerEntity) {
                return headerEntity.moveConfig;
            }
        });
        f7411A = new RelationInfo(headerEntity_, authorEntity_, new ToManyGetter<HeaderEntity>() { // from class: com.zykj.blackboard.core.data.dao.HeaderEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(HeaderEntity headerEntity) {
                return headerEntity.provider;
            }
        }, 9);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7431t;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7412a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7413b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 6;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7414c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "HeaderEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "HeaderEntity";
    }
}
