.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/teach/StuQuizBean;Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

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
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->tvMemberWithCompleted:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 12
    .line 13
    sget v1, Lcom/zykj/study/R$string;->completion_status:I

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/StuQuizBean;->getCompleteNum()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/StuQuizBean;->getTotalNum()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 49
    .line 50
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;->tvAvgScore:Landroid/widget/TextView;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsSingleDetailBinding;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget v1, Lcom/zykj/study/R$string;->average_score:I

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/StuQuizBean;->getAvg()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 90
    .line 91
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/teach/StuQuizBean;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a;->c(Lcom/zykj/study/bean/teach/StuQuizBean;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
