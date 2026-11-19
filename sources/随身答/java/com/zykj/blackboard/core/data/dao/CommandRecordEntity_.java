package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor;
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
public final class CommandRecordEntity_ implements EntityInfo<CommandRecordEntity> {

    /* renamed from: a */
    public static final Class f8570a = CommandRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8571b = new CommandRecordEntityCursor.C6971a();

    /* renamed from: c */
    public static final C6974a f8572c = new C6974a();

    /* renamed from: d */
    public static final CommandRecordEntity_ f8573d;

    /* renamed from: e */
    public static final Property f8574e;

    /* renamed from: f */
    public static final Property f8575f;

    /* renamed from: g */
    public static final Property f8576g;

    /* renamed from: h */
    public static final Property f8577h;

    /* renamed from: i */
    public static final Property[] f8578i;

    /* renamed from: j */
    public static final Property f8579j;

    /* renamed from: k */
    public static final RelationInfo f8580k;

    /* renamed from: l */
    public static final RelationInfo f8581l;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntity_$a */
    public static final class C6974a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(CommandRecordEntity commandRecordEntity) {
            return commandRecordEntity.getId();
        }
    }

    static {
        CommandRecordEntity_ commandRecordEntity_ = new CommandRecordEntity_();
        f8573d = commandRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandRecordEntity_, 0, 1, cls, "id", true, "id");
        f8574e = property;
        Property property2 = new Property(commandRecordEntity_, 1, 2, String.class, "fileName");
        f8575f = property2;
        Property property3 = new Property(commandRecordEntity_, 2, 3, String.class, "validate");
        f8576g = property3;
        Property property4 = new Property(commandRecordEntity_, 3, 4, cls, "recordId", true);
        f8577h = property4;
        f8578i = new Property[]{property, property2, property3, property4};
        f8579j = property;
        f8580k = new RelationInfo(commandRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f8581l = new RelationInfo(commandRecordEntity_, CommandInfoEntity_.f8554d, new ToManyGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.commandInfoEntity;
            }
        }, 8);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8578i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8570a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8571b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 17;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8572c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "CommandRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "CommandRecordEntity";
    }
}
