package com.zykj.sketch.core.record;

import android.media.MediaRecorder;
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
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/sketch/core/record/AudioControl;", "", "actionRecord", "Lcom/zykj/sketch/core/ActionRecord;", "(Lcom/zykj/sketch/core/ActionRecord;)V", "audioFileList", "", "", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "fileName", "isRecord", "", "listener", "Lcom/zykj/sketch/core/listener/ProgressListener;", "mediaRecorder", "Landroid/media/MediaRecorder;", "systemTime", "", "timeThread", "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;", "totalTime", "addListener", "", "reset", "startRecord", "sourcePath", "stopRecord", "Companion", "TimeThread", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class AudioControl {
    public static final int AUDIO_SAMPLE_RATE = 16000;
    private final ActionRecord actionRecord;
    private final List<String> audioFileList;
    private ScheduledExecutorService execute;
    private String fileName;
    private boolean isRecord;
    private ProgressListener listener;
    private MediaRecorder mediaRecorder;
    private long systemTime;
    private final TimeThread timeThread;
    private long totalTime;

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m13558d2 = {"Lcom/zykj/sketch/core/record/AudioControl$TimeThread;", "Ljava/lang/Thread;", "(Lcom/zykj/sketch/core/record/AudioControl;)V", "run", "", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public final class TimeThread extends Thread {
        public TimeThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            ProgressListener progressListener = AudioControl.this.listener;
            if (progressListener != null) {
                progressListener.progress((AudioControl.this.totalTime + System.currentTimeMillis()) - AudioControl.this.systemTime);
            }
        }
    }

    public AudioControl(ActionRecord actionRecord) {
        Intrinsics.checkNotNullParameter(actionRecord, "actionRecord");
        this.actionRecord = actionRecord;
        this.audioFileList = new ArrayList();
        this.fileName = "";
        this.timeThread = new TimeThread();
    }

    public final void addListener(ProgressListener listener) {
        this.listener = listener;
    }

    /* renamed from: isRecord, reason: from getter */
    public final boolean getIsRecord() {
        return this.isRecord;
    }

    public final void reset() {
        this.totalTime = 0L;
    }

    public final synchronized void startRecord(String sourcePath) {
        try {
            Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
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
            Intrinsics.checkNotNullExpressionValue(absolutePath, "audioFile.absolutePath");
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
            } catch (Exception e10) {
                LogUtils.INSTANCE.m10647e("startRecording Exception " + e10.getMessage());
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
                        this.totalTime += System.currentTimeMillis() - this.systemTime;
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
                        this.totalTime += System.currentTimeMillis() - this.systemTime;
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
                    this.totalTime += System.currentTimeMillis() - this.systemTime;
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
