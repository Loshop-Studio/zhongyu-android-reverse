package com.zykj.gallery.p034ui.gallery.screenList;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryListKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p070h3.AbstractC6457b0;
import p114n3.AbstractC7460a;
import p121o3.AbstractC7518a;
import p121o3.AbstractC7519b;

/* loaded from: classes4.dex */
public abstract class GalleryListKt {

    /* renamed from: com.zykj.gallery.ui.gallery.screenList.GalleryListKt$a */
    public static final /* synthetic */ class C6030a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5864a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.f5889a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.f5892d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5864a = iArr;
        }
    }

    /* renamed from: A */
    public static final void m5061A(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* renamed from: B */
    public static final Unit m5062B(CoroutineScope coroutineScope, MutableState mutableState, Function0 function0, LazyPagingItems lazyPagingItems) {
        if (!m5095z(mutableState)) {
            m5061A(mutableState, true);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GalleryListKt$GalleryList$onRefresh$1$1$1(function0, lazyPagingItems, mutableState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* renamed from: C */
    public static final void m5063C(final Modifier modifier, final GalleryImgBean item, final ScreenState screenState, final boolean z6, final Function1 onImageClick, final Function0 onImageLongClick, Function1 function1, Composer composer, final int i6) {
        int i7;
        Composer composer2;
        long j6;
        String str;
        int i8;
        ?? r42;
        int i9;
        final Function1 onCheckedChange = function1;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        Intrinsics.checkNotNullParameter(onImageLongClick, "onImageLongClick");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(2090270763);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(item) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(screenState.ordinal()) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onImageClick) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onImageLongClick) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onCheckedChange) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2090270763, i7, -1, "com.zykj.gallery.ui.gallery.screenList.GalleryListItem (GalleryList.kt:166)");
            }
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m10656width3ABfNKs(modifier, C2452Dp.m16484constructorimpl((163 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 1.0f, false, 2, null);
            boolean z7 = ((i7 & 896) == 256) | ((458752 & i7) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: k3.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GalleryListKt.m5064D(screenState, onImageLongClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            int i10 = 57344 & i7;
            int i11 = i7 & 112;
            boolean z8 = (i10 == 16384) | (i11 == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: k3.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GalleryListKt.m5065E(onImageClick, item);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM10155combinedClickablef5TDLPQ$default = ClickableKt.m10155combinedClickablef5TDLPQ$default(modifierAspectRatio$default, false, null, null, null, function0, null, false, (Function0) objRememberedValue2, 111, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            int i12 = i7;
            Painter painterM7102e = AbstractC6457b0.m7102e(item.getPicture(), 0, null, null, composerStartRestartGroup, 0, 7);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            ContentScale.Companion companion4 = ContentScale.INSTANCE;
            ImageKt.Image(painterM7102e, "图片", modifierFillMaxSize$default, (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            Composer composer3 = composerStartRestartGroup;
            if (screenState == ScreenState.f5892d || screenState == ScreenState.f5891c) {
                composer3.startReplaceGroup(481746454);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.m10637height3ABfNKs(modifierFillMaxWidth$default, C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getBottomCenter());
                Brush.Companion companion5 = Brush.INSTANCE;
                Color.Companion companion6 = Color.INSTANCE;
                Modifier modifierBackground$default = BackgroundKt.background$default(modifierAlign, Brush.Companion.m13856verticalGradient8A3gB4$default(companion5, CollectionsKt.listOf((Object[]) new Color[]{Color.m13889boximpl(Color.m13898copywmQWz5c$default(companion6.m13925getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m13889boximpl(Color.m13898copywmQWz5c$default(companion6.m13925getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierBackground$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM13341constructorimpl2 = Updater.m13341constructorimpl(composer3);
                Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                long jM8673a = AbstractC7518a.m8673a(14);
                long jM8511h = AbstractC7460a.m8511h();
                String movedToTrashTime = item.getMovedToTrashTime();
                if (movedToTrashTime == null || movedToTrashTime.length() == 0) {
                    j6 = jM8511h;
                    str = "";
                } else {
                    j6 = jM8511h;
                    str = AbstractC7519b.m8675b(item.getMovedToTrashTime(), 0L, 1, null) + "天";
                }
                String str2 = str;
                i8 = 10;
                float f7 = 10 / f6;
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                r42 = 0;
                i9 = 474890897;
                TextKt.m12353Text4IGK_g(str2, boxScopeInstance.align(PaddingKt.m10604padding3ABfNKs(companion3, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getCenter()), j6, jM8673a, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
                composer3 = composer3;
                composer3.endNode();
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(474890897);
                composer3.endReplaceGroup();
                i9 = 474890897;
                r42 = 0;
                i8 = 10;
            }
            if (screenState == ScreenState.f5890b || screenState == ScreenState.f5891c) {
                composer3.startReplaceGroup(482848225);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.gallery_icon_big_see, composer3, r42);
                ContentScale crop = companion4.getCrop();
                float f8 = i8 / f6;
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM10604padding3ABfNKs = PaddingKt.m10604padding3ABfNKs(companion3, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f8));
                float f9 = 20 / f6;
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(modifierM10604padding3ABfNKs, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f9));
                DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f9)), companion.getTopStart());
                boolean z9 = (i11 == 32 ? true : r42) | (i10 == 16384 ? true : r42);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (z9 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: k3.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GalleryListKt.m5066F(onImageClick, item);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                Composer composer4 = composer3;
                ImageKt.Image(painterPainterResource, "最大化图片", ClickableKt.m10147clickableXHw0xAI$default(modifierAlign2, false, null, null, (Function0) objRememberedValue3, 7, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer4, 24624, 104);
                DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM10604padding3ABfNKs2 = PaddingKt.m10604padding3ABfNKs(companion3, C2452Dp.m16484constructorimpl(f8 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM10656width3ABfNKs2 = SizeKt.m10656width3ABfNKs(modifierM10604padding3ABfNKs2, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f9));
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs2, C2452Dp.m16484constructorimpl(f9 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion.getBottomEnd());
                Color.Companion companion7 = Color.INSTANCE;
                Modifier modifierM10113backgroundbw27NRU$default = BackgroundKt.m10113backgroundbw27NRU$default(modifierAlign3, Color.m13898copywmQWz5c$default(companion7.m13936getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), r42);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, r42);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM10113backgroundbw27NRU$default);
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
                Composer composerM13341constructorimpl3 = Updater.m13341constructorimpl(composer4);
                Updater.m13348setimpl(composerM13341constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m13348setimpl(composerM13341constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM13341constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM13341constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM13341constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m13348setimpl(composerM13341constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                boolean z10 = ((i12 & 3670016) == 1048576 ? true : r42) | (i11 == 32 ? true : r42);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (z10 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    onCheckedChange = function1;
                    objRememberedValue4 = new Function1() { // from class: k3.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GalleryListKt.m5067G(onCheckedChange, item, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                } else {
                    onCheckedChange = function1;
                }
                CheckboxKt.Checkbox(z6, (Function1) objRememberedValue4, null, false, CheckboxDefaults.INSTANCE.m11508colors5tl4gsc(AbstractC7460a.m8504a(), companion7.m13936getWhite0d7_KjU(), companion7.m13936getWhite0d7_KjU(), 0L, 0L, 0L, composer4, (CheckboxDefaults.$stable << 18) | 438, 56), null, composer4, (i12 >> 9) & 14, 44);
                composer2 = composer4;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(i9);
                composer3.endReplaceGroup();
                onCheckedChange = function1;
                composer2 = composer3;
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: k3.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryListKt.m5068H(modifier, item, screenState, z6, onImageClick, onImageLongClick, onCheckedChange, i6, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: D */
    public static final Unit m5064D(ScreenState screenState, Function0 function0) {
        int i6 = C6030a.f5864a[screenState.ordinal()];
        if (i6 != 1 && i6 != 2) {
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m5065E(Function1 function1, GalleryImgBean galleryImgBean) {
        function1.invoke(galleryImgBean);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m5066F(Function1 function1, GalleryImgBean galleryImgBean) {
        function1.invoke(galleryImgBean);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m5067G(Function1 function1, GalleryImgBean galleryImgBean, boolean z6) {
        function1.invoke(galleryImgBean);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m5068H(Modifier modifier, GalleryImgBean galleryImgBean, ScreenState screenState, boolean z6, Function1 function1, Function0 function0, Function1 function12, int i6, Composer composer, int i7) {
        m5063C(modifier, galleryImgBean, screenState, z6, function1, function0, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5085p(final androidx.compose.p009ui.Modifier r21, final androidx.paging.compose.LazyPagingItems r22, java.util.List r23, final com.zykj.gallery.p034ui.gallery.screenList.ScreenState r24, boolean r25, kotlin.jvm.functions.Function0 r26, final kotlin.jvm.functions.Function1 r27, final kotlin.jvm.functions.Function0 r28, final kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.p034ui.gallery.screenList.GalleryListKt.m5085p(androidx.compose.ui.Modifier, androidx.paging.compose.LazyPagingItems, java.util.List, com.zykj.gallery.ui.gallery.screenList.ScreenState, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/screenList/GalleryListKt.smali:2382
    }

    /* renamed from: q */
    public static final Unit m5086q() {
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m5087r(LazyGridState lazyGridState, final LazyPagingItems lazyPagingItems, final ScreenState screenState, final List list, final Function1 function1, final Function0 function0, final Function1 function12, BoxScope PullToRefreshBox, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(PullToRefreshBox, "$this$PullToRefreshBox");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-502794073, i6, -1, "com.zykj.gallery.ui.gallery.screenList.GalleryList.<anonymous> (GalleryList.kt:118)");
            }
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
            boolean zChangedInstance = composer.changedInstance(lazyPagingItems) | composer.changed(screenState.ordinal()) | composer.changedInstance(list) | composer.changed(function1) | composer.changed(function0) | composer.changed(function12);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function13 = new Function1() { // from class: k3.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryListKt.m5088s(lazyPagingItems, screenState, list, function1, function0, function12, (LazyGridScope) obj);
                    }
                };
                composer.updateRememberedValue(function13);
                objRememberedValue = function13;
            }
            LazyGridDslKt.LazyVerticalGrid(adaptive, modifierFillMaxSize$default, lazyGridState, null, false, horizontalOrVerticalM10485spacedBy0680j_42, horizontalOrVerticalM10485spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer, 1769520, 0, 920);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m5088s(final LazyPagingItems lazyPagingItems, final ScreenState screenState, final List list, final Function1 function1, final Function0 function0, final Function1 function12, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, lazyPagingItems.getItemCount(), LazyFoundationExtensionsKt.itemKey(lazyPagingItems, new Function1() { // from class: k3.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryListKt.m5093x((GalleryImgBean) obj);
            }
        }), null, null, ComposableLambdaKt.composableLambdaInstance(-1923512702, true, new Function4() { // from class: k3.f
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryListKt.m5089t(lazyPagingItems, screenState, list, function1, function0, function12, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 12, null);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m5089t(LazyPagingItems lazyPagingItems, ScreenState screenState, List list, final Function1 function1, final Function0 function0, final Function1 function12, LazyGridItemScope items, int i6, Composer composer, int i7) {
        int i8;
        Composer composer2;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i7 & 6) == 0) {
            i8 = i7 | (composer.changed(items) ? 4 : 2);
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composer.changed(i6) ? 32 : 16;
        }
        if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1923512702, i8, -1, "com.zykj.gallery.ui.gallery.screenList.GalleryList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryList.kt:130)");
            }
            final GalleryImgBean galleryImgBean = (GalleryImgBean) lazyPagingItems.get(i6);
            if (galleryImgBean != null) {
                composer.startReplaceGroup(86856315);
                Modifier modifierAnimateItem$default = LazyGridItemScope.animateItem$default(items, Modifier.INSTANCE, null, null, null, 7, null);
                boolean zContains = list.contains(galleryImgBean);
                boolean zChanged = composer.changed(function1) | composer.changed(galleryImgBean);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: k3.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GalleryListKt.m5090u(function1, galleryImgBean, (GalleryImgBean) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function13 = (Function1) objRememberedValue;
                boolean zChanged2 = composer.changed(function0);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: k3.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GalleryListKt.m5091v(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                boolean zChanged3 = composer.changed(function12);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: k3.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GalleryListKt.m5092w(function12, (GalleryImgBean) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer2 = composer;
                m5063C(modifierAnimateItem$default, galleryImgBean, screenState, zContains, function13, function02, (Function1) objRememberedValue3, composer2, 0);
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(81917984);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m5090u(Function1 function1, GalleryImgBean galleryImgBean, GalleryImgBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(galleryImgBean);
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m5091v(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m5092w(Function1 function1, GalleryImgBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Object m5093x(GalleryImgBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    /* renamed from: y */
    public static final Unit m5094y(Modifier modifier, LazyPagingItems lazyPagingItems, List list, ScreenState screenState, boolean z6, Function0 function0, Function1 function1, Function0 function02, Function1 function12, int i6, int i7, Composer composer, int i8) {
        m5085p(modifier, lazyPagingItems, list, screenState, z6, function0, function1, function02, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static final boolean m5095z(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
