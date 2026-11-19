.class public final Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

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
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    const-string v1, "recycler"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 26
    .line 27
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lcom/zykj/study/adapter/MicroAdapter;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    const-string v2, "microAdapter"

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/study/adapter/MicroAdapter;->getItemCount()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v4, 0x0

    .line 45
    if-lez v2, :cond_1

    .line 46
    .line 47
    move v2, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_0
    const/16 v5, 0x8

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    move v2, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v2, v5

    .line 57
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 71
    .line 72
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewMicroBinding;->llMicroEmpty:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    const-string v2, "llMicroEmpty"

    .line 77
    .line 78
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 88
    .line 89
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 90
    .line 91
    iget-object v2, v2, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 92
    .line 93
    iget-object v2, v2, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 94
    .line 95
    iget-object v2, v2, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 96
    .line 97
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move v3, v4

    .line 108
    :goto_2
    if-nez v3, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    move v4, v5

    .line 112
    :goto_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    return-void
.end method
