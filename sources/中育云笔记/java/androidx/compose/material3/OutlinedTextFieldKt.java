package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.DpKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p364uc.AbstractC11383c;

/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = C3186Dp.m33501constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding;

    static {
        long jM30191getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m30191getBodySmallLineHeightXSAIIZE();
        TextUnitKt.m33708checkArithmeticR2X_6o(jM30191getBodySmallLineHeightXSAIIZE);
        OutlinedTextFieldTopPadding = TextUnitKt.pack(TextUnit.m33693getRawTypeimpl(jM30191getBodySmallLineHeightXSAIIZE), TextUnit.m33695getValueimpl(jM30191getBodySmallLineHeightXSAIIZE) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final java.lang.String r68, final p181hd.InterfaceC9540l r69, androidx.compose.p014ui.Modifier r70, boolean r71, boolean r72, androidx.compose.p014ui.text.TextStyle r73, p181hd.InterfaceC9544p r74, p181hd.InterfaceC9544p r75, p181hd.InterfaceC9544p r76, p181hd.InterfaceC9544p r77, p181hd.InterfaceC9544p r78, p181hd.InterfaceC9544p r79, p181hd.InterfaceC9544p r80, boolean r81, androidx.compose.p014ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.p014ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(final Modifier modifier, final InterfaceC9544p interfaceC9544p, final InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, final InterfaceC9544p interfaceC9544p4, final InterfaceC9544p interfaceC9544p5, final InterfaceC9544p interfaceC9544p6, final boolean z10, final float f10, final InterfaceC9540l interfaceC9540l, final InterfaceC9544p interfaceC9544p7, InterfaceC9544p interfaceC9544p8, PaddingValues paddingValues, Composer composer, final int i10, final int i11) {
        int i12;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        float f11;
        final InterfaceC9544p interfaceC9544p9;
        InterfaceC9544p interfaceC9544p10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        if ((i10 & 6) == 0) {
            i12 = i10 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p5) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p6) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= composerStartRestartGroup.changed(f10) ? 536870912 : 268435456;
        }
        int i15 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (composerStartRestartGroup.changedInstance(interfaceC9540l) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC9544p8) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i13 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i16 = i13;
        if ((i15 & 306783379) == 306783378 && (i16 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC9544p9 = interfaceC9544p2;
            interfaceC9544p10 = interfaceC9544p8;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i15, i16, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z11 = ((i16 & 7168) == 2048) | ((i16 & 14) == 4) | ((234881024 & i15) == 67108864) | ((1879048192 & i15) == 536870912);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(interfaceC9540l, z10, f10, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            interfaceC9544p7.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 3) & 14));
            composerStartRestartGroup.startReplaceGroup(250370369);
            if (interfaceC9544p3 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                InterfaceC9529a constructor2 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC9544p3.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 12) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250379492);
            if (interfaceC9544p4 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                InterfaceC9529a constructor3 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                interfaceC9544p4.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 15) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (interfaceC9544p3 != null) {
                i14 = 0;
                fCalculateStartPadding = C3186Dp.m33501constructorimpl(AbstractC10410o.m21751d(C3186Dp.m33501constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C3186Dp.m33501constructorimpl(0)));
            } else {
                i14 = 0;
            }
            float fM33501constructorimpl = fCalculateStartPadding;
            if (interfaceC9544p4 != null) {
                fCalculateEndPadding = C3186Dp.m33501constructorimpl(AbstractC10410o.m21751d(C3186Dp.m33501constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C3186Dp.m33501constructorimpl(i14)));
            }
            composerStartRestartGroup.startReplaceGroup(250410106);
            if (interfaceC9544p5 != null) {
                Modifier modifierM27462paddingqDBjuR0$default = PaddingKt.m27462paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m27493heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM33501constructorimpl, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default);
                InterfaceC9529a constructor4 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                interfaceC9544p5.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 18) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250422072);
            if (interfaceC9544p6 != null) {
                f11 = fCalculateEndPadding;
                Modifier modifierM27462paddingqDBjuR0$default2 = PaddingKt.m27462paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m27493heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f11, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM27462paddingqDBjuR0$default2);
                InterfaceC9529a constructor5 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl5 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl5.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM30305constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM30305constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m30312setimpl(composerM30305constructorimpl5, modifierMaterializeModifier5, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                interfaceC9544p6.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 21) & 14));
                composerStartRestartGroup.endNode();
            } else {
                f11 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m27493heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (interfaceC9544p5 != null) {
                fM33501constructorimpl = C3186Dp.m33501constructorimpl(0);
            }
            Modifier modifierM27462paddingqDBjuR0$default3 = PaddingKt.m27462paddingqDBjuR0$default(modifierWrapContentHeight$default, fM33501constructorimpl, 0.0f, interfaceC9544p6 == null ? f11 : C3186Dp.m33501constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(250444361);
            if (interfaceC9545q != null) {
                interfaceC9545q.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM27462paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((i15 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM27462paddingqDBjuR0$default3);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            InterfaceC9529a constructor6 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl6 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl6, currentCompositionLocalMap6, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash6 = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl6.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM30305constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM30305constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m30312setimpl(composerM30305constructorimpl6, modifierMaterializeModifier6, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(250455481);
            if (interfaceC9544p2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m27493heightInVpY3zN4$default(companion2, DpKt.m33544lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f10), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.LabelId);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                InterfaceC9529a constructor7 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl7 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl7, currentCompositionLocalMap7, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash7 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl7.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM30305constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM30305constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m30312setimpl(composerM30305constructorimpl7, modifierMaterializeModifier7, companion.getSetModifier());
                interfaceC9544p9 = interfaceC9544p2;
                interfaceC9544p9.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
                composerStartRestartGroup.endNode();
            } else {
                interfaceC9544p9 = interfaceC9544p2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250473414);
            if (interfaceC9544p8 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m27493heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m29278supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                InterfaceC9529a constructor8 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl8 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl8, currentCompositionLocalMap8, companion.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash8 = companion.getSetCompositeKeyHash();
                if (composerM30305constructorimpl8.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM30305constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM30305constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m30312setimpl(composerM30305constructorimpl8, modifierMaterializeModifier8, companion.getSetModifier());
                interfaceC9544p10 = interfaceC9544p8;
                interfaceC9544p10.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 6) & 14));
                composerStartRestartGroup.endNode();
            } else {
                interfaceC9544p10 = interfaceC9544p8;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC9544p interfaceC9544p11 = interfaceC9544p10;
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i17) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, interfaceC9544p, interfaceC9545q, interfaceC9544p9, interfaceC9544p3, interfaceC9544p4, interfaceC9544p5, interfaceC9544p6, z10, f10, interfaceC9540l, interfaceC9544p7, interfaceC9544p11, paddingValues3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m28953calculateHeightmKXJcVc(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, PaddingValues paddingValues) {
        int iM25335i = AbstractC11383c.m25335i(i14, i16, i12, i13, MathHelpersKt.lerp(i15, 0, f10));
        float fMo27410calculateTopPaddingD9Ej5fM = paddingValues.mo27410calculateTopPaddingD9Ej5fM() * f11;
        return Math.max(Constraints.m33455getMinHeightimpl(j10), Math.max(i10, Math.max(i11, AbstractC9719c.m19282d(MathHelpersKt.lerp(fMo27410calculateTopPaddingD9Ej5fM, Math.max(fMo27410calculateTopPaddingD9Ej5fM, i15 / 2.0f), f10) + iM25335i + (paddingValues.mo27407calculateBottomPaddingD9Ej5fM() * f11)))) + i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m28954calculateWidthDHJA7U0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, float f11, PaddingValues paddingValues) {
        int i17 = i12 + i13;
        int iMax = i10 + Math.max(i14 + i17, Math.max(i16 + i17, MathHelpersKt.lerp(i15, 0, f10))) + i11;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(AbstractC9719c.m19282d((i15 + (C3186Dp.m33501constructorimpl(paddingValues.mo27408calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo27409calculateRightPaddingu2uoSUM(layoutDirection)) * f11)) * f10), Constraints.m33456getMinWidthimpl(j10)));
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    public static final Modifier outlineCutout(Modifier modifier, final InterfaceC9529a interfaceC9529a, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new InterfaceC9540l() { // from class: androidx.compose.material3.OutlinedTextFieldKt.outlineCutout.1

            /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                long jM30711unboximpl = ((Size) interfaceC9529a.invoke()).m30711unboximpl();
                float fM30706getWidthimpl = Size.m30706getWidthimpl(jM30711unboximpl);
                if (fM30706getWidthimpl <= 0.0f) {
                    contentDrawScope.drawContent();
                    return;
                }
                float fMo27099toPx0680j_4 = contentDrawScope.mo27099toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo27099toPx0680j_42 = contentDrawScope.mo27099toPx0680j_4(paddingValues.mo27408calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo27099toPx0680j_4;
                float f10 = 2;
                float fM30706getWidthimpl2 = fM30706getWidthimpl + fMo27099toPx0680j_42 + (fMo27099toPx0680j_4 * f10);
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM30706getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - fM30706getWidthimpl2 : AbstractC10410o.m21751d(fMo27099toPx0680j_42, 0.0f);
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fM30706getWidthimpl2 = Size.m30706getWidthimpl(contentDrawScope.mo31429getSizeNHjbRc()) - AbstractC10410o.m21751d(fMo27099toPx0680j_42, 0.0f);
                }
                float f11 = fM30706getWidthimpl2;
                float fM30703getHeightimpl = Size.m30703getHeightimpl(jM30711unboximpl);
                float f12 = (-fM30703getHeightimpl) / f10;
                float f13 = fM30703getHeightimpl / f10;
                int iM30866getDifferencertfAjoo = ClipOp.Companion.m30866getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31353clipRectN_I0leg(fM30706getWidthimpl3, f12, f11, f13, iM30866getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f10, boolean z10, float f11, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable placeable10;
        boolean z11;
        int i12;
        int i13;
        Placeable.PlacementScope.m32293place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m33640getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i10 - TextFieldImplKt.heightOrZero(placeable9);
        int iM19282d = AbstractC9719c.m19282d(paddingValues.mo27410calculateTopPaddingD9Ej5fM() * f11);
        int iM19282d2 = AbstractC9719c.m19282d(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f11);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f11;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placeable10 = placeable6;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, AbstractC9719c.m19282d(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f10)) + iM19282d2, MathHelpersKt.lerp(z10 ? Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iM19282d, -(placeable6.getHeight() / 2), f10), 0.0f, 4, null);
        } else {
            placeable10 = placeable6;
        }
        if (placeable3 != null) {
            i13 = iM19282d;
            i12 = iHeightOrZero;
            z11 = z10;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z10, iHeightOrZero, iM19282d, placeable10, placeable3), 0.0f, 4, null);
        } else {
            z11 = z10;
            i12 = iHeightOrZero;
            i13 = iM19282d;
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, iWidthOrZero, place$calculateVerticalPosition(z11, i12, i13, placeable10, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWidthOrZero, place$calculateVerticalPosition(z11, i12, i13, placeable10, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i11 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z11, i12, i13, placeable10, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i11 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i12), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i12, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z10, int i10, int i11, Placeable placeable, Placeable placeable2) {
        if (z10) {
            i11 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i10);
        }
        return Math.max(i11, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final androidx.compose.p014ui.text.input.TextFieldValue r68, final p181hd.InterfaceC9540l r69, androidx.compose.p014ui.Modifier r70, boolean r71, boolean r72, androidx.compose.p014ui.text.TextStyle r73, p181hd.InterfaceC9544p r74, p181hd.InterfaceC9544p r75, p181hd.InterfaceC9544p r76, p181hd.InterfaceC9544p r77, p181hd.InterfaceC9544p r78, p181hd.InterfaceC9544p r79, p181hd.InterfaceC9544p r80, boolean r81, androidx.compose.p014ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.p014ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, hd.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
