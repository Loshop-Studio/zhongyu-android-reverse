package p244s6;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;

/* renamed from: s6.d */
/* loaded from: classes5.dex */
public final class C9497d {

    /* renamed from: a */
    public static final C9497d f16548a = new C9497d();

    /* renamed from: b */
    public static Function2 f16549b = ComposableLambdaKt.composableLambdaInstance(-1711891576, false, new Function2() { // from class: s6.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9497d.m15701i((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static Function3 f16550c = ComposableLambdaKt.composableLambdaInstance(1454432559, false, new Function3() { // from class: s6.b
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9497d.m15699g((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: d */
    public static Function3 f16551d = ComposableLambdaKt.composableLambdaInstance(1942366872, false, new Function3() { // from class: s6.c
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9497d.m15700h((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: g */
    public static final Unit m15699g(RowScope TextButton, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454432559, i9, -1, "com.zykj.student.dialogue.ui.home.ComposableSingletons$HomeScreensKt.lambda$1454432559.<anonymous> (HomeScreens.kt:172)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f10 = 600;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_move, composer, 0), (String) null, SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((2 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            TextKt.m19863Text4IGK_g("移动", (Modifier) null, AbstractC9768a.m16543e(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m15700h(RowScope TextButton, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1942366872, i9, -1, "com.zykj.student.dialogue.ui.home.ComposableSingletons$HomeScreensKt.lambda$1942366872.<anonymous> (HomeScreens.kt:192)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f10 = 600;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_item_cancel, composer, 0), (String) null, SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((2 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            TextKt.m19863Text4IGK_g("取消", (Modifier) null, AbstractC9768a.m16543e(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m15701i(Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1711891576, i9, -1, "com.zykj.student.dialogue.ui.home.ComposableSingletons$HomeScreensKt.lambda$-1711891576.<anonymous> (HomeScreens.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f10 = 600;
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((5 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_search, composer, 0), (String) null, SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, MenuKt.InTransitionDuration);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final Function2 m15702d() {
        return f16549b;
    }

    /* renamed from: e */
    public final Function3 m15703e() {
        return f16550c;
    }

    /* renamed from: f */
    public final Function3 m15704f() {
        return f16551d;
    }
}
