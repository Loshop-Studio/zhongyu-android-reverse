package com.zykj.sketch.core.player;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf、文件流、位图。

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.google.protobuf.CodedInputStream;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.ActionExecute;
import com.zykj.sketch.core.ActionStrategyFactory;
import com.zykj.sketch.core.EventTaskParseFactory;
import com.zykj.sketch.core.GraphControl;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.data.VersionParseFactory;
import com.zykj.sketch.core.listener.ImitateDraw;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.core.listener.RealDraw;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.core.record.RecordControl;
import com.zykj.sketch.exception.EmptyDataException;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.sketch.utils.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class PlayControl {
    private final ActionExecute actionExecute;
    private final ActionStrategyFactory actionFactory;
    private AudioThread audioThread;
    private ScheduledExecutorService execute;
    private final GraphControl graphControl;
    private PaintThread paintThread;
    private final List<PlayActionListener> playActionListener;
    private RenderTask renderTask;
    private final SketchConfig sketchConfig;
    private final ViewGroup viewGroup;

    public PlayControl(ViewGroup viewGroup, SketchConfig sketchConfig, RealDraw realDraw, ImitateDraw imitateDraw) {
        AbstractC9133u.m16133g(viewGroup, "viewGroup");
        AbstractC9133u.m16133g(sketchConfig, "sketchConfig");
        AbstractC9133u.m16133g(realDraw, "realDraw");
        AbstractC9133u.m16133g(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        AbstractC9133u.m16132f(context, "viewGroup.context");
        GraphControl graphControl = new GraphControl(context, realDraw, imitateDraw, sketchConfig);
        this.graphControl = graphControl;
        this.playActionListener = new ArrayList();
        ActionStrategyFactory actionStrategyFactory = new ActionStrategyFactory(graphControl);
        this.actionFactory = actionStrategyFactory;
        this.actionExecute = new ActionExecute(viewGroup, graphControl, actionStrategyFactory);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
        AbstractC9133u.m16132f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
        this.execute = scheduledExecutorServiceNewScheduledThreadPool;
        this.paintThread = new PaintThread(graphControl);
        this.audioThread = new AudioThread();
    }

    private final void checkAudioFile() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        RenderTask renderTask = this.renderTask;
        if (renderTask == null || renderTask.getAudioTaskList().isEmpty()) {
            return;
        }
        for (AudioTask audioTask : renderTask.getAudioTaskList()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            audioTask.setPath(this.graphControl.getBaseAudioPath() + audioTask.getFileName());
            if (!new File(audioTask.getPath()).exists()) {
                throw new FileNotFoundException(audioTask.getPath());
            }
            mediaPlayer.setDataSource(audioTask.getPath());
            mediaPlayer.prepare();
            audioTask.setDuration(mediaPlayer.getDuration());
            mediaPlayer.release();
        }
    }

    private final EzyDrawBoard.DrawBoard parseDrawBoardData(CodedInputStream codedInputStream) {
        EzyDrawBoard.DrawBoard.Builder builderNewBuilder = EzyDrawBoard.DrawBoard.newBuilder();
        boolean z10 = false;
        while (!z10) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                z10 = true;
            } else {
                if (tag == 10) {
                    builderNewBuilder.setBoardHead(EzyDrawBoard.BoardHead.parseFrom(codedInputStream.readByteArray()));
                    EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder.build();
                    AbstractC9133u.m16132f(drawBoardBuild, "newBuilder.build()");
                    return drawBoardBuild;
                }
                if (tag == 18) {
                    codedInputStream.readByteArray();
                }
            }
        }
        EzyDrawBoard.DrawBoard drawBoardBuild2 = builderNewBuilder.build();
        AbstractC9133u.m16132f(drawBoardBuild2, "newBuilder.build()");
        return drawBoardBuild2;
    }

    public final void addPlayActionListener(PlayActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.playActionListener.add(listener);
    }

    public final PlayStatus getPlayStatus() {
        return this.paintThread.getStatus();
    }

    public final void loadData(String path, InterfaceC10570l call) throws IllegalStateException, HighVersionException, EmptyDataException, LowVersionException, IOException, SecurityException, IllegalArgumentException {
        List<AudioTask> audioTaskList;
        List<GraphTask> graphTask;
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(call, "call");
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new FileInputStream(new File(path, "actions.bin")));
        AbstractC9133u.m16132f(codedInputStreamNewInstance, "newInstance(\n           …          )\n            )");
        EzyDrawBoard.DrawBoard drawBoardData = parseDrawBoardData(codedInputStreamNewInstance);
        if (!drawBoardData.hasBoardHead()) {
            call.invoke(0);
            throw new EmptyDataException(path);
        }
        EzyDrawBoard.BoardHead boardHead = drawBoardData.getBoardHead();
        if (boardHead != null) {
            if (2 > boardHead.getVersion()) {
                throw new LowVersionException("version=" + boardHead.getVersion() + " supportLastVersion=2");
            }
            if (boardHead.getVersion() > 5) {
                throw new HighVersionException("version=" + boardHead.getVersion() + " Maximum resolution version=5");
            }
            this.sketchConfig.setSourcePath(path);
            this.graphControl.setCameraMatrix(this.viewGroup.getWidth(), this.viewGroup.getHeight(), boardHead.getWidth(), boardHead.getHeight());
            File file = new File(path, RecordControl.thumbnailFileName);
            if (file.exists()) {
                this.graphControl.renderTempThumbnail(BitmapFactory.decodeFile(file.getAbsolutePath()));
            }
            VersionParseFactory.Companion companion = VersionParseFactory.Companion;
            int version = boardHead.getVersion();
            EzyDrawBoard.BoardBody boardBody = drawBoardData.getBoardBody();
            AbstractC9133u.m16132f(boardBody, "data.boardBody");
            this.renderTask = EventTaskParseFactory.Companion.create(boardHead.getVersion()).parse(companion.parse(version, path, boardBody), this.actionExecute, new InterfaceC10570l() { // from class: com.zykj.sketch.core.player.PlayControl$loadData$1$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewControl) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(ViewControl viewControl) {
                    AbstractC9133u.m16133g(viewControl, "viewControl");
                    this.this$0.actionExecute.addViewControl(viewControl);
                }
            });
            checkAudioFile();
            PaintThread paintThread = this.paintThread;
            RenderTask renderTask = this.renderTask;
            if (renderTask != null && (graphTask = renderTask.getGraphTask()) != null) {
                paintThread.setData(graphTask);
                RenderTask renderTask2 = this.renderTask;
                paintThread.setLastTask(renderTask2 != null ? renderTask2.getLastSnapshot() : null);
            }
            RenderTask renderTask3 = this.renderTask;
            if (renderTask3 != null) {
                paintThread.setMaxProgress(renderTask3.getProgress());
            }
            paintThread.setProgressListener(this.playActionListener);
            AudioThread audioThread = this.audioThread;
            RenderTask renderTask4 = this.renderTask;
            if (renderTask4 != null && (audioTaskList = renderTask4.getAudioTaskList()) != null) {
                audioThread.setData(audioTaskList);
            }
            if (this.execute.isShutdown()) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                AbstractC9133u.m16132f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
                this.execute = scheduledExecutorServiceNewScheduledThreadPool;
            }
            ScheduledExecutorService scheduledExecutorService = this.execute;
            PaintThread paintThread2 = this.paintThread;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduledExecutorService.scheduleAtFixedRate(paintThread2, 0L, 40L, timeUnit);
            this.execute.scheduleAtFixedRate(this.audioThread, 0L, 40L, timeUnit);
            RenderTask renderTask5 = this.renderTask;
            call.invoke(Integer.valueOf(renderTask5 != null ? (int) renderTask5.getProgress() : 0));
        }
    }

    public final void onDestroy() {
        this.paintThread.shutdown();
        this.audioThread.shutdown();
        this.execute.shutdown();
        this.graphControl.onDestroy();
    }

    public final void pause() {
        this.paintThread.pausePlay();
        this.audioThread.pausePlay();
    }

    public final void removePlayActionListener(PlayActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.playActionListener.remove(listener);
    }

    public final void resume() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.paintThread.resumePlay();
        this.audioThread.resumePlay();
    }

    public final void seekTo(int i10) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        LogUtils.Companion companion = LogUtils.Companion;
        companion.m9793i("seekTo1 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
        PlayStatus status = this.paintThread.getStatus();
        PlayStatus playStatus = PlayStatus.RECORD_WAIT;
        if (status != playStatus || this.paintThread.getStatus() != PlayStatus.RECORD_PAUSE) {
            this.paintThread.waitPlay();
            this.audioThread.waitPlay();
        }
        Thread.sleep(80L);
        companion.m9793i("seekTo2 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
        this.graphControl.reset();
        this.actionFactory.reset();
        this.paintThread.seekTo(i10);
        this.audioThread.seekTo(i10);
        this.paintThread.initSeekTo();
        this.audioThread.initSeekTo();
        if (this.paintThread.getStatus() == playStatus && this.audioThread.getStatus() == playStatus) {
            this.paintThread.startPlay();
            this.audioThread.startPlay();
        }
        Thread.sleep(80L);
    }

    public final void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        waiting();
        seekTo(0);
    }

    public final void waiting() {
        this.paintThread.waitPlay();
        this.audioThread.waitPlay();
    }
}
