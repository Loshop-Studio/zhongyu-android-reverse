package p070h3;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.res.StringResources_androidKt;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.style.TextAlign;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavController;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.R$string;
import com.zykj.gallery.p034ui.gallery.detail.DetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p091k3.AbstractC6655m0;
import p114n3.AbstractC7460a;
import p121o3.AbstractC7518a;

/* renamed from: h3.v */
/* loaded from: classes4.dex */
public abstract class AbstractC6479v {
    /* renamed from: A */
    public static final void m7114A(MutableIntState mutableIntState, int i6) {
        mutableIntState.setIntValue(i6);
    }

    /* renamed from: B */
    public static final void m7115B(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* renamed from: C */
    public static final Unit m7116C(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m7117D(MutableState mutableState) {
        m7134U(mutableState, true);
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m7118E(MutableState mutableState) {
        m7132S(mutableState, true);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m7119F(MutableState mutableState) {
        m7115B(mutableState, true);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m7120G(MutableIntState mutableIntState) {
        m7114A(mutableIntState, m7167z(mutableIntState) + 1);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m7121H(MutableState mutableState) {
        m7166y(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m7122I(MutableState mutableState) {
        m7166y(mutableState, true);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m7123J(MutableState mutableState) {
        m7115B(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m7124K(MutableState mutableState) {
        m7115B(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m7125L(MutableState mutableState) {
        m7132S(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m7126M(Function3 function3, C6461d0 c6461d0, AbstractC6459c0 abstractC6459c0, NavController navController, MutableState mutableState) {
        m7132S(mutableState, false);
        if (function3 != null) {
            function3.invoke(Long.valueOf(c6461d0.m7110b()), abstractC6459c0, c6461d0.m7113e());
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m7127N(MutableState mutableState) {
        m7134U(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static final boolean m7128O(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: P */
    public static final Unit m7129P(MutableState mutableState) {
        m7134U(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m7130Q(Function1 function1, C6461d0 c6461d0, NavController navController, MutableState mutableState) {
        m7134U(mutableState, false);
        if (function1 != null) {
            function1.invoke(Long.valueOf(c6461d0.m7110b()));
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final Unit m7131R(NavController navController, C6461d0 c6461d0, AbstractC6459c0 abstractC6459c0, Function3 function3, Function1 function1, DetailViewModel detailViewModel, int i6, int i7, Composer composer, int i8) {
        m7163v(navController, c6461d0, abstractC6459c0, function3, function1, detailViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final void m7132S(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public static final boolean m7133T(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: U */
    public static final void m7134U(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* renamed from: V */
    public static final void m7135V(final String title, final boolean z6, final AbstractC6459c0 mode, final Function0 onBackClick, Function0 onRecoverClick, Function0 onDeleteClick, Function0 onDetailClick, Function0 function0, Composer composer, final int i6, final int i7) {
        int i8;
        final Function0 function02;
        final Function0 function03;
        Composer composer2;
        final Function0 function04;
        final Function0 function05;
        Modifier.Companion companion;
        int i9;
        Function0 function06;
        boolean z7;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onRecoverClick, "onRecoverClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onDetailClick, "onDetailClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1371956961);
        if ((i6 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(mode) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onRecoverClick) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onDeleteClick) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onDetailClick) ? 1048576 : 524288;
        }
        int i10 = i7 & 128;
        if (i10 != 0) {
            i8 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
            Function0 function07 = i10 != 0 ? null : function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1371956961, i8, -1, "com.zykj.gallery.ui.gallery.detail.TitleBar (DetailPage.kt:160)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierFillMaxWidth$default, C2452Dp.m16484constructorimpl((48 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10637height3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            boolean z8 = (i8 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: h3.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6479v.m7136W(onBackClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM10147clickableXHw0xAI$default = ClickableKt.m10147clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10147clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM13341constructorimpl2 = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            AbstractC6655m0.m7661r(R$drawable.gallery_icon_back, composerStartRestartGroup, 0, 0);
            if (mode.m7108e()) {
                composerStartRestartGroup.startReplaceGroup(642884333);
                long jM8673a = AbstractC7518a.m8673a(20);
                long jM8505b = AbstractC7460a.m8505b();
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                z7 = true;
                i9 = i8;
                companion = companion2;
                function06 = function07;
                TextKt.m12353Text4IGK_g(title, PaddingKt.m10606paddingVpY3zN4$default(companion2, C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null), jM8505b, jM8673a, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 3504, 0, 131056);
                composer2 = composerStartRestartGroup;
            } else {
                companion = companion2;
                composer2 = composerStartRestartGroup;
                i9 = i8;
                function06 = function07;
                z7 = true;
                composer2.startReplaceGroup(637077785);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM13341constructorimpl3 = Updater.m13341constructorimpl(composer2);
            Updater.m13348setimpl(composerM13341constructorimpl3, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM13341constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM13341constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m13348setimpl(composerM13341constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            if (z6) {
                composer2.startReplaceGroup(-1698669659);
                long jM8506c = AbstractC7460a.m8506c();
                String strStringResource = StringResources_androidKt.stringResource(R$string.reload, composer2, 0);
                boolean z9 = (i9 & 29360128) == 8388608 ? z7 : false;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function05 = function06;
                    objRememberedValue2 = new Function0() { // from class: h3.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6479v.m7137X(function05);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    function05 = function06;
                }
                AbstractC6655m0.m7652i(jM8506c, strStringResource, (Function0) objRememberedValue2, composer2, 6, 0);
            } else {
                function05 = function06;
                composer2.startReplaceGroup(-1704831870);
            }
            composer2.endReplaceGroup();
            if (mode.m7107d()) {
                composer2.startReplaceGroup(-1698382320);
                long jM8506c2 = AbstractC7460a.m8506c();
                String strStringResource2 = StringResources_androidKt.stringResource(R$string.receiver, composer2, 0);
                boolean z10 = (i9 & 57344) == 16384 ? z7 : false;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (z10 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    function02 = onRecoverClick;
                    objRememberedValue3 = new Function0() { // from class: h3.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6479v.m7138Y(function02);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    function02 = onRecoverClick;
                }
                AbstractC6655m0.m7652i(jM8506c2, strStringResource2, (Function0) objRememberedValue3, composer2, 6, 0);
            } else {
                function02 = onRecoverClick;
                composer2.startReplaceGroup(-1704831870);
            }
            composer2.endReplaceGroup();
            if (mode.m7106c()) {
                composer2.startReplaceGroup(-1698106637);
                long jM8506c3 = AbstractC7460a.m8506c();
                String strStringResource3 = StringResources_androidKt.stringResource(R$string.detail, composer2, 0);
                boolean z11 = (i9 & 3670016) == 1048576 ? z7 : false;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (z11 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    function04 = onDetailClick;
                    objRememberedValue4 = new Function0() { // from class: h3.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6479v.m7139Z(function04);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    function04 = onDetailClick;
                }
                AbstractC6655m0.m7652i(jM8506c3, strStringResource3, (Function0) objRememberedValue4, composer2, 6, 0);
            } else {
                function04 = onDetailClick;
                composer2.startReplaceGroup(-1704831870);
            }
            composer2.endReplaceGroup();
            if (mode.m7105b()) {
                composer2.startReplaceGroup(-1697832845);
                long jM8506c4 = AbstractC7460a.m8506c();
                String strStringResource4 = StringResources_androidKt.stringResource(R$string.delete, composer2, 0);
                boolean z12 = (i9 & 458752) == 131072 ? z7 : false;
                Object objRememberedValue5 = composer2.rememberedValue();
                if (z12 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    function03 = onDeleteClick;
                    objRememberedValue5 = new Function0() { // from class: h3.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6479v.m7141a0(function03);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                } else {
                    function03 = onDeleteClick;
                }
                AbstractC6655m0.m7652i(jM8506c4, strStringResource4, (Function0) objRememberedValue5, composer2, 6, 0);
            } else {
                function03 = onDeleteClick;
                composer2.startReplaceGroup(-1704831870);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function02 = onRecoverClick;
            function03 = onDeleteClick;
            composer2 = composerStartRestartGroup;
            function04 = onDetailClick;
            composer2.skipToGroupEnd();
            function05 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function08 = function02;
            final Function0 function09 = function04;
            final Function0 function010 = function03;
            final Function0 function011 = function05;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: h3.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6479v.m7143b0(title, z6, mode, onBackClick, function08, function010, function09, function011, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: W */
    public static final Unit m7136W(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m7137X(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m7138Y(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final Unit m7139Z(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final Unit m7141a0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m7143b0(String str, boolean z6, AbstractC6459c0 abstractC6459c0, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i6, int i7, Composer composer, int i8) {
        m7135V(str, z6, abstractC6459c0, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7163v(final androidx.navigation.NavController r39, p070h3.C6461d0 r40, final p070h3.AbstractC6459c0 r41, kotlin.jvm.functions.Function3 r42, kotlin.jvm.functions.Function1 r43, com.zykj.gallery.p034ui.gallery.detail.DetailViewModel r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070h3.AbstractC6479v.m7163v(androidx.navigation.NavController, h3.d0, h3.c0, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function1, com.zykj.gallery.ui.gallery.detail.DetailViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final boolean m7164w(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public static final boolean m7165x(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: y */
    public static final void m7166y(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* renamed from: z */
    public static final int m7167z(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }
}
