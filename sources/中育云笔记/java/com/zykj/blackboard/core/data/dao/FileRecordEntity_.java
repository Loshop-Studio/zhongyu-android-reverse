package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileRecordEntityCursor;
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
public final class FileRecordEntity_ implements EntityInfo<FileRecordEntity> {

    /* renamed from: c */
    public static final Class f18168c = FileRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18169d = new FileRecordEntityCursor.C8358a();

    /* renamed from: e */
    public static final C8361a f18170e = new C8361a();

    /* renamed from: f */
    public static final FileRecordEntity_ f18171f;

    /* renamed from: g */
    public static final Property f18172g;

    /* renamed from: h */
    public static final Property f18173h;

    /* renamed from: i */
    public static final Property f18174i;

    /* renamed from: j */
    public static final Property f18175j;

    /* renamed from: k */
    public static final Property[] f18176k;

    /* renamed from: l */
    public static final Property f18177l;

    /* renamed from: m */
    public static final RelationInfo f18178m;

    /* renamed from: n */
    public static final RelationInfo f18179n;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntity_$a */
    public static final class C8361a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(FileRecordEntity fileRecordEntity) {
            return fileRecordEntity.m14093c();
        }
    }

    static {
        FileRecordEntity_ fileRecordEntity_ = new FileRecordEntity_();
        f18171f = fileRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18172g = property;
        Property property2 = new Property(fileRecordEntity_, 1, 2, String.class, "fileName");
        f18173h = property2;
        Property property3 = new Property(fileRecordEntity_, 2, 3, String.class, "validate");
        f18174i = property3;
        Property property4 = new Property(fileRecordEntity_, 3, 4, cls, "recordId", true);
        f18175j = property4;
        f18176k = new Property[]{property, property2, property3, property4};
        f18177l = property;
        f18178m = new RelationInfo(fileRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f18179n = new RelationInfo(fileRecordEntity_, FileInfoEntity_.f18153f, new ToManyGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.fileInfoEntity;
            }
        }, 1);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "FileRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18176k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18168c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18169d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 1;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18170e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "FileRecordEntity";
    }
}
