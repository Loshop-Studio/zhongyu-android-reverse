.class final Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/study/StudyProgressFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.study.StudyProgressFragment$initView$5$3"
    f = "StudyProgressFragment.kt"
    l = {
        0x72
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

.field public final synthetic c:Lcom/zykj/study/data/CourseStudyEntity;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->q(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->c()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eq p1, v1, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->q(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->k()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->q(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput v2, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->a:I

    .line 71
    .line 72
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->d(ILm7/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v0, :cond_3

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->b:Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->q(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/StudyViewModel;->n(I)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 95
    .line 96
    return-object p1
.end method
