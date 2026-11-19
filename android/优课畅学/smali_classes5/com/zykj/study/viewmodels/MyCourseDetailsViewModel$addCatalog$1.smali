.class final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->c(ILjava/lang/String;IZ)V
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
    c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$addCatalog$1"
    f = "MyCourseDetailsViewModel.kt"
    l = {
        0x5a,
        0x5b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:Z


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILjava/lang/String;IZLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->e:I

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->f:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->e:I

    .line 10
    .line 11
    iget-boolean v5, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->f:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILjava/lang/String;IZLm7/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->a:I

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
    move-object v9, p0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v9, p0

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;)Lcom/zykj/study/repository/CourseRepository;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iget v5, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->c:I

    .line 43
    .line 44
    iget-object v6, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget v7, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->e:I

    .line 47
    .line 48
    iget-boolean v8, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->f:Z

    .line 49
    .line 50
    iput v3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->a:I

    .line 51
    .line 52
    move-object v9, p0

    .line 53
    invoke-virtual/range {v4 .. v9}, Lcom/zykj/study/repository/CourseRepository;->d(ILjava/lang/String;IZLm7/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    iget-object p1, v9, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 61
    .line 62
    iput v2, v9, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;->a:I

    .line 63
    .line 64
    invoke-static {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->b(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_4

    .line 69
    .line 70
    :goto_1
    return-object v0

    .line 71
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 72
    .line 73
    return-object p1
.end method
