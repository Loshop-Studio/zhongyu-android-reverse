package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.BlackBoardEntityCursor;
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
public final class BlackBoardEntity_ implements EntityInfo<BlackBoardEntity> {

    /* renamed from: c */
    public static final Class f18094c = BlackBoardEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18095d = new BlackBoardEntityCursor.C8344a();

    /* renamed from: e */
    public static final C8347a f18096e = new C8347a();

    /* renamed from: f */
    public static final BlackBoardEntity_ f18097f;

    /* renamed from: g */
    public static final Property f18098g;

    /* renamed from: h */
    public static final Property f18099h;

    /* renamed from: i */
    public static final Property[] f18100i;

    /* renamed from: j */
    public static final Property f18101j;

    /* renamed from: k */
    public static final RelationInfo f18102k;

    /* renamed from: com.zykj.blackboard.core.data.dao.BlackBoardEntity_$a */
    public static final class C8347a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(BlackBoardEntity blackBoardEntity) {
            return blackBoardEntity.m14040b();
        }
    }

    static {
        BlackBoardEntity_ blackBoardEntity_ = new BlackBoardEntity_();
        f18097f = blackBoardEntity_;
        Property property = new Property(blackBoardEntity_, 0, 1, Long.TYPE, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18098g = property;
        Property property2 = new Property(blackBoardEntity_, 1, 2, String.class, "dir");
        f18099h = property2;
        f18100i = new Property[]{property, property2};
        f18101j = property;
        f18102k = new RelationInfo(blackBoardEntity_, PageEntity_.f18378f, new ToManyGetter<BlackBoardEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.1
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(BlackBoardEntity blackBoardEntity) {
                return blackBoardEntity.pages;
            }
        }, PageEntity_.f18384l, new ToOneGetter<PageEntity>() { // from class: com.zykj.blackboard.core.data.dao.BlackBoardEntity_.2
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(PageEntity pageEntity) {
                return pageEntity.blackBoardEntity;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "BlackBoardEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18100i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18094c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18095d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 12;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18096e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "BlackBoardEntity";
    }
}
