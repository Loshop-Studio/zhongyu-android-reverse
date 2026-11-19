package com.zykj.mistake.feature.home;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.home.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4729b {
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4101a(com.zykj.mistake.feature.home.HomeTab r28, boolean r29, p152r6.InterfaceC6471c r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.home.AbstractC4729b.m4101a(com.zykj.mistake.feature.home.HomeTab, boolean, r6.c, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/home/b.smali:7
    }

    /* renamed from: b */
    public static final void m4102b(final int i, final String str, final boolean z8, final boolean z9, final InterfaceC6469a interfaceC6469a, final Modifier modifier, Composer composer, final int i8) {
        int i9;
        boolean z10;
        InterfaceC6469a interfaceC6469a2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(134622924);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            z10 = z9;
            i9 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        } else {
            z10 = z9;
        }
        if ((i8 & 24576) == 0) {
            interfaceC6469a2 = interfaceC6469a;
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 16384 : 8192;
        } else {
            interfaceC6469a2 = interfaceC6469a;
        }
        if ((196608 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i9) != 74898, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(134622924, i9, -1, "com.zykj.mistake.feature.home.MainHomeTabItem (HomeBottomBar.kt:94)");
            }
            long jColor = ColorKt.Color(z8 ? 4279596799L : 4279572250L);
            Modifier modifierM6790clickableXHw0xAI$default = ClickableKt.m6790clickableXHw0xAI$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), z10, null, null, interfaceC6469a2, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM6790clickableXHw0xAI$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i9 & 14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ImageKt.Image(painterPainterResource, str, SizeKt.m7309size3ABfNKs(PaddingKt.m7266paddingqDBjuR0$default(companion2, 0.0f, C2331Dp.m13305constructorimpl(5), 0.0f, 0.0f, 13, null), C2331Dp.m13305constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, (i9 & 112) | 384, MenuKt.InTransitionDuration);
            composer2 = composerStartRestartGroup;
            long sp = TextUnitKt.getSp(10);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            TextKt.m9105Text4IGK_g(str, PaddingKt.m7266paddingqDBjuR0$default(companion2, 0.0f, C2331Dp.m13305constructorimpl(3), 0.0f, 0.0f, 13, null), jColor, sp, (FontStyle) null, z8 ? companion3.getBold() : companion3.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, ((i9 >> 3) & 14) | 3120, 0, 131024);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: com.zykj.mistake.feature.home.a
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4729b.m4102b(i, str, z8, z9, interfaceC6469a, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                    return C5443s.f8405a;
                }
            });
        }
    }
}
