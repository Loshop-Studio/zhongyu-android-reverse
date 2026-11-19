package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class BackgroundLineConfigEntity_ implements EntityInfo<BackgroundLineConfigEntity> {

    /* renamed from: c */
    public static final Class f18080c = BackgroundLineConfigEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18081d = new BackgroundLineConfigEntityCursor.C8342a();

    /* renamed from: e */
    public static final C8343a f18082e = new C8343a();

    /* renamed from: f */
    public static final BackgroundLineConfigEntity_ f18083f;

    /* renamed from: g */
    public static final Property f18084g;

    /* renamed from: h */
    public static final Property f18085h;

    /* renamed from: i */
    public static final Property f18086i;

    /* renamed from: j */
    public static final Property f18087j;

    /* renamed from: k */
    public static final Property f18088k;

    /* renamed from: l */
    public static final Property[] f18089l;

    /* renamed from: m */
    public static final Property f18090m;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_$a */
    public static final class C8343a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(BackgroundLineConfigEntity backgroundLineConfigEntity) {
            return backgroundLineConfigEntity.m14029a();
        }
    }

    static {
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = new BackgroundLineConfigEntity_();
        f18083f = backgroundLineConfigEntity_;
        Property property = new Property(backgroundLineConfigEntity_, 0, 1, Long.TYPE, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18084g = property;
        Class cls = Integer.TYPE;
        Property property2 = new Property(backgroundLineConfigEntity_, 1, 2, cls, "lineColor");
        f18085h = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(backgroundLineConfigEntity_, 2, 3, cls2, "lineSpace");
        f18086i = property3;
        Property property4 = new Property(backgroundLineConfigEntity_, 3, 4, cls, "lineType", false, "lineType", BackgroundLineTypeEnumConverter.class, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.class);
        f18087j = property4;
        Property property5 = new Property(backgroundLineConfigEntity_, 4, 5, cls2, "lineWidth");
        f18088k = property5;
        f18089l = new Property[]{property, property2, property3, property4, property5};
        f18090m = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "BackgroundLineConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18089l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18080c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18081d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 24;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18082e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "BackgroundLineConfigEntity";
    }
}
