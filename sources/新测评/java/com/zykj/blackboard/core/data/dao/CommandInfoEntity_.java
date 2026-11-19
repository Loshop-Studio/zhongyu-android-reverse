package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.CommandInfoEntityCursor;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class CommandInfoEntity_ implements EntityInfo<CommandInfoEntity> {

    /* renamed from: a */
    public static final Class f7269a = CommandInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7270b = new CommandInfoEntityCursor.C6651a();

    /* renamed from: c */
    public static final C6653a f7271c = new C6653a();

    /* renamed from: d */
    public static final CommandInfoEntity_ f7272d;

    /* renamed from: e */
    public static final Property f7273e;

    /* renamed from: f */
    public static final Property f7274f;

    /* renamed from: g */
    public static final Property f7275g;

    /* renamed from: h */
    public static final Property f7276h;

    /* renamed from: i */
    public static final Property f7277i;

    /* renamed from: j */
    public static final Property f7278j;

    /* renamed from: k */
    public static final Property f7279k;

    /* renamed from: l */
    public static final Property[] f7280l;

    /* renamed from: m */
    public static final Property f7281m;

    /* renamed from: n */
    public static final RelationInfo f7282n;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandInfoEntity_$a */
    public static final class C6653a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(CommandInfoEntity commandInfoEntity) {
            return commandInfoEntity.getId();
        }
    }

    static {
        CommandInfoEntity_ commandInfoEntity_ = new CommandInfoEntity_();
        f7272d = commandInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandInfoEntity_, 0, 1, cls, "id", true, "id");
        f7273e = property;
        Property property2 = new Property(commandInfoEntity_, 1, 2, cls, "delayTime");
        f7274f = property2;
        Property property3 = new Property(commandInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f7275g = property3;
        Property property4 = new Property(commandInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f7276h = property4;
        Property property5 = new Property(commandInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f7277i = property5;
        Property property6 = new Property(commandInfoEntity_, 5, 6, byte[].class, "data");
        f7278j = property6;
        Property property7 = new Property(commandInfoEntity_, 6, 7, cls, "recordId", true);
        f7279k = property7;
        f7280l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f7281m = property;
        f7282n = new RelationInfo(commandInfoEntity_, CommandRecordEntity_.f7291d, property7, new ToOneGetter<CommandInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(CommandInfoEntity commandInfoEntity) {
                return commandInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7280l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7269a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7270b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 5;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7271c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "CommandInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "CommandInfoEntity";
    }
}
