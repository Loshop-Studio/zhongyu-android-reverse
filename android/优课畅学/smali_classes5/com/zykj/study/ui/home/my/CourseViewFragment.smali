.class public final Lcom/zykj/study/ui/home/my/CourseViewFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_CourseViewFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_CourseViewFragment<",
        "Lcom/zykj/study/databinding/FragmentCourseViewBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseViewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/g0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/g0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v2, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$5;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$6;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$6;-><init>(Lx7/a;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-class v1, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$7;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$7;-><init>(Lh7/d;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$8;

    .line 74
    .line 75
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$8;-><init>(Lx7/a;Lh7/d;)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$9;

    .line 79
    .line 80
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$special$$inlined$viewModels$default$9;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewFragment;->g:Lh7/d;

    .line 88
    .line 89
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->p(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->o(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/CourseViewFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->n(Lcom/zykj/study/ui/home/my/CourseViewFragment;Ljava/lang/Integer;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/CourseViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->q(Lcom/zykj/study/ui/home/my/CourseViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/home/my/CourseViewFragment;)Lcom/zykj/study/viewmodels/TeachDetailsViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->m()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l()Lcom/zykj/study/viewmodels/CourseViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final n(Lcom/zykj/study/ui/home/my/CourseViewFragment;Ljava/lang/Integer;)Lh7/p;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->l()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$2$1;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$2$1;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lm7/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/course/CourseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->l()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->l()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->l()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/CourseViewFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "requireParentFragment(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/CourseViewFragment$initData$1;->c:I

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
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->m()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

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
    new-instance v0, Lb5/d0;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lb5/d0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;-><init>(Lx7/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->m()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v0, Lb5/e0;

    .line 92
    .line 93
    invoke-direct {v0, p0}, Lb5/e0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;

    .line 97
    .line 98
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;-><init>(Lx7/l;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewFragment;->m()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance v0, Lb5/f0;

    .line 113
    .line 114
    invoke-direct {v0, p0}, Lb5/f0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewFragment;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;

    .line 118
    .line 119
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewFragment$a;-><init>(Lx7/l;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 123
    .line 124
    .line 125
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 126
    .line 127
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_course_view:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lcom/zykj/study/viewmodels/TeachDetailsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewFragment;->f:Lh7/d;

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
