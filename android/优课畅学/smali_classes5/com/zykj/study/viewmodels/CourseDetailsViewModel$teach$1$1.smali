.class final Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->k()V
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
    c = "com.zykj.study.viewmodels.CourseDetailsViewModel$teach$1$1"
    f = "CourseDetailsViewModel.kt"
    l = {
        0x4d,
        0x50
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

.field public final synthetic d:Lcom/zykj/study/bean/course/CourseDetailsBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->d:Lcom/zykj/study/bean/course/CourseDetailsBean;

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
    new-instance p1, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->d:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;-><init>(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->e()Lcom/zykj/study/repository/CourseRepository;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->d:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v3, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->b:I

    .line 51
    .line 52
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->x(ILm7/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->c:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->e()Lcom/zykj/study/repository/CourseRepository;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->d:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iput v2, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$teach$1$1;->b:I

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v7, 0x2

    .line 83
    const/4 v8, 0x0

    .line 84
    move-object v6, p0

    .line 85
    invoke-static/range {v3 .. v8}, Lcom/zykj/study/repository/CourseRepository;->l(Lcom/zykj/study/repository/CourseRepository;IZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-ne v1, v0, :cond_4

    .line 90
    .line 91
    :goto_1
    return-object v0

    .line 92
    :cond_4
    move-object v0, p1

    .line 93
    move-object p1, v1

    .line 94
    :goto_2
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 98
    .line 99
    return-object p1
.end method
