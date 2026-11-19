package com.zykj.sketch.core.record;

import android.media.MediaRecorder;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.ActionRecord;
import com.zykj.sketch.core.listener.ProgressListener;
import com.zykj.sketch.utils.LogUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)¨\u0006,"}, m5110d2 = {"Lcom/zykj/sketch/core/record/AudioControl;", "", "Lcom/zykj/sketch/core/ActionRecord;", "actionRecord", "<init>", "(Lcom/zykj/sketch/core/ActionRecord;)V", "", "sourcePath", "Ld6/s;", "startRecord", "(Ljava/lang/String;)V", "stopRecord", "()V", "", "isRecord", "()Z", "Lcom/zykj/sketch/core/listener/ProgressListener;", "listener", "addListener", "(Lcom/zykj/sketch/core/listener/ProgressListener;)V", "reset", "Lcom/zykj/sketch/core/ActionRecord;", "Landroid/media/MediaRecorder;", "mediaRecorder", "Landroid/media/MediaRecorder;", "", "audioFileList", "Ljava/util/List;", "fileName", "Ljava/lang/String;", "Z", "Ljava/util/concurrent/ScheduledExecutorService;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;", "timeThread", "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;", "", "totalTime", "J", "systemTime", "Lcom/zykj/sketch/core/listener/ProgressListener;", "Companion", "TimeThread", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioControl {
    public static final int AUDIO_SAMPLE_RATE = 16000;

    @NotNull
    private final ActionRecord actionRecord;

    @NotNull
    private final List<String> audioFileList;

    @Nullable
    private ScheduledExecutorService execute;

    @NotNull
    private String fileName;
    private boolean isRecord;

    @Nullable
    private ProgressListener listener;

    @Nullable
    private MediaRecorder mediaRecorder;
    private long systemTime;

    @NotNull
    private final TimeThread timeThread;
    private long totalTime;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/sketch/core/record/AudioControl$TimeThread;", "Ljava/lang/Thread;", "<init>", "(Lcom/zykj/sketch/core/record/AudioControl;)V", "Ld6/s;", "run", "()V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class TimeThread extends Thread {
        public TimeThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            ProgressListener progressListener = AudioControl.this.listener;
            if (progressListener != null) {
                progressListener.progress((System.currentTimeMillis() + AudioControl.this.totalTime) - AudioControl.this.systemTime);
            }
        }
    }

    public AudioControl(@NotNull ActionRecord actionRecord) {
        AbstractC5830k.m5330g(actionRecord, "actionRecord");
        this.actionRecord = actionRecord;
        this.audioFileList = new ArrayList();
        this.fileName = "";
        this.timeThread = new TimeThread();
    }

    public final void addListener(@Nullable ProgressListener listener) {
        this.listener = listener;
    }

    /* renamed from: isRecord, reason: from getter */
    public final boolean getIsRecord() {
        return this.isRecord;
    }

    public final void reset() {
        this.totalTime = 0L;
    }

    public final synchronized void startRecord(@NotNull String sourcePath) {
        try {
            AbstractC5830k.m5330g(sourcePath, "sourcePath");
            if (this.mediaRecorder != null) {
                System.out.println((Object) ("AudioControl stopRecord 里面结束的 " + this.fileName));
                stopRecord();
            }
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.mediaRecorder = mediaRecorder;
            mediaRecorder.setAudioSource(1);
            MediaRecorder mediaRecorder2 = this.mediaRecorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.setOutputFormat(3);
            }
            MediaRecorder mediaRecorder3 = this.mediaRecorder;
            if (mediaRecorder3 != null) {
                mediaRecorder3.setAudioEncoder(1);
            }
            MediaRecorder mediaRecorder4 = this.mediaRecorder;
            if (mediaRecorder4 != null) {
                mediaRecorder4.setAudioSamplingRate(AUDIO_SAMPLE_RATE);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.fileName = jCurrentTimeMillis + ".amr";
            File file = new File(sourcePath, this.fileName);
            file.getParentFile().mkdirs();
            MediaRecorder mediaRecorder5 = this.mediaRecorder;
            if (mediaRecorder5 != null) {
                mediaRecorder5.setOutputFile(file.getAbsolutePath());
            }
            List<String> list = this.audioFileList;
            String absolutePath = file.getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "audioFile.absolutePath");
            list.add(absolutePath);
            try {
                MediaRecorder mediaRecorder6 = this.mediaRecorder;
                if (mediaRecorder6 != null) {
                    mediaRecorder6.prepare();
                }
                MediaRecorder mediaRecorder7 = this.mediaRecorder;
                if (mediaRecorder7 != null) {
                    mediaRecorder7.start();
                }
                this.systemTime = System.currentTimeMillis();
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                this.execute = scheduledExecutorServiceNewScheduledThreadPool;
                if (scheduledExecutorServiceNewScheduledThreadPool != null) {
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.timeThread, 0L, 50L, TimeUnit.MILLISECONDS);
                }
                ActionRecord actionRecord = this.actionRecord;
                actionRecord.addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_START, actionRecord.buildAudioStartEvent(jCurrentTimeMillis, this.fileName));
                System.out.println((Object) ("AudioControl startRecord 添加了动作 " + this.fileName));
                this.isRecord = true;
            } catch (Exception e) {
                LogUtils.INSTANCE.m4521e("startRecording Exception " + e.getMessage());
                this.isRecord = false;
                this.mediaRecorder = null;
                ProgressListener progressListener = this.listener;
                if (progressListener != null) {
                    progressListener.recordError();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void stopRecord() {
        ActionRecord actionRecord;
        EzyDrawBoard.ActionEnum actionEnum;
        EzyDrawBoard.AudioStopAction audioStopActionBuildAudioStopEvent;
        try {
            MediaRecorder mediaRecorder = this.mediaRecorder;
            if (mediaRecorder != null) {
                try {
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                        ScheduledExecutorService scheduledExecutorService = this.execute;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.shutdown();
                        }
                        this.totalTime = (System.currentTimeMillis() - this.systemTime) + this.totalTime;
                        this.systemTime = 0L;
                        this.mediaRecorder = null;
                        actionRecord = this.actionRecord;
                        actionEnum = EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP;
                        audioStopActionBuildAudioStopEvent = actionRecord.buildAudioStopEvent(System.currentTimeMillis(), this.fileName);
                    } catch (Exception unused) {
                        ScheduledExecutorService scheduledExecutorService2 = this.execute;
                        if (scheduledExecutorService2 != null) {
                            scheduledExecutorService2.shutdown();
                        }
                        this.totalTime = (System.currentTimeMillis() - this.systemTime) + this.totalTime;
                        this.systemTime = 0L;
                        this.mediaRecorder = null;
                        actionRecord = this.actionRecord;
                        actionEnum = EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP;
                        audioStopActionBuildAudioStopEvent = actionRecord.buildAudioStopEvent(System.currentTimeMillis(), this.fileName);
                    }
                    actionRecord.addRecord(actionEnum, audioStopActionBuildAudioStopEvent);
                } catch (Throwable th) {
                    ScheduledExecutorService scheduledExecutorService3 = this.execute;
                    if (scheduledExecutorService3 != null) {
                        scheduledExecutorService3.shutdown();
                    }
                    this.totalTime = (System.currentTimeMillis() - this.systemTime) + this.totalTime;
                    this.systemTime = 0L;
                    this.mediaRecorder = null;
                    ActionRecord actionRecord2 = this.actionRecord;
                    actionRecord2.addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP, actionRecord2.buildAudioStopEvent(System.currentTimeMillis(), this.fileName));
                    throw th;
                }
            }
            System.out.println((Object) ("AudioControl stopRecord 添加了动作 " + this.fileName));
            this.isRecord = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
