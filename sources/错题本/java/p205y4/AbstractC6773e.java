package p205y4;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.zykj.mistake.feature.notebook.detail.C4899x;
import com.zykj.mistake.feature.notebook.detail.C4905y;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p137p4.C6390i;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: y4.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6773e {

    /* renamed from: a */
    public static final float f11448a;

    /* renamed from: b */
    public static final float f11449b;

    static {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(24);
        f11448a = fM13305constructorimpl;
        f11449b = fM13305constructorimpl;
    }

    /* renamed from: a */
    public static final void m6457a(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(847839632);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(847839632, i, -1, "com.zykj.mistake.platform.compose.MistakeEmptyTagChip (MistakeItemTagRow.kt:138)");
            }
            Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(AbstractC1923c.m1042f(2, SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, f11448a), ColorKt.Color(4294309365L)), C2331Dp.m13305constructorimpl(6), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m9105Text4IGK_g("暂无标签", (Modifier) null, ColorKt.Color(4284900966L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, new TextStyle(0L, TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(11), (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16121853, (AbstractC5824e) null), composer2, 390, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4899x(i, 3));
        }
    }

    /* renamed from: b */
    public static final void m6458b(final List tags, final Modifier modifier, Composer composer, final int i) {
        int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        InterfaceC6473e interfaceC6473e;
        AbstractC5830k.m5330g(tags, "tags");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1691676721);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(tags) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        final int i9 = 1;
        final int i10 = 0;
        if (composerStartRestartGroup.shouldExecute((i8 & 19) != 18, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1691676721, i8, -1, "com.zykj.mistake.platform.compose.MistakeItemTagRow (MistakeItemTagRow.kt:29)");
            }
            boolean zIsEmpty = tags.isEmpty();
            float f = f11449b;
            if (zIsEmpty) {
                composerStartRestartGroup.startReplaceGroup(405193099);
                Modifier modifierM7295height3ABfNKs = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7295height3ABfNKs);
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
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                m6457a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    interfaceC6473e = new InterfaceC6473e() { // from class: y4.a
                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    AbstractC6773e.m6458b(tags, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AbstractC6773e.m6458b(tags, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return C5443s.f8405a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(404040147);
            composerStartRestartGroup.endReplaceGroup();
            float fM13305constructorimpl = C2331Dp.m13305constructorimpl(6);
            Modifier modifierM7295height3ABfNKs2 = SizeKt.m7295height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(tags);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C6771c(tags, fM13305constructorimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7295height3ABfNKs2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(1737496736);
            Iterator it = tags.iterator();
            while (it.hasNext()) {
                m6459c((C6390i) it.next(), composerStartRestartGroup, 0);
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            interfaceC6473e = new InterfaceC6473e() { // from class: y4.a
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = i9;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i11) {
                        case 0:
                            AbstractC6773e.m6458b(tags, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            AbstractC6773e.m6458b(tags, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return C5443s.f8405a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(interfaceC6473e);
        }
    }

    /* renamed from: c */
    public static final void m6459c(C6390i c6390i, Composer composer, int i) {
        int i8;
        Composer composer2;
        int i9;
        Pair pair;
        Composer composerStartRestartGroup = composer.startRestartGroup(1470030912);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c6390i) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470030912, i8, -1, "com.zykj.mistake.platform.compose.MistakeTagChip (MistakeItemTagRow.kt:108)");
            }
            int i10 = AbstractC6772d.f11447a[c6390i.f10481b.ordinal()];
            if (i10 == 1) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4294963440L)), Color.m10672boximpl(ColorKt.Color(4294925918L)));
            } else if (i10 == 2) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4293918713L)), Color.m10672boximpl(ColorKt.Color(4280333446L)));
            } else if (i10 == 3) {
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4294964971L)), Color.m10672boximpl(ColorKt.Color(4294941227L)));
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Color.m10672boximpl(ColorKt.Color(4293916415L)), Color.m10672boximpl(ColorKt.Color(4279596799L)));
            }
            Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(AbstractC1923c.m1042f(2, SizeKt.m7295height3ABfNKs(Modifier.INSTANCE, f11448a), ((Color) pair.getFirst()).m10692unboximpl()), C2331Dp.m13305constructorimpl(6), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            i9 = 1;
            TextKt.m9105Text4IGK_g(c6390i.f10480a, (Modifier) null, ((Color) pair.getSecond()).m10692unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13240getClipgIe3tQ8(), false, 1, 0, (InterfaceC6471c) null, new TextStyle(0L, TextUnitKt.getSp(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(11), (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16121853, (AbstractC5824e) null), composer2, 0, 3504, 51194);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i9 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4905y(c6390i, i, i9));
        }
    }
}
