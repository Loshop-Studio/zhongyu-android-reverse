package p150r4;

import android.content.res.Resources;
import android.view.compose.C2756g;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.mistake.R;
import com.zykj.mistake.main.RemoveDialogTarget;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: r4.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6463c {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6125a(final java.lang.String r34, final long r35, final long r37, final p152r6.InterfaceC6469a r39, androidx.compose.p011ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p150r4.AbstractC6463c.m6125a(java.lang.String, long, long, r6.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: b */
    public static final void m6126b(final RemoveDialogTarget target, final InterfaceC6469a onDismiss, final InterfaceC6469a onConfirm, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(onDismiss, "onDismiss");
        AbstractC5830k.m5330g(onConfirm, "onConfirm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1812397919);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(target.ordinal()) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onConfirm) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1812397919, i8, -1, "com.zykj.mistake.main.dialog.MainRemoveMistakeDialog (MainRemoveMistakeDialog.kt:33)");
            }
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1520290712, true, new InterfaceC6473e() { // from class: r4.a
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    String strStringResource;
                    int i9;
                    String strStringResource2;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1520290712, iIntValue, -1, "com.zykj.mistake.main.dialog.MainRemoveMistakeDialog.<anonymous> (MainRemoveMistakeDialog.kt:35)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM7314width3ABfNKs = SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(320));
                        Color.Companion companion2 = Color.INSTANCE;
                        float f = 8;
                        Modifier modifierM7263paddingVpY3zN4 = PaddingKt.m7263paddingVpY3zN4(AbstractC1923c.m1042f(f, modifierM7314width3ABfNKs, companion2.m10719getWhite0d7_KjU()), C2331Dp.m13305constructorimpl(26), C2331Dp.m13305constructorimpl(28));
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM7263paddingVpY3zN4);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion4, composerM10109constructorimpl, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                        InterfaceC6469a constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                        if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.ic_warning, composer2, 0), (String) null, SizeKt.m7309size3ABfNKs(companion, C2331Dp.m13305constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, MenuKt.InTransitionDuration);
                        RemoveDialogTarget removeDialogTarget = RemoveDialogTarget.COLLECTION;
                        RemoveDialogTarget removeDialogTarget2 = target;
                        if (removeDialogTarget2 == removeDialogTarget) {
                            composer2.startReplaceGroup(-897716722);
                            composer2.endReplaceGroup();
                            strStringResource = "删除错题集";
                        } else {
                            composer2.startReplaceGroup(414872469);
                            strStringResource = StringResources_androidKt.stringResource(R.string.remove_mistake, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        TextKt.m9105Text4IGK_g(strStringResource, PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4279572250L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3504, 0, 131056);
                        composer2.endNode();
                        if (removeDialogTarget2 == removeDialogTarget) {
                            composer2.startReplaceGroup(-952112117);
                            composer2.endReplaceGroup();
                            strStringResource2 = "即将删除错题集，删除后无法恢复";
                            i9 = 0;
                        } else {
                            composer2.startReplaceGroup(-643650851);
                            i9 = 0;
                            strStringResource2 = StringResources_androidKt.stringResource(R.string.remove_mistake_tip, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        int i10 = i9;
                        TextKt.m9105Text4IGK_g(strStringResource2, PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(12), 0.0f, 0.0f, 13, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13182boximpl(TextAlign.INSTANCE.m13189getCentere0LSkKk()), 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer2, 3504, 0, 130544);
                        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                        float f7 = 24;
                        Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(companion, 0.0f, C2331Dp.m13305constructorimpl(f7), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, companion3.getTop(), composer2, 6);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i10);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM7266paddingqDBjuR0$default);
                        InterfaceC6469a constructor3 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl3, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                        if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        AbstractC6463c.m6125a(StringResources_androidKt.stringResource(R.string.cancel, composer2, i10), ColorKt.Color(4292668158L), ColorKt.Color(4279596799L), onDismiss, null, composer2, 432, 16);
                        AbstractC6463c.m6125a(StringResources_androidKt.stringResource(R.string.confirm, composer2, i10), ColorKt.Color(4279596799L), companion2.m10719getWhite0d7_KjU(), onConfirm, PaddingKt.m7266paddingqDBjuR0$default(companion, C2331Dp.m13305constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), composer2, 25008, 0);
                        if (AbstractC0584a.m899D(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i8 >> 3) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 17, target, onDismiss, onConfirm));
        }
    }
}
