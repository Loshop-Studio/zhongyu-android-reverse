package p089f6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
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
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.constant.FragmentTag;
import com.zykj.evaluation.p057ui.board.SketchDraftFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p159l8.C8523h;
import p189o5.AbstractC8709e;

/* renamed from: f6.u */
/* loaded from: classes4.dex */
public abstract class AbstractC7481u {

    /* renamed from: f6.u$a */
    public static final class a implements Function0 {

        /* renamed from: a */
        public static final a f12272a = new a();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: f6.u$b */
    public static final class b implements Function0 {

        /* renamed from: a */
        public static final b f12273a = new b();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: k */
    public static final void m12077k(Modifier modifier, final boolean z9, final boolean z10, final String path, final String str, final C7459j draftFunctions, final long j10, final Function1 isTouchingChangeCallback, final String str2, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        String str3;
        Modifier modifier4;
        boolean z11;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(draftFunctions, "draftFunctions");
        Intrinsics.checkNotNullParameter(isTouchingChangeCallback, "isTouchingChangeCallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(146446971);
        int i13 = i11 & 1;
        if (i13 != 0) {
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
            i12 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(path) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(draftFunctions) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(isTouchingChangeCallback) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.changed(str2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 38347923) != 38347922, i12 & 1)) {
            if (i13 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(146446971, i12, -1, "com.zykj.evaluation.ui.detail.widget.DraftSketchView (DraftSketchView.kt:59)");
            }
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-884717247);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f10 = 600;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((135 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                float f11 = 73 / f10;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.pic_loading, composerStartRestartGroup, 6), (String) null, SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                composer2 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.web_view_content_loading, composer2, 6), (Modifier) null, ColorKt.Color(4284769638L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131058);
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
                modifier4 = modifier2;
            } else {
                if (str2 == null || str2.length() == 0) {
                    str3 = str;
                    if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "showAnalysis=true", false, 2, (Object) null)) {
                        composerStartRestartGroup.startReplaceGroup(-883969465);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = a.f12272a;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        draftFunctions.m12063o((Function0) objRememberedValue);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: f6.p
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(AbstractC7481u.m12086t());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        draftFunctions.m12061m((Function0) objRememberedValue2);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion4.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: f6.q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(AbstractC7481u.m12087u());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        draftFunctions.m12062n((Function0) objRememberedValue3);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion4.getEmpty()) {
                            objRememberedValue4 = b.f12273a;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        draftFunctions.m12060l((Function0) objRememberedValue4);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                        Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierAlign2 = boxScopeInstance2.align(companion7, companion5.getCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign2);
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composerStartRestartGroup);
                        Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        float f12 = 600;
                        DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((141 / f12) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                        float f13 = 76 / f12;
                        DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.pic_no_stem, composerStartRestartGroup, 6), (String) null, SizeKt.m17730sizeVpY3zN4(companion7, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                        TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.web_viw_content_empty_until_showTime, composerStartRestartGroup, 6), (Modifier) null, ColorKt.Color(4284769638L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        modifier4 = modifier2;
                        composer2 = composerStartRestartGroup;
                    }
                } else {
                    str3 = str;
                }
                composerStartRestartGroup.startReplaceGroup(-883075890);
                int i14 = i12 & 3670016;
                int i15 = i12 & 7168;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(draftFunctions) | (i14 == 1048576) | (i15 == 2048) | ((29360128 & i12) == 8388608);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    z11 = false;
                    Function1 function1 = new Function1() { // from class: f6.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7481u.m12078l(draftFunctions, isTouchingChangeCallback, j10, path, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue5 = function1;
                } else {
                    z11 = false;
                }
                Function1 function12 = (Function1) objRememberedValue5;
                boolean z12 = (i15 == 2048 ? true : z11) | ((i12 & 896) == 256 ? true : z11) | (i14 == 1048576 ? true : z11) | ((57344 & i12) == 16384 ? true : z11) | ((i12 & 112) != 32 ? z11 : true);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final String str4 = str3;
                    Function1 function13 = new Function1() { // from class: f6.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC7481u.m12084r(path, z10, j10, str4, z9, (View) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function13);
                    objRememberedValue6 = function13;
                }
                modifier4 = modifier2;
                AndroidView_androidKt.AndroidView(function12, modifier4, (Function1) objRememberedValue6, composerStartRestartGroup, (i12 << 3) & 112, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: f6.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7481u.m12085s(modifier3, z9, z10, path, str, draftFunctions, j10, isTouchingChangeCallback, str2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, com.zykj.evaluation.ui.board.SketchDraftFragment] */
    /* JADX WARN: Type inference failed for: r8v7, types: [T, androidx.fragment.app.Fragment, com.zykj.evaluation.ui.board.SketchDraftFragment] */
    /* renamed from: l */
    public static final View m12078l(C7459j c7459j, Function1 function1, final long j10, final String str, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context baseContext = ((C8523h) context).getBaseContext();
        Intrinsics.checkNotNull(baseContext, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((AppCompatActivity) baseContext).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r82 = (SketchDraftFragment) supportFragmentManager.findFragmentByTag(FragmentTag.SketchDraftFragmentTag);
        objectRef.element = r82;
        if (r82 != 0) {
            fragmentTransactionBeginTransaction.remove((Fragment) r82);
        }
        ?? sketchDraftFragment = new SketchDraftFragment();
        fragmentTransactionBeginTransaction.add((Fragment) sketchDraftFragment, FragmentTag.SketchDraftFragmentTag).commitNowAllowingStateLoss();
        objectRef.element = sketchDraftFragment;
        c7459j.m12063o(new Function0() { // from class: f6.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC7481u.m12079m(objectRef);
            }
        });
        c7459j.m12061m(new Function0() { // from class: f6.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC7481u.m12080n(objectRef));
            }
        });
        c7459j.m12062n(new Function0() { // from class: f6.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC7481u.m12081o(objectRef));
            }
        });
        c7459j.m12060l(new Function0() { // from class: f6.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC7481u.m12082p(objectRef);
            }
        });
        c7459j.m12064p(new Function0() { // from class: f6.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC7481u.m12083q(objectRef, j10, str);
            }
        });
        ((SketchDraftFragment) objectRef.element).m9175v0(function1);
        return ((SketchDraftFragment) objectRef.element).requireView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final Bitmap m12079m(Ref.ObjectRef objectRef) {
        return SketchDraftFragment.m9110N((SketchDraftFragment) objectRef.element, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final boolean m12080n(Ref.ObjectRef objectRef) {
        return ((SketchDraftFragment) objectRef.element).getIsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final boolean m12081o(Ref.ObjectRef objectRef) {
        return ((SketchDraftFragment) objectRef.element).m9165i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final Bitmap m12082p(Ref.ObjectRef objectRef) {
        return ((SketchDraftFragment) objectRef.element).m9157H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final Unit m12083q(Ref.ObjectRef objectRef, long j10, String str) throws Throwable {
        ((SketchDraftFragment) objectRef.element).m9169p0(j10, str);
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m12084r(String str, boolean z9, long j10, String str2, boolean z10, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(FragmentTag.SketchDraftFragmentTag);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.zykj.evaluation.ui.board.SketchDraftFragment");
        SketchDraftFragment sketchDraftFragment = (SketchDraftFragment) fragmentFindFragmentByTag;
        sketchDraftFragment.m9168o0();
        sketchDraftFragment.m9177y0();
        sketchDraftFragment.m9172s0(str);
        sketchDraftFragment.m9173t0(z9);
        sketchDraftFragment.m9174u0(j10);
        sketchDraftFragment.m9166j0(str2, z10);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m12085s(Modifier modifier, boolean z9, boolean z10, String str, String str2, C7459j c7459j, long j10, Function1 function1, String str3, int i10, int i11, Composer composer, int i12) {
        m12077k(modifier, z9, z10, str, str2, c7459j, j10, function1, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final boolean m12086t() {
        return false;
    }

    /* renamed from: u */
    public static final boolean m12087u() {
        return true;
    }
}
