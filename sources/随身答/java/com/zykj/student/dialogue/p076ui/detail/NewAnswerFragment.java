package com.zykj.student.dialogue.p076ui.detail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.blankj.utilcode.util.FileUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentNewAnswerBinding;
import com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7540c;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import com.zykj.view.board.board.AbstractC7666i;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.board.board.C7663f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p025b7.C5122a;
import p025b7.C5154i1;
import p263u5.C9685d;
import p264u6.DialogC9703b;
import p314z6.AbstractC10005c;
import p314z6.AbstractC10006d;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001b\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00101R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\"\u0010O\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010K0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\"\u0010X\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010V0V0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010N¨\u0006["}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "K", "()Z", "", "I", "J", "", "throwable", "d0", "(Ljava/lang/Throwable;)V", "f0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentNewAnswerBinding;", "f", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentNewAnswerBinding;", "binding", "Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", "M", "()Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;", "args", "Lcom/zykj/view/board/board/BoardFragment;", "h", "Lcom/zykj/view/board/board/BoardFragment;", "sketchFragment", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "i", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "uploadDialog", "j", "timeoutDialog", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;", "k", "Lkotlin/Lazy;", "P", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;", "newAnswerViewModel", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "l", "L", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "answerViewModel", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "m", "N", "()Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lu6/b;", "n", "O", "()Lu6/b;", "mCameraForbiddenDialog", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "o", "Landroidx/activity/result/ActivityResultLauncher;", "permissionRequest", "Lkotlin/Function0;", "p", "Lkotlin/jvm/functions/Function0;", "goLessonPreview", "q", "enableCommit", "Landroid/content/Intent;", "r", "shareLauncher", "s", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNewAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,400:1\n42#2,3:401\n106#3,15:404\n172#3,9:427\n49#4,8:419\n*S KotlinDebug\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment\n*L\n59#1:401,3\n65#1:404,15\n68#1:427,9\n66#1:419,8\n*E\n"})
/* loaded from: classes5.dex */
public final class NewAnswerFragment extends Hilt_NewAnswerFragment {

