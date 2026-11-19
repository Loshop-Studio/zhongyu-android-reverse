package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.PageEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class PageEntity_ implements EntityInfo<PageEntity> {

    /* renamed from: a */
    public static final Class f7532a = PageEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7533b = new PageEntityCursor.C6697a();

    /* renamed from: c */
    public static final C6701a f7534c = new C6701a();

    /* renamed from: d */
    public static final PageEntity_ f7535d;

    /* renamed from: e */
    public static final Property f7536e;

    /* renamed from: f */
    public static final Property f7537f;

    /* renamed from: g */
    public static final Property f7538g;

    /* renamed from: h */
    public static final Property f7539h;

    /* renamed from: i */
    public static final Property f7540i;

    /* renamed from: j */
    public static final Property f7541j;

    /* renamed from: k */
    public static final Property f7542k;

    /* renamed from: l */
    public static final Property f7543l;

    /* renamed from: m */
    public static final Property[] f7544m;

    /* renamed from: n */
    public static final Property f7545n;

    /* renamed from: o */
    public static final RelationInfo f7546o;

    /* renamed from: p */
    public static final RelationInfo f7547p;

    /* renamed from: q */
    public static final RelationInfo f7548q;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntity_$a */
    public static final class C6701a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(PageEntity pageEntity) {
            return pageEntity.getId();
        }
    }

    static {
        PageEntity_ pageEntity_ = new PageEntity_();
        f7535d = pageEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(pageEntity_, 0, 1, cls, "id", true, "id");
        f7536e = property;
        Property property2 = new Property(pageEntity_, 1, 2, String.class, "dirName");
        f7537f = property2;
        Property property3 = new Property(pageEntity_, 2, 3, Boolean.TYPE, "isChange");
        f7538g = property3;
        Property property4 = new Property(pageEntity_, 3, 4, String.class, "commandFileName");
        f7539h = property4;
        Property property5 = new Property(pageEntity_, 4, 5, Integer.TYPE, "commandIndex");
        f7540i = property5;
        Property property6 = new Property(pageEntity_, 5, 6, cls, "blackBoardEntityId", true);
        f7541j = property6;
        Property property7 = new Property(pageEntity_, 6, 7, cls, "recordEntityId", true);
        f7542k = property7;
        Property property8 = new Property(pageEntity_, 7, 8, cls, "headerEntityId", true);
        f7543l = property8;
        f7544m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f7545n = property;
        f7546o = new RelationInfo(pageEntity_, BlackBoardEntity_.f7254d, property6, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
        f7547p = new RelationInfo(pageEntity_, RecordEntity_.f7555d, property7, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(PageEntity pageEntity) {
                return pageEntity.recordEntity;
            }
        });
        f7548q = new RelationInfo(pageEntity_, HeaderEntity_.f7415d, property8, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(PageEntity pageEntity) {
                return pageEntity.headerEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7544m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7532a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7533b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 14;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7534c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "PageEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "PageEntity";
    }
}
