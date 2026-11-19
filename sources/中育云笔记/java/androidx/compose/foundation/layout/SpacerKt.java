package androidx.compose.foundation.layout;

import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
public final class SpacerKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Spacer(Modifier modifier, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.INSTANCE;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
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
        Updater.m30312setimpl(composerM30305constructorimpl, spacerMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
