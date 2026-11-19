.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 8
    .line 9
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->linearLayoutDetailContent:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 10
    .line 11
    const-string v0, "linearLayoutDetailContent"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v0

    .line 22
    :goto_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/16 v0, 0x8

    .line 26
    .line 27
    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 39
    .line 40
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->tvDetailTitle:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget v1, Lcom/zykj/study/R$string;->chart_detail_title:I

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getShowName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getStudentList()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 94
    .line 95
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->tvDetailContent:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getStudentList()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/16 v7, 0x3e

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    const-string v1, "\u3001"

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-static/range {v0 .. v8}, Li7/f0;->v0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 119
    .line 120
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a;->c(Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
