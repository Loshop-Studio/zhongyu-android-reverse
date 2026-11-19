.class final Landroidx/room/paging/CommonLimitOffsetImpl$load$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/paging/CommonLimitOffsetImpl;->load(Landroidx/paging/PagingSource$LoadParams;Lm7/c;)Ljava/lang/Object;
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
    c = "androidx.room.paging.CommonLimitOffsetImpl$load$2"
    f = "LimitOffsetPagingSource.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
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
.method public constructor <init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lm7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;",
            "Lm7/c<",
            "-",
            "Landroidx/room/paging/CommonLimitOffsetImpl$load$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1
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
    new-instance p1, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li8/b0;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->label:I

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
    iget-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getDb$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomDatabase;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->getInvalidationTracker()Landroidx/room/InvalidationTracker;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 38
    .line 39
    invoke-static {v1}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$getTables$p(Landroidx/room/paging/CommonLimitOffsetImpl;)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    array-length v3, v1

    .line 44
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, [Ljava/lang/String;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-virtual {p1, v1, v3}, Landroidx/room/InvalidationTracker;->createFlow([Ljava/lang/String;Z)Ll8/c;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v1, Landroidx/room/paging/CommonLimitOffsetImpl$load$2$1;

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 58
    .line 59
    invoke-direct {v1, v3}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2$1;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;)V

    .line 60
    .line 61
    .line 62
    iput v2, p0, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;->label:I

    .line 63
    .line 64
    invoke-interface {p1, v1, p0}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_2

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 72
    .line 73
    return-object p1
.end method
