.class public final Lcom/friday/document/view/TeacherOnlyActivity;
.super Lcom/friday/document/view/Hilt_TeacherOnlyActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/TeacherOnlyActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/Hilt_TeacherOnlyActivity<",
        "Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/Hilt_TeacherOnlyActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/document/view/TeacherOnlyActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/document/view/TeacherOnlyActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lu2/l0;

    .line 34
    .line 35
    invoke-direct {v0}, Lu2/l0;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/document/view/TeacherOnlyActivity;->h:Lqc/d;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/TeacherOnlyActivity;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/TeacherOnlyActivity;->V(Lcom/friday/document/view/TeacherOnlyActivity;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O()Lcom/friday/document/adapter/SyncFailedAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/TeacherOnlyActivity;->X()Lcom/friday/document/adapter/SyncFailedAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic P(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->W(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic R(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/adapter/SyncFailedAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->T()Lcom/friday/document/adapter/SyncFailedAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic S(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/viewmodel/TeacherOnlyViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->U()Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final V(Lcom/friday/document/view/TeacherOnlyActivity;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->U()Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->k()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final W(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final X()Lcom/friday/document/adapter/SyncFailedAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/SyncFailedAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/SyncFailedAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final T()Lcom/friday/document/adapter/SyncFailedAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/TeacherOnlyActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/SyncFailedAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final U()Lcom/friday/document/viewmodel/TeacherOnlyViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/TeacherOnlyActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_teacher_only (0x7f0c0022), APK res/4i.xml
    sget v0, Lcom/friday/document/R$layout;->activity_teacher_only:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->T()Lcom/friday/document/adapter/SyncFailedAdapter;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->i:Landroid/widget/ImageView;

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    new-array v1, v1, [F

    .line 45
    .line 46
    fill-array-data v1, :array_0

    .line 47
    .line 48
    .line 49
    const-string v2, "rotation"

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-wide/16 v1, 0x3e8

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 58
    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 65
    .line 66
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v5, Lcom/friday/document/view/TeacherOnlyActivity$initData$2;

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {v5, p0, v0}, Lcom/friday/document/view/TeacherOnlyActivity$initData$2;-><init>(Lcom/friday/document/view/TeacherOnlyActivity;Lvc/c;)V

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x3

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 97
    .line 98
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->n:Landroid/widget/TextView;

    .line 99
    .line 100
    const-string v1, "tvRetry"

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lu2/m0;

    .line 106
    .line 107
    invoke-direct {v1, p0}, Lu2/m0;-><init>(Lcom/friday/document/view/TeacherOnlyActivity;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 118
    .line 119
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->k:Landroid/widget/TextView;

    .line 120
    .line 121
    new-instance v1, Lu2/n0;

    .line 122
    .line 123
    invoke-direct {v1}, Lu2/n0;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/friday/document/view/TeacherOnlyActivity;->U()Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->k()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method
