package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.PlaySpeed;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\u0003J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/AudioCommandThread;", "Lcom/zykj/blackboard/core/execute/PlayThread;", "<init>", "()V", "", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "iterator", "", "readCommand", "(Ljava/util/ListIterator;)Z", "Lkotlin/Function0;", "Ld6/s;", "callBack", "readCommandAndPause", "(Ljava/util/ListIterator;Lr6/a;)Z", "next", "isNeedPlay", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z", "loadNextCommandIterator", "()Z", "releaseCurrentMediaPlayer", "fastLoading", "(Lr6/a;)V", "command", "", "skipTime", "syncExecuteCommand", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)V", "syncExecuteCommandWithPause", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "run", "", "path", "setPageRootPath", "(Ljava/lang/String;)V", "seekTime", "seekTo", "(JLr6/a;)V", "totalDuration", "setMaxPlayTime", "(J)V", "pausePlay", "resumePlay", "stopPlay", "shutdown", "reset", "", "rate", "setRate", "(F)V", "playTime", "J", "nextCommandTime", "commandIterator", "Ljava/util/ListIterator;", "pageRootPath", "Ljava/lang/String;", "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;", "fileSourceIterator", "maxDuration", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "hasSeekMediaPlayer", "Z", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioCommandThread extends PlayThread {

    @Nullable
    private ListIterator<EzyCommand$CommandSource.CommandInfo> commandIterator;

    @Nullable
    private ListIterator<EzyRouterRecord$RouterRecord.SourceCommandRecord> fileSourceIterator;
    private boolean hasSeekMediaPlayer;
    private long maxDuration;

    @Nullable
    private MediaPlayer mediaPlayer;
    private long nextCommandTime;

    @NotNull
    private String pageRootPath = "";
    private long playTime;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum$CommandEnum.values().length];
            iArr[EzyCommandEnum$CommandEnum.ACTION_AUDIO_START.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    // RE note Android 11 实测：定位仅消费进入此方法时保存的迭代器。切换分片后，
    // 下一轮仍传入旧迭代器，所以直接跳到第二片得到静音。顺序播放的 run() 会重读成员变量。
    private final void fastLoading(InterfaceC6469a callBack) throws InterruptedException {
        ListIterator<EzyCommand$CommandSource.CommandInfo> listIterator = this.commandIterator;
        if (listIterator != null) {
            while (!readCommandAndPause(listIterator, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.play.AudioCommandThread$fastLoading$1$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13784invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13784invoke();
                    return C5443s.f8405a;
                }
            }) && loadNextCommandIterator()) {
            }
        }
        while (this.hasSeekMediaPlayer) {
            Thread.sleep(16L);
        }
        callBack.invoke();
    }

    // RE note 录音采用外层命令的半开时间区间 [delayTime, delayTime + duration)。
    // AudioStart.fileName 定位媒体。五个 APK 的第二条 isPlay=false 样本也能播放。
    private final boolean isNeedPlay(EzyCommand$CommandSource.CommandInfo next) {
        if (next.getDuration() != 0 && this.nextCommandTime >= next.getDelayTime()) {
            if (this.nextCommandTime < next.getDuration() + next.getDelayTime()) {
                return true;
            }
        }
        return false;
    }

    private final boolean loadNextCommandIterator() throws IOException {
        ListIterator<EzyRouterRecord$RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(this.pageRootPath, listIterator.next().getFileName()));
        try {
            this.commandIterator = EzyCommand$CommandSource.parseFrom(fileInputStream).getCommandInfoList().listIterator();
            fileInputStream.close();
            return true;
        } finally {
        }
    }

    private final boolean readCommand(ListIterator<EzyCommand$CommandSource.CommandInfo> iterator) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (iterator == null) {
            return false;
        }
        while (iterator.hasNext()) {
            EzyCommand$CommandSource.CommandInfo next = iterator.next();
            if (this.nextCommandTime < next.getDelayTime()) {
                Log.e("Audio", "时间没到");
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
                return false;
            }
            if (isNeedPlay(next)) {
                Log.e("Audio", "这边开始播放");
                syncExecuteCommand(next, this.nextCommandTime - next.getDelayTime());
            }
            this.nextCommandTime -= next.getDuration() + next.getDelayTime();
        }
        return true;
    }

    private final boolean readCommandAndPause(ListIterator<EzyCommand$CommandSource.CommandInfo> iterator, InterfaceC6469a callBack) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        while (iterator.hasNext()) {
            EzyCommand$CommandSource.CommandInfo next = iterator.next();
            if (this.nextCommandTime < next.getDelayTime()) {
                if (!iterator.hasPrevious()) {
                    return true;
                }
                iterator.previous();
                return true;
            }
            if (isNeedPlay(next)) {
                syncExecuteCommandWithPause(next, this.nextCommandTime - next.getDelayTime());
                callBack.invoke();
            }
            this.nextCommandTime -= next.getDuration() + next.getDelayTime();
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mediaPlayer = null;
    }

    private final void syncExecuteCommand(EzyCommand$CommandSource.CommandInfo command, long skipTime) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum$CommandEnum commandEnum = command.getCommandEnum();
        if ((commandEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnum.ordinal()]) == 1) {
            EzyCommand$CommandSource.CommandInfo.AudioStart from = EzyCommand$CommandSource.CommandInfo.AudioStart.parseFrom(command.getData());
            releaseCurrentMediaPlayer();
            File file = new File(SourceRouterRecord.INSTANCE.getResPath(this.pageRootPath, DocumentType.AUDIO), from.getFileName());
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
                    mediaPlayer4.setOnSeekCompleteListener(new C4330a(0));
                }
                MediaPlayer mediaPlayer5 = this.mediaPlayer;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) skipTime);
                }
                MediaPlayer mediaPlayer6 = this.mediaPlayer;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new C4331b(this, 0));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommand$lambda-9$lambda-8, reason: not valid java name */
    public static final void m13781syncExecuteCommand$lambda9$lambda8(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.releaseCurrentMediaPlayer();
    }

    private final PlayThread syncExecuteCommandWithPause(EzyCommand$CommandSource.CommandInfo command, long skipTime) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        EzyCommandEnum$CommandEnum commandEnum = command.getCommandEnum();
        if ((commandEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnum.ordinal()]) == 1) {
            EzyCommand$CommandSource.CommandInfo.AudioStart from = EzyCommand$CommandSource.CommandInfo.AudioStart.parseFrom(command.getData());
            releaseCurrentMediaPlayer();
            File file = new File(SourceRouterRecord.INSTANCE.getResPath(this.pageRootPath, DocumentType.AUDIO), from.getFileName());
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
                            AudioCommandThread.m13782syncExecuteCommandWithPause$lambda14$lambda12(this.f5261a, mediaPlayer5);
                        }
                    });
                }
                this.hasSeekMediaPlayer = true;
                MediaPlayer mediaPlayer5 = this.mediaPlayer;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.seekTo((int) skipTime);
                }
                MediaPlayer mediaPlayer6 = this.mediaPlayer;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.setOnCompletionListener(new C4331b(this, 1));
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommandWithPause$lambda-14$lambda-12, reason: not valid java name */
    public static final void m13782syncExecuteCommandWithPause$lambda14$lambda12(AudioCommandThread this$0, MediaPlayer mediaPlayer) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.hasSeekMediaPlayer = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncExecuteCommandWithPause$lambda-14$lambda-13, reason: not valid java name */
    public static final void m13783syncExecuteCommandWithPause$lambda14$lambda13(AudioCommandThread this$0, MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC5830k.m5330g(this$0, "this$0");
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
            } catch (Exception e) {
                e.printStackTrace();
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
            } catch (Exception e) {
                e.printStackTrace();
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

    public final void seekTo(long seekTime, @NotNull InterfaceC6469a callBack) throws IllegalStateException, InterruptedException, IOException {
        AbstractC5830k.m5330g(callBack, "callBack");
        this.playTime = seekTime;
        this.nextCommandTime = seekTime;
        releaseCurrentMediaPlayer();
        ListIterator<EzyRouterRecord$RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Thread.sleep(50L);
        loadNextCommandIterator();
        fastLoading(callBack);
    }

    public final void setMaxPlayTime(long totalDuration) {
        this.maxDuration = totalDuration;
    }

    public final void setPageRootPath(@NotNull String path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        this.fileSourceIterator = SourceRouterRecord.INSTANCE.getRouter(path).getAudioRecordList().listIterator();
        this.pageRootPath = path;
        loadNextCommandIterator();
    }

    @RequiresApi(23)
    public final void setRate(float rate) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(rate));
            } else {
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(rate));
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
