.class final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g(I)V
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
    c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$getCatalogList$1"
    f = "MyCourseDetailsViewModel.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->c:I

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
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->c:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;)Lcom/zykj/study/repository/CourseRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->c:I

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/repository/CourseRepository;->j(ILm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 53
    .line 54
    invoke-static {p1}, Lq4/a;->a(Ljava/util/List;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;->b:Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 59
    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v3, 0xa

    .line 63
    .line 64
    invoke-static {p1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->k()Ljava/util/HashSet;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v3}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v5}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-virtual {v3, v4}, Lr0/a;->setExpanded(Z)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-static {v2}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {v0, p1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 122
    .line 123
    return-object p1
.end method
