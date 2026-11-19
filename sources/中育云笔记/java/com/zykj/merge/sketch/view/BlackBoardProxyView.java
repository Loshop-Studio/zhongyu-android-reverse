package com.zykj.merge.sketch.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.zykj.blackboard.core.canvas.SketchPlayView;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.merge.sketch.listener.MoveProxy;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.merge.sketch.view.BlackBoardProxyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import ma.InterfaceC10216d;
import ma.InterfaceC10220h;
import p178ha.InterfaceC9515l;
import p178ha.InterfaceC9516m;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes6.dex */
public final class BlackBoardProxyView extends RelativeLayout implements Play, MoveProxy {
    public Map<Integer, View> _$_findViewCache;
    private final List<PlayStatusListener> playActionListener;
    private InterfaceC9516m playPageControl;
    private final SketchPlayView sketchPlayView;

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

    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$1 */
    public static final class C85831 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC9540l $onSuccess;
        final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C85831(InterfaceC9540l interfaceC9540l, int i10) {
            super(0);
            this.$onSuccess = interfaceC9540l;
            this.$position = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m34032invoke$lambda0(InterfaceC9540l onSuccess, int i10) {
            AbstractC9979u.m20294g(onSuccess, "$onSuccess");
            onSuccess.invoke(Integer.valueOf(i10));
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m34033invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m34033invoke() {
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final InterfaceC9540l interfaceC9540l = this.$onSuccess;
            final int i10 = this.$position;
            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C85831.m34032invoke$lambda0(interfaceC9540l, i10);
                }
            });
        }
    }

    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$2 */
    public static final class C85842 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $onFailure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C85842(InterfaceC9540l interfaceC9540l) {
            super(1);
            this.$onFailure = interfaceC9540l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m34034invoke$lambda0(InterfaceC9540l onFailure, Throwable it) {
            AbstractC9979u.m20294g(onFailure, "$onFailure");
            AbstractC9979u.m20294g(it, "$it");
            onFailure.invoke(it);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C10786q.f26013a;
        }

        public final void invoke(final Throwable it) {
            AbstractC9979u.m20294g(it, "it");
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final InterfaceC9540l interfaceC9540l = this.$onFailure;
            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.f
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C85842.m34034invoke$lambda0(interfaceC9540l, it);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackBoardProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
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
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-0, reason: not valid java name */
    public static final void m34026seekTo$lambda0(InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(onFailure, "$onFailure");
        onFailure.invoke(new Exception());
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

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveEnd(Float f10, Float f11) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.areaMoveEnd(f10, f11);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveStart() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.areaMoveStart();
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoving(Float f10, Float f11) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.areaMoving(f10, f11);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.sketchPlayView.destroyDrawingCache();
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public Bitmap getCurrentScreenBitmap() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.mo14541c();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveHorizontalProgress() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.getMoveHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxHeightTimes() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.getMoveMaxHeightTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxWidthTimes() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.getMoveMaxWidthTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveVerticalProgress() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.getMoveVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public String getPath() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            return interfaceC9516m.mo14543f();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean z10) {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(final String path, final InterfaceC9540l onSuccess, final InterfaceC9540l onFailure) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        this.sketchPlayView.m13897b(new InterfaceC9540l() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1

            /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements InterfaceC9540l {
                final /* synthetic */ InterfaceC9540l $onFailure;
                final /* synthetic */ BlackBoardProxyView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC9540l interfaceC9540l) {
                    super(1);
                    this.this$0 = blackBoardProxyView;
                    this.$onFailure = interfaceC9540l;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-0, reason: not valid java name */
                public static final void m34031invoke$lambda0(InterfaceC9540l onFailure, Throwable throwable) {
                    AbstractC9979u.m20294g(onFailure, "$onFailure");
                    AbstractC9979u.m20294g(throwable, "$throwable");
                    onFailure.invoke(throwable);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(final Throwable throwable) {
                    AbstractC9979u.m20294g(throwable, "throwable");
                    BlackBoardProxyView blackBoardProxyView = this.this$0;
                    final InterfaceC9540l interfaceC9540l = this.$onFailure;
                    blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlackBoardProxyView.C85821.AnonymousClass2.m34031invoke$lambda0(interfaceC9540l, throwable);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC9515l) obj);
                return C10786q.f26013a;
            }

            public final void invoke(final InterfaceC9515l it) {
                AbstractC9979u.m20294g(it, "it");
                String str = path;
                final BlackBoardProxyView blackBoardProxyView = this;
                final InterfaceC9540l interfaceC9540l = onSuccess;
                final InterfaceC9540l interfaceC9540l2 = onFailure;
                it.mo14533c(str, new InterfaceC9540l() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1.1

                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C121211 extends Lambda implements InterfaceC9529a {
                        final /* synthetic */ InterfaceC9515l $it;
                        final /* synthetic */ InterfaceC9540l $onSuccess;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C121211(BlackBoardProxyView blackBoardProxyView, InterfaceC9515l interfaceC9515l, InterfaceC9540l interfaceC9540l) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$it = interfaceC9515l;
                            this.$onSuccess = interfaceC9540l;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                        public static final void m34027invoke$lambda1$lambda0(InterfaceC9540l onSuccess, InterfaceC9516m this_apply) {
                            AbstractC9979u.m20294g(onSuccess, "$onSuccess");
                            AbstractC9979u.m20294g(this_apply, "$this_apply");
                            onSuccess.invoke(Integer.valueOf((int) this_apply.getDuration()));
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m34028invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m34028invoke() {
                            this.this$0.playPageControl = this.$it.mo14531a();
                            final InterfaceC9516m interfaceC9516m = this.this$0.playPageControl;
                            if (interfaceC9516m != null) {
                                final BlackBoardProxyView blackBoardProxyView = this.this$0;
                                final InterfaceC9540l interfaceC9540l = this.$onSuccess;
                                interfaceC9516m.mo18734d(new InterfaceC10220h() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1$1$1
                                    @Override // ma.InterfaceC10220h
                                    public void onPlayEnd() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayEnd();
                                        }
                                    }

                                    @Override // ma.InterfaceC10220h
                                    public void onPlayPause() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayPause();
                                        }
                                    }

                                    @Override // ma.InterfaceC10220h
                                    public void onPlayResume() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // ma.InterfaceC10220h
                                    public void onPlayStart() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // ma.InterfaceC10220h
                                    public void onProgress(long j10) {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onProgress(j10);
                                        }
                                    }
                                });
                                blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BlackBoardProxyView.C85821.AnonymousClass1.C121211.m34027invoke$lambda1$lambda0(interfaceC9540l, interfaceC9516m);
                                    }
                                });
                            }
                        }
                    }

                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends Lambda implements InterfaceC9529a {
                        final /* synthetic */ InterfaceC9540l $onFailure;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC9540l interfaceC9540l) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$onFailure = interfaceC9540l;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-0, reason: not valid java name */
                        public static final void m34029invoke$lambda0(InterfaceC9540l onFailure) {
                            AbstractC9979u.m20294g(onFailure, "$onFailure");
                            onFailure.invoke(new Exception());
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m34030invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m34030invoke() {
                            BlackBoardProxyView blackBoardProxyView = this.this$0;
                            final InterfaceC9540l interfaceC9540l = this.$onFailure;
                            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BlackBoardProxyView.C85821.AnonymousClass1.AnonymousClass2.m34029invoke$lambda0(interfaceC9540l);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List<? extends InterfaceC9516m>) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(List<? extends InterfaceC9516m> playPageControlList) {
                        AbstractC9979u.m20294g(playPageControlList, "playPageControlList");
                        it.mo14534d(AbstractC10978w.m24138p(playPageControlList), new C121211(blackBoardProxyView, it, interfaceC9540l), new AnonymousClass2(blackBoardProxyView, interfaceC9540l2));
                    }
                }, new AnonymousClass2(this, onFailure));
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.pause();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.release();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(PlayStatusListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.playActionListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.resume();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int i10, InterfaceC9540l onSuccess, final InterfaceC9540l onFailure) {
        C10786q c10786q;
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        AbstractC9979u.m20294g(onFailure, "onFailure");
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.mo14542e(i10, new C85831(onSuccess, i10), new C85842(onFailure));
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        if (c10786q == null) {
            runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.m34026seekTo$lambda0(onFailure);
                }
            });
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setAreaMoveListener(InterfaceC10216d interfaceC10216d) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.setAreaMoveListener(interfaceC10216d);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double d10) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m == null) {
            return false;
        }
        interfaceC9516m.mo14544g((float) d10);
        return true;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setScaleEnable(boolean z10) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.setScaleEnable(z10);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setTranslateEnable(boolean z10) {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.setTranslateEnable(z10);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public com.zykj.merge.sketch.constant.PlayStatus status() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        PlayStatus playStatusStatus = interfaceC9516m != null ? interfaceC9516m.status() : null;
        int i10 = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME : com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE : com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        InterfaceC9516m interfaceC9516m = this.playPageControl;
        if (interfaceC9516m != null) {
            interfaceC9516m.pause();
        }
    }
}
