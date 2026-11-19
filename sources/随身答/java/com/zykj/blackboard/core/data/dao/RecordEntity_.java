package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.RecordEntityCursor;
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
public final class RecordEntity_ implements EntityInfo<RecordEntity> {

    /* renamed from: a */
    public static final Class f8834a = RecordEntity.class;

    /* renamed from: b */
    public static final InterfaceC5267b f8835b = new RecordEntityCursor.C7019a();

    /* renamed from: c */
    public static final C7035a f8836c = new C7035a();

    /* renamed from: d */
    public static final RecordEntity_ f8837d;

    /* renamed from: e */
    public static final Property f8838e;

    /* renamed from: f */
    public static final Property f8839f;

    /* renamed from: g */
    public static final Property[] f8840g;

    /* renamed from: h */
    public static final Property f8841h;

    /* renamed from: i */
    public static final RelationInfo f8842i;

    /* renamed from: j */
    public static final RelationInfo f8843j;

    /* renamed from: k */
    public static final RelationInfo f8844k;

    /* renamed from: l */
    public static final RelationInfo f8845l;

    /* renamed from: m */
    public static final RelationInfo f8846m;

    /* renamed from: n */
    public static final RelationInfo f8847n;

    /* renamed from: o */
    public static final RelationInfo f8848o;

    /* renamed from: p */
    public static final RelationInfo f8849p;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntity_$a */
    public static final class C7035a implements InterfaceC5268c {
        @Override // p037c8.InterfaceC5268c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo2406a(RecordEntity recordEntity) {
            return recordEntity.getId();
        }
    }

    static {
        RecordEntity_ recordEntity_ = new RecordEntity_();
        f8837d = recordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(recordEntity_, 0, 1, cls, "id", true, "id");
        f8838e = property;
        Property property2 = new Property(recordEntity_, 1, 2, cls, "pageId", true);
        f8839f = property2;
        f8840g = new Property[]{property, property2};
        f8841h = property;
        f8842i = new RelationInfo(recordEntity_, PageEntity_.f8817d, property2, new ToOneGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(RecordEntity recordEntity) {
                return recordEntity.page;
            }
        });
        f8843j = new RelationInfo(recordEntity_, CommandRecordEntity_.f8573d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.commandList;
            }
        }, CommandRecordEntity_.f8577h, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f8844k = new RelationInfo(recordEntity_, FileRecordEntity_.f8610d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.4
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.fileList;
            }
        }, FileRecordEntity_.f8614h, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f8845l = new RelationInfo(recordEntity_, TouchRecordEntity_.f8942d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.touchList;
            }
        }, TouchRecordEntity_.f8946h, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.7
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f8846m = new RelationInfo(recordEntity_, MatrixRecordEntity_.f8773d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.8
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.matrixList;
            }
        }, MatrixRecordEntity_.f8777h, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.9
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        f8847n = new RelationInfo(recordEntity_, AudioRecordEntity_.f8482d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.10
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.audioList;
            }
        }, AudioRecordEntity_.f8486h, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.11
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f8848o = new RelationInfo(recordEntity_, TextRecordEntity_.f8880d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.12
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.textList;
            }
        }, TextRecordEntity_.f8884h, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.13
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f8849p = new RelationInfo(recordEntity_, GeometryRecordEntity_.f8668d, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.14
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo7385b(RecordEntity recordEntity) {
                return recordEntity.geometryList;
            }
        }, GeometryRecordEntity_.f8672h, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.15
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo7371o(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: d */
    public Property[] mo7363d() {
        return f8840g;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: f */
    public Class mo7364f() {
        return f8834a;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: i */
    public InterfaceC5267b mo7365i() {
        return f8835b;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public int mo7366j() {
        return 8;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC5268c mo7367l() {
        return f8836c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: r */
    public String mo7368r() {
        return "RecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public String mo7369s() {
        return "RecordEntity";
    }
}
