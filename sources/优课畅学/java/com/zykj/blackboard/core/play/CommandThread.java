package com.zykj.blackboard.core.play;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.BaseCommandExecuteFactory;
import com.zykj.blackboard.core.execute.CommandFactory;
import com.zykj.blackboard.core.execute.PlayFinishListener;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes4.dex */
public final class CommandThread extends PlayThread {
    private BaseCommandExecuteFactory commandExecuteFactory;
    private ListIterator<EzyCommand.CommandSource.CommandInfo> commandIterator;
    private ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> fileSourceIterator;
    private long maxDuration;
    private long nextCommandTime;
    private long playTime;
    private String pageRootPath = "";
    private final ExecutorService execute = Executors.newSingleThreadExecutor();
    private List<PlayThread> threadList = new ArrayList();
    private int version = -1;

    private final void fastLoading(long j10) {
        System.out.println((Object) "即将快进");
        while (!fastReadCommandAndPause(this.commandIterator)) {
            if (!loadNextCommandIterator()) {
                System.out.println((Object) ("快进结束 nextCommandTime = " + this.nextCommandTime));
                setPlayStatus((1 > j10 || j10 >= this.maxDuration) ? PlayStatus.RECORD_END : PlayStatus.RECORD_PAUSE);
                return;
            }
            System.out.println((Object) "装载了下一个 命令集合");
        }
    }

    private final boolean fastReadCommandAndPause(ListIterator<EzyCommand.CommandSource.CommandInfo> listIterator) {
        final PlayThread playThreadAsyncExecute;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            final EzyCommand.CommandSource.CommandInfo next = listIterator.next();
            if (this.nextCommandTime < next.m7450m()) {
                System.out.println((Object) ("快进时，时间没到,快进即将结束 nextCommandTime = " + this.nextCommandTime + "  next.delayTime = " + next.m7450m()));
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return true;
            }
            if (isNeedPlay(next) && next.m7452o()) {
                System.out.println((Object) ("快进到需要播放的指令 nextCommandTime = " + this.nextCommandTime + "  next.delayTime = " + next.m7450m()));
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && !graphControl.isDraw()) {
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
                if (baseCommandExecuteFactory != null && (playThreadAsyncExecute = baseCommandExecuteFactory.asyncExecute(next, this.nextCommandTime - next.m7450m())) != null) {
                    System.out.println((Object) ("即将异步执行播放指令 " + playThreadAsyncExecute.getClass().getName()));
                    playThreadAsyncExecute.setPlaySpeed(getPlaySpeed());
                    playThreadAsyncExecute.getFinishListener().add(new PlayFinishListener() { // from class: com.zykj.blackboard.core.play.CommandThread$fastReadCommandAndPause$1$1
                        @Override // com.zykj.blackboard.core.execute.PlayFinishListener
                        public void finish(PlayThread thread, boolean z10) {
                            AbstractC9133u.m16133g(thread, "thread");
                            this.this$0.threadList.remove(thread);
                            if (!z10 || playThreadAsyncExecute.getSourceLoader() == null) {
                                return;
                            }
                            CommandThread commandThread = this.this$0;
                            EzyCommand.CommandSource.CommandInfo commandInfo = next;
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
            if (next.m7452o()) {
                this.nextCommandTime -= next.m7450m() + next.m7451n();
            }
            System.out.println((Object) ("快进中 nextCommandTime = " + this.nextCommandTime));
        }
        System.out.println((Object) "快进中 没有命令啦！！！，赶快去装载下个指令集合");
        return false;
    }

    private final boolean isNeedPlay(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m7451n() != 0 && this.nextCommandTime >= commandInfo.m7450m() && this.nextCommandTime < commandInfo.m7450m() + commandInfo.m7451n();
    }

    private final boolean loadNextCommandIterator() throws IOException {
        ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        EzyRouterRecord.RouterRecord.SourceCommandRecord next = listIterator.next();
        FileInputStream fileInputStream = new FileInputStream(new File(this.pageRootPath, next.getFileName()));
        EzyCommand.CommandSource commandSourceM7431l = EzyCommand.CommandSource.m7431l(fileInputStream);
        this.commandIterator = commandSourceM7431l.m7433e().listIterator();
        System.out.println((Object) ("命令文件名=" + next.getFileName() + "  命令长度=" + commandSourceM7431l.m7433e().size()));
        fileInputStream.close();
        return true;
    }

    private final boolean readCommand(ListIterator<EzyCommand.CommandSource.CommandInfo> listIterator) {
        final PlayThread playThreadAsyncExecute;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            final EzyCommand.CommandSource.CommandInfo next = listIterator.next();
            if (next.m7452o()) {
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && !graphControl.isDraw()) {
                    IGraphControl graphControl2 = getGraphControl();
                    if (graphControl2 != null) {
                        graphControl2.isDraw(true);
                    }
                    IGraphControl graphControl3 = getGraphControl();
                    if (graphControl3 != null) {
                        graphControl3.reDrawFixView();
                    }
                }
                if (this.nextCommandTime < next.m7450m()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    return false;
                }
                if (isNeedPlay(next)) {
                    BaseCommandExecuteFactory baseCommandExecuteFactory = this.commandExecuteFactory;
                    if (baseCommandExecuteFactory != null && (playThreadAsyncExecute = baseCommandExecuteFactory.asyncExecute(next, this.nextCommandTime - next.m7450m())) != null) {
                        playThreadAsyncExecute.setPlaySpeed(getPlaySpeed());
                        playThreadAsyncExecute.getFinishListener().add(new PlayFinishListener() { // from class: com.zykj.blackboard.core.play.CommandThread$readCommand$1$1
                            @Override // com.zykj.blackboard.core.execute.PlayFinishListener
                            public void finish(PlayThread thread, boolean z10) {
                                AbstractC9133u.m16133g(thread, "thread");
                                this.this$0.threadList.remove(thread);
                                if (!z10 || playThreadAsyncExecute.getSourceLoader() == null) {
                                    return;
                                }
                                CommandThread commandThread = this.this$0;
                                EzyCommand.CommandSource.CommandInfo commandInfo = next;
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
                this.nextCommandTime -= next.m7450m() + next.m7451n();
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

    public final void seekTo(long j10) throws InterruptedException, IOException {
        this.playTime = j10;
        this.nextCommandTime = j10;
        ListIterator<EzyRouterRecord.RouterRecord.SourceCommandRecord> listIterator = this.fileSourceIterator;
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
        fastLoading(j10);
    }

    public final void setMaxPlayTime(long j10) {
        this.maxDuration = j10;
    }

    public final void setPageRootPath(String path) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        this.fileSourceIterator = SourceRouterRecord.Companion.getRouter(path).m8613v().listIterator();
        this.pageRootPath = path;
        loadNextCommandIterator();
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void shutdown() {
        super.shutdown();
        synchronized (this.threadList) {
            try {
                Iterator<T> it = this.threadList.iterator();
                while (it.hasNext()) {
                    ((PlayThread) it.next()).shutdown();
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
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
