.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;
.super Lcom/zykj/student/dialogue/ui/detail/Hilt_AnswerTabFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;",
        "f",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;",
        "binding",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "g",
        "Lkotlin/Lazy;",
        "j",
        "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "viewModel",
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
        "SMAP\nAnswerTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerTabFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,123:1\n49#2,8:124\n*S KotlinDebug\n*F\n+ 1 AnswerTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerTabFragment\n*L\n29#1:124,8\n*E\n"
    }
.end annotation


# instance fields
.field public f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

.field public final g:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/Hilt_AnswerTabFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/zykj/student/dialogue/R$id;->dialogue_detail_main:I

    .line 5
    .line 6
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lkotlin/Lazy;)V

    .line 18
    .line 19
    .line 20
    const-class v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 32
    .line 33
    invoke-direct {v4, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->g:Lkotlin/Lazy;

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic g(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->k(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->l(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->j()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final k(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 2

    .line 1
    const-string v0, "tab"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/student/dialogue/databinding/DialogueAnswerTabLayoutBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getRoot(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget p1, Lcom/zykj/student/dialogue/R$id;->label:I

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/widget/TextView;

    .line 43
    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    sget p2, Lcom/zykj/student/dialogue/R$string;->dialogue_view_all:I

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    sget p2, Lcom/zykj/student/dialogue/R$string;->dialogue_only_public:I

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static final l(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->j()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "binding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    const-string v0, "binding"

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, p2

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object p1, p2

    .line 34
    :cond_1
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$1;

    .line 49
    .line 50
    invoke-direct {v3, v1, v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$1;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object p1, p2

    .line 64
    :cond_2
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 65
    .line 66
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;

    .line 67
    .line 68
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 75
    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object p1, p2

    .line 82
    :cond_3
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    .line 83
    .line 84
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$a;

    .line 85
    .line 86
    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$a;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lcom/google/android/material/tabs/TabLayoutMediator;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 95
    .line 96
    if-nez v1, :cond_4

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v1, p2

    .line 102
    :cond_4
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->c:Lcom/google/android/material/tabs/TabLayout;

    .line 103
    .line 104
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 105
    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v2, p2

    .line 112
    :cond_5
    iget-object v2, v2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    .line 114
    new-instance v3, Lo6/p;

    .line 115
    .line 116
    invoke-direct {v3, p0}, Lo6/p;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, v1, v2, v3}, Lcom/google/android/material/tabs/TabLayoutMediator;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayoutMediator;->attach()V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;

    .line 126
    .line 127
    if-nez p1, :cond_6

    .line 128
    .line 129
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_6
    move-object p2, p1

    .line 134
    :goto_0
    iget-object p1, p2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;->b:Landroid/widget/ImageView;

    .line 135
    .line 136
    const-string p2, "ivRefresh"

    .line 137
    .line 138
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    new-instance p2, Lo6/q;

    .line 142
    .line 143
    invoke-direct {p2, p0}, Lo6/q;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
