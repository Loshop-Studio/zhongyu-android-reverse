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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class AudioControl {
    public static final int AUDIO_SAMPLE_RATE = 16000;
    public static final Companion Companion = new Companion(null);
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

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

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
        AbstractC9979u.m20294g(actionRecord, "actionRecord");
        this.actionRecord = actionRecord;
        this.audioFileList = new ArrayList();
        this.fileName = "";
        this.timeThread = new TimeThread();
    }

    public final void addListener(ProgressListener progressListener) {
        this.listener = progressListener;
    }

    public final boolean isRecord() {
        return this.isRecord;
    }

    public final void reset() {
        this.totalTime = 0L;
    }

    public final synchronized void startRecord(String sourcePath) {
        try {
            AbstractC9979u.m20294g(sourcePath, "sourcePath");
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
            AbstractC9979u.m20293f(absolutePath, "audioFile.absolutePath");
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
                LogUtils.Companion.m16656e("startRecording Exception " + e10.getMessage());
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
