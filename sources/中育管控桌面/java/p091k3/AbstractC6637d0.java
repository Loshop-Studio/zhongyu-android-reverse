package p091k3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.res.StringResources_androidKt;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.gallery.R$string;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryListKt;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryViewModel;
import com.zykj.gallery.p034ui.gallery.screenList.ScreenState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p063g3.AbstractC6405j;
import p084j3.AbstractC6586b;

/* renamed from: k3.d0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6637d0 {

    /* renamed from: k3.d0$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8719a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.f5892d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.f5890b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenState.f5891c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenState.f5889a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8719a = iArr;
        }
    }

    /* renamed from: A */
    public static final Unit m7607A(GalleryViewModel galleryViewModel, GalleryImgBean entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        galleryViewModel.m5117s(entity);
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m7608B(MutableState mutableState, MutableState mutableState2) {
        m7636s(mutableState, false);
        m7615I(mutableState2, CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m7609C(ScreenState screenState, GalleryViewModel galleryViewModel, Context context, MutableState mutableState, MutableState mutableState2) {
        m7636s(mutableState, false);
        int i6 = a.f8719a[screenState.ordinal()];
        if (i6 == 1) {
            galleryViewModel.m5102c();
        } else if (i6 == 2) {
            List listM7612F = m7612F(mutableState2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM7612F, 10));
            Iterator it = listM7612F.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((GalleryImgBean) it.next()).getId()));
            }
            galleryViewModel.m5110l(arrayList);
        } else if (i6 == 3) {
            List listM7612F2 = m7612F(mutableState2);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM7612F2, 10));
            Iterator it2 = listM7612F2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((GalleryImgBean) it2.next()).getId()));
            }
            galleryViewModel.m5104e(arrayList2);
            List listM7612F3 = m7612F(mutableState2);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM7612F3, 10));
            Iterator it3 = listM7612F3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((GalleryImgBean) it3.next()).getPicture());
            }
            galleryViewModel.m5103d(context, arrayList3);
        } else if (i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        galleryViewModel.m5116r(screenState == ScreenState.f5890b ? ScreenState.f5889a : ScreenState.f5892d, true);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m7610D(MutableState mutableState) {
        m7617K(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m7611E(MutableState mutableState) {
        m7617K(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final List m7612F(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    /* renamed from: G */
    public static final Unit m7613G(GalleryViewModel galleryViewModel, SnapshotStateList snapshotStateList, MutableState mutableState) {
        if (((Number) galleryViewModel.getTotalCount().getValue()).intValue() + snapshotStateList.size() > 100) {
            XToastUtils.INSTANCE.error("图片数量已达上限，请删除部分图片后重试");
            return Unit.INSTANCE;
        }
        m7617K(mutableState, false);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
        Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((GalleryImgBean) it.next()).getId()));
        }
        galleryViewModel.m5112n(arrayList);
        galleryViewModel.m5116r(ScreenState.f5892d, true);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m7614H(NavHostController navHostController, GalleryViewModel galleryViewModel, int i6, Composer composer, int i7) {
        m7632o(navHostController, galleryViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final void m7615I(MutableState mutableState, List list) {
        mutableState.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public static final boolean m7616J(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: K */
    public static final void m7617K(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* renamed from: o */
    public static final void m7632o(final NavHostController navController, final GalleryViewModel viewModel, Composer composer, final int i6) {
        int i7;
        Object obj;
        Modifier.Companion companion;
        final ScreenState screenState;
        final MutableState mutableState;
        final MutableState mutableState2;
        SnapshotStateList snapshotStateList;
        final Context context;
        int i8;
        ?? r22;
        ScreenState screenState2;
        int i9;
        boolean z6;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1084180750);
        if ((i6 & 6) == 0) {
            i7 = i6 | (composerStartRestartGroup.changedInstance(navController) ? 4 : 2);
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1084180750, i7, -1, "com.zykj.gallery.ui.gallery.screenList.GalleryScreen (GalleryScreen.kt:39)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            ScreenState screenState3 = (ScreenState) FlowExtKt.collectAsStateWithLifecycle(viewModel.getScreenState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue4;
            LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(viewModel.getListPager(), null, composerStartRestartGroup, 0, 1);
            final SnapshotStateList selectedItems = viewModel.getSelectedItems();
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getTotalCount(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM16484constructorimpl = C2452Dp.m16484constructorimpl((40 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10605paddingVpY3zN4 = PaddingKt.m10605paddingVpY3zN4(modifierFillMaxSize$default, fM16484constructorimpl, C2452Dp.m16484constructorimpl((10 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM10605paddingVpY3zN4);
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
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            final Activity activity2 = activity;
            AbstractC6667s0 abstractC6667s0M7666c = AbstractC6665r0.m7666c(screenState3, m7635r(stateCollectAsStateWithLifecycle), selectedItems.size(), composerStartRestartGroup, 0, 0);
            Composer composer2 = composerStartRestartGroup;
            boolean zChanged = composer2.changed(screenState3.ordinal()) | composer2.changedInstance(viewModel) | composer2.changed(selectedItems);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == companion2.getEmpty()) {
                companion = companion3;
                screenState = screenState3;
                mutableState = mutableState3;
                mutableState2 = mutableState5;
                obj = new Function0() { // from class: k3.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7637t(screenState, viewModel, selectedItems, mutableState, mutableState4);
                    }
                };
                composer2.updateRememberedValue(obj);
            } else {
                companion = companion3;
                obj = objRememberedValue5;
                screenState = screenState3;
                mutableState = mutableState3;
                mutableState2 = mutableState5;
            }
            Function0 function0 = (Function0) obj;
            Object objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: k3.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7639v(mutableState2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            Function0 function02 = (Function0) objRememberedValue6;
            boolean zChanged2 = composer2.changed(screenState.ordinal()) | composer2.changedInstance(activity2) | composer2.changedInstance(viewModel);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: k3.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7640w(screenState, activity2, viewModel);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            }
            Function0 function03 = (Function0) objRememberedValue7;
            Modifier.Companion companion5 = companion;
            final MutableState mutableState7 = mutableState2;
            AbstractC6655m0.m7656m(abstractC6667s0M7666c, function0, function02, function03, composer2, 384);
            if (lazyPagingItemsCollectAsLazyPagingItems.getItemCount() == 0) {
                composer2.startReplaceGroup(473866013);
                AbstractC6586b.m7482b(composer2, 0);
                composer2.endReplaceGroup();
                screenState2 = screenState;
                r22 = 0;
                snapshotStateList = selectedItems;
                context = context2;
                i8 = 3;
            } else {
                composer2.startReplaceGroup(473970266);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                boolean zM7634q = m7634q(mutableState6);
                boolean zChangedInstance = composer2.changedInstance(viewModel);
                Object objRememberedValue8 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: k3.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6637d0.m7641x(viewModel);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                Function0 function04 = (Function0) objRememberedValue8;
                boolean zChanged3 = composer2.changed(screenState.ordinal()) | composer2.changedInstance(viewModel) | composer2.changedInstance(navController);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue9 == companion2.getEmpty()) {
                    objRememberedValue9 = new Function1() { // from class: k3.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC6637d0.m7642y(viewModel, screenState, navController, (GalleryImgBean) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                Function1 function1 = (Function1) objRememberedValue9;
                boolean zChanged4 = composer2.changed(screenState.ordinal()) | composer2.changedInstance(viewModel);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue10 == companion2.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: k3.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC6637d0.m7643z(screenState, viewModel);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                Function0 function05 = (Function0) objRememberedValue10;
                boolean zChangedInstance2 = composer2.changedInstance(viewModel);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue11 == companion2.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: k3.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC6637d0.m7607A(viewModel, (GalleryImgBean) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                snapshotStateList = selectedItems;
                context = context2;
                i8 = 3;
                ScreenState screenState4 = screenState;
                r22 = 0;
                GalleryListKt.m5085p(modifierFillMaxSize$default2, lazyPagingItemsCollectAsLazyPagingItems, snapshotStateList, screenState4, zM7634q, function04, function1, function05, (Function1) objRememberedValue11, composer2, (LazyPagingItems.$stable << 3) | 6, 0);
                screenState2 = screenState4;
                composer2 = composer2;
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            float f7 = 460 / f6;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m10656width3ABfNKs(companion5, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7)), null, r22, i8, null);
            boolean zM7633p = m7633p(mutableState);
            String strStringResource = StringResources_androidKt.stringResource(R$string.delete_img, composer2, r22);
            if (screenState2 == ScreenState.f5890b) {
                composer2.startReplaceGroup(-1779230538);
                i9 = R$string.delete_msg;
            } else {
                composer2.startReplaceGroup(-1779229035);
                i9 = R$string.delete_msg_receiver;
            }
            String strStringResource2 = StringResources_androidKt.stringResource(i9, composer2, r22);
            composer2.endReplaceGroup();
            int i10 = R$string.hw_cancel;
            String strStringResource3 = StringResources_androidKt.stringResource(i10, composer2, r22);
            int i11 = R$string.positive;
            String strStringResource4 = StringResources_androidKt.stringResource(i11, composer2, r22);
            Object objRememberedValue12 = composer2.rememberedValue();
            if (objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = new Function0() { // from class: k3.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7608B(mutableState, mutableState4);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue12);
            }
            Function0 function06 = (Function0) objRememberedValue12;
            boolean zChanged5 = composer2.changed(screenState2.ordinal()) | composer2.changedInstance(viewModel) | composer2.changedInstance(context);
            Object objRememberedValue13 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue13 == companion2.getEmpty()) {
                final ScreenState screenState5 = screenState2;
                z6 = false;
                Function0 function07 = new Function0() { // from class: k3.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7609C(screenState5, viewModel, context, mutableState, mutableState4);
                    }
                };
                composer2.updateRememberedValue(function07);
                objRememberedValue13 = function07;
            } else {
                z6 = false;
            }
            boolean z7 = z6;
            final SnapshotStateList snapshotStateList2 = snapshotStateList;
            Composer composer3 = composer2;
            AbstractC6405j.m6926j(zM7633p, function06, strStringResource, strStringResource2, strStringResource3, 0L, null, strStringResource4, 0L, (Function0) objRememberedValue13, false, null, modifierWrapContentHeight$default, composer3, 48, 384, 3424);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.m10656width3ABfNKs(companion5, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, z7, 3, null);
            boolean zM7616J = m7616J(mutableState7);
            String strStringResource5 = StringResources_androidKt.stringResource(R$string.receiver_title, composer3, z7 ? 1 : 0);
            String strStringResource6 = StringResources_androidKt.stringResource(R$string.receiver_msg, composer3, z7 ? 1 : 0);
            String strStringResource7 = StringResources_androidKt.stringResource(i10, composer3, z7 ? 1 : 0);
            String strStringResource8 = StringResources_androidKt.stringResource(i11, composer3, z7 ? 1 : 0);
            Object objRememberedValue14 = composer3.rememberedValue();
            if (objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new Function0() { // from class: k3.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7610D(mutableState7);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue14);
            }
            Function0 function08 = (Function0) objRememberedValue14;
            Object objRememberedValue15 = composer3.rememberedValue();
            if (objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = new Function0() { // from class: k3.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7611E(mutableState7);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue15);
            }
            Function0 function09 = (Function0) objRememberedValue15;
            boolean zChangedInstance3 = composer3.changedInstance(viewModel) | composer3.changed(snapshotStateList2);
            Object objRememberedValue16 = composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue16 == companion2.getEmpty()) {
                objRememberedValue16 = new Function0() { // from class: k3.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6637d0.m7613G(viewModel, snapshotStateList2, mutableState7);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue16);
            }
            AbstractC6405j.m6926j(zM7616J, function08, strStringResource5, strStringResource6, strStringResource7, 0L, function09, strStringResource8, 0L, (Function0) objRememberedValue16, false, null, modifierWrapContentHeight$default2, composer3, 1572912, 384, 3360);
            composerStartRestartGroup = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: k3.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC6637d0.m7614H(navController, viewModel, i6, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final boolean m7633p(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final boolean m7634q(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: r */
    public static final int m7635r(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* renamed from: s */
    public static final void m7636s(MutableState mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* renamed from: t */
    public static final Unit m7637t(ScreenState screenState, GalleryViewModel galleryViewModel, SnapshotStateList snapshotStateList, final MutableState mutableState, final MutableState mutableState2) {
        AbstractC6665r0.m7667d(screenState, galleryViewModel, snapshotStateList, new Function1() { // from class: k3.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC6637d0.m7638u(mutableState, mutableState2, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m7638u(MutableState mutableState, MutableState mutableState2, List entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        m7636s(mutableState, true);
        m7615I(mutableState2, entities);
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m7639v(MutableState mutableState) {
        m7617K(mutableState, true);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m7640w(ScreenState screenState, Activity activity, GalleryViewModel galleryViewModel) {
        AbstractC6665r0.m7664a(screenState, activity, galleryViewModel);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m7641x(GalleryViewModel galleryViewModel) {
        galleryViewModel.m5111m();
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m7642y(GalleryViewModel galleryViewModel, ScreenState screenState, NavHostController navHostController, GalleryImgBean entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        galleryViewModel.m5113o(entity);
        NavController.navigate$default((NavController) navHostController, "img_detail_route/" + AbstractC6665r0.m7665b(screenState), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m7643z(ScreenState screenState, GalleryViewModel galleryViewModel) {
        if (screenState == ScreenState.f5889a) {
            galleryViewModel.m5116r(ScreenState.f5890b, false);
        } else {
            galleryViewModel.m5116r(ScreenState.f5891c, false);
        }
        return Unit.INSTANCE;
    }
}
