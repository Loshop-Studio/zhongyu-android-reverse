package coil3.compose;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import coil3.InterfaceC5193e;
import coil3.compose.AbstractC5175a;
import coil3.compose.internal.ContentPainterElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p150l.AbstractC8479g;
import p150l.InterfaceC8474b;
import p161m.AbstractC8534j;
import p161m.C8526b;
import p290y.C9886e;

/* renamed from: coil3.compose.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5175a {
    /* renamed from: b */
    public static final void m2940b(final C8526b c8526b, final String str, final Modifier modifier, final Function1 function1, final Function1 function12, final Alignment alignment, final ContentScale contentScale, final float f10, final ColorFilter colorFilter, final int i10, final boolean z9, Composer composer, final int i11, final int i12) {
        C8526b c8526b2;
        int i13;
        String str2;
        Function1 function13;
        Function1 function14;
        Alignment alignment2;
        float f11;
        ColorFilter colorFilter2;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(1236588022);
        if ((i11 & 6) == 0) {
            c8526b2 = c8526b;
            i13 = (composerStartRestartGroup.changed(c8526b2) ? 4 : 2) | i11;
        } else {
            c8526b2 = c8526b;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            str2 = str;
            i13 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function13 = function1;
            i13 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i11 & 24576) == 0) {
            function14 = function12;
            i13 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i11) == 0) {
            alignment2 = alignment;
            i13 |= composerStartRestartGroup.changed(alignment2) ? 131072 : 65536;
        } else {
            alignment2 = alignment;
        }
        if ((1572864 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            f11 = f10;
            i13 |= composerStartRestartGroup.changed(f11) ? 8388608 : 4194304;
        } else {
            f11 = f10;
        }
        if ((100663296 & i11) == 0) {
            colorFilter2 = colorFilter;
            i13 |= composerStartRestartGroup.changed(colorFilter2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((805306368 & i11) == 0) {
            i14 = i10;
            i13 |= composerStartRestartGroup.changed(i14) ? 536870912 : 268435456;
        } else {
            i14 = i10;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (composerStartRestartGroup.changed(z9) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if (composerStartRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : true, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236588022, i13, i15, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            C9886e c9886eM14035l = AbstractC8534j.m14035l(c8526b2.m14017b(), contentScale, composerStartRestartGroup, (i13 >> 15) & 112);
            AbstractC8534j.m14044u(c9886eM14035l);
            int i16 = i14;
            Modifier modifierThen = modifier.then(new ContentPainterElement(c9886eM14035l, c8526b2.m14016a(), c8526b2.m14018c(), function13, function14, i16, alignment2, contentScale, f11, colorFilter2, z9, AbstractC8534j.m14033j(composerStartRestartGroup, 0), str2, null));
            MeasurePolicy measurePolicyM14029f = AbstractC8534j.m14029f();
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
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyM14029f, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: l.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5175a.m2943e(c8526b, str, modifier, function1, function12, alignment, contentScale, f10, colorFilter, i10, z9, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final void m2941c(Object obj, String str, InterfaceC5193e interfaceC5193e, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, boolean z9, Composer composer, int i11, int i12, int i13) {
        boolean z10;
        Modifier modifier2 = (i13 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i13 & 16) != 0 ? null : painter;
        Painter painter5 = (i13 & 32) != 0 ? null : painter2;
        Painter painter6 = (i13 & 64) != 0 ? painter5 : painter3;
        Function1 function14 = (i13 & 128) != 0 ? null : function1;
        Function1 function15 = (i13 & 256) != 0 ? null : function12;
        Function1 function16 = (i13 & 512) != 0 ? null : function13;
        Alignment center = (i13 & 1024) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i13 & 2048) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i13 & 4096) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i13 & 8192) == 0 ? colorFilter : null;
        int iM21530getDefaultFilterQualityfv9h1I = (i13 & 16384) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i10;
        boolean z11 = (i13 & 32768) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            z10 = z11;
            ComposerKt.traceEventStart(-1128374444, i11, i12, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        } else {
            z10 = z11;
        }
        int i14 = i12 << 15;
        m2940b(new C8526b(obj, (InterfaceC8474b) composer.consume(AbstractC8479g.m13862c()), interfaceC5193e), str, modifier2, AbstractC8534j.m14040q(painter4, painter5, painter6), AbstractC8534j.m14031h(function14, function15, function16), center, fit, f11, colorFilter2, iM21530getDefaultFilterQualityfv9h1I, z10, composer, ((i11 >> 3) & 896) | (i11 & 112) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i12 >> 15) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: d */
    public static final void m2942d(Object obj, String str, InterfaceC5193e interfaceC5193e, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, boolean z9, Composer composer, int i11, int i12, int i13) {
        Modifier modifier2 = (i13 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1 function1M2920a = (i13 & 16) != 0 ? AsyncImagePainter.INSTANCE.m2920a() : function1;
        Function1 function13 = (i13 & 32) != 0 ? null : function12;
        Alignment center = (i13 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i13 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i13 & 256) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i13 & 512) != 0 ? null : colorFilter;
        int iM21530getDefaultFilterQualityfv9h1I = (i13 & 1024) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i10;
        boolean z10 = (i13 & 2048) != 0 ? true : z9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(40041566, i11, i12, "coil3.compose.AsyncImage (AsyncImage.kt:125)");
        }
        int i14 = i11 >> 3;
        m2940b(new C8526b(obj, (InterfaceC8474b) composer.consume(AbstractC8479g.m13862c()), interfaceC5193e), str, modifier2, function1M2920a, function13, center, fit, f11, colorFilter2, iM21530getDefaultFilterQualityfv9h1I, z10, composer, (i11 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: e */
    public static final Unit m2943e(C8526b c8526b, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, boolean z9, int i11, int i12, Composer composer, int i13) {
        m2940b(c8526b, str, modifier, function1, function12, alignment, contentScale, f10, colorFilter, i10, z9, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
        return Unit.INSTANCE;
    }
}
