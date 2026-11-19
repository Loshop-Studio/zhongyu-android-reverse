package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class FileInfoEntity_ implements EntityInfo<FileInfoEntity> {

    /* renamed from: c */
    public static final Class f18150c = FileInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18151d = new FileInfoEntityCursor.C8355a();

    /* renamed from: e */
    public static final C8357a f18152e = new C8357a();

    /* renamed from: f */
    public static final FileInfoEntity_ f18153f;

    /* renamed from: g */
    public static final Property f18154g;

    /* renamed from: h */
    public static final Property f18155h;

    /* renamed from: i */
    public static final Property f18156i;

    /* renamed from: j */
    public static final Property f18157j;

    /* renamed from: k */
    public static final Property f18158k;

    /* renamed from: l */
    public static final Property f18159l;

    /* renamed from: m */
    public static final Property[] f18160m;

    /* renamed from: n */
    public static final Property f18161n;

    /* renamed from: o */
    public static final RelationInfo f18162o;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntity_$a */
    public static final class C8357a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(FileInfoEntity fileInfoEntity) {
            return fileInfoEntity.m14080c();
        }
    }

    static {
        FileInfoEntity_ fileInfoEntity_ = new FileInfoEntity_();
        f18153f = fileInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18154g = property;
        Property property2 = new Property(fileInfoEntity_, 1, 2, String.class, "fileName");
        f18155h = property2;
        Class cls2 = Integer.TYPE;
        Property property3 = new Property(fileInfoEntity_, 2, 3, cls2, "width");
        f18156i = property3;
        Property property4 = new Property(fileInfoEntity_, 3, 4, cls2, "height");
        f18157j = property4;
        Property property5 = new Property(fileInfoEntity_, 4, 5, String.class, "validate");
        f18158k = property5;
        Property property6 = new Property(fileInfoEntity_, 5, 6, cls, "recordId", true);
        f18159l = property6;
        f18160m = new Property[]{property, property2, property3, property4, property5, property6};
        f18161n = property;
        f18162o = new RelationInfo(fileInfoEntity_, FileRecordEntity_.f18171f, property6, new ToOneGetter<FileInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(FileInfoEntity fileInfoEntity) {
                return fileInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "FileInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18160m;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18150c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18151d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 7;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18152e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "FileInfoEntity";
    }
}
