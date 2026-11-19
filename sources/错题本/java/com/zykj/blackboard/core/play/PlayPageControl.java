package com.zykj.blackboard.core.play;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.action.ITouchAction;
import com.zykj.blackboard.core.action.SeeAction;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.play.PlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC5773a;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ9\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000eJ#\u0010.\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0016¢\u0006\u0004\b7\u00106J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/PlayPageControl;", "Lcom/zykj/blackboard/core/play/BasePlayPageControl;", "Lcom/zykj/blackboard/core/play/IPlayControl;", "playControl", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "<init>", "(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V", "Lkotlin/Function0;", "Ld6/s;", "callBack", "initCommandThread", "(Lr6/a;)V", "start", "()V", "resume", "pause", "", "skip", "onSuccess", "Lkotlin/Function1;", "", "onError", "seekTo", "(JLr6/a;Lr6/c;)V", "", "rate", "setRate", "(F)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "getPageDirPath", "()Ljava/lang/String;", "getPageDirName", "getDuration", "()J", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "listener", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "", "getMoveMaxWidthTimes", "()I", "getMoveMaxHeightTimes", "", "isEnable", "setTranslateEnable", "(Z)V", "setScaleEnable", "Landroid/graphics/Bitmap;", "getCurrentScreenShot", "()Landroid/graphics/Bitmap;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "singleExecutor$delegate", "Ld6/e;", "getSingleExecutor", "()Ljava/util/concurrent/ExecutorService;", "singleExecutor", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlayPageControl extends BasePlayPageControl {

    /* renamed from: singleExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e singleExecutor;

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
    /* renamed from: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1 */
    public static final class C43281 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6471c $onError;
        final /* synthetic */ InterfaceC6469a $onSuccess;
        final /* synthetic */ long $skip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43281(long j7, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c) {
            super(0);
            this.$skip = j7;
            this.$onSuccess = interfaceC6469a;
            this.$onError = interfaceC6471c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-2$lambda-1, reason: not valid java name */
        public static final void m13791invoke$lambda2$lambda1(InterfaceC6469a onSuccess) {
            AbstractC5830k.m5330g(onSuccess, "$onSuccess");
            onSuccess.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-4$lambda-3, reason: not valid java name */
        public static final void m13792invoke$lambda4$lambda3(InterfaceC6471c onError, Throwable it) {
            AbstractC5830k.m5330g(onError, "$onError");
            AbstractC5830k.m5330g(it, "$it");
            onError.invoke(it);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13793invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13793invoke() {
            Object objM13956constructorimpl;
            final PlayPageControl playPageControl = PlayPageControl.this;
            final long j7 = this.$skip;
            try {
                System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " seekTo"));
                playPageControl.getCommandThread().pausePlay();
                playPageControl.getAudioCommandThread().pausePlay();
                Thread.sleep(100L);
                playPageControl.getGraphControl().isDraw(false);
                playPageControl.getMatrixAdapter().resetCamera();
                playPageControl.getGraphControl().reset();
                Thread.sleep(100L);
                playPageControl.getAudioCommandThread().seekTo(j7, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$seekTo$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException, IOException {
                        m13794invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13794invoke() throws InterruptedException, IOException {
                        playPageControl.getCommandThread().seekTo(j7);
                        if (!playPageControl.getGraphControl().getIsDraw()) {
                            playPageControl.getGraphControl().isDraw(true);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            System.out.println((Object) ("快进结束后渲染开始 " + System.currentTimeMillis()));
                            playPageControl.getGraphControl().reDrawFixView();
                            System.out.println((Object) ("快进结束后渲染结束 " + (System.currentTimeMillis() - jCurrentTimeMillis)));
                        }
                        Thread.sleep(50L);
                    }
                });
                objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            final InterfaceC6469a interfaceC6469a = this.$onSuccess;
            if (Result.m13962isSuccessimpl(objM13956constructorimpl)) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zykj.blackboard.core.play.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayPageControl.C43281.m13791invoke$lambda2$lambda1(interfaceC6469a);
                    }
                });
            }
            InterfaceC6471c interfaceC6471c = this.$onError;
            Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
            if (thM13959exceptionOrNullimpl != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4335f(0, interfaceC6471c, thM13959exceptionOrNullimpl));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPageControl(@NotNull IPlayControl playControl, @NotNull RenderLayer renderLayer) {
        super(playControl, renderLayer);
        AbstractC5830k.m5330g(playControl, "playControl");
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.singleExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.play.PlayPageControl$singleExecutor$2
            @Override // p152r6.InterfaceC6469a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getSingleExecutor() {
        return (ExecutorService) this.singleExecutor.getValue();
    }

    private final void initCommandThread(InterfaceC6469a callBack) {
        getSingleExecutor().submit(new RunnableC4335f(3, this, callBack));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initCommandThread$lambda-0, reason: not valid java name */
    public static final void m13790initCommandThread$lambda0(PlayPageControl this$0, InterfaceC6469a callBack) throws IllegalStateException, InterruptedException, IOException {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callBack, "$callBack");
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
    public void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).areaMovEnd(horizontalProgress, verticalProgress);
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
    public void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).areaMoving(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    @Nullable
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
    @NotNull
    public String getPageDirName() {
        return getMPageDirName();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    @NotNull
    public String getPageDirPath() {
        return getMPageDirPath();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void onTouchEvent(@NotNull MotionEvent motionEvent) {
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
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
    public void seekTo(long skip, @NotNull InterfaceC6469a onSuccess, @NotNull InterfaceC6471c onError) {
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onError, "onError");
        initCommandThread(new C43281(skip, onSuccess, onError));
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setAreaMoveListener(@Nullable IAreaMoveListener listener) {
        getActionManager().setMAreaMoveListener(listener);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setRate(float rate) throws IllegalStateException {
        if (rate > 0.0f) {
            getPlaySpeed().setRate(rate);
            getAudioCommandThread().setRate(rate);
        }
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setScaleEnable(boolean isEnable) {
        MoveActionConfig moveActionConfig = getActionManager().getBoardConfig().getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setHorizontalTranslate(isEnable);
        moveActionConfig.setVerticalTranslate(isEnable);
        moveActionConfig.setScale(isEnable);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void setTranslateEnable(boolean isEnable) {
        MoveActionConfig moveActionConfig = getActionManager().getBoardConfig().getMoveActionConfig();
        moveActionConfig.setMoveActionEnable(true);
        moveActionConfig.setHorizontalTranslate(isEnable);
        moveActionConfig.setVerticalTranslate(isEnable);
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void start() {
        initCommandThread(new InterfaceC6469a() { // from class: com.zykj.blackboard.core.play.PlayPageControl.start.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13795invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13795invoke() {
                PlayPageControl.this.getCommandThread().startPlay();
                PlayPageControl.this.getAudioCommandThread().startPlay();
            }
        });
    }
}
