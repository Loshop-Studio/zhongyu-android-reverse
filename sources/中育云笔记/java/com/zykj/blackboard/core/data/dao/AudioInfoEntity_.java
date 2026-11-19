package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.blackboard.core.data.dao.AudioInfoEntityCursor;
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
public final class AudioInfoEntity_ implements EntityInfo<AudioInfoEntity> {

    /* renamed from: c */
    public static final Class f18021c = AudioInfoEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18022d = new AudioInfoEntityCursor.C8333a();

    /* renamed from: e */
    public static final C8335a f18023e = new C8335a();

    /* renamed from: f */
    public static final AudioInfoEntity_ f18024f;

    /* renamed from: g */
    public static final Property f18025g;

    /* renamed from: h */
    public static final Property f18026h;

    /* renamed from: i */
    public static final Property f18027i;

    /* renamed from: j */
    public static final Property f18028j;

    /* renamed from: k */
    public static final Property f18029k;

    /* renamed from: l */
    public static final Property f18030l;

    /* renamed from: m */
    public static final Property f18031m;

    /* renamed from: n */
    public static final Property[] f18032n;

    /* renamed from: o */
    public static final Property f18033o;

    /* renamed from: p */
    public static final RelationInfo f18034p;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioInfoEntity_$a */
    public static final class C8335a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(AudioInfoEntity audioInfoEntity) {
            return audioInfoEntity.m13979e();
        }
    }

    static {
        AudioInfoEntity_ audioInfoEntity_ = new AudioInfoEntity_();
        f18024f = audioInfoEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioInfoEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18025g = property;
        Property property2 = new Property(audioInfoEntity_, 1, 2, cls, "delayTime");
        f18026h = property2;
        Property property3 = new Property(audioInfoEntity_, 2, 3, cls, TypedValues.TransitionType.S_DURATION);
        f18027i = property3;
        Property property4 = new Property(audioInfoEntity_, 3, 4, Boolean.TYPE, "isPlay");
        f18028j = property4;
        Property property5 = new Property(audioInfoEntity_, 4, 5, Integer.TYPE, "commandEnum", false, "commandEnum", CommandEnumConverter.class, EzyCommandEnum.CommandEnum.class);
        f18029k = property5;
        Property property6 = new Property(audioInfoEntity_, 5, 6, byte[].class, "data");
        f18030l = property6;
        Property property7 = new Property(audioInfoEntity_, 6, 7, cls, "recordId", true);
        f18031m = property7;
        f18032n = new Property[]{property, property2, property3, property4, property5, property6, property7};
        f18033o = property;
        f18034p = new RelationInfo(audioInfoEntity_, AudioRecordEntity_.f18043f, property7, new ToOneGetter<AudioInfoEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioInfoEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(AudioInfoEntity audioInfoEntity) {
                return audioInfoEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "AudioInfoEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18032n;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18021c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18022d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 16;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18023e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "AudioInfoEntity";
    }
}
