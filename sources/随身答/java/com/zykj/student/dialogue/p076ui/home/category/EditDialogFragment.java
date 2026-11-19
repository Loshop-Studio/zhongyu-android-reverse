package com.zykj.student.dialogue.p076ui.home.category;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.R$dimen;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueDialogEditBinding;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0094@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragment;", "Lcom/zykj/base/BaseDialogFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueDialogEditBinding;", "<init>", "()V", "", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutId", "()I", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDestroy", "Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", "h", "()Lcom/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs;", "args", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "g", "Lkotlin/Lazy;", "i", "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "viewModel", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/category/EditDialogFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,65:1\n42#2,3:66\n172#3,9:69\n*S KotlinDebug\n*F\n+ 1 EditDialogFragment.kt\ncom/zykj/student/dialogue/ui/home/category/EditDialogFragment\n*L\n21#1:66,3\n22#1:69,9\n*E\n"})
/* loaded from: classes5.dex */
public final class EditDialogFragment extends Hilt_EditDialogFragment<DialogueDialogEditBinding> {

    /* renamed from: f, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(EditDialogFragmentArgs.class), new C7610a(this));

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$a */
    public static final class C7610a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11812a;

        public C7610a(Fragment fragment) {
            this.f11812a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11812a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11812a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditDialogFragment$initView$2", m13451f = "EditDialogFragment.kt", m13452i = {}, m13453l = {52}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$initView$2 */
    public static final class C76112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11813a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditDialogFragment$initView$2$1", m13451f = "EditDialogFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11815a;

            /* renamed from: b */
            public final /* synthetic */ EditDialogFragment f11816b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EditDialogFragment editDialogFragment, Continuation continuation) {
                super(2, continuation);
                this.f11816b = editDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f11816b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11815a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentKt.findNavController(this.f11816b).navigateUp();
                return Unit.INSTANCE;
            }

            public final Object invoke(boolean z9, Continuation continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C76112(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditDialogFragment.this.new C76112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11813a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10950w = EditDialogFragment.this.m10960i().getDismissDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EditDialogFragment.this, null);
                this.f11813a = 1;
                if (FlowKt.collectLatest(sharedFlowM10950w, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C76112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EditDialogFragment() {
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.category.EditDialogFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final EditDialogFragmentArgs m10959h() {
        return (EditDialogFragmentArgs) this.args.getValue();
    }

    /* renamed from: i */
    public final EditCategoryViewModel m10960i() {
        return (EditCategoryViewModel) this.viewModel.getValue();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        m10960i().m10943D(ArraysKt.toList(m10959h().getCategoryList()));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C76112(null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.dialogue_dialog_edit;
    }

    @Override // com.zykj.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m10960i().m10940A(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (m10960i().getTabChanged()) {
            androidx.fragment.app.FragmentKt.setFragmentResult(this, "KEY_REFRESH_TAB", new Bundle());
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setType(1000);
            window.setLayout((int) getResources().getDimension(R$dimen.view_216), (int) getResources().getDimension(R$dimen.view_234));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }
}
