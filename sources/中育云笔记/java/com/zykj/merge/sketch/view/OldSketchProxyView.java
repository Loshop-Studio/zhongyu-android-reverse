package com.zykj.merge.sketch.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
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
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10773d;

/* loaded from: classes6.dex */
public final class OldSketchProxyView extends RelativeLayout implements Play {
    public Map<Integer, View> _$_findViewCache;
    private final InterfaceC10773d loadDataExecutor$delegate;
    private String path;
    private final List<PlayStatusListener> playActionListener;
    private PlayStatus playStatus;
    private final InterfaceC10773d seekExecutor$delegate;
    private final SketchViewer sketchPlayView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSketchProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
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
            public void onUpdate(long j10) {
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onProgress(j10);
                }
            }
        });
        this.loadDataExecutor$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$loadDataExecutor$2
            @Override // p181hd.InterfaceC9529a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$seekExecutor$2
            @Override // p181hd.InterfaceC9529a
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
    /* renamed from: loadData$lambda-4, reason: not valid java name */
    public static final void m34035loadData$lambda4(final OldSketchProxyView this$0, String path, final InterfaceC9540l onFailure, final InterfaceC9540l onSuccess) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(path, "$path");
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        this$0.path = path;
        Actions.EzyActionList from = Actions.EzyActionList.parseFrom(ProtoFileUtils.Companion.readProtoFile(path));
        if (from.getActionList().isEmpty()) {
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.l
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m34036loadData$lambda4$lambda1(this.f19754c, onFailure);
                }
            });
        } else {
            this$0.sketchPlayView.setDataSource(from.getActionList(), path);
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.m
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m34038loadData$lambda4$lambda3(this.f19756c, onSuccess);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1, reason: not valid java name */
    public static final void m34036loadData$lambda4$lambda1(OldSketchProxyView this$0, final InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.p
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m34037loadData$lambda4$lambda1$lambda0(onFailure);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final void m34037loadData$lambda4$lambda1$lambda0(InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        onFailure.invoke(new EmptyDataException("找不到文件"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3, reason: not valid java name */
    public static final void m34038loadData$lambda4$lambda3(final OldSketchProxyView this$0, final InterfaceC9540l onSuccess) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.g
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m34039loadData$lambda4$lambda3$lambda2(onSuccess, this$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m34039loadData$lambda4$lambda3$lambda2(InterfaceC9540l onSuccess, OldSketchProxyView this$0) {
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        AbstractC9979u.m20294g(this$0, "this$0");
        onSuccess.invoke(Integer.valueOf((int) this$0.sketchPlayView.getTotalTime()));
    }

    private final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    private final void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9, reason: not valid java name */
    public static final void m34040seekTo$lambda9(final OldSketchProxyView this$0, final int i10, final InterfaceC9540l onSuccess, final InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        try {
            this$0.sketchPlayView.seekToCurrentIndex(i10);
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.j
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m34041seekTo$lambda9$lambda6(this.f19748c, onSuccess, i10);
                }
            });
        } catch (Exception e10) {
            this$0.runOnMainThread(new Runnable() { // from class: com.zykj.merge.sketch.view.k
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m34043seekTo$lambda9$lambda8(this.f19751c, onFailure, e10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6, reason: not valid java name */
    public static final void m34041seekTo$lambda9$lambda6(OldSketchProxyView this$0, final InterfaceC9540l onSuccess, final int i10) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.h
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m34042seekTo$lambda9$lambda6$lambda5(onSuccess, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6$lambda-5, reason: not valid java name */
    public static final void m34042seekTo$lambda9$lambda6$lambda5(InterfaceC9540l onSuccess, int i10) {
        AbstractC9979u.m20294g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8, reason: not valid java name */
    public static final void m34043seekTo$lambda9$lambda8(OldSketchProxyView this$0, final InterfaceC9540l onFailure, final Exception e10) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        AbstractC9979u.m20294g(e10, "$e");
        this$0.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.o
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m34044seekTo$lambda9$lambda8$lambda7(onFailure, e10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final void m34044seekTo$lambda9$lambda8$lambda7(InterfaceC9540l onFailure, Exception e10) {
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        AbstractC9979u.m20294g(e10, "$e");
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
        AbstractC9979u.m20294g(listener, "listener");
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
    public void isRend(boolean z10) {
        this.sketchPlayView.isRend(z10);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(final String path, final InterfaceC9540l onSuccess, final InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        getLoadDataExecutor().submit(new Runnable() { // from class: com.zykj.merge.sketch.view.n
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
                OldSketchProxyView.m34035loadData$lambda4(this.f19758c, path, onFailure, onSuccess);
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
        AbstractC9979u.m20294g(listener, "listener");
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
    public void seekTo(final int i10, final InterfaceC9540l onSuccess, final InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        getSeekExecutor().submit(new Runnable() { // from class: com.zykj.merge.sketch.view.i
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m34040seekTo$lambda9(this.f19744c, i10, onSuccess, onFailure);
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double d10) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.sketchPlayView.play();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public PlayStatus status() {
        return this.playStatus;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() throws IllegalStateException {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        this.sketchPlayView.pause();
    }
}
