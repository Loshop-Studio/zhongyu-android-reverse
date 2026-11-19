package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor;
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
public final class CommandRecordEntity_ implements EntityInfo<CommandRecordEntity> {

    /* renamed from: c */
    public static final Class f18131c = CommandRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18132d = new CommandRecordEntityCursor.C8351a();

    /* renamed from: e */
    public static final C8354a f18133e = new C8354a();

    /* renamed from: f */
    public static final CommandRecordEntity_ f18134f;

    /* renamed from: g */
    public static final Property f18135g;

    /* renamed from: h */
    public static final Property f18136h;

    /* renamed from: i */
    public static final Property f18137i;

    /* renamed from: j */
    public static final Property f18138j;

    /* renamed from: k */
    public static final Property[] f18139k;

    /* renamed from: l */
    public static final Property f18140l;

    /* renamed from: m */
    public static final RelationInfo f18141m;

    /* renamed from: n */
    public static final RelationInfo f18142n;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntity_$a */
    public static final class C8354a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(CommandRecordEntity commandRecordEntity) {
            return commandRecordEntity.m14067c();
        }
    }

    static {
        CommandRecordEntity_ commandRecordEntity_ = new CommandRecordEntity_();
        f18134f = commandRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18135g = property;
        Property property2 = new Property(commandRecordEntity_, 1, 2, String.class, "fileName");
        f18136h = property2;
        Property property3 = new Property(commandRecordEntity_, 2, 3, String.class, "validate");
        f18137i = property3;
        Property property4 = new Property(commandRecordEntity_, 3, 4, cls, "recordId", true);
        f18138j = property4;
        f18139k = new Property[]{property, property2, property3, property4};
        f18140l = property;
        f18141m = new RelationInfo(commandRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f18142n = new RelationInfo(commandRecordEntity_, CommandInfoEntity_.f18115f, new ToManyGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.commandInfoEntity;
            }
        }, 8);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "CommandRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18139k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18131c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18132d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 17;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18133e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "CommandRecordEntity";
    }
}
