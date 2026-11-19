.class public final Lcom/zykj/study/ui/home/my/TeachDetailsFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_TeachDetailsFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_TeachDetailsFragment<",
        "Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public h:Lp4/y;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_TeachDetailsFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->g:Lh7/d;

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/tabbar/TabControlView;Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->s(Lcom/xuexiang/xui/widget/tabbar/TabControlView;Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->p(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->t(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->r(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->o(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->q(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;)Lh7/p;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "requireContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/CourseProgress;->getGroupProgress()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v3, 0xa

    .line 17
    .line 18
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 40
    .line 41
    new-instance v4, Lm1/a;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getGroupName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v4, v3}, Lm1/a;-><init>(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v2}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Lp4/y;

    .line 59
    .line 60
    invoke-direct {v2, v0, v1}, Lp4/y;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget v1, Lcom/zykj/lib/ui/R$dimen;->view_100:I

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    new-instance v1, Lb5/k5;

    .line 74
    .line 75
    invoke-direct {v1, p0, p1}, Lb5/k5;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    invoke-virtual {v2, v0, p1, v1}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lp4/y;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-virtual {p1, v0}, Lp2/d;->B(Z)Lp2/d;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lp4/y;

    .line 91
    .line 92
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->h:Lp4/y;

    .line 93
    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    invoke-virtual {p1, v0}, Lp2/c;->s(I)Lp2/c;

    .line 98
    .line 99
    .line 100
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->h:Lp4/y;

    .line 101
    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    new-instance v0, Lb5/l5;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Lb5/l5;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lp2/a;->n(Landroid/widget/PopupWindow$OnDismissListener;)Lp2/a;

    .line 110
    .line 111
    .line 112
    :cond_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 113
    .line 114
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lcom/zykj/study/bean/teach/CourseProgress;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p2, "<unused var>"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/CourseProgress;->getGroupProgress()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final r(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final s(Lcom/xuexiang/xui/widget/tabbar/TabControlView;Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "<unused var>"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget p3, Lcom/zykj/study/R$array;->teach_menu:I

    .line 16
    .line 17
    invoke-virtual {p0, p3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p3, "getStringArray(...)"

    .line 22
    .line 23
    invoke-static {p0, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2}, Li7/r;->H0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 35
    .line 36
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 37
    .line 38
    invoke-virtual {p2, p0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final t(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->h:Lp4/y;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lp4/y;->v(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->m()Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->b()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->m()Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;->a()Lcom/zykj/study/bean/course/CourseBean;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 105
    .line 106
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->setViewModel(Lcom/zykj/study/viewmodels/TeachDetailsViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 21
    .line 22
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    int-to-float p2, p2

    .line 57
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Lb5/g5;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Lb5/g5;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    sget v0, Lcom/zykj/study/R$layout;->view_tab_control_teach_details_title:I

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {p2, v0, v1, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    sget v0, Lcom/zykj/study/R$id;->control_view:I

    .line 86
    .line 87
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    .line 92
    .line 93
    new-instance v1, Lb5/h5;

    .line 94
    .line 95
    invoke-direct {v1, v0, p0}, Lb5/h5;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabControlView;Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->h(Lcom/xuexiang/xui/widget/tabbar/TabControlView$b;)Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/Integer;

    .line 114
    .line 115
    if-eqz v1, :cond_0

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->f(I)Lcom/xuexiang/xui/widget/tabbar/TabControlView;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :catch_0
    move-exception p2

    .line 126
    goto :goto_1

    .line 127
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 134
    .line 135
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->m(Landroid/view/View;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 147
    .line 148
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 149
    .line 150
    invoke-virtual {p2, p1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x2

    .line 154
    invoke-virtual {p2, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initView$4$1;

    .line 158
    .line 159
    invoke-direct {p1, p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initView$4$1;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, p1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;

    .line 170
    .line 171
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeachDetailsBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 172
    .line 173
    new-instance p2, Lb5/i5;

    .line 174
    .line 175
    invoke-direct {p2, p0}, Lb5/i5;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    new-instance v0, Lb5/j5;

    .line 194
    .line 195
    invoke-direct {v0, p0}, Lb5/j5;-><init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$a;

    .line 199
    .line 200
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/TeachDetailsFragment$a;-><init>(Lx7/l;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 207
    .line 208
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_teach_details:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/TeachDetailsFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 8
    .line 9
    return-object v0
.end method
