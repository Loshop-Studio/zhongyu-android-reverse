.class final Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/CourseStudyRemoteMediator;->c(Ljava/util/List;Landroidx/paging/LoadType;Lcom/zykj/study/data/CourseStudyKeyEntity;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.repository.CourseStudyRemoteMediator$saveToLocal$2"
    f = "CourseStudyRemoteMediator.kt"
    l = {
        0x44,
        0x49,
        0x4f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroidx/paging/LoadType;

.field public final synthetic c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

.field public final synthetic d:Lcom/zykj/study/data/CourseStudyKeyEntity;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/CourseStudyRemoteMediator;Lcom/zykj/study/data/CourseStudyKeyEntity;Ljava/util/List;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

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
    new-instance v0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;-><init>(Landroidx/paging/LoadType;Lcom/zykj/study/repository/CourseStudyRemoteMediator;Lcom/zykj/study/data/CourseStudyKeyEntity;Ljava/util/List;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm7/c;

    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->invoke(Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->create(Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;

    sget-object v0, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, v0}, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->a:I

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
    goto/16 :goto_4

    .line 22
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
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->b:Landroidx/paging/LoadType;

    .line 43
    .line 44
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 45
    .line 46
    if-ne p1, v1, :cond_4

    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a(Lcom/zykj/study/repository/CourseStudyRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getUserId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput v4, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->a:I

    .line 65
    .line 66
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/CourseStudyEntityDao;->deleteByUserId(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 74
    .line 75
    invoke-static {p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a(Lcom/zykj/study/repository/CourseStudyRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->courseStudyKeyEntityDao()Lcom/zykj/study/data/CourseStudyKeyEntityDao;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 84
    .line 85
    iput v3, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->a:I

    .line 86
    .line 87
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/CourseStudyKeyEntityDao;->update(Lcom/zykj/study/data/CourseStudyKeyEntity;Lm7/c;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lcom/zykj/study/data/CourseStudyEntity;

    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/zykj/study/data/CourseStudyKeyEntity;->getUserId()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v3, v4}, Lcom/zykj/study/data/CourseStudyEntity;->setStudyUserId(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    iget-object p1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->c:Lcom/zykj/study/repository/CourseStudyRemoteMediator;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/zykj/study/repository/CourseStudyRemoteMediator;->a(Lcom/zykj/study/repository/CourseStudyRemoteMediator;)Lcom/zykj/study/data/AppDatabase;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Lcom/zykj/study/data/AppDatabase;->courseStudyEntityDao()Lcom/zykj/study/data/CourseStudyEntityDao;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object v1, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->e:Ljava/util/List;

    .line 133
    .line 134
    iput v2, p0, Lcom/zykj/study/repository/CourseStudyRemoteMediator$saveToLocal$2;->a:I

    .line 135
    .line 136
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/CourseStudyEntityDao;->insert(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v0, :cond_7

    .line 141
    .line 142
    :goto_3
    return-object v0

    .line 143
    :cond_7
    :goto_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 144
    .line 145
    return-object p1
.end method
