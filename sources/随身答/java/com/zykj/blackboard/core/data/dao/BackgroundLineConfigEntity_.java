package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntityCursor;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class BackgroundLineConfigEntity_ implements EntityInfo<BackgroundLineConfigEntity> {

    /* renamed from: a */
    public static final Class f8519a = BackgroundLineConfigEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8520b = new BackgroundLineConfigEntityCursor.C6962a();

    /* renamed from: c */
    public static final C6963a f8521c = new C6963a();

    /* renamed from: d */
    public static final BackgroundLineConfigEntity_ f8522d;

    /* renamed from: e */
    public static final Property f8523e;

    /* renamed from: f */
    public static final Property f8524f;

    /* renamed from: g */
    public static final Property f8525g;

    /* renamed from: h */
    public static final Property f8526h;

    /* renamed from: i */
    public static final Property f8527i;

    /* renamed from: j */
    public static final Property[] f8528j;

    /* renamed from: k */
    public static final Property f8529k;

    /* renamed from: com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_$a */
    public static final class C6963a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(BackgroundLineConfigEntity backgroundLineConfigEntity) {
            return backgroundLineConfigEntity.getId();
        }
    }

    static {
        BackgroundLineConfigEntity_ backgroundLineConfigEntity_ = new BackgroundLineConfigEntity_();
        f8522d = backgroundLineConfigEntity_;
        Property property = new Property(backgroundLineConfigEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8523e = property;
        Class cls = Integer.TYPE;
        Property property2 = new Property(backgroundLineConfigEntity_, 1, 2, cls, "lineColor");
        f8524f = property2;
        Class cls2 = Float.TYPE;
        Property property3 = new Property(backgroundLineConfigEntity_, 2, 3, cls2, "lineSpace");
        f8525g = property3;
        Property property4 = new Property(backgroundLineConfigEntity_, 3, 4, cls, "lineType", false, "lineType", BackgroundLineTypeEnumConverter.class, EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.class);
        f8526h = property4;
        Property property5 = new Property(backgroundLineConfigEntity_, 4, 5, cls2, "lineWidth");
        f8527i = property5;
        f8528j = new Property[]{property, property2, property3, property4, property5};
        f8529k = property;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8528j;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8519a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8520b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 24;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8521c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "BackgroundLineConfigEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "BackgroundLineConfigEntity";
    }
}
