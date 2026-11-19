package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor;
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
public final class AudioRecordEntity_ implements EntityInfo<AudioRecordEntity> {

    /* renamed from: a */
    public static final Class f8479a = AudioRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8480b = new AudioRecordEntityCursor.C6956a();

    /* renamed from: c */
    public static final C6959a f8481c = new C6959a();

    /* renamed from: d */
    public static final AudioRecordEntity_ f8482d;

    /* renamed from: e */
    public static final Property f8483e;

    /* renamed from: f */
    public static final Property f8484f;

    /* renamed from: g */
    public static final Property f8485g;

    /* renamed from: h */
    public static final Property f8486h;

    /* renamed from: i */
    public static final Property[] f8487i;

    /* renamed from: j */
    public static final Property f8488j;

    /* renamed from: k */
    public static final RelationInfo f8489k;

    /* renamed from: l */
    public static final RelationInfo f8490l;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntity_$a */
    public static final class C6959a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(AudioRecordEntity audioRecordEntity) {
            return audioRecordEntity.getId();
        }
    }

    static {
        AudioRecordEntity_ audioRecordEntity_ = new AudioRecordEntity_();
        f8482d = audioRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioRecordEntity_, 0, 1, cls, "id", true, "id");
        f8483e = property;
        Property property2 = new Property(audioRecordEntity_, 1, 2, String.class, "fileName");
        f8484f = property2;
        Property property3 = new Property(audioRecordEntity_, 2, 3, String.class, "validate");
        f8485g = property3;
        Property property4 = new Property(audioRecordEntity_, 3, 4, cls, "recordId", true);
        f8486h = property4;
        f8487i = new Property[]{property, property2, property3, property4};
        f8488j = property;
        f8489k = new RelationInfo(audioRecordEntity_, RecordEntity_.f8837d, property4, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f8490l = new RelationInfo(audioRecordEntity_, AudioInfoEntity_.f8463d, new ToManyGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.audioInfoEntity;
            }
        }, 3);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8487i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8479a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8480b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 3;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8481c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "AudioRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "AudioRecordEntity";
    }
}
