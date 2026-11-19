.class final Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudyViewModel;->q()V
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
    c = "com.zykj.study.viewmodels.StudyViewModel$teach$1$1"
    f = "StudyViewModel.kt"
    l = {
        0x7d,
        0x80
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/StudyViewModel;

.field public final synthetic c:Lcom/zykj/study/data/CourseStudyEntity;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->b:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->c:Lcom/zykj/study/data/CourseStudyEntity;

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
    new-instance p1, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->b:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->b:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->j()Lcom/zykj/study/repository/CourseRepository;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->a:I

    .line 47
    .line 48
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->x(ILm7/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v1, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1$1;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->b:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 62
    .line 63
    iget-object v4, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->c:Lcom/zykj/study/data/CourseStudyEntity;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-direct {v1, v3, v4, v5}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 67
    .line 68
    .line 69
    iput v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;->a:I

    .line 70
    .line 71
    invoke-static {p1, v1, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_4

    .line 76
    .line 77
    :goto_1
    return-object v0

    .line 78
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 79
    .line 80
    return-object p1
.end method
