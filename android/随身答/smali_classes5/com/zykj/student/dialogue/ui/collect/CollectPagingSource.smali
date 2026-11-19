.class public final Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;
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
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00142\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;",
        "Landroidx/paging/PagingSource;",
        "",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        "Lk6/g;",
        "dialogueApi",
        "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;",
        "req",
        "Lkotlin/Function1;",
        "",
        "",
        "onError",
        "<init>",
        "(Lk6/g;Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/jvm/functions/Function1;)V",
        "Landroidx/paging/PagingState;",
        "state",
        "getRefreshKey",
        "(Landroidx/paging/PagingState;)Ljava/lang/Integer;",
        "Landroidx/paging/PagingSource$LoadParams;",
        "params",
        "Landroidx/paging/PagingSource$LoadResult;",
        "load",
        "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lk6/g;",
        "b",
        "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;",
        "c",
        "Lkotlin/jvm/functions/Function1;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCollectPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectPagingSource.kt\ncom/zykj/student/dialogue/ui/collect/CollectPagingSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1563#2:43\n1634#2,3:44\n*S KotlinDebug\n*F\n+ 1 CollectPagingSource.kt\ncom/zykj/student/dialogue/ui/collect/CollectPagingSource\n*L\n28#1:43\n28#1:44,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lk6/g;

.field public final b:Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/g;Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "dialogueApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "req"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->a:Lk6/g;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->b:Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->c:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;-><init>(Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->f:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    iget v3, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->c:I

    .line 43
    .line 44
    iget v4, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->b:I

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Landroidx/paging/PagingSource$LoadParams;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {p1 .. p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/Integer;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :goto_1
    move v10, v0

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 v0, 0x0

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    :try_start_1
    iget-object v0, v1, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->a:Lk6/g;

    .line 85
    .line 86
    iget-object v6, v1, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->b:Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    .line 87
    .line 88
    const/4 v12, 0x7

    .line 89
    const/4 v13, 0x0

    .line 90
    const/16 v11, 0x14

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    invoke-static/range {v6 .. v13}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;->copy$default(Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;IIILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iput-object v6, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v10, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->b:I

    .line 106
    .line 107
    iput v11, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->c:I

    .line 108
    .line 109
    iput v5, v2, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource$load$1;->f:I

    .line 110
    .line 111
    invoke-interface {v0, v4, v2}, Lk6/g;->n(Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-ne v0, v3, :cond_4

    .line 116
    .line 117
    return-object v3

    .line 118
    :cond_4
    move v4, v10

    .line 119
    move v3, v11

    .line 120
    :goto_3
    check-cast v0, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/network/BaseResponse;->getResult()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Ljava/util/List;

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    new-instance v5, Ljava/util/ArrayList;

    .line 132
    .line 133
    const/16 v6, 0xa

    .line 134
    .line 135
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    move-object v7, v6

    .line 157
    check-cast v7, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 158
    .line 159
    const/16 v19, 0x5ff

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const/4 v8, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v11, 0x0

    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x1

    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    invoke-static/range {v7 .. v20}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->copy$default(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_5
    move-object v5, v2

    .line 186
    :cond_6
    sub-int v0, v4, v3

    .line 187
    .line 188
    if-lez v0, :cond_7

    .line 189
    .line 190
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    move-object v0, v2

    .line 196
    :goto_5
    if-eqz v5, :cond_9

    .line 197
    .line 198
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_8

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-ne v6, v3, :cond_9

    .line 210
    .line 211
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    add-int/2addr v4, v2

    .line 216
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :cond_9
    :goto_6
    new-instance v3, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 221
    .line 222
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v3, v5, v0, v2}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    .line 227
    .line 228
    return-object v3

    .line 229
    :goto_7
    iget-object v2, v1, Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;->c:Lkotlin/jvm/functions/Function1;

    .line 230
    .line 231
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    new-instance v2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 235
    .line 236
    invoke-direct {v2, v0}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    return-object v2
.end method
