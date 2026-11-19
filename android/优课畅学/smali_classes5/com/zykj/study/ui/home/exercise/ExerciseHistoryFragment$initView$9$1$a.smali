.class public final Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9$1$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(ZLm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9$1$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;

    .line 8
    .line 9
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseHistoryBinding;->exercise:Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;

    .line 10
    .line 11
    iget-object p2, p2, Lcom/zykj/study/databinding/ItemExerciseHistoryBinding;->exerciseAnswer:Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;

    .line 12
    .line 13
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutExerciseAnswerHistoryBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 14
    .line 15
    iget-object p2, p2, Lcom/zykj/study/databinding/ViewMicroBinding;->includeChartDetails:Lcom/zykj/study/databinding/LayoutChartDetailsBinding;

    .line 16
    .line 17
    iget-object p2, p2, Lcom/zykj/study/databinding/LayoutChartDetailsBinding;->parentLayout:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 18
    .line 19
    const-string v0, "parentLayout"

    .line 20
    .line 21
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 p1, 0x8

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 34
    .line 35
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment$initView$9$1$a;->c(ZLm7/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
