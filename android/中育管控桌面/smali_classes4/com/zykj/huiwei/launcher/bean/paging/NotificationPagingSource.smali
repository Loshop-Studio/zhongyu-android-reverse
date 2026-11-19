.class public final Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;
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
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000cH\u0016\u00a2\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;",
        "Landroidx/paging/PagingSource;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
        "service",
        "Lcom/zykj/huiwei/launcher/api/NotificationService;",
        "req",
        "Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;)V",
        "getRefreshKey",
        "state",
        "Landroidx/paging/PagingState;",
        "(Landroidx/paging/PagingState;)Ljava/lang/Integer;",
        "load",
        "Landroidx/paging/PagingSource$LoadResult;",
        "params",
        "Landroidx/paging/PagingSource$LoadParams;",
        "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final req:Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;

.field private final service:Lcom/zykj/huiwei/launcher/api/NotificationService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;)V
    .locals 1

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "req"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->service:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 5
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->req:Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;

    const/16 v7, 0x37

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;-><init>(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;)V

    return-void
.end method


# virtual methods
.method public getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingState<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 1
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

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
    iput v1, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;-><init>(Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

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
    iget p1, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->I$1:I

    .line 39
    .line 40
    iget v1, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->I$0:I

    .line 41
    .line 42
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroidx/paging/PagingSource$LoadParams;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
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
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :try_start_1
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->service:Lcom/zykj/huiwei/launcher/api/NotificationService;

    .line 83
    .line 84
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;->req:Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;

    .line 85
    .line 86
    invoke-virtual {v5, p2}, Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;->setSkipCount(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v2}, Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;->setMaxResultCount(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput p2, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->I$0:I

    .line 99
    .line 100
    iput v2, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->I$1:I

    .line 101
    .line 102
    iput v3, v0, Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource$load$1;->label:I

    .line 103
    .line 104
    invoke-interface {v4, v5, v0}, Lcom/zykj/huiwei/launcher/api/NotificationService;->getMyMessageList(Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v1, :cond_4

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_4
    move v1, p2

    .line 112
    move-object p2, p1

    .line 113
    move p1, v2

    .line 114
    :goto_2
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 115
    .line 116
    sub-int p1, v1, p1

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    if-lez p1, :cond_5

    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object p1, v0

    .line 127
    :goto_3
    invoke-static {p2}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;

    .line 132
    .line 133
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;->getItems()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-eqz v2, :cond_7

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    invoke-static {p2}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;->getItems()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    add-int/2addr v1, v0

    .line 161
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :cond_7
    :goto_4
    new-instance v1, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 166
    .line 167
    invoke-static {p2}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;

    .line 172
    .line 173
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;->getItems()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-direct {v1, p2, p1, v0}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    .line 179
    .line 180
    return-object v1

    .line 181
    :goto_5
    new-instance p2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 182
    .line 183
    invoke-direct {p2, p1}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    return-object p2
.end method
