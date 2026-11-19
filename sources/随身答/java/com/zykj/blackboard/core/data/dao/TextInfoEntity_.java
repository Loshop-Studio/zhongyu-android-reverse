package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.TextInfoEntityCursor;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class TextInfoEntity_ implements EntityInfo<TextInfoEntity> {

    /* renamed from: a */
    public static final Class f8858a = TextInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8859b = new TextInfoEntityCursor.C7036a();

    /* renamed from: c */
    public static final C7038a f8860c = new C7038a();

    /* renamed from: d */
    public static final TextInfoEntity_ f8861d;

    /* renamed from: e */
    public static final Property f8862e;

    /* renamed from: f */
    public static final Property f8863f;

    /* renamed from: g */
    public static final Property f8864g;

    /* renamed from: h */
    public static final Property f8865h;

    /* renamed from: i */
    public static final Property f8866i;

    /* renamed from: j */
    public static final Property f8867j;

    /* renamed from: k */
    public static final Property f8868k;

    /* renamed from: l */
    public static final Property[] f8869l;

    /* renamed from: m */
    public static final Property f8870m;

    /* renamed from: n */
    public static final RelationInfo f8871n;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntity_$a */
    public static final class C7038a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(TextInfoEntity textInfoEntity) {
            return textInfoEntity.getId();
        }
    }

    static {
        TextInfoEntity_ textInfoEntity_ = new TextInfoEntity_();
        f8861d = textInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(textInfoEntity_, 0, 1, cls, "id", true, "id");
        f8862e = property;
        Class cls2 = Float.TYPE;
        Property property2 = new Property(textInfoEntity_, 1, 2, cls2, "width");
        f8863f = property2;
        Class cls3 = Integer.TYPE;
        Property property3 = new Property(textInfoEntity_, 2, 3, cls3, TypedValues.Custom.S_COLOR);
        f8864g = property3;
        Property property4 = new Property(textInfoEntity_, 3, 4, cls2, "textSize");
        f8865h = property4;
        Property property5 = new Property(textInfoEntity_, 4, 5, cls3, "style");
        f8866i = property5;
        Property property6 = new Property(textInfoEntity_, 5, 6, String.class, "content");
        f8867j = property6;
        Property property7 = new Property(textInfoEntity_, 6, 7, cls, "recordId", true);
        f8868k = property7;
        f8869l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f8870m = property;
        f8871n = new RelationInfo(textInfoEntity_, TextRecordEntity_.f8880d, property7, new ToOneGetter<TextInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.TextInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TextInfoEntity textInfoEntity) {
                return textInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8869l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8858a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8859b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 11;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8860c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "TextInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "TextInfoEntity";
    }
}
