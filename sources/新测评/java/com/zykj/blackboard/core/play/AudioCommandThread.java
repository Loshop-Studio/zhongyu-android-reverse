package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import com.zykj.blackboard.core.play.AudioCommandThread;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.CloseableKt;
import p087f4.C7439d;
import p188o4.AbstractC8704e;
import p285x4.C9850c;

/* loaded from: classes4.dex */
public final class AudioCommandThread extends AbstractC8704e {

    /* renamed from: h */
    public long f7719h;

    /* renamed from: i */
    public long f7720i;

    /* renamed from: j */
    public ListIterator f7721j;

    /* renamed from: k */
    public String f7722k = "";

    /* renamed from: l */
    public ListIterator f7723l;

    /* renamed from: m */
    public long f7724m;

    /* renamed from: n */
    public MediaPlayer f7725n;

    /* renamed from: o */
    public boolean f7726o;

    /* renamed from: com.zykj.blackboard.core.play.AudioCommandThread$a */
    public /* synthetic */ class C6743a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7727a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_AUDIO_START.ordinal()] = 1;
            f7727a = iArr;
        }
    }

    /* renamed from: K */
    public static final void m6762K(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.start();
    }

    /* renamed from: L */
    public static final void m6763L(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m6774E();
    }

    /* renamed from: N */
    public static final void m6764N(AudioCommandThread this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f7726o = false;
    }

    /* renamed from: O */
    public static final void m6765O(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m6774E();
    }

    /* renamed from: A */
    public final boolean m6770A(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m6964w() != 0 && this.f7720i >= commandInfo.m6963v() && this.f7720i < commandInfo.m6963v() + commandInfo.m6964w();
    }

    /* renamed from: B */
    public final boolean m6771B() {
        ListIterator listIterator = this.f7723l;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(this.f7722k, ((EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next()).getFileName()));
        try {
            this.f7721j = EzyCommand.CommandSource.m6942u(fileInputStream).m6944m().listIterator();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            return true;
        } finally {
        }
    }

    /* renamed from: C */
    public final boolean m6772C(ListIterator listIterator) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f7720i < commandInfo.m6963v()) {
                Log.e("Audio", "时间没到");
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return false;
            }
            if (m6770A(commandInfo)) {
                Log.e("Audio", "这边开始播放");
                m6779J(commandInfo, this.f7720i - commandInfo.m6963v());
            }
            this.f7720i -= commandInfo.m6963v() + commandInfo.m6964w();
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m6773D(ListIterator listIterator, Function0 function0) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f7720i < commandInfo.m6963v()) {
                if (!listIterator.hasPrevious()) {
                    return true;
                }
                listIterator.previous();
                return true;
            }
            if (m6770A(commandInfo)) {
                m6780M(commandInfo, this.f7720i - commandInfo.m6963v());
                function0.invoke();
            }
            this.f7720i -= commandInfo.m6963v() + commandInfo.m6964w();
        }
        return false;
    }

    /* renamed from: E */
    public final void m6774E() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f7725n;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.reset();
                mediaPlayer.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f7725n = null;
    }

    /* renamed from: F */
    public final void m6775F(long j10, Function0 callBack) throws IllegalStateException, InterruptedException {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f7719h = j10;
        this.f7720i = j10;
        m6774E();
        ListIterator listIterator = this.f7723l;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Thread.sleep(50L);
        m6771B();
        m6786z(callBack);
    }

    /* renamed from: G */
    public final void m6776G(long j10) {
        this.f7724m = j10;
    }

    /* renamed from: H */
    public final void m6777H(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f7723l = C9850c.f17405d.m16499c(path).m8095C().listIterator();
        this.f7722k = path;
        m6771B();
    }

    /* renamed from: I */
    public final void m6778I(float f10) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f7725n;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
            } else {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
                mediaPlayer.pause();
            }
        }
    }

    /* renamed from: J */
    public final void m6779J(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM6959q = commandInfo.m6959q();
        if ((commandEnumM6959q == null ? -1 : C6743a.f7727a[commandEnumM6959q.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM6974w = EzyCommand.CommandSource.CommandInfo.AudioStart.m6974w(commandInfo.m6961s());
            m6774E();
            File file = new File(C9850c.f17405d.m16497a(this.f7722k, DocumentType.AUDIO), audioStartM6974w.getFileName());
            if (file.exists()) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f7725n = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C7439d c7439dM14322e = m14322e();
                if ((c7439dM14322e != null ? c7439dM14322e.m12008a() : 16) != 16 && (mediaPlayer = this.f7725n) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m14322e() != null ? r2.m12008a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f7725n;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f7725n;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: w4.a
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) throws IllegalStateException {
                            AudioCommandThread.m6762K(mediaPlayer5);
                        }
                    });
                }
                MediaPlayer mediaPlayer5 = this.f7725n;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.f7725n;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: w4.b
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m6763L(this.f17116a, mediaPlayer7);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: M */
    public final AbstractC8704e m6780M(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM6959q = commandInfo.m6959q();
        if ((commandEnumM6959q == null ? -1 : C6743a.f7727a[commandEnumM6959q.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM6974w = EzyCommand.CommandSource.CommandInfo.AudioStart.m6974w(commandInfo.m6961s());
            m6774E();
            File file = new File(C9850c.f17405d.m16497a(this.f7722k, DocumentType.AUDIO), audioStartM6974w.getFileName());
            if (file.exists()) {
                Log.i("AudioCommandThread", "音频文件路径 --> " + file.getAbsolutePath());
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f7725n = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C7439d c7439dM14322e = m14322e();
                if ((c7439dM14322e != null ? c7439dM14322e.m12008a() : 16) != 16 && (mediaPlayer = this.f7725n) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m14322e() != null ? r4.m12008a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f7725n;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f7725n;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: w4.c
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) {
                            AudioCommandThread.m6764N(this.f17117a, mediaPlayer5);
                        }
                    });
                }
                this.f7726o = true;
                MediaPlayer mediaPlayer5 = this.f7725n;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.f7725n;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: w4.d
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m6765O(this.f17118a, mediaPlayer7);
                        }
                    });
                }
            }
        }
        return null;
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: k */
    public void mo6781k() throws IllegalStateException {
        super.mo6781k();
        MediaPlayer mediaPlayer = this.f7725n;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: l */
    public void mo6782l() throws IllegalStateException {
        super.mo6782l();
        this.f7720i = 0L;
        this.f7719h = 0L;
        m6774E();
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: m */
    public void mo6783m() throws IllegalStateException {
        super.mo6783m();
        MediaPlayer mediaPlayer = this.f7725n;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IllegalStateException {
        if (m14323f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m14323f() == PlayStatus.RECORD_END) {
            this.f7719h = 0L;
            this.f7720i = 0L;
            return;
        }
        while (m6772C(this.f7721j) && ((m14323f() == PlayStatus.RECORD_START || m14323f() == PlayStatus.RECORD_RESUME) && m6771B())) {
            Log.e("Audio", "我有 命令！");
        }
        this.f7720i = this.f7720i + (m14322e() != null ? r2.m12008a() : 16);
        long jM12008a = this.f7719h + (m14322e() != null ? r2.m12008a() : 16);
        this.f7719h = jM12008a;
        if (jM12008a <= this.f7724m) {
            m14327j(jM12008a);
        } else {
            mo6785u();
            m14327j(this.f7724m);
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: s */
    public void mo6784s() throws IllegalStateException {
        super.mo6784s();
        m6774E();
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: u */
    public void mo6785u() throws IllegalStateException {
        super.mo6785u();
        m6774E();
    }

    /* renamed from: z */
    public final void m6786z(Function0 function0) throws InterruptedException {
        ListIterator listIterator = this.f7721j;
        if (listIterator != null) {
            while (!m6773D(listIterator, new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.AudioCommandThread$fastLoading$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }) && m6771B()) {
            }
        }
        while (this.f7726o) {
            Thread.sleep(16L);
        }
        function0.invoke();
    }
}
