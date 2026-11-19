.class public final Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseFragment<",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0094@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;",
        "Lcom/zykj/base/BaseFragment;",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "a",
        "Lkotlin/Lazy;",
        "j",
        "()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;",
        "viewModel",
        "Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;",
        "b",
        "i",
        "()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;",
        "rvAdapter",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCategoryListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n172#2,9:150\n257#3,2:159\n278#3,2:161\n257#3,2:163\n278#3,2:165\n*S KotlinDebug\n*F\n+ 1 CategoryListFragment.kt\ncom/zykj/student/dialogue/ui/home/category/CategoryListFragment\n*L\n30#1:150,9\n96#1:159,2\n97#1:161,2\n105#1:163,2\n106#1:165,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->a:Lkotlin/Lazy;

    .line 31
    .line 32
    new-instance v0, Lt6/f;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lt6/f;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->b:Lkotlin/Lazy;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic c(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->l(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->n(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->k(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->m(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->a:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final k(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lcom/zykj/student/dialogue/ui/home/category/b$a;->a:Lcom/zykj/student/dialogue/ui/home/category/b$a;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->B(Lcom/zykj/student/dialogue/ui/home/category/b;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final l(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->z()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final m(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Ljava/lang/String;Landroid/os/Bundle;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->t()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final n(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->j()Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;-><init>(Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lcom/chad/library/adapter/base/module/BaseDraggableModule;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/module/BaseDraggableModule;->setDragEnabled(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/module/BaseDraggableModule;->getItemTouchHelperCallback()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->setDragMoveFlags(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lcom/chad/library/adapter/base/module/BaseDraggableModule;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/module/BaseDraggableModule;->setOnItemDragListener(Lcom/chad/library/adapter/base/listener/OnItemDragListener;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;

    .line 44
    .line 45
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->hasHeaderLayout()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-static {v2, v1, v9}, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v4, v2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->b:Landroidx/constraintlayout/widget/Group;

    .line 94
    .line 95
    const-string v10, "groupOperation"

    .line 96
    .line 97
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/16 v11, 0x8

    .line 101
    .line 102
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    iget-object v4, v2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->a:Landroidx/cardview/widget/CardView;

    .line 106
    .line 107
    const-string v12, "cvSystemType"

    .line 108
    .line 109
    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    iget-object v4, v2, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->e:Landroid/widget/TextView;

    .line 116
    .line 117
    const-string v5, "\u8ba8\u8bba\u4e2d"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const-string v2, "getRoot(...)"

    .line 127
    .line 128
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 v7, 0x6

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    invoke-static/range {v3 .. v8}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addHeaderView$default(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;IIILjava/lang/Object;)I

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->i()Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {v3, v1, v9}, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object v3, v1, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->b:Landroidx/constraintlayout/widget/Group;

    .line 155
    .line 156
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    iget-object v3, v1, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->a:Landroidx/cardview/widget/CardView;

    .line 163
    .line 164
    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    .line 170
    iget-object v3, v1, Lcom/zykj/student/dialogue/databinding/DialogueItemEditBinding;->e:Landroid/widget/TextView;

    .line 171
    .line 172
    const-string v4, "\u5df2\u5f52\u6863"

    .line 173
    .line 174
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    const/16 v17, 0x6

    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    const/4 v15, 0x0

    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    invoke-static/range {v13 .. v18}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addHeaderView$default(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;IIILjava/lang/Object;)I

    .line 192
    .line 193
    .line 194
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const-string v2, "getViewLifecycleOwner(...)"

    .line 199
    .line 200
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    new-instance v6, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$5;

    .line 208
    .line 209
    const/4 v1, 0x0

    .line 210
    invoke-direct {v6, v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$5;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Lkotlin/coroutines/Continuation;)V

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x3

    .line 214
    const/4 v8, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v5, 0x0

    .line 217
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;

    .line 225
    .line 226
    iget-object v3, v3, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;->a:Landroid/widget/TextView;

    .line 227
    .line 228
    const-string v4, "cvNewType"

    .line 229
    .line 230
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    new-instance v4, Lt6/g;

    .line 234
    .line 235
    invoke-direct {v4, v0}, Lt6/g;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v3, v4}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v3}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    new-instance v7, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7;

    .line 253
    .line 254
    invoke-direct {v7, v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$initView$7;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;Lkotlin/coroutines/Continuation;)V

    .line 255
    .line 256
    .line 257
    const/4 v8, 0x3

    .line 258
    const/4 v9, 0x0

    .line 259
    const/4 v6, 0x0

    .line 260
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;

    .line 268
    .line 269
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentCategoryListBinding;->b:Landroid/widget/ImageView;

    .line 270
    .line 271
    const-string v2, "ivExit"

    .line 272
    .line 273
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    new-instance v2, Lt6/h;

    .line 277
    .line 278
    invoke-direct {v2, v0}, Lt6/h;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v1, v2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 282
    .line 283
    .line 284
    new-instance v1, Lt6/i;

    .line 285
    .line 286
    invoke-direct {v1, v0}, Lt6/i;-><init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V

    .line 287
    .line 288
    .line 289
    const-string v2, "RefreshList"

    .line 290
    .line 291
    invoke-static {v0, v2, v1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 295
    .line 296
    return-object v1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_fragment_category_list:I

    .line 2
    .line 3
    return v0
.end method
