package com.zykj.evaluation.p057ui.sheet.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.evaluation.databinding.ViewAnswerSheetCommonBinding;
import com.zykj.evaluation.databinding.ViewAnswerSheetCompositionBinding;
import com.zykj.evaluation.databinding.ViewAnswerSheetTrebleBinding;
import com.zykj.evaluation.p057ui.sheet.widget.AnswerSheetViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p026b7.AbstractC5033u0;
import p026b7.C5014l;
import p099g5.AbstractC7531f;
import p099g5.InterfaceC7529d;
import p110h5.C7629a;
import p267v6.AbstractC9706w;

/* loaded from: classes4.dex */
public abstract class AnswerSheetViewKt {

    /* renamed from: com.zykj.evaluation.ui.sheet.widget.AnswerSheetViewKt$a */
    public static final class C6938a implements AbstractC7531f.d {

        /* renamed from: a */
        public final /* synthetic */ Function1 f10158a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f10159b;

        public C6938a(Function1 function1, Function1 function12) {
            this.f10158a = function1;
            this.f10159b = function12;
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: a */
        public void mo10395a(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10158a.invoke(AbstractC5033u0.m2515b(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: b */
        public void mo10396b(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10159b.invoke(AbstractC5033u0.m2514a(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: c */
        public void mo10397c() {
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.widget.AnswerSheetViewKt$b */
    public static final class C6939b implements AbstractC7531f.d {

        /* renamed from: a */
        public final /* synthetic */ Function1 f10160a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f10161b;

        public C6939b(Function1 function1, Function1 function12) {
            this.f10160a = function1;
            this.f10161b = function12;
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: a */
        public void mo10395a(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10160a.invoke(AbstractC5033u0.m2515b(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: b */
        public void mo10396b(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10161b.invoke(AbstractC5033u0.m2514a(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: c */
        public void mo10397c() {
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.widget.AnswerSheetViewKt$c */
    public static final class C6940c implements AbstractC7531f.d {

        /* renamed from: a */
        public final /* synthetic */ Function1 f10162a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f10163b;

        public C6940c(Function1 function1, Function1 function12) {
            this.f10162a = function1;
            this.f10163b = function12;
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: a */
        public void mo10395a(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10162a.invoke(AbstractC5033u0.m2515b(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: b */
        public void mo10396b(C7629a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f10163b.invoke(AbstractC5033u0.m2514a(result));
        }

        @Override // p099g5.AbstractC7531f.d
        /* renamed from: c */
        public void mo10397c() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10340C(androidx.compose.p013ui.Modifier r28, final p267v6.AbstractC9706w r29, int r30, final kotlin.jvm.functions.Function1 r31, final kotlin.jvm.functions.Function1 r32, final kotlin.jvm.functions.Function1 r33, androidx.lifecycle.LifecycleOwner r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.widget.AnswerSheetViewKt.m10340C(androidx.compose.ui.Modifier, v6.w, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.lifecycle.LifecycleOwner, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt.smali:29
    }

    /* renamed from: D */
    public static final ViewAnswerSheetCommonBinding m10341D(C5014l c5014l, Function1 function1, Function1 function12, final Ref.BooleanRef booleanRef, LayoutInflater inflater, ViewGroup parent, boolean z9) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        final ViewAnswerSheetCommonBinding viewAnswerSheetCommonBindingM8667c = ViewAnswerSheetCommonBinding.m8667c(inflater, parent, z9);
        c5014l.m2493r(new Function1() { // from class: b7.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10345H(viewAnswerSheetCommonBindingM8667c, (AbstractC7531f.d) obj);
            }
        });
        c5014l.m2495t(new Function1() { // from class: b7.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10346I(viewAnswerSheetCommonBindingM8667c, (InterfaceC7529d) obj);
            }
        });
        c5014l.m2497v(new Function1() { // from class: b7.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10347J(viewAnswerSheetCommonBindingM8667c, ((Boolean) obj).booleanValue());
            }
        });
        c5014l.m2498w(new Function2() { // from class: b7.b0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnswerSheetViewKt.m10348K(viewAnswerSheetCommonBindingM8667c, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        c5014l.m2496u(new Function0() { // from class: b7.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10342E(viewAnswerSheetCommonBindingM8667c);
            }
        });
        c5014l.m2499x(new Function0() { // from class: b7.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10343F(viewAnswerSheetCommonBindingM8667c);
            }
        });
        viewAnswerSheetCommonBindingM8667c.f8765b.setDelegate(new C6938a(function1, function12));
        viewAnswerSheetCommonBindingM8667c.f8765b.setOnLightStatusListener(new InterfaceC7529d() { // from class: b7.e0
            @Override // p099g5.InterfaceC7529d
            /* renamed from: a */
            public final void mo2475a(boolean z10) {
                AnswerSheetViewKt.m10344G(booleanRef, z10);
            }
        });
        return viewAnswerSheetCommonBindingM8667c;
    }

    /* renamed from: E */
    public static final Unit m10342E(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding) {
        viewAnswerSheetCommonBinding.f8765b.m12328i();
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m10343F(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding) {
        viewAnswerSheetCommonBinding.f8765b.m12334o();
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final void m10344G(Ref.BooleanRef booleanRef, boolean z9) {
        booleanRef.element = z9;
    }

    /* renamed from: H */
    public static final Unit m10345H(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding, AbstractC7531f.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        viewAnswerSheetCommonBinding.f8765b.setDelegate(it);
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m10346I(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding, InterfaceC7529d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        viewAnswerSheetCommonBinding.f8765b.setOnLightStatusListener(it);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m10347J(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding, boolean z9) {
        viewAnswerSheetCommonBinding.f8765b.m12331l(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m10348K(ViewAnswerSheetCommonBinding viewAnswerSheetCommonBinding, boolean z9, String tip) {
        Intrinsics.checkNotNullParameter(tip, "tip");
        viewAnswerSheetCommonBinding.f8765b.m12332m(tip, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final ViewAnswerSheetTrebleBinding m10349L(C5014l c5014l, Function1 function1, Function1 function12, final Ref.BooleanRef booleanRef, LayoutInflater inflater, ViewGroup parent, boolean z9) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        final ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBindingM8673c = ViewAnswerSheetTrebleBinding.m8673c(inflater, parent, z9);
        c5014l.m2493r(new Function1() { // from class: b7.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10350M(viewAnswerSheetTrebleBindingM8673c, (AbstractC7531f.d) obj);
            }
        });
        c5014l.m2495t(new Function1() { // from class: b7.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10351N(viewAnswerSheetTrebleBindingM8673c, (InterfaceC7529d) obj);
            }
        });
        c5014l.m2497v(new Function1() { // from class: b7.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10352O(viewAnswerSheetTrebleBindingM8673c, ((Boolean) obj).booleanValue());
            }
        });
        c5014l.m2498w(new Function2() { // from class: b7.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnswerSheetViewKt.m10353P(viewAnswerSheetTrebleBindingM8673c, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        c5014l.m2496u(new Function0() { // from class: b7.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10354Q(viewAnswerSheetTrebleBindingM8673c);
            }
        });
        c5014l.m2499x(new Function0() { // from class: b7.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10355R(viewAnswerSheetTrebleBindingM8673c);
            }
        });
        viewAnswerSheetTrebleBindingM8673c.f8769b.setDelegate(new C6939b(function1, function12));
        viewAnswerSheetTrebleBindingM8673c.f8769b.setOnLightStatusListener(new InterfaceC7529d() { // from class: b7.v
            @Override // p099g5.InterfaceC7529d
            /* renamed from: a */
            public final void mo2475a(boolean z10) {
                AnswerSheetViewKt.m10356S(booleanRef, z10);
            }
        });
        return viewAnswerSheetTrebleBindingM8673c;
    }

    /* renamed from: M */
    public static final Unit m10350M(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding, AbstractC7531f.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        viewAnswerSheetTrebleBinding.f8769b.setDelegate(it);
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m10351N(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding, InterfaceC7529d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        viewAnswerSheetTrebleBinding.f8769b.setOnLightStatusListener(it);
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m10352O(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding, boolean z9) {
        viewAnswerSheetTrebleBinding.f8769b.m12331l(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m10353P(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding, boolean z9, String tip) {
        Intrinsics.checkNotNullParameter(tip, "tip");
        viewAnswerSheetTrebleBinding.f8769b.m12332m(tip, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m10354Q(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding) {
        viewAnswerSheetTrebleBinding.f8769b.m12328i();
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final Unit m10355R(ViewAnswerSheetTrebleBinding viewAnswerSheetTrebleBinding) {
        viewAnswerSheetTrebleBinding.f8769b.m12334o();
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final void m10356S(Ref.BooleanRef booleanRef, boolean z9) {
        booleanRef.element = z9;
    }

    /* renamed from: T */
    public static final ViewAnswerSheetCompositionBinding m10357T(C5014l c5014l, Function1 function1, Function1 function12, final Ref.BooleanRef booleanRef, LayoutInflater inflater, ViewGroup parent, boolean z9) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        final ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBindingM8670c = ViewAnswerSheetCompositionBinding.m8670c(inflater, parent, z9);
        c5014l.m2497v(new Function1() { // from class: b7.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10358U(viewAnswerSheetCompositionBindingM8670c, ((Boolean) obj).booleanValue());
            }
        });
        c5014l.m2498w(new Function2() { // from class: b7.l0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnswerSheetViewKt.m10359V(viewAnswerSheetCompositionBindingM8670c, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        c5014l.m2496u(new Function0() { // from class: b7.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10360W(viewAnswerSheetCompositionBindingM8670c);
            }
        });
        c5014l.m2499x(new Function0() { // from class: b7.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerSheetViewKt.m10361X(viewAnswerSheetCompositionBindingM8670c);
            }
        });
        c5014l.m2494s(new Function1() { // from class: b7.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerSheetViewKt.m10362Y(viewAnswerSheetCompositionBindingM8670c, ((Integer) obj).intValue());
            }
        });
        viewAnswerSheetCompositionBindingM8670c.f8767b.setDelegate(new C6940c(function1, function12));
        viewAnswerSheetCompositionBindingM8670c.f8767b.setOnLightStatusListener(new InterfaceC7529d() { // from class: b7.o
            @Override // p099g5.InterfaceC7529d
            /* renamed from: a */
            public final void mo2475a(boolean z10) {
                AnswerSheetViewKt.m10363Z(booleanRef, z10);
            }
        });
        return viewAnswerSheetCompositionBindingM8670c;
    }

    /* renamed from: U */
    public static final Unit m10358U(ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBinding, boolean z9) {
        viewAnswerSheetCompositionBinding.f8767b.m12331l(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m10359V(ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBinding, boolean z9, String tip) {
        Intrinsics.checkNotNullParameter(tip, "tip");
        viewAnswerSheetCompositionBinding.f8767b.m12332m(tip, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m10360W(ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBinding) {
        viewAnswerSheetCompositionBinding.f8767b.m12328i();
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m10361X(ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBinding) {
        viewAnswerSheetCompositionBinding.f8767b.m12334o();
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m10362Y(ViewAnswerSheetCompositionBinding viewAnswerSheetCompositionBinding, int i10) {
        viewAnswerSheetCompositionBinding.f8767b.setIndex(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final void m10363Z(Ref.BooleanRef booleanRef, boolean z9) {
        booleanRef.element = z9;
    }

    /* renamed from: a0 */
    public static final Unit m10365a0(C5014l c5014l, int i10, ViewAnswerSheetCompositionBinding AndroidViewBinding) {
        Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
        c5014l.m2490o().invoke(Integer.valueOf(i10));
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m10367b0(Modifier modifier, AbstractC9706w abstractC9706w, int i10, Function1 function1, Function1 function12, Function1 function13, LifecycleOwner lifecycleOwner, int i11, int i12, Composer composer, int i13) {
        m10340C(modifier, abstractC9706w, i10, function1, function12, function13, lifecycleOwner, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final DisposableEffectResult m10369c0(final LifecycleOwner lifecycleOwner, final Context context, final C5014l c5014l, final Ref.BooleanRef booleanRef, final Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: b7.w
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                AnswerSheetViewKt.m10371d0(context, c5014l, booleanRef, function1, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.sheet.widget.AnswerSheetViewKt$AnswerSheetView$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* renamed from: d0 */
    public static final void m10371d0(Context context, final C5014l c5014l, final Ref.BooleanRef booleanRef, Function1 function1, LifecycleOwner lifecycleOwner, final Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (context.checkSelfPermission("android.permission.CAMERA") != 0) {
            function1.invoke(new Function0() { // from class: b7.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnswerSheetViewKt.m10373e0(event, c5014l, booleanRef);
                }
            });
        } else if (event == Lifecycle.Event.ON_RESUME) {
            c5014l.m2491p().invoke(Boolean.valueOf(booleanRef.element));
        } else if (event == Lifecycle.Event.ON_STOP) {
            c5014l.m2492q().invoke();
        }
    }

    /* renamed from: e0 */
    public static final Unit m10373e0(Lifecycle.Event event, C5014l c5014l, Ref.BooleanRef booleanRef) {
        if (event == Lifecycle.Event.ON_RESUME) {
            c5014l.m2491p().invoke(Boolean.valueOf(booleanRef.element));
        } else if (event == Lifecycle.Event.ON_STOP) {
            c5014l.m2492q().invoke();
        }
        return Unit.INSTANCE;
    }
}
