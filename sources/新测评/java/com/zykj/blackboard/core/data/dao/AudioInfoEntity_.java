package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;
import p225r8.InterfaceC9048c;

/* loaded from: classes4.dex */
public final class AudioInfoEntity_ implements EntityInfo<AudioInfoEntity> {

    /* renamed from: a */
    public static final Class f7178a = AudioInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7179b = new AudioInfoEntityCursor.C6636a();

    /* renamed from: c */
    public static final C6638a f7180c = new C6638a();

    /* renamed from: d */
    public static final AudioInfoEntity_ f7181d;

    /* renamed from: e */
    public static final Property f7182e;

    /* renamed from: f */
    public static final Property f7183f;

    /* renamed from: g */
    public static final Property f7184g;

    /* renamed from: h */
    public static final Property f7185h;

    /* renamed from: i */
    public static final Property f7186i;

    /* renamed from: j */
    public static final Property f7187j;

    /* renamed from: k */
    public static final Property f7188k;

    /* renamed from: l */
    public static final Property[] f7189l;

    /* renamed from: m */
    public static final Property f7190m;

    /* renamed from: n */
    public static final RelationInfo f7191n;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntity_$a */
    public static final class C6638a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(AudioInfoEntity audioInfoEntity) {
            return audioInfoEntity.getId();
        }
    }

    static {
        AudioInfoEntity_ audioInfoEntity_ = new AudioInfoEntity_();
        f7181d = audioInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioInfoEntity_, 0, 1, cls, "id", true, "id");
        f7182e = property;
        Property property2 = new Property(audioInfoEntity_, 1, 2, cls, "delayTime");
        f7183f = property2;
        Property property3 = new Property(audioInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f7184g = property3;
        Property property4 = new Property(audioInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f7185h = property4;
        Property property5 = new Property(audioInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f7186i = property5;
        Property property6 = new Property(audioInfoEntity_, 5, 6, byte[].class, "data");
        f7187j = property6;
        Property property7 = new Property(audioInfoEntity_, 6, 7, cls, "recordId", true);
        f7188k = property7;
        f7189l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f7190m = property;
        f7191n = new RelationInfo(audioInfoEntity_, AudioRecordEntity_.f7200d, property7, new ToOneGetter<AudioInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(AudioInfoEntity audioInfoEntity) {
                return audioInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7189l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7178a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7179b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 16;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7180c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "AudioInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "AudioInfoEntity";
    }
}
