package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class FileInfoEntity_ implements EntityInfo<FileInfoEntity> {

    /* renamed from: a */
    public static final Class f8589a = FileInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8590b = new FileInfoEntityCursor.C6975a();

    /* renamed from: c */
    public static final C6977a f8591c = new C6977a();

    /* renamed from: d */
    public static final FileInfoEntity_ f8592d;

    /* renamed from: e */
    public static final Property f8593e;

    /* renamed from: f */
    public static final Property f8594f;

    /* renamed from: g */
    public static final Property f8595g;

    /* renamed from: h */
    public static final Property f8596h;

    /* renamed from: i */
    public static final Property f8597i;

    /* renamed from: j */
    public static final Property f8598j;

    /* renamed from: k */
    public static final Property[] f8599k;

    /* renamed from: l */
    public static final Property f8600l;

    /* renamed from: m */
    public static final RelationInfo f8601m;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntity_$a */
    public static final class C6977a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(FileInfoEntity fileInfoEntity) {
            return fileInfoEntity.getId();
        }
    }

    static {
        FileInfoEntity_ fileInfoEntity_ = new FileInfoEntity_();
        f8592d = fileInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileInfoEntity_, 0, 1, cls, "id", true, "id");
        f8593e = property;
        Property property2 = new Property(fileInfoEntity_, 1, 2, String.class, "fileName");
        f8594f = property2;
        Class cls2 = Integer.TYPE;
        Property property3 = new Property(fileInfoEntity_, 2, 3, cls2, "width");
        f8595g = property3;
        Property property4 = new Property(fileInfoEntity_, 3, 4, cls2, "height");
        f8596h = property4;
        Property property5 = new Property(fileInfoEntity_, 4, 5, String.class, "validate");
        f8597i = property5;
        Property property6 = new Property(fileInfoEntity_, 5, 6, cls, "recordId", true);
        f8598j = property6;
        f8599k = new Property[]{property, property2, property3, property4, property5, property6};
        f8600l = property;
        f8601m = new RelationInfo(fileInfoEntity_, FileRecordEntity_.f8610d, property6, new ToOneGetter<FileInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(FileInfoEntity fileInfoEntity) {
                return fileInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8599k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8589a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8590b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 7;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8591c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "FileInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "FileInfoEntity";
    }
}
