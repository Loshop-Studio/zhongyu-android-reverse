package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AudioRecordEntityCursor;
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
public final class AudioRecordEntity_ implements EntityInfo<AudioRecordEntity> {

    /* renamed from: a */
    public static final Class f7197a = AudioRecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7198b = new AudioRecordEntityCursor.C6639a();

    /* renamed from: c */
    public static final C6642a f7199c = new C6642a();

    /* renamed from: d */
    public static final AudioRecordEntity_ f7200d;

    /* renamed from: e */
    public static final Property f7201e;

    /* renamed from: f */
    public static final Property f7202f;

    /* renamed from: g */
    public static final Property f7203g;

    /* renamed from: h */
    public static final Property f7204h;

    /* renamed from: i */
    public static final Property[] f7205i;

    /* renamed from: j */
    public static final Property f7206j;

    /* renamed from: k */
    public static final RelationInfo f7207k;

    /* renamed from: l */
    public static final RelationInfo f7208l;

    /* renamed from: com.zykj.blackboard.core.data.dao.AudioRecordEntity_$a */
    public static final class C6642a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(AudioRecordEntity audioRecordEntity) {
            return audioRecordEntity.getId();
        }
    }

    static {
        AudioRecordEntity_ audioRecordEntity_ = new AudioRecordEntity_();
        f7200d = audioRecordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(audioRecordEntity_, 0, 1, cls, "id", true, "id");
        f7201e = property;
        Property property2 = new Property(audioRecordEntity_, 1, 2, String.class, "fileName");
        f7202f = property2;
        Property property3 = new Property(audioRecordEntity_, 2, 3, String.class, "validate");
        f7203g = property3;
        Property property4 = new Property(audioRecordEntity_, 3, 4, cls, "recordId", true);
        f7204h = property4;
        f7205i = new Property[]{property, property2, property3, property4};
        f7206j = property;
        f7207k = new RelationInfo(audioRecordEntity_, RecordEntity_.f7555d, property4, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f7208l = new RelationInfo(audioRecordEntity_, AudioInfoEntity_.f7181d, new ToManyGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.AudioRecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.audioInfoEntity;
            }
        }, 3);
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7205i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7197a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7198b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 3;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7199c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "AudioRecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "AudioRecordEntity";
    }
}