    /* renamed from: t */
    public static final int f11048t = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public DialogueFragmentNewAnswerBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(NewAnswerFragmentArgs.class), new C7516b(this));

    /* renamed from: h, reason: from kotlin metadata */
    public BoardFragment sketchFragment;

    /* renamed from: i, reason: from kotlin metadata */
    public MaterialDialog uploadDialog;

    /* renamed from: j, reason: from kotlin metadata */
    public MaterialDialog timeoutDialog;

    /* renamed from: k, reason: from kotlin metadata */
    public final Lazy newAnswerViewModel;

    /* renamed from: l, reason: from kotlin metadata */
    public final Lazy answerViewModel;

    /* renamed from: m, reason: from kotlin metadata */
    public final Lazy homeViewModel;

    /* renamed from: n, reason: from kotlin metadata */
    public final Lazy mCameraForbiddenDialog;

    /* renamed from: o, reason: from kotlin metadata */
    public final ActivityResultLauncher permissionRequest;

    /* renamed from: p, reason: from kotlin metadata */
    public Function0 goLessonPreview;

    /* renamed from: q, reason: from kotlin metadata */
    public Function0 enableCommit;

    /* renamed from: r, reason: from kotlin metadata */
    public final ActivityResultLauncher shareLauncher;

    /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$b */
    public static final class C7516b implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11079a;

        public C7516b(Fragment fragment) {
            this.f11079a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11079a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11079a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "enable", "Lkotlin/Function0;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2", m13451f = "NewAnswerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2 */
    public static final class C75172 extends SuspendLambda implements Function2<Function0<? extends Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11081a;

        /* renamed from: b */
        public /* synthetic */ Object f11082b;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "throwable", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2$1", m13451f = "NewAnswerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11084a;

            /* renamed from: b */
            public /* synthetic */ Object f11085b;

            /* renamed from: c */
            public final /* synthetic */ NewAnswerFragment f11086c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewAnswerFragment newAnswerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11086c = newAnswerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11086c, continuation);
                anonymousClass1.f11085b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Throwable th, Continuation<? super Unit> continuation) {
                return invoke2(th, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th = (Throwable) this.f11085b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11084a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f11086c.m10423d0(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Throwable th, Continuation continuation) {
                return ((AnonymousClass1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "path", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2$2", m13451f = "NewAnswerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11087a;

            /* renamed from: b */
            public /* synthetic */ Object f11088b;

            /* renamed from: c */
            public final /* synthetic */ NewAnswerFragment f11089c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(NewAnswerFragment newAnswerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11089c = newAnswerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, Continuation continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f11089c, continuation);
                anonymousClass2.f11088b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.f11088b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11087a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (str == null || str.length() == 0) {
                    this.f11089c.m10419J();
                } else {
                    this.f11089c.m10424f0();
                }
                return Unit.INSTANCE;
            }
        }

        public C75172(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0 function0, Continuation continuation) {
            return ((C75172) create(function0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C75172 c75172 = NewAnswerFragment.this.new C75172(continuation);
            c75172.f11082b = obj;
            return c75172;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BoardFragment boardFragment;
            Function0 function0 = (Function0) this.f11082b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11081a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NewAnswerFragment.this.enableCommit = function0;
            BoardFragment boardFragment2 = NewAnswerFragment.this.sketchFragment;
            if (boardFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sketchFragment");
                boardFragment = null;
            } else {
                boardFragment = boardFragment2;
            }
            BoardFragment.m11180v0(boardFragment, false, false, new AnonymousClass1(NewAnswerFragment.this, null), new AnonymousClass2(NewAnswerFragment.this, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$8", m13451f = "NewAnswerFragment.kt", m13452i = {}, m13453l = {ComposerKt.providerMapsKey}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$8 */
    public static final class C75188 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11094a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$8$1", m13451f = "NewAnswerFragment.kt", m13452i = {0}, m13453l = {211}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7540c, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11096a;

            /* renamed from: b */
            public /* synthetic */ Object f11097b;

            /* renamed from: c */
            public final /* synthetic */ NewAnswerFragment f11098c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewAnswerFragment newAnswerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11098c = newAnswerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7540c abstractC7540c, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7540c, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11098c, continuation);
                anonymousClass1.f11097b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7540c abstractC7540c = (AbstractC7540c) this.f11097b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f11096a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (abstractC7540c instanceof AbstractC7540c.a) {
                        this.f11098c.m10418I();
                        AbstractC7540c.a aVar = (AbstractC7540c.a) abstractC7540c;
                        if (aVar.m10507a()) {
                            this.f11098c.m10421L().m10471O();
                            AnswerViewModel answerViewModelM10421L = this.f11098c.m10421L();
                            this.f11097b = SpillingKt.nullOutSpilledVariable(abstractC7540c);
                            this.f11096a = 1;
                            if (answerViewModelM10421L.m10462D(true, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            this.f11098c.m10423d0(aVar.m10508b());
                        }
                    } else {
                        if (!(abstractC7540c instanceof AbstractC7540c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f11098c.m10418I();
                        AbstractC7540c.b bVar = (AbstractC7540c.b) abstractC7540c;
                        if (!bVar.m10509a()) {
                            this.f11098c.m10423d0(bVar.m10510b());
                        } else if (this.f11098c.m10420K()) {
                            this.f11098c.requireActivity().finish();
                        } else {
                            FragmentKt.findNavController(this.f11098c).popBackStack(R.id.home_fragment, false);
                            androidx.fragment.app.FragmentKt.setFragmentResult(this.f11098c, "KEY_REFRESH_HOME_PAGE", BundleKt.bundleOf());
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boxing.boxBoolean(FragmentKt.findNavController(this.f11098c).navigateUp());
                return Unit.INSTANCE;
            }
        }

        public C75188(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return NewAnswerFragment.this.new C75188(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11094a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10491q = NewAnswerFragment.this.m10383P().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewAnswerFragment.this, null);
                this.f11094a = 1;
                if (FlowKt.collectLatest(sharedFlowM10491q, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75188) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public NewAnswerFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.newAnswerViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(NewAnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$viewModels$default$5
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
        final int i9 = R.id.dialogue_detail_main;
        final Lazy lazy2 = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i9);
            }
        });
        this.answerViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy2).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy2).getDefaultViewModelProviderFactory());
            }
        });
        this.homeViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                return (function03 == null || (creationExtras = (CreationExtras) function03.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.mCameraForbiddenDialog = LazyKt.lazy(new Function0() { // from class: o6.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAnswerFragment.m10384Q(this.f15610a);
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: o6.n0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                NewAnswerFragment.m10394a0(this.f15612a, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.permissionRequest = activityResultLauncherRegisterForActivityResult;
        this.shareLauncher = AbstractC10005c.m17367d(this, new Function1() { // from class: o6.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10395b0(this.f15613a, (Uri) obj);
            }
        });
    }

    /* renamed from: N */
    private final HomeViewModel m10381N() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final DialogC9703b m10382O() {
        return (DialogC9703b) this.mCameraForbiddenDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final NewAnswerViewModel m10383P() {
        return (NewAnswerViewModel) this.newAnswerViewModel.getValue();
    }

    /* renamed from: Q */
    public static final DialogC9703b m10384Q(NewAnswerFragment newAnswerFragment) {
        Context contextRequireContext = newAnswerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC9703b(contextRequireContext, 0, 2, null);
    }

    /* renamed from: R */
    public static final Unit m10385R(NewAnswerFragment newAnswerFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("RESULT_KEY_ACTION");
        if (string != null && string.hashCode() == -978461469 && string.equals("RESULT_VALUE_ACTION_EDIT")) {
            C9685d.f17121a.m16163b(newAnswerFragment.m10383P().getFilePath(), newAnswerFragment.requireContext());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final Unit m10386S(NewAnswerFragment newAnswerFragment) {
        BoardFragment boardFragment;
        if (!newAnswerFragment.m10383P().getPreviewImageAdded()) {
            newAnswerFragment.m10383P().m10495u(true);
            String previewImagePath = newAnswerFragment.m10422M().getPreviewImagePath();
            BoardFragment boardFragment2 = null;
            if (previewImagePath != null) {
                BoardFragment boardFragment3 = newAnswerFragment.sketchFragment;
                if (boardFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sketchFragment");
                    boardFragment = null;
                } else {
                    boardFragment = boardFragment3;
                }
                BoardFragment.m11167o0(boardFragment, null, previewImagePath, null, false, null, 29, null);
            } else {
                String[] imagePathList = newAnswerFragment.m10422M().getImagePathList();
                if (imagePathList != null) {
                    BoardFragment boardFragment4 = newAnswerFragment.sketchFragment;
                    if (boardFragment4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sketchFragment");
                    } else {
                        boardFragment2 = boardFragment4;
                    }
                    boardFragment2.m11207p0(ArraysKt.toList(imagePathList), true);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public static final Unit m10387T(NewAnswerFragment newAnswerFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentKt.findNavController(newAnswerFragment).navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m10388U(final NewAnswerFragment newAnswerFragment, final String str) {
        if (str == null) {
            return Unit.INSTANCE;
        }
        newAnswerFragment.goLessonPreview = new Function0() { // from class: o6.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAnswerFragment.m10389V(this.f15596a, str);
            }
        };
        newAnswerFragment.permissionRequest.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m10389V(NewAnswerFragment newAnswerFragment, String str) {
        FragmentKt.findNavController(newAnswerFragment).navigate(R.id.play_lesson_fragment, BundleKt.bundleOf(TuplesKt.m13420to("path", str)));
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m10390W(final NewAnswerFragment newAnswerFragment, final Function0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        newAnswerFragment.m10381N().m10858H(new Function1() { // from class: o6.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10391X(this.f15592a, call, (Boolean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m10391X(NewAnswerFragment newAnswerFragment, Function0 function0, Boolean bool) {
        if (bool == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(newAnswerFragment), null, null, new NewAnswerFragment$onViewCreated$4$1$1(bool.booleanValue(), newAnswerFragment, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final Unit m10392Y(NewAnswerFragment newAnswerFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC10005c.m17369f(newAnswerFragment, newAnswerFragment.shareLauncher);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final Unit m10393Z(NewAnswerFragment newAnswerFragment, String str) {
        if (str == null) {
            return Unit.INSTANCE;
        }
        FragmentKt.findNavController(newAnswerFragment).navigate(R.id.dialogue_sketch_crop_fragment, BundleKt.bundleOf(TuplesKt.m13420to("requestKey", "REQUEST_KEY_RECORD_CROP"), TuplesKt.m13420to("localPath", str)));
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final void m10394a0(NewAnswerFragment newAnswerFragment, Boolean it) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.booleanValue() || (function0 = newAnswerFragment.goLessonPreview) == null) {
            return;
        }
        function0.invoke();
    }

    /* renamed from: b0 */
    public static final Unit m10395b0(NewAnswerFragment newAnswerFragment, Uri uri) throws Throwable {
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String strM17370a = AbstractC10006d.m17370a(uri);
        if (strM17370a != null) {
            BoardFragment boardFragment = newAnswerFragment.sketchFragment;
            if (boardFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sketchFragment");
                boardFragment = null;
            }
            BoardFragment.m11167o0(boardFragment, null, strM17370a, null, true, new Function1() { // from class: o6.f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewAnswerFragment.m10396c0(strM17370a, (String) obj);
                }
            }, 5, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m10396c0(String str, String str2) {
        FileUtils.delete(str);
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m10397e0(NewAnswerFragment newAnswerFragment, Throwable th, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            th = null;
        }
        newAnswerFragment.m10423d0(th);
    }

    /* renamed from: I */
    public final void m10418I() {
        MaterialDialog materialDialog = this.uploadDialog;
        if (materialDialog != null) {
            if (materialDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadDialog");
                materialDialog = null;
            }
            materialDialog.dismiss();
        }
        m10419J();
    }

    /* renamed from: J */
    public final void m10419J() {
        Function0 function0 = this.enableCommit;
        if (function0 != null) {
            function0.invoke();
        }
        this.enableCommit = null;
    }

    /* renamed from: K */
    public final boolean m10420K() {
        Intent intent = requireActivity().getIntent();
        return intent != null && intent.getBooleanExtra("fromOtherApp", false);
    }

    /* renamed from: L */
    public final AnswerViewModel m10421L() {
        return (AnswerViewModel) this.answerViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public final NewAnswerFragmentArgs m10422M() {
        return (NewAnswerFragmentArgs) this.args.getValue();
    }

    /* renamed from: d0 */
    public final void m10423d0(Throwable throwable) {
        String string;
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        if (throwable == null || (string = throwable.getMessage()) == null) {
            string = getString(R.string.dialogue_image_upload_fail);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        xToastUtils.error(string);
    }

    /* renamed from: f0 */
    public final void m10424f0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new NewAnswerFragment$uploadFile$1(this, null), 3, null);
    }

    @Override // com.zykj.student.dialogue.p076ui.detail.Hilt_NewAnswerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentKt.findNavController(this.f11080a).navigateUp();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m10422M().getCourseId().length() == 0) {
            m10421L().m10481w(new AbstractC7538a.a(0L));
        }
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "REQUEST_KEY_RECORD_CROP", new Function2() { // from class: o6.c0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewAnswerFragment.m10385R(this.f15589a, (String) obj, (Bundle) obj2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentNewAnswerBinding dialogueFragmentNewAnswerBindingM9946a = DialogueFragmentNewAnswerBinding.m9946a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentNewAnswerBindingM9946a, "inflate(...)");
        this.binding = dialogueFragmentNewAnswerBindingM9946a;
        if (dialogueFragmentNewAnswerBindingM9946a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentNewAnswerBindingM9946a = null;
        }
        View root = dialogueFragmentNewAnswerBindingM9946a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.sketchFragment = BoardFragment.INSTANCE.m11217a(m10383P().getFilePath(), new C7663f(true, false, true, false, AbstractC10005c.m17365b(), true, true, true, false, AbstractC7666i.a.f12236c, 266, null), new C5154i1(null, false, false, 0, 5, false, false, 111, null), new C5122a(false, new Function1() { // from class: o6.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10387T(this.f15600a, (View) obj);
            }
        }, new C75172(null), new Function1() { // from class: o6.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10388U(this.f15602a, (String) obj);
            }
        }, new Function1() { // from class: o6.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10390W(this.f15604a, (Function0) obj);
            }
        }, new Function1() { // from class: o6.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10392Y(this.f15606a, (Function0) obj);
            }
        }, new Function1() { // from class: o6.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewAnswerFragment.m10393Z(this.f15608a, (String) obj);
            }
        }, new Function0() { // from class: o6.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAnswerFragment.m10386S(this.f15609a);
            }
        }, null, null, null, null, null, 7937, null));
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i9 = R.id.fl_container;
        BoardFragment boardFragment = this.sketchFragment;
        if (boardFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchFragment");
            boardFragment = null;
        }
        fragmentTransactionBeginTransaction.replace(i9, boardFragment).commitNowAllowingStateLoss();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C75188(null), 3, null);
    }
}
