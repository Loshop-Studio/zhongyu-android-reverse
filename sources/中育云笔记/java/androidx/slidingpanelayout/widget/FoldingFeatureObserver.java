package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11115g1;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FoldingFeatureObserver {
    private final Executor executor;
    private InterfaceC10045g job;
    private OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final WindowInfoTracker windowInfoTracker;

    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(FoldingFeature foldingFeature);
    }

    @InterfaceC11829d(m26210c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m26211f = "FoldingFeatureObserver.kt", m26212l = {97}, m26213m = "invokeSuspend")
    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1 */
    public static final class C46261 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46261(Activity activity, InterfaceC11588c<? super C46261> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return FoldingFeatureObserver.this.new C46261(this.$activity, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11594c interfaceC11594cWindowLayoutInfo = FoldingFeatureObserver.this.windowInfoTracker.windowLayoutInfo(this.$activity);
                final FoldingFeatureObserver foldingFeatureObserver = FoldingFeatureObserver.this;
                InterfaceC11594c interfaceC11594cM25564n = AbstractC11596e.m25564n(new InterfaceC11594c() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements InterfaceC11595d {
                        final /* synthetic */ InterfaceC11595d $this_unsafeFlow$inlined;
                        final /* synthetic */ FoldingFeatureObserver this$0;

                        @InterfaceC11829d(m26210c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", m26211f = "FoldingFeatureObserver.kt", m26212l = {138}, m26213m = "emit")
                        /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                                super(interfaceC11588c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC11595d interfaceC11595d, FoldingFeatureObserver foldingFeatureObserver) {
                            this.$this_unsafeFlow$inlined = interfaceC11595d;
                            this.this$0 = foldingFeatureObserver;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // p379vd.InterfaceC11595d
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.C4625x48a494f1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.C4625x48a494f1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.AbstractC9924b.m20071b(r6)
                                goto L4a
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.AbstractC9924b.m20071b(r6)
                                vd.d r6 = r4.$this_unsafeFlow$inlined
                                androidx.window.layout.WindowLayoutInfo r5 = (androidx.window.layout.WindowLayoutInfo) r5
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver r2 = r4.this$0
                                androidx.window.layout.FoldingFeature r5 = androidx.slidingpanelayout.widget.FoldingFeatureObserver.access$getFoldingFeature(r2, r5)
                                if (r5 != 0) goto L41
                                goto L4a
                            L41:
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L4a
                                return r1
                            L4a:
                                qc.q r5 = p309qc.C10786q.f26013a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.C4625x48a494f1.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                        }
                    }

                    @Override // p379vd.InterfaceC11594c
                    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                        Object objCollect = interfaceC11594cWindowLayoutInfo.collect(new AnonymousClass2(interfaceC11595d, foldingFeatureObserver), interfaceC11588c);
                        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
                    }
                });
                final FoldingFeatureObserver foldingFeatureObserver2 = FoldingFeatureObserver.this;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                    @Override // p379vd.InterfaceC11595d
                    public Object emit(FoldingFeature foldingFeature, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        C10786q c10786q;
                        FoldingFeature foldingFeature2 = foldingFeature;
                        FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = foldingFeatureObserver2.onFoldingFeatureChangeListener;
                        if (onFoldingFeatureChangeListener == null) {
                            c10786q = null;
                        } else {
                            onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                            c10786q = C10786q.f26013a;
                        }
                        return c10786q == AbstractC11725a.m25952f() ? c10786q : C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594cM25564n.collect(interfaceC11595d, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C46261) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public FoldingFeatureObserver(WindowInfoTracker windowInfoTracker, Executor executor) {
        AbstractC9979u.m20294g(windowInfoTracker, "windowInfoTracker");
        AbstractC9979u.m20294g(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoldingFeature getFoldingFeature(WindowLayoutInfo windowLayoutInfo) {
        Object next;
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DisplayFeature) next) instanceof FoldingFeature) {
                break;
            }
        }
        if (next instanceof FoldingFeature) {
            return (FoldingFeature) next;
        }
        return null;
    }

    public final void registerLayoutStateChangeCallback(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.job = AbstractC11117h.m24726d(AbstractC10006d.m20744a(AbstractC11115g1.m24721b(this.executor)), null, null, new C46261(activity, null), 3, null);
    }

    public final void setOnFoldingFeatureChangeListener(OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        AbstractC9979u.m20294g(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g == null) {
            return;
        }
        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
    }
}
