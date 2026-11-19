.class final Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/room/TransactionScope<",
        "Landroidx/paging/PagingSource$LoadResult<",
        "Ljava/lang/Integer;",
        "TValue;>;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Landroidx/paging/PagingSource$LoadResult<",
        "Ljava/lang/Integer;",
        "TValue;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0008\u0008\u0000\u0010\u0003*\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/paging/PagingSource$LoadResult;",
        "",
        "Value",
        "",
        "Landroidx/room/TransactionScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1"
    f = "LimitOffsetPagingSource.kt"
    i = {}
    l = {
        0x7a,
        0x7c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $params:Landroidx/paging/PagingSource$LoadParams;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Landroidx/room/paging/CommonLimitOffsetImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    iput-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->$params:Landroidx/paging/PagingSource$LoadParams;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;

    iget-object v0, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->$params:Landroidx/paging/PagingSource$LoadParams;

    invoke-direct {p1, v0, v1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Landroidx/room/TransactionScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/TransactionScope<",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/room/TransactionScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->invoke(Landroidx/room/TransactionScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->label:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 35
    .line 36
    invoke-static {p1}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getSourceQuery$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomRawQuery;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 41
    .line 42
    invoke-static {v1}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getDb$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomDatabase;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput v3, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->label:I

    .line 47
    .line 48
    invoke-static {p1, v1, p0}, Landroidx/room/paging/util/RoomPagingUtil;->queryItemCount(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/room/paging/CommonLimitOffsetImpl;->getItemCount$room_paging_release()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->$params:Landroidx/paging/PagingSource$LoadParams;

    .line 71
    .line 72
    iget-object v3, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 73
    .line 74
    invoke-static {v3}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getSourceQuery$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomRawQuery;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 79
    .line 80
    invoke-static {v4}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getConvertRows$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Lkotlin/jvm/functions/Function3;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iput v2, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->label:I

    .line 85
    .line 86
    invoke-static {v1, v3, p1, v4, p0}, Landroidx/room/paging/util/RoomPagingUtil;->queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    :goto_1
    return-object v0

    .line 93
    :cond_4
    return-object p1
.end method
