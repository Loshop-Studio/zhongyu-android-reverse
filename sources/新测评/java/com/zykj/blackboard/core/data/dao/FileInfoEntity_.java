package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.FileInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class FileInfoEntity_ implements EntityInfo<FileInfoEntity> {

    /* renamed from: a */
    public static final Class f7307a = FileInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7308b = new FileInfoEntityCursor.C6658a();

    /* renamed from: c */
    public static final C6660a f7309c = new C6660a();

    /* renamed from: d */
    public static final FileInfoEntity_ f7310d;

    /* renamed from: e */
    public static final Property f7311e;

    /* renamed from: f */
    public static final Property f7312f;

    /* renamed from: g */
    public static final Property f7313g;

    /* renamed from: h */
    public static final Property f7314h;

    /* renamed from: i */
    public static final Property f7315i;

    /* renamed from: j */
    public static final Property f7316j;

    /* renamed from: k */
    public static final Property[] f7317k;

    /* renamed from: l */
    public static final Property f7318l;

    /* renamed from: m */
    public static final RelationInfo f7319m;

    /* renamed from: com.zykj.blackboard.core.data.dao.FileInfoEntity_$a */
    public static final class C6660a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(FileInfoEntity fileInfoEntity) {
            return fileInfoEntity.getId();
        }
    }

    static {
        FileInfoEntity_ fileInfoEntity_ = new FileInfoEntity_();
        f7310d = fileInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(fileInfoEntity_, 0, 1, cls, "id", true, "id");
        f7311e = property;
        Property property2 = new Property(fileInfoEntity_, 1, 2, String.class, "fileName");
        f7312f = property2;
        Class cls2 = Integer.TYPE;
        Property property3 = new Property(fileInfoEntity_, 2, 3, cls2, "width");
        f7313g = property3;
        Property property4 = new Property(fileInfoEntity_, 3, 4, cls2, "height");
        f7314h = property4;
        Property property5 = new Property(fileInfoEntity_, 4, 5, String.class, "validate");
        f7315i = property5;
        Property property6 = new Property(fileInfoEntity_, 5, 6, cls, "recordId", true);
        f7316j = property6;
        f7317k = new Property[]{property, property2, property3, property4, property5, property6};
        f7318l = property;
        f7319m = new RelationInfo(fileInfoEntity_, FileRecordEntity_.f7328d, property6, new ToOneGetter<FileInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.FileInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(FileInfoEntity fileInfoEntity) {
                return fileInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7317k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7307a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7308b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 7;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7309c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "FileInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "FileInfoEntity";
    }
}
