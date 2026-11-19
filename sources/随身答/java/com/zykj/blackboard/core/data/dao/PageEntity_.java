package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.PageEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class PageEntity_ implements EntityInfo<PageEntity> {

    /* renamed from: a */
    public static final Class f8814a = PageEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8815b = new PageEntityCursor.C7014a();

    /* renamed from: c */
    public static final C7018a f8816c = new C7018a();

    /* renamed from: d */
    public static final PageEntity_ f8817d;

    /* renamed from: e */
    public static final Property f8818e;

    /* renamed from: f */
    public static final Property f8819f;

    /* renamed from: g */
    public static final Property f8820g;

    /* renamed from: h */
    public static final Property f8821h;

    /* renamed from: i */
    public static final Property f8822i;

    /* renamed from: j */
    public static final Property f8823j;

    /* renamed from: k */
    public static final Property f8824k;

    /* renamed from: l */
    public static final Property f8825l;

    /* renamed from: m */
    public static final Property[] f8826m;

    /* renamed from: n */
    public static final Property f8827n;

    /* renamed from: o */
    public static final RelationInfo f8828o;

    /* renamed from: p */
    public static final RelationInfo f8829p;

    /* renamed from: q */
    public static final RelationInfo f8830q;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntity_$a */
    public static final class C7018a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(PageEntity pageEntity) {
            return pageEntity.getId();
        }
    }

    static {
        PageEntity_ pageEntity_ = new PageEntity_();
        f8817d = pageEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(pageEntity_, 0, 1, cls, "id", true, "id");
        f8818e = property;
        Property property2 = new Property(pageEntity_, 1, 2, String.class, "dirName");
        f8819f = property2;
        Property property3 = new Property(pageEntity_, 2, 3, Boolean.TYPE, "isChange");
        f8820g = property3;
        Property property4 = new Property(pageEntity_, 3, 4, String.class, "commandFileName");
        f8821h = property4;
        Property property5 = new Property(pageEntity_, 4, 5, Integer.TYPE, "commandIndex");
        f8822i = property5;
        Property property6 = new Property(pageEntity_, 5, 6, cls, "blackBoardEntityId", true);
        f8823j = property6;
        Property property7 = new Property(pageEntity_, 6, 7, cls, "recordEntityId", true);
        f8824k = property7;
        Property property8 = new Property(pageEntity_, 7, 8, cls, "headerEntityId", true);
        f8825l = property8;
        f8826m = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f8827n = property;
        f8828o = new RelationInfo(pageEntity_, BlackBoardEntity_.f8536d, property6, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
        f8829p = new RelationInfo(pageEntity_, RecordEntity_.f8837d, property7, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(PageEntity pageEntity) {
                return pageEntity.recordEntity;
            }
        });
        f8830q = new RelationInfo(pageEntity_, HeaderEntity_.f8697d, property8, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(PageEntity pageEntity) {
                return pageEntity.headerEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8826m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8814a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8815b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 14;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8816c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "PageEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "PageEntity";
    }
}
