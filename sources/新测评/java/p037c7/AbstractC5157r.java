package p037c7;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.zykj.evaluation.bean.constant.FragmentTag;
import com.zykj.view.board.play.SketchPlayFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p159l8.C8523h;
import p246t7.C9464a;

/* renamed from: c7.r */
/* loaded from: classes4.dex */
public abstract class AbstractC5157r {
    /* renamed from: g */
    public static final void m2804g(Modifier modifier, final String path, final C5142c sketchPlayFunction, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sketchPlayFunction, "sketchPlayFunction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358797297);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(path) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(sketchPlayFunction) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1358797297, i12, -1, "com.zykj.evaluation.ui.sketch.SketchPlayView (SketchPlayView.kt:29)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            if (path.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(136703155);
                BoxKt.Box(BackgroundKt.m17190backgroundbw27NRU$default(modifier4, Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(136828240);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(sketchPlayFunction);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: c7.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC5157r.m2810m(sketchPlayFunction, mutableState, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                boolean z9 = (i12 & 112) == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: c7.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC5157r.m2806i(path, mutableState, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidView_androidKt.AndroidView(function1, modifier4, (Function1) objRememberedValue3, composerStartRestartGroup, (i12 << 3) & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c7.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5157r.m2808k(modifier3, path, sketchPlayFunction, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final boolean m2805h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: i */
    public static final Unit m2806i(String str, final MutableState mutableState, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        SketchPlayFragment sketchPlayFragment = (SketchPlayFragment) supportFragmentManager.findFragmentByTag(FragmentTag.SketchPlayFragmentTag);
        if (sketchPlayFragment != null) {
            SketchPlayFragment.m11229b0(sketchPlayFragment, str, 0, false, null, new Function1() { // from class: c7.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC5157r.m2807j(mutableState, ((Boolean) obj).booleanValue());
                }
            }, 14, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m2807j(MutableState mutableState, boolean z9) {
        m2809l(mutableState, z9);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m2808k(Modifier modifier, String str, C5142c c5142c, int i10, int i11, Composer composer, int i12) {
        m2804g(modifier, str, c5142c, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m2809l(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.zykj.view.board.play.SketchPlayFragment] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.fragment.app.Fragment, com.zykj.view.board.play.SketchPlayFragment] */
    /* renamed from: m */
    public static final View m2810m(final C5142c c5142c, final MutableState mutableState, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context baseContext = ((C8523h) context).getBaseContext();
        Intrinsics.checkNotNull(baseContext, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((AppCompatActivity) baseContext).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r12 = (SketchPlayFragment) supportFragmentManager.findFragmentByTag(FragmentTag.SketchPlayFragmentTag);
        objectRef.element = r12;
        if (r12 != 0) {
            fragmentTransactionBeginTransaction.remove((Fragment) r12);
        }
        ?? sketchPlayFragment = new SketchPlayFragment();
        fragmentTransactionBeginTransaction.add((Fragment) sketchPlayFragment, FragmentTag.SketchPlayFragmentTag).commitNowAllowingStateLoss();
        objectRef.element = sketchPlayFragment;
        c5142c.m2795g(new Function0() { // from class: c7.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(AbstractC5157r.m2811n(objectRef, mutableState));
            }
        });
        ((SketchPlayFragment) objectRef.element).m11266e0(new C9464a(false, new Function0() { // from class: c7.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC5157r.m2812o(c5142c);
            }
        }, null, false, null, null, null, null, true, true, 253, null));
        return ((SketchPlayFragment) objectRef.element).requireView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final float m2811n(Ref.ObjectRef objectRef, MutableState mutableState) {
        if (m2805h(mutableState)) {
            return ((SketchPlayFragment) objectRef.element).m11258H();
        }
        return 1.0f;
    }

    /* renamed from: o */
    public static final Unit m2812o(C5142c c5142c) {
        c5142c.m2793e().invoke(c5142c.m2794f().invoke());
        return Unit.INSTANCE;
    }
}
