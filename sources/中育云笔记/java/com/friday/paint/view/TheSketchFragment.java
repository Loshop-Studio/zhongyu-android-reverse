package com.friday.paint.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.CacheMemoryUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.AnswerCache;
import com.friday.common.helper.C5962b;
import com.friday.paint.R$layout;
import com.friday.paint.databinding.FragmentTheSketchBinding;
import com.friday.paint.view.TheSketchFragment;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.friday.paint.viewmodel.NoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.core.record.SketchRecorderView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TheSketchFragment extends Hilt_TheSketchFragment<FragmentTheSketchBinding> {

    /* renamed from: n */
    public static final C6264a f10018n = new C6264a(null);

    /* renamed from: o */
    public static final int f10019o = 8;

    /* renamed from: i */
    public String f10020i;

    /* renamed from: j */
    public final InterfaceC10773d f10021j;

    /* renamed from: k */
    public final InterfaceC10773d f10022k;

    /* renamed from: l */
    public boolean f10023l;

    /* renamed from: m */
    public final ActivityResultLauncher f10024m;

    /* renamed from: com.friday.paint.view.TheSketchFragment$a */
    public static final class C6264a {
        public /* synthetic */ C6264a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final TheSketchFragment m7525a(String path) {
            AbstractC9979u.m20294g(path, "path");
            TheSketchFragment theSketchFragment = new TheSketchFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            theSketchFragment.setArguments(bundle);
            return theSketchFragment;
        }

        public C6264a() {
        }
    }

    /* renamed from: com.friday.paint.view.TheSketchFragment$b */
    public static final class C6265b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f10033c;

        public C6265b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f10033c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f10033c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10033c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$checkImageSafety$1", m26211f = "TheSketchFragment.kt", m26212l = {301, 305, 310}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.TheSketchFragment$checkImageSafety$1 */
    public static final class C62661 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10034c;

        /* renamed from: d */
        public Object f10035d;

        /* renamed from: e */
        public int f10036e;

        /* renamed from: f */
        public int f10037f;

        /* renamed from: g */
        public int f10038g;

        /* renamed from: i */
        public final /* synthetic */ String f10040i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62661(String str, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10040i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TheSketchFragment.this.new C62661(this.f10040i, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        
            if (r10.m7724O(r6, r9) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r9.f10038g
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L40
                if (r1 == r4) goto L32
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto La2
            L17:
                r10 = move-exception
                goto La8
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                int r1 = r9.f10037f
                int r3 = r9.f10036e
                java.lang.Object r4 = r9.f10035d
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r9.f10034c
                com.friday.paint.view.TheSketchFragment r6 = (com.friday.paint.view.TheSketchFragment) r6
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto L88
            L32:
                int r1 = r9.f10036e
                java.lang.Object r4 = r9.f10035d
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r9.f10034c
                com.friday.paint.view.TheSketchFragment r6 = (com.friday.paint.view.TheSketchFragment) r6
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L17
                goto L66
            L40:
                kotlin.AbstractC9924b.m20071b(r10)
                com.friday.paint.view.TheSketchFragment r10 = com.friday.paint.view.TheSketchFragment.this
                java.lang.String r1 = r9.f10040i
                kotlin.Result$a r6 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L17
                sd.e0 r6 = sd.C11157r0.m24799b()     // Catch: java.lang.Throwable -> L17
                com.friday.paint.view.TheSketchFragment$checkImageSafety$1$1$riskScore$1 r7 = new com.friday.paint.view.TheSketchFragment$checkImageSafety$1$1$riskScore$1     // Catch: java.lang.Throwable -> L17
                r7.<init>(r1, r5)     // Catch: java.lang.Throwable -> L17
                r9.f10034c = r10     // Catch: java.lang.Throwable -> L17
                r9.f10035d = r1     // Catch: java.lang.Throwable -> L17
                r8 = 0
                r9.f10036e = r8     // Catch: java.lang.Throwable -> L17
                r9.f10038g = r4     // Catch: java.lang.Throwable -> L17
                java.lang.Object r4 = sd.AbstractC11109f.m24709g(r6, r7, r9)     // Catch: java.lang.Throwable -> L17
                if (r4 != r0) goto L62
                goto La1
            L62:
                r6 = r10
                r10 = r4
                r4 = r1
                r1 = r8
            L66:
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L17
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L17
                sd.t1 r7 = sd.C11157r0.m24800c()     // Catch: java.lang.Throwable -> L17
                com.friday.paint.view.TheSketchFragment$checkImageSafety$1$1$1 r8 = new com.friday.paint.view.TheSketchFragment$checkImageSafety$1$1$1     // Catch: java.lang.Throwable -> L17
                r8.<init>(r10, r5)     // Catch: java.lang.Throwable -> L17
                r9.f10034c = r6     // Catch: java.lang.Throwable -> L17
                r9.f10035d = r4     // Catch: java.lang.Throwable -> L17
                r9.f10036e = r1     // Catch: java.lang.Throwable -> L17
                r9.f10037f = r10     // Catch: java.lang.Throwable -> L17
                r9.f10038g = r3     // Catch: java.lang.Throwable -> L17
                java.lang.Object r3 = sd.AbstractC11109f.m24709g(r7, r8, r9)     // Catch: java.lang.Throwable -> L17
                if (r3 != r0) goto L86
                goto La1
            L86:
                r3 = r1
                r1 = r10
            L88:
                com.friday.paint.viewmodel.NoteViewModel r10 = com.friday.paint.view.TheSketchFragment.m7490M(r6)     // Catch: java.lang.Throwable -> L17
                com.friday.common.entity.ImageSafetyEntity r6 = new com.friday.common.entity.ImageSafetyEntity     // Catch: java.lang.Throwable -> L17
                r6.<init>(r4, r1)     // Catch: java.lang.Throwable -> L17
                r9.f10034c = r5     // Catch: java.lang.Throwable -> L17
                r9.f10035d = r5     // Catch: java.lang.Throwable -> L17
                r9.f10036e = r3     // Catch: java.lang.Throwable -> L17
                r9.f10037f = r1     // Catch: java.lang.Throwable -> L17
                r9.f10038g = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r10 = r10.m7724O(r6, r9)     // Catch: java.lang.Throwable -> L17
                if (r10 != r0) goto La2
            La1:
                return r0
            La2:
                qc.q r10 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L17
                kotlin.Result.m20054c(r10)     // Catch: java.lang.Throwable -> L17
                goto Lb1
            La8:
                kotlin.Result$a r0 = kotlin.Result.f23263d
                java.lang.Object r10 = kotlin.AbstractC9924b.m20070a(r10)
                kotlin.Result.m20054c(r10)
            Lb1:
                qc.q r10 = p309qc.C10786q.f26013a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.TheSketchFragment.C62661.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/TheSketchFragment$checkImageSafety$1.smali:138
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62661) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$5", m26211f = "TheSketchFragment.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.TheSketchFragment$initData$5 */
    public static final class C62685 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10049c;

        public C62685(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* renamed from: p */
        public static final C10786q m7529p(ViewControl viewControl) {
            return C10786q.f26013a;
        }

        /* renamed from: t */
        public static final C10786q m7530t(TheSketchFragment theSketchFragment, Graph graph) {
            theSketchFragment.m7524l0();
            theSketchFragment.f10023l = true;
            theSketchFragment.isShowLoading(false);
            return C10786q.f26013a;
        }

        /* renamed from: v */
        public static final C10786q m7531v(TheSketchFragment theSketchFragment) {
            theSketchFragment.f10023l = true;
            theSketchFragment.isShowLoading(false);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TheSketchFragment.this.new C62685(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10049c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TheSketchFragment.this.m7496V().m7732W(true);
                this.f10049c = 1;
                if (DelayKt.m20376b(200L, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            SketchRecorderView sketchRecorderView = TheSketchFragment.m7488K(TheSketchFragment.this).f9807c;
            String str = TheSketchFragment.this.f10020i;
            AbstractC9979u.m20291d(str);
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: com.friday.paint.view.c
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return TheSketchFragment.C62685.m7529p((ViewControl) obj2);
                }
            };
            final TheSketchFragment theSketchFragment = TheSketchFragment.this;
            InterfaceC9540l interfaceC9540l2 = new InterfaceC9540l() { // from class: com.friday.paint.view.d
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return TheSketchFragment.C62685.m7530t(theSketchFragment, (Graph) obj2);
                }
            };
            final TheSketchFragment theSketchFragment2 = TheSketchFragment.this;
            sketchRecorderView.loadData(str, interfaceC9540l, interfaceC9540l2, new InterfaceC9529a() { // from class: com.friday.paint.view.e
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return TheSketchFragment.C62685.m7531v(theSketchFragment2);
                }
            });
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62685) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$6", m26211f = "TheSketchFragment.kt", m26212l = {MenuKt.InTransitionDuration}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.TheSketchFragment$initData$6 */
    public static final class C62696 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10051c;

        public C62696(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        /* renamed from: m */
        public static final C10786q m7533m(TheSketchFragment theSketchFragment, String str) {
            theSketchFragment.m7496V().m7732W(true);
            theSketchFragment.f10023l = true;
            theSketchFragment.isShowLoading(false);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TheSketchFragment.this.new C62696(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10051c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.f10051c = 1;
                if (DelayKt.m20376b(200L, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            SketchRecorderView sketchRecorderView = TheSketchFragment.m7488K(TheSketchFragment.this).f9807c;
            final TheSketchFragment theSketchFragment = TheSketchFragment.this;
            sketchRecorderView.getRecordPath(new InterfaceC9540l() { // from class: com.friday.paint.view.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return TheSketchFragment.C62696.m7533m(theSketchFragment, (String) obj2);
                }
            });
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62696) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$8", m26211f = "TheSketchFragment.kt", m26212l = {140}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.TheSketchFragment$initData$8 */
    public static final class C62708 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10053c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$8$1", m26211f = "TheSketchFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.TheSketchFragment$initData$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10055c;

            /* renamed from: d */
            public /* synthetic */ boolean f10056d;

            /* renamed from: e */
            public final /* synthetic */ TheSketchFragment f10057e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheSketchFragment theSketchFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10057e = theSketchFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: m */
            public static final C10786q m7535m(TheSketchFragment theSketchFragment, String str) {
                try {
                    LifecycleOwner viewLifecycleOwner = theSketchFragment.getViewLifecycleOwner();
                    AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TheSketchFragment$initData$8$1$1$1(str, theSketchFragment, null), 3, null);
                } catch (Exception unused) {
                }
                return C10786q.f26013a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10057e, interfaceC11588c);
                anonymousClass1.f10056d = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f10056d;
                AbstractC11725a.m25952f();
                if (this.f10055c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (z10) {
                    SketchRecorderView sketchRecorderView = TheSketchFragment.m7488K(this.f10057e).f9807c;
                    final TheSketchFragment theSketchFragment = this.f10057e;
                    sketchRecorderView.getRecordPath(new InterfaceC9540l() { // from class: com.friday.paint.view.g
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return TheSketchFragment.C62708.AnonymousClass1.m7535m(theSketchFragment, (String) obj2);
                        }
                    });
                }
                return C10786q.f26013a;
            }

            public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C62708(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TheSketchFragment.this.new C62708(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10053c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM7740u = TheSketchFragment.this.m7496V().m7740u();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TheSketchFragment.this, null);
                this.f10053c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM7740u, anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62708) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TheSketchFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f10021j = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f10022k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(DoHomeworkViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.TheSketchFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: c4.f1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TheSketchFragment.m7495S((ActivityResult) obj);
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f10024m = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public static final /* synthetic */ FragmentTheSketchBinding m7488K(TheSketchFragment theSketchFragment) {
        return (FragmentTheSketchBinding) theSketchFragment.getMBinding();
    }

    /* renamed from: Q */
    public static final C10786q m7493Q(ImageGraph imageGraph) {
        return C10786q.f26013a;
    }

    /* renamed from: R */
    public static final C10786q m7494R(TheSketchFragment theSketchFragment, String str) {
        if (str != null) {
            theSketchFragment.checkImageSafety(str);
        }
        return C10786q.f26013a;
    }

    /* renamed from: S */
    public static final void m7495S(ActivityResult activityResult) {
        Intent data;
        String stringExtra;
        AbstractC9979u.m20294g(activityResult, "activityResult");
        if (activityResult.getResultCode() != 0 || (data = activityResult.getData()) == null || (stringExtra = data.getStringExtra("errorMsg")) == null) {
            return;
        }
        ToastUtils.showShort(stringExtra, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final NoteViewModel m7496V() {
        return (NoteViewModel) this.f10021j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public static final C10786q m7497W(TheSketchFragment theSketchFragment, Mode mode) {
        SketchRecorderView sketchRecorderView = ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c;
        AbstractC9979u.m20291d(mode);
        sketchRecorderView.setMode(mode);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X */
    public static final void m7498X(TheSketchFragment theSketchFragment, Object obj) {
        ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getRecordPath(new InterfaceC9540l() { // from class: c4.h1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return TheSketchFragment.m7499Y((String) obj2);
            }
        });
    }

    /* renamed from: Y */
    public static final C10786q m7499Y(String str) {
        LiveEventBus.get("submitHomework").post(null);
        return C10786q.f26013a;
    }

    /* renamed from: Z */
    public static final void m7500Z(TheSketchFragment theSketchFragment, Bitmap bitmap) {
        AbstractC9979u.m20291d(bitmap);
        theSketchFragment.m7521P(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static final void m7501a0(final TheSketchFragment theSketchFragment, Pair pair) {
        if ((pair.m20051f() instanceof String) && (pair.m20052g() instanceof Bitmap)) {
            SketchRecorderView sketchRecorderView = ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c;
            Object objM20052g = pair.m20052g();
            AbstractC9979u.m20292e(objM20052g, "null cannot be cast to non-null type android.graphics.Bitmap");
            Object objM20051f = pair.m20051f();
            AbstractC9979u.m20292e(objM20051f, "null cannot be cast to non-null type kotlin.String");
            sketchRecorderView.addImage((Bitmap) objM20052g, ((String) objM20051f) + "screenCapture" + System.currentTimeMillis(), 0, 23, new InterfaceC9540l() { // from class: c4.i1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return TheSketchFragment.m7502b0((ImageGraph) obj);
                }
            }, new InterfaceC9540l() { // from class: c4.j1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return TheSketchFragment.m7503c0(this.f3396c, (String) obj);
                }
            });
        }
    }

    /* renamed from: b0 */
    public static final C10786q m7502b0(ImageGraph imageGraph) {
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    public static final C10786q m7503c0(TheSketchFragment theSketchFragment, String str) {
        if (str != null) {
            theSketchFragment.checkImageSafety(str);
        }
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d0 */
    public static final C10786q m7504d0(TheSketchFragment theSketchFragment, GraphConfig graphConfig) {
        SketchRecorderView sketchRecorderView = ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c;
        AbstractC9979u.m20291d(graphConfig);
        sketchRecorderView.setGraphConfig(graphConfig);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e0 */
    public static final C10786q m7505e0(TheSketchFragment theSketchFragment, SketchConfig sketchConfig) {
        ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getConfig().setTouchable(sketchConfig.isTouchable());
        ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getConfig().setMaxImageCount(5);
        SketchConfig config = ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getConfig();
        String str = theSketchFragment.f10020i;
        AbstractC9979u.m20291d(str);
        config.setSourcePath(str);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public static final C10786q m7506f0(final TheSketchFragment theSketchFragment, Boolean bool) {
        if (theSketchFragment.isResumed()) {
            theSketchFragment.isShowLoading(true);
            theSketchFragment.m7522T();
            ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getRecordPath(new InterfaceC9540l() { // from class: c4.g1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return TheSketchFragment.m7507g0(this.f3389c, (String) obj);
                }
            });
        }
        return C10786q.f26013a;
    }

    /* renamed from: g0 */
    public static final C10786q m7507g0(TheSketchFragment theSketchFragment, String str) {
        theSketchFragment.m7496V().m7732W(true);
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h0 */
    public static final void m7508h0(TheSketchFragment theSketchFragment, Object obj) {
        if (AbstractC9979u.m20289b(obj, theSketchFragment.f10020i)) {
            ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i0 */
    public static final void m7509i0(TheSketchFragment theSketchFragment, Object obj) {
        ((FragmentTheSketchBinding) theSketchFragment.getMBinding()).f9807c.getRecordPath(new InterfaceC9540l() { // from class: c4.m1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return TheSketchFragment.m7510j0((String) obj2);
            }
        });
    }

    /* renamed from: j0 */
    public static final C10786q m7510j0(String str) {
        if (str != null) {
            LiveEventBus.get("updateCurrentThumbnailSuccess").post(null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: k0 */
    public static final C10786q m7511k0(TheSketchFragment theSketchFragment, String str) {
        theSketchFragment.m7496V().m7725P(new File(str + "/thumbnail.jpg"));
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final void m7521P(Bitmap bitmap) {
        ((FragmentTheSketchBinding) getMBinding()).f9807c.addImage(bitmap, 0, 23, new InterfaceC9540l() { // from class: c4.k1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7493Q((ImageGraph) obj);
            }
        }, new InterfaceC9540l() { // from class: c4.l1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7494R(this.f3401c, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public final void m7522T() {
        if (m7523U().m7628k() && !m7523U().m7624g() && ((AnswerCache) CacheMemoryUtils.getInstance().get("answer_cache")) == null) {
            DoHomeworkViewModel doHomeworkViewModelM7523U = m7523U();
            CacheMemoryUtils cacheMemoryUtils = CacheMemoryUtils.getInstance();
            int iM7632o = doHomeworkViewModelM7523U.m7632o();
            int iM7633p = doHomeworkViewModelM7523U.m7633p();
            boolean zM7635r = doHomeworkViewModelM7523U.m7635r();
            int iM7631n = doHomeworkViewModelM7523U.m7631n();
            boolean zM7626i = doHomeworkViewModelM7523U.m7626i();
            boolean zM7628k = doHomeworkViewModelM7523U.m7628k();
            Boolean bool = (Boolean) doHomeworkViewModelM7523U.m7627j().getValue();
            ArrayList arrayListM7623f = doHomeworkViewModelM7523U.m7623f();
            boolean z10 = m7523U().m7633p() == 0;
            MqttResponse mqttResponseM7629l = doHomeworkViewModelM7523U.m7629l();
            cacheMemoryUtils.put("answer_cache", new AnswerCache(iM7632o, iM7633p, zM7635r, iM7631n, zM7626i, zM7628k, bool, arrayListM7623f, z10, mqttResponseM7629l != null ? mqttResponseM7629l.getGuid() : null));
        }
    }

    /* renamed from: U */
    public final DoHomeworkViewModel m7523U() {
        return (DoHomeworkViewModel) this.f10022k.getValue();
    }

    public final void checkImageSafety(String str) {
        if (C5962b.f6082a.m5299a().m5294v()) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62661(str, null), 3, null);
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_the_sketch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        Bitmap bitmap;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("path") : null;
        this.f10020i = string;
        if (string == null || string.length() == 0) {
            AbstractC11958b.m26588i("该页笔记已损坏");
            return;
        }
        ((FragmentTheSketchBinding) getMBinding()).f9807c.setImageDeleteListener(new ImageDeleteListener() { // from class: com.friday.paint.view.TheSketchFragment.initData.1
            @Override // com.zykj.sketch.core.listener.ImageDeleteListener
            public void onDeleteImagePath(String fileName) {
                AbstractC9979u.m20294g(fileName, "fileName");
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(TheSketchFragment.this), null, null, new TheSketchFragment$initData$1$onDeleteImagePath$1(TheSketchFragment.this, fileName, null), 3, null);
            }
        });
        m7496V().m7722L().observe(getViewLifecycleOwner(), new C6265b(new InterfaceC9540l() { // from class: c4.e1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7497W(this.f3383c, (Mode) obj);
            }
        }));
        m7496V().m7715E().observe(getViewLifecycleOwner(), new C6265b(new InterfaceC9540l() { // from class: c4.n1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7504d0(this.f3406c, (GraphConfig) obj);
            }
        }));
        m7496V().m7721K().observe(getViewLifecycleOwner(), new C6265b(new InterfaceC9540l() { // from class: c4.o1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7505e0(this.f3409c, (SketchConfig) obj);
            }
        }));
        isShowLoading(true);
        this.f10023l = false;
        List<File> listListFilesInDir = FileUtils.listFilesInDir(this.f10020i);
        AbstractC9979u.m20293f(listListFilesInDir, "listFilesInDir(...)");
        if (listListFilesInDir.isEmpty()) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62696(null), 3, null);
        } else {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62685(null), 3, null);
        }
        m7496V().m7711A().observe(getViewLifecycleOwner(), new C6265b(new InterfaceC9540l() { // from class: c4.p1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TheSketchFragment.m7506f0(this.f3412c, (Boolean) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C62708(null), 3, null);
        LiveEventBus.get("clearBoard").observe(getViewLifecycleOwner(), new Observer() { // from class: c4.q1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TheSketchFragment.m7508h0(this.f3413c, obj);
            }
        });
        LiveEventBus.get("updateCurrentThumbnail").observe(getViewLifecycleOwner(), new Observer() { // from class: c4.r1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TheSketchFragment.m7509i0(this.f3415c, obj);
            }
        });
        LiveEventBus.get("updateThumbnailForHomework").observe(getViewLifecycleOwner(), new Observer() { // from class: c4.s1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TheSketchFragment.m7498X(this.f3418c, obj);
            }
        });
        LiveEventBus.get("addBitmap", Bitmap.class).observe(getViewLifecycleOwner(), new Observer() { // from class: c4.t1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TheSketchFragment.m7500Z(this.f3422c, (Bitmap) obj);
            }
        });
        LiveEventBus.get("ScreenCaptureImage", Pair.class).observe(getViewLifecycleOwner(), new Observer() { // from class: c4.u1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TheSketchFragment.m7501a0(this.f3426c, (Pair) obj);
            }
        });
        if (m7496V().m7716F().isEmpty() || (bitmap = (Bitmap) m7496V().m7716F().get(this.f10020i)) == null) {
            return;
        }
        m7521P(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l0 */
    public final void m7524l0() {
        Mode mode = (Mode) m7496V().m7722L().getValue();
        if (mode != null) {
            ((FragmentTheSketchBinding) getMBinding()).f9807c.setMode(mode);
        }
        GraphConfig graphConfig = (GraphConfig) m7496V().m7715E().getValue();
        if (graphConfig != null) {
            ((FragmentTheSketchBinding) getMBinding()).f9807c.setGraphConfig(graphConfig);
        }
        SketchConfig sketchConfig = (SketchConfig) m7496V().m7721K().getValue();
        if (sketchConfig != null) {
            ((FragmentTheSketchBinding) getMBinding()).f9807c.getConfig().setTouchable(sketchConfig.isTouchable());
            ((FragmentTheSketchBinding) getMBinding()).f9807c.getConfig().setMaxImageCount(5);
            SketchConfig config = ((FragmentTheSketchBinding) getMBinding()).f9807c.getConfig();
            String str = this.f10020i;
            AbstractC9979u.m20291d(str);
            config.setSourcePath(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (this.f10023l) {
            ((FragmentTheSketchBinding) getMBinding()).f9807c.getRecordPath(new InterfaceC9540l() { // from class: c4.v1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return TheSketchFragment.m7511k0(this.f3430c, (String) obj);
                }
            });
        }
        super.onPause();
    }
}
