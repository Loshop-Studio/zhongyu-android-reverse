package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import org.android.agoo.common.AgooConstants;
import p225kc.InterfaceC9909b;
import p225kc.InterfaceC9910c;

/* loaded from: classes5.dex */
public final class CommandInfoEntity_ implements EntityInfo<CommandInfoEntity> {

    /* renamed from: c */
    public static final Class f18112c = CommandInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18113d = new CommandInfoEntityCursor.C8348a();

    /* renamed from: e */
    public static final C8350a f18114e = new C8350a();

    /* renamed from: f */
    public static final CommandInfoEntity_ f18115f;

    /* renamed from: g */
    public static final Property f18116g;

    /* renamed from: h */
    public static final Property f18117h;

    /* renamed from: i */
    public static final Property f18118i;

    /* renamed from: j */
    public static final Property f18119j;

    /* renamed from: k */
    public static final Property f18120k;

    /* renamed from: l */
    public static final Property f18121l;

    /* renamed from: m */
    public static final Property f18122m;

    /* renamed from: n */
    public static final Property[] f18123n;

    /* renamed from: o */
    public static final Property f18124o;

    /* renamed from: p */
    public static final RelationInfo f18125p;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntity_$a */
    public static final class C8350a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(CommandInfoEntity commandInfoEntity) {
            return commandInfoEntity.m14055e();
        }
    }

    static {
        CommandInfoEntity_ commandInfoEntity_ = new CommandInfoEntity_();
        f18115f = commandInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18116g = property;
        Property property2 = new Property(commandInfoEntity_, 1, 2, cls, "delayTime");
        f18117h = property2;
        Property property3 = new Property(commandInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f18118i = property3;
        Property property4 = new Property(commandInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f18119j = property4;
        Property property5 = new Property(commandInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f18120k = property5;
        Property property6 = new Property(commandInfoEntity_, 5, 6, byte[].class, "data");
        f18121l = property6;
        Property property7 = new Property(commandInfoEntity_, 6, 7, cls, "recordId", true);
        f18122m = property7;
        f18123n = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f18124o = property;
        f18125p = new RelationInfo(commandInfoEntity_, CommandRecordEntity_.f18134f, property7, new ToOneGetter<CommandInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(CommandInfoEntity commandInfoEntity) {
                return commandInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "CommandInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18123n;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18112c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18113d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 5;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18114e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "CommandInfoEntity";
    }
}
