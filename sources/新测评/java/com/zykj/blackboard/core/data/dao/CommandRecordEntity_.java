package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.CommandRecordEntityCursor;
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
public final class CommandRecordEntity_ implements EntityInfo<CommandRecordEntity> {

    /* renamed from: a */
    public static final Class f7288a = CommandRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7289b = new CommandRecordEntityCursor.C6654a();

    /* renamed from: c */
    public static final C6657a f7290c = new C6657a();

    /* renamed from: d */
    public static final CommandRecordEntity_ f7291d;

    /* renamed from: e */
    public static final Property f7292e;

    /* renamed from: f */
    public static final Property f7293f;

    /* renamed from: g */
    public static final Property f7294g;

    /* renamed from: h */
    public static final Property f7295h;

    /* renamed from: i */
    public static final Property[] f7296i;

    /* renamed from: j */
    public static final Property f7297j;

    /* renamed from: k */
    public static final RelationInfo f7298k;

    /* renamed from: l */
    public static final RelationInfo f7299l;

    /* renamed from: com.zykj.blackboard.core.data.dao.CommandRecordEntity_$a */
    public static final class C6657a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(CommandRecordEntity commandRecordEntity) {
            return commandRecordEntity.getId();
        }
    }

    static {
        CommandRecordEntity_ commandRecordEntity_ = new CommandRecordEntity_();
        f7291d = commandRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(commandRecordEntity_, 0, 1, cls, "id", true, "id");
        f7292e = property;
        Property property2 = new Property(commandRecordEntity_, 1, 2, String.class, "fileName");
        f7293f = property2;
        Property property3 = new Property(commandRecordEntity_, 2, 3, String.class, "validate");
        f7294g = property3;
        Property property4 = new Property(commandRecordEntity_, 3, 4, cls, "recordId", true);
        f7295h = property4;
        f7296i = new Property[]{property, property2, property3, property4};
        f7297j = property;
        f7298k = new RelationInfo(commandRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f7299l = new RelationInfo(commandRecordEntity_, CommandInfoEntity_.f7272d, new ToManyGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.CommandRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.commandInfoEntity;
            }
        }, 8);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7296i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7288a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7289b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 17;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7290c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "CommandRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "CommandRecordEntity";
    }
}
