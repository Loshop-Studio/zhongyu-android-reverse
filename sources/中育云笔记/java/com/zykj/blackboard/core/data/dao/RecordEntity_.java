package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.RecordEntityCursor;
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
public final class RecordEntity_ implements EntityInfo<RecordEntity> {

    /* renamed from: c */
    public static final Class f18395c = RecordEntity.class;

    /* renamed from: d */
    public static final InterfaceC9909b f18396d = new RecordEntityCursor.C8399a();

    /* renamed from: e */
    public static final C8415a f18397e = new C8415a();

    /* renamed from: f */
    public static final RecordEntity_ f18398f;

    /* renamed from: g */
    public static final Property f18399g;

    /* renamed from: h */
    public static final Property f18400h;

    /* renamed from: i */
    public static final Property[] f18401i;

    /* renamed from: j */
    public static final Property f18402j;

    /* renamed from: k */
    public static final RelationInfo f18403k;

    /* renamed from: l */
    public static final RelationInfo f18404l;

    /* renamed from: m */
    public static final RelationInfo f18405m;

    /* renamed from: n */
    public static final RelationInfo f18406n;

    /* renamed from: o */
    public static final RelationInfo f18407o;

    /* renamed from: p */
    public static final RelationInfo f18408p;

    /* renamed from: q */
    public static final RelationInfo f18409q;

    /* renamed from: r */
    public static final RelationInfo f18410r;

    /* renamed from: com.zykj.blackboard.core.data.dao.RecordEntity_$a */
    public static final class C8415a implements InterfaceC9910c {
        @Override // p225kc.InterfaceC9910c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long mo14001a(RecordEntity recordEntity) {
            return recordEntity.m14261e();
        }
    }

    static {
        RecordEntity_ recordEntity_ = new RecordEntity_();
        f18398f = recordEntity_;
        Class cls = Long.TYPE;
        Property property = new Property(recordEntity_, 0, 1, cls, AgooConstants.MESSAGE_ID, true, AgooConstants.MESSAGE_ID);
        f18399g = property;
        Property property2 = new Property(recordEntity_, 1, 2, cls, "pageId", true);
        f18400h = property2;
        f18401i = new Property[]{property, property2};
        f18402j = property;
        f18403k = new RelationInfo(recordEntity_, PageEntity_.f18378f, property2, new ToOneGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.1
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(RecordEntity recordEntity) {
                return recordEntity.page;
            }
        });
        f18404l = new RelationInfo(recordEntity_, CommandRecordEntity_.f18134f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.2
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.commandList;
            }
        }, CommandRecordEntity_.f18138j, new ToOneGetter<CommandRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.3
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(CommandRecordEntity commandRecordEntity) {
                return commandRecordEntity.record;
            }
        });
        f18405m = new RelationInfo(recordEntity_, FileRecordEntity_.f18171f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.4
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.fileList;
            }
        }, FileRecordEntity_.f18175j, new ToOneGetter<FileRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.5
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(FileRecordEntity fileRecordEntity) {
                return fileRecordEntity.record;
            }
        });
        f18406n = new RelationInfo(recordEntity_, TouchRecordEntity_.f18503f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.6
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.touchList;
            }
        }, TouchRecordEntity_.f18507j, new ToOneGetter<TouchRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.7
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TouchRecordEntity touchRecordEntity) {
                return touchRecordEntity.record;
            }
        });
        f18407o = new RelationInfo(recordEntity_, MatrixRecordEntity_.f18334f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.8
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.matrixList;
            }
        }, MatrixRecordEntity_.f18338j, new ToOneGetter<MatrixRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.9
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(MatrixRecordEntity matrixRecordEntity) {
                return matrixRecordEntity.record;
            }
        });
        f18408p = new RelationInfo(recordEntity_, AudioRecordEntity_.f18043f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.10
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.audioList;
            }
        }, AudioRecordEntity_.f18047j, new ToOneGetter<AudioRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.11
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(AudioRecordEntity audioRecordEntity) {
                return audioRecordEntity.record;
            }
        });
        f18409q = new RelationInfo(recordEntity_, TextRecordEntity_.f18441f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.12
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.textList;
            }
        }, TextRecordEntity_.f18445j, new ToOneGetter<TextRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.13
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(TextRecordEntity textRecordEntity) {
                return textRecordEntity.record;
            }
        });
        f18410r = new RelationInfo(recordEntity_, GeometryRecordEntity_.f18229f, new ToManyGetter<RecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.14
            @Override // io.objectbox.internal.ToManyGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List mo14015b(RecordEntity recordEntity) {
                return recordEntity.geometryList;
            }
        }, GeometryRecordEntity_.f18233j, new ToOneGetter<GeometryRecordEntity>() { // from class: com.zykj.blackboard.core.data.dao.RecordEntity_.15
            @Override // io.objectbox.internal.ToOneGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToOne mo14000w(GeometryRecordEntity geometryRecordEntity) {
                return geometryRecordEntity.record;
            }
        });
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: B */
    public String mo13992B() {
        return "RecordEntity";
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: h */
    public Property[] mo13993h() {
        return f18401i;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: j */
    public Class mo13994j() {
        return f18395c;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: l */
    public InterfaceC9909b mo13995l() {
        return f18396d;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: q */
    public int mo13996q() {
        return 8;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: s */
    public InterfaceC9910c mo13997s() {
        return f18397e;
    }

    @Override // io.objectbox.EntityInfo
    /* renamed from: x */
    public String mo13998x() {
        return "RecordEntity";
    }
}
