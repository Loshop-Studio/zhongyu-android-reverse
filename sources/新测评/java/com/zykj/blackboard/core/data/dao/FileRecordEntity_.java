package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileRecordEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import java.util.List;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class FileRecordEntity_ implements EntityInfo<FileRecordEntity> {

    /* renamed from: a */
    public static final Class f7325a = FileRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7326b = new FileRecordEntityCursor.C6661a();

    /* renamed from: c */
    public static final C6664a f7327c = new C6664a();

    /* renamed from: d */
    public static final FileRecordEntity_ f7328d;

    /* renamed from: e */
    public static final Property f7329e;

    /* renamed from: f */
    public static final Property f7330f;

    /* renamed from: g */
    public static final Property f7331g;

    /* renamed from: h */
    public static final Property f7332h;

    /* renamed from: i */
    public static final Property[] f7333i;

    /* renamed from: j */
    public static final Property f7334j;

    /* renamed from: k */
    public static final RelationInfo f7335k;

    /* renamed from: l */
    public static final RelationInfo f7336l;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileRecordEntity_$a */
    public static final class C6664a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(FileRecordEntity fileRecordEntity) {
            return fileRecordEntity.getId();
        }
    }

    static {
        FileRecordEntity_ fileRecordEntity_ = new FileRecordEntity_();
        f7328d = fileRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileRecordEntity_, 0, 1, cls, "id", true, "id");
        f7329e = property;
        Property property2 = new Property(fileRecordEntity_, 1, 2, String.class, "fileName");
        f7330f = property2;
        Property property3 = new Property(fileRecordEntity_, 2, 3, String.class, "validate");
        f7331g = property3;
        Property property4 = new Property(fileRecordEntity_, 3, 4, cls, "recordId", true);
        f7332h = property4;
        f7333i = new Property[]{property, property2, property3, property4};
        f7334j = property;
        f7335k = new RelationInfo(fileRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f7336l = new RelationInfo(fileRecordEntity_, FileInfoEntity_.f7310d, new ToManyGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.fileInfoEntity;
            }
        }, 1);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7333i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7325a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7326b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 1;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7327c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "FileRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "FileRecordEntity";
    }
}
