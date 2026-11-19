package p286x5;

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
import com.zykj.evaluation.p057ui.detail.correcting.CorrectingDetailViewModel;
import com.zykj.evaluation.p057ui.guide.normal.correcting.CorrectingGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x5.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9854b {
    /* renamed from: b */
    public static final void m16511b(final long j10, final DetailBundle detailBundle, final NavController navController, CorrectingDetailViewModel correctingDetailViewModel, CorrectingGuideViewModel correctingGuideViewModel, Composer composer, final int i10, final int i11) {
        int i12;
        CorrectingDetailViewModel correctingDetailViewModel2;
        CorrectingGuideViewModel correctingGuideViewModel2;
        final CorrectingGuideViewModel correctingGuideViewModel3;
        String str;
        int i13;
        CorrectingGuideViewModel correctingGuideViewModel4;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1791802809);
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
            if ((i11 & 8) == 0) {
                correctingDetailViewModel2 = correctingDetailViewModel;
                int i14 = composerStartRestartGroup.changedInstance(correctingDetailViewModel2) ? 2048 : 1024;
                i12 |= i14;
            } else {
                correctingDetailViewModel2 = correctingDetailViewModel;
            }
            i12 |= i14;
        } else {
            correctingDetailViewModel2 = correctingDetailViewModel;
        }
        if ((i10 & 24576) == 0) {
            correctingGuideViewModel2 = correctingGuideViewModel;
            i12 |= ((i11 & 16) == 0 && composerStartRestartGroup.changedInstance(correctingGuideViewModel2)) ? 16384 : 8192;
        } else {
            correctingGuideViewModel2 = correctingGuideViewModel;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 8) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    i13 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) CorrectingDetailViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    correctingDetailViewModel2 = (CorrectingDetailViewModel) viewModel;
                    i12 &= -7169;
                } else {
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i13 = 1890788296;
                }
                int i15 = i12;
                CorrectingDetailViewModel correctingDetailViewModel3 = correctingDetailViewModel2;
                if ((i11 & 16) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(i13);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException(str);
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) CorrectingGuideViewModel.class, current2, (String) null, factoryCreateHiltViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    correctingGuideViewModel4 = (CorrectingGuideViewModel) viewModel2;
                    correctingDetailViewModel2 = correctingDetailViewModel3;
                    i12 = i15 & (-57345);
                } else {
                    correctingDetailViewModel2 = correctingDetailViewModel3;
                    correctingGuideViewModel4 = correctingGuideViewModel2;
                    i12 = i15;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                correctingGuideViewModel4 = correctingGuideViewModel2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791802809, i12, -1, "com.zykj.evaluation.ui.detail.correcting.CorrectingDetailPage (CorrectingDetailPage.kt:19)");
            }
            TaskDetailPageKt.m9398m0(j10, detailBundle, navController, correctingDetailViewModel2, correctingGuideViewModel4, null, null, null, null, null, null, null, null, composerStartRestartGroup, i12 & 65534, 0, 8160);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            correctingGuideViewModel3 = correctingGuideViewModel4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            correctingGuideViewModel3 = correctingGuideViewModel2;
        }
        final CorrectingDetailViewModel correctingDetailViewModel4 = correctingDetailViewModel2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: x5.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC9854b.m16512c(j10, detailBundle, navController, correctingDetailViewModel4, correctingGuideViewModel3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: c */
    public static final Unit m16512c(long j10, DetailBundle detailBundle, NavController navController, CorrectingDetailViewModel correctingDetailViewModel, CorrectingGuideViewModel correctingGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m16511b(j10, detailBundle, navController, correctingDetailViewModel, correctingGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
