package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor;
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
public final class AudioRecordEntity_ implements EntityInfo<AudioRecordEntity> {

    /* renamed from: c */
    public static final Class f18040c = AudioRecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18041d = new AudioRecordEntityCursor.C8336a();

    /* renamed from: e */
    public static final C8339a f18042e = new C8339a();

    /* renamed from: f */
    public static final AudioRecordEntity_ f18043f;

    /* renamed from: g */
    public static final Property f18044g;

    /* renamed from: h */
    public static final Property f18045h;

    /* renamed from: i */
    public static final Property f18046i;

    /* renamed from: j */
    public static final Property f18047j;

    /* renamed from: k */
    public static final Property[] f18048k;

    /* renamed from: l */
    public static final Property f18049l;

    /* renamed from: m */
    public static final RelationInfo f18050m;

    /* renamed from: n */
    public static final RelationInfo f18051n;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntity_$a */
    public static final class C8339a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(AudioRecordEntity audioRecordEntity) {
            return audioRecordEntity.m14005c();
        }
    }

    static {
        AudioRecordEntity_ audioRecordEntity_ = new AudioRecordEntity_();
        f18043f = audioRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioRecordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18044g = property;
        Property property2 = new Property(audioRecordEntity_, 1, 2, String.class, "fileName");
        f18045h = property2;
        Property property3 = new Property(audioRecordEntity_, 2, 3, String.class, "validate");
        f18046i = property3;
        Property property4 = new Property(audioRecordEntity_, 3, 4, cls, "recordId", true);
        f18047j = property4;
        f18048k = new Property[]{property, property2, property3, property4};
        f18049l = property;
        f18050m = new RelationInfo(audioRecordEntity_, RecordEntity_.f18398f, property4, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f18051n = new RelationInfo(audioRecordEntity_, AudioInfoEntity_.f18024f, new ToManyGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.audioInfoEntity;
            }
        }, 3);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "AudioRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18048k;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18040c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18041d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 3;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18042e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "AudioRecordEntity";
    }
}
