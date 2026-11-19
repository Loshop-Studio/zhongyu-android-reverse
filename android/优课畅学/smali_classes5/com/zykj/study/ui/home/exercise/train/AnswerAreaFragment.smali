.class public final Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;
.super Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerAreaFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerAreaFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseTrainAnswerAreaBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/Hilt_AnswerAreaFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx4/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx4/a;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->f:Lh7/d;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->k(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->i(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
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

.method private final j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->f:Lh7/d;

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

.method public static final k(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->w()Landroidx/lifecycle/MutableLiveData;

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
    check-cast v0, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    sget-object v2, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$a;->a:[I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    aget v1, v2, v1

    .line 40
    .line 41
    :goto_0
    const/4 v2, 0x1

    .line 42
    if-eq v1, v2, :cond_5

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    if-eq v1, v2, :cond_4

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    if-eq v1, v2, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    sget-object v3, Lcom/zykj/study/ui/home/exercise/train/a;->a:Lcom/zykj/study/ui/home/exercise/train/a$d;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getExerciseId()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getGroupId()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->o()Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    move-object v7, p1

    .line 70
    invoke-virtual/range {v3 .. v8}, Lcom/zykj/study/ui/home/exercise/train/a$d;->a(JILcom/zykj/study/bean/exercise/QuestionBean;Z)Landroidx/navigation/NavDirections;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move-object v4, p1

    .line 83
    move-object p1, v0

    .line 84
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/a;->a:Lcom/zykj/study/ui/home/exercise/train/a$d;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getExerciseId()J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getGroupId()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->o()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/train/a$d;->b(JILcom/zykj/study/bean/exercise/QuestionBean;Z)Landroidx/navigation/NavDirections;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    move-object v4, p1

    .line 115
    move-object p1, v0

    .line 116
    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/a;->a:Lcom/zykj/study/ui/home/exercise/train/a$d;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getExerciseId()J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getGroupId()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->o()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/train/a$d;->c(JILcom/zykj/study/bean/exercise/QuestionBean;Z)Landroidx/navigation/NavDirections;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 143
    .line 144
    .line 145
    :goto_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 146
    .line 147
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->j()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Lx4/b;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lx4/b;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$b;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment$b;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_train_answer_area:I

    .line 2
    .line 3
    return v0
.end method
