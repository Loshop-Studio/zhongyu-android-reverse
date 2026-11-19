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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0013J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0013J\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0013J\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0017¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0011¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, m5110d2 = {"Lcom/zykj/sketch/core/player/PlayControl;", "", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/zykj/sketch/core/config/SketchConfig;", "sketchConfig", "Lcom/zykj/sketch/core/listener/RealDraw;", "realDraw", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "imitateDraw", "<init>", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V", "Lcom/google/protobuf/CodedInputStream;", "input", "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "parseDrawBoardData", "(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;", "Ld6/s;", "checkAudioFile", "()V", "", "path", "Lkotlin/Function1;", "", NotificationCompat.CATEGORY_CALL, "loadData", "(Ljava/lang/String;Lr6/c;)V", "start", "resume", "waiting", "pause", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "listener", "addPlayActionListener", "(Lcom/zykj/sketch/core/listener/PlayActionListener;)V", "removePlayActionListener", "Lcom/zykj/sketch/core/data/PlayStatus;", "getPlayStatus", "()Lcom/zykj/sketch/core/data/PlayStatus;", RequestParameters.POSITION, "seekTo", "(I)V", "onDestroy", "Landroid/view/ViewGroup;", "Lcom/zykj/sketch/core/config/SketchConfig;", "Lcom/zykj/sketch/core/GraphControl;", "graphControl", "Lcom/zykj/sketch/core/GraphControl;", "", "playActionListener", "Ljava/util/List;", "Lcom/zykj/sketch/core/data/RenderTask;", "renderTask", "Lcom/zykj/sketch/core/data/RenderTask;", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "Lcom/zykj/sketch/core/ActionExecute;", "actionExecute", "Lcom/zykj/sketch/core/ActionExecute;", "Ljava/util/concurrent/ScheduledExecutorService;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/zykj/sketch/core/player/PaintThread;", "paintThread", "Lcom/zykj/sketch/core/player/PaintThread;", "Lcom/zykj/sketch/core/player/AudioThread;", "audioThread", "Lcom/zykj/sketch/core/player/AudioThread;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlayControl {

    @NotNull
    private final ActionExecute actionExecute;

    @NotNull
    private final ActionStrategyFactory actionFactory;

    @NotNull
    private AudioThread audioThread;

    @NotNull
    private ScheduledExecutorService execute;

    @NotNull
    private final GraphControl graphControl;

    @NotNull
    private PaintThread paintThread;

    @NotNull
    private final List<PlayActionListener> playActionListener;

    @Nullable
    private RenderTask renderTask;

    @NotNull
    private final SketchConfig sketchConfig;

    @NotNull
    private final ViewGroup viewGroup;

    public PlayControl(@NotNull ViewGroup viewGroup, @NotNull SketchConfig sketchConfig, @NotNull RealDraw realDraw, @NotNull ImitateDraw imitateDraw) {
        AbstractC5830k.m5330g(viewGroup, "viewGroup");
        AbstractC5830k.m5330g(sketchConfig, "sketchConfig");
        AbstractC5830k.m5330g(realDraw, "realDraw");
        AbstractC5830k.m5330g(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        AbstractC5830k.m5329f(context, "viewGroup.context");
        GraphControl graphControl = new GraphControl(context, realDraw, imitateDraw, sketchConfig);
        this.graphControl = graphControl;
        this.playActionListener = new ArrayList();
        ActionStrategyFactory actionStrategyFactory = new ActionStrategyFactory(graphControl);
        this.actionFactory = actionStrategyFactory;
        this.actionExecute = new ActionExecute(viewGroup, graphControl, actionStrategyFactory);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
        AbstractC5830k.m5329f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
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
        boolean z8 = false;
        while (!z8) {
            int tag = input.readTag();
            if (tag == 0) {
                z8 = true;
            } else {
                if (tag == 10) {
                    builderNewBuilder.setBoardHead(EzyDrawBoard.BoardHead.parseFrom(input.readByteArray()));
                    EzyDrawBoard.DrawBoard drawBoardBuild = builderNewBuilder.build();
                    AbstractC5830k.m5329f(drawBoardBuild, "newBuilder.build()");
                    return drawBoardBuild;
                }
                if (tag == 18) {
                    input.readByteArray();
                }
            }
        }
        EzyDrawBoard.DrawBoard drawBoardBuild2 = builderNewBuilder.build();
        AbstractC5830k.m5329f(drawBoardBuild2, "newBuilder.build()");
        return drawBoardBuild2;
    }

    public final void addPlayActionListener(@NotNull PlayActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playActionListener.add(listener);
    }

    @NotNull
    public final PlayStatus getPlayStatus() {
        return this.paintThread.getStatus();
    }

    public final void loadData(@NotNull String path, @NotNull InterfaceC6471c call) throws Exception {
        List<AudioTask> audioTaskList;
        List<GraphTask> graphTask;
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(call, "call");
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new FileInputStream(new File(path, "actions.bin")));
        AbstractC5830k.m5329f(codedInputStreamNewInstance, "newInstance(\n           …          )\n            )");
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
            AbstractC5830k.m5329f(boardBody, "data.boardBody");
            this.renderTask = EventTaskParseFactory.INSTANCE.create(boardHead.getVersion()).parse(companion.parse(version, path, boardBody), this.actionExecute, new InterfaceC6471c() { // from class: com.zykj.sketch.core.player.PlayControl$loadData$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewControl) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull ViewControl viewControl) {
                    AbstractC5830k.m5330g(viewControl, "viewControl");
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
                AbstractC5830k.m5329f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(2)");
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

    public final void removePlayActionListener(@NotNull PlayActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playActionListener.remove(listener);
    }

    public final void resume() {
        this.paintThread.resumePlay();
        this.audioThread.resumePlay();
    }

    public final void seekTo(int position) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        LogUtils.Companion companion = LogUtils.INSTANCE;
        companion.m4523i("seekTo1 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
        PlayStatus status = this.paintThread.getStatus();
        PlayStatus playStatus = PlayStatus.RECORD_WAIT;
        if (status != playStatus || this.paintThread.getStatus() != PlayStatus.RECORD_PAUSE) {
            this.paintThread.waitPlay();
            this.audioThread.waitPlay();
        }
        Thread.sleep(80L);
        companion.m4523i("seekTo2 " + Thread.currentThread().getName() + ' ' + this.paintThread.getStatus());
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

    public final void start() {
        waiting();
        seekTo(0);
    }

    public final void waiting() {
        this.paintThread.waitPlay();
        this.audioThread.waitPlay();
    }
}
