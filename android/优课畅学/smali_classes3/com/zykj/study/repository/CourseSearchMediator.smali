.class public final Lcom/zykj/study/repository/CourseSearchMediator;
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
    iput-object p1, p0, Lcom/zykj/study/repository/CourseSearchMediator;->a:Lo4/b;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/study/repository/CourseSearchMediator;->b:Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/CourseSearchMediator;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/CourseSearchMediator$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/CourseSearchMediator$load$1;-><init>(Lcom/zykj/study/repository/CourseSearchMediator;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget p1, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->b:I

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto :goto_5

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Ljava/lang/Integer;

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p2, v4

    .line 76
    :goto_1
    :try_start_1
    iget-object v2, p0, Lcom/zykj/study/repository/CourseSearchMediator;->b:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    new-instance p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 87
    .line 88
    new-instance p2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-direct {p1, p2, v3, v3}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_4
    iget-object v2, p0, Lcom/zykj/study/repository/CourseSearchMediator;->a:Lo4/b;

    .line 98
    .line 99
    iget-object v5, p0, Lcom/zykj/study/repository/CourseSearchMediator;->b:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->a:Ljava/lang/Object;

    .line 106
    .line 107
    iput p2, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->b:I

    .line 108
    .line 109
    iput v4, v0, Lcom/zykj/study/repository/CourseSearchMediator$load$1;->e:I

    .line 110
    .line 111
    invoke-interface {v2, p2, v5, v0}, Lo4/b;->p(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v1, :cond_5

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_5
    move v6, p2

    .line 119
    move-object p2, p1

    .line 120
    move p1, v6

    .line 121
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 122
    .line 123
    new-instance v0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 124
    .line 125
    if-ne p1, v4, :cond_6

    .line 126
    .line 127
    move-object v1, v3

    .line 128
    goto :goto_3

    .line 129
    :cond_6
    add-int/lit8 v1, p1, -0x1

    .line 130
    .line 131
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    const/16 v5, 0x14

    .line 140
    .line 141
    if-eq v2, v5, :cond_7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    add-int/2addr p1, v4

    .line 145
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    :goto_4
    invoke-direct {v0, p2, v1, v3}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :goto_5
    new-instance p2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 154
    .line 155
    invoke-direct {p2, p1}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    return-object p2
.end method
