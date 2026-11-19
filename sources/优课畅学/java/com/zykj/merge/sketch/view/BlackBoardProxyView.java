package com.zykj.merge.sketch.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.zykj.blackboard.core.canvas.SketchPlayView;
import com.zykj.blackboard.core.play.IPlayControl;
import com.zykj.blackboard.core.play.IPlayPageControl;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.PlayStatusListener;
import com.zykj.merge.sketch.view.BlackBoardProxyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p296x3.InterfaceC10493a;
import p296x3.InterfaceC10494b;
import p296x3.InterfaceC10495c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class BlackBoardProxyView extends RelativeLayout implements InterfaceC10494b, InterfaceC10493a {

    /* renamed from: a */
    public final SketchPlayView f10356a;

    /* renamed from: b */
    public final List f10357b;

    /* renamed from: c */
    public IPlayPageControl f10358c;

    /* renamed from: d */
    public Map f10359d;

    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$a */
    public /* synthetic */ class C7384a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10360a;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 2;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            f10360a = iArr;
        }
    }

    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$1 */
    public static final class C73861 extends Lambda implements InterfaceC10559a {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10570l f10378b;

        /* renamed from: c */
        public final /* synthetic */ int f10379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73861(InterfaceC10570l interfaceC10570l, int i10) {
            super(0);
            this.f10378b = interfaceC10570l;
            this.f10379c = i10;
        }

        /* renamed from: b */
        public static final void m9519b(InterfaceC10570l onSuccess, int i10) {
            AbstractC9133u.m16133g(onSuccess, "$onSuccess");
            onSuccess.invoke(Integer.valueOf(i10));
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27499invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27499invoke() {
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final InterfaceC10570l interfaceC10570l = this.f10378b;
            final int i10 = this.f10379c;
            blackBoardProxyView.m9511i(new Runnable() { // from class: com.zykj.merge.sketch.view.d
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C73861.m9519b(interfaceC10570l, i10);
                }
            });
        }
    }

    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$2 */
    public static final class C73872 extends Lambda implements InterfaceC10570l {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10570l f10381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73872(InterfaceC10570l interfaceC10570l) {
            super(1);
            this.f10381b = interfaceC10570l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m27500invoke$lambda0(InterfaceC10570l onFailure, Throwable it) {
            AbstractC9133u.m16133g(onFailure, "$onFailure");
            AbstractC9133u.m16133g(it, "$it");
            onFailure.invoke(it);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8736p.f16368a;
        }

        public final void invoke(final Throwable it) {
            AbstractC9133u.m16133g(it, "it");
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final InterfaceC10570l interfaceC10570l = this.f10381b;
            blackBoardProxyView.m9511i(new Runnable() { // from class: com.zykj.merge.sketch.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C73872.m27500invoke$lambda0(interfaceC10570l, it);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackBoardProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f10359d = new LinkedHashMap();
        SketchPlayView sketchPlayView = new SketchPlayView(context, attributeSet);
        this.f10356a = sketchPlayView;
        this.f10357b = new ArrayList();
        addView(sketchPlayView);
    }

    /* renamed from: j */
    public static final void m9507j(InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(onFailure, "$onFailure");
        onFailure.invoke(new Exception());
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: a */
    public void mo9508a(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f10357b.add(listener);
    }

    @Override // p296x3.InterfaceC10493a
    public void areaMoveEnd(Float f10, Float f11) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoveEnd(f10, f11);
        }
    }

    @Override // p296x3.InterfaceC10493a
    public void areaMoveStart() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoveStart();
        }
    }

    @Override // p296x3.InterfaceC10493a
    public void areaMoving(Float f10, Float f11) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.areaMoving(f10, f11);
        }
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: b */
    public void mo9509b(InterfaceC10495c listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.f10357b.remove(listener);
    }

    @Override // p296x3.InterfaceC10494b
    /* renamed from: c */
    public boolean mo9510c(double d10) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl == null) {
            return false;
        }
        iPlayPageControl.setRate((float) d10);
        return true;
    }

    @Override // p296x3.InterfaceC10494b
    public void destroy() {
        this.f10356a.destroyDrawingCache();
    }

    @Override // p296x3.InterfaceC10493a
    public Bitmap getCurrentScreenBitmap() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getCurrentScreenShot();
        }
        return null;
    }

    @Override // p296x3.InterfaceC10493a
    public float getMoveHorizontalProgress() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // p296x3.InterfaceC10493a
    public int getMoveMaxHeightTimes() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveMaxHeightTimes();
        }
        return 0;
    }

    @Override // p296x3.InterfaceC10493a
    public int getMoveMaxWidthTimes() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveMaxWidthTimes();
        }
        return 0;
    }

    @Override // p296x3.InterfaceC10493a
    public float getMoveVerticalProgress() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getMoveVerticalProgress();
        }
        return 0.0f;
    }

    @Override // p296x3.InterfaceC10494b
    public String getPath() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            return iPlayPageControl.getPageDirPath();
        }
        return null;
    }

    /* renamed from: i */
    public final void m9511i(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    @Override // p296x3.InterfaceC10494b
    public void loadData(final String path, final InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        this.f10356a.ready(new InterfaceC10570l() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1

            /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements InterfaceC10570l {

                /* renamed from: a */
                public final /* synthetic */ BlackBoardProxyView f10375a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC10570l f10376b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC10570l interfaceC10570l) {
                    super(1);
                    this.f10375a = blackBoardProxyView;
                    this.f10376b = interfaceC10570l;
                }

                /* renamed from: invoke$lambda-0, reason: not valid java name */
                public static final void m27498invoke$lambda0(InterfaceC10570l onFailure, Throwable throwable) {
                    AbstractC9133u.m16133g(onFailure, "$onFailure");
                    AbstractC9133u.m16133g(throwable, "$throwable");
                    onFailure.invoke(throwable);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(final Throwable throwable) {
                    AbstractC9133u.m16133g(throwable, "throwable");
                    BlackBoardProxyView blackBoardProxyView = this.f10375a;
                    final InterfaceC10570l interfaceC10570l = this.f10376b;
                    blackBoardProxyView.m9511i(new Runnable() { // from class: com.zykj.merge.sketch.view.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlackBoardProxyView.C73851.AnonymousClass2.m27498invoke$lambda0(interfaceC10570l, throwable);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: a */
            public final void m9512a(final IPlayControl it) {
                AbstractC9133u.m16133g(it, "it");
                String str = path;
                final BlackBoardProxyView blackBoardProxyView = this;
                final InterfaceC10570l interfaceC10570l = onSuccess;
                final InterfaceC10570l interfaceC10570l2 = onFailure;
                it.loadPath(str, new InterfaceC10570l() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1.1

                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C107971 extends Lambda implements InterfaceC10559a {

                        /* renamed from: a */
                        public final /* synthetic */ BlackBoardProxyView f10369a;

                        /* renamed from: b */
                        public final /* synthetic */ IPlayControl f10370b;

                        /* renamed from: c */
                        public final /* synthetic */ InterfaceC10570l f10371c;

                        /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1$a */
                        public static final class a implements PlayStatusListener {

                            /* renamed from: a */
                            public final /* synthetic */ BlackBoardProxyView f10372a;

                            public a(BlackBoardProxyView blackBoardProxyView) {
                                this.f10372a = blackBoardProxyView;
                            }

                            @Override // com.zykj.blackboard.listener.PlayStatusListener
                            public void onPlayEnd() {
                                Iterator it = this.f10372a.f10357b.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC10495c) it.next()).onPlayEnd();
                                }
                            }

                            @Override // com.zykj.blackboard.listener.PlayStatusListener
                            public void onPlayPause() {
                                Iterator it = this.f10372a.f10357b.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC10495c) it.next()).onPlayPause();
                                }
                            }

                            @Override // com.zykj.blackboard.listener.PlayStatusListener
                            public void onPlayResume() {
                                Iterator it = this.f10372a.f10357b.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC10495c) it.next()).onPlayStart();
                                }
                            }

                            @Override // com.zykj.blackboard.listener.PlayStatusListener
                            public void onPlayStart() {
                                Iterator it = this.f10372a.f10357b.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC10495c) it.next()).onPlayStart();
                                }
                            }

                            @Override // com.zykj.blackboard.listener.PlayStatusListener
                            public void onProgress(long j10) {
                                Iterator it = this.f10372a.f10357b.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC10495c) it.next()).onProgress(j10);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C107971(BlackBoardProxyView blackBoardProxyView, IPlayControl iPlayControl, InterfaceC10570l interfaceC10570l) {
                            super(0);
                            this.f10369a = blackBoardProxyView;
                            this.f10370b = iPlayControl;
                            this.f10371c = interfaceC10570l;
                        }

                        /* renamed from: b */
                        public static final void m9514b(InterfaceC10570l onSuccess, IPlayPageControl this_apply) {
                            AbstractC9133u.m16133g(onSuccess, "$onSuccess");
                            AbstractC9133u.m16133g(this_apply, "$this_apply");
                            onSuccess.invoke(Integer.valueOf((int) this_apply.getDuration()));
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m27496invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m27496invoke() {
                            this.f10369a.f10358c = this.f10370b.getCurrentPlayPageControl();
                            final IPlayPageControl iPlayPageControl = this.f10369a.f10358c;
                            if (iPlayPageControl != null) {
                                BlackBoardProxyView blackBoardProxyView = this.f10369a;
                                final InterfaceC10570l interfaceC10570l = this.f10371c;
                                iPlayPageControl.addPlayActionListener(new a(blackBoardProxyView));
                                blackBoardProxyView.m9511i(new Runnable() { // from class: com.zykj.merge.sketch.view.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BlackBoardProxyView.C73851.AnonymousClass1.C107971.m9514b(interfaceC10570l, iPlayPageControl);
                                    }
                                });
                            }
                        }
                    }

                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends Lambda implements InterfaceC10559a {

                        /* renamed from: a */
                        public final /* synthetic */ BlackBoardProxyView f10373a;

                        /* renamed from: b */
                        public final /* synthetic */ InterfaceC10570l f10374b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, InterfaceC10570l interfaceC10570l) {
                            super(0);
                            this.f10373a = blackBoardProxyView;
                            this.f10374b = interfaceC10570l;
                        }

                        /* renamed from: b */
                        public static final void m9516b(InterfaceC10570l onFailure) {
                            AbstractC9133u.m16133g(onFailure, "$onFailure");
                            onFailure.invoke(new Exception());
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m27497invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m27497invoke() {
                            BlackBoardProxyView blackBoardProxyView = this.f10373a;
                            final InterfaceC10570l interfaceC10570l = this.f10374b;
                            blackBoardProxyView.m9511i(new Runnable() { // from class: com.zykj.merge.sketch.view.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BlackBoardProxyView.C73851.AnonymousClass1.AnonymousClass2.m9516b(interfaceC10570l);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(List playPageControlList) {
                        AbstractC9133u.m16133g(playPageControlList, "playPageControlList");
                        it.switchCurrentPlayPage(AbstractC8809v.m14773p(playPageControlList), new C107971(blackBoardProxyView, it, interfaceC10570l), new AnonymousClass2(blackBoardProxyView, interfaceC10570l2));
                    }
                }, new AnonymousClass2(this, onFailure));
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m9512a((IPlayControl) obj);
                return C8736p.f16368a;
            }
        });
    }

    @Override // p296x3.InterfaceC10494b
    public void pause() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.pause();
        }
    }

    @Override // p296x3.InterfaceC10494b
    public void release() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.release();
        }
    }

    @Override // p296x3.InterfaceC10494b
    public void resume() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.resume();
        }
    }

    @Override // p296x3.InterfaceC10494b
    public void seekTo(int i10, InterfaceC10570l onSuccess, final InterfaceC10570l onFailure) {
        C8736p c8736p;
        AbstractC9133u.m16133g(onSuccess, "onSuccess");
        AbstractC9133u.m16133g(onFailure, "onFailure");
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.seekTo(i10, new C73861(onSuccess, i10), new C73872(onFailure));
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            m9511i(new Runnable() { // from class: y3.a
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.m9507j(onFailure);
                }
            });
        }
    }

    @Override // p296x3.InterfaceC10493a
    public void setAreaMoveListener(IAreaMoveListener iAreaMoveListener) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.setAreaMoveListener(iAreaMoveListener);
        }
    }

    @Override // p296x3.InterfaceC10493a
    public void setScaleEnable(boolean z10) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.setScaleEnable(z10);
        }
    }

    @Override // p296x3.InterfaceC10493a
    public void setTranslateEnable(boolean z10) {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.setTranslateEnable(z10);
        }
    }

    @Override // p296x3.InterfaceC10494b
    public void start() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.start();
        }
    }

    @Override // p296x3.InterfaceC10494b
    public com.zykj.merge.sketch.constant.PlayStatus status() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        PlayStatus playStatusStatus = iPlayPageControl != null ? iPlayPageControl.status() : null;
        int i10 = playStatusStatus == null ? -1 : C7384a.f10360a[playStatusStatus.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME : com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE : com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
    }

    @Override // p296x3.InterfaceC10494b
    public void waiting() {
        IPlayPageControl iPlayPageControl = this.f10358c;
        if (iPlayPageControl != null) {
            iPlayPageControl.pause();
        }
    }
}
