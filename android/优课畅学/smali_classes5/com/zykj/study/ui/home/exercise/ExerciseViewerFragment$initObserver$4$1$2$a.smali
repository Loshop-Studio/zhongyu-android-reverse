.class public final Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 8
    .line 9
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;

    .line 10
    .line 11
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 12
    .line 13
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 14
    .line 15
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->linearLayoutDetailContent:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 16
    .line 17
    const-string v0, "linearLayoutDetailContent"

    .line 18
    .line 19
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v0

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v0, 0x8

    .line 32
    .line 33
    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 45
    .line 46
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;

    .line 47
    .line 48
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 49
    .line 50
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 51
    .line 52
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->tvDetailTitle:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget v1, Lcom/zykj/study/R$string;->chart_detail_title:I

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getShowName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getStudentList()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;

    .line 106
    .line 107
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseViewerBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;

    .line 108
    .line 109
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 110
    .line 111
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 112
    .line 113
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->tvDetailContent:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getStudentList()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/16 v7, 0x3e

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const-string v1, "\u3001"

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    const/4 v3, 0x0

    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, 0x0

    .line 129
    invoke-static/range {v0 .. v8}, Li7/f0;->v0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 137
    .line 138
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$2$a;->c(Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
