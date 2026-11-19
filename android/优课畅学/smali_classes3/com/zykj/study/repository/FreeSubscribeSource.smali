.class public final Lcom/zykj/study/repository/FreeSubscribeSource;
.super Landroidx/paging/PagingSource;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingSource<",
        "Ljava/lang/Integer;",
        "Lcom/zykj/study/bean/FreeSubscribe;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lo4/i;

.field public final b:Lcom/zykj/study/bean/FreeSubscribeReq;

.field public final c:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/i;Lcom/zykj/study/bean/FreeSubscribeReq;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "req"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->a:Lo4/i;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->b:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->c:Lx7/l;

    .line 24
    .line 25
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
    invoke-virtual {p0, p1}, Lcom/zykj/study/repository/FreeSubscribeSource;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->f:I

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
    iput v1, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;-><init>(Lcom/zykj/study/repository/FreeSubscribeSource;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->f:I

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
    iget p1, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->c:I

    .line 39
    .line 40
    iget v1, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->b:I

    .line 41
    .line 42
    iget-object v0, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 p2, 0x0

    .line 78
    :goto_1
    :try_start_1
    iget-object v2, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->a:Lo4/i;

    .line 79
    .line 80
    iget-object v4, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->b:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 81
    .line 82
    invoke-virtual {v4, p2}, Lcom/zykj/study/bean/FreeSubscribeReq;->setSkipCount(I)V

    .line 83
    .line 84
    .line 85
    const/16 v5, 0x14

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Lcom/zykj/study/bean/FreeSubscribeReq;->setPageSize(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->a:Ljava/lang/Object;

    .line 95
    .line 96
    iput p2, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->b:I

    .line 97
    .line 98
    iput v5, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->c:I

    .line 99
    .line 100
    iput v3, v0, Lcom/zykj/study/repository/FreeSubscribeSource$load$1;->f:I

    .line 101
    .line 102
    invoke-interface {v2, v4, v0}, Lo4/i;->d(Lcom/zykj/study/bean/FreeSubscribeReq;Lm7/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_4
    move v1, p2

    .line 110
    move-object p2, p1

    .line 111
    move p1, v5

    .line 112
    :goto_2
    check-cast p2, Lcom/zykj/study/bean/FreeSubscribeResp;

    .line 113
    .line 114
    sub-int v0, v1, p1

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    if-lez v0, :cond_5

    .line 118
    .line 119
    invoke-static {v0}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    move-object v0, v2

    .line 125
    :goto_3
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribeResp;->getItems()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribeResp;->getItems()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ne v3, p1, :cond_7

    .line 147
    .line 148
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribeResp;->getItems()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    add-int/2addr v1, p1

    .line 157
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/zykj/study/repository/FreeSubscribeSource;->c:Lx7/l;

    .line 162
    .line 163
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribeResp;->getTotalCount()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-interface {p1, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    new-instance p1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 175
    .line 176
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribeResp;->getItems()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2, v0, v2}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :goto_5
    new-instance p2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 185
    .line 186
    invoke-direct {p2, p1}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    return-object p2
.end method
