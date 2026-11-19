package com.zykj.gallery.p034ui.share.page;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.Shadow;
import androidx.compose.p009ui.graphics.drawscope.DrawStyle;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.res.PainterResources_androidKt;
import androidx.compose.p009ui.text.PlatformTextStyle;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontSynthesis;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.intl.LocaleList;
import androidx.compose.p009ui.text.style.BaselineShift;
import androidx.compose.p009ui.text.style.LineHeightStyle;
import androidx.compose.p009ui.text.style.TextAlign;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.p009ui.text.style.TextGeometricTransform;
import androidx.compose.p009ui.text.style.TextIndent;
import androidx.compose.p009ui.text.style.TextMotion;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.dylanc.longan.ActivityKt;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.share.ShareActivity;
import com.zykj.gallery.p034ui.share.page.AbstractC6038c;
import com.zykj.gallery.p034ui.share.page.InterfaceC6036a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p070h3.AbstractC6457b0;
import p070h3.AbstractC6459c0;
import p070h3.C6461d0;
import p084j3.AbstractC6586b;
import p091k3.AbstractC6655m0;
import p114n3.AbstractC7460a;
import p121o3.AbstractC7518a;

/* renamed from: com.zykj.gallery.ui.share.page.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6038c {
    /* renamed from: A */
    public static final Object m5159A(LazyPagingItems lazyPagingItems, int i6) {
        InterfaceC6036a interfaceC6036a = (InterfaceC6036a) lazyPagingItems.get(i6);
        if (interfaceC6036a instanceof InterfaceC6036a.a) {
            return "camera_entry_key";
        }
        if (interfaceC6036a instanceof InterfaceC6036a.b) {
            return Long.valueOf(((InterfaceC6036a.b) interfaceC6036a).m5157a().getId());
        }
        if (interfaceC6036a != null) {
            throw new NoWhenBranchMatchedException();
        }
        return "placeholder_key_" + i6;
    }

    /* renamed from: B */
    public static final Unit m5160B(LazyPagingItems lazyPagingItems, Function0 function0, final Function1 function1, final Function1 function12, LazyGridItemScope items, int i6, Composer composer, int i7) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i7 & 48) == 0) {
            i7 |= composer.changed(i6) ? 32 : 16;
        }
        if (composer.shouldExecute((i7 & 145) != 144, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306537823, i7, -1, "com.zykj.gallery.ui.share.page.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharePage.kt:160)");
            }
            InterfaceC6036a interfaceC6036a = (InterfaceC6036a) lazyPagingItems.get(i6);
            if (interfaceC6036a instanceof InterfaceC6036a.a) {
                composer.startReplaceGroup(-2074490756);
                m5195t(function0, composer, 0);
                composer.endReplaceGroup();
            } else if (interfaceC6036a instanceof InterfaceC6036a.b) {
                composer.startReplaceGroup(-2074293937);
                final GalleryImgBean galleryImgBeanM5157a = ((InterfaceC6036a.b) interfaceC6036a).m5157a();
                String picture = galleryImgBeanM5157a.getPicture();
                boolean zChanged = composer.changed(function1) | composer.changed(galleryImgBeanM5157a);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: m3.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6038c.m5161C(function1, galleryImgBeanM5157a);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                boolean zChanged2 = composer.changed(function12) | composer.changed(galleryImgBeanM5157a);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: m3.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6038c.m5162D(function12, galleryImgBeanM5157a);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                m5164F(picture, function02, (Function0) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (interfaceC6036a != null) {
                    composer.startReplaceGroup(-1452395459);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2073717244);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                BoxKt.Box(SizeKt.m10651size3ABfNKs(Modifier.INSTANCE, C2452Dp.m16484constructorimpl((163 / 1280) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m5161C(Function1 function1, GalleryImgBean galleryImgBean) {
        function1.invoke(AbstractC6457b0.m7100c(galleryImgBean));
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m5162D(Function1 function1, GalleryImgBean galleryImgBean) {
        function1.invoke(galleryImgBean.getPicture());
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m5163E(LazyPagingItems lazyPagingItems, Function1 function1, Function1 function12, Function0 function0, int i6, Composer composer, int i7) {
        m5198w(lazyPagingItems, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final void m5164F(final String url, final Function0 onFullScreenClick, final Function0 onImageClick, Composer composer, final int i6) {
        int i7;
        Composer composer2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onFullScreenClick, "onFullScreenClick");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1243804028);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onFullScreenClick) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onImageClick) ? 256 : 128;
        }
        int i8 = i7;
        if (composerStartRestartGroup.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1243804028, i8, -1, "com.zykj.gallery.ui.share.page.GalleryItemView (SharePage.kt:224)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((163 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 1.0f, false, 2, null);
            boolean z6 = (i8 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m3.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5165G(onImageClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM10155combinedClickablef5TDLPQ$default = ClickableKt.m10155combinedClickablef5TDLPQ$default(modifierAspectRatio$default, false, null, null, null, null, null, false, (Function0) objRememberedValue, 127, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10155combinedClickablef5TDLPQ$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterM7102e = AbstractC6457b0.m7102e(url, 0, null, null, composerStartRestartGroup, i8 & 14, 7);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ContentScale.Companion companion4 = ContentScale.INSTANCE;
            ImageKt.Image(painterM7102e, "图片", modifierFillMaxSize$default, (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.gallery_icon_big_see, composerStartRestartGroup, 0);
            ContentScale crop = companion4.getCrop();
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10604padding3ABfNKs = PaddingKt.m10604padding3ABfNKs(companion, C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f7 = 20 / f6;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(modifierM10604padding3ABfNKs, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7));
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getTopStart());
            boolean z7 = (i8 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: m3.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5166H(onFullScreenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ImageKt.Image(painterPainterResource, "最大化图片", ClickableKt.m10147clickableXHw0xAI$default(modifierAlign, false, null, null, (Function0) objRememberedValue2, 7, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer2, 24624, 104);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m3.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038c.m5167I(url, onFullScreenClick, onImageClick, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: G */
    public static final Unit m5165G(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m5166H(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m5167I(String str, Function0 function0, Function0 function02, int i6, Composer composer, int i7) {
        m5164F(str, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final void m5168J(final NavController navController, final ShareViewModel viewModel, Composer composer, final int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1095653633);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1095653633, i7, -1, "com.zykj.gallery.ui.share.page.SharePage (SharePage.kt:63)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(viewModel.getDisplayPager(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM16484constructorimpl = C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            float f7 = 10 / f6;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10605paddingVpY3zN4 = PaddingKt.m10605paddingVpY3zN4(modifierFillMaxSize$default, fM16484constructorimpl, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10605paddingVpY3zN4);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m3.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5169K();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            m5174P((Function0) objRememberedValue, composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: m3.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC6038c.m5170L(viewModel, navController, (C6461d0) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: m3.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC6038c.m5171M(viewModel, context, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: m3.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5172N(viewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            m5198w(lazyPagingItemsCollectAsLazyPagingItems, function1, function12, (Function0) objRememberedValue4, composerStartRestartGroup, LazyPagingItems.$stable);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m3.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038c.m5173O(navController, viewModel, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: K */
    public static final Unit m5169K() {
        ActivityKt.m3322a(ShareActivity.class);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m5170L(ShareViewModel shareViewModel, NavController navController, C6461d0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        shareViewModel.m5153j(item);
        NavController.navigate$default(navController, "Detail/" + AbstractC6459c0.e.f8225g, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m5171M(ShareViewModel shareViewModel, Context context, String entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        shareViewModel.m5150g(context, entity);
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m5172N(ShareViewModel shareViewModel) {
        shareViewModel.m5151h();
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m5173O(NavController navController, ShareViewModel shareViewModel, int i6, Composer composer, int i7) {
        m5168J(navController, shareViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final void m5174P(final Function0 function0, Composer composer, final int i6) {
        int i7;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064041088);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1064041088, i7, -1, "com.zykj.gallery.ui.share.page.TitleBar (SharePage.kt:98)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierFillMaxWidth$default, C2452Dp.m16484constructorimpl((48 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10637height3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterStart());
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10147clickableXHw0xAI$default = ClickableKt.m10147clickableXHw0xAI$default(PaddingKt.m10604padding3ABfNKs(modifierAlign, C2452Dp.m16484constructorimpl((2 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), false, null, null, function0, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10147clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            AbstractC6655m0.m7661r(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            composer2 = composerStartRestartGroup;
            TextKt.m12353Text4IGK_g("请选择图片", boxScopeInstance.align(companion, companion2.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(AbstractC7460a.m8506c(), AbstractC7518a.m8673a(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer2, 6, 1572864, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m3.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038c.m5175Q(function0, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Q */
    public static final Unit m5175Q(Function0 function0, int i6, Composer composer, int i7) {
        m5174P(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final void m5195t(final Function0 onCameraClick, Composer composer, final int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(onCameraClick, "onCameraClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-234132120);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(onCameraClick) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-234132120, i7, -1, "com.zykj.gallery.ui.share.page.CameraIconView (SharePage.kt:193)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10113backgroundbw27NRU$default = BackgroundKt.m10113backgroundbw27NRU$default(AspectRatioKt.aspectRatio$default(SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((163 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 1.0f, false, 2, null), AbstractC7460a.m8509f(), null, 2, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10125borderxT4_qwU$default = BorderKt.m10125borderxT4_qwU$default(modifierM10113backgroundbw27NRU$default, C2452Dp.m16484constructorimpl((1 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), AbstractC7460a.m8508e(), null, 4, null);
            boolean z6 = (i7 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m3.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5196u(onCameraClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM10155combinedClickablef5TDLPQ$default = ClickableKt.m10155combinedClickablef5TDLPQ$default(modifierM10125borderxT4_qwU$default, false, null, null, null, null, null, false, (Function0) objRememberedValue, 127, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10155combinedClickablef5TDLPQ$default);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composerStartRestartGroup);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.gallery_icon_camera, composerStartRestartGroup, 0);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(painterPainterResource, "拍照入口", SizeKt.m10651size3ABfNKs(companion, C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m3.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038c.m5197v(onCameraClick, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: u */
    public static final Unit m5196u(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m5197v(Function0 function0, int i6, Composer composer, int i7) {
        m5195t(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final void m5198w(final LazyPagingItems lazyPagingItems, final Function1 function1, final Function1 function12, final Function0 function0, Composer composer, final int i6) {
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(399134032);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        boolean z6 = false;
        if (composerStartRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(399134032, i7, -1, "com.zykj.gallery.ui.share.page.Content (SharePage.kt:133)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean z7 = lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Loading;
            if ((i7 & 14) == 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(lazyPagingItems))) {
                z6 = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m3.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6038c.m5199x(lazyPagingItems);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PullToRefreshKt.PullToRefreshBox(z7, (Function0) objRememberedValue, modifierFillMaxSize$default, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2063504854, true, new Function3() { // from class: m3.f
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC6038c.m5200y(lazyPagingItems, function0, function1, function12, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m3.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6038c.m5163E(lazyPagingItems, function1, function12, function0, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: x */
    public static final Unit m5199x(LazyPagingItems lazyPagingItems) {
        lazyPagingItems.refresh();
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m5200y(final LazyPagingItems lazyPagingItems, final Function0 function0, final Function1 function1, final Function1 function12, BoxScope PullToRefreshBox, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(PullToRefreshBox, "$this$PullToRefreshBox");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2063504854, i6, -1, "com.zykj.gallery.ui.share.page.Content.<anonymous> (SharePage.kt:141)");
            }
            if (lazyPagingItems.getItemCount() == 0) {
                composer.startReplaceGroup(-6152077);
                AbstractC6586b.m7482b(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-6053373);
                float f6 = 1280;
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                GridCells.Adaptive adaptive = new GridCells.Adaptive(C2452Dp.m16484constructorimpl((163 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), null);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                float f7 = 10 / f6;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM10485spacedBy0680j_4 = arrangement.m10485spacedBy0680j_4(C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7));
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM10485spacedBy0680j_42 = arrangement.m10485spacedBy0680j_4(C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                boolean zChangedInstance = composer.changedInstance(lazyPagingItems) | composer.changed(function0) | composer.changed(function1) | composer.changed(function12);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: m3.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC6038c.m5201z(lazyPagingItems, function0, function1, function12, (LazyGridScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                LazyGridDslKt.LazyVerticalGrid(adaptive, modifierFillMaxSize$default, null, null, false, horizontalOrVerticalM10485spacedBy0680j_42, horizontalOrVerticalM10485spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer, 1769520, 0, 924);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m5201z(final LazyPagingItems lazyPagingItems, final Function0 function0, final Function1 function1, final Function1 function12, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, lazyPagingItems.getItemCount(), new Function1() { // from class: m3.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC6038c.m5159A(lazyPagingItems, ((Integer) obj).intValue());
            }
        }, null, null, ComposableLambdaKt.composableLambdaInstance(-1306537823, true, new Function4() { // from class: m3.j
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AbstractC6038c.m5160B(lazyPagingItems, function0, function1, function12, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 12, null);
        return Unit.INSTANCE;
    }
}
