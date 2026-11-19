package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor;
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
public final class BlackBoardEntity_ implements EntityInfo<BlackBoardEntity> {

    /* renamed from: a */
    public static final Class f7251a = BlackBoardEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7252b = new BlackBoardEntityCursor.C6647a();

    /* renamed from: c */
    public static final C6650a f7253c = new C6650a();

    /* renamed from: d */
    public static final BlackBoardEntity_ f7254d;

    /* renamed from: e */
    public static final Property f7255e;

    /* renamed from: f */
    public static final Property f7256f;

    /* renamed from: g */
    public static final Property[] f7257g;

    /* renamed from: h */
    public static final Property f7258h;

    /* renamed from: i */
    public static final RelationInfo f7259i;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntity_$a */
    public static final class C6650a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(BlackBoardEntity blackBoardEntity) {
            return blackBoardEntity.getId();
        }
    }

    static {
        BlackBoardEntity_ blackBoardEntity_ = new BlackBoardEntity_();
        f7254d = blackBoardEntity_;
        Property property = new Property(blackBoardEntity_, 0, 1, Long.TYPE, "id", true, "id");
        f7255e = property;
        Property property2 = new Property(blackBoardEntity_, 1, 2, String.class, "dir");
        f7256f = property2;
        f7257g = new Property[]{property, property2};
        f7258h = property;
        f7259i = new RelationInfo(blackBoardEntity_, PageEntity_.f7535d, new ToManyGetter<BlackBoardEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.1
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(BlackBoardEntity blackBoardEntity) {
                return blackBoardEntity.pages;
            }
        }, PageEntity_.f7541j, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7257g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7251a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7252b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 12;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7253c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "BlackBoardEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "BlackBoardEntity";
    }
}
