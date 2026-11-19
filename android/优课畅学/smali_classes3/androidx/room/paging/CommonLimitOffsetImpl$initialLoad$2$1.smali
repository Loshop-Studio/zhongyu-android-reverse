.class final Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


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
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1"
    f = "LimitOffsetPagingSource.kt"
    l = {
        0x7a,
        0x7c
    }
    m = "invokeSuspend"
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
.method public constructor <init>(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lm7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Lm7/c<",
            "-",
            "Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->$params:Landroidx/paging/PagingSource$LoadParams;

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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm7/c<",
            "*>;)",
            "Lm7/c<",
            "Lh7/p;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->$params:Landroidx/paging/PagingSource$LoadParams;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Landroidx/room/TransactionScope;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/TransactionScope<",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;",
            "Lm7/c<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/room/TransactionScope;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->invoke(Landroidx/room/TransactionScope;Lm7/c;)Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

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
    invoke-static {p1, v1, p0}, Landroidx/room/paging/util/RoomPagingUtil;->queryItemCount(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;Lm7/c;)Ljava/lang/Object;

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
    invoke-static {v4}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getConvertRows$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Lx7/q;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iput v2, p0, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2$1;->label:I

    .line 85
    .line 86
    invoke-static {v1, v3, p1, v4, p0}, Landroidx/room/paging/util/RoomPagingUtil;->queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILx7/q;Lm7/c;)Ljava/lang/Object;

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
