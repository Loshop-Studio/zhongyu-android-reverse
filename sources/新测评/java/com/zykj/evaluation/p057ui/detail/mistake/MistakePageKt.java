package com.zykj.evaluation.p057ui.detail.mistake;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.bean.bundle.MistakeDataBundle;
import com.zykj.evaluation.p057ui.detail.mistake.MistakePageKt;
import com.zykj.evaluation.p057ui.detail.mistake.TagData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8709e;
import p306z5.AbstractC10003i0;
import p306z5.AbstractC10029r;
import p306z5.C10013l1;
import p306z5.C10037t1;
import p306z5.C9993f;

/* loaded from: classes4.dex */
public abstract class MistakePageKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9504C(final com.zykj.evaluation.bean.bundle.MistakeDataBundle r21, final androidx.navigation.NavController r22, com.zykj.evaluation.p057ui.detail.mistake.MistakeViewModel r23, final kotlin.jvm.functions.Function1 r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.mistake.MistakePageKt.m9504C(com.zykj.evaluation.bean.bundle.MistakeDataBundle, androidx.navigation.NavController, com.zykj.evaluation.ui.detail.mistake.MistakeViewModel, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/mistake/MistakePageKt.smali:30
    }

    /* renamed from: D */
    public static final boolean m9505D(NavController navController) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("NEED_NOT_REFRESH", Boolean.TRUE);
        }
        return navController.navigateUp();
    }

    /* renamed from: E */
    public static final Unit m9506E(MistakeViewModel mistakeViewModel) {
        mistakeViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final C10013l1 m9507F(State state) {
        return (C10013l1) state.getValue();
    }

    /* renamed from: G */
    public static final Unit m9508G(final DrawerState drawerState, final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final State state, final Function1 function1, final Context context, final Function0 function0, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498301909, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous> (MistakePage.kt:95)");
            }
            AbstractC8709e.m14341h(ComposableLambdaKt.rememberComposableLambda(1079585365, true, new Function2() { // from class: z5.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MistakePageKt.m9509H(drawerState, mistakeViewModel, navController, coroutineScope, state, function1, context, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m9509H(final DrawerState drawerState, final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final State state, final Function1 function1, final Context context, final Function0 function0, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1079585365, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous>.<anonymous> (MistakePage.kt:96)");
            }
            NavigationDrawerKt.m19022ModalNavigationDrawerFHprtrg(ComposableLambdaKt.rememberComposableLambda(-637784594, true, new Function2() { // from class: z5.b1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MistakePageKt.m9510I(mistakeViewModel, navController, coroutineScope, drawerState, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null)), drawerState, false, 0L, ComposableLambdaKt.rememberComposableLambda(553837555, true, new Function2() { // from class: z5.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MistakePageKt.m9519R(state, function1, context, mistakeViewModel, navController, coroutineScope, drawerState, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 199686, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m9510I(final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final DrawerState drawerState, final State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-637784594, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous>.<anonymous>.<anonymous> (MistakePage.kt:104)");
            }
            AbstractC8709e.m14338e(ComposableLambdaKt.rememberComposableLambda(1357772548, true, new Function2() { // from class: z5.u0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MistakePageKt.m9511J(mistakeViewModel, navController, coroutineScope, drawerState, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m9511J(final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final DrawerState drawerState, State state, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357772548, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MistakePage.kt:105)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((288 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            List listM16850f = m9507F(state).m16850f();
            boolean zChangedInstance = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: z5.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9512K(mistakeViewModel, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            List listM16847c = m9507F(state).m16847c();
            boolean zChangedInstance2 = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: z5.k0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9513L(mistakeViewModel, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            List listM16851g = m9507F(state).m16851g();
            boolean zChangedInstance3 = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: z5.l0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9514M(mistakeViewModel, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            List listM16849e = m9507F(state).m16849e();
            boolean zChangedInstance4 = composer.changedInstance(mistakeViewModel) | composer.changedInstance(navController);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: z5.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9515N(mistakeViewModel, navController, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function14 = (Function1) objRememberedValue4;
            boolean zChangedInstance5 = composer.changedInstance(navController);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: z5.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9516O(navController, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function1 function15 = (Function1) objRememberedValue5;
            boolean zChangedInstance6 = composer.changedInstance(mistakeViewModel) | composer.changedInstance(coroutineScope) | composer.changed(drawerState);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: z5.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MistakePageKt.m9517P(mistakeViewModel, coroutineScope, drawerState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function0 function0 = (Function0) objRememberedValue6;
            boolean zChangedInstance7 = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: z5.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MistakePageKt.m9518Q(mistakeViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            AbstractC10029r.m16887y(modifierM17733width3ABfNKs, listM16850f, function1, listM16847c, function12, listM16851g, function13, listM16849e, function14, function15, function0, (Function0) objRememberedValue7, composer, 6, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m9512K(MistakeViewModel mistakeViewModel, TagData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9591V(it);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m9513L(MistakeViewModel mistakeViewModel, TagData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9589T(it);
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m9514M(MistakeViewModel mistakeViewModel, TagData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9592W(it);
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m9515N(MistakeViewModel mistakeViewModel, NavController navController, TagData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getId() != 0) {
            mistakeViewModel.m9590U(it);
        } else {
            NavController.navigate$default(navController, "CREATE_UPDATE/" + new Gson().toJson(it), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m9516O(NavController navController, TagData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NavController.navigate$default(navController, "CREATE_UPDATE/" + new Gson().toJson(it), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m9517P(MistakeViewModel mistakeViewModel, CoroutineScope coroutineScope, DrawerState drawerState) {
        mistakeViewModel.m9593X();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MistakePageKt$MistakePage$5$1$1$1$6$1$1(drawerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m9518Q(MistakeViewModel mistakeViewModel) {
        mistakeViewModel.m9583K();
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final Unit m9519R(final State state, final Function1 function1, final Context context, final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final DrawerState drawerState, final Function0 function0, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(553837555, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous>.<anonymous>.<anonymous> (MistakePage.kt:155)");
            }
            AbstractC8709e.m14338e(ComposableLambdaKt.rememberComposableLambda(-1745572599, true, new Function2() { // from class: z5.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MistakePageKt.m9520S(state, function1, context, mistakeViewModel, navController, coroutineScope, drawerState, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final Unit m9520S(final State state, final Function1 function1, final Context context, final MistakeViewModel mistakeViewModel, final NavController navController, final CoroutineScope coroutineScope, final DrawerState drawerState, final Function0 function0, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1745572599, i10, -1, "com.zykj.evaluation.ui.detail.mistake.MistakePage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MistakePage.kt:156)");
            }
            List listM16854j = m9507F(state).m16854j();
            List listM16856l = m9507F(state).m16856l();
            long jM16853i = m9507F(state).m16853i();
            boolean zM16857m = m9507F(state).m16857m();
            String strM16855k = m9507F(state).m16855k();
            List listM16852h = m9507F(state).m16852h();
            boolean zChanged = composer.changed(state) | composer.changed(function1) | composer.changedInstance(context) | composer.changedInstance(mistakeViewModel) | composer.changedInstance(navController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: z5.d1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9521T(function1, navController, state, context, mistakeViewModel, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: z5.e1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9523V(mistakeViewModel, (C10037t1) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean zChangedInstance2 = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: z5.f1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9524W(mistakeViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function14 = (Function1) objRememberedValue3;
            boolean zChangedInstance3 = composer.changedInstance(mistakeViewModel) | composer.changedInstance(coroutineScope) | composer.changed(drawerState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: z5.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9525X(mistakeViewModel, coroutineScope, drawerState, (TagData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function15 = (Function1) objRememberedValue4;
            boolean zChanged2 = composer.changed(function0);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: z5.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MistakePageKt.m9526Y(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function0 function02 = (Function0) objRememberedValue5;
            boolean zChanged3 = composer.changed(state) | composer.changedInstance(mistakeViewModel) | composer.changedInstance(navController);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: z5.i1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MistakePageKt.m9527Z(mistakeViewModel, state, navController);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function0 function03 = (Function0) objRememberedValue6;
            boolean zChangedInstance4 = composer.changedInstance(mistakeViewModel);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: z5.j1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MistakePageKt.m9531b0(mistakeViewModel, (C9993f) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            AbstractC10003i0.m16837s(null, listM16856l, jM16853i, zM16857m, strM16855k, listM16854j, function12, listM16852h, function13, function14, function15, function02, function03, (Function1) objRememberedValue7, composer, 0, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public static final Unit m9521T(Function1 function1, NavController navController, State state, final Context context, final MistakeViewModel mistakeViewModel, final int i10) {
        if (((C9993f) m9507F(state).m16854j().get(i10)).m16803c().length() != 0) {
            NavController.navigate$default(navController, "IMAGE?IMAGE_KEY_EXAM_URL=" + StringsKt.replace$default(((C9993f) m9507F(state).m16854j().get(i10)).m16803c(), "/", "\\", false, 4, (Object) null) + "?IMAGE_KEY_COMMENT_URL=", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        } else if (m9507F(state).m16848d()) {
            function1.invoke(new Function1() { // from class: z5.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MistakePageKt.m9522U(context, mistakeViewModel, i10, (Uri) obj);
                }
            });
        } else {
            XToastUtils.INSTANCE.error("该功能已被禁用，如需开启摄像头请联系班主任");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m9522U(Context context, MistakeViewModel mistakeViewModel, int i10, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtils.m3239i("开始处理图片，读取图片" + jCurrentTimeMillis);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LogUtils.m3239i("开始处理图片，耗时: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms, Bitmap大小: " + (bitmapDecodeStream != null ? bitmapDecodeStream.getByteCount() : 0) + " bytes");
        Intrinsics.checkNotNull(bitmapDecodeStream);
        mistakeViewModel.m9584L(bitmapDecodeStream, i10, jCurrentTimeMillis2);
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m9523V(MistakeViewModel mistakeViewModel, C10037t1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9595Z(it);
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m9524W(MistakeViewModel mistakeViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9594Y(it);
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m9525X(MistakeViewModel mistakeViewModel, CoroutineScope coroutineScope, DrawerState drawerState, TagData tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.getId() != 0) {
            mistakeViewModel.m9598x(tag);
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MistakePageKt$MistakePage$5$1$2$1$4$1$1(mistakeViewModel, drawerState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m9526Y(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final Unit m9527Z(MistakeViewModel mistakeViewModel, State state, final NavController navController) {
        if (m9507F(state).m16855k().length() == 0) {
            XToastUtils.INSTANCE.toast("请添加标题");
            return Unit.INSTANCE;
        }
        List listM16854j = m9507F(state).m16854j();
        if (listM16854j == null || !listM16854j.isEmpty()) {
            Iterator it = listM16854j.iterator();
            while (it.hasNext()) {
                if (((C9993f) it.next()).m16803c().length() != 0) {
                    mistakeViewModel.m9596a0(new Function0() { // from class: z5.r0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MistakePageKt.m9529a0(navController);
                        }
                    });
                    return Unit.INSTANCE;
                }
            }
        }
        XToastUtils.INSTANCE.toast("请添加题干");
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final Unit m9529a0(NavController navController) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("MISTAKE_RESULT_CREATE_MISTAKE", "");
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m9531b0(MistakeViewModel mistakeViewModel, C9993f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mistakeViewModel.m9600z(it);
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m9533c0(MistakeDataBundle mistakeDataBundle, NavController navController, MistakeViewModel mistakeViewModel, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m9504C(mistakeDataBundle, navController, mistakeViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: d0 */
    public static final DisposableEffectResult m9535d0(NavController navController, final MistakeViewModel mistakeViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: z5.z0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MistakePageKt.m9537e0(mistakeViewModel, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("CREATE_UPDATE_RESULT_CREATE_UPDATE") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.detail.mistake.MistakePageKt$MistakePage$lambda$7$lambda$6$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: e0 */
    public static final void m9537e0(MistakeViewModel mistakeViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            TagData tagData = (TagData) new Gson().fromJson(str, TagData.class);
            long id = tagData.getId();
            String name = tagData.getName();
            if (name == null) {
                name = "";
            }
            mistakeViewModel.m9599y(id, name);
            if (savedStateHandle != null) {
                savedStateHandle.set("CREATE_UPDATE_RESULT_CREATE_UPDATE", null);
            }
        }
    }

    /* renamed from: f0 */
    public static final Unit m9539f0(DrawerState drawerState, CoroutineScope coroutineScope, Function0 function0) {
        if (drawerState.isOpen()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MistakePageKt$MistakePage$3$1$1(drawerState, null), 3, null);
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
