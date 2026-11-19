package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.PageEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class PageEntity_ implements EntityInfo<PageEntity> {

    /* renamed from: c */
    public static final Class f18375c = PageEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18376d = new PageEntityCursor.C8394a();

    /* renamed from: e */
    public static final C8398a f18377e = new C8398a();

    /* renamed from: f */
    public static final PageEntity_ f18378f;

    /* renamed from: g */
    public static final Property f18379g;

    /* renamed from: h */
    public static final Property f18380h;

    /* renamed from: i */
    public static final Property f18381i;

    /* renamed from: j */
    public static final Property f18382j;

    /* renamed from: k */
    public static final Property f18383k;

    /* renamed from: l */
    public static final Property f18384l;

    /* renamed from: m */
    public static final Property f18385m;

    /* renamed from: n */
    public static final Property f18386n;

    /* renamed from: o */
    public static final Property[] f18387o;

    /* renamed from: p */
    public static final Property f18388p;

    /* renamed from: q */
    public static final RelationInfo f18389q;

    /* renamed from: r */
    public static final RelationInfo f18390r;

    /* renamed from: s */
    public static final RelationInfo f18391s;

    /* renamed from: com.zykj.blackboard.core.data.dao.PageEntity_$a */
    public static final class C8398a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(PageEntity pageEntity) {
            return pageEntity.m14241f();
        }
    }

    static {
        PageEntity_ pageEntity_ = new PageEntity_();
        f18378f = pageEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(pageEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18379g = property;
        Property property2 = new Property(pageEntity_, 1, 2, String.class, "dirName");
        f18380h = property2;
        Property property3 = new Property(pageEntity_, 2, 3, Boolean.TYPE, "isChange");
        f18381i = property3;
        Property property4 = new Property(pageEntity_, 3, 4, String.class, "commandFileName");
        f18382j = property4;
        Property property5 = new Property(pageEntity_, 4, 5, Integer.TYPE, "commandIndex");
        f18383k = property5;
        Property property6 = new Property(pageEntity_, 5, 6, cls, "blackBoardEntityId", true);
        f18384l = property6;
        Property property7 = new Property(pageEntity_, 6, 7, cls, "recordEntityId", true);
        f18385m = property7;
        Property property8 = new Property(pageEntity_, 7, 8, cls, "headerEntityId", true);
        f18386n = property8;
        f18387o = new Property[]{property, property2, property3, property4, property5, property6, property7, property8};
        f18388p = property;
        f18389q = new RelationInfo(pageEntity_, BlackBoardEntity_.f18097f, property6, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
        f18390r = new RelationInfo(pageEntity_, RecordEntity_.f18398f, property7, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(PageEntity pageEntity) {
                return pageEntity.recordEntity;
            }
        });
        f18391s = new RelationInfo(pageEntity_, HeaderEntity_.f18260f, property8, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.PageEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(PageEntity pageEntity) {
                return pageEntity.headerEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "PageEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18387o;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18375c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18376d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 14;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18377e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "PageEntity";
    }
}
