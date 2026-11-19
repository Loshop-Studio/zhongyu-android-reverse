package com.zykj.blackboard.core.record.dataRecorder;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.relation.ToMany;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p189n5.AbstractC9095a;
import p189n5.C9099e;

/* loaded from: classes4.dex */
public final class AudioRecord extends AbstractC9095a {

    /* renamed from: f */
    public static final C7065a f9031f = new C7065a(null);

    /* renamed from: c */
    public boolean f9032c;

    /* renamed from: d */
    public RecordEntity f9033d;

    /* renamed from: e */
    public AudioRecordEntity f9034e;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$a */
    public static final class C7065a {
        public /* synthetic */ C7065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7065a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecord(C9099e timeRecord) {
        super(timeRecord);
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
    }

    /* renamed from: e */
    public final AudioInfoEntity m7927e(final String fileName, final long j9, long j10) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        C9099e c9099eM14630d = m14630d();
        Intrinsics.checkNotNull(c9099eM14630d);
        AudioInfoEntity audioInfoEntityM14627a = m14627a(c9099eM14630d.mo14631a(j10, true) - j9, j9, EzyCommandEnum.CommandEnum.ACTION_AUDIO_START, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$addAudio$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7072b c7072bM8090w = EzyCommand.CommandSource.CommandInfo.AudioStart.m8090w();
                c7072bM8090w.m8114s(fileName);
                c7072bM8090w.m8112q(j9);
                EzyCommand.CommandSource.CommandInfo.AudioStart audioStartBuild = c7072bM8090w.build();
                Intrinsics.checkNotNullExpressionValue(audioStartBuild, "builder.build()");
                return audioStartBuild;
            }
        });
        m7933k(audioInfoEntityM14627a);
        return audioInfoEntityM14627a;
    }

    /* renamed from: f */
    public final AudioRecordEntity m7928f() {
        RecordEntity recordEntity = this.f9033d;
        if (recordEntity == null) {
            return null;
        }
        AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, UUID.randomUUID() + "_audio.bin", "");
        recordEntity.m7629a().add(audioRecordEntity);
        recordEntity.m7638j();
        return audioRecordEntity;
    }

    /* renamed from: g */
    public final synchronized void m7929g() {
        try {
            AudioRecordEntity audioRecordEntity = this.f9034e;
            if (audioRecordEntity == null) {
                this.f9034e = m7928f();
            } else {
                Intrinsics.checkNotNull(audioRecordEntity);
                if (audioRecordEntity.m7373a().size() >= 100) {
                    this.f9034e = m7928f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final AudioRecordEntity m7930h() {
        ToMany toManyM7629a;
        AudioRecordEntity audioRecordEntity;
        RecordEntity recordEntity = this.f9033d;
        return (recordEntity == null || (toManyM7629a = recordEntity.m7629a()) == null || (audioRecordEntity = (AudioRecordEntity) CollectionsKt.lastOrNull((List) toManyM7629a)) == null || audioRecordEntity.m7373a().size() >= 100) ? m7928f() : audioRecordEntity;
    }

    /* renamed from: i */
    public final void m7931i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f9033d = recordEntity;
        this.f9034e = m7930h();
        this.f9032c = false;
    }

    /* renamed from: j */
    public final AudioInfoEntity m7932j(String fileName, long j9) {
        ToMany toManyM7373a;
        Object next;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        C9099e c9099eM14630d = m14630d();
        if (c9099eM14630d != null) {
            c9099eM14630d.m14646g(j9);
        }
        AudioRecordEntity audioRecordEntity = this.f9034e;
        if (audioRecordEntity != null && (toManyM7373a = audioRecordEntity.m7373a()) != null) {
            Iterator<TARGET> it = toManyM7373a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(EzyCommand.CommandSource.CommandInfo.AudioStart.m8083A(((AudioInfoEntity) next).getData()).getFileName(), fileName)) {
                    break;
                }
            }
            AudioInfoEntity audioInfoEntity = (AudioInfoEntity) next;
            if (audioInfoEntity != null) {
                audioInfoEntity.m7356j(j9);
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7072b c7072bM8090w = EzyCommand.CommandSource.CommandInfo.AudioStart.m8090w();
                c7072bM8090w.m8114s(fileName);
                c7072bM8090w.m8112q(j9);
                byte[] byteArray = c7072bM8090w.build().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m7355i(byteArray);
                audioInfoEntity.m7354h();
                return audioInfoEntity;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m7933k(AudioInfoEntity audioInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        AudioRecordEntity audioRecordEntity = this.f9034e;
        if (audioRecordEntity != null) {
            audioInfoEntity.m7352f().m13190w(audioRecordEntity);
            audioInfoEntity.m7354h();
            audioRecordEntity.m7373a().add(audioInfoEntity);
            audioRecordEntity.m7377e();
        }
        m7929g();
        this.f9032c = true;
    }
}
