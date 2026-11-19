package p008a6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.detail.TaskDetailPageKt;
import com.zykj.evaluation.p057ui.detail.revising.RevisingDetailViewModel;
import com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a6.b */
/* loaded from: classes4.dex */
public abstract class AbstractC0024b {
    /* renamed from: b */
    public static final void m65b(final long j10, final DetailBundle detailBundle, final NavController navController, final Function1 onClickToAsk, final Function1 requestPermission, RevisingDetailViewModel revisingDetailViewModel, RevisingGuideViewModel revisingGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        RevisingDetailViewModel revisingDetailViewModel2;
        RevisingGuideViewModel revisingGuideViewModel2;
        final RevisingDetailViewModel revisingDetailViewModel3;
        final RevisingGuideViewModel revisingGuideViewModel3;
        int i13;
        String str;
        int i14;
        RevisingDetailViewModel revisingDetailViewModel4;
        RevisingGuideViewModel revisingGuideViewModel4;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onClickToAsk, "onClickToAsk");
        Intrinsics.checkNotNullParameter(requestPermission, "requestPermission");
        Composer composerStartRestartGroup = composer.startRestartGroup(970409770);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(detailBundle) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(navController) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickToAsk) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(requestPermission) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                revisingDetailViewModel2 = revisingDetailViewModel;
                int i15 = composerStartRestartGroup.changedInstance(revisingDetailViewModel2) ? 131072 : 65536;
                i12 |= i15;
            } else {
                revisingDetailViewModel2 = revisingDetailViewModel;
            }
            i12 |= i15;
        } else {
            revisingDetailViewModel2 = revisingDetailViewModel;
        }
        if ((1572864 & i10) == 0) {
            revisingGuideViewModel2 = revisingGuideViewModel;
            i12 |= ((i11 & 64) == 0 && composerStartRestartGroup.changedInstance(revisingGuideViewModel2)) ? 1048576 : 524288;
        } else {
            revisingGuideViewModel2 = revisingGuideViewModel;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i12) != 599186, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 32) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    i13 = 0;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) RevisingDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i14 = i12 & (-458753);
                    revisingDetailViewModel4 = (RevisingDetailViewModel) viewModel;
                } else {
                    i13 = 0;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i14 = i12;
                    revisingDetailViewModel4 = revisingDetailViewModel2;
                }
                if ((i11 & 64) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException(str);
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, i13);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) RevisingGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    revisingGuideViewModel4 = (RevisingGuideViewModel) viewModel2;
                    revisingDetailViewModel2 = revisingDetailViewModel4;
                    i12 = i14 & (-3670017);
                } else {
                    revisingDetailViewModel2 = revisingDetailViewModel4;
                    revisingGuideViewModel4 = revisingGuideViewModel2;
                    i12 = i14;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
                revisingGuideViewModel4 = revisingGuideViewModel2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(970409770, i12, -1, "com.zykj.evaluation.ui.detail.revising.RevisingDetailPage (RevisingDetailPage.kt:21)");
            }
            int i16 = i12 >> 6;
            RevisingDetailViewModel revisingDetailViewModel5 = revisingDetailViewModel2;
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, revisingDetailViewModel5, revisingGuideViewModel4, null, null, null, null, null, onClickToAsk, requestPermission, null, composerStartRestartGroup, (i12 & 1022) | (i16 & 7168) | (i16 & 57344), (i12 >> 9) & 126, 5088);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            revisingDetailViewModel3 = revisingDetailViewModel5;
            revisingGuideViewModel3 = revisingGuideViewModel4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            revisingDetailViewModel3 = revisingDetailViewModel2;
            revisingGuideViewModel3 = revisingGuideViewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: a6.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC0024b.m66c(j10, detailBundle, navController, onClickToAsk, requestPermission, revisingDetailViewModel3, revisingGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m66c(long j10, DetailBundle detailBundle, NavController navController, Function1 function1, Function1 function12, RevisingDetailViewModel revisingDetailViewModel, RevisingGuideViewModel revisingGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m65b(j10, detailBundle, navController, function1, function12, revisingDetailViewModel, revisingGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
