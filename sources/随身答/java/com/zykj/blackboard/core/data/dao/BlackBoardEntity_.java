package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor;
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
public final class BlackBoardEntity_ implements EntityInfo<BlackBoardEntity> {

    /* renamed from: a */
    public static final Class f8533a = BlackBoardEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8534b = new BlackBoardEntityCursor.C6964a();

    /* renamed from: c */
    public static final C6967a f8535c = new C6967a();

    /* renamed from: d */
    public static final BlackBoardEntity_ f8536d;

    /* renamed from: e */
    public static final Property f8537e;

    /* renamed from: f */
    public static final Property f8538f;

    /* renamed from: g */
    public static final Property[] f8539g;

    /* renamed from: h */
    public static final Property f8540h;

    /* renamed from: i */
    public static final RelationInfo f8541i;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntity_$a */
    public static final class C6967a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(BlackBoardEntity blackBoardEntity) {
            return blackBoardEntity.getId();
        }
    }

    static {
        BlackBoardEntity_ blackBoardEntity_ = new BlackBoardEntity_();
        f8536d = blackBoardEntity_;
        Property property = new Property(blackBoardEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f8537e = property;
        Property property2 = new Property(blackBoardEntity_, 1, 2, String.class, "dir");
        f8538f = property2;
        f8539g = new Property[]{property, property2};
        f8540h = property;
        f8541i = new RelationInfo(blackBoardEntity_, PageEntity_.f8817d, new ToManyGetter<BlackBoardEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.1
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(BlackBoardEntity blackBoardEntity) {
                return blackBoardEntity.pages;
            }
        }, PageEntity_.f8823j, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8539g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8533a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8534b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 12;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8535c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "BlackBoardEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "BlackBoardEntity";
    }
}
