package p122i6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import coil3.compose.AbstractC5177c;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p000.DashedBorderKt;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7593i;
import p122i6.AbstractC7699p0;
import p189o5.AbstractC8709e;

/* renamed from: i6.k0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7689k0 {
    /* renamed from: A */
    public static final Unit m12813A(String str, boolean z9, Function0 function0, int i10, Composer composer, int i11) {
        m12866y(str, z9, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final void m12814B(Modifier modifier, final C7670b groupState, final Function3 onClickOpenBoard, final Set failedUuidsSet, final Function1 onClickQuestionDescription, NoStemViewModel noStemViewModel, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        NoStemViewModel noStemViewModel2;
        Function3 function3;
        Composer composer2;
        final Modifier modifier3;
        final NoStemViewModel noStemViewModel3;
        int i13;
        Modifier modifier4;
        int i14;
        boolean z9;
        Intrinsics.checkNotNullParameter(groupState, "groupState");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Intrinsics.checkNotNullParameter(failedUuidsSet, "failedUuidsSet");
        Intrinsics.checkNotNullParameter(onClickQuestionDescription, "onClickQuestionDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(1970790176);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(groupState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickOpenBoard) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(failedUuidsSet) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickQuestionDescription) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                noStemViewModel2 = noStemViewModel;
                int i16 = composerStartRestartGroup.changedInstance(noStemViewModel2) ? 131072 : 65536;
                i12 |= i16;
            } else {
                noStemViewModel2 = noStemViewModel;
            }
            i12 |= i16;
        } else {
            noStemViewModel2 = noStemViewModel;
        }
        int i17 = i12;
        if (composerStartRestartGroup.shouldExecute((i17 & 74899) != 74898, i17 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 32) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) NoStemViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i17 &= -458753;
                    noStemViewModel2 = (NoStemViewModel) viewModel;
                }
                i13 = i17;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 32) != 0) {
                    i17 &= -458753;
                }
                modifier4 = modifier2;
                i13 = i17;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970790176, i13, -1, "com.zykj.evaluation.ui.guide.noStem.GroupView (NoStemQuestionViews.kt:40)");
            }
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(ClipKt.clip(modifier4, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null);
            float f11 = 5 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl((2 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f12 = 9 / f10;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17684paddingqDBjuR0 = PaddingKt.m17684paddingqDBjuR0(modifierM17190backgroundbw27NRU$default, fM23561constructorimpl3, fM23561constructorimpl, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12), fM23561constructorimpl2);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17684paddingqDBjuR0);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(companion3, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getBottom(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17735widthInVpY3zN4$default = SizeKt.m17735widthInVpY3zN4$default(companion3, 0.0f, C3127Dp.m23561constructorimpl((275 / f10) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 1, null);
            Modifier modifier6 = modifier4;
            String strM12812f = groupState.m12812f();
            long jM11577a = AbstractC7305a.m11577a();
            long jM14344k = AbstractC8709e.m14344k(8);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            Composer composer3 = composerStartRestartGroup;
            FontWeight medium = companion4.getMedium();
            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
            NoStemViewModel noStemViewModel4 = noStemViewModel2;
            int i18 = i13;
            TextKt.m19430Text4IGK_g(strM12812f, modifierM17735widthInVpY3zN4$default, jM11577a, jM14344k, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200112, 3120, 120784);
            TextKt.m19430Text4IGK_g(groupState.m12810d(), (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(7), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 3120, 120786);
            Composer composer4 = composer3;
            if (groupState.m12809c().length() > 0) {
                composer4.startReplaceGroup(-540087122);
                boolean zChangedInstance = composer4.changedInstance(groupState) | ((57344 & i18) == 16384);
                Object objRememberedValue = composer4.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: i6.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7689k0.m12818F(onClickQuestionDescription, groupState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM12480g = AbstractC7593i.m12480g(companion3, false, (Function0) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM12480g);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor3);
                } else {
                    composer4.useNode();
                }
                Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer4);
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                z9 = false;
                i14 = 6;
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.question_description, composer4, 6), (Modifier) null, AbstractC7305a.m11585i(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3456, 0, 131058);
                composer4 = composer4;
                composer4.endNode();
            } else {
                i14 = 6;
                z9 = false;
                composer4.startReplaceGroup(-542644932);
            }
            composer4.endReplaceGroup();
            composer4.endNode();
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer4, i14);
            composer4.startReplaceGroup(-680423766);
            for (final C7690l c7690l : groupState.m12811e()) {
                final NoStemViewModel noStemViewModel5 = noStemViewModel4;
                boolean zChangedInstance2 = composer4.changedInstance(noStemViewModel5) | composer4.changedInstance(c7690l);
                Object objRememberedValue2 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: i6.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7689k0.m12815C(noStemViewModel5, c7690l, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                boolean zChangedInstance3 = composer4.changedInstance(noStemViewModel5) | composer4.changedInstance(c7690l);
                Object objRememberedValue3 = composer4.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: i6.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7689k0.m12816D(noStemViewModel5, c7690l, (List) obj);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                Function1 function12 = (Function1) objRememberedValue3;
                boolean zChangedInstance4 = composer4.changedInstance(noStemViewModel5) | composer4.changedInstance(c7690l) | ((i18 & 896) == 256 ? true : z9);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: i6.d0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7689k0.m12817E(noStemViewModel5, c7690l, onClickOpenBoard, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                m12830R(null, c7690l, failedUuidsSet, function1, function12, (Function1) objRememberedValue4, composer4, (i18 >> 3) & 896, 1);
                noStemViewModel4 = noStemViewModel5;
                i18 = i18;
            }
            function3 = onClickOpenBoard;
            composer2 = composer4;
            NoStemViewModel noStemViewModel6 = noStemViewModel4;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            noStemViewModel3 = noStemViewModel6;
            modifier3 = modifier6;
        } else {
            function3 = onClickOpenBoard;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            noStemViewModel3 = noStemViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function3 function32 = function3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12819G(modifier3, groupState, function32, failedUuidsSet, onClickQuestionDescription, noStemViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: C */
    public static final Unit m12815C(NoStemViewModel noStemViewModel, C7690l c7690l, boolean z9) {
        noStemViewModel.m9830Y(c7690l.m12873f(), z9);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m12816D(NoStemViewModel noStemViewModel, C7690l c7690l, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        noStemViewModel.m9834c0(c7690l.m12876i(), it);
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m12817E(NoStemViewModel noStemViewModel, C7690l c7690l, Function3 function3, boolean z9) {
        function3.invoke(c7690l.m12876i(), noStemViewModel.m9775p().m12466l(c7690l.m12873f(), c7690l.m12876i()), Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m12818F(Function1 function1, C7670b c7670b) {
        function1.invoke(c7670b.m12809c());
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m12819G(Modifier modifier, C7670b c7670b, Function3 function3, Set set, Function1 function1, NoStemViewModel noStemViewModel, int i10, int i11, Composer composer, int i12) {
        m12814B(modifier, c7670b, function3, set, function1, noStemViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final void m12820H(final String str, final boolean z9, final Function0 function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1767258394);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1767258394, i11, -1, "com.zykj.evaluation.ui.guide.noStem.HandQuestionView (NoStemQuestionViews.kt:315)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17713defaultMinSizeVpY3zN4$default = SizeKt.m17713defaultMinSizeVpY3zN4$default(companion, 0.0f, C3127Dp.m23561constructorimpl((96 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 1, null);
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(z9 ? 4294916912L : 4292665056L);
            float f11 = 2 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            RoundedCornerShape roundedCornerShapeM17974RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM3d = DashedBorderKt.m3d(modifierM17713defaultMinSizeVpY3zN4$default, fM23561constructorimpl, jColor, roundedCornerShapeM17974RoundedCornerShape0680j_4, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierM3d, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            boolean z10 = (i11 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: i6.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC7689k0.m12821I(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17681padding3ABfNKs, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AbstractC5177c.m2945a(str, null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, false, composerStartRestartGroup, (i11 & 14) | 1573296, 0, 1976);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12822J(str, z9, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: I */
    public static final Unit m12821I(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m12822J(String str, boolean z9, Function0 function0, int i10, Composer composer, int i11) {
        m12820H(str, z9, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final void m12823K(final List list, final List list2, final Function1 function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(5659736);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5659736, i11, -1, "com.zykj.evaluation.ui.guide.noStem.MultiQuestionView (NoStemQuestionViews.kt:242)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f10 = 5 / 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            FlowLayoutKt.FlowRow(modifierFillMaxWidth$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl(f10 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1067346413, true, new Function3() { // from class: i6.v
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7689k0.m12824L(list, list2, function1, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573302, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12826N(list, list2, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: L */
    public static final Unit m12824L(List list, List list2, final Function1 function1, FlowRowScope FlowRow, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1067346413, i10, -1, "com.zykj.evaluation.ui.guide.noStem.MultiQuestionView.<anonymous> (NoStemQuestionViews.kt:248)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                boolean zContains = list2.contains(str);
                boolean zChanged = composer.changed(function1) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: i6.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7689k0.m12825M(function1, str);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m12827O(str, zContains, (Function0) objRememberedValue, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m12825M(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m12826N(List list, List list2, Function1 function1, int i10, Composer composer, int i11) {
        m12823K(list, list2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final void m12827O(final String str, final boolean z9, final Function0 function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-407107482);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-407107482, i11, -1, "com.zykj.evaluation.ui.guide.noStem.OptionView (NoStemQuestionViews.kt:261)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((41 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl((19 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            RoundedCornerShape roundedCornerShapeM17974RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((2 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            ButtonColors buttonColorsM18545buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m18545buttonColorsro_MJ88(z9 ? AbstractC7305a.m11585i() : ColorKt.Color(4293651952L), 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 14);
            float f11 = 0 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            ButtonKt.Button(function0, modifierM17730sizeVpY3zN4, false, roundedCornerShapeM17974RoundedCornerShape0680j_4, buttonColorsM18545buttonColorsro_MJ88, null, null, PaddingKt.m17674PaddingValues0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, ComposableLambdaKt.rememberComposableLambda(884839030, true, new Function3() { // from class: i6.a0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7689k0.m12828P(z9, str, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i11 >> 6) & 14) | 817889328, 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12829Q(str, z9, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: P */
    public static final Unit m12828P(boolean z9, String str, RowScope Button, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(884839030, i10, -1, "com.zykj.evaluation.ui.guide.noStem.OptionView.<anonymous> (NoStemQuestionViews.kt:269)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            TextKt.m19430Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), z9 ? Color.INSTANCE.m21013getWhite0d7_KjU() : ColorKt.Color(4284769638L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131056);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m12829Q(String str, boolean z9, Function0 function0, int i10, Composer composer, int i11) {
        m12827O(str, z9, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final void m12830R(Modifier modifier, final C7690l question, final Set failedUuidsSet, final Function1 onClickHelp, final Function1 onClickChangeAnswer, final Function1 onClickOpenBoard, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        float f10;
        int i13;
        int i14;
        boolean z9;
        int i15;
        String str;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(failedUuidsSet, "failedUuidsSet");
        Intrinsics.checkNotNullParameter(onClickHelp, "onClickHelp");
        Intrinsics.checkNotNullParameter(onClickChangeAnswer, "onClickChangeAnswer");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Composer composerStartRestartGroup = composer.startRestartGroup(-43682617);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(question) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(failedUuidsSet) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickHelp) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickChangeAnswer) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickOpenBoard) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            Modifier modifier4 = i16 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-43682617, i12, -1, "com.zykj.evaluation.ui.guide.noStem.QuestionView (NoStemQuestionViews.kt:115)");
            }
            float f11 = 600;
            float f12 = 5 / f11;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12), 7, null);
            Modifier modifier5 = modifier4;
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (question.m12870c()) {
                composerStartRestartGroup.startReplaceGroup(635287879);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                float f13 = 17 / f11;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13);
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                boolean zChangedInstance = ((i12 & 7168) == 2048) | composerStartRestartGroup.changedInstance(question);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: i6.f0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7689k0.m12831S(onClickHelp, question);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                f10 = f12;
                i14 = i12;
                z9 = true;
                i13 = 17;
                IconButtonKt.IconButton((Function0) objRememberedValue, modifierM17730sizeVpY3zN4, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1484872981, true, new Function2() { // from class: i6.g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC7689k0.m12832T(question, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196656, 28);
                composerStartRestartGroup.endReplaceGroup();
                i15 = 6;
            } else {
                f10 = f12;
                i13 = 17;
                i14 = i12;
                z9 = true;
                composerStartRestartGroup.startReplaceGroup(635810911);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                i15 = 6;
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((17 / f11) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion5, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10)), composerStartRestartGroup, i15);
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((38 / f11) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion5, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((i13 / f11) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17730sizeVpY3zN42);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            int i17 = i15;
            TextKt.m19430Text4IGK_g(question.m12875h(), BoxScopeInstance.INSTANCE.align(companion5, companion.getCenterStart()), AbstractC7305a.m11577a(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131056);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion5, C3127Dp.m23561constructorimpl((2 / f11) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, i17);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            int iM12874g = question.m12874g();
            if (iM12874g == AbstractC7699p0.e.f13059b.m12881a() || iM12874g == AbstractC7699p0.b.f13055b.m12881a()) {
                composerStartRestartGroup.startReplaceGroup(2054702520);
                List listM12872e = question.m12872e();
                List listM12871d = question.m12871d();
                boolean z10 = (i14 & 57344) == 16384 ? z9 : false;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function2() { // from class: i6.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7689k0.m12833U(onClickChangeAnswer, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                m12838Z(listM12872e, listM12871d, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (iM12874g == AbstractC7699p0.d.f13058b.m12881a()) {
                composerStartRestartGroup.startReplaceGroup(2055266379);
                List listM12872e2 = question.m12872e();
                List listM12871d2 = question.m12871d();
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(question) | ((i14 & 57344) == 16384 ? z9 : false);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: i6.i0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7689k0.m12834V(onClickChangeAnswer, question, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                m12823K(listM12872e2, listM12871d2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iM12874g == AbstractC7699p0.a.f13054b.m12881a()) {
                    composerStartRestartGroup.startReplaceGroup(2056044448);
                    String str2 = (String) CollectionsKt.firstOrNull(question.m12871d());
                    str = str2 != null ? str2 : "";
                    boolean zContains = failedUuidsSet.contains(question.m12876i());
                    boolean z11 = (i14 & 458752) == 131072 ? z9 : false;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z11 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: i6.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC7689k0.m12835W(onClickOpenBoard);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    m12866y(str, zContains, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (iM12874g == AbstractC7699p0.c.a.f13056b.m12881a()) {
                        composerStartRestartGroup.startReplaceGroup(2056408419);
                        String str3 = (String) CollectionsKt.firstOrNull(question.m12871d());
                        str = str3 != null ? str3 : "";
                        boolean zContains2 = failedUuidsSet.contains(question.m12876i());
                        boolean z12 = (i14 & 458752) == 131072 ? z9 : false;
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z12 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: i6.n
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC7689k0.m12836X(onClickOpenBoard);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        m12820H(str, zContains2, (Function0) objRememberedValue5, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(2049368412);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12837Y(modifier3, question, failedUuidsSet, onClickHelp, onClickChangeAnswer, onClickOpenBoard, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: S */
    public static final Unit m12831S(Function1 function1, C7690l c7690l) {
        function1.invoke(Boolean.valueOf(!c7690l.m12877j()));
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public static final Unit m12832T(C7690l c7690l, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1484872981, i10, -1, "com.zykj.evaluation.ui.guide.noStem.QuestionView.<anonymous>.<anonymous> (NoStemQuestionViews.kt:127)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(c7690l.m12877j() ? R.drawable.icon_ask_for_help_h : R.drawable.icon_ask_for_help, composer, 0), (String) null, SizeKt.m17728size3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((11 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m12833U(Function1 function1, String option, boolean z9) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (z9) {
            function1.invoke(CollectionsKt.emptyList());
        } else {
            function1.invoke(CollectionsKt.listOf(option));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m12834V(Function1 function1, C7690l c7690l, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c7690l.m12871d());
        if (arrayList.contains(it)) {
            arrayList.remove(it);
        } else {
            arrayList.add(it);
        }
        CollectionsKt.sort(arrayList);
        function1.invoke(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m12835W(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m12836X(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m12837Y(Modifier modifier, C7690l c7690l, Set set, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        m12830R(modifier, c7690l, set, function1, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final void m12838Z(final List list, final List list2, final Function2 function2, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1821576020);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821576020, i11, -1, "com.zykj.evaluation.ui.guide.noStem.SingleQuestionView (NoStemQuestionViews.kt:218)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f10 = 5 / 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f10));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            FlowLayoutKt.FlowRow(modifierFillMaxWidth$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl(f10 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-725028271, true, new Function3() { // from class: i6.p
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7689k0.m12840a0(list, list2, function2, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573302, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12844c0(list, list2, function2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: a0 */
    public static final Unit m12840a0(List list, List list2, final Function2 function2, FlowRowScope FlowRow, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-725028271, i10, -1, "com.zykj.evaluation.ui.guide.noStem.SingleQuestionView.<anonymous> (NoStemQuestionViews.kt:224)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                final boolean zContains = list2.contains(str);
                boolean zChanged = composer.changed(function2) | composer.changed(str) | composer.changed(zContains);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: i6.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7689k0.m12842b0(function2, str, zContains);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m12827O(str, zContains, (Function0) objRememberedValue, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m12842b0(Function2 function2, String str, boolean z9) {
        function2.invoke(str, Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m12844c0(List list, List list2, Function2 function2, int i10, Composer composer, int i11) {
        m12838Z(list, list2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final void m12866y(final String str, final boolean z9, final Function0 function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-731828625);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731828625, i11, -1, "com.zykj.evaluation.ui.guide.noStem.BlankQuestionView (NoStemQuestionViews.kt:285)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((38 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(z9 ? 4294916912L : 4292665056L);
            float f11 = 2 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            RoundedCornerShape roundedCornerShapeM17974RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM3d = DashedBorderKt.m3d(modifierM17714height3ABfNKs, fM23561constructorimpl, jColor, roundedCornerShapeM17974RoundedCornerShape0680j_4, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierM3d, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            boolean z10 = (i11 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: i6.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC7689k0.m12867z(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17681padding3ABfNKs, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AbstractC5177c.m2945a(str, null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, composerStartRestartGroup, (i11 & 14) | 1573296, 0, 1976);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i6.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7689k0.m12813A(str, z9, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: z */
    public static final Unit m12867z(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
