package coil3.compose;

import android.content.Context;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.navigation.C2856d;
import coil3.InterfaceC3308n;
import coil3.compose.internal.ContentPainterElement;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p110m.AbstractC6077e;
import p110m.C6073a;
import p110m.C6076d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p154s.C6529c;
import p154s.C6532f;
import p162t.InterfaceC6577g;

/* renamed from: coil3.compose.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3245b {
    /* renamed from: a */
    public static final void m2182a(final C6073a c6073a, final Modifier modifier, final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2, final Alignment alignment, final ContentScale contentScale, final int i, Composer composer, final int i8, final int i9) {
        int i10;
        InterfaceC6471c interfaceC6471c3;
        InterfaceC6471c interfaceC6471c4;
        Alignment alignment2;
        int i11;
        int i12;
        C6532f c6532f;
        Composer composerStartRestartGroup = composer.startRestartGroup(1236588022);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(c6073a) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed((Object) null) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            interfaceC6471c3 = interfaceC6471c;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6471c3) ? 2048 : 1024;
        } else {
            interfaceC6471c3 = interfaceC6471c;
        }
        if ((i8 & 24576) == 0) {
            interfaceC6471c4 = interfaceC6471c2;
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6471c4) ? 16384 : 8192;
        } else {
            interfaceC6471c4 = interfaceC6471c2;
        }
        if ((196608 & i8) == 0) {
            alignment2 = alignment;
            i10 |= composerStartRestartGroup.changed(alignment2) ? 131072 : 65536;
        } else {
            alignment2 = alignment;
        }
        if ((1572864 & i8) == 0) {
            i10 |= composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i10 |= composerStartRestartGroup.changed(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            i10 |= composerStartRestartGroup.changed((Object) null) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i8) == 0) {
            i11 = i;
            i10 |= composerStartRestartGroup.changed(i11) ? 536870912 : 268435456;
        } else {
            i11 = i;
        }
        if ((i9 & 6) == 0) {
            i12 = i9 | (composerStartRestartGroup.changed(true) ? 4 : 2);
        } else {
            i12 = i9;
        }
        if ((306783379 & i10) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236588022, i10, i12, "coil3.compose.AsyncImage (AsyncImage.kt:152)");
            }
            Object obj = c6073a.f9670a;
            int i13 = (i10 >> 15) & 112;
            int i14 = AbstractC6077e.f9679b;
            composerStartRestartGroup.startReplaceGroup(-329318062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-329318062, i13, -1, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)");
            }
            if (obj instanceof C6532f) {
                composerStartRestartGroup.startReplaceGroup(-1008895720);
                c6532f = (C6532f) obj;
                if (c6532f.f10879s.f10858i != null) {
                    composerStartRestartGroup.startReplaceGroup(-1008855668);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1008807494);
                    InterfaceC6577g interfaceC6577gM5790b = AbstractC6077e.m5790b(contentScale, composerStartRestartGroup, (i13 >> 3) & 14);
                    boolean zChanged = composerStartRestartGroup.changed(c6532f) | composerStartRestartGroup.changed(interfaceC6577gM5790b);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        C6529c c6529cM6184a = C6532f.m6184a(c6532f);
                        c6529cM6184a.f10831n = interfaceC6577gM5790b;
                        objRememberedValue = c6529cM6184a.m6182a();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    c6532f = (C6532f) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-1008549326);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                InterfaceC6577g interfaceC6577gM5790b2 = AbstractC6077e.m5790b(contentScale, composerStartRestartGroup, (i13 >> 3) & 14);
                boolean zChanged2 = composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(interfaceC6577gM5790b2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    C6529c c6529c = new C6529c(context);
                    c6529c.f10820c = obj;
                    c6529c.f10831n = interfaceC6577gM5790b2;
                    objRememberedValue2 = c6529c.m6182a();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                c6532f = (C6532f) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            C6532f c6532f2 = c6532f;
            AbstractC6077e.m5794f(c6532f2);
            Modifier modifierThen = modifier.then(new ContentPainterElement(c6532f2, c6073a.f9672c, c6073a.f9671b, interfaceC6471c3, interfaceC6471c4, i11, alignment2, contentScale, AbstractC6077e.m5789a(composerStartRestartGroup)));
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            Updater.m10116setimpl(composerM10109constructorimpl, C6076d.f9677a, companion.getSetMeasurePolicy());
            Updater.m10116setimpl(composerM10109constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            InterfaceC6473e setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: coil3.compose.a
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC3245b.m2182a(c6073a, modifier, interfaceC6471c, interfaceC6471c2, alignment, contentScale, i, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9));
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: b */
    public static final void m2183b(Object obj, InterfaceC3308n interfaceC3308n, Modifier modifier, Painter painter, ContentScale contentScale, Composer composer, int i) {
        Alignment center = Alignment.INSTANCE.getCenter();
        int iM11236getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11236getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1128374444, i, 48, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        }
        int i8 = i >> 3;
        C6073a c6073a = new C6073a(obj, (C3246c) composer.consume(AbstractC3256m.f1879a), interfaceC3308n);
        int i9 = AbstractC6077e.f9679b;
        m2182a(c6073a, modifier, (painter == null && painter == null) ? AsyncImagePainter.f1818q : new C2856d(18, painter, painter), null, center, contentScale, iM11236getDefaultFilterQualityfv9h1I, composer, (i & 112) | (i8 & 896) | 1572864, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
