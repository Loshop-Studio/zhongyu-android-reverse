package com.zykj.blackboard.core.record.dataRecorder;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import io.objectbox.relation.ToMany;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p194ia.AbstractC9617a;
import p194ia.C9621e;
import p325rc.AbstractC10947g0;

/* loaded from: classes5.dex */
public final class AudioRecord extends AbstractC9617a {

    /* renamed from: f */
    public static final C8444a f18589f = new C8444a(null);

    /* renamed from: c */
    public boolean f18590c;

    /* renamed from: d */
    public RecordEntity f18591d;

    /* renamed from: e */
    public AudioRecordEntity f18592e;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$a */
    public static final class C8444a {
        public /* synthetic */ C8444a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8444a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecord(C9621e timeRecord) {
        super(timeRecord);
        AbstractC9979u.m20294g(timeRecord, "timeRecord");
    }

    /* renamed from: e */
    public final AudioInfoEntity m14551e(final String fileName, final long j10, long j11) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(fileName, "fileName");
        C9621e c9621eM18855d = m18855d();
        AbstractC9979u.m20291d(c9621eM18855d);
        AudioInfoEntity audioInfoEntityM18852a = m18852a(c9621eM18855d.mo18856a(j11, true) - j10, j10, EzyCommandEnum.CommandEnum.ACTION_AUDIO_START, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.AudioRecord$addAudio$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C8450b c8450bM14708o = EzyCommand.CommandSource.CommandInfo.AudioStart.m14708o();
                c8450bM14708o.m14733r(fileName);
                c8450bM14708o.m14731p(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart audioStartBuild = c8450bM14708o.build();
                AbstractC9979u.m20293f(audioStartBuild, "builder.build()");
                return audioStartBuild;
            }
        });
        m14557k(audioInfoEntityM18852a);
        return audioInfoEntityM18852a;
    }

    /* renamed from: f */
    public final AudioRecordEntity m14552f() {
        RecordEntity recordEntity = this.f18591d;
        if (recordEntity == null) {
            return null;
        }
        AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, UUID.randomUUID() + "_audio.bin", "");
        recordEntity.m14257a().add(audioRecordEntity);
        recordEntity.m14266j();
        return audioRecordEntity;
    }

    /* renamed from: g */
    public final synchronized void m14553g() {
        try {
            AudioRecordEntity audioRecordEntity = this.f18592e;
            if (audioRecordEntity == null) {
                this.f18592e = m14552f();
            } else {
                AbstractC9979u.m20291d(audioRecordEntity);
                if (audioRecordEntity.m14003a().size() >= 100) {
                    this.f18592e = m14552f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final AudioRecordEntity m14554h() {
        ToMany toManyM14257a;
        AudioRecordEntity audioRecordEntity;
        RecordEntity recordEntity = this.f18591d;
        return (recordEntity == null || (toManyM14257a = recordEntity.m14257a()) == null || (audioRecordEntity = (AudioRecordEntity) AbstractC10947g0.m23957z0(toManyM14257a)) == null || audioRecordEntity.m14003a().size() >= 100) ? m14552f() : audioRecordEntity;
    }

    /* renamed from: i */
    public final void m14555i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f18591d = recordEntity;
        this.f18592e = m14554h();
        this.f18590c = false;
    }

    /* renamed from: j */
    public final AudioInfoEntity m14556j(String fileName, long j10) {
        ToMany toManyM14003a;
        Object next;
        AbstractC9979u.m20294g(fileName, "fileName");
        C9621e c9621eM18855d = m18855d();
        if (c9621eM18855d != null) {
            c9621eM18855d.m18871g(j10);
        }
        AudioRecordEntity audioRecordEntity = this.f18592e;
        if (audioRecordEntity != null && (toManyM14003a = audioRecordEntity.m14003a()) != null) {
            Iterator<TARGET> it = toManyM14003a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9979u.m20289b(EzyCommand.CommandSource.CommandInfo.AudioStart.m14710u(((AudioInfoEntity) next).m13976b()).getFileName(), fileName)) {
                    break;
                }
            }
            AudioInfoEntity audioInfoEntity = (AudioInfoEntity) next;
            if (audioInfoEntity != null) {
                audioInfoEntity.m13984j(j10);
                EzyCommand.CommandSource.CommandInfo.AudioStart.C8450b c8450bM14708o = EzyCommand.CommandSource.CommandInfo.AudioStart.m14708o();
                c8450bM14708o.m14733r(fileName);
                c8450bM14708o.m14731p(j10);
                byte[] byteArray = c8450bM14708o.build().toByteArray();
                AbstractC9979u.m20293f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity.m13983i(byteArray);
                audioInfoEntity.m13982h();
                return audioInfoEntity;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m14557k(AudioInfoEntity audioInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        AudioRecordEntity audioRecordEntity = this.f18592e;
        if (audioRecordEntity != null) {
            audioInfoEntity.m13980f().m19043o(audioRecordEntity);
            audioInfoEntity.m13982h();
            audioRecordEntity.m14003a().add(audioInfoEntity);
            audioRecordEntity.m14007e();
        }
        m14553g();
        this.f18590c = true;
    }
}
