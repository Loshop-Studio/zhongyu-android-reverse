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
import p285x4.AbstractC9848a;
import p285x4.C9852e;

/* loaded from: classes4.dex */
public final class AudioRecord extends AbstractC9848a {

    /* renamed from: f */
    public static final C6747a f7747f = new C6747a(null);

    /* renamed from: c */
    public boolean f7748c;

    /* renamed from: d */
    public RecordEntity f7749d;

    /* renamed from: e */
    public AudioRecordEntity f7750e;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$a */
    public static final class C6747a {
        public /* synthetic */ C6747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6747a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecord(C9852e timeRecord) {
        super(timeRecord);
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
    }

    /* renamed from: e */
    public final AudioInfoEntity m6815e(final String fileName, final long j10, long j11) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        C9852e c9852eM16491d = m16491d();
        Intrinsics.checkNotNull(c9852eM16491d);
        AudioInfoEntity audioInfoEntityM16488a = m16488a(c9852eM16491d.mo16492a(j11, true) - j10, j10, EzyCommandEnum.CommandEnum.ACTION_AUDIO_START, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$addAudio$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C6753b c6753bM6973t = EzyCommand.CommandSource.CommandInfo.AudioStart.m6973t();
                c6753bM6973t.m6998s(fileName);
                c6753bM6973t.m6996q(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart audioStartBuild = c6753bM6973t.build();
                Intrinsics.checkNotNullExpressionValue(audioStartBuild, "builder.build()");
                return audioStartBuild;
            }
        });
        m6821k(audioInfoEntityM16488a);
        return audioInfoEntityM16488a;
    }

    /* renamed from: f */
    public final AudioRecordEntity m6816f() {
        RecordEntity recordEntity = this.f7749d;
        if (recordEntity == null) {
            return null;
        }
        AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, UUID.randomUUID() + "_audio.bin", "");
        recordEntity.m6527a().add(audioRecordEntity);
        recordEntity.m6536j();
        return audioRecordEntity;
    }

    /* renamed from: g */
    public final synchronized void m6817g() {
        try {
            AudioRecordEntity audioRecordEntity = this.f7750e;
            if (audioRecordEntity == null) {
                this.f7750e = m6816f();
            } else {
                Intrinsics.checkNotNull(audioRecordEntity);
                if (audioRecordEntity.m6281a().size() >= 100) {
                    this.f7750e = m6816f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final AudioRecordEntity m6818h() {
        ToMany toManyM6527a;
        AudioRecordEntity audioRecordEntity;
        RecordEntity recordEntity = this.f7749d;
        return (recordEntity == null || (toManyM6527a = recordEntity.m6527a()) == null || (audioRecordEntity = (AudioRecordEntity) CollectionsKt.lastOrNull((List) toManyM6527a)) == null || audioRecordEntity.m6281a().size() >= 100) ? m6816f() : audioRecordEntity;
    }

    /* renamed from: i */
    public final void m6819i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f7749d = recordEntity;
        this.f7750e = m6818h();
        this.f7748c = false;
    }

    /* renamed from: j */
    public final AudioInfoEntity m6820j(String fileName, long j10) {
        ToMany toManyM6281a;
        Object next;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        C9852e c9852eM16491d = m16491d();
        if (c9852eM16491d != null) {
            c9852eM16491d.m16506g(j10);
        }
        AudioRecordEntity audioRecordEntity = this.f7750e;
        if (audioRecordEntity != null && (toManyM6281a = audioRecordEntity.m6281a()) != null) {
            Iterator<TARGET> it = toManyM6281a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(EzyCommand.CommandSource.CommandInfo.AudioStart.m6975x(((AudioInfoEntity) next).getData()).getFileName(), fileName)) {
                    break;
                }
            }
            AudioInfoEntity audioInfoEntity = (AudioInfoEntity) next;
            if (audioInfoEntity != null) {
                audioInfoEntity.m6262j(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart.C6753b c6753bM6973t = EzyCommand.CommandSource.CommandInfo.AudioStart.m6973t();
                c6753bM6973t.m6998s(fileName);
                c6753bM6973t.m6996q(j10);
                byte[] byteArray = c6753bM6973t.build().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m6261i(byteArray);
                audioInfoEntity.m6260h();
                return audioInfoEntity;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m6821k(AudioInfoEntity audioInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        AudioRecordEntity audioRecordEntity = this.f7750e;
        if (audioRecordEntity != null) {
            audioInfoEntity.m6258f().m13071t(audioRecordEntity);
            audioInfoEntity.m6260h();
            audioRecordEntity.m6281a().add(audioInfoEntity);
            audioRecordEntity.m6285e();
        }
        m6817g();
        this.f7748c = true;
    }
}
