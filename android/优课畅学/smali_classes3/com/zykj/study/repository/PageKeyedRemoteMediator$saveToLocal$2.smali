.class final Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/PageKeyedRemoteMediator;->c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/l;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.repository.PageKeyedRemoteMediator$saveToLocal$2"
    f = "PageKeyedRemoteMediator.kt"
    l = {
        0x45,
        0x4a,
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroidx/paging/LoadType;

.field public final synthetic c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

.field public final synthetic d:Lcom/zykj/study/data/MyCourseKeyEntity;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/PageKeyedRemoteMediator;Lcom/zykj/study/data/MyCourseKeyEntity;Ljava/util/List;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;-><init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/PageKeyedRemoteMediator;Lcom/zykj/study/data/MyCourseKeyEntity;Ljava/util/List;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm7/c;

    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->invoke(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->create(Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;

    sget-object v0, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, v0}, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 42
    .line 43
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 44
    .line 45
    if-ne p1, v1, :cond_4

    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a(Lcom/zykj/study/repository/PageKeyedRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/zykj/study/data/MyCourseKeyEntity;->getUserId()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput v4, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->a:I

    .line 64
    .line 65
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/MyCourseEntityDao;->deleteByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 73
    .line 74
    invoke-static {p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a(Lcom/zykj/study/repository/PageKeyedRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->myCourseKeyEntityDao()Lcom/zykj/study/data/MyCourseKeyEntityDao;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/MyCourseKeyEntity;

    .line 83
    .line 84
    iput v3, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->a:I

    .line 85
    .line 86
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/MyCourseKeyEntityDao;->update(Lcom/zykj/study/data/MyCourseKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/PageKeyedRemoteMediator;

    .line 94
    .line 95
    invoke-static {p1}, Lcom/zykj/study/repository/PageKeyedRemoteMediator;->a(Lcom/zykj/study/repository/PageKeyedRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->myCourseEntityDao()Lcom/zykj/study/data/MyCourseEntityDao;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object v1, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 104
    .line 105
    iput v2, p0, Lcom/zykj/study/repository/PageKeyedRemoteMediator$saveToLocal$2;->a:I

    .line 106
    .line 107
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/MyCourseEntityDao;->insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v0, :cond_6

    .line 112
    .line 113
    :goto_2
    return-object v0

    .line 114
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 115
    .line 116
    return-object p1
.end method
