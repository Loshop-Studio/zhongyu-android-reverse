.class public final Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;
.super Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public final i:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    sget v0, Lcom/zykj/study/R$id;->nav_answer_graph:I

    .line 23
    .line 24
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lh7/d;)V

    .line 36
    .line 37
    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 50
    .line 51
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->g:Lh7/d;

    .line 59
    .line 60
    new-instance v0, Lx4/d;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lx4/d;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 66
    .line 67
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$1;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-class v2, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 77
    .line 78
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$2;

    .line 83
    .line 84
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$3;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$4;

    .line 94
    .line 95
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->h:Lh7/d;

    .line 103
    .line 104
    new-instance v0, Lx4/e;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Lx4/e;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$5;

    .line 110
    .line 111
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$5;-><init>(Lx7/a;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-class v1, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$6;

    .line 125
    .line 126
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$6;-><init>(Lh7/d;)V

    .line 127
    .line 128
    .line 129
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$7;

    .line 130
    .line 131
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;Lh7/d;)V

    .line 132
    .line 133
    .line 134
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$8;

    .line 135
    .line 136
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$special$$inlined$viewModels$default$8;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->i:Lh7/d;

    .line 144
    .line 145
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->y(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->w(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->x(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->v(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->o(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->u(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/Boolean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->t(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->p()Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final o(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "requireParentFragment(...)"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method private final q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final s()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->i:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final t(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/String;)Lh7/p;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->setSnapshotUrl(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/h;->u(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lg0/b;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v1, v0}, Lg0/b;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ld0/a;->d0(Ll/b;)Ld0/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/bumptech/glide/g;

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 79
    .line 80
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;

    .line 81
    .line 82
    iget-object p0, p0, Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/h;->m(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 88
    .line 89
    return-object p0
.end method

.method public static final u(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Ljava/lang/Boolean;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->btnSubmit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    xor-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final v(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-class v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 56
    .line 57
    return-object p0
.end method

.method public static final w(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 2

    .line 1
    sget-object v0, Lh5/c;->b:Lh5/c;

    .line 2
    .line 3
    new-instance v1, Lx4/j;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lx4/j;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lh5/c;->a(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final x(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Lh7/p;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "\u8bf7\u5728\u7b54\u9898\u533a\u4f5c\u7b54"

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 31
    .line 32
    invoke-static {p0, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->v()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 53
    .line 54
    const-string v0, "\u9898\u76ee\u83b7\u53d6\u5931\u8d25\uff0c\u8bf7\u8fd4\u56de\u518d\u8bd5"

    .line 55
    .line 56
    invoke-static {p0, v0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->s()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->c()V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/b;->a:Lcom/zykj/study/ui/home/exercise/train/b$a;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/train/b$a;->a()Landroidx/navigation/NavDirections;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :try_start_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catch_0
    move-exception p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 91
    .line 92
    invoke-static {p0, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 96
    .line 97
    return-object p0
.end method

.method public static final y(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "requireParentFragment(...)"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$1;->c:I

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
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;Lm7/c;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lx7/p;)Lkotlinx/coroutines/n;

    .line 73
    .line 74
    .line 75
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 76
    .line 77
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->s()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewEditAnswerMicroBinding;->rlMicroEdit:Landroid/widget/RelativeLayout;

    .line 17
    .line 18
    const-string p2, "rlMicroEdit"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lx4/f;

    .line 24
    .line 25
    invoke-direct {p2, p0}, Lx4/f;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerBinding;->btnSubmit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 38
    .line 39
    const-string p2, "btnSubmit"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lx4/g;

    .line 45
    .line 46
    invoke-direct {p2, p0}, Lx4/g;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v0, Lx4/h;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lx4/h;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$a;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$a;-><init>(Lx7/l;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->q()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    new-instance v0, Lx4/i;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lx4/i;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$a;

    .line 95
    .line 96
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment$a;-><init>(Lx7/l;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 103
    .line 104
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train_answer:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final r()Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 8
    .line 9
    return-object v0
.end method
