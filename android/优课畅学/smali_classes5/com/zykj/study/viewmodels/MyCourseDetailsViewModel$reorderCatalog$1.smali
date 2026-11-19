.class final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->o(Ljava/util/List;)V
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
    c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$reorderCatalog$1"
    f = "MyCourseDetailsViewModel.kt"
    l = {
        0x78,
        0x79,
        0x7f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Ljava/util/List;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->c:Ljava/util/List;

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
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->c:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Ljava/util/List;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput v4, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->a:I

    .line 42
    .line 43
    const-wide/16 v4, 0x1f4

    .line 44
    .line 45
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;)Lcom/zykj/study/repository/CourseRepository;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, Lcom/zykj/study/bean/course/ReorderCatalogReq;

    .line 59
    .line 60
    iget-object v4, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->h()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->c:Ljava/util/List;

    .line 67
    .line 68
    invoke-direct {v1, v4, v5}, Lcom/zykj/study/bean/course/ReorderCatalogReq;-><init>(ILjava/util/List;)V

    .line 69
    .line 70
    .line 71
    iput v3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->a:I

    .line 72
    .line 73
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->v(Lcom/zykj/study/bean/course/ReorderCatalogReq;Lm7/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_5

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 81
    .line 82
    iput v2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;->a:I

    .line 83
    .line 84
    invoke-static {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->b(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_6

    .line 89
    .line 90
    :goto_2
    return-object v0

    .line 91
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 92
    .line 93
    return-object p1
.end method
