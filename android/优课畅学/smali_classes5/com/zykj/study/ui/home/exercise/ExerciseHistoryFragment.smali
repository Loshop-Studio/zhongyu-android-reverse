# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lcom/zykj/study/adapter/MicroAdapter;

.field public final j:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$c;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v2, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->g:Lh7/d;

    .line 65
    .line 66
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$6;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$7;

    .line 72
    .line 73
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-class v1, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 81
    .line 82
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$8;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$9;

    .line 92
    .line 93
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 94
    .line 95
    .line 96
    new-instance v4, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$10;

    .line 97
    .line 98
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->h:Lh7/d;

    .line 106
    .line 107
    new-instance v0, Lw4/h;

    .line 108
    .line 109
    invoke-direct {v0, p0}, Lw4/h;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->j:Lh7/d;

    .line 117
    .line 118
    return-void
.end method

.method public static final A(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;->d()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p1, p0}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->t(I)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    iget-object p0, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p0, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    iput v4, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    .line 71
    .line 72
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    new-instance p1, Lcom/zykj/study/adapter/MicroAdapter;

    .line 80
    .line 81
    new-instance v2, Lw4/f;

    .line 82
    .line 83
    invoke-direct {v2, p0}, Lw4/f;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v2}, Lcom/zykj/study/adapter/MicroAdapter;-><init>(Lx7/l;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;->b()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;->a()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;->c()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    iput-object p0, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->a:Ljava/lang/Object;

    .line 120
    .line 121
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initData$1;->d:I

    .line 122
    .line 123
    invoke-virtual {p1, v2, v4, v5, v0}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->v(IIILm7/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v1, :cond_5

    .line 128
    .line 129
    :goto_2
    return-object v1

    .line 130
    :cond_5
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    new-instance v0, Lw4/g;

    .line 139
    .line 140
    invoke-direct {v0, p0}, Lw4/g;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;

    .line 144
    .line 145
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;-><init>(Lx7/l;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 152
    .line 153
    return-object p0
.end method

.method public static final C(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptContent()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "text/html; charset=UTF-8"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAdaptStandardAnswerStr()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptAnalysis()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    const/4 v0, -0x1

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    sget-object v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$a;->a:[I

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    aget v0, v1, v0

    .line 81
    .line 82
    :goto_0
    const/4 v1, 0x1

    .line 83
    if-eq v0, v1, :cond_4

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    if-eq v0, v1, :cond_2

    .line 87
    .line 88
    const/4 v1, 0x3

    .line 89
    if-eq v0, v1, :cond_2

    .line 90
    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 98
    .line 99
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 100
    .line 101
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 102
    .line 103
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->viewChoice:Lcom/zykj/study/databinding/ViewChoiceBinding;

    .line 104
    .line 105
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewChoiceBinding;->recycler:Lcom/zykj/study/view/MultipleChoiceView;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleChoiceView;->b()V

    .line 108
    .line 109
    .line 110
    sget-object v1, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->e:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setJudgingStatus(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getExtra()Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionExtra;->getOptions()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setOptionList(Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setRightOptionList(Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerSubmit()Lcom/zykj/study/utils/ChoiceList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceView;->setAnswerList(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 153
    .line 154
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 155
    .line 156
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 157
    .line 158
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerEx()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->setSnapshotUrl(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerEx()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->u(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 188
    .line 189
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 190
    .line 191
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 192
    .line 193
    iget-object v1, v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 194
    .line 195
    iget-object v1, v1, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->w0(Landroid/widget/ImageView;)Le0/j;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 205
    .line 206
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 207
    .line 208
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 209
    .line 210
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->myAnswerMicro:Lcom/zykj/study/databinding/ViewAnswerMicroBinding;

    .line 211
    .line 212
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewAnswerMicroBinding;->ivSnapshot:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 213
    .line 214
    const-string v1, "ivSnapshot"

    .line 215
    .line 216
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v1, Lw4/o;

    .line 220
    .line 221
    invoke-direct {v1, p1, p0}, Lw4/o;-><init>(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 225
    .line 226
    .line 227
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v1, "getViewLifecycleOwner(...)"

    .line 232
    .line 233
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    new-instance v7, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$6$6;

    .line 241
    .line 242
    invoke-direct {v7, p0, p1, v3}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$6$6;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V

    .line 243
    .line 244
    .line 245
    const/4 v8, 0x3

    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v5, 0x0

    .line 248
    const/4 v6, 0x0

    .line 249
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 250
    .line 251
    .line 252
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 253
    .line 254
    return-object p0
.end method

.method public static final D(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerEx()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/zykj/study/ui/home/exercise/b;->a:Lcom/zykj/study/ui/home/exercise/b$b;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/exercise/b$b;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final E(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V
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

.method public static final F(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->b()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 23
    .line 24
    new-instance v1, Ld8/f;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v1, v3, v2}, Ld8/f;-><init>(II)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v4, 0xa

    .line 37
    .line 38
    invoke-static {v1, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    check-cast v5, Li7/m0;

    .line 57
    .line 58
    invoke-virtual {v5}, Li7/m0;->nextInt()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {v2}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setOptionList(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 98
    .line 99
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 100
    .line 101
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 102
    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v1, v0}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setSelectedIndex(I)V

    .line 108
    .line 109
    .line 110
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Li7/f0;->c1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    move-object v2, v1

    .line 137
    check-cast v2, Li7/j0;

    .line 138
    .line 139
    invoke-virtual {v2}, Li7/j0;->b()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStatus()Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    sget-object v5, Lcom/zykj/study/bean/exercise/QuestionStatus;->UN_ANSWERED:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 150
    .line 151
    if-eq v2, v5, :cond_2

    .line 152
    .line 153
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-static {v0, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_4

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Li7/j0;

    .line 181
    .line 182
    invoke-virtual {v2}, Li7/j0;->a()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    add-int/2addr v2, v3

    .line 187
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_4
    invoke-static {p1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 204
    .line 205
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 206
    .line 207
    iget-object v1, v1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 208
    .line 209
    invoke-virtual {v1, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setAnswerList(Ljava/util/List;)V

    .line 210
    .line 211
    .line 212
    new-instance p1, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_6

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object v2, v1

    .line 232
    check-cast v2, Li7/j0;

    .line 233
    .line 234
    invoke-virtual {v2}, Li7/j0;->b()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 239
    .line 240
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/QuestionBean;->getCorrect()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_5

    .line 245
    .line 246
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-static {p1, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_7

    .line 268
    .line 269
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Li7/j0;

    .line 274
    .line 275
    invoke-virtual {v1}, Li7/j0;->a()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    add-int/2addr v1, v3

    .line 280
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_7
    invoke-static {v0}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 297
    .line 298
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 299
    .line 300
    iget-object p0, p0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setRightOptionList(Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 306
    .line 307
    return-object p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p2}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->t(I)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final H(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getTitle()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget v0, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v1, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    int-to-float v0, v0

    .line 56
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Lw4/n;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lw4/n;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 66
    .line 67
    .line 68
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 69
    .line 70
    return-object p0
.end method

.method public static final I(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V
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

.method public static synthetic J(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->setEntity(Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->y()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->setWebViewControlViewModel(Lcom/zykj/study/viewmodels/WebViewControlViewModel;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->y()Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;->c()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 41
    .line 42
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    int-to-float p2, p2

    .line 77
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p2, Lw4/i;

    .line 82
    .line 83
    invoke-direct {p2, p0}, Lw4/i;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    new-instance v0, Lw4/j;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Lw4/j;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;

    .line 107
    .line 108
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;-><init>(Lx7/l;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 121
    .line 122
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 123
    .line 124
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 125
    .line 126
    iget-object p1, p1, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 129
    .line 130
    const-string v0, "microAdapter"

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    if-nez p2, :cond_0

    .line 134
    .line 135
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    move-object p2, v1

    .line 139
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 140
    .line 141
    .line 142
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 143
    .line 144
    if-nez p2, :cond_1

    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object p2, v1

    .line 150
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->v()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->u(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 168
    .line 169
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 170
    .line 171
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 174
    .line 175
    sget-object p2, Le5/e;->a:Le5/e;

    .line 176
    .line 177
    invoke-virtual {p2}, Le5/e;->d()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Le5/e;->a()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Le5/e;->b()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-static {p2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/CustomWebView;->a(Ljava/util/List;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    new-instance v0, Lw4/k;

    .line 215
    .line 216
    invoke-direct {v0, p0}, Lw4/k;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 217
    .line 218
    .line 219
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;

    .line 220
    .line 221
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;-><init>(Lx7/l;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    new-instance v0, Lw4/l;

    .line 240
    .line 241
    invoke-direct {v0, p0}, Lw4/l;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 242
    .line 243
    .line 244
    new-instance v2, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;

    .line 245
    .line 246
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$b;-><init>(Lx7/l;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 257
    .line 258
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 259
    .line 260
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->multipleChoiceView:Lcom/zykj/study/view/MultipleChoiceAnimationView;

    .line 261
    .line 262
    new-instance p2, Lw4/m;

    .line 263
    .line 264
    invoke-direct {p2, p0}, Lw4/m;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView;->setItemClickListener(Lx7/p;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    const-string p2, "getViewLifecycleOwner(...)"

    .line 275
    .line 276
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    new-instance v5, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9;

    .line 284
    .line 285
    invoke-direct {v5, p0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)V

    .line 286
    .line 287
    .line 288
    const/4 v6, 0x3

    .line 289
    const/4 v7, 0x0

    .line 290
    const/4 v3, 0x0

    .line 291
    const/4 v4, 0x0

    .line 292
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 293
    .line 294
    .line 295
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 296
    .line 297
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->A(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->C(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->E(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->D(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->G(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->F(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->H(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->I(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->z(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/adapter/MicroAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final t(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final z(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/exercise/MicroBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/zykj/study/ui/home/exercise/b;->a:Lcom/zykj/study/ui/home/exercise/b$b;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/MicroBean;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/b$b;->a(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->B(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->J(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_history:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->i:Lcom/zykj/study/adapter/MicroAdapter;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "microAdapter"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->v()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final u(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$drawable;->divider:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final v()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->j:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w()Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x()Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()Lcom/zykj/study/viewmodels/WebViewControlViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->h:Lh7/d;

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
