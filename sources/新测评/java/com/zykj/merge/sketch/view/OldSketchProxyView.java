package com.zykj.merge.sketch.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.exception.EmptyDataException;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.paint.Actions;
import com.zykj.paint.render.SketchViewer;
import com.zykj.sketch.utils.ProtoFileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J8\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001c0$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001c0$H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0002JV\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020%2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u001c0$2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u001c0$H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\u0015H\u0016J\b\u0010<\u001a\u00020\u001cH\u0016R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0016\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m13558d2 = {"Lcom/zykj/merge/sketch/view/OldSketchProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "loadDataExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getLoadDataExecutor", "()Ljava/util/concurrent/ExecutorService;", "loadDataExecutor$delegate", "Lkotlin/Lazy;", "path", "", "playActionListener", "", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "playStatus", "Lcom/zykj/merge/sketch/constant/PlayStatus;", "seekExecutor", "getSeekExecutor", "seekExecutor$delegate", "sketchPlayView", "Lcom/zykj/paint/render/SketchViewer;", "addPlayActionListener", "", "listener", "destroy", "getPath", "isRend", "", "loadData", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "", "pause", "release", "removePlayActionListener", "reset", "resume", "runAtLeastCreated", "runnable", "Ljava/lang/Runnable;", "runOnMainThread", "seekTo", RequestParameters.POSITION, "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "throwable", "setRate", "rate", "", "start", NotificationCompat.CATEGORY_STATUS, "waiting", "merge_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class OldSketchProxyView extends RelativeLayout implements Play {
    public Map<Integer, View> _$_findViewCache;

    /* renamed from: loadDataExecutor$delegate, reason: from kotlin metadata */
    private final Lazy loadDataExecutor;
    private String path;
    private final List<PlayStatusListener> playActionListener;
    private PlayStatus playStatus;

    /* renamed from: seekExecutor$delegate, reason: from kotlin metadata */
    private final Lazy seekExecutor;
    private final SketchViewer sketchPlayView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSketchProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        SketchViewer sketchViewer = new SketchViewer(context, attributeSet);
        this.sketchPlayView = sketchViewer;
        this.playStatus = PlayStatus.RECORD_END;
        this.playActionListener = new ArrayList();
        addView(sketchViewer);
        sketchViewer.setPlayStatusListener(new com.zykj.paint.player.PlayStatusListener() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView.1
            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayEnd() {
                OldSketchProxyView.this.playStatus = PlayStatus.RECORD_END;
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayEnd();
                }
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayPause() {
                OldSketchProxyView.this.playStatus = PlayStatus.RECORD_PAUSE;
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayPause();
                }
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayStart() {
                OldSketchProxyView.this.playStatus = PlayStatus.RECORD_START;
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onPlayStart();
                }
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onUpdate(long p02) {
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onProgress(p02);
                }
            }
        });
        this.loadDataExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$loadDataExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$seekExecutor$2
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
    /* renamed from: loadData$lambda-4, reason: not valid java name */
    public static final void m24246loadData$lambda4(final OldSketchProxyView this$0, String path, final Function1 onFailure, final Function1 onSuccess) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        this$0.path = path;
        Actions.EzyActionList from = Actions.EzyActionList.parseFrom(ProtoFileUtils.INSTANCE.readProtoFile(path));
        if (from.getActionList().isEmpty()) {
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.l
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m24247loadData$lambda4$lambda1(this.f10612a, onFailure);
                }
            });
        } else {
            this$0.sketchPlayView.setDataSource(from.getActionList(), path);
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.m
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m24249loadData$lambda4$lambda3(this.f10614a, onSuccess);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1, reason: not valid java name */
    public static final void m24247loadData$lambda4$lambda1(OldSketchProxyView this$0, final Function1 onFailure) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.p
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m24248loadData$lambda4$lambda1$lambda0(onFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final void m24248loadData$lambda4$lambda1$lambda0(Function1 onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        onFailure.invoke(new EmptyDataException("找不到文件"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3, reason: not valid java name */
    public static final void m24249loadData$lambda4$lambda3(final OldSketchProxyView this$0, final Function1 onSuccess) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.g
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m24250loadData$lambda4$lambda3$lambda2(onSuccess, this$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m24250loadData$lambda4$lambda3$lambda2(Function1 onSuccess, OldSketchProxyView this$0) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        onSuccess.invoke(Integer.valueOf((int) this$0.sketchPlayView.getTotalTime()));
    }

    private final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State state;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (state = lifecycle.getState()) == null || !state.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    private final void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9, reason: not valid java name */
    public static final void m24251seekTo$lambda9(final OldSketchProxyView this$0, final int i10, final Function1 onSuccess, final Function1 onFailure) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        try {
            this$0.sketchPlayView.seekToCurrentIndex(i10);
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.j
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m24252seekTo$lambda9$lambda6(this.f10606a, onSuccess, i10);
                }
            });
        } catch (Exception e10) {
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.k
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m24254seekTo$lambda9$lambda8(this.f10609a, onFailure, e10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6, reason: not valid java name */
    public static final void m24252seekTo$lambda9$lambda6(OldSketchProxyView this$0, final Function1 onSuccess, final int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.h
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m24253seekTo$lambda9$lambda6$lambda5(onSuccess, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6$lambda-5, reason: not valid java name */
    public static final void m24253seekTo$lambda9$lambda6$lambda5(Function1 onSuccess, int i10) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8, reason: not valid java name */
    public static final void m24254seekTo$lambda9$lambda8(OldSketchProxyView this$0, final Function1 onFailure, final Exception e10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.o
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m24255seekTo$lambda9$lambda8$lambda7(onFailure, e10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final void m24255seekTo$lambda9$lambda8$lambda7(Function1 onFailure, Exception e10) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        Intrinsics.checkNotNullParameter(e10, "$e");
        onFailure.invoke(e10);
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

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.add(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.destroyDrawingCache();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public String getPath() {
        return this.path;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
        this.sketchPlayView.isRend(isRend);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(final String path, final Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        getLoadDataExecutor().submit(new Runnable() { // from class: com.zykj.merge.sketch.view.n
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
                OldSketchProxyView.m24246loadData$lambda4(this.f10616a, path, onFailure, onSuccess);
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() throws IllegalStateException {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        this.sketchPlayView.pause();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() throws IllegalStateException {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.release();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.reset();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() throws IllegalStateException {
        this.playStatus = PlayStatus.RECORD_RESUME;
        this.sketchPlayView.resume();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(final int position, final Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        getSeekExecutor().submit(new Runnable() { // from class: com.zykj.merge.sketch.view.i
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m24251seekTo$lambda9(this.f10602a, position, onSuccess, onFailure);
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.sketchPlayView.play();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    /* renamed from: status, reason: from getter */
    public PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() throws IllegalStateException {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        this.sketchPlayView.pause();
    }
}
