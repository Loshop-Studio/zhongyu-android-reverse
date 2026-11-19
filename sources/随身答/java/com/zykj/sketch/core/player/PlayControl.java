package com.zykj.sketch.core.player;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf、文件流、位图。

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0006\u0010 \u001a\u00020!J\"\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001d0&J\u0006\u0010(\u001a\u00020\u001dJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010/\u001a\u00020\u001dJ\u000e\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020'J\u0006\u00102\u001a\u00020\u001dJ\u0006\u00103\u001a\u00020\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m13413d2 = {"Lcom/zykj/sketch/core/player/PlayControl;", "", "viewGroup", "Landroid/view/ViewGroup;", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "realDraw", "Lcom/zykj/sketch/core/listener/RealDraw;", "imitateDraw", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V", "actionExecute", "Lcom/zykj/sketch/core/ActionExecute;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "audioThread", "Lcom/zykj/sketch/core/player/AudioThread;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "graphControl", "Lcom/zykj/sketch/core/GraphControl;", "paintThread", "Lcom/zykj/sketch/core/player/PaintThread;", "playActionListener", "", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "renderTask", "Lcom/zykj/sketch/core/data/RenderTask;", "addPlayActionListener", "", "listener", "checkAudioFile", "getPlayStatus", "Lcom/zykj/sketch/core/data/PlayStatus;", "loadData", "path", "", NotificationCompat.CATEGORY_CALL, "Lkotlin/Function1;", "", "onDestroy", "parseDrawBoardData", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "input", "Lcom/google/protobuf/CodedInputStream;", "pause", "removePlayActionListener", "resume", "seekTo", RequestParameters.POSITION, "start", "waiting", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
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
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(sketchConfig, "sketchConfig");
        Intrinsics.checkNotNullParameter(realDraw, "realDraw");
        Intrinsics.checkNotNullParameter(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "viewGroup.context");
        GraphControl graphControl = new GraphControl(context, realDraw, imitateDraw, sketchConfig);
        this.graphControl = graphControl;
        this.playActionListener = new ArrayList();
        ActionStrategyFactory actionStrategyFactory = new ActionStrategyFactory(graphControl);
        this.actionFactory = actionStrategyFactory;
        this.actionExecute = new ActionExecute(viewGroup, graphControl, actionStrategyFactory);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
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

    private final EzyDrawBoard.DrawBoard parseDrawBoardData(CodedInputStream input) throws IOException {
        EzyDrawBoard.DrawBoard.Builder builderNewBuilder = EzyDrawBoard.DrawBoard.newBuilder();
        boolean z9 = false;
        while (!z9) {
            int tag = input.readTag();
            if (tag == 0) {
                z9 = true;
            } else {
                if (tag == 10) {
                    builderNewBuilder.setBoardHead(EzyDrawBoard.BoardHead.parseFrom(input.readByteArray()));
                    EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder.build();
                    Intrinsics.checkNotNullExpressionValue(drawBoardBuild, "newBuilder.build()");
                    return drawBoardBuild;
                }
                if (tag == 18) {
                    input.readByteArray();
                }
            }
        }
        EzyDrawBoard.DrawBoard drawBoardBuild2 = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(drawBoardBuild2, "newBuilder.build()");
        return drawBoardBuild2;
    }

    public final void addPlayActionListener(PlayActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.add(listener);
    }

    public final PlayStatus getPlayStatus() {
        return this.paintThread.getStatus();
    }

    public final void loadData(String path, Function1<? super Integer, Unit> call) throws Exception {
        List<AudioTask> audioTaskList;
        List<GraphTask> graphTask;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(call, "call");
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new FileInputStream(new File(path, "actions.bin")));
        Intrinsics.checkNotNullExpressionValue(codedInputStreamNewInstance, "newInstance(\n           …          )\n            )");
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
            VersionParseFactory.Companion companion = VersionParseFactory.INSTANCE;
            int version = boardHead.getVersion();
            EzyDrawBoard.BoardBody boardBody = drawBoardData.getBoardBody();
            Intrinsics.checkNotNullExpressionValue(boardBody, "data.boardBody");
            this.renderTask = EventTaskParseFactory.INSTANCE.create(boardHead.getVersion()).parse(companion.parse(version, path, boardBody), this.actionExecute, new Function1<ViewControl, Unit>() { // from class: com.zykj.sketch.core.player.PlayControl$loadData$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewControl viewControl) {
                    invoke2(viewControl);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ViewControl viewControl) {
                    Intrinsics.checkNotNullParameter(viewControl, "viewControl");
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
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
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
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.remove(listener);
    }

    public final void resume() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.paintThread.resumePlay();
        this.audioThread.resumePlay();
    }

    public final void seekTo(int position) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        LogUtils.Companion companion = LogUtils.INSTANCE;
        companion.m9912i("seekTo1 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
        PlayStatus status = this.paintThread.getStatus();
        PlayStatus playStatus = PlayStatus.RECORD_WAIT;
        if (status != playStatus || this.paintThread.getStatus() != PlayStatus.RECORD_PAUSE) {
            this.paintThread.waitPlay();
            this.audioThread.waitPlay();
        }
        Thread.sleep(80L);
        companion.m9912i("seekTo2 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
        this.graphControl.reset();
        this.actionFactory.reset();
        this.paintThread.seekTo(position);
        this.audioThread.seekTo(position);
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
