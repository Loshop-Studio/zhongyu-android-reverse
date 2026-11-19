package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.action.ITouchAction;
import com.zykj.blackboard.core.action.SeeAction;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.play.PlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class PlayPageControl extends BasePlayPageControl {
    private final InterfaceC8724d singleExecutor$delegate;

    /* renamed from: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1 */
    public static final class C71471 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC10570l $onError;
        final /* synthetic */ InterfaceC10559a $onSuccess;
        final /* synthetic */ long $skip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C71471(long j10, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l) {
            super(0);
            this.$skip = j10;
            this.$onSuccess = interfaceC10559a;
            this.$onError = interfaceC10570l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-2$lambda-1, reason: not valid java name */
        public static final void m27455invoke$lambda2$lambda1(InterfaceC10559a onSuccess) {
            AbstractC9133u.m16133g(onSuccess, "$onSuccess");
            onSuccess.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-4$lambda-3, reason: not valid java name */
        public static final void m27456invoke$lambda4$lambda3(InterfaceC10570l onError, Throwable it) {
            AbstractC9133u.m16133g(onError, "$onError");
            AbstractC9133u.m16133g(it, "$it");
            onError.invoke(it);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27457invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27457invoke() {
            Object objM15909b;
            final PlayPageControl playPageControl = PlayPageControl.this;
            final long j10 = this.$skip;
            try {
                Result.C9076a c9076a = Result.f17350b;
                System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " seekTo"));
                playPageControl.getCommandThread().pausePlay();
                playPageControl.getAudioCommandThread().pausePlay();
                Thread.sleep(100L);
                playPageControl.getGraphControl().isDraw(false);
                playPageControl.getMatrixAdapter().resetCamera();
                playPageControl.getGraphControl().reset();
                Thread.sleep(100L);
                playPageControl.getAudioCommandThread().seekTo(j10, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException, IOException {
                        m27458invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27458invoke() throws InterruptedException, IOException {
                        playPageControl.getCommandThread().seekTo(j10);
                        if (!playPageControl.getGraphControl().isDraw()) {
                            playPageControl.getGraphControl().isDraw(true);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            System.out.println((Object) ("快进结束后渲染开始 " + System.currentTimeMillis()));
                            playPageControl.getGraphControl().reDrawFixView();
                            System.out.println((Object) ("快进结束后渲染结束 " + (System.currentTimeMillis() - jCurrentTimeMillis)));
                        }
                        Thread.sleep(50L);
                    }
                });
                objM15909b = Result.m15909b(C8736p.f16368a);
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            final InterfaceC10559a interfaceC10559a = this.$onSuccess;
            if (Result.m15914h(objM15909b)) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayPageControl.C71471.m27455invoke$lambda2$lambda1(interfaceC10559a);
                    }
                });
            }
            final InterfaceC10570l interfaceC10570l = this.$onError;
            final Throwable thM15911d = Result.m15911d(objM15909b);
            if (thM15911d != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayPageControl.C71471.m27456invoke$lambda4$lambda3(interfaceC10570l, thM15911d);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl(IPlayControl playControl, RenderLayer renderLayer) {
        super(playControl, renderLayer);
        AbstractC9133u.m16133g(playControl, "playControl");
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.singleExecutor$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$singleExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor$delegate.getValue();
    }

    private final void initCommandThread(final InterfaceC10559a interfaceC10559a) {
        getSingleExecutor().submit(new Runnable() { // from class: com.zykj.blackboard.core.play.j
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
                PlayPageControl.m27454initCommandThread$lambda0(this.f8797a, interfaceC10559a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initCommandThread$lambda-0, reason: not valid java name */
    public static final void m27454initCommandThread$lambda0(PlayPageControl this$0, InterfaceC10559a callBack) throws IllegalStateException, IllegalAccessException, InterruptedException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callBack, "$callBack");
        if (this$0.status() != PlayStatus.RECORD_END) {
            callBack.invoke();
            return;
        }
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " initCommandThread"));
        this$0.getCommandThread().reset();
        this$0.getAudioCommandThread().reset();
        this$0.getMatrixAdapter().resetCamera();
        this$0.getGraphControl().reset();
        Thread.sleep(50L);
        this$0.getCommandThread().setGraphControl(this$0.getGraphControl());
        this$0.getCommandThread().setSourceLoader(this$0.getCacheSourceLoad());
        this$0.getCommandThread().setMatrixAdapter(this$0.getMatrixAdapter());
        this$0.getCommandThread().setPageRootPath(this$0.getMPageDirPath());
        this$0.getCommandThread().setMaxPlayTime(this$0.getTotalDuration());
        this$0.getAudioCommandThread().setGraphControl(this$0.getGraphControl());
        this$0.getAudioCommandThread().setSourceLoader(this$0.getCacheSourceLoad());
        this$0.getAudioCommandThread().setPageRootPath(this$0.getMPageDirPath());
        this$0.getAudioCommandThread().setMaxPlayTime(this$0.getTotalDuration());
        Thread.sleep(50L);
        this$0.initExecute();
        callBack.invoke();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void areaMoveEnd(Float f10, Float f11) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).areaMovEnd(f10, f11);
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void areaMoveStart() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).areaMoveStart();
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void areaMoving(Float f10, Float f11) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).areaMoving(f10, f11);
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public Bitmap getCurrentScreenShot() {
        return getGraphControl().screenshot();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public long getDuration() {
        return getTotalDuration();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public float getMoveHorizontalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            return ((SeeAction) currentAction).getHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public int getMoveMaxHeightTimes() {
        return getActionManager().getBoardConfig().getMoveActionConfig().getMaxHeightTimes();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public int getMoveMaxWidthTimes() {
        return getActionManager().getBoardConfig().getMoveActionConfig().getMaxWidthTimes();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public float getMoveVerticalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        Log.i("MoveProgress", String.valueOf(currentAction));
        if (currentAction instanceof SeeAction) {
            return ((SeeAction) currentAction).getVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public String getPageDirName() {
        return getMPageDirName();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public String getPageDirPath() {
        return getMPageDirPath();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void onTouchEvent(MotionEvent motionEvent) {
        AbstractC9133u.m16133g(motionEvent, "motionEvent");
        getActionManager().handleTouchEvent(motionEvent);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void pause() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_START || status() == PlayStatus.RECORD_RESUME) {
            getCommandThread().pausePlay();
            getAudioCommandThread().pausePlay();
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void resume() throws IllegalStateException {
        if (status() == PlayStatus.RECORD_PAUSE) {
            getCommandThread().resumePlay();
            getAudioCommandThread().resumePlay();
            initExecute();
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void seekTo(long j10, InterfaceC10559a onSuccess, InterfaceC10570l onError) {
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onError, "onError");
        initCommandThread(new C71471(j10, onSuccess, onError));
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setAreaMoveListener(IAreaMoveListener iAreaMoveListener) {
        getActionManager().setMAreaMoveListener(iAreaMoveListener);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setRate(float f10) throws IllegalStateException {
        if (f10 > 0.0f) {
            getPlaySpeed().setRate(f10);
            getAudioCommandThread().setRate(f10);
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setScaleEnable(boolean z10) {
        MoveActionConfig moveActionConfig = getActionManager().getBoardConfig().getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setHorizontalTranslate(z10);
        moveActionConfig.setVerticalTranslate(z10);
        moveActionConfig.setScale(z10);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setTranslateEnable(boolean z10) {
        MoveActionConfig moveActionConfig = getActionManager().getBoardConfig().getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setHorizontalTranslate(z10);
        moveActionConfig.setVerticalTranslate(z10);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void start() {
        initCommandThread(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.play.PlayPageControl.start.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27459invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27459invoke() {
                PlayPageControl.this.getCommandThread().startPlay();
                PlayPageControl.this.getAudioCommandThread().startPlay();
            }
        });
    }
}
