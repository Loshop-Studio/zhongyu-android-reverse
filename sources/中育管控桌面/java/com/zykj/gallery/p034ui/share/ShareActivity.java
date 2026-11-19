package com.zykj.gallery.p034ui.share;

import android.content.Intent;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
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
import com.zykj.gallery.p034ui.share.ShareActivity;
import com.zykj.gallery.p034ui.share.page.AbstractC6037b;
import com.zykj.gallery.p034ui.share.page.AbstractC6038c;
import com.zykj.gallery.p034ui.share.page.ShareViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p070h3.AbstractC6457b0;
import p070h3.AbstractC6459c0;
import p070h3.AbstractC6479v;
import p070h3.C6461d0;
import p114n3.AbstractC7464e;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m7880d2 = {"Lcom/zykj/gallery/ui/share/ShareActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/zykj/gallery/ui/share/page/ShareViewModel;", "e", "Lkotlin/Lazy;", "v", "()Lcom/zykj/gallery/ui/share/page/ShareViewModel;", "viewModel", "", "f", "Ljava/lang/String;", "KEY_WANT_CAMERA", "g", "KEY_ENABLE_CAMERA", "Lh3/d0;", "detailData", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareActivity.kt\ncom/zykj/gallery/ui/share/ShareActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,127:1\n70#2,11:128\n85#3:139\n1247#4,6:140\n*S KotlinDebug\n*F\n+ 1 ShareActivity.kt\ncom/zykj/gallery/ui/share/ShareActivity\n*L\n39#1:128,11\n84#1:139\n63#1:140,6\n*E\n"})
/* loaded from: classes4.dex */
public final class ShareActivity extends Hilt_ShareActivity {

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: f, reason: from kotlin metadata */
    public final String KEY_WANT_CAMERA = "KEY_WANT_CAMERA";

    /* renamed from: g, reason: from kotlin metadata */
    public final String KEY_ENABLE_CAMERA = "KEY_ENABLE_CAMERA";

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.ui.share.ShareActivity$onCreate$2", m7918f = "ShareActivity.kt", m7919i = {}, m7920l = {101}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.gallery.ui.share.ShareActivity$onCreate$2 */
    public static final class C60342 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f5908a;

        @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.gallery.ui.share.ShareActivity$onCreate$2$1", m7918f = "ShareActivity.kt", m7919i = {}, m7920l = {102}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.gallery.ui.share.ShareActivity$onCreate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f5910a;

            /* renamed from: b */
            public final /* synthetic */ ShareActivity f5911b;

            /* renamed from: com.zykj.gallery.ui.share.ShareActivity$onCreate$2$1$a */
            public static final class a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ ShareActivity f5912a;

                public a(ShareActivity shareActivity) {
                    this.f5912a = shareActivity;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC6037b abstractC6037b, Continuation continuation) {
                    if (abstractC6037b instanceof AbstractC6037b.a) {
                        Intent intent = new Intent();
                        intent.putExtra(this.f5912a.KEY_WANT_CAMERA, true);
                        this.f5912a.setResult(-1, intent);
                        this.f5912a.overridePendingTransition(0, 0);
                        this.f5912a.finish();
                    } else {
                        if (!(abstractC6037b instanceof AbstractC6037b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intent intent2 = new Intent();
                        intent2.setData(((AbstractC6037b.b) abstractC6037b).m5158a());
                        intent2.addFlags(1);
                        this.f5912a.setResult(-1, intent2);
                        this.f5912a.finish();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShareActivity shareActivity, Continuation continuation) {
                super(2, continuation);
                this.f5911b = shareActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f5911b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.f5910a;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowM5149f = this.f5911b.m5142v().getShareUriEvent();
                    a aVar = new a(this.f5911b);
                    this.f5910a = 1;
                    if (flowM5149f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C60342(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShareActivity.this.new C60342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f5908a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                ShareActivity shareActivity = ShareActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(shareActivity, null);
                this.f5908a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(shareActivity, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ShareActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.gallery.ui.share.ShareActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.gallery.ui.share.ShareActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.gallery.ui.share.ShareActivity$special$$inlined$viewModels$default$3
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
    public static final Unit m5125A(NavHostController navHostController, ShareActivity shareActivity, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(782720714, i6, -1, "com.zykj.gallery.ui.share.ShareActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareActivity.kt:66)");
        }
        AbstractC6038c.m5168J(navHostController, shareActivity.m5142v(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m5126B(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setDefaultValue(AbstractC6457b0.m7101d(AbstractC6459c0.a.f8221g));
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m5127C(ShareActivity shareActivity, NavHostController navHostController, AnimatedContentScope composable, NavBackStackEntry entry, Composer composer, int i6) {
        AbstractC6459c0 abstractC6459c0M7099b;
        String string;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-659603277, i6, -1, "com.zykj.gallery.ui.share.ShareActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareActivity.kt:83)");
        }
        State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(shareActivity.m5142v().getDetailData(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
        Bundle arguments = entry.getArguments();
        if (arguments == null || (string = arguments.getString("Detail_KEY_MODE")) == null || (abstractC6459c0M7099b = AbstractC6457b0.m7099b(string)) == null) {
            abstractC6459c0M7099b = AbstractC6459c0.a.f8221g;
        }
        AbstractC6479v.m7163v(navHostController, m5128D(stateCollectAsStateWithLifecycle), abstractC6459c0M7099b, null, null, null, composer, 0, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final C6461d0 m5128D(State state) {
        return (C6461d0) state.getValue();
    }

    /* renamed from: w */
    public static final Unit m5138w(final ShareActivity shareActivity, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2065963632, i6, -1, "com.zykj.gallery.ui.share.ShareActivity.onCreate.<anonymous> (ShareActivity.kt:51)");
            }
            AbstractC7464e.m8521c(false, false, ComposableLambdaKt.rememberComposableLambda(-1147012546, true, new Function2() { // from class: l3.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShareActivity.m5139x(this.f9278a, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit m5139x(final ShareActivity shareActivity, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147012546, i6, -1, "com.zykj.gallery.ui.share.ShareActivity.onCreate.<anonymous>.<anonymous> (ShareActivity.kt:52)");
            }
            ScaffoldKt.m12068ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-907718899, true, new Function3() { // from class: l3.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ShareActivity.m5140y(this.f9279a, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
    public static final Unit m5140y(final ShareActivity shareActivity, PaddingValues innerPadding, Composer composer, int i6) {
        int i7;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        if ((i6 & 6) == 0) {
            i7 = i6 | (composer.changed(innerPadding) ? 4 : 2);
        } else {
            i7 = i6;
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-907718899, i7, -1, "com.zykj.gallery.ui.share.ShareActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ShareActivity.kt:54)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
            boolean zChangedInstance = composer.changedInstance(navHostControllerRememberNavController) | composer.changedInstance(shareActivity);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: l3.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShareActivity.m5141z(navHostControllerRememberNavController, shareActivity, (NavGraphBuilder) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            NavHostKt.NavHost(navHostControllerRememberNavController, "Share", modifierPadding, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer, 48, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m5141z(final NavHostController navHostController, final ShareActivity shareActivity, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, "Share", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(782720714, true, new Function4() { // from class: l3.e
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ShareActivity.m5125A(navHostController, shareActivity, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "Detail/{Detail_KEY_MODE}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("Detail_KEY_MODE", new Function1() { // from class: l3.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareActivity.m5126B((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-659603277, true, new Function4() { // from class: l3.g
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ShareActivity.m5127C(this.f9284a, navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.gallery.p034ui.share.Hilt_ShareActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m5142v().m5152i(getIntent().getBooleanExtra(this.KEY_ENABLE_CAMERA, false));
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-2065963632, true, new Function2() { // from class: l3.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShareActivity.m5138w(this.f9277a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60342(null), 3, null);
    }

    /* renamed from: v */
    public final ShareViewModel m5142v() {
        return (ShareViewModel) this.viewModel.getValue();
    }
}
