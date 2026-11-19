package com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuidePageKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public abstract class ToCorrectSelfGuidePageKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9895f(final androidx.navigation.NavController r20, long r21, com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuidePageKt.m9895f(androidx.navigation.NavController, long, com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt.smali:60
    }

    /* renamed from: g */
    public static final DisposableEffectResult m9896g(final NavController navController, final ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: p6.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToCorrectSelfGuidePageKt.m9897h(toCorrectSelfGuideViewModel, navController, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("SUBMIT_CORRECT_SELF") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuidePageKt$ToCorrectSelfGuidePage$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: h */
    public static final void m9897h(ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, NavController navController, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            toCorrectSelfGuideViewModel.m9904c0();
            navController.popBackStack();
            if (savedStateHandle != null) {
                savedStateHandle.set("SUBMIT_CORRECT_SELF", null);
            }
        }
    }

    /* renamed from: i */
    public static final Unit m9898i(ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, NavController navController) {
        NavController.navigate$default(navController, "SUBMIT_CORRECT_SELF/" + toCorrectSelfGuideViewModel.m9861Q().m13234d(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m9899j(ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, NavController navController, long j10, long j11) {
        DetailBundle detailBundleM9858N = toCorrectSelfGuideViewModel.m9858N(j11);
        if (detailBundleM9858N != null) {
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", detailBundleM9858N);
            NavController.navigate$default(navController, "DETAIL_TO_CORRECT_SELF/" + j10, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m9900k(NavController navController, long j10, ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9895f(navController, j10, toCorrectSelfGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
