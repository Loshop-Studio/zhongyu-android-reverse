package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToOneGetter;
import io.objectbox.relation.RelationInfo;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;
import p037c8.InterfaceC5268c;

/* loaded from: classes4.dex */
public final class AudioInfoEntity_ implements EntityInfo<AudioInfoEntity> {

    /* renamed from: a */
    public static final Class f8460a = AudioInfoEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8461b = new AudioInfoEntityCursor.C6953a();

    /* renamed from: c */
    public static final C6955a f8462c = new C6955a();

    /* renamed from: d */
    public static final AudioInfoEntity_ f8463d;

    /* renamed from: e */
    public static final Property f8464e;

    /* renamed from: f */
    public static final Property f8465f;

    /* renamed from: g */
    public static final Property f8466g;

    /* renamed from: h */
    public static final Property f8467h;

    /* renamed from: i */
    public static final Property f8468i;

    /* renamed from: j */
    public static final Property f8469j;

    /* renamed from: k */
    public static final Property f8470k;

    /* renamed from: l */
    public static final Property[] f8471l;

    /* renamed from: m */
    public static final Property f8472m;

    /* renamed from: n */
    public static final RelationInfo f8473n;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntity_$a */
    public static final class C6955a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(AudioInfoEntity audioInfoEntity) {
            return audioInfoEntity.getId();
        }
    }

    static {
        AudioInfoEntity_ audioInfoEntity_ = new AudioInfoEntity_();
        f8463d = audioInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioInfoEntity_, 0, 1, cls, "id", true, "id");
        f8464e = property;
        Property property2 = new Property(audioInfoEntity_, 1, 2, cls, "delayTime");
        f8465f = property2;
        Property property3 = new Property(audioInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f8466g = property3;
        Property property4 = new Property(audioInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f8467h = property4;
        Property property5 = new Property(audioInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f8468i = property5;
        Property property6 = new Property(audioInfoEntity_, 5, 6, byte[].class, "data");
        f8469j = property6;
        Property property7 = new Property(audioInfoEntity_, 6, 7, cls, "recordId", true);
        f8470k = property7;
        f8471l = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f8472m = property;
        f8473n = new RelationInfo(audioInfoEntity_, AudioRecordEntity_.f8482d, property7, new ToOneGetter<AudioInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(AudioInfoEntity audioInfoEntity) {
                return audioInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8471l;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8460a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8461b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 16;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8462c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "AudioInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "AudioInfoEntity";
    }
}
