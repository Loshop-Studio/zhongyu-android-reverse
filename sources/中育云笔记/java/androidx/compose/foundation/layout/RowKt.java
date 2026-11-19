package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;

/* loaded from: classes.dex */
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy = new RowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, InterfaceC9545q interfaceC9545q, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i11 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i11 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        MeasurePolicy measurePolicyRowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i10 >> 3) & Opcodes.IAND);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        InterfaceC9529a constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        interfaceC9545q.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i10 >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final long createRowConstraints(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? ConstraintsKt.Constraints(i10, i12, i11, i13) : Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA(i10, i12, i11, i13);
    }

    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }

    @Composable
    public static final MeasurePolicy rowMeasurePolicy(Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Composer composer, int i10) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:121)");
        }
        if (AbstractC9979u.m20289b(horizontal, Arrangement.INSTANCE.getStart()) && AbstractC9979u.m20289b(vertical, Alignment.Companion.getTop())) {
            composer.startReplaceGroup(-848964613);
            composer.endReplaceGroup();
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceGroup(-848913742);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i10 & 48) == 32);
            Object objRememberedValue = composer.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new RowMeasurePolicy(horizontal, vertical);
                composer.updateRememberedValue(objRememberedValue);
            }
            measurePolicy = (RowMeasurePolicy) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }
}
