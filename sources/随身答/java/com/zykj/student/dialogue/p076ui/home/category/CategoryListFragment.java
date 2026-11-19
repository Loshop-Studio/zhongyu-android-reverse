package com.zykj.student.dialogue.p076ui.home.category;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.zykj.base.BaseFragment;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.req.SortCatalogReq;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.databinding.DialogueFragmentCategoryListBinding;
import com.zykj.student.dialogue.databinding.DialogueItemEditBinding;
import com.zykj.student.dialogue.p076ui.home.category.AbstractC7620b;
import com.zykj.student.dialogue.p076ui.home.category.CategoryListFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p138i6.AbstractC8136b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0094@¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;", "<init>", "()V", "", "layoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "a", "Lkotlin/Lazy;", "j", "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;", "b", "i", "()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;", "rvAdapter", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCategoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n172#2,9:150\n257#3,2:159\n278#3,2:161\n257#3,2:163\n278#3,2:165\n*S KotlinDebug\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment\n*L\n30#1:150,9\n96#1:159,2\n97#1:161,2\n105#1:163,2\n106#1:165,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CategoryListFragment extends BaseFragment<DialogueFragmentCategoryListBinding> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy rvAdapter = LazyKt.lazy(new Function0() { // from class: t6.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CategoryListFragment.m10931n(this.f16910a);
        }
    });

    /* renamed from: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$a */
    public static final class C7604a implements OnItemDragListener {

        /* renamed from: a */
        public List f11752a;

        /* renamed from: b */
        public CatalogResp f11753b;

        /* renamed from: c */
        public Drawable f11754c;

        public C7604a() {
            Iterable iterable = (Iterable) CategoryListFragment.this.m10927j().getCategories().getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                CatalogResp catalogResp = (CatalogResp) obj;
                if (!catalogResp.inDiscussing() && !catalogResp.isArchived()) {
                    arrayList.add(obj);
                }
            }
            this.f11752a = CollectionsKt.toMutableList((Collection) arrayList);
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i9) {
            View view;
            if (viewHolder != null && (view = viewHolder.itemView) != null) {
                view.setBackground(this.f11754c);
            }
            CatalogResp catalogResp = this.f11753b;
            if (catalogResp != null) {
                CategoryListFragment categoryListFragment = CategoryListFragment.this;
                this.f11752a.add(i9, catalogResp);
                BaseQuickAdapter.setDiffNewData$default(categoryListFragment.m10932i(), this.f11752a, null, 2, null);
                EditCategoryViewModel editCategoryViewModelM10927j = categoryListFragment.m10927j();
                List list = this.f11752a;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new SortCatalogReq((int) ((CatalogResp) obj).getId(), i11));
                    i10 = i11;
                }
                editCategoryViewModelM10927j.m10942C(arrayList);
            }
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i9, RecyclerView.ViewHolder viewHolder2, int i10) {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i9) {
            View view;
            View view2;
            Iterable iterable = (Iterable) CategoryListFragment.this.m10927j().getCategories().getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                CatalogResp catalogResp = (CatalogResp) obj;
                if (!catalogResp.isArchived() && !catalogResp.inDiscussing()) {
                    arrayList.add(obj);
                }
            }
            this.f11752a = CollectionsKt.toMutableList((Collection) arrayList);
            this.f11754c = (viewHolder == null || (view2 = viewHolder.itemView) == null) ? null : view2.getBackground();
            if (viewHolder != null && (view = viewHolder.itemView) != null) {
                view.setBackgroundColor(ContextCompat.getColor(CategoryListFragment.this.requireContext(), R.color.dialogue_main_color_20));
            }
            this.f11753b = (CatalogResp) this.f11752a.get(i9);
            this.f11752a.remove(i9);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$5", m13451f = "CategoryListFragment.kt", m13452i = {}, m13453l = {113}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$5 */
    public static final class C76055 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11756a;

        @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13413d2 = {"<anonymous>", "", "data", "", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$5$1", m13451f = "CategoryListFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nCategoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$5$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n827#2:150\n855#2,2:151\n*S KotlinDebug\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$5$1\n*L\n114#1:150\n114#1:151,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends CatalogResp>, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11758a;

            /* renamed from: b */
            public /* synthetic */ Object f11759b;

            /* renamed from: c */
            public final /* synthetic */ CategoryListFragment f11760c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CategoryListFragment categoryListFragment, Continuation continuation) {
                super(2, continuation);
                this.f11760c = categoryListFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11760c, continuation);
                anonymousClass1.f11759b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.f11759b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11758a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CategoryEditAdapter categoryEditAdapterM10932i = this.f11760c.m10932i();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    CatalogResp catalogResp = (CatalogResp) obj2;
                    if (!catalogResp.isArchived() && !catalogResp.inDiscussing()) {
                        arrayList.add(obj2);
                    }
                }
                BaseQuickAdapter.setDiffNewData$default(categoryEditAdapterM10932i, CollectionsKt.toMutableList((Collection) arrayList), null, 2, null);
                return Unit.INSTANCE;
            }
        }

        public C76055(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CategoryListFragment.this.new C76055(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11756a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow categories = CategoryListFragment.this.m10927j().getCategories();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CategoryListFragment.this, null);
                this.f11756a = 1;
                if (FlowKt.collectLatest(categories, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C76055) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$7", m13451f = "CategoryListFragment.kt", m13452i = {}, m13453l = {124}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$7 */
    public static final class C76067 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11761a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/home/category/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$7$1", m13451f = "CategoryListFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$initView$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7620b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11763a;

            /* renamed from: b */
            public /* synthetic */ Object f11764b;

            /* renamed from: c */
            public final /* synthetic */ CategoryListFragment f11765c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CategoryListFragment categoryListFragment, Continuation continuation) {
                super(2, continuation);
                this.f11765c = categoryListFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7620b abstractC7620b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7620b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11765c, continuation);
                anonymousClass1.f11764b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7620b abstractC7620b = (AbstractC7620b) this.f11764b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11763a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (abstractC7620b instanceof AbstractC7620b.a) {
                    FragmentKt.findNavController(this.f11765c).navigate(R.id.addCategoryFragment);
                } else if (abstractC7620b instanceof AbstractC7620b.c) {
                    FragmentKt.findNavController(this.f11765c).navigate(R.id.updateCategoryFragment, BundleKt.bundleOf(TuplesKt.m13420to("category", ((AbstractC7620b.c) abstractC7620b).m10991a())));
                } else {
                    if (!(abstractC7620b instanceof AbstractC7620b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f11765c.m10927j().m10946s(((AbstractC7620b.b) abstractC7620b).m10990a().getId());
                }
                return Unit.INSTANCE;
            }
        }

        public C76067(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CategoryListFragment.this.new C76067(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11761a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow pageEvent = CategoryListFragment.this.m10927j().getPageEvent();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CategoryListFragment.this, null);
                this.f11761a = 1;
                if (FlowKt.collectLatest(pageEvent, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C76067) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CategoryListFragment() {
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.category.CategoryListFragment$special$$inlined$activityViewModels$default$3
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
    public final EditCategoryViewModel m10927j() {
        return (EditCategoryViewModel) this.viewModel.getValue();
    }

    /* renamed from: k */
    public static final Unit m10928k(CategoryListFragment categoryListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        categoryListFragment.m10927j().m10941B(AbstractC7620b.a.f11851a);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m10929l(CategoryListFragment categoryListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        categoryListFragment.m10927j().m10953z();
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m10930m(CategoryListFragment categoryListFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        categoryListFragment.m10927j().m10947t();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final CategoryEditAdapter m10931n(CategoryListFragment categoryListFragment) {
        return new CategoryEditAdapter(categoryListFragment.m10927j());
    }

    /* renamed from: i */
    public final CategoryEditAdapter m10932i() {
        return (CategoryEditAdapter) this.rvAdapter.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        BaseDraggableModule draggableModule = m10932i().getDraggableModule();
        draggableModule.setDragEnabled(true);
        draggableModule.getItemTouchHelperCallback().setDragMoveFlags(3);
        m10932i().getDraggableModule().setOnItemDragListener(new C7604a());
        RecyclerView recyclerView = getMBindView().f10446c;
        recyclerView.setAdapter(m10932i());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        if (!m10932i().hasHeaderLayout()) {
            CategoryEditAdapter categoryEditAdapterM10932i = m10932i();
            DialogueItemEditBinding dialogueItemEditBindingM9952a = DialogueItemEditBinding.m9952a(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            Group groupOperation = dialogueItemEditBindingM9952a.f10496b;
            Intrinsics.checkNotNullExpressionValue(groupOperation, "groupOperation");
            groupOperation.setVisibility(8);
            CardView cvSystemType = dialogueItemEditBindingM9952a.f10495a;
            Intrinsics.checkNotNullExpressionValue(cvSystemType, "cvSystemType");
            cvSystemType.setVisibility(0);
            dialogueItemEditBindingM9952a.f10499e.setText("讨论中");
            View root = dialogueItemEditBindingM9952a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            BaseQuickAdapter.addHeaderView$default(categoryEditAdapterM10932i, root, 0, 0, 6, null);
            CategoryEditAdapter categoryEditAdapterM10932i2 = m10932i();
            DialogueItemEditBinding dialogueItemEditBindingM9952a2 = DialogueItemEditBinding.m9952a(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            Group groupOperation2 = dialogueItemEditBindingM9952a2.f10496b;
            Intrinsics.checkNotNullExpressionValue(groupOperation2, "groupOperation");
            groupOperation2.setVisibility(8);
            CardView cvSystemType2 = dialogueItemEditBindingM9952a2.f10495a;
            Intrinsics.checkNotNullExpressionValue(cvSystemType2, "cvSystemType");
            cvSystemType2.setVisibility(0);
            dialogueItemEditBindingM9952a2.f10499e.setText("已归档");
            View root2 = dialogueItemEditBindingM9952a2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            BaseQuickAdapter.addHeaderView$default(categoryEditAdapterM10932i2, root2, 0, 0, 6, null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C76055(null), 3, null);
        TextView cvNewType = getMBindView().f10444a;
        Intrinsics.checkNotNullExpressionValue(cvNewType, "cvNewType");
        AbstractC8136b.m13040h(cvNewType, new Function1() { // from class: t6.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryListFragment.m10928k(this.f16911a, (View) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C76067(null), 3, null);
        ImageView ivExit = getMBindView().f10445b;
        Intrinsics.checkNotNullExpressionValue(ivExit, "ivExit");
        AbstractC8136b.m13040h(ivExit, new Function1() { // from class: t6.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryListFragment.m10929l(this.f16912a, (View) obj);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "RefreshList", new Function2() { // from class: t6.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CategoryListFragment.m10930m(this.f16913a, (String) obj, (Bundle) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.dialogue_fragment_category_list;
    }
}
