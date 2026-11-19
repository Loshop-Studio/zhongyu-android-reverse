.class public final Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    const-string v1, "recycler"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;->j(Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;)Lcom/zykj/study/adapter/MicroAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const-string v2, "microAdapter"

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/study/adapter/MicroAdapter;->getItemCount()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    if-lez v2, :cond_1

    .line 42
    .line 43
    move v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v2, v4

    .line 46
    :goto_0
    const/16 v5, 0x8

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    move v2, v4

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v2, v5

    .line 53
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/zykj/study/databinding/ViewMicroBinding;->llMicroEmpty:Landroid/widget/LinearLayout;

    .line 67
    .line 68
    const-string v2, "llMicroEmpty"

    .line 69
    .line 70
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment$adapterDataObserver$2$1;->a:Lcom/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;

    .line 80
    .line 81
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentExerciseTrainSingleChoiceResultFailBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 82
    .line 83
    iget-object v2, v2, Lcom/zykj/study/databinding/ViewMicroBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 84
    .line 85
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move v3, v4

    .line 96
    :goto_2
    if-nez v3, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    move v4, v5

    .line 100
    :goto_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
