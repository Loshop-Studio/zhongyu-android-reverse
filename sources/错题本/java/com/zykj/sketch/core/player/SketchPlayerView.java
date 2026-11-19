package com.zykj.sketch.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewKt;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.merge.sketch.view.RunnableC4417f;
import com.zykj.sketch.C5180R;
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
import kotlin.AbstractC5773a;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0017h;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J]\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0018J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER#\u0010I\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010E¨\u0006J"}, m5110d2 = {"Lcom/zykj/sketch/core/player/SketchPlayerView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/sketch/core/listener/IUserPlay;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "path", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "Ld6/s;", "onSuccess", "", "throwable", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "start", "()V", "pause", "waiting", RequestParameters.POSITION, "seekTo", "(ILr6/c;Lr6/c;)V", "Lcom/zykj/sketch/core/data/PlayStatus;", "getPlayStatus", "()Lcom/zykj/sketch/core/data/PlayStatus;", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "listener", "addPlayActionListener", "(Lcom/zykj/sketch/core/listener/PlayActionListener;)V", "removePlayActionListener", "visibility", "onWindowVisibilityChanged", "(I)V", "onDetachedFromWindow", "destroy", "", "isRend", "(Z)V", "Ljava/lang/Runnable;", "runnable", "runAtLeastCreated", "(Ljava/lang/Runnable;)V", "Lcom/zykj/sketch/core/player/PlayControl;", "playControl", "Lcom/zykj/sketch/core/player/PlayControl;", "Lcom/zykj/sketch/core/config/SketchConfig;", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "Lcom/zykj/sketch/widgets/DrawTempView;", "drawTempView", "Lcom/zykj/sketch/widgets/DrawTempView;", "Lcom/zykj/sketch/widgets/TextureDrawView;", "drawView", "Lcom/zykj/sketch/widgets/TextureDrawView;", "isRun", "Z", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "loadDataExecutor$delegate", "Ld6/e;", "getLoadDataExecutor", "()Ljava/util/concurrent/ExecutorService;", "loadDataExecutor", "seekExecutor$delegate", "getSeekExecutor", "seekExecutor", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchPlayerView extends RelativeLayout implements IUserPlay {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final DrawTempView drawTempView;

    @NotNull
    private final TextureDrawView drawView;
    private volatile boolean isRun;

    /* renamed from: loadDataExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e loadDataExecutor;

    @NotNull
    private final PlayControl playControl;

    /* renamed from: seekExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e seekExecutor;

    @NotNull
    private SketchConfig sketchConfig;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public SketchPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
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
        this.loadDataExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.sketch.core.player.SketchPlayerView$loadDataExecutor$2
            @Override // p152r6.InterfaceC6469a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.sketch.core.player.SketchPlayerView$seekExecutor$2
            @Override // p152r6.InterfaceC6469a
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
    public static final void m13858loadData$lambda13(SketchPlayerView this$0, String path, InterfaceC6471c onSuccess, InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        this$0.getLoadDataExecutor().submit(new RunnableC5192c(this$0, path, onSuccess, onFailure, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12, reason: not valid java name */
    public static final void m13859loadData$lambda13$lambda12(SketchPlayerView this$0, String path, InterfaceC6471c onSuccess, InterfaceC6471c onFailure) throws Exception {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        try {
            this$0.playControl.loadData(path, new SketchPlayerView$loadData$1$1$1(this$0, onSuccess));
        } catch (HighVersionException e) {
            this$0.post(new RunnableC0017h(this$0, onFailure, 12, e));
        } catch (LowVersionException e4) {
            this$0.post(new RunnableC0017h(this$0, onFailure, 11, e4));
        } catch (FileNotFoundException e8) {
            this$0.post(new RunnableC0017h(this$0, onFailure, 13, e8));
        } catch (IOException e9) {
            this$0.post(new RunnableC0017h(this$0, onFailure, 14, e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11, reason: not valid java name */
    public static final void m13860loadData$lambda13$lambda12$lambda11(SketchPlayerView this$0, InterfaceC6471c onFailure, IOException e) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        this$0.runAtLeastCreated(new RunnableC0377a(15, onFailure, e));
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_audio_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11$lambda-9, reason: not valid java name */
    public static final void m13861loadData$lambda13$lambda12$lambda11$lambda9(InterfaceC6471c onFailure, IOException e) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        onFailure.invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2, reason: not valid java name */
    public static final void m13862loadData$lambda13$lambda12$lambda2(SketchPlayerView this$0, InterfaceC6471c onFailure, LowVersionException e) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        this$0.runAtLeastCreated(new RunnableC0377a(17, onFailure, e));
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2$lambda-0, reason: not valid java name */
    public static final void m13863loadData$lambda13$lambda12$lambda2$lambda0(InterfaceC6471c onFailure, LowVersionException e) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        onFailure.invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5, reason: not valid java name */
    public static final void m13864loadData$lambda13$lambda12$lambda5(SketchPlayerView this$0, InterfaceC6471c onFailure, HighVersionException e) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        this$0.runAtLeastCreated(new RunnableC0377a(14, onFailure, e));
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5$lambda-3, reason: not valid java name */
    public static final void m13865loadData$lambda13$lambda12$lambda5$lambda3(InterfaceC6471c onFailure, HighVersionException e) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        onFailure.invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8, reason: not valid java name */
    public static final void m13866loadData$lambda13$lambda12$lambda8(SketchPlayerView this$0, InterfaceC6471c onFailure, FileNotFoundException e) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        this$0.runAtLeastCreated(new RunnableC0377a(13, onFailure, e));
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8$lambda-6, reason: not valid java name */
    public static final void m13867loadData$lambda13$lambda12$lambda8$lambda6(InterfaceC6471c onFailure, FileNotFoundException e) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        onFailure.invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-14, reason: not valid java name */
    public static final void m13868loadData$lambda14(InterfaceC6471c onFailure, String path) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(path, "$path");
        onFailure.invoke(new FileNotFoundException(path));
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
    /* renamed from: seekTo$lambda-22, reason: not valid java name */
    public static final void m13869seekTo$lambda22(SketchPlayerView this$0, int i, InterfaceC6471c onSuccess, InterfaceC6471c onFailure) {
        Object objM13956constructorimpl;
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        this$0.isRun = true;
        try {
            this$0.playControl.seekTo(i);
            objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13962isSuccessimpl(objM13956constructorimpl)) {
            this$0.post(new RunnableC5194e(this$0, onSuccess, i, 1));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            this$0.post(new RunnableC0017h(this$0, onFailure, 10, thM13959exceptionOrNullimpl));
        }
        this$0.isRun = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17, reason: not valid java name */
    public static final void m13870seekTo$lambda22$lambda18$lambda17(SketchPlayerView this$0, InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new RunnableC5193d(i, 1, onSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17$lambda-16, reason: not valid java name */
    public static final void m13871seekTo$lambda22$lambda18$lambda17$lambda16(InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20, reason: not valid java name */
    public static final void m13872seekTo$lambda22$lambda21$lambda20(SketchPlayerView this$0, InterfaceC6471c onFailure, Throwable it) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(it, "$it");
        this$0.runAtLeastCreated(new RunnableC0377a(18, onFailure, it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20$lambda-19, reason: not valid java name */
    public static final void m13873seekTo$lambda22$lambda21$lambda20$lambda19(InterfaceC6471c onFailure, Throwable it) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(it, "$it");
        onFailure.invoke(it);
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

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void addPlayActionListener(@NotNull PlayActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playControl.addPlayActionListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void destroy() {
        this.drawView.shutdown();
        this.playControl.onDestroy();
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    @NotNull
    public PlayStatus getPlayStatus() {
        return this.playControl.getPlayStatus();
    }

    public final void isRend(boolean isRend) {
        this.drawView.isRend(isRend);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void loadData(@NotNull String path, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) throws Exception {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        if (new File(path).exists()) {
            post(new RunnableC5192c(this, path, onSuccess, onFailure, 0));
        } else {
            runAtLeastCreated(new RunnableC0377a(16, onFailure, path));
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
    public void removePlayActionListener(@NotNull PlayActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playControl.removePlayActionListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        if (this.isRun) {
            return;
        }
        getSeekExecutor().submit(new RunnableC4417f(this, position, onSuccess, onFailure, 2));
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void start() {
        if (this.isRun) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.playControl.getPlayStatus().ordinal()];
        if (i == 1) {
            this.playControl.resume();
            return;
        }
        if (i == 2) {
            this.playControl.resume();
        } else if (i == 3) {
            this.playControl.resume();
        } else {
            if (i != 4) {
                return;
            }
            this.playControl.start();
        }
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void waiting() {
        if (this.isRun) {
            LogUtils.INSTANCE.m4521e("waiting 设置失败");
        } else {
            this.playControl.waiting();
            LogUtils.INSTANCE.m4523i("waiting 设置成功");
        }
    }
}
