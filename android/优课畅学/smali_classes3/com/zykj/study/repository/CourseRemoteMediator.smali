.class public final Lcom/zykj/study/repository/CourseRemoteMediator;
.super Landroidx/paging/PagingSource;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/paging/ExperimentalPagingApi;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingSource<",
        "Ljava/lang/Integer;",
        "Lcom/zykj/study/bean/course/CourseSimpleBean;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lo4/b;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/b;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "api"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/repository/CourseRemoteMediator;->a:Lo4/b;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/study/repository/CourseRemoteMediator;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/CourseRemoteMediator;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;-><init>(Lcom/zykj/study/repository/CourseRemoteMediator;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->b:I

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_5

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move p2, v3

    .line 75
    :goto_1
    :try_start_1
    iget-object v2, p0, Lcom/zykj/study/repository/CourseRemoteMediator;->a:Lo4/b;

    .line 76
    .line 77
    iget-object v4, p0, Lcom/zykj/study/repository/CourseRemoteMediator;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->a:Ljava/lang/Object;

    .line 84
    .line 85
    iput p2, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->b:I

    .line 86
    .line 87
    iput v3, v0, Lcom/zykj/study/repository/CourseRemoteMediator$load$1;->e:I

    .line 88
    .line 89
    invoke-interface {v2, p2, v4, v0}, Lo4/b;->p(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_4

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    move v6, p2

    .line 97
    move-object p2, p1

    .line 98
    move p1, v6

    .line 99
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 100
    .line 101
    new-instance v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    if-ne p1, v3, :cond_5

    .line 105
    .line 106
    move-object v2, v1

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    add-int/lit8 v2, p1, -0x1

    .line 109
    .line 110
    invoke-static {v2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/16 v5, 0x14

    .line 119
    .line 120
    if-eq v4, v5, :cond_6

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    add-int/2addr p1, v3

    .line 124
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :goto_4
    invoke-direct {v0, p2, v2, v1}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :goto_5
    new-instance p2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 133
    .line 134
    invoke-direct {p2, p1}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    return-object p2
.end method
