package com.zykj.student.dialogue.p076ui.home.category;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentUpdateCategoryBinding;
import com.zykj.student.dialogue.p076ui.home.category.AbstractC7619a;
import com.zykj.student.dialogue.p076ui.home.category.UpdateCategoryFragment;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p138i6.AbstractC8136b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0094@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentUpdateCategoryBinding;", "<init>", "()V", "", "layoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "f", "Lkotlin/Lazy;", "k", "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", "j", "()Lcom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nUpdateCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,56:1\n172#2,9:57\n42#3,3:66\n*S KotlinDebug\n*F\n+ 1 UpdateCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment\n*L\n22#1:57,9\n23#1:66,3\n*E\n"})
/* loaded from: classes5.dex */
public final class UpdateCategoryFragment extends Hilt_UpdateCategoryFragment<DialogueFragmentUpdateCategoryBinding> {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(UpdateCategoryFragmentArgs.class), new C7616a(this));

    /* renamed from: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$a */
    public static final class C7616a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11841a;

        public C7616a(Fragment fragment) {
            this.f11841a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11841a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11841a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$initView$3", m13451f = "UpdateCategoryFragment.kt", m13452i = {}, m13453l = {41}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$initView$3 */
    public static final class C76173 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11842a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/a;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/category/a;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$initView$3$1", m13451f = "UpdateCategoryFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$initView$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7619a, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11844a;

            /* renamed from: b */
            public /* synthetic */ Object f11845b;

            /* renamed from: c */
            public final /* synthetic */ UpdateCategoryFragment f11846c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpdateCategoryFragment updateCategoryFragment, Continuation continuation) {
                super(2, continuation);
                this.f11846c = updateCategoryFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7619a abstractC7619a, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7619a, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11846c, continuation);
                anonymousClass1.f11845b = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7619a abstractC7619a = (AbstractC7619a) this.f11845b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11844a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (abstractC7619a instanceof AbstractC7619a.b) {
                    ((DialogueFragmentUpdateCategoryBinding) this.f11846c.getMBindView()).f10479a.setEnabled(true);
                    if (((AbstractC7619a.b) abstractC7619a).m10989a()) {
                        FragmentKt.setFragmentResult(this.f11846c, "RefreshList", new Bundle());
                        androidx.navigation.fragment.FragmentKt.findNavController(this.f11846c).navigateUp();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C76173(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UpdateCategoryFragment.this.new C76173(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11842a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10949v = UpdateCategoryFragment.this.m10980k().getCategoryResultEvent();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdateCategoryFragment.this, null);
                this.f11842a = 1;
                if (FlowKt.collectLatest(sharedFlowM10949v, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C76173) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public UpdateCategoryFragment() {
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.category.UpdateCategoryFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final EditCategoryViewModel m10980k() {
        return (EditCategoryViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static final Unit m10981l(UpdateCategoryFragment updateCategoryFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Editable text = ((DialogueFragmentUpdateCategoryBinding) updateCategoryFragment.getMBindView()).f10480b.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (TextUtils.isEmpty(StringsKt.trim(text))) {
            XToastUtils.INSTANCE.warning("分类不能为空");
            return Unit.INSTANCE;
        }
        it.setEnabled(false);
        EditCategoryViewModel editCategoryViewModelM10980k = updateCategoryFragment.m10980k();
        long id = updateCategoryFragment.m10983j().getCategory().getId();
        Editable text2 = ((DialogueFragmentUpdateCategoryBinding) updateCategoryFragment.getMBindView()).f10480b.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        editCategoryViewModelM10980k.m10944E(id, StringsKt.trim(text2).toString());
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m10982m(UpdateCategoryFragment updateCategoryFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        androidx.navigation.fragment.FragmentKt.findNavController(updateCategoryFragment).navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        TextView cvSave = ((DialogueFragmentUpdateCategoryBinding) getMBindView()).f10479a;
        Intrinsics.checkNotNullExpressionValue(cvSave, "cvSave");
        AbstractC8136b.m13040h(cvSave, new Function1() { // from class: t6.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateCategoryFragment.m10981l(this.f16916a, (View) obj);
            }
        });
        ((DialogueFragmentUpdateCategoryBinding) getMBindView()).f10480b.setText(m10983j().getCategory().getName());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C76173(null), 3, null);
        ImageView ivBack = ((DialogueFragmentUpdateCategoryBinding) getMBindView()).f10481c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC8136b.m13040h(ivBack, new Function1() { // from class: t6.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateCategoryFragment.m10982m(this.f16917a, (View) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final UpdateCategoryFragmentArgs m10983j() {
        return (UpdateCategoryFragmentArgs) this.args.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.dialogue_fragment_update_category;
    }
}
