package com.zykj.sketch.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.sketch.C7313R;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.IUserPlay;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.sketch.utils.LogUtils;
import com.zykj.sketch.widgets.DrawTempView;
import com.zykj.sketch.widgets.TextureDrawView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\rJV\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001d0(2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001d0(H\u0016J\b\u00100\u001a\u00020\u001dH\u0014J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020)H\u0014J\b\u00103\u001a\u00020\u001dH\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000207H\u0002JV\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020)2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001d0(2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u001d0(H\u0016J\b\u0010:\u001a\u00020\u001dH\u0016J\b\u0010;\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m13413d2 = {"Lcom/zykj/sketch/core/player/SketchPlayerView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/sketch/core/listener/IUserPlay;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "drawTempView", "Lcom/zykj/sketch/widgets/DrawTempView;", "drawView", "Lcom/zykj/sketch/widgets/TextureDrawView;", "isRun", "", "loadDataExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getLoadDataExecutor", "()Ljava/util/concurrent/ExecutorService;", "loadDataExecutor$delegate", "Lkotlin/Lazy;", "playControl", "Lcom/zykj/sketch/core/player/PlayControl;", "seekExecutor", "getSeekExecutor", "seekExecutor$delegate", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "addPlayActionListener", "", "listener", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "destroy", "getPlayStatus", "Lcom/zykj/sketch/core/data/PlayStatus;", "isRend", "loadData", "path", "", "onSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "onFailure", "", "throwable", "onDetachedFromWindow", "onWindowVisibilityChanged", "visibility", "pause", "removePlayActionListener", "runAtLeastCreated", "runnable", "Ljava/lang/Runnable;", "seekTo", RequestParameters.POSITION, "start", "waiting", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class SketchPlayerView extends RelativeLayout implements IUserPlay {
    public Map<Integer, View> _$_findViewCache;
    private final DrawTempView drawTempView;
    private final TextureDrawView drawView;
    private volatile boolean isRun;

    /* renamed from: loadDataExecutor$delegate, reason: from kotlin metadata */
    private final Lazy loadDataExecutor;
    private final PlayControl playControl;

    /* renamed from: seekExecutor$delegate, reason: from kotlin metadata */
    private final Lazy seekExecutor;
    private SketchConfig sketchConfig;

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 2;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.sketchConfig = new SketchConfig.Builder().build(context);
        DrawTempView drawTempView = new DrawTempView(context, attributeSet);
        this.drawTempView = drawTempView;
        TextureDrawView textureDrawView = new TextureDrawView(context, attributeSet);
        this.drawView = textureDrawView;
        setKeepScreenOn(true);
        addView(textureDrawView);
        addView(drawTempView);
        this.playControl = new PlayControl(this, this.sketchConfig, textureDrawView, drawTempView);
        this.loadDataExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.sketch.core.player.SketchPlayerView$loadDataExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.sketch.core.player.SketchPlayerView$seekExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getLoadDataExecutor() {
        return (ExecutorService) this.loadDataExecutor.getValue();
    }

    private final ExecutorService getSeekExecutor() {
        return (ExecutorService) this.seekExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13, reason: not valid java name */
    public static final void m24724loadData$lambda13(final SketchPlayerView this$0, final String path, final Function1 onSuccess, final Function1 onFailure) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        this$0.getLoadDataExecutor().submit(new Runnable() { // from class: com.zykj.sketch.core.player.s
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                SketchPlayerView.m24725loadData$lambda13$lambda12(this.f10231a, path, onSuccess, onFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12, reason: not valid java name */
    public static final void m24725loadData$lambda13$lambda12(final SketchPlayerView this$0, String path, Function1 onSuccess, final Function1 onFailure) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        try {
            this$0.playControl.loadData(path, new SketchPlayerView$loadData$1$1$1(this$0, onSuccess));
        } catch (HighVersionException e10) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.o
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24730loadData$lambda13$lambda12$lambda5(this.f10220a, onFailure, e10);
                }
            });
        } catch (LowVersionException e11) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.n
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24728loadData$lambda13$lambda12$lambda2(this.f10217a, onFailure, e11);
                }
            });
        } catch (FileNotFoundException e12) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.p
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24732loadData$lambda13$lambda12$lambda8(this.f10223a, onFailure, e12);
                }
            });
        } catch (IOException e13) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.q
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24726loadData$lambda13$lambda12$lambda11(this.f10226a, onFailure, e13);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11, reason: not valid java name */
    public static final void m24726loadData$lambda13$lambda12$lambda11(SketchPlayerView this$0, final Function1 onFailure, final IOException e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.h
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24727loadData$lambda13$lambda12$lambda11$lambda9(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7313R.string.tips_audio_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11$lambda-9, reason: not valid java name */
    public static final void m24727loadData$lambda13$lambda12$lambda11$lambda9(Function1 onFailure, IOException e10) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2, reason: not valid java name */
    public static final void m24728loadData$lambda13$lambda12$lambda2(SketchPlayerView this$0, final Function1 onFailure, final LowVersionException e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.m
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24729loadData$lambda13$lambda12$lambda2$lambda0(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7313R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2$lambda-0, reason: not valid java name */
    public static final void m24729loadData$lambda13$lambda12$lambda2$lambda0(Function1 onFailure, LowVersionException e10) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5, reason: not valid java name */
    public static final void m24730loadData$lambda13$lambda12$lambda5(SketchPlayerView this$0, final Function1 onFailure, final HighVersionException e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.e
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24731loadData$lambda13$lambda12$lambda5$lambda3(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7313R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5$lambda-3, reason: not valid java name */
    public static final void m24731loadData$lambda13$lambda12$lambda5$lambda3(Function1 onFailure, HighVersionException e10) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8, reason: not valid java name */
    public static final void m24732loadData$lambda13$lambda12$lambda8(SketchPlayerView this$0, final Function1 onFailure, final FileNotFoundException e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24733loadData$lambda13$lambda12$lambda8$lambda6(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7313R.string.tips_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8$lambda-6, reason: not valid java name */
    public static final void m24733loadData$lambda13$lambda12$lambda8$lambda6(Function1 onFailure, FileNotFoundException e10) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-14, reason: not valid java name */
    public static final void m24734loadData$lambda14(Function1 onFailure, String path) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(path, "$path");
        onFailure.invoke(new FileNotFoundException(path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State state;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (state = lifecycle.getState()) == null || !state.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22, reason: not valid java name */
    public static final void m24735seekTo$lambda22(final SketchPlayerView this$0, final int i9, final Function1 onSuccess, final Function1 onFailure) {
        Object objM24758constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        this$0.isRun = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            this$0.playControl.seekTo(i9);
            objM24758constructorimpl = Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24765isSuccessimpl(objM24758constructorimpl)) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.f
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24736seekTo$lambda22$lambda18$lambda17(this.f10195a, onSuccess, i9);
                }
            });
        }
        final Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.g
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24738seekTo$lambda22$lambda21$lambda20(this.f10198a, onFailure, thM24761exceptionOrNullimpl);
                }
            });
        }
        this$0.isRun = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17, reason: not valid java name */
    public static final void m24736seekTo$lambda22$lambda18$lambda17(SketchPlayerView this$0, final Function1 onSuccess, final int i9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.j
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24737seekTo$lambda22$lambda18$lambda17$lambda16(onSuccess, i9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17$lambda-16, reason: not valid java name */
    public static final void m24737seekTo$lambda22$lambda18$lambda17$lambda16(Function1 onSuccess, int i9) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20, reason: not valid java name */
    public static final void m24738seekTo$lambda22$lambda21$lambda20(SketchPlayerView this$0, final Function1 onFailure, final Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.r
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24739seekTo$lambda22$lambda21$lambda20$lambda19(onFailure, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20$lambda-19, reason: not valid java name */
    public static final void m24739seekTo$lambda22$lambda21$lambda20$lambda19(Function1 onFailure, Throwable it) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(it, "$it");
        onFailure.invoke(it);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i9) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void addPlayActionListener(PlayActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playControl.addPlayActionListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void destroy() {
        this.drawView.shutdown();
        this.playControl.onDestroy();
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public PlayStatus getPlayStatus() {
        return this.playControl.getPlayStatus();
    }

    public final void isRend(boolean isRend) {
        this.drawView.isRend(isRend);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void loadData(final String path, final Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) throws Exception {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (new File(path).exists()) {
            post(new Runnable() { // from class: com.zykj.sketch.core.player.k
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24724loadData$lambda13(this.f10209a, path, onSuccess, onFailure);
                }
            });
        } else {
            runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.l
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m24734loadData$lambda14(onFailure, path);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.drawView.shutdown();
        this.playControl.onDestroy();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 8) {
            pause();
        }
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void pause() {
        if (this.isRun) {
            return;
        }
        this.playControl.pause();
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void removePlayActionListener(PlayActionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playControl.removePlayActionListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void seekTo(final int position, final Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (this.isRun) {
            return;
        }
        getSeekExecutor().submit(new Runnable() { // from class: com.zykj.sketch.core.player.i
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m24735seekTo$lambda22(this.f10203a, position, onSuccess, onFailure);
            }
        });
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        if (this.isRun) {
            return;
        }
        int i9 = WhenMappings.$EnumSwitchMapping$0[this.playControl.getPlayStatus().ordinal()];
        if (i9 == 1) {
            this.playControl.resume();
            return;
        }
        if (i9 == 2) {
            this.playControl.resume();
        } else if (i9 == 3) {
            this.playControl.resume();
        } else {
            if (i9 != 4) {
                return;
            }
            this.playControl.start();
        }
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void waiting() {
        if (this.isRun) {
            LogUtils.INSTANCE.m9910e("waiting 设置失败");
        } else {
            this.playControl.waiting();
            LogUtils.INSTANCE.m9912i("waiting 设置成功");
        }
    }
}
