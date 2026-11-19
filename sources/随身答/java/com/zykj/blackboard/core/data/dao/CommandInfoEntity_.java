package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class CommandInfoEntity_ implements EntityInfo<CommandInfoEntity> {

    /* renamed from: a */
    public static final Class f8551a = CommandInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8552b = new CommandInfoEntityCursor.C6968a();

    /* renamed from: c */
    public static final C6970a f8553c = new C6970a();

    /* renamed from: d */
    public static final CommandInfoEntity_ f8554d;

    /* renamed from: e */
    public static final Property f8555e;

    /* renamed from: f */
    public static final Property f8556f;

    /* renamed from: g */
    public static final Property f8557g;

    /* renamed from: h */
    public static final Property f8558h;

    /* renamed from: i */
    public static final Property f8559i;

    /* renamed from: j */
    public static final Property f8560j;

    /* renamed from: k */
    public static final Property f8561k;

    /* renamed from: l */
    public static final Property[] f8562l;

    /* renamed from: m */
    public static final Property f8563m;

    /* renamed from: n */
    public static final RelationInfo f8564n;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntity_$a */
    public static final class C6970a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(CommandInfoEntity commandInfoEntity) {
            return commandInfoEntity.getId();
        }
    }

    static {
        CommandInfoEntity_ commandInfoEntity_ = new CommandInfoEntity_();
        f8554d = commandInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandInfoEntity_, 0, 1, cls, "id", true, "id");
        f8555e = property;
        Property property2 = new Property(commandInfoEntity_, 1, 2, cls, "delayTime");
        f8556f = property2;
        Property property3 = new Property(commandInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f8557g = property3;
        Property property4 = new Property(commandInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f8558h = property4;
        Property property5 = new Property(commandInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f8559i = property5;
        Property property6 = new Property(commandInfoEntity_, 5, 6, byte[].class, "data");
        f8560j = property6;
        Property property7 = new Property(commandInfoEntity_, 6, 7, cls, "recordId", true);
        f8561k = property7;
        f8562l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f8563m = property;
        f8564n = new RelationInfo(commandInfoEntity_, CommandRecordEntity_.f8573d, property7, new ToOneGetter<CommandInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(CommandInfoEntity commandInfoEntity) {
                return commandInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8562l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8551a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8552b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 5;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8553c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "CommandInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "CommandInfoEntity";
    }
}
