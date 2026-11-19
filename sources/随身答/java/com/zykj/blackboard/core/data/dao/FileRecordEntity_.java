package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class FileRecordEntity_ implements EntityInfo<FileRecordEntity> {

    /* renamed from: a */
    public static final Class f8607a = FileRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8608b = new FileRecordEntityCursor.C6978a();

    /* renamed from: c */
    public static final C6981a f8609c = new C6981a();

    /* renamed from: d */
    public static final FileRecordEntity_ f8610d;

    /* renamed from: e */
    public static final Property f8611e;

    /* renamed from: f */
    public static final Property f8612f;

    /* renamed from: g */
    public static final Property f8613g;

    /* renamed from: h */
    public static final Property f8614h;

    /* renamed from: i */
    public static final Property[] f8615i;

    /* renamed from: j */
    public static final Property f8616j;

    /* renamed from: k */
    public static final RelationInfo f8617k;

    /* renamed from: l */
    public static final RelationInfo f8618l;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntity_$a */
    public static final class C6981a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(FileRecordEntity fileRecordEntity) {
            return fileRecordEntity.getId();
        }
    }

    static {
        FileRecordEntity_ fileRecordEntity_ = new FileRecordEntity_();
        f8610d = fileRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileRecordEntity_, 0, 1, cls, "id", true, "id");
        f8611e = property;
        Property property2 = new Property(fileRecordEntity_, 1, 2, String.class, "fileName");
        f8612f = property2;
        Property property3 = new Property(fileRecordEntity_, 2, 3, String.class, "validate");
        f8613g = property3;
        Property property4 = new Property(fileRecordEntity_, 3, 4, cls, "recordId", true);
        f8614h = property4;
        f8615i = new Property[]{property, property2, property3, property4};
        f8616j = property;
        f8617k = new RelationInfo(fileRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f8618l = new RelationInfo(fileRecordEntity_, FileInfoEntity_.f8592d, new ToManyGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.fileInfoEntity;
            }
        }, 1);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8615i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8607a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8608b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 1;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8609c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "FileRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "FileRecordEntity";
    }
}
