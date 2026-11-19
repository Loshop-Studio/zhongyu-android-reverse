package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TextInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class TextInfoEntity_ implements EntityInfo<TextInfoEntity> {

    /* renamed from: a */
    public static final Class f7576a = TextInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7577b = new TextInfoEntityCursor.C6719a();

    /* renamed from: c */
    public static final C6721a f7578c = new C6721a();

    /* renamed from: d */
    public static final TextInfoEntity_ f7579d;

    /* renamed from: e */
    public static final Property f7580e;

    /* renamed from: f */
    public static final Property f7581f;

    /* renamed from: g */
    public static final Property f7582g;

    /* renamed from: h */
    public static final Property f7583h;

    /* renamed from: i */
    public static final Property f7584i;

    /* renamed from: j */
    public static final Property f7585j;

    /* renamed from: k */
    public static final Property f7586k;

    /* renamed from: l */
    public static final Property[] f7587l;

    /* renamed from: m */
    public static final Property f7588m;

    /* renamed from: n */
    public static final RelationInfo f7589n;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntity_$a */
    public static final class C6721a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(TextInfoEntity textInfoEntity) {
            return textInfoEntity.getId();
        }
    }

    static {
        TextInfoEntity_ textInfoEntity_ = new TextInfoEntity_();
        f7579d = textInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textInfoEntity_, 0, 1, cls, "id", true, "id");
        f7580e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(textInfoEntity_, 1, 2, cls2, "width");
        f7581f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(textInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f7582g = property3;
        Property property4 = new Property(textInfoEntity_, 3, 4, cls2, "textSize");
        f7583h = property4;
        Property property5 = new Property(textInfoEntity_, 4, 5, cls3, "style");
        f7584i = property5;
        Property property6 = new Property(textInfoEntity_, 5, 6, String.class, "content");
        f7585j = property6;
        Property property7 = new Property(textInfoEntity_, 6, 7, cls, "recordId", true);
        f7586k = property7;
        f7587l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f7588m = property;
        f7589n = new RelationInfo(textInfoEntity_, TextRecordEntity_.f7598d, property7, new ToOneGetter<TextInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TextInfoEntity textInfoEntity) {
                return textInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7587l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7576a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7577b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 11;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7578c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "TextInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "TextInfoEntity";
    }
}
