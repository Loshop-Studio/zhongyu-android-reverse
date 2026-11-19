package com.zykj.sketch.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.zykj.sketch.C7471R;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.IUserPlay;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.exception.EmptyDataException;
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
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SketchPlayerView extends RelativeLayout implements IUserPlay {
    public Map<Integer, View> _$_findViewCache;
    private final DrawTempView drawTempView;
    private final TextureDrawView drawView;
    private volatile boolean isRun;
    private final InterfaceC8724d loadDataExecutor$delegate;
    private final PlayControl playControl;
    private final InterfaceC8724d seekExecutor$delegate;
    private SketchConfig sketchConfig;

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
        AbstractC9133u.m16133g(context, "context");
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
        this.loadDataExecutor$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.sketch.core.player.SketchPlayerView$loadDataExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.sketch.core.player.SketchPlayerView$seekExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    private final ExecutorService getLoadDataExecutor() {
        return (ExecutorService) this.loadDataExecutor$delegate.getValue();
    }

    private final ExecutorService getSeekExecutor() {
        return (ExecutorService) this.seekExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13, reason: not valid java name */
    public static final void m27517loadData$lambda13(final SketchPlayerView this$0, final String path, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        this$0.getLoadDataExecutor().submit(new Runnable() { // from class: com.zykj.sketch.core.player.s
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, EmptyDataException, SecurityException, IllegalArgumentException {
                SketchPlayerView.m27518loadData$lambda13$lambda12(this.f10662a, path, onSuccess, onFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12, reason: not valid java name */
    public static final void m27518loadData$lambda13$lambda12(final SketchPlayerView this$0, String path, InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) throws IllegalStateException, EmptyDataException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        try {
            this$0.playControl.loadData(path, new SketchPlayerView$loadData$1$1$1(this$0, onSuccess));
        } catch (HighVersionException e10) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.o
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27523loadData$lambda13$lambda12$lambda5(this.f10651a, onFailure, e10);
                }
            });
        } catch (LowVersionException e11) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.n
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27521loadData$lambda13$lambda12$lambda2(this.f10648a, onFailure, e11);
                }
            });
        } catch (FileNotFoundException e12) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.p
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27525loadData$lambda13$lambda12$lambda8(this.f10654a, onFailure, e12);
                }
            });
        } catch (IOException e13) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.q
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27519loadData$lambda13$lambda12$lambda11(this.f10657a, onFailure, e13);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11, reason: not valid java name */
    public static final void m27519loadData$lambda13$lambda12$lambda11(SketchPlayerView this$0, final InterfaceC10570l onFailure, final IOException e10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.h
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27520loadData$lambda13$lambda12$lambda11$lambda9(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_audio_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-11$lambda-9, reason: not valid java name */
    public static final void m27520loadData$lambda13$lambda12$lambda11$lambda9(InterfaceC10570l onFailure, IOException e10) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2, reason: not valid java name */
    public static final void m27521loadData$lambda13$lambda12$lambda2(SketchPlayerView this$0, final InterfaceC10570l onFailure, final LowVersionException e10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.m
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27522loadData$lambda13$lambda12$lambda2$lambda0(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-2$lambda-0, reason: not valid java name */
    public static final void m27522loadData$lambda13$lambda12$lambda2$lambda0(InterfaceC10570l onFailure, LowVersionException e10) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5, reason: not valid java name */
    public static final void m27523loadData$lambda13$lambda12$lambda5(SketchPlayerView this$0, final InterfaceC10570l onFailure, final HighVersionException e10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.e
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27524loadData$lambda13$lambda12$lambda5$lambda3(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-5$lambda-3, reason: not valid java name */
    public static final void m27524loadData$lambda13$lambda12$lambda5$lambda3(InterfaceC10570l onFailure, HighVersionException e10) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8, reason: not valid java name */
    public static final void m27525loadData$lambda13$lambda12$lambda8(SketchPlayerView this$0, final InterfaceC10570l onFailure, final FileNotFoundException e10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27526loadData$lambda13$lambda12$lambda8$lambda6(onFailure, e10);
            }
        });
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_file_corrupted), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-13$lambda-12$lambda-8$lambda-6, reason: not valid java name */
    public static final void m27526loadData$lambda13$lambda12$lambda8$lambda6(InterfaceC10570l onFailure, FileNotFoundException e10) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        onFailure.invoke(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-14, reason: not valid java name */
    public static final void m27527loadData$lambda14(InterfaceC10570l onFailure, String path) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(path, "$path");
        onFailure.invoke(new FileNotFoundException(path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22, reason: not valid java name */
    public static final void m27528seekTo$lambda22(final SketchPlayerView this$0, final int i10, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        Object objM15909b;
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        this$0.isRun = true;
        try {
            Result.C9076a c9076a = Result.f17350b;
            this$0.playControl.seekTo(i10);
            objM15909b = Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15914h(objM15909b)) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.f
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27529seekTo$lambda22$lambda18$lambda17(this.f10626a, onSuccess, i10);
                }
            });
        }
        final Throwable thM15911d = Result.m15911d(objM15909b);
        if (thM15911d != null) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.player.g
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27531seekTo$lambda22$lambda21$lambda20(this.f10629a, onFailure, thM15911d);
                }
            });
        }
        this$0.isRun = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17, reason: not valid java name */
    public static final void m27529seekTo$lambda22$lambda18$lambda17(SketchPlayerView this$0, final InterfaceC10570l onSuccess, final int i10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.j
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27530seekTo$lambda22$lambda18$lambda17$lambda16(onSuccess, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-18$lambda-17$lambda-16, reason: not valid java name */
    public static final void m27530seekTo$lambda22$lambda18$lambda17$lambda16(InterfaceC10570l onSuccess, int i10) {
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20, reason: not valid java name */
    public static final void m27531seekTo$lambda22$lambda21$lambda20(SketchPlayerView this$0, final InterfaceC10570l onFailure, final Throwable it) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(it, "$it");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.r
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27532seekTo$lambda22$lambda21$lambda20$lambda19(onFailure, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-22$lambda-21$lambda-20$lambda-19, reason: not valid java name */
    public static final void m27532seekTo$lambda22$lambda21$lambda20$lambda19(InterfaceC10570l onFailure, Throwable it) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(it, "$it");
        onFailure.invoke(it);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void addPlayActionListener(PlayActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
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

    public final void isRend(boolean z10) {
        this.drawView.isRend(z10);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void loadData(final String path, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        if (new File(path).exists()) {
            post(new Runnable() { // from class: com.zykj.sketch.core.player.k
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27517loadData$lambda13(this.f10640a, path, onSuccess, onFailure);
                }
            });
        } else {
            runAtLeastCreated(new Runnable() { // from class: com.zykj.sketch.core.player.l
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayerView.m27527loadData$lambda14(onFailure, path);
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
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 8) {
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
        AbstractC9133u.m16133g(listener, "listener");
        this.playControl.removePlayActionListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void seekTo(final int i10, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        if (this.isRun) {
            return;
        }
        getSeekExecutor().submit(new Runnable() { // from class: com.zykj.sketch.core.player.i
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayerView.m27528seekTo$lambda22(this.f10634a, i10, onSuccess, onFailure);
            }
        });
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void start() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        if (this.isRun) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.playControl.getPlayStatus().ordinal()];
        if (i10 == 1) {
            this.playControl.resume();
            return;
        }
        if (i10 == 2) {
            this.playControl.resume();
        } else if (i10 == 3) {
            this.playControl.resume();
        } else {
            if (i10 != 4) {
                return;
            }
            this.playControl.start();
        }
    }

    @Override // com.zykj.sketch.core.listener.IUserPlay
    public void waiting() {
        if (this.isRun) {
            LogUtils.Companion.m9791e("waiting 设置失败");
        } else {
            this.playControl.waiting();
            LogUtils.Companion.m9793i("waiting 设置成功");
        }
    }
}
