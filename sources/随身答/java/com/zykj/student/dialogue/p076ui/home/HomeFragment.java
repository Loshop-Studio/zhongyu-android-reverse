package com.zykj.student.dialogue.p076ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.taobao.sophix.PatchStatus;
import com.zykj.base.utils.XToastUtils;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.VersionResult;
import com.zykj.student.dialogue.databinding.FragmentMainBinding;
import com.zykj.student.dialogue.p076ui.collect.CollectHistoryFragment;
import com.zykj.student.dialogue.p076ui.home.AbstractC7593a;
import com.zykj.student.dialogue.p076ui.home.AbstractC7594b;
import com.zykj.student.dialogue.p076ui.home.HomeFragment;
import com.zykj.student.dialogue.p076ui.home.category.EditDialogFragmentArgs;
import com.zykj.student.dialogue.p076ui.version.VersionUpgradeDialogFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import p138i6.AbstractC8136b;
import p244s6.C9526k0;
import p244s6.C9530l0;
import p244s6.C9560s2;
import p264u6.DialogC9705d;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-¨\u00063²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/zykj/student/dialogue/ui/home/a;", "drawerType", "", "F", "(Lcom/zykj/student/dialogue/ui/home/a;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "f", "Lkotlin/Lazy;", "P", "()Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;", "g", "O", "()Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;", "filterViewModel", "Lcom/zykj/student/dialogue/databinding/FragmentMainBinding;", "h", "Lcom/zykj/student/dialogue/databinding/FragmentMainBinding;", "binding", "Lu6/d;", "i", "Q", "()Lu6/d;", "mCameraWarningDialog", "Ls6/s2;", "homeUiState", "Ls6/k0;", "listUiState", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 View.kt\nandroidx/core/view/ViewKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n172#2,9:437\n106#2,15:446\n1247#3,6:461\n1247#3,6:467\n1247#3,6:473\n1247#3,6:522\n1247#3,6:528\n1247#3,6:586\n1247#3,6:592\n1247#3,6:598\n1247#3,6:604\n1247#3,6:610\n85#4:479\n85#4:538\n85#4:539\n37#5:480\n36#5,3:481\n70#6:484\n66#6,10:485\n77#6:537\n70#6:548\n66#6,10:549\n77#6:619\n79#7,6:495\n86#7,3:510\n89#7,2:519\n93#7:536\n79#7,6:559\n86#7,3:574\n89#7,2:583\n93#7:618\n347#8,9:501\n356#8:521\n357#8,2:534\n347#8,9:565\n356#8:585\n357#8,2:616\n4206#9,6:513\n4206#9,6:577\n257#10,2:540\n257#10,2:542\n257#10,2:544\n257#10,2:546\n1#11:620\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment\n*L\n59#1:437,9\n60#1:446,15\n357#1:461,6\n365#1:467,6\n402#1:473,6\n113#1:522,6\n116#1:528,6\n167#1:586,6\n174#1:592,6\n185#1:598,6\n188#1:604,6\n196#1:610,6\n107#1:479\n160#1:538\n161#1:539\n124#1:480\n124#1:481,3\n108#1:484\n108#1:485,10\n108#1:537\n162#1:548\n162#1:549,10\n162#1:619\n108#1:495,6\n108#1:510,3\n108#1:519,2\n108#1:536\n162#1:559,6\n162#1:574,3\n162#1:583,2\n162#1:618\n108#1:501,9\n108#1:521\n108#1:534,2\n162#1:565,9\n162#1:585\n162#1:616,2\n108#1:513,6\n162#1:577,6\n189#1:540,2\n190#1:542,2\n191#1:544,2\n192#1:546,2\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeFragment extends Hilt_HomeFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy homeViewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy filterViewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public FragmentMainBinding binding;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy mCameraWarningDialog;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onCreate$1", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_HANDLE_DEX}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onCreate$1 */
    public static final class C75671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11435a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/student/dialogue/bean/resp/VersionResult;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onCreate$1$1", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onCreate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<VersionResult, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11437a;

            /* renamed from: b */
            public /* synthetic */ Object f11438b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11439c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11439c = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(VersionResult versionResult, Continuation continuation) {
                return ((AnonymousClass1) create(versionResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11439c, continuation);
                anonymousClass1.f11438b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                VersionResult versionResult = (VersionResult) this.f11438b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11437a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (versionResult != null) {
                    VersionUpgradeDialogFragment.INSTANCE.m11046a(versionResult).show(this.f11439c.getChildFragmentManager(), VersionUpgradeDialogFragment.class.getSimpleName());
                }
                return Unit.INSTANCE;
            }
        }

        public C75671(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new C75671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11435a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10852B = HomeFragment.this.m10660P().getHasNewVersion();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeFragment.this, null);
                this.f11435a = 1;
                if (FlowKt.collectLatest(sharedFlowM10852B, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11 */
    public static final class C756811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11440a;

        /* renamed from: b */
        public /* synthetic */ Object f11441b;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$1", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {266}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$11$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n1563#2:437\n1634#2,3:438\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$11$1\n*L\n265#1:437\n265#1:438,3\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11443a;

            /* renamed from: b */
            public final /* synthetic */ HomeFragment f11444b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$1$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11445a;

                /* renamed from: b */
                public /* synthetic */ Object f11446b;

                /* renamed from: c */
                public final /* synthetic */ HomeFragment f11447c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(HomeFragment homeFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11447c = homeFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                    return ((AnonymousClass2) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11447c, continuation);
                    anonymousClass2.f11446b = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9560s2 c9560s2 = (C9560s2) this.f11446b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11445a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FragmentMainBinding fragmentMainBinding = this.f11447c.binding;
                    FragmentMainBinding fragmentMainBinding2 = null;
                    if (fragmentMainBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMainBinding = null;
                    }
                    fragmentMainBinding.f10532k.setEnabled(c9560s2.m15751d().isEmpty());
                    FragmentMainBinding fragmentMainBinding3 = this.f11447c.binding;
                    if (fragmentMainBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMainBinding2 = fragmentMainBinding3;
                    }
                    RecyclerView.Adapter adapter = fragmentMainBinding2.f10533l.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11444b = homeFragment;
            }

            /* renamed from: c */
            public static final List m10709c(C9560s2 c9560s2) {
                List listM15751d = c9560s2.m15751d();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15751d, 10));
                Iterator it = listM15751d.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((CatalogResp) it.next()).getId()));
                }
                return arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f11444b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11443a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11444b.m10660P().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return HomeFragment.C756811.AnonymousClass1.m10709c((C9560s2) obj2);
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11444b, null);
                    this.f11443a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
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

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {274}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11448a;

            /* renamed from: b */
            public final /* synthetic */ HomeFragment f11449b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$2$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C100622 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11450a;

                /* renamed from: b */
                public /* synthetic */ Object f11451b;

                /* renamed from: c */
                public final /* synthetic */ HomeFragment f11452c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100622(HomeFragment homeFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11452c = homeFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                    return ((C100622) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100622 c100622 = new C100622(this.f11452c, continuation);
                    c100622.f11451b = obj;
                    return c100622;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9560s2 c9560s2 = (C9560s2) this.f11451b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11450a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FragmentMainBinding fragmentMainBinding = this.f11452c.binding;
                    if (fragmentMainBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMainBinding = null;
                    }
                    fragmentMainBinding.f10532k.setRefreshing(c9560s2.m15758k());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11449b = homeFragment;
            }

            /* renamed from: c */
            public static final boolean m10712c(C9560s2 c9560s2) {
                return c9560s2.m15758k();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f11449b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11448a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11449b.m10660P().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(HomeFragment.C756811.AnonymousClass2.m10712c((C9560s2) obj2));
                        }
                    });
                    C100622 c100622 = new C100622(this.f11449b, null);
                    this.f11448a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, c100622, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$3", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {281}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11453a;

            /* renamed from: b */
            public final /* synthetic */ HomeFragment f11454b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$3$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$11$3$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n360#2,7:437\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$11$3$2\n*L\n284#1:437,7\n*E\n"})
            /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$11$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11455a;

                /* renamed from: b */
                public /* synthetic */ Object f11456b;

                /* renamed from: c */
                public final /* synthetic */ HomeFragment f11457c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(HomeFragment homeFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11457c = homeFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                    return ((AnonymousClass2) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11457c, continuation);
                    anonymousClass2.f11456b = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9560s2 c9560s2 = (C9560s2) this.f11456b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11455a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Long lM15753f = c9560s2.m15753f();
                    if (lM15753f != null) {
                        HomeFragment homeFragment = this.f11457c;
                        long jLongValue = lM15753f.longValue();
                        Iterator it = c9560s2.m15752e().iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            }
                            if (((CatalogResp) it.next()).getId() == jLongValue) {
                                break;
                            }
                            i9++;
                        }
                        FragmentMainBinding fragmentMainBinding = homeFragment.binding;
                        if (fragmentMainBinding == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentMainBinding = null;
                        }
                        fragmentMainBinding.f10533l.setCurrentItem(i9, false);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11454b = homeFragment;
            }

            /* renamed from: c */
            public static final Long m10715c(C9560s2 c9560s2) {
                return c9560s2.m15753f();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f11454b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11453a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f11454b.m10660P().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return HomeFragment.C756811.AnonymousClass3.m10715c((C9560s2) obj2);
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11454b, null);
                    this.f11453a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C756811(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C756811 c756811 = HomeFragment.this.new C756811(continuation);
            c756811.f11441b = obj;
            return c756811;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f11441b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11440a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(HomeFragment.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HomeFragment.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(HomeFragment.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C756811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$12", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {292}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$12 */
    public static final class C756912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11458a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Ls6/s2;", "it", "", "<anonymous>", "(Ls6/s2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$12$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$12$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,436:1\n257#2,2:437\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/zykj/student/dialogue/ui/home/HomeFragment$onViewCreated$12$2\n*L\n293#1:437,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$12$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9560s2, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11460a;

            /* renamed from: b */
            public /* synthetic */ Object f11461b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11462c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11462c = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C9560s2 c9560s2, Continuation continuation) {
                return ((AnonymousClass2) create(c9560s2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11462c, continuation);
                anonymousClass2.f11461b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C9560s2 c9560s2 = (C9560s2) this.f11461b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11460a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentMainBinding fragmentMainBinding = this.f11462c.binding;
                if (fragmentMainBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMainBinding = null;
                }
                ImageView ivAsk = fragmentMainBinding.f10531j;
                Intrinsics.checkNotNullExpressionValue(ivAsk, "ivAsk");
                ivAsk.setVisibility(!c9560s2.m15754g() ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        public C756912(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m10718c(C9560s2 c9560s2) {
            return c9560s2.m15754g();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new C756912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11458a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(HomeFragment.this.m10660P().getHomeUiState(), new Function1() { // from class: com.zykj.student.dialogue.ui.home.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(HomeFragment.C756912.m10718c((C9560s2) obj2));
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomeFragment.this, null);
                this.f11458a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C756912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$13", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {298}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$13 */
    public static final class C757013 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11463a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$13$1", m13451f = "HomeFragment.kt", m13452i = {0}, m13453l = {300}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$13$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7594b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11465a;

            /* renamed from: b */
            public /* synthetic */ Object f11466b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11467c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11467c = homeFragment;
            }

            /* renamed from: g */
            public static final Unit m10721g(HomeFragment homeFragment, AbstractC7594b abstractC7594b) {
                homeFragment.m10706Q().m16224c(((AbstractC7594b.a) abstractC7594b).m10904a());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7594b abstractC7594b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7594b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11467c, continuation);
                anonymousClass1.f11466b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                final AbstractC7594b abstractC7594b = (AbstractC7594b) this.f11466b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11465a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (abstractC7594b instanceof AbstractC7594b.a) {
                        HomeViewModel homeViewModelM10660P = this.f11467c.m10660P();
                        boolean zM10904a = ((AbstractC7594b.a) abstractC7594b).m10904a();
                        final HomeFragment homeFragment = this.f11467c;
                        Function0 function0 = new Function0() { // from class: com.zykj.student.dialogue.ui.home.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeFragment.C757013.AnonymousClass1.m10721g(homeFragment, abstractC7594b);
                            }
                        };
                        this.f11466b = SpillingKt.nullOutSpilledVariable(abstractC7594b);
                        this.f11465a = 1;
                        if (homeViewModelM10660P.m10857G(zM10904a, function0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C757013(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new C757013(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11463a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10854D = HomeFragment.this.m10660P().getHomeEvent();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeFragment.this, null);
                this.f11463a = 1;
                if (FlowKt.collectLatest(sharedFlowM10854D, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C757013) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$14", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {309}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$14 */
    public static final class C757114 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11468a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/http/bean/HeaderBean;", "kotlin.jvm.PlatformType"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$14$2", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$14$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<HeaderBean, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11470a;

            /* renamed from: b */
            public /* synthetic */ Object f11471b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11472c = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(HeaderBean headerBean, Continuation continuation) {
                return ((AnonymousClass2) create(headerBean, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11472c, continuation);
                anonymousClass2.f11471b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                HeaderBean headerBean = (HeaderBean) this.f11471b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11470a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String serverUrl = headerBean.getServerUrl();
                if (serverUrl != null) {
                    this.f11472c.m10660P().m10874w(serverUrl);
                }
                return Unit.INSTANCE;
            }
        }

        public C757114(Continuation continuation) {
            super(2, continuation);
        }

        /* renamed from: c */
        public static final String m10724c(HeaderBean headerBean) {
            return headerBean.getServerUrl();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new C757114(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11468a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowLiveDataConversions.asFlow(HomeFragment.this.m10660P().getHeaderLiveData()), new Function1() { // from class: com.zykj.student.dialogue.ui.home.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeFragment.C757114.m10724c((HeaderBean) obj2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomeFragment.this, null);
                this.f11468a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C757114) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$15", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {TypedValues.AttributesType.TYPE_EASING}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$15 */
    public static final class C757215 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11473a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/message/server/bean/UserInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$15$1", m13451f = "HomeFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$15$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UserInfo, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11475a;

            /* renamed from: b */
            public /* synthetic */ Object f11476b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11477c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeFragment homeFragment, Continuation continuation) {
                super(2, continuation);
                this.f11477c = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(UserInfo userInfo, Continuation continuation) {
                return ((AnonymousClass1) create(userInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11477c, continuation);
                anonymousClass1.f11476b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strM9868c;
                String strM9867b;
                UserInfo userInfo = (UserInfo) this.f11476b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11475a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HomeViewModel homeViewModelM10660P = this.f11477c.m10660P();
                String str = "";
                if (userInfo == null || (strM9868c = userInfo.m9868c()) == null) {
                    strM9868c = "";
                }
                if (userInfo != null && (strM9867b = userInfo.m9867b()) != null) {
                    str = strM9867b;
                }
                homeViewModelM10660P.m10869T(strM9868c, str);
                return Unit.INSTANCE;
            }
        }

        public C757215(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeFragment.this.new C757215(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11473a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowM10856F = HomeFragment.this.m10660P().getUserInfoFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeFragment.this, null);
                this.f11473a = 1;
                if (FlowKt.collectLatest(mutableStateFlowM10856F, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C757215) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HomeFragment() {
        final Function0 function0 = null;
        this.homeViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.filterViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.mCameraWarningDialog = LazyKt.lazy(new Function0() { // from class: s6.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m10661R(this.f16702a);
            }
        });
    }

    /* renamed from: G */
    public static final Unit m10651G(HomeFragment homeFragment) {
        homeFragment.m10660P().m10868S(homeFragment.m10659O().m10636g());
        Long lM15753f = ((C9560s2) homeFragment.m10660P().getHomeUiState().getValue()).m15753f();
        if (lM15753f != null) {
            homeFragment.m10660P().m10860K(new AbstractC7594b.c(lM15753f.longValue()));
        }
        FragmentMainBinding fragmentMainBinding = homeFragment.binding;
        if (fragmentMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding = null;
        }
        fragmentMainBinding.f10529h.closeDrawer(GravityCompat.END);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m10652H(HomeFragment homeFragment, AbstractC7593a abstractC7593a, FilterType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10659O().m10645p(it);
        if (it instanceof FilterType.Sort) {
            FragmentMainBinding fragmentMainBinding = homeFragment.binding;
            if (fragmentMainBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMainBinding = null;
            }
            fragmentMainBinding.f10529h.closeDrawer(GravityCompat.END);
            homeFragment.m10660P().m10872W((FilterType.Sort) it);
        }
        if (it.isCustomTime()) {
            NavDestination currentDestination = FragmentKt.findNavController(homeFragment).getCurrentDestination();
            if (currentDestination != null && currentDestination.getId() == R.id.date_picker_fragment) {
                return Unit.INSTANCE;
            }
            FilterType.Time time = (FilterType.Time) it;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA);
            FragmentKt.findNavController(homeFragment).navigate(R.id.date_picker_fragment, BundleKt.bundleOf(TuplesKt.m13420to("startDate", time.getStartDateTime().length() == 0 ? null : simpleDateFormat.parse(time.getStartDateTime())), TuplesKt.m13420to("endDate", time.getEndDateTime().length() == 0 ? null : simpleDateFormat.parse(time.getEndDateTime())), TuplesKt.m13420to("startTime", time.getStartDateTime().length() == 0 ? null : simpleDateFormat.parse(time.getStartDateTime())), TuplesKt.m13420to("endTime", time.getEndDateTime().length() != 0 ? simpleDateFormat.parse(time.getEndDateTime()) : null), TuplesKt.m13420to("isJoinedTime", Boolean.valueOf(it instanceof FilterType.Time.JoinedTime)), TuplesKt.m13420to("type", Integer.valueOf(Intrinsics.areEqual(abstractC7593a, AbstractC7593a.a.f11728a) ? 1 : 0))));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m10653I(HomeFragment homeFragment, AbstractC7593a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10659O().m10635f(it);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m10654J(HomeFragment homeFragment, AbstractC7593a abstractC7593a, int i9, Composer composer, int i10) {
        homeFragment.m10705F(abstractC7593a, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final HomeFilterViewModel m10659O() {
        return (HomeFilterViewModel) this.filterViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final HomeViewModel m10660P() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* renamed from: R */
    public static final DialogC9705d m10661R(HomeFragment homeFragment) {
        Context contextRequireContext = homeFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC9705d(contextRequireContext, 0, 2, null);
    }

    /* renamed from: S */
    public static final void m10662S(boolean z9, List list, List list2, List list3) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(list2, "<unused var>");
        Intrinsics.checkNotNullParameter(list3, "<unused var>");
        if (z9) {
            return;
        }
        XToastUtils.INSTANCE.warning("未取得存储权限，画板添加图片功能将受到影响");
    }

    /* renamed from: T */
    public static final Unit m10663T(HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435575612, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous> (HomeFragment.kt:143)");
            }
            homeFragment.m10705F(AbstractC7593a.d.f11731a, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m10664U(HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1857078693, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous> (HomeFragment.kt:146)");
            }
            homeFragment.m10705F(AbstractC7593a.b.f11729a, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m10665V(HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710538180, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous> (HomeFragment.kt:149)");
            }
            homeFragment.m10705F(AbstractC7593a.c.f11730a, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m10666W(HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-436002333, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous> (HomeFragment.kt:153)");
            }
            homeFragment.m10705F(AbstractC7593a.a.f11728a, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m10667X(final HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1183288499, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous>.<anonymous> (HomeFragment.kt:159)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(homeFragment.m10660P().getHomeUiState(), null, composer, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(homeFragment.m10660P().getFilterConditions(), null, composer, 0, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (m10668Y(stateCollectAsState).m15754g()) {
                composer.startReplaceGroup(-906049927);
                String strM15750c = m10668Y(stateCollectAsState).m15750c();
                String strM15756i = m10668Y(stateCollectAsState).m15756i();
                boolean zChangedInstance = composer.changedInstance(homeFragment) | composer.changed(stateCollectAsState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: s6.t0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.m10670a0(this.f16714a, stateCollectAsState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean zChangedInstance2 = composer.changedInstance(homeFragment);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: s6.u0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeFragment.m10671b0(this.f16719a);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                HomeScreensKt.m10805M(strM15750c, strM15756i, function0, (Function0) objRememberedValue2, m10668Y(stateCollectAsState).m15757j().size(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-905282057);
                String strM15750c2 = m10668Y(stateCollectAsState).m15750c();
                String strM15755h = m10668Y(stateCollectAsState).m15755h();
                String strM15756i2 = m10668Y(stateCollectAsState).m15756i();
                C9526k0 c9526k0M10669Z = m10669Z(stateCollectAsState2);
                Long lM15753f = m10668Y(stateCollectAsState).m15753f();
                boolean zChangedInstance3 = composer.changedInstance(homeFragment);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: s6.v0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.m10672c0(this.f16724a, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                boolean zChangedInstance4 = composer.changedInstance(homeFragment);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: s6.w0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.m10673d0(this.f16728a, (AbstractC7593a) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function1 function12 = (Function1) objRememberedValue4;
                boolean zChangedInstance5 = composer.changedInstance(homeFragment);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: s6.x0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeFragment.m10674e0(this.f16736a, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                HomeScreensKt.m10807O(strM15750c2, strM15755h, strM15756i2, lM15753f, c9526k0M10669Z, function1, function12, (Function1) objRememberedValue5, composer, 0);
                composer.endReplaceGroup();
            }
            DividerKt.m19241Divider9IZ8Weo(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter()), C3115Dp.m23994constructorimpl(1.0f), ColorKt.Color(436207616), composer, 432, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final C9560s2 m10668Y(State state) {
        return (C9560s2) state.getValue();
    }

    /* renamed from: Z */
    public static final C9526k0 m10669Z(State state) {
        return (C9526k0) state.getValue();
    }

    /* renamed from: a0 */
    public static final Unit m10670a0(HomeFragment homeFragment, State state) {
        homeFragment.m10660P().m10860K(new AbstractC7594b.b(m10668Y(state).m15757j()));
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m10671b0(HomeFragment homeFragment) {
        homeFragment.m10660P().m10875x();
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m10672c0(HomeFragment homeFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10660P().m10862M(it);
        return Unit.INSTANCE;
    }

    /* renamed from: d0 */
    public static final Unit m10673d0(HomeFragment homeFragment, AbstractC7593a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentMainBinding fragmentMainBinding = homeFragment.binding;
        FragmentMainBinding fragmentMainBinding2 = null;
        if (fragmentMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding = null;
        }
        ComposeView composeDrawerSort = fragmentMainBinding.f10525d;
        Intrinsics.checkNotNullExpressionValue(composeDrawerSort, "composeDrawerSort");
        composeDrawerSort.setVisibility(Intrinsics.areEqual(it, AbstractC7593a.c.f11730a) ? 0 : 8);
        FragmentMainBinding fragmentMainBinding3 = homeFragment.binding;
        if (fragmentMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding3 = null;
        }
        ComposeView composeDrawerSubject = fragmentMainBinding3.f10526e;
        Intrinsics.checkNotNullExpressionValue(composeDrawerSubject, "composeDrawerSubject");
        composeDrawerSubject.setVisibility(Intrinsics.areEqual(it, AbstractC7593a.d.f11731a) ? 0 : 8);
        FragmentMainBinding fragmentMainBinding4 = homeFragment.binding;
        if (fragmentMainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding4 = null;
        }
        ComposeView composeDrawerFilter = fragmentMainBinding4.f10524c;
        Intrinsics.checkNotNullExpressionValue(composeDrawerFilter, "composeDrawerFilter");
        composeDrawerFilter.setVisibility(Intrinsics.areEqual(it, AbstractC7593a.b.f11729a) ? 0 : 8);
        FragmentMainBinding fragmentMainBinding5 = homeFragment.binding;
        if (fragmentMainBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding5 = null;
        }
        ComposeView composeDrawerFavoriteFilter = fragmentMainBinding5.f10523b;
        Intrinsics.checkNotNullExpressionValue(composeDrawerFavoriteFilter, "composeDrawerFavoriteFilter");
        composeDrawerFavoriteFilter.setVisibility(Intrinsics.areEqual(it, AbstractC7593a.a.f11728a) ? 0 : 8);
        FragmentMainBinding fragmentMainBinding6 = homeFragment.binding;
        if (fragmentMainBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding6 = null;
        }
        DrawerLayout drawerLayout = fragmentMainBinding6.f10529h;
        FragmentMainBinding fragmentMainBinding7 = homeFragment.binding;
        if (fragmentMainBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMainBinding2 = fragmentMainBinding7;
        }
        drawerLayout.openDrawer(fragmentMainBinding2.f10530i);
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final Unit m10674e0(HomeFragment homeFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10660P().m10861L(it);
        return Unit.INSTANCE;
    }

    /* renamed from: f0 */
    public static final Unit m10675f0(final HomeFragment homeFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10660P().m10859J(new Function1() { // from class: s6.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m10677g0(this.f16583a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: g0 */
    public static final Unit m10677g0(HomeFragment homeFragment, boolean z9) {
        FragmentKt.findNavController(homeFragment).navigate(AbstractC7629i.f11875a.m11033a(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: h0 */
    public static final void m10679h0(HomeFragment homeFragment) {
        homeFragment.m10660P().m10870U(true);
        homeFragment.m10660P().m10877z();
        homeFragment.m10659O().m10637h();
    }

    /* renamed from: i0 */
    public static final Unit m10681i0(HomeFragment homeFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        homeFragment.m10659O().m10644o(bundle.getBoolean("isJoinedTime"), bundle.getBoolean("isCanceled"), bundle.getString("startDateTime"), bundle.getString("endDateTime"), bundle.getInt("type"));
        return Unit.INSTANCE;
    }

    /* renamed from: j0 */
    public static final Unit m10683j0(HomeFragment homeFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        homeFragment.m10660P().m10877z();
        return Unit.INSTANCE;
    }

    /* renamed from: k0 */
    public static final Unit m10685k0(HomeFragment homeFragment, String str, Bundle bundle) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        homeFragment.m10660P().m10862M("");
        homeFragment.m10659O().m10641l();
        homeFragment.m10660P().m10864O();
        Iterator it = ((C9560s2) homeFragment.m10660P().getHomeUiState().getValue()).m15751d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CatalogResp) next).inDiscussing()) {
                break;
            }
        }
        CatalogResp catalogResp = (CatalogResp) next;
        if (catalogResp != null) {
            Long lM15753f = ((C9560s2) homeFragment.m10660P().getHomeUiState().getValue()).m15753f();
            long id = catalogResp.getId();
            if (lM15753f != null && lM15753f.longValue() == id) {
                homeFragment.m10660P().m10860K(new AbstractC7594b.c(catalogResp.getId()));
            } else {
                homeFragment.m10660P().m10873v(catalogResp);
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l0 */
    public static final Unit m10687l0(final HomeFragment homeFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-481325622, i9, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.<anonymous>.<anonymous> (HomeFragment.kt:106)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(homeFragment.m10660P().getHomeUiState(), null, composer, 0, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z9 = !m10689m0(stateCollectAsState).m15754g();
            List listM15751d = m10689m0(stateCollectAsState).m15751d();
            Long lM15753f = m10689m0(stateCollectAsState).m15753f();
            boolean zChangedInstance = composer.changedInstance(homeFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s6.d1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeFragment.m10691n0(this.f16555a, (CatalogResp) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(homeFragment) | composer.changed(stateCollectAsState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: s6.e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFragment.m10693o0(this.f16576a, stateCollectAsState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            HomeScreensKt.m10796D(z9, listM15751d, lM15753f, function1, (Function0) objRememberedValue2, composer, 0);
            DividerKt.m19241Divider9IZ8Weo(boxScopeInstance.align(SizeKt.m18166width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), C3115Dp.m23994constructorimpl(1.0f)), companion2.getCenterEnd()), 0.0f, ColorKt.Color(436207616), composer, 384, 2);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m0 */
    public static final C9560s2 m10689m0(State state) {
        return (C9560s2) state.getValue();
    }

    /* renamed from: n0 */
    public static final Unit m10691n0(HomeFragment homeFragment, CatalogResp it) {
        Intrinsics.checkNotNullParameter(it, "it");
        homeFragment.m10660P().m10873v(it);
        return Unit.INSTANCE;
    }

    /* renamed from: o0 */
    public static final Unit m10693o0(HomeFragment homeFragment, State state) {
        int i9 = R.id.edit_category_dialog_fragment;
        NavDestination currentDestination = FragmentKt.findNavController(homeFragment).getCurrentDestination();
        if (currentDestination != null && currentDestination.getId() == i9) {
            return Unit.INSTANCE;
        }
        FragmentKt.findNavController(homeFragment).navigate(i9, new EditDialogFragmentArgs((CatalogResp[]) m10689m0(state).m15751d().toArray(new CatalogResp[0])).m10963b());
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public final void m10705F(final AbstractC7593a abstractC7593a, Composer composer, final int i9) {
        int i10;
        final AbstractC7593a abstractC7593a2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-839853824);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(abstractC7593a) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-839853824, i10, -1, "com.zykj.student.dialogue.ui.home.HomeFragment.MultiDrawer (HomeFragment.kt:350)");
            }
            boolean zAreEqual = Intrinsics.areEqual(abstractC7593a, AbstractC7593a.a.f11728a);
            C9530l0 c9530l0M10636g = m10659O().m10636g();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFragment.m10651G(this.f16743a);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            int i11 = i10 & 14;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | (i11 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s6.z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeFragment.m10652H(this.f16755a, abstractC7593a, (FilterType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: s6.b1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeFragment.m10653I(this.f16535a, (AbstractC7593a) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            abstractC7593a2 = abstractC7593a;
            DrawerContentKt.m10600p(abstractC7593a2, c9530l0M10636g, zAreEqual, function0, function1, (Function1) objRememberedValue3, composerStartRestartGroup, i11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            abstractC7593a2 = abstractC7593a;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeFragment.m10654J(this.f16540a, abstractC7593a2, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Q */
    public final DialogC9705d m10706Q() {
        return (DialogC9705d) this.mCameraWarningDialog.getValue();
    }

    @Override // com.zykj.student.dialogue.p076ui.home.Hilt_HomeFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentMainBinding fragmentMainBinding = this.f11434a.binding;
                FragmentMainBinding fragmentMainBinding2 = null;
                if (fragmentMainBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMainBinding = null;
                }
                if (fragmentMainBinding.f10529h.isDrawerOpen(GravityCompat.END)) {
                    FragmentMainBinding fragmentMainBinding3 = this.f11434a.binding;
                    if (fragmentMainBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMainBinding2 = fragmentMainBinding3;
                    }
                    fragmentMainBinding2.f10529h.closeDrawer(GravityCompat.END);
                    return;
                }
                if (((C9560s2) this.f11434a.m10660P().getHomeUiState().getValue()).m15754g()) {
                    this.f11434a.m10660P().m10875x();
                    return;
                }
                setEnabled(false);
                this.f11434a.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                setEnabled(true);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new C75671(null), 3, null);
        PermissionUtils.permission(PermissionConstants.STORAGE).callback(new PermissionUtils.SingleCallback() { // from class: s6.r0
            @Override // com.blankj.utilcode.util.PermissionUtils.SingleCallback
            public final void callback(boolean z9, List list, List list2, List list3) {
                HomeFragment.m10662S(z9, list, list2, list3);
            }
        }).request();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentMainBinding fragmentMainBindingM9963c = FragmentMainBinding.m9963c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentMainBindingM9963c, "inflate(...)");
        this.binding = fragmentMainBindingM9963c;
        if (fragmentMainBindingM9963c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBindingM9963c = null;
        }
        FrameLayout frameLayoutM9964b = fragmentMainBindingM9963c.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM9964b, "getRoot(...)");
        return frameLayoutM9964b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentMainBinding fragmentMainBinding = this.binding;
        if (fragmentMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding = null;
        }
        fragmentMainBinding.f10529h.setDrawerLockMode(1);
        FragmentMainBinding fragmentMainBinding2 = this.binding;
        if (fragmentMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding2 = null;
        }
        fragmentMainBinding2.f10527f.setContent(ComposableLambdaKt.composableLambdaInstance(-481325622, true, new Function2() { // from class: s6.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10687l0(this.f16678a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding3 = this.binding;
        if (fragmentMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding3 = null;
        }
        fragmentMainBinding3.f10526e.setContent(ComposableLambdaKt.composableLambdaInstance(435575612, true, new Function2() { // from class: s6.g1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10663T(this.f16601a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding4 = this.binding;
        if (fragmentMainBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding4 = null;
        }
        fragmentMainBinding4.f10524c.setContent(ComposableLambdaKt.composableLambdaInstance(1857078693, true, new Function2() { // from class: s6.h1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10664U(this.f16606a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding5 = this.binding;
        if (fragmentMainBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding5 = null;
        }
        fragmentMainBinding5.f10525d.setContent(ComposableLambdaKt.composableLambdaInstance(710538180, true, new Function2() { // from class: s6.i1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10665V(this.f16611a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding6 = this.binding;
        if (fragmentMainBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding6 = null;
        }
        fragmentMainBinding6.f10523b.setContent(ComposableLambdaKt.composableLambdaInstance(-436002333, true, new Function2() { // from class: s6.j1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10666W(this.f16618a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding7 = this.binding;
        if (fragmentMainBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding7 = null;
        }
        fragmentMainBinding7.f10528g.setContent(ComposableLambdaKt.composableLambdaInstance(1183288499, true, new Function2() { // from class: s6.k1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10667X(this.f16633a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        FragmentMainBinding fragmentMainBinding8 = this.binding;
        if (fragmentMainBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding8 = null;
        }
        fragmentMainBinding8.f10529h.addDrawerListener(new DrawerLayout.SimpleDrawerListener() { // from class: com.zykj.student.dialogue.ui.home.HomeFragment.onViewCreated.7
            @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(View drawerView) {
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                super.onDrawerClosed(drawerView);
                HomeFragment.this.m10659O().m10642m((C9526k0) HomeFragment.this.m10660P().getFilterConditions().getValue());
            }
        });
        FragmentMainBinding fragmentMainBinding9 = this.binding;
        if (fragmentMainBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding9 = null;
        }
        ImageView ivAsk = fragmentMainBinding9.f10531j;
        Intrinsics.checkNotNullExpressionValue(ivAsk, "ivAsk");
        AbstractC8136b.m13040h(ivAsk, new Function1() { // from class: s6.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m10675f0(this.f16651a, (View) obj);
            }
        });
        FragmentMainBinding fragmentMainBinding10 = this.binding;
        if (fragmentMainBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding10 = null;
        }
        ViewPager2 viewPager2 = fragmentMainBinding10.f10533l;
        viewPager2.setUserInputEnabled(false);
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.zykj.student.dialogue.ui.home.HomeFragment$onViewCreated$9$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public boolean containsItem(long itemId) {
                List listM15752e = ((C9560s2) this.f11479a.m10660P().getHomeUiState().getValue()).m15752e();
                if (listM15752e != null && listM15752e.isEmpty()) {
                    return false;
                }
                Iterator it = listM15752e.iterator();
                while (it.hasNext()) {
                    if (((CatalogResp) it.next()).getId() == itemId) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int position) {
                CatalogResp catalogResp = (CatalogResp) ((C9560s2) this.f11479a.m10660P().getHomeUiState().getValue()).m15752e().get(position);
                return catalogResp.getId() == CatalogResp.INSTANCE.getHISTORY_COLLECT().getId() ? new CollectHistoryFragment() : HomePagerFragment.INSTANCE.m10750a(catalogResp.getId());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return ((C9560s2) this.f11479a.m10660P().getHomeUiState().getValue()).m15752e().size();
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public long getItemId(int position) {
                return ((CatalogResp) ((C9560s2) this.f11479a.m10660P().getHomeUiState().getValue()).m15752e().get(position)).getId();
            }
        });
        FragmentMainBinding fragmentMainBinding11 = this.binding;
        if (fragmentMainBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMainBinding11 = null;
        }
        fragmentMainBinding11.f10532k.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: s6.m1
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                HomeFragment.m10679h0(this.f16654a);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C756811(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C756912(null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C757013(null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C757114(null), 3, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new C757215(null), 3, null);
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "date_picker_result", new Function2() { // from class: s6.n1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10681i0(this.f16663a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "KEY_REFRESH_TAB", new Function2() { // from class: s6.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10683j0(this.f16688a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "KEY_REFRESH_HOME_PAGE", new Function2() { // from class: s6.a1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeFragment.m10685k0(this.f16528a, (String) obj, (Bundle) obj2);
            }
        });
    }
}
