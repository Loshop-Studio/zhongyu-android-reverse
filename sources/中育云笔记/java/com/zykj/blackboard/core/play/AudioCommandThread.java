package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import cd.AbstractC5423b;
import com.zykj.blackboard.core.play.AudioCommandThread;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p194ia.C9619c;
import p307q9.C10765e;
import p309qc.C10786q;
import p437z9.AbstractC12031e;

/* loaded from: classes5.dex */
public final class AudioCommandThread extends AbstractC12031e {

    /* renamed from: j */
    public long f18561j;

    /* renamed from: k */
    public long f18562k;

    /* renamed from: l */
    public ListIterator f18563l;

    /* renamed from: m */
    public String f18564m = "";

    /* renamed from: n */
    public ListIterator f18565n;

    /* renamed from: o */
    public long f18566o;

    /* renamed from: p */
    public MediaPlayer f18567p;

    /* renamed from: q */
    public boolean f18568q;

    /* renamed from: com.zykj.blackboard.core.play.AudioCommandThread$a */
    public /* synthetic */ class C8440a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18569a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_AUDIO_START.ordinal()] = 1;
            f18569a = iArr;
        }
    }

    /* renamed from: K */
    public static final void m14498K(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.start();
    }

    /* renamed from: L */
    public static final void m14499L(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.m14510E();
    }

    /* renamed from: N */
    public static final void m14500N(AudioCommandThread this$0, MediaPlayer mediaPlayer) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.f18568q = false;
    }

    /* renamed from: O */
    public static final void m14501O(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.m14510E();
    }

    /* renamed from: A */
    public final boolean m14506A(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m14698t() != 0 && this.f18562k >= commandInfo.m14697r() && this.f18562k < commandInfo.m14697r() + commandInfo.m14698t();
    }

    /* renamed from: B */
    public final boolean m14507B() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ListIterator listIterator = this.f18565n;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(this.f18564m, ((EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next()).getFileName()));
        try {
            this.f18563l = EzyCommand.CommandSource.m14677p(fileInputStream).m14679f().listIterator();
            C10786q c10786q = C10786q.f26013a;
            AbstractC5423b.m2902a(fileInputStream, null);
            return true;
        } finally {
        }
    }

    /* renamed from: C */
    public final boolean m14508C(ListIterator listIterator) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f18562k < commandInfo.m14697r()) {
                Log.e("Audio", "时间没到");
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return false;
            }
            if (m14506A(commandInfo)) {
                Log.e("Audio", "这边开始播放");
                m14515J(commandInfo, this.f18562k - commandInfo.m14697r());
            }
            this.f18562k -= commandInfo.m14697r() + commandInfo.m14698t();
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m14509D(ListIterator listIterator, InterfaceC9529a interfaceC9529a) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f18562k < commandInfo.m14697r()) {
                if (!listIterator.hasPrevious()) {
                    return true;
                }
                listIterator.previous();
                return true;
            }
            if (m14506A(commandInfo)) {
                m14516M(commandInfo, this.f18562k - commandInfo.m14697r());
                interfaceC9529a.invoke();
            }
            this.f18562k -= commandInfo.m14697r() + commandInfo.m14698t();
        }
        return false;
    }

    /* renamed from: E */
    public final void m14510E() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f18567p;
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
        this.f18567p = null;
    }

    /* renamed from: F */
    public final void m14511F(long j10, InterfaceC9529a callBack) throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(callBack, "callBack");
        this.f18561j = j10;
        this.f18562k = j10;
        m14510E();
        ListIterator listIterator = this.f18565n;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Thread.sleep(50L);
        m14507B();
        m14522z(callBack);
    }

    /* renamed from: G */
    public final void m14512G(long j10) {
        this.f18566o = j10;
    }

    /* renamed from: H */
    public final void m14513H(String path) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(path, "path");
        this.f18565n = C9619c.f22151d.m18864c(path).m15845C().listIterator();
        this.f18564m = path;
        m14507B();
    }

    /* renamed from: I */
    public final void m14514I(float f10) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f18567p;
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
    public final void m14515J(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM14693k = commandInfo.m14693k();
        if ((commandEnumM14693k == null ? -1 : C8440a.f18569a[commandEnumM14693k.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM14709t = EzyCommand.CommandSource.CommandInfo.AudioStart.m14709t(commandInfo.m14695n());
            m14510E();
            File file = new File(C9619c.f22151d.m18862a(this.f18564m, DocumentType.AUDIO), audioStartM14709t.getFileName());
            if (file.exists()) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f18567p = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C10765e c10765eM26646e = m26646e();
                if ((c10765eM26646e != null ? c10765eM26646e.m22937a() : 16) != 16 && (mediaPlayer = this.f18567p) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m26646e() != null ? r2.m22937a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f18567p;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f18567p;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: ha.a
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) throws IllegalStateException {
                            AudioCommandThread.m14498K(mediaPlayer5);
                        }
                    });
                }
                MediaPlayer mediaPlayer5 = this.f18567p;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.f18567p;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ha.b
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m14499L(this.f21988a, mediaPlayer7);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: M */
    public final AbstractC12031e m14516M(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM14693k = commandInfo.m14693k();
        if ((commandEnumM14693k == null ? -1 : C8440a.f18569a[commandEnumM14693k.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM14709t = EzyCommand.CommandSource.CommandInfo.AudioStart.m14709t(commandInfo.m14695n());
            m14510E();
            File file = new File(C9619c.f22151d.m18862a(this.f18564m, DocumentType.AUDIO), audioStartM14709t.getFileName());
            if (file.exists()) {
                Log.i("AudioCommandThread", "音频文件路径 --> " + file.getAbsolutePath());
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.f18567p = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                C10765e c10765eM26646e = m26646e();
                if ((c10765eM26646e != null ? c10765eM26646e.m22937a() : 16) != 16 && (mediaPlayer = this.f18567p) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((m26646e() != null ? r4.m22937a() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.f18567p;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.f18567p;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: ha.c
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) {
                            AudioCommandThread.m14500N(this.f21989a, mediaPlayer5);
                        }
                    });
                }
                this.f18568q = true;
                MediaPlayer mediaPlayer5 = this.f18567p;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.f18567p;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ha.d
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m14501O(this.f21990a, mediaPlayer7);
                        }
                    });
                }
            }
        }
        return null;
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: k */
    public void mo14517k() throws IllegalStateException {
        super.mo14517k();
        MediaPlayer mediaPlayer = this.f18567p;
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

    @Override // p437z9.AbstractC12031e
    /* renamed from: l */
    public void mo14518l() throws IllegalStateException {
        super.mo14518l();
        this.f18562k = 0L;
        this.f18561j = 0L;
        m14510E();
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: m */
    public void mo14519m() throws IllegalStateException {
        super.mo14519m();
        MediaPlayer mediaPlayer = this.f18567p;
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
        if (m26647f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m26647f() == PlayStatus.RECORD_END) {
            this.f18561j = 0L;
            this.f18562k = 0L;
            return;
        }
        while (m14508C(this.f18563l) && ((m26647f() == PlayStatus.RECORD_START || m26647f() == PlayStatus.RECORD_RESUME) && m14507B())) {
            Log.e("Audio", "我有 命令！");
        }
        this.f18562k = this.f18562k + (m26646e() != null ? r2.m22937a() : 16);
        long jM22937a = this.f18561j + (m26646e() != null ? r2.m22937a() : 16);
        this.f18561j = jM22937a;
        if (jM22937a <= this.f18566o) {
            m26651j(jM22937a);
        } else {
            mo14521u();
            m26651j(this.f18566o);
        }
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: s */
    public void mo14520s() throws IllegalStateException {
        super.mo14520s();
        m14510E();
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: u */
    public void mo14521u() throws IllegalStateException {
        super.mo14521u();
        m14510E();
    }

    /* renamed from: z */
    public final void m14522z(InterfaceC9529a interfaceC9529a) throws InterruptedException {
        ListIterator listIterator = this.f18563l;
        if (listIterator != null) {
            while (!m14509D(listIterator, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.play.AudioCommandThread$fastLoading$1$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m34013invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m34013invoke();
                    return C10786q.f26013a;
                }
            }) && m14507B()) {
            }
        }
        while (this.f18568q) {
            Thread.sleep(16L);
        }
        interfaceC9529a.invoke();
    }
}
