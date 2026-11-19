package p079e7;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.zykj.evaluation.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.angmarch.views.NiceSpinner;
import p182n9.InterfaceC8675b;
import p306z5.C10037t1;

/* renamed from: e7.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7373b0 {
    /* renamed from: e */
    public static final void m11813e(Modifier modifier, final List topicList, final long j10, final Function1 onTopicSelected, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(topicList, "topicList");
        Intrinsics.checkNotNullParameter(onTopicSelected, "onTopicSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1849733005);
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
            i12 |= composerStartRestartGroup.changedInstance(topicList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onTopicSelected) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849733005, i12, -1, "com.zykj.evaluation.ui.widget.NiceSpinnerView (NiceSpinnerView.kt:26)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(topicList, composerStartRestartGroup, (i12 >> 3) & 14);
            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onTopicSelected, composerStartRestartGroup, (i12 >> 9) & 14);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(modifier4, C3127Dp.m23561constructorimpl((77 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: e7.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7373b0.m11819k((Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(topicList) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changed(stateRememberUpdatedState2) | ((i12 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                Function1 function12 = new Function1() { // from class: e7.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC7373b0.m11816h(topicList, stateRememberUpdatedState, stateRememberUpdatedState2, j10, (NiceSpinner) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue2 = function12;
            }
            AndroidView_androidKt.AndroidView(function1, modifierM17733width3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: e7.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7373b0.m11818j(modifier3, topicList, j10, onTopicSelected, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final List m11814f(State state) {
        return (List) state.getValue();
    }

    /* renamed from: g */
    public static final Function1 m11815g(State state) {
        return (Function1) state.getValue();
    }

    /* renamed from: h */
    public static final Unit m11816h(List list, final State state, final State state2, long j10, NiceSpinner view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10037t1) it.next()).m16897b());
        }
        Object tag = view.getTag();
        if (!Intrinsics.areEqual(tag instanceof List ? (List) tag : null, arrayList)) {
            view.setTag(arrayList);
            view.m14662l(arrayList);
            view.setOnSpinnerItemSelectedListener(new InterfaceC8675b() { // from class: e7.a0
                @Override // p182n9.InterfaceC8675b
                /* renamed from: a */
                public final void mo11800a(NiceSpinner niceSpinner, View view2, int i10, long j11) {
                    AbstractC7373b0.m11817i(state, state2, niceSpinner, view2, i10, j11);
                }
            });
        }
        view.setEnabled(!arrayList.isEmpty());
        if (!arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (((C10037t1) it2.next()).m16896a() == j10) {
                    break;
                }
                i10++;
            }
            Integer numValueOf = Integer.valueOf(i10);
            Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
            int iCoerceIn = num != null ? RangesKt.coerceIn(num.intValue(), 0, CollectionsKt.getLastIndex(arrayList)) : 0;
            if (view.getSelectedIndex() != iCoerceIn) {
                view.setSelectedIndex(iCoerceIn);
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final void m11817i(State state, State state2, NiceSpinner niceSpinner, View view, int i10, long j10) {
        C10037t1 c10037t1 = (C10037t1) CollectionsKt.getOrNull(m11814f(state), i10);
        if (c10037t1 != null) {
            m11815g(state2).invoke(c10037t1);
        }
    }

    /* renamed from: j */
    public static final Unit m11818j(Modifier modifier, List list, long j10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m11813e(modifier, list, j10, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final NiceSpinner m11819k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NiceSpinner niceSpinner = new NiceSpinner(context);
        niceSpinner.setBackgroundResource(R.drawable.shape_mistake_spinner);
        niceSpinner.m14662l(CollectionsKt.emptyList());
        niceSpinner.setEnabled(false);
        return niceSpinner;
    }
}
