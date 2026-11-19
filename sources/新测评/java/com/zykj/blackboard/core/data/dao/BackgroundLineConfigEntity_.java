package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntity_ implements EntityInfo<BackgroundLineConfigEntity> {

    /* renamed from: a */
    public static final Class f7237a = BackgroundLineConfigEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7238b = new BackgroundLineConfigEntityCursor.C6645a();

    /* renamed from: c */
    public static final C6646a f7239c = new C6646a();

    /* renamed from: d */
    public static final BackgroundLineConfigEntity_ f7240d;

    /* renamed from: e */
    public static final Property f7241e;

    /* renamed from: f */
    public static final Property f7242f;

    /* renamed from: g */
    public static final Property f7243g;

    /* renamed from: h */
    public static final Property f7244h;

    /* renamed from: i */
    public static final Property f7245i;

    /* renamed from: j */
    public static final Property[] f7246j;

    /* renamed from: k */
    public static final Property f7247k;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_$a */
    public static final class C6646a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(BackgroundLineConfigEntity backgroundLineConfigEntity) {
            return backgroundLineConfigEntity.getId();
        }
    }

    static {
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = new BackgroundLineConfigEntity_();
        f7240d = backgroundLineConfigEntity_;
        Property property = new Property(backgroundLineConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f7241e = property;
        Class cls = Integer.TYPE;
        Property property2 = new Property(backgroundLineConfigEntity_, 1, 2, cls, "lineColor");
        f7242f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(backgroundLineConfigEntity_, 2, 3, cls2, "lineSpace");
        f7243g = property3;
        Property property4 = new Property(backgroundLineConfigEntity_, 3, 4, cls, "lineType", false, "lineType", BackgroundLineTypeEnumConverter.class, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.class);
        f7244h = property4;
        Property property5 = new Property(backgroundLineConfigEntity_, 4, 5, cls2, "lineWidth");
        f7245i = property5;
        f7246j = new Property[]{property, property2, property3, property4, property5};
        f7247k = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7246j;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7237a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7238b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 24;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7239c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "BackgroundLineConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "BackgroundLineConfigEntity";
    }
}
