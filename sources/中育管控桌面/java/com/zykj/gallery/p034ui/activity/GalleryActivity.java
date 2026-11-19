package com.zykj.gallery.p034ui.activity;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.p034ui.activity.GalleryActivity;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p070h3.AbstractC6457b0;
import p070h3.AbstractC6459c0;
import p070h3.AbstractC6479v;
import p070h3.C6461d0;
import p091k3.AbstractC6637d0;
import p114n3.AbstractC7464e;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m7880d2 = {"Lcom/zykj/gallery/ui/activity/GalleryActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;", "e", "Lkotlin/Lazy;", "v", "()Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;", "viewModel", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nGalleryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryActivity.kt\ncom/zykj/gallery/ui/activity/GalleryActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n70#2,11:107\n1247#3,6:118\n1247#3,6:124\n1247#3,6:130\n*S KotlinDebug\n*F\n+ 1 GalleryActivity.kt\ncom/zykj/gallery/ui/activity/GalleryActivity\n*L\n31#1:107,11\n74#1:118,6\n89#1:124,6\n49#1:130,6\n*E\n"})
/* loaded from: classes4.dex */
public final class GalleryActivity extends Hilt_GalleryActivity {

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy viewModel;

    public GalleryActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GalleryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.gallery.ui.activity.GalleryActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.gallery.ui.activity.GalleryActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.gallery.ui.activity.GalleryActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: A */
    public static final Unit m5032A(NavHostController navHostController, GalleryActivity galleryActivity, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-785773612, i6, -1, "com.zykj.gallery.ui.activity.GalleryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryActivity.kt:51)");
        }
        AbstractC6637d0.m7632o(navHostController, galleryActivity.m5050v(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m5033B(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m5034C(final GalleryActivity galleryActivity, NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i6) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1784356405, i6, -1, "com.zykj.gallery.ui.activity.GalleryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryActivity.kt:64)");
        }
        Bundle arguments = backStackEntry.getArguments();
        String string = arguments != null ? arguments.getString("fromModeName") : null;
        AbstractC6459c0 abstractC6459c0M7099b = string != null ? AbstractC6457b0.m7099b(string) : null;
        if (abstractC6459c0M7099b == null) {
            composer.startReplaceGroup(1048854002);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1048854003);
            GalleryImgBean galleryImgBeanM5108j = galleryActivity.m5050v().m5108j();
            if (galleryImgBeanM5108j == null) {
                composer.startReplaceGroup(-2088569698);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer.startReplaceGroup(-2088569697);
                C6461d0 c6461d0M7100c = AbstractC6457b0.m7100c(galleryImgBeanM5108j);
                boolean zChangedInstance = composer.changedInstance(galleryActivity);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function3() { // from class: f3.h
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return GalleryActivity.m5035D(this.f7689a, ((Long) obj).longValue(), (AbstractC6459c0) obj2, (String) obj3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function3 function3 = (Function3) objRememberedValue;
                boolean zChangedInstance2 = composer.changedInstance(galleryActivity);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: f3.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GalleryActivity.m5036E(this.f7690a, ((Long) obj).longValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composer;
                AbstractC6479v.m7163v(navHostController, c6461d0M7100c, abstractC6459c0M7099b, function3, (Function1) objRememberedValue2, null, composer2, 0, 32);
                composer2.endReplaceGroup();
            }
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m5035D(GalleryActivity galleryActivity, long j6, AbstractC6459c0 fromMode, String url) {
        Intrinsics.checkNotNullParameter(fromMode, "fromMode");
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(fromMode, AbstractC6459c0.c.f8223g)) {
            galleryActivity.m5050v().m5103d(galleryActivity, CollectionsKt.listOf(url));
            galleryActivity.m5050v().m5104e(CollectionsKt.listOf(Long.valueOf(j6)));
        } else {
            galleryActivity.m5050v().m5110l(CollectionsKt.listOf(Long.valueOf(j6)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m5036E(GalleryActivity galleryActivity, long j6) {
        if (((Number) galleryActivity.m5050v().getTotalCount().getValue()).intValue() + 1 <= 100) {
            galleryActivity.m5050v().m5112n(CollectionsKt.listOf(Long.valueOf(j6)));
            return Unit.INSTANCE;
        }
        XToastUtils.INSTANCE.error("图片数量已达上限，请删除部分图片后重试");
        galleryActivity.m5050v().m5118t();
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m5046w(final GalleryActivity galleryActivity, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(236681806, i6, -1, "com.zykj.gallery.ui.activity.GalleryActivity.onCreate.<anonymous> (GalleryActivity.kt:37)");
            }
            AbstractC7464e.m8521c(false, false, ComposableLambdaKt.rememberComposableLambda(-14457376, true, new Function2() { // from class: f3.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryActivity.m5047x(this.f7680a, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m5047x(final GalleryActivity galleryActivity, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-14457376, i6, -1, "com.zykj.gallery.ui.activity.GalleryActivity.onCreate.<anonymous>.<anonymous> (GalleryActivity.kt:38)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
            ScaffoldKt.m12068ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-783492559, true, new Function3() { // from class: f3.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GalleryActivity.m5048y(navHostControllerRememberNavController, galleryActivity, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306374, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m5048y(final NavHostController navHostController, final GalleryActivity galleryActivity, PaddingValues innerPadding, Composer composer, int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        if ((i6 & 6) == 0) {
            i7 = i6 | (composer.changed(innerPadding) ? 4 : 2);
        } else {
            i7 = i6;
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783492559, i7, -1, "com.zykj.gallery.ui.activity.GalleryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GalleryActivity.kt:42)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
            boolean zChangedInstance = composer.changedInstance(navHostController) | composer.changedInstance(galleryActivity);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: f3.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryActivity.m5049z(navHostController, galleryActivity, (NavGraphBuilder) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            NavHostKt.NavHost(navHostController, "gallery_list_route", modifierPadding, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer, 48, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m5049z(final NavHostController navHostController, final GalleryActivity galleryActivity, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, "gallery_list_route", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-785773612, true, new Function4() { // from class: f3.e
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryActivity.m5032A(navHostController, galleryActivity, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "img_detail_route/{fromModeName}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("fromModeName", new Function1() { // from class: f3.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryActivity.m5033B((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1784356405, true, new Function4() { // from class: f3.g
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryActivity.m5034C(this.f7687a, navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.gallery.p034ui.activity.Hilt_GalleryActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(236681806, true, new Function2() { // from class: f3.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GalleryActivity.m5046w(this.f7679a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* renamed from: v */
    public final GalleryViewModel m5050v() {
        return (GalleryViewModel) this.viewModel.getValue();
    }
}
