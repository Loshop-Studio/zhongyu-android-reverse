package com.zykj.merge.sketch.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.zykj.blackboard.exception.EmptyDataException;
import com.zykj.merge.sketch.constant.PlayStatus;
import com.zykj.merge.sketch.view.OldSketchProxyView;
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
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p109g4.InterfaceC8527a;
import p123h7.InterfaceC8724d;
import p296x3.InterfaceC10494b;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class OldSketchProxyView extends RelativeLayout implements InterfaceC10494b {

    /* renamed from: a */
    public final SketchViewer f10385a;

    /* renamed from: b */
    public PlayStatus f10386b;

    /* renamed from: c */
    public final List f10387c;

    /* renamed from: d */
    public String f10388d;

    /* renamed from: e */
    public final InterfaceC8724d f10389e;

    /* renamed from: f */
    public final InterfaceC8724d f10390f;

    /* renamed from: g */
    public Map f10391g;

    /* renamed from: com.zykj.merge.sketch.view.OldSketchProxyView$a */
    public static final class C7388a implements InterfaceC8527a {
        public C7388a() {
        }

        @Override // p109g4.InterfaceC8527a
        /* renamed from: a */
        public void mo9562a(long j10) {
            Iterator it = OldSketchProxyView.this.f10387c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onProgress(j10);
            }
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayEnd() {
            OldSketchProxyView.this.f10386b = PlayStatus.RECORD_END;
            Iterator it = OldSketchProxyView.this.f10387c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayEnd();
            }
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayPause() {
            OldSketchProxyView.this.f10386b = PlayStatus.RECORD_PAUSE;
            Iterator it = OldSketchProxyView.this.f10387c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayPause();
            }
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayStart() {
            OldSketchProxyView.this.f10386b = PlayStatus.RECORD_START;
            Iterator it = OldSketchProxyView.this.f10387c.iterator();
            while (it.hasNext()) {
                ((InterfaceC10495c) it.next()).onPlayStart();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSketchProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f10391g = new LinkedHashMap();
        SketchViewer sketchViewer = new SketchViewer(context, attributeSet);
        this.f10385a = sketchViewer;
        this.f10386b = PlayStatus.RECORD_END;
        this.f10387c = new ArrayList();
        addView(sketchViewer);
        sketchViewer.setPlayStatusListener(new C7388a());
        this.f10389e = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$loadDataExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.f10390f = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.merge.sketch.view.OldSketchProxyView$seekExecutor$2
            @Override // p300x7.InterfaceC10559a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
    }

    /* renamed from: A */
    public static final void m9538A(InterfaceC10570l onFailure, Exception e10) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        onFailure.invoke(e10);
    }

    private final ExecutorService getLoadDataExecutor() {
        return (ExecutorService) this.f10389e.getValue();
    }

    private final ExecutorService getSeekExecutor() {
        return (ExecutorService) this.f10390f.getValue();
    }

    /* renamed from: p */
    public static final void m9551p(final OldSketchProxyView this$0, String path, final InterfaceC10570l onFailure, final InterfaceC10570l onSuccess) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        this$0.f10388d = path;
        Actions.EzyActionList ezyActionListM9662n = Actions.EzyActionList.m9662n(ProtoFileUtils.Companion.readProtoFile(path));
        if (ezyActionListM9662n.m9664g().isEmpty()) {
            this$0.m9561v(new Runnable() { // from class: y3.g
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m9552q(this.f21058a, onFailure);
                }
            });
        } else {
            this$0.f10385a.m9704C(ezyActionListM9662n.m9664g(), path);
            this$0.m9561v(new Runnable() { // from class: y3.h
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m9554s(this.f21060a, onSuccess);
                }
            });
        }
    }

    /* renamed from: q */
    public static final void m9552q(OldSketchProxyView this$0, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        this$0.m9556u(new Runnable() { // from class: y3.l
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m9553r(onFailure);
            }
        });
    }

    /* renamed from: r */
    public static final void m9553r(InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        onFailure.invoke(new EmptyDataException("找不到文件"));
    }

    /* renamed from: s */
    public static final void m9554s(final OldSketchProxyView this$0, final InterfaceC10570l onSuccess) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        this$0.m9556u(new Runnable() { // from class: y3.i
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m9555t(onSuccess, this$0);
            }
        });
    }

    /* renamed from: t */
    public static final void m9555t(InterfaceC10570l onSuccess, OldSketchProxyView this$0) {
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        AbstractC9133u.m16133g(this$0, "this$0");
        onSuccess.invoke(Integer.valueOf((int) this$0.f10385a.getTotalTime()));
    }

    /* renamed from: u */
    private final void m9556u(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* renamed from: w */
    public static final void m9557w(final OldSketchProxyView this$0, final int i10, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        try {
            this$0.f10385a.m9703B(i10);
            this$0.m9561v(new Runnable() { // from class: y3.e
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m9558x(this.f21052a, onSuccess, i10);
                }
            });
        } catch (Exception e10) {
            this$0.m9561v(new Runnable() { // from class: y3.f
                @Override // java.lang.Runnable
                public final void run() {
                    OldSketchProxyView.m9560z(this.f21055a, onFailure, e10);
                }
            });
        }
    }

    /* renamed from: x */
    public static final void m9558x(OldSketchProxyView this$0, final InterfaceC10570l onSuccess, final int i10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        this$0.m9556u(new Runnable() { // from class: y3.j
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m9559y(onSuccess, i10);
            }
        });
    }

    /* renamed from: y */
    public static final void m9559y(InterfaceC10570l onSuccess, int i10) {
        AbstractC9133u.m16133g(onSuccess, "$onSuccess");
        onSuccess.invoke(Integer.valueOf(i10));
    }

    /* renamed from: z */
    public static final void m9560z(OldSketchProxyView this$0, final InterfaceC10570l onFailure, final Exception e10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        AbstractC9133u.m16133g(e10, "$e");
        this$0.m9556u(new Runnable() { // from class: y3.k
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m9538A(onFailure, e10);
            }
        });
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: a */
    public void mo9508a(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f10387c.add(listener);
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: b */
    public void mo9509b(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f10387c.remove(listener);
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: c */
    public boolean mo9510c(double d10) {
        return false;
    }

    @Override // p296x3.InterfaceC10494b
    public void destroy() {
        this.f10386b = PlayStatus.RECORD_END;
        this.f10385a.destroyDrawingCache();
    }

    @Override // p296x3.InterfaceC10494b
    public String getPath() {
        return this.f10388d;
    }

    @Override // p296x3.InterfaceC10494b
    public void loadData(final String path, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        getLoadDataExecutor().submit(new Runnable() { // from class: y3.d
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
                OldSketchProxyView.m9551p(this.f21048a, path, onFailure, onSuccess);
            }
        });
    }

    @Override // p296x3.InterfaceC10494b
    public void pause() throws IllegalStateException {
        this.f10386b = PlayStatus.RECORD_PAUSE;
        this.f10385a.m9708s();
    }

    @Override // p296x3.InterfaceC10494b
    public void release() throws IllegalStateException {
        this.f10386b = PlayStatus.RECORD_END;
        this.f10385a.m9711v();
    }

    @Override // p296x3.InterfaceC10494b
    public void resume() throws IllegalStateException {
        this.f10386b = PlayStatus.RECORD_RESUME;
        this.f10385a.m9702A();
    }

    @Override // p296x3.InterfaceC10494b
    public void seekTo(final int i10, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        getSeekExecutor().submit(new Runnable() { // from class: y3.c
            @Override // java.lang.Runnable
            public final void run() {
                OldSketchProxyView.m9557w(this.f21044a, i10, onSuccess, onFailure);
            }
        });
    }

    @Override // p296x3.InterfaceC10494b
    public void start() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f10385a.m9709t();
    }

    @Override // p296x3.InterfaceC10494b
    public PlayStatus status() {
        return this.f10386b;
    }

    /* renamed from: v */
    public final void m9561v(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    @Override // p296x3.InterfaceC10494b
    public void waiting() throws IllegalStateException {
        this.f10386b = PlayStatus.RECORD_PAUSE;
        this.f10385a.m9708s();
    }
}
