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
import kotlin.p161io.CloseableKt;
import p095e5.AbstractC7850e;
import p189n5.C9097c;
import p272v4.C9766e;

/* loaded from: classes4.dex */
public final class AudioCommandThread extends AbstractC7850e {

    /* renamed from: h */
    public long f9003h;

    /* renamed from: i */
    public long f9004i;

    /* renamed from: j */
    public ListIterator f9005j;

    /* renamed from: k */
    public String f9006k = "";

    /* renamed from: l */
    public ListIterator f9007l;

    /* renamed from: m */
    public long f9008m;

    /* renamed from: n */
    public MediaPlayer f9009n;

    /* renamed from: o */
    public boolean f9010o;

    /* renamed from: com.zykj.blackboard.core.play.AudioCommandThread$a */
    public /* synthetic */ class C7061a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9011a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_AUDIO_START.ordinal()] = 1;
            f9011a = iArr;
        }
    }

    /* renamed from: K */
    public static final void m7874K(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.start();
    }

    /* renamed from: L */
    public static final void m7875L(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m7886E();
    }

    /* renamed from: N */
    public static final void m7876N(AudioCommandThread this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f9010o = false;
    }

    /* renamed from: O */
    public static final void m7877O(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m7886E();
    }

    /* renamed from: A */
    public final boolean m7882A(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m8082z() != 0 && this.f9004i >= commandInfo.m8081y() && this.f9004i < commandInfo.m8081y() + commandInfo.m8082z();
    }

    /* renamed from: B */
    public final boolean m7883B() {
        ListIterator listIterator = this.f9007l;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(this.f9006k, ((EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next()).getFileName()));
        try {
            this.f9005j = EzyCommand.CommandSource.m8058x(fileInputStream).m8060n().listIterator();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            return true;
        } finally {
        }
    }

    /* renamed from: C */
    public final boolean m7884C(ListIterator listIterator) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f9004i < commandInfo.m8081y()) {
                Log.e("Audio", "时间没到");
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return false;
            }
            if (m7882A(commandInfo)) {
                Log.e("Audio", "这边开始播放");
                m7891J(commandInfo, this.f9004i - commandInfo.m8081y());
            }
            this.f9004i -= commandInfo.m8081y() + commandInfo.m8082z();
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m7885D(ListIterator listIterator, Function0 function0) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f9004i < commandInfo.m8081y()) {
                if (!listIterator.hasPrevious()) {
                    return true;
                }
                listIterator.previous();
                return true;
            }
            if (m7882A(commandInfo)) {
                m7892M(commandInfo, this.f9004i - commandInfo.m8081y());
                function0.invoke();
            }
            this.f9004i -= commandInfo.m8081y() + commandInfo.m8082z();
        }
        return false;
    }

    /* renamed from: E */
    public final void m7886E() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f9009n;
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
        this.f9009n = null;
    }

    /* renamed from: F */
    public final void m7887F(long j9, Function0 callBack) throws IllegalStateException, InterruptedException {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f9003h = j9;
        this.f9004i = j9;
        m7886E();
        ListIterator listIterator = this.f9007l;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Thread.sleep(50L);
        m7883B();
        m7898z(callBack);
    }

    /* renamed from: G */
    public final void m7888G(long j9) {
        this.f9008m = j9;
    }

    /* renamed from: H */
    public final void m7889H(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f9007l = C9097c.f15322d.m14639c(path).m9227F().listIterator();
        this.f9006k = path;
        m7883B();
    }

    /* renamed from: I */
    public final void m7890I(float f10) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f9009n;
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
    public final void m7891J(EzyCommand.CommandSource.CommandInfo commandInfo, long j9) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM8077t = commandInfo.m8077t();
        if ((commandEnumM8077t == null ? -1 : C7061a.f9011a[commandEnumM8077t.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM8091z = EzyCommand.CommandSource.CommandInfo.AudioStart.m8091z(commandInfo.m8079v());
            m7886E();
            File file = new File(C9097c.f15322d.m14637a(this.f9006k, DocumentType.AUDIO), audioStartM8091z.getFileName());
            if (file.exists()) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f9009n = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C9766e c9766eM12313e = m12313e();
                if ((c9766eM12313e != null ? c9766eM12313e.m16537a() : 16) != 16 && (mediaPlayer = this.f9009n) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m12313e() != null ? r2.m16537a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f9009n;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f9009n;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: m5.a
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) throws IllegalStateException {
                            AudioCommandThread.m7874K(mediaPlayer5);
                        }
                    });
                }
                MediaPlayer mediaPlayer5 = this.f9009n;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j9);
                }
                MediaPlayer mediaPlayer6 = this.f9009n;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: m5.b
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m7875L(this.f15034a, mediaPlayer7);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: M */
    public final AbstractC7850e m7892M(EzyCommand.CommandSource.CommandInfo commandInfo, long j9) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM8077t = commandInfo.m8077t();
        if ((commandEnumM8077t == null ? -1 : C7061a.f9011a[commandEnumM8077t.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM8091z = EzyCommand.CommandSource.CommandInfo.AudioStart.m8091z(commandInfo.m8079v());
            m7886E();
            File file = new File(C9097c.f15322d.m14637a(this.f9006k, DocumentType.AUDIO), audioStartM8091z.getFileName());
            if (file.exists()) {
                Log.i("AudioCommandThread", "音频文件路径 --> " + file.getAbsolutePath());
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f9009n = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C9766e c9766eM12313e = m12313e();
                if ((c9766eM12313e != null ? c9766eM12313e.m16537a() : 16) != 16 && (mediaPlayer = this.f9009n) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m12313e() != null ? r4.m16537a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f9009n;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f9009n;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: m5.c
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) {
                            AudioCommandThread.m7876N(this.f15035a, mediaPlayer5);
                        }
                    });
                }
                this.f9010o = true;
                MediaPlayer mediaPlayer5 = this.f9009n;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j9);
                }
                MediaPlayer mediaPlayer6 = this.f9009n;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: m5.d
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m7877O(this.f15036a, mediaPlayer7);
                        }
                    });
                }
            }
        }
        return null;
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: k */
    public void mo7893k() throws IllegalStateException {
        super.mo7893k();
        MediaPlayer mediaPlayer = this.f9009n;
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

    @Override // p095e5.AbstractC7850e
    /* renamed from: l */
    public void mo7894l() throws IllegalStateException {
        super.mo7894l();
        this.f9004i = 0L;
        this.f9003h = 0L;
        m7886E();
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: m */
    public void mo7895m() throws IllegalStateException {
        super.mo7895m();
        MediaPlayer mediaPlayer = this.f9009n;
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
        if (m12314f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m12314f() == PlayStatus.RECORD_END) {
            this.f9003h = 0L;
            this.f9004i = 0L;
            return;
        }
        while (m7884C(this.f9005j) && ((m12314f() == PlayStatus.RECORD_START || m12314f() == PlayStatus.RECORD_RESUME) && m7883B())) {
            Log.e("Audio", "我有 命令！");
        }
        this.f9004i = this.f9004i + (m12313e() != null ? r2.m16537a() : 16);
        long jM16537a = this.f9003h + (m12313e() != null ? r2.m16537a() : 16);
        this.f9003h = jM16537a;
        if (jM16537a <= this.f9008m) {
            m12318j(jM16537a);
        } else {
            mo7897u();
            m12318j(this.f9008m);
        }
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: s */
    public void mo7896s() throws IllegalStateException {
        super.mo7896s();
        m7886E();
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: u */
    public void mo7897u() throws IllegalStateException {
        super.mo7897u();
        m7886E();
    }

    /* renamed from: z */
    public final void m7898z(Function0 function0) throws InterruptedException {
        ListIterator listIterator = this.f9005j;
        if (listIterator != null) {
            while (!m7885D(listIterator, new Function0<Unit>() { // from class: com.zykj.blackboard.core.play.AudioCommandThread$fastLoading$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }) && m7883B()) {
            }
        }
        while (this.f9010o) {
            Thread.sleep(16L);
        }
        function0.invoke();
    }
}
