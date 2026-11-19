package coil3.compose;

import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import coil3.InterfaceC5328e;
import coil3.compose.AbstractC5310a;
import coil3.compose.internal.ContentPainterElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p163l.AbstractC8861g;
import p163l.InterfaceC8856b;
import p173m.AbstractC8937j;
import p173m.C8929b;
import p297y.C9924e;

/* renamed from: coil3.compose.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5310a {
    /* renamed from: b */
    public static final void m2669b(final C8929b c8929b, final String str, final Modifier modifier, final Function1 function1, final Function1 function12, final Alignment alignment, final ContentScale contentScale, final float f10, final ColorFilter colorFilter, final int i9, final boolean z9, Composer composer, final int i10, final int i11) {
        C8929b c8929b2;
        int i12;
        String str2;
        Function1 function13;
        Function1 function14;
        Alignment alignment2;
        float f11;
        ColorFilter colorFilter2;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(1236588022);
        if ((i10 & 6) == 0) {
            c8929b2 = c8929b;
            i12 = (composerStartRestartGroup.changed(c8929b2) ? 4 : 2) | i10;
        } else {
            c8929b2 = c8929b;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            i12 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            function13 = function1;
            i12 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i10 & 24576) == 0) {
            function14 = function12;
            i12 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i10) == 0) {
            alignment2 = alignment;
            i12 |= composerStartRestartGroup.changed(alignment2) ? 131072 : 65536;
        } else {
            alignment2 = alignment;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            f11 = f10;
            i12 |= composerStartRestartGroup.changed(f11) ? 8388608 : 4194304;
        } else {
            f11 = f10;
        }
        if ((100663296 & i10) == 0) {
            colorFilter2 = colorFilter;
            i12 |= composerStartRestartGroup.changed(colorFilter2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((805306368 & i10) == 0) {
            i13 = i9;
            i12 |= composerStartRestartGroup.changed(i13) ? 536870912 : 268435456;
        } else {
            i13 = i9;
        }
        if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.changed(z9) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i14 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236588022, i12, i14, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            C9924e c9924eM14237l = AbstractC8937j.m14237l(c8929b2.m14219b(), contentScale, composerStartRestartGroup, (i12 >> 15) & 112);
            AbstractC8937j.m14246u(c9924eM14237l);
            int i15 = i13;
            Modifier modifierThen = modifier.then(new ContentPainterElement(c9924eM14237l, c8929b2.m14218a(), c8929b2.m14220c(), function13, function14, i15, alignment2, contentScale, f11, colorFilter2, z9, AbstractC8937j.m14235j(composerStartRestartGroup, 0), str2, null));
            MeasurePolicy measurePolicyM14231f = AbstractC8937j.m14231f();
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyM14231f, companion.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: l.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5310a.m2671d(c8929b, str, modifier, function1, function12, alignment, contentScale, f10, colorFilter, i9, z9, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final void m2670c(Object obj, String str, InterfaceC5328e interfaceC5328e, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i9, boolean z9, Composer composer, int i10, int i11, int i12) {
        boolean z10;
        Modifier modifier2 = (i12 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i12 & 16) != 0 ? null : painter;
        Painter painter5 = (i12 & 32) != 0 ? null : painter2;
        Painter painter6 = (i12 & 64) != 0 ? painter5 : painter3;
        Function1 function14 = (i12 & 128) != 0 ? null : function1;
        Function1 function15 = (i12 & 256) != 0 ? null : function12;
        Function1 function16 = (i12 & 512) != 0 ? null : function13;
        Alignment center = (i12 & 1024) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 2048) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i12 & 4096) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i12 & 8192) == 0 ? colorFilter : null;
        int iM21963getDefaultFilterQualityfv9h1I = (i12 & 16384) != 0 ? DrawScope.INSTANCE.m21963getDefaultFilterQualityfv9h1I() : i9;
        boolean z11 = (i12 & 32768) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            z10 = z11;
            ComposerKt.traceEventStart(-1128374444, i10, i11, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        } else {
            z10 = z11;
        }
        int i13 = i11 << 15;
        m2669b(new C8929b(obj, (InterfaceC8856b) composer.consume(AbstractC8861g.m13717c()), interfaceC5328e), str, modifier2, AbstractC8937j.m14242q(painter4, painter5, painter6), AbstractC8937j.m14233h(function14, function15, function16), center, fit, f11, colorFilter2, iM21963getDefaultFilterQualityfv9h1I, z10, composer, ((i10 >> 3) & 896) | (i10 & 112) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), (i11 >> 15) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: d */
    public static final Unit m2671d(C8929b c8929b, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i9, boolean z9, int i10, int i11, Composer composer, int i12) {
        m2669b(c8929b, str, modifier, function1, function12, alignment, contentScale, f10, colorFilter, i9, z9, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
        return Unit.INSTANCE;
    }
}
