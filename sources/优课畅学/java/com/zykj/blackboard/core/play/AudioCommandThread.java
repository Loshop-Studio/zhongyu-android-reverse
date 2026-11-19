package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.zykj.blackboard.bean.PlaySpeed;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.record.SourceRouterRecord;
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
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p256t7.AbstractC10117b;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class AudioCommandThread extends PlayThread {
    private ListIterator<EzyCommand.CommandSource.CommandInfo> commandIterator;
    private ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> fileSourceIterator;
    private boolean hasSeekMediaPlayer;
    private long maxDuration;
    private MediaPlayer mediaPlayer;
    private long nextCommandTime;
    private String pageRootPath = "";
    private long playTime;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_AUDIO_START.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void fastLoading(InterfaceC10559a interfaceC10559a) throws InterruptedException {
        ListIterator<EzyCommand.CommandSource.CommandInfo> listIterator = this.commandIterator;
        if (listIterator != null) {
            while (!readCommandAndPause(listIterator, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.play.AudioCommandThread$fastLoading$1$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27448invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27448invoke();
                    return C8736p.f16368a;
                }
            }) && loadNextCommandIterator()) {
            }
        }
        while (this.hasSeekMediaPlayer) {
            Thread.sleep(16L);
        }
        interfaceC10559a.invoke();
    }

    private final boolean isNeedPlay(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m7451n() != 0 && this.nextCommandTime >= commandInfo.m7450m() && this.nextCommandTime < commandInfo.m7450m() + commandInfo.m7451n();
    }

    private final boolean loadNextCommandIterator() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(this.pageRootPath, listIterator.next().getFileName()));
        try {
            this.commandIterator = EzyCommand.CommandSource.m7431l(fileInputStream).m7433e().listIterator();
            C8736p c8736p = C8736p.f16368a;
            AbstractC10117b.m18861a(fileInputStream, null);
            return true;
        } finally {
        }
    }

    private final boolean readCommand(ListIterator<EzyCommand.CommandSource.CommandInfo> listIterator) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo next = listIterator.next();
            if (this.nextCommandTime < next.m7450m()) {
                Log.e("Audio", "时间没到");
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return false;
            }
            if (isNeedPlay(next)) {
                Log.e("Audio", "这边开始播放");
                syncExecuteCommand(next, this.nextCommandTime - next.m7450m());
            }
            this.nextCommandTime -= next.m7450m() + next.m7451n();
        }
        return true;
    }

    private final boolean readCommandAndPause(ListIterator<EzyCommand.CommandSource.CommandInfo> listIterator, InterfaceC10559a interfaceC10559a) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo next = listIterator.next();
            if (this.nextCommandTime < next.m7450m()) {
                if (!listIterator.hasPrevious()) {
                    return true;
                }
                listIterator.previous();
                return true;
            }
            if (isNeedPlay(next)) {
                syncExecuteCommandWithPause(next, this.nextCommandTime - next.m7450m());
                interfaceC10559a.invoke();
            }
            this.nextCommandTime -= next.m7450m() + next.m7451n();
        }
        return false;
    }

    private final void releaseCurrentMediaPlayer() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
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
        this.mediaPlayer = null;
    }

    private final void syncExecuteCommand(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM7446h = commandInfo.m7446h();
        if ((commandEnumM7446h == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnumM7446h.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM7463n = EzyCommand.CommandSource.CommandInfo.AudioStart.m7463n(commandInfo.m7448j());
            releaseCurrentMediaPlayer();
            File file = new File(SourceRouterRecord.Companion.getResPath(this.pageRootPath, DocumentType.AUDIO), audioStartM7463n.getFileName());
            if (file.exists()) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.mediaPlayer = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                PlaySpeed playSpeed = getPlaySpeed();
                if ((playSpeed != null ? playSpeed.getPlayIncrement() : 16) != 16 && (mediaPlayer = this.mediaPlayer) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((getPlaySpeed() != null ? r2.getPlayIncrement() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.mediaPlayer;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.mediaPlayer;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.zykj.blackboard.core.play.a
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) throws IllegalStateException {
                            mediaPlayer5.start();
                        }
                    });
                }
                MediaPlayer mediaPlayer5 = this.mediaPlayer;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.mediaPlayer;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zykj.blackboard.core.play.b
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m27445syncExecuteCommand$lambda9$lambda8(this.f8782a, mediaPlayer7);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommand$lambda-9$lambda-8, reason: not valid java name */
    public static final void m27445syncExecuteCommand$lambda9$lambda8(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.releaseCurrentMediaPlayer();
    }

    private final PlayThread syncExecuteCommandWithPause(EzyCommand.CommandSource.CommandInfo commandInfo, long j10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum.CommandEnum commandEnumM7446h = commandInfo.m7446h();
        if ((commandEnumM7446h == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnumM7446h.ordinal()]) == 1) {
            EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM7463n = EzyCommand.CommandSource.CommandInfo.AudioStart.m7463n(commandInfo.m7448j());
            releaseCurrentMediaPlayer();
            File file = new File(SourceRouterRecord.Companion.getResPath(this.pageRootPath, DocumentType.AUDIO), audioStartM7463n.getFileName());
            if (file.exists()) {
                Log.i("AudioCommandThread", "音频文件路径 --> " + file.getAbsolutePath());
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                this.mediaPlayer = mediaPlayer2;
                mediaPlayer2.setDataSource(file.getAbsolutePath());
                PlaySpeed playSpeed = getPlaySpeed();
                if ((playSpeed != null ? playSpeed.getPlayIncrement() : 16) != 16 && (mediaPlayer = this.mediaPlayer) != null) {
                    PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
                    playbackParams.setSpeed(((getPlaySpeed() != null ? r4.getPlayIncrement() : 16) * 1.0f) / 16);
                    mediaPlayer.setPlaybackParams(playbackParams);
                }
                MediaPlayer mediaPlayer3 = this.mediaPlayer;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepare();
                }
                MediaPlayer mediaPlayer4 = this.mediaPlayer;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.zykj.blackboard.core.play.c
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer5) {
                            AudioCommandThread.m27446syncExecuteCommandWithPause$lambda14$lambda12(this.f8783a, mediaPlayer5);
                        }
                    });
                }
                this.hasSeekMediaPlayer = true;
                MediaPlayer mediaPlayer5 = this.mediaPlayer;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) j10);
                }
                MediaPlayer mediaPlayer6 = this.mediaPlayer;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zykj.blackboard.core.play.d
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer7) throws IllegalStateException {
                            AudioCommandThread.m27447syncExecuteCommandWithPause$lambda14$lambda13(this.f8784a, mediaPlayer7);
                        }
                    });
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommandWithPause$lambda-14$lambda-12, reason: not valid java name */
    public static final void m27446syncExecuteCommandWithPause$lambda14$lambda12(AudioCommandThread this$0, MediaPlayer mediaPlayer) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.hasSeekMediaPlayer = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommandWithPause$lambda-14$lambda-13, reason: not valid java name */
    public static final void m27447syncExecuteCommandWithPause$lambda14$lambda13(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.releaseCurrentMediaPlayer();
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void pausePlay() throws IllegalStateException {
        super.pausePlay();
        MediaPlayer mediaPlayer = this.mediaPlayer;
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

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void reset() throws IllegalStateException {
        super.reset();
        this.nextCommandTime = 0L;
        this.playTime = 0L;
        releaseCurrentMediaPlayer();
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void resumePlay() throws IllegalStateException {
        super.resumePlay();
        MediaPlayer mediaPlayer = this.mediaPlayer;
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
        if (getPlayStatus() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (getPlayStatus() == PlayStatus.RECORD_END) {
            this.playTime = 0L;
            this.nextCommandTime = 0L;
            return;
        }
        while (readCommand(this.commandIterator) && ((getPlayStatus() == PlayStatus.RECORD_START || getPlayStatus() == PlayStatus.RECORD_RESUME) && loadNextCommandIterator())) {
            Log.e("Audio", "我有 命令！");
        }
        this.nextCommandTime = this.nextCommandTime + (getPlaySpeed() != null ? r2.getPlayIncrement() : 16);
        long playIncrement = this.playTime + (getPlaySpeed() != null ? r2.getPlayIncrement() : 16);
        this.playTime = playIncrement;
        if (playIncrement <= this.maxDuration) {
            notifyProgress(playIncrement);
        } else {
            stopPlay();
            notifyProgress(this.maxDuration);
        }
    }

    public final void seekTo(long j10, InterfaceC10559a callBack) throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(callBack, "callBack");
        this.playTime = j10;
        this.nextCommandTime = j10;
        releaseCurrentMediaPlayer();
        ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Thread.sleep(50L);
        loadNextCommandIterator();
        fastLoading(callBack);
    }

    public final void setMaxPlayTime(long j10) {
        this.maxDuration = j10;
    }

    public final void setPageRootPath(String path) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(path, "path");
        this.fileSourceIterator = SourceRouterRecord.Companion.getRouter(path).m8611t().listIterator();
        this.pageRootPath = path;
        loadNextCommandIterator();
    }

    @RequiresApi(23)
    public final void setRate(float f10) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
            } else {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
                mediaPlayer.pause();
            }
        }
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void shutdown() throws IllegalStateException {
        super.shutdown();
        releaseCurrentMediaPlayer();
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void stopPlay() throws IllegalStateException {
        super.stopPlay();
        releaseCurrentMediaPlayer();
    }
}
