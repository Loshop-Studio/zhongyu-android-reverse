package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.semantics.LiveRegionMode;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateRangePickerHeadline-0YIUgSQ, reason: not valid java name */
    public final void m22026DateRangePickerHeadline0YIUgSQ(Long l10, final Long l11, final int i10, final DatePickerFormatter datePickerFormatter, final Modifier modifier, final String str, final String str2, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, final InterfaceC10574p interfaceC10574p3, Composer composer, final int i11, final int i12) {
        int i13;
        Composer composer2;
        Long l12;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-820363420);
        if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.changed(l10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(l11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(interfaceC10574p3) ? 536870912 : 268435456;
        }
        if ((306783379 & i13) == 306783378 && (i12 & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            l12 = l10;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-820363420, i13, i12, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:419)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            int i14 = i13;
            composer2 = composerStartRestartGroup;
            String date$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l10, localeDefaultLocale, false, 4, null);
            l12 = l10;
            String date$default2 = DatePickerFormatter.formatDate$default(datePickerFormatter, l11, localeDefaultLocale, false, 4, null);
            String date = datePickerFormatter.formatDate(l12, localeDefaultLocale, true);
            composer2.startReplaceGroup(1063158288);
            String strM22987getString2EP1pXo = "";
            if (date == null) {
                DisplayMode.Companion companion = DisplayMode.Companion;
                str3 = date$default2;
                if (DisplayMode.m22053equalsimpl0(i10, companion.m22058getPickerjFl4v0())) {
                    composer2.startReplaceGroup(1063166242);
                    Strings.Companion companion2 = Strings.Companion;
                    String strM22987getString2EP1pXo2 = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_picker_no_selection_description), composer2, 0);
                    composer2.endReplaceGroup();
                    date = strM22987getString2EP1pXo2;
                } else if (DisplayMode.m22053equalsimpl0(i10, companion.m22057getInputjFl4v0())) {
                    composer2.startReplaceGroup(1063169213);
                    Strings.Companion companion3 = Strings.Companion;
                    date = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_no_input_description), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1401419729);
                    composer2.endReplaceGroup();
                    date = "";
                }
            } else {
                str3 = date$default2;
            }
            composer2.endReplaceGroup();
            String date2 = datePickerFormatter.formatDate(l11, localeDefaultLocale, true);
            composer2.startReplaceGroup(1063174382);
            if (date2 == null) {
                DisplayMode.Companion companion4 = DisplayMode.Companion;
                if (DisplayMode.m22053equalsimpl0(i10, companion4.m22058getPickerjFl4v0())) {
                    composer2.startReplaceGroup(1063182274);
                    Strings.Companion companion5 = Strings.Companion;
                    strM22987getString2EP1pXo = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_picker_no_selection_description), composer2, 0);
                    composer2.endReplaceGroup();
                } else if (DisplayMode.m22053equalsimpl0(i10, companion4.m22057getInputjFl4v0())) {
                    composer2.startReplaceGroup(1063185245);
                    Strings.Companion companion6 = Strings.Companion;
                    strM22987getString2EP1pXo = Strings_androidKt.m22987getString2EP1pXo(Strings.m22917constructorimpl(C2266R.string.m3c_date_input_no_input_description), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1400922737);
                    composer2.endReplaceGroup();
                }
            } else {
                strM22987getString2EP1pXo = date2;
            }
            composer2.endReplaceGroup();
            final String str4 = str + ": " + date;
            final String str5 = str2 + ": " + strM22987getString2EP1pXo;
            boolean zChanged = composer2.changed(str4) | composer2.changed(str5);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC10570l() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m26144setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m26118getPolite0phEisY());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4 + ", " + str5);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (InterfaceC10570l) objRememberedValue);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m20737spacedBy0680j_4(C3156Dp.m26899constructorimpl(4)), Alignment.Companion.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierClearAndSetSemantics);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            InterfaceC10559a constructor = companion7.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer2);
            Updater.m23710setimpl(composerM23703constructorimpl, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
            Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
            InterfaceC10574p setCompositeKeyHash = companion7.getSetCompositeKeyHash();
            if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (date$default != null) {
                composer2.startReplaceGroup(303536053);
                TextKt.m22699Text4IGK_g(date$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(303604222);
                interfaceC10574p.invoke(composer2, Integer.valueOf((i14 >> 21) & 14));
                composer2.endReplaceGroup();
            }
            interfaceC10574p3.invoke(composer2, Integer.valueOf((i14 >> 27) & 14));
            if (str3 != null) {
                composer2.startReplaceGroup(303729431);
                TextKt.m22699Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC10570l) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(303795616);
                interfaceC10574p2.invoke(composer2, Integer.valueOf((i14 >> 24) & 14));
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Long l13 = l12;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i15) {
                    this.$tmp7_rcvr.m22026DateRangePickerHeadline0YIUgSQ(l13, l11, i10, datePickerFormatter, modifier, str, str2, interfaceC10574p, interfaceC10574p2, interfaceC10574p3, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DateRangePickerHeadline-v84Udv0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22028DateRangePickerHeadlinev84Udv0(final java.lang.Long r18, final java.lang.Long r19, final int r20, final androidx.compose.material3.DatePickerFormatter r21, androidx.compose.p013ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.m22028DateRangePickerHeadlinev84Udv0(java.lang.Long, java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DateRangePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22029DateRangePickerTitlehOD91z4(final int r29, androidx.compose.p013ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.m22029DateRangePickerTitlehOD91z4(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
