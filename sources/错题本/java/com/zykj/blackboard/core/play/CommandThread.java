package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.BaseCommandExecuteFactory;
import com.zykj.blackboard.core.execute.CommandFactory;
import com.zykj.blackboard.core.execute.PlayFinishListener;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010(R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010;¨\u0006<"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/CommandThread;", "Lcom/zykj/blackboard/core/execute/PlayThread;", "<init>", "()V", "", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "iterator", "", "readCommand", "(Ljava/util/ListIterator;)Z", "fastReadCommandAndPause", "next", "isNeedPlay", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z", "loadNextCommandIterator", "()Z", "", "seekTime", "Ld6/s;", "fastLoading", "(J)V", "run", "", "path", "setPageRootPath", "(Ljava/lang/String;)V", "seekTo", "totalDuration", "setMaxPlayTime", "startPlay", "pausePlay", "resumePlay", "stopPlay", "shutdown", "reset", "", "version", "setVersion", "(I)V", "playTime", "J", "nextCommandTime", "commandIterator", "Ljava/util/ListIterator;", "pageRootPath", "Ljava/lang/String;", "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;", "fileSourceIterator", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "execute", "Ljava/util/concurrent/ExecutorService;", "", "threadList", "Ljava/util/List;", "maxDuration", "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;", "commandExecuteFactory", "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;", "I", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CommandThread extends PlayThread {

    @Nullable
    private BaseCommandExecuteFactory commandExecuteFactory;

    @Nullable
    private ListIterator<EzyCommand$CommandSource.CommandInfo> commandIterator;

    @Nullable
    private ListIterator<EzyRouterRecord$RouterRecord.SourceCommandRecord> fileSourceIterator;
    private long maxDuration;
    private long nextCommandTime;
    private long playTime;

    @NotNull
    private String pageRootPath = "";
    private final ExecutorService execute = Executors.newSingleThreadExecutor();

    @NotNull
    private List<PlayThread> threadList = new ArrayList();
    private int version = -1;

    private final void fastLoading(long seekTime) {
        System.out.println((Object) "即将快进");
        while (!fastReadCommandAndPause(this.commandIterator)) {
            if (!loadNextCommandIterator()) {
                System.out.println((Object) ("快进结束 nextCommandTime = " + this.nextCommandTime));
                setPlayStatus((1 > seekTime || seekTime >= this.maxDuration) ? PlayStatus.RECORD_END : PlayStatus.RECORD_PAUSE);
                return;
            }
            System.out.println((Object) "装载了下一个 命令集合");
        }
    }

    // RE note 直接定位检查每条命令的延迟，但只有 isPlay=true 才扣除时间。
    // 顺播 readCommand 则立即执行 isPlay=false 的命令。双分片样本在 1808 ms 可见区别。
    private final boolean fastReadCommandAndPause(ListIterator<EzyCommand$CommandSource.CommandInfo> iterator) {
        final PlayThread playThreadAsyncExecute;
        if (iterator == null) {
            return false;
        }
        while (iterator.hasNext()) {
            final EzyCommand$CommandSource.CommandInfo next = iterator.next();
            if (this.nextCommandTime < next.getDelayTime()) {
                System.out.println((Object) ("快进时，时间没到,快进即将结束 nextCommandTime = " + this.nextCommandTime + "  next.delayTime = " + next.getDelayTime()));
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
                return true;
            }
            if (isNeedPlay(next) && next.getIsPlay()) {
                System.out.println((Object) ("快进到需要播放的指令 nextCommandTime = " + this.nextCommandTime + "  next.delayTime = " + next.getDelayTime()));
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && !graphControl.getIsDraw()) {
                    IGraphControl graphControl2 = getGraphControl();
                    if (graphControl2 != null) {
                        graphControl2.isDraw(true);
                    }
                    IGraphControl graphControl3 = getGraphControl();
                    if (graphControl3 != null) {
                        graphControl3.reDrawFixView();
                    }
                }
                BaseCommandExecuteFactory baseCommandExecuteFactory = this.commandExecuteFactory;
                if (baseCommandExecuteFactory != null && (playThreadAsyncExecute = baseCommandExecuteFactory.asyncExecute(next, this.nextCommandTime - next.getDelayTime())) != null) {
                    System.out.println((Object) "即将异步执行播放指令 ".concat(playThreadAsyncExecute.getClass().getName()));
                    playThreadAsyncExecute.setPlaySpeed(getPlaySpeed());
                    playThreadAsyncExecute.getFinishListener().add(new PlayFinishListener() { // from class: com.zykj.blackboard.core.play.CommandThread$fastReadCommandAndPause$1$1
                        @Override // com.zykj.blackboard.core.execute.PlayFinishListener
                        public void finish(@NotNull PlayThread thread, boolean isCompleted) {
                            AbstractC5830k.m5330g(thread, "thread");
                            this.this$0.threadList.remove(thread);
                            if (!isCompleted || playThreadAsyncExecute.getSourceLoader() == null) {
                                return;
                            }
                            CommandThread commandThread = this.this$0;
                            EzyCommand$CommandSource.CommandInfo commandInfo = next;
                            BaseCommandExecuteFactory baseCommandExecuteFactory2 = commandThread.commandExecuteFactory;
                            if (baseCommandExecuteFactory2 != null) {
                                baseCommandExecuteFactory2.execute(commandInfo);
                            }
                        }
                    });
                    playThreadAsyncExecute.pausePlay();
                    this.threadList.add(playThreadAsyncExecute);
                    this.execute.execute(playThreadAsyncExecute);
                }
            } else {
                BaseCommandExecuteFactory baseCommandExecuteFactory2 = this.commandExecuteFactory;
                if (baseCommandExecuteFactory2 != null) {
                    baseCommandExecuteFactory2.execute(next);
                }
            }
            if (next.getIsPlay()) {
                this.nextCommandTime -= next.getDuration() + next.getDelayTime();
            }
            System.out.println((Object) ("快进中 nextCommandTime = " + this.nextCommandTime));
        }
        System.out.println((Object) "快进中 没有命令啦！！！，赶快去装载下个指令集合");
        return false;
    }

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
        EzyRouterRecord$RouterRecord.SourceCommandRecord next = listIterator.next();
        FileInputStream fileInputStream = new FileInputStream(new File(this.pageRootPath, next.getFileName()));
        EzyCommand$CommandSource from = EzyCommand$CommandSource.parseFrom(fileInputStream);
        this.commandIterator = from.getCommandInfoList().listIterator();
        System.out.println((Object) ("命令文件名=" + next.getFileName() + "  命令长度=" + from.getCommandInfoList().size()));
        fileInputStream.close();
        return true;
    }

    private final boolean readCommand(ListIterator<EzyCommand$CommandSource.CommandInfo> iterator) {
        final PlayThread playThreadAsyncExecute;
        if (iterator == null) {
            return false;
        }
        while (iterator.hasNext()) {
            final EzyCommand$CommandSource.CommandInfo next = iterator.next();
            if (next.getIsPlay()) {
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && !graphControl.getIsDraw()) {
                    IGraphControl graphControl2 = getGraphControl();
                    if (graphControl2 != null) {
                        graphControl2.isDraw(true);
                    }
                    IGraphControl graphControl3 = getGraphControl();
                    if (graphControl3 != null) {
                        graphControl3.reDrawFixView();
                    }
                }
                if (this.nextCommandTime < next.getDelayTime()) {
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    return false;
                }
                if (isNeedPlay(next)) {
                    BaseCommandExecuteFactory baseCommandExecuteFactory = this.commandExecuteFactory;
                    if (baseCommandExecuteFactory != null && (playThreadAsyncExecute = baseCommandExecuteFactory.asyncExecute(next, this.nextCommandTime - next.getDelayTime())) != null) {
                        playThreadAsyncExecute.setPlaySpeed(getPlaySpeed());
                        playThreadAsyncExecute.getFinishListener().add(new PlayFinishListener() { // from class: com.zykj.blackboard.core.play.CommandThread$readCommand$1$1
                            @Override // com.zykj.blackboard.core.execute.PlayFinishListener
                            public void finish(@NotNull PlayThread thread, boolean isCompleted) {
                                AbstractC5830k.m5330g(thread, "thread");
                                this.this$0.threadList.remove(thread);
                                if (!isCompleted || playThreadAsyncExecute.getSourceLoader() == null) {
                                    return;
                                }
                                CommandThread commandThread = this.this$0;
                                EzyCommand$CommandSource.CommandInfo commandInfo = next;
                                BaseCommandExecuteFactory baseCommandExecuteFactory2 = commandThread.commandExecuteFactory;
                                if (baseCommandExecuteFactory2 != null) {
                                    baseCommandExecuteFactory2.execute(commandInfo);
                                }
                            }
                        });
                        playThreadAsyncExecute.startPlay();
                        this.threadList.add(playThreadAsyncExecute);
                        this.execute.execute(playThreadAsyncExecute);
                    }
                } else {
                    BaseCommandExecuteFactory baseCommandExecuteFactory2 = this.commandExecuteFactory;
                    if (baseCommandExecuteFactory2 != null) {
                        baseCommandExecuteFactory2.execute(next);
                    }
                }
                this.nextCommandTime -= next.getDuration() + next.getDelayTime();
            } else {
                IGraphControl graphControl4 = getGraphControl();
                if (graphControl4 != null) {
                    graphControl4.isDraw(false);
                }
                BaseCommandExecuteFactory baseCommandExecuteFactory3 = this.commandExecuteFactory;
                if (baseCommandExecuteFactory3 != null) {
                    baseCommandExecuteFactory3.execute(next);
                }
            }
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void pausePlay() {
        super.pausePlay();
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).pausePlay();
        }
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void reset() {
        super.reset();
        this.nextCommandTime = 0L;
        this.playTime = 0L;
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).shutdown();
        }
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void resumePlay() {
        super.resumePlay();
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).resumePlay();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        SourceLoader sourceLoader;
        IGraphControl graphControl;
        MatrixAdapter matrixAdapter;
        if (this.commandExecuteFactory == null && (sourceLoader = getSourceLoader()) != null && (graphControl = getGraphControl()) != null && (matrixAdapter = getMatrixAdapter()) != null) {
            this.commandExecuteFactory = CommandFactory.INSTANCE.createCommandFactory(this.version, sourceLoader, matrixAdapter, graphControl);
        }
        if (getPlayStatus() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (getPlayStatus() == PlayStatus.RECORD_END) {
            this.playTime = 0L;
            this.nextCommandTime = 0L;
            return;
        }
        while (readCommand(this.commandIterator) && ((getPlayStatus() == PlayStatus.RECORD_START || getPlayStatus() == PlayStatus.RECORD_RESUME) && loadNextCommandIterator())) {
        }
        this.nextCommandTime = this.nextCommandTime + (getPlaySpeed() != null ? r2.getPlayIncrement() : 16);
        long playIncrement = this.playTime + (getPlaySpeed() != null ? r2.getPlayIncrement() : 16);
        this.playTime = playIncrement;
        if (playIncrement <= this.maxDuration + (getPlaySpeed() != null ? r2.getPlayIncrement() : 16)) {
            notifyProgress(this.playTime);
            return;
        }
        stopPlay();
        notifyProgress(this.maxDuration);
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.isDraw(true);
        }
        IGraphControl graphControl3 = getGraphControl();
        if (graphControl3 != null) {
            graphControl3.reDrawFixView();
        }
    }

    public final void seekTo(long seekTime) throws InterruptedException, IOException {
        this.playTime = seekTime;
        this.nextCommandTime = seekTime;
        ListIterator<EzyRouterRecord$RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).shutdown();
        }
        Thread.sleep(50L);
        this.threadList.clear();
        loadNextCommandIterator();
        fastLoading(seekTime);
    }

    public final void setMaxPlayTime(long totalDuration) {
        this.maxDuration = totalDuration;
    }

    public final void setPageRootPath(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        this.fileSourceIterator = SourceRouterRecord.INSTANCE.getRouter(path).getCommandRecordList().listIterator();
        this.pageRootPath = path;
        loadNextCommandIterator();
    }

    public final void setVersion(int version) {
        this.version = version;
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void shutdown() {
        super.shutdown();
        synchronized (this.threadList) {
            Iterator<T> it = this.threadList.iterator();
            while (it.hasNext()) {
                ((PlayThread) it.next()).shutdown();
            }
        }
        this.execute.shutdown();
        this.fileSourceIterator = null;
        this.commandIterator = null;
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void startPlay() {
        super.startPlay();
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).startPlay();
        }
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void stopPlay() {
        super.stopPlay();
        Iterator<T> it = this.threadList.iterator();
        while (it.hasNext()) {
            ((PlayThread) it.next()).stopPlay();
        }
    }
}
