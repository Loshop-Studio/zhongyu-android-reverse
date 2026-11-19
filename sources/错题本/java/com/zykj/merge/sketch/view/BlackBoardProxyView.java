package com.zykj.merge.sketch.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewKt;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.core.canvas.SketchPlayView;
import com.zykj.blackboard.core.play.IPlayControl;
import com.zykj.blackboard.core.play.IPlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.merge.sketch.listener.MoveProxy;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJN\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u001fJ]\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\r2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00110\f2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00110\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010\u001fJ\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u001fJ\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010/\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020.2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010\u001fJ#\u0010<\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u000209H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u000209H\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010CJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020.H\u0016¢\u0006\u0004\bF\u00100J\u0017\u0010G\u001a\u00020\u00112\u0006\u0010E\u001a\u00020.H\u0016¢\u0006\u0004\bG\u00100J\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, m5110d2 = {"Lcom/zykj/merge/sketch/view/BlackBoardProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "Lcom/zykj/merge/sketch/listener/MoveProxy;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "path", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "Ld6/s;", "onSuccess", "", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "getPath", "()Ljava/lang/String;", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "removePlayActionListener", "pause", "()V", "waiting", RequestParameters.POSITION, "progress", "throwable", "seekTo", "(ILr6/c;Lr6/c;)V", "start", "resume", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "reset", "release", "destroy", "", "isRend", "(Z)V", "", "rate", "setRate", "(D)Z", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "setAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "areaMoveStart", "", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "getMoveMaxHeightTimes", "()I", "getMoveMaxWidthTimes", "isEnable", "setTranslateEnable", "setScaleEnable", "Landroid/graphics/Bitmap;", "getCurrentScreenBitmap", "()Landroid/graphics/Bitmap;", "Ljava/lang/Runnable;", "runnable", "runAtLeastCreated", "(Ljava/lang/Runnable;)V", "Lcom/zykj/blackboard/core/canvas/SketchPlayView;", "sketchPlayView", "Lcom/zykj/blackboard/core/canvas/SketchPlayView;", "", "playActionListener", "Ljava/util/List;", "Lcom/zykj/blackboard/core/play/IPlayPageControl;", "playPageControl", "Lcom/zykj/blackboard/core/play/IPlayPageControl;", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BlackBoardProxyView extends RelativeLayout implements Play, MoveProxy {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final List<PlayStatusListener> playActionListener;

    @Nullable
    private IPlayPageControl playPageControl;

    @NotNull
    private final SketchPlayView sketchPlayView;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 2;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$1 */
    public static final class C44081 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6471c $onSuccess;
        final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44081(InterfaceC6471c interfaceC6471c, int i) {
            super(0);
            this.$onSuccess = interfaceC6471c;
            this.$position = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m13829invoke$lambda0(InterfaceC6471c onSuccess, int i) {
            AbstractC5830k.m5330g(onSuccess, "$onSuccess");
            onSuccess.invoke(Integer.valueOf(i));
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13830invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13830invoke() {
            BlackBoardProxyView.this.runAtLeastCreated(new RunnableC4415d(this.$position, 0, this.$onSuccess));
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$2 */
    public static final class C44092 extends Lambda implements InterfaceC6471c {
        final /* synthetic */ InterfaceC6471c $onFailure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44092(InterfaceC6471c interfaceC6471c) {
            super(1);
            this.$onFailure = interfaceC6471c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m13831invoke$lambda0(InterfaceC6471c onFailure, Throwable it) {
            AbstractC5830k.m5330g(onFailure, "$onFailure");
            AbstractC5830k.m5330g(it, "$it");
            onFailure.invoke(it);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C5443s.f8405a;
        }

        public final void invoke(@NotNull Throwable it) {
            AbstractC5830k.m5330g(it, "it");
            BlackBoardProxyView.this.runAtLeastCreated(new RunnableC4414c(this.$onFailure, it, 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackBoardProxyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        SketchPlayView sketchPlayView = new SketchPlayView(context, attributeSet);
        this.sketchPlayView = sketchPlayView;
        this.playActionListener = new ArrayList();
        addView(sketchPlayView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-0, reason: not valid java name */
    public static final void m13823seekTo$lambda0(InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        onFailure.invoke(new Exception());
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playActionListener.add(listener);
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveStart() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoveStart();
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoving(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.sketchPlayView.destroyDrawingCache();
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    @Nullable
    public Bitmap getCurrentScreenBitmap() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getCurrentScreenShot();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveHorizontalProgress() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxHeightTimes() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveMaxHeightTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxWidthTimes() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveMaxWidthTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveVerticalProgress() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @Nullable
    public String getPath() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getPageDirPath();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(@NotNull final String path, @NotNull final InterfaceC6471c onSuccess, @NotNull final InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        this.sketchPlayView.ready(new InterfaceC6471c() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1

            @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "throwable", "Ld6/s;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
            /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements InterfaceC6471c {
                final /* synthetic */ InterfaceC6471c $onFailure;
                final /* synthetic */ BlackBoardProxyView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC6471c interfaceC6471c) {
                    super(1);
                    this.this$0 = blackBoardProxyView;
                    this.$onFailure = interfaceC6471c;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-0, reason: not valid java name */
                public static final void m13828invoke$lambda0(InterfaceC6471c onFailure, Throwable throwable) {
                    AbstractC5830k.m5330g(onFailure, "$onFailure");
                    AbstractC5830k.m5330g(throwable, "$throwable");
                    onFailure.invoke(throwable);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull Throwable throwable) {
                    AbstractC5830k.m5330g(throwable, "throwable");
                    this.this$0.runAtLeastCreated(new RunnableC4414c(this.$onFailure, throwable, 0));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IPlayControl) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull final IPlayControl it) {
                AbstractC5830k.m5330g(it, "it");
                String str = path;
                final BlackBoardProxyView blackBoardProxyView = this;
                final InterfaceC6471c interfaceC6471c = onSuccess;
                final InterfaceC6471c interfaceC6471c2 = onFailure;
                it.loadPath(str, new InterfaceC6471c() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1.1

                    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68741 extends Lambda implements InterfaceC6469a {
                        final /* synthetic */ IPlayControl $it;
                        final /* synthetic */ InterfaceC6471c $onSuccess;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68741(BlackBoardProxyView blackBoardProxyView, IPlayControl iPlayControl, InterfaceC6471c interfaceC6471c) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$it = iPlayControl;
                            this.$onSuccess = interfaceC6471c;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                        public static final void m13824invoke$lambda1$lambda0(InterfaceC6471c onSuccess, IPlayPageControl this_apply) {
                            AbstractC5830k.m5330g(onSuccess, "$onSuccess");
                            AbstractC5830k.m5330g(this_apply, "$this_apply");
                            onSuccess.invoke(Integer.valueOf((int) this_apply.getDuration()));
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m13825invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13825invoke() {
                            this.this$0.playPageControl = this.$it.getCurrentPlayPageControl();
                            IPlayPageControl iPlayPageControl = this.this$0.playPageControl;
                            if (iPlayPageControl != null) {
                                final BlackBoardProxyView blackBoardProxyView = this.this$0;
                                InterfaceC6471c interfaceC6471c = this.$onSuccess;
                                iPlayPageControl.addPlayActionListener(new com.zykj.blackboard.listener.PlayStatusListener() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1$1$1
                                    @Override // com.zykj.blackboard.listener.PlayStatusListener
                                    public void onPlayEnd() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayEnd();
                                        }
                                    }

                                    @Override // com.zykj.blackboard.listener.PlayStatusListener
                                    public void onPlayPause() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayPause();
                                        }
                                    }

                                    @Override // com.zykj.blackboard.listener.PlayStatusListener
                                    public void onPlayResume() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // com.zykj.blackboard.listener.PlayStatusListener
                                    public void onPlayStart() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // com.zykj.blackboard.listener.PlayStatusListener
                                    public void onProgress(long progress) {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onProgress(progress);
                                        }
                                    }
                                });
                                blackBoardProxyView.runAtLeastCreated(new RunnableC4412a(interfaceC6471c, iPlayPageControl, 0));
                            }
                        }
                    }

                    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends Lambda implements InterfaceC6469a {
                        final /* synthetic */ InterfaceC6471c $onFailure;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC6471c interfaceC6471c) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$onFailure = interfaceC6471c;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-0, reason: not valid java name */
                        public static final void m13826invoke$lambda0(InterfaceC6471c onFailure) {
                            AbstractC5830k.m5330g(onFailure, "$onFailure");
                            onFailure.invoke(new Exception());
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m13827invoke();
                            return C5443s.f8405a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13827invoke() {
                            this.this$0.runAtLeastCreated(new RunnableC4413b(this.$onFailure, 0));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List<? extends IPlayPageControl>) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull List<? extends IPlayPageControl> playPageControlList) {
                        AbstractC5830k.m5330g(playPageControlList, "playPageControlList");
                        it.switchCurrentPlayPage(AbstractC5806u.m5282u(playPageControlList), new C68741(blackBoardProxyView, it, interfaceC6471c), new AnonymousClass2(blackBoardProxyView, interfaceC6471c2));
                    }
                }, new AnonymousClass2(this, onFailure));
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.pause();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.release();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playActionListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.resume();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        C5443s c5443s;
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.seekTo(position, new C44081(onSuccess, position), new C44092(onFailure));
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        if (c5443s == null) {
            runAtLeastCreated(new RunnableC4413b(onFailure, 1));
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setAreaMoveListener(@Nullable IAreaMoveListener listener) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.setAreaMoveListener(listener);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl == null) {
            return false;
        }
        iPlayPageControl.setRate((float) rate);
        return true;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setScaleEnable(boolean isEnable) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.setScaleEnable(isEnable);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setTranslateEnable(boolean isEnable) {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.setTranslateEnable(isEnable);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @NotNull
    /* renamed from: status */
    public com.zykj.merge.sketch.constant.PlayStatus getPlayStatus() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        PlayStatus playStatusStatus = iPlayPageControl != null ? iPlayPageControl.status() : null;
        int i = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME : com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE : com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        IPlayPageControl iPlayPageControl = this.playPageControl;
        if (iPlayPageControl != null) {
            iPlayPageControl.pause();
        }
    }
}
