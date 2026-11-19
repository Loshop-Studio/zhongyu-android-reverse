package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.RecordEntityCursor;
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
public final class RecordEntity_ implements EntityInfo<RecordEntity> {

    /* renamed from: a */
    public static final Class f7552a = RecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC9047b f7553b = new RecordEntityCursor.C6702a();

    /* renamed from: c */
    public static final C6718a f7554c = new C6718a();

    /* renamed from: d */
    public static final RecordEntity_ f7555d;

    /* renamed from: e */
    public static final Property f7556e;

    /* renamed from: f */
    public static final Property f7557f;

    /* renamed from: g */
    public static final Property[] f7558g;

    /* renamed from: h */
    public static final Property f7559h;

    /* renamed from: i */
    public static final RelationInfo f7560i;

    /* renamed from: j */
    public static final RelationInfo f7561j;

    /* renamed from: k */
    public static final RelationInfo f7562k;

    /* renamed from: l */
    public static final RelationInfo f7563l;

    /* renamed from: m */
    public static final RelationInfo f7564m;

    /* renamed from: n */
    public static final RelationInfo f7565n;

    /* renamed from: o */
    public static final RelationInfo f7566o;

    /* renamed from: p */
    public static final RelationInfo f7567p;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntity_$a */
    public static final class C6718a implements InterfaceC9048c {
        @Override // p225r8.InterfaceC9048c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo6279a(RecordEntity recordEntity) {
            return recordEntity.getId();
        }
    }

    static {
        RecordEntity_ recordEntity_ = new RecordEntity_();
        f7555d = recordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(recordEntity_, 0, 1, cls, "id", true, "id");
        f7556e = property;
        Property property2 = new Property(recordEntity_, 1, 2, cls, "pageId", true);
        f7557f = property2;
        f7558g = new Property[]{property, property2};
        f7559h = property;
        f7560i = new RelationInfo(recordEntity_, PageEntity_.f7535d, property2, new ToOneGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(RecordEntity recordEntity) {
                return recordEntity.page;
            }
        });
        f7561j = new RelationInfo(recordEntity_, CommandRecordEntity_.f7291d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.commandList;
            }
        }, CommandRecordEntity_.f7295h, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f7562k = new RelationInfo(recordEntity_, FileRecordEntity_.f7328d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.4
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.fileList;
            }
        }, FileRecordEntity_.f7332h, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f7563l = new RelationInfo(recordEntity_, TouchRecordEntity_.f7660d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.touchList;
            }
        }, TouchRecordEntity_.f7664h, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.7
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f7564m = new RelationInfo(recordEntity_, MatrixRecordEntity_.f7491d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.8
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.matrixList;
            }
        }, MatrixRecordEntity_.f7495h, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.9
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        f7565n = new RelationInfo(recordEntity_, AudioRecordEntity_.f7200d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.10
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.audioList;
            }
        }, AudioRecordEntity_.f7204h, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.11
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f7566o = new RelationInfo(recordEntity_, TextRecordEntity_.f7598d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.12
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.textList;
            }
        }, TextRecordEntity_.f7602h, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.13
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f7567p = new RelationInfo(recordEntity_, GeometryRecordEntity_.f7386d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.14
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo6292b(RecordEntity recordEntity) {
                return recordEntity.geometryList;
            }
        }, GeometryRecordEntity_.f7390h, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.15
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo6278l(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: c */
    public Property[] mo6270c() {
        return f7558g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: e */
    public Class mo6271e() {
        return f7552a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: g */
    public InterfaceC9047b mo6272g() {
        return f7553b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public int mo6273h() {
        return 8;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC9048c mo6274i() {
        return f7554c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: n */
    public String mo6275n() {
        return "RecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: p */
    public String mo6276p() {
        return "RecordEntity";
    }
}
