package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.TextRecordEntityCursor;
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
public final class TextRecordEntity_ implements EntityInfo<TextRecordEntity> {

    /* renamed from: a */
    public static final Class f7595a = TextRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7596b = new TextRecordEntityCursor.C6722a();

    /* renamed from: c */
    public static final C6725a f7597c = new C6725a();

    /* renamed from: d */
    public static final TextRecordEntity_ f7598d;

    /* renamed from: e */
    public static final Property f7599e;

    /* renamed from: f */
    public static final Property f7600f;

    /* renamed from: g */
    public static final Property f7601g;

    /* renamed from: h */
    public static final Property f7602h;

    /* renamed from: i */
    public static final Property[] f7603i;

    /* renamed from: j */
    public static final Property f7604j;

    /* renamed from: k */
    public static final RelationInfo f7605k;

    /* renamed from: l */
    public static final RelationInfo f7606l;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntity_$a */
    public static final class C6725a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(TextRecordEntity textRecordEntity) {
            return textRecordEntity.getId();
        }
    }

    static {
        TextRecordEntity_ textRecordEntity_ = new TextRecordEntity_();
        f7598d = textRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textRecordEntity_, 0, 1, cls, "id", true, "id");
        f7599e = property;
        Property property2 = new Property(textRecordEntity_, 1, 2, String.class, "fileName");
        f7600f = property2;
        Property property3 = new Property(textRecordEntity_, 2, 3, String.class, "validate");
        f7601g = property3;
        Property property4 = new Property(textRecordEntity_, 3, 4, cls, "recordId", true);
        f7602h = property4;
        f7603i = new Property[]{property, property2, property3, property4};
        f7604j = property;
        f7605k = new RelationInfo(textRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f7606l = new RelationInfo(textRecordEntity_, TextInfoEntity_.f7579d, new ToManyGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(TextRecordEntity textRecordEntity) {
                return textRecordEntity.textInfoEntityList;
            }
        }, 2);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7603i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7595a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7596b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 2;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7597c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "TextRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "TextRecordEntity";
    }
}
