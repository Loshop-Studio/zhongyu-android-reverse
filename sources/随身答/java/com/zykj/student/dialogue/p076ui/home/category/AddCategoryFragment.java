package com.zykj.student.dialogue.p076ui.home.category;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentEditNewBinding;
import com.zykj.student.dialogue.p076ui.home.category.AbstractC7619a;
import com.zykj.student.dialogue.p076ui.home.category.AddCategoryFragment;
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
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0094@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/AddCategoryFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentEditNewBinding;", "<init>", "()V", "", "layoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "f", "Lkotlin/Lazy;", "j", "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "viewModel", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAddCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/AddCategoryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,53:1\n172#2,9:54\n*S KotlinDebug\n*F\n+ 1 AddCategoryFragment.kt\ncom/zykj/student/dialogue/ui/home/category/AddCategoryFragment\n*L\n21#1:54,9\n*E\n"})
/* loaded from: classes5.dex */
public final class AddCategoryFragment extends Hilt_AddCategoryFragment<DialogueFragmentEditNewBinding> {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy viewModel;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$initView$3", m13451f = "AddCategoryFragment.kt", m13452i = {}, m13453l = {38}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$initView$3 */
    public static final class C75993 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11740a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/a;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/category/a;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$initView$3$1", m13451f = "AddCategoryFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$initView$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7619a, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11742a;

            /* renamed from: b */
            public /* synthetic */ Object f11743b;

            /* renamed from: c */
            public final /* synthetic */ AddCategoryFragment f11744c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AddCategoryFragment addCategoryFragment, Continuation continuation) {
                super(2, continuation);
                this.f11744c = addCategoryFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7619a abstractC7619a, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7619a, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11744c, continuation);
                anonymousClass1.f11743b = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7619a abstractC7619a = (AbstractC7619a) this.f11743b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11742a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (abstractC7619a instanceof AbstractC7619a.a) {
                    ((DialogueFragmentEditNewBinding) this.f11744c.getMBindView()).f10458a.setEnabled(true);
                    if (((AbstractC7619a.a) abstractC7619a).m10988a()) {
                        FragmentKt.setFragmentResult(this.f11744c, "RefreshList", new Bundle());
                        androidx.navigation.fragment.FragmentKt.findNavController(this.f11744c).navigateUp();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C75993(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddCategoryFragment.this.new C75993(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11740a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10949v = AddCategoryFragment.this.m10910j().getCategoryResultEvent();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AddCategoryFragment.this, null);
                this.f11740a = 1;
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
            return ((C75993) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AddCategoryFragment() {
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.category.AddCategoryFragment$special$$inlined$activityViewModels$default$3
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
    /* renamed from: j */
    public final EditCategoryViewModel m10910j() {
        return (EditCategoryViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final Unit m10911k(AddCategoryFragment addCategoryFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Editable text = ((DialogueFragmentEditNewBinding) addCategoryFragment.getMBindView()).f10459b.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (TextUtils.isEmpty(StringsKt.trim(text))) {
            XToastUtils.INSTANCE.warning("分类不能为空");
            return Unit.INSTANCE;
        }
        it.setEnabled(false);
        EditCategoryViewModel editCategoryViewModelM10910j = addCategoryFragment.m10910j();
        Editable text2 = ((DialogueFragmentEditNewBinding) addCategoryFragment.getMBindView()).f10459b.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        editCategoryViewModelM10910j.m10945r(StringsKt.trim(text2).toString());
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m10912l(AddCategoryFragment addCategoryFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        androidx.navigation.fragment.FragmentKt.findNavController(addCategoryFragment).navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        TextView cvSave = ((DialogueFragmentEditNewBinding) getMBindView()).f10458a;
        Intrinsics.checkNotNullExpressionValue(cvSave, "cvSave");
        AbstractC8136b.m13040h(cvSave, new Function1() { // from class: t6.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddCategoryFragment.m10911k(this.f16904a, (View) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C75993(null), 3, null);
        ImageView ivBack = ((DialogueFragmentEditNewBinding) getMBindView()).f10460c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC8136b.m13040h(ivBack, new Function1() { // from class: t6.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddCategoryFragment.m10912l(this.f16905a, (View) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.dialogue_fragment_edit_new;
    }
}
