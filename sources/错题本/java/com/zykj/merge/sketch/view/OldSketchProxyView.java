package com.zykj.merge.sketch.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.RunnableC0086f;
import android.view.View;
import android.view.ViewKt;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.exception.EmptyDataException;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.paint.Actions;
import com.zykj.paint.render.SketchViewer;
import com.zykj.sketch.utils.ProtoFileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0013d;
import p006a5.RunnableC0017h;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ]\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\r0\u000b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001bJ\u000f\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u001bJ\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00150=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010@R#\u0010G\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR#\u0010J\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010F¨\u0006K"}, m5110d2 = {"Lcom/zykj/merge/sketch/view/OldSketchProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "path", "Lkotlin/Function1;", "", "Ld6/s;", "onSuccess", "", "onFailure", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "getPath", "()Ljava/lang/String;", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "removePlayActionListener", "pause", "()V", "waiting", RequestParameters.POSITION, "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "throwable", "seekTo", "(ILr6/c;Lr6/c;)V", "start", "resume", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "reset", "release", "destroy", "", "isRend", "(Z)V", "", "rate", "setRate", "(D)Z", "Ljava/lang/Runnable;", "runnable", "runAtLeastCreated", "(Ljava/lang/Runnable;)V", "runOnMainThread", "Lcom/zykj/paint/render/SketchViewer;", "sketchPlayView", "Lcom/zykj/paint/render/SketchViewer;", "playStatus", "Lcom/zykj/merge/sketch/constant/PlayStatus;", "", "playActionListener", "Ljava/util/List;", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "loadDataExecutor$delegate", "Ld6/e;", "getLoadDataExecutor", "()Ljava/util/concurrent/ExecutorService;", "loadDataExecutor", "seekExecutor$delegate", "getSeekExecutor", "seekExecutor", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class OldSketchProxyView extends RelativeLayout implements Play {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    /* renamed from: loadDataExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e loadDataExecutor;

    @Nullable
    private String path;

    @NotNull
    private final List<PlayStatusListener> playActionListener;

    @NotNull
    private PlayStatus playStatus;

    /* renamed from: seekExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e seekExecutor;

    @NotNull
    private final SketchViewer sketchPlayView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSketchProxyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
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
            public void onUpdate(long p0) {
                Iterator it = OldSketchProxyView.this.playActionListener.iterator();
                while (it.hasNext()) {
                    ((PlayStatusListener) it.next()).onProgress(p0);
                }
            }
        });
        this.loadDataExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$loadDataExecutor$2
            @Override // p152r6.InterfaceC6469a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.seekExecutor = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$seekExecutor$2
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
    /* renamed from: loadData$lambda-4, reason: not valid java name */
    public static final void m13832loadData$lambda4(OldSketchProxyView this$0, String path, InterfaceC6471c onFailure, InterfaceC6471c onSuccess) throws InvalidProtocolBufferException {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        this$0.path = path;
        Actions.EzyActionList from = Actions.EzyActionList.parseFrom(ProtoFileUtils.INSTANCE.readProtoFile(path));
        if (from.getActionList().isEmpty()) {
            this$0.runOnMainThread(new RunnableC4416e(this$0, onFailure, 1));
        } else {
            this$0.sketchPlayView.setDataSource(from.getActionList(), path);
            this$0.runOnMainThread(new RunnableC4416e(this$0, onSuccess, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1, reason: not valid java name */
    public static final void m13833loadData$lambda4$lambda1(OldSketchProxyView this$0, InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        this$0.runAtLeastCreated(new RunnableC4413b(onFailure, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final void m13834loadData$lambda4$lambda1$lambda0(InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        onFailure.invoke(new EmptyDataException("找不到文件"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3, reason: not valid java name */
    public static final void m13835loadData$lambda4$lambda3(OldSketchProxyView this$0, InterfaceC6471c onSuccess) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new RunnableC4416e(this$0, onSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m13836loadData$lambda4$lambda3$lambda2(InterfaceC6471c onSuccess, OldSketchProxyView this$0) {
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        AbstractC5830k.m5330g(this$0, "this$0");
        onSuccess.invoke(Integer.valueOf((int) this$0.sketchPlayView.getTotalTime()));
    }

    private final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    private final void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9, reason: not valid java name */
    public static final void m13837seekTo$lambda9(OldSketchProxyView this$0, int i, InterfaceC6471c onSuccess, InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        try {
            this$0.sketchPlayView.seekToCurrentIndex(i);
            this$0.runOnMainThread(new RunnableC0086f(this$0, onSuccess, i));
        } catch (Exception e) {
            this$0.runOnMainThread(new RunnableC0017h(this$0, onFailure, 8, e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6, reason: not valid java name */
    public static final void m13838seekTo$lambda9$lambda6(OldSketchProxyView this$0, InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        this$0.runAtLeastCreated(new RunnableC4415d(i, 1, onSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-6$lambda-5, reason: not valid java name */
    public static final void m13839seekTo$lambda9$lambda6$lambda5(InterfaceC6471c onSuccess, int i) {
        AbstractC5830k.m5330g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8, reason: not valid java name */
    public static final void m13840seekTo$lambda9$lambda8(OldSketchProxyView this$0, InterfaceC6471c onFailure, Exception e) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        this$0.runAtLeastCreated(new RunnableC4412a(onFailure, e, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final void m13841seekTo$lambda9$lambda8$lambda7(InterfaceC6471c onFailure, Exception e) {
        AbstractC5830k.m5330g(onFailure, "$onFailure");
        AbstractC5830k.m5330g(e, "$e");
        onFailure.invoke(e);
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

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.destroyDrawingCache();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @Nullable
    public String getPath() {
        return this.path;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
        this.sketchPlayView.isRend(isRend);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(@NotNull String path, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        getLoadDataExecutor().submit(new RunnableC0013d(this, path, onFailure, onSuccess, 7));
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        this.sketchPlayView.pause();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.release();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.playActionListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
        this.playStatus = PlayStatus.RECORD_END;
        this.sketchPlayView.reset();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() {
        this.playStatus = PlayStatus.RECORD_RESUME;
        this.sketchPlayView.resume();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int position, @NotNull InterfaceC6471c onSuccess, @NotNull InterfaceC6471c onFailure) {
        AbstractC5830k.m5330g(onSuccess, "onSuccess");
        AbstractC5830k.m5330g(onFailure, "onFailure");
        getSeekExecutor().submit(new RunnableC4417f(this, position, onSuccess, onFailure, 0));
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        return false;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() {
        this.sketchPlayView.play();
    }

    @Override // com.zykj.merge.sketch.listener.Play
    @NotNull
    /* renamed from: status, reason: from getter */
    public PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        this.sketchPlayView.pause();
    }
}
