.class final Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/coroutines/ConnectionPoolImpl;->useConnection(ZLhd/p;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4"
    f = "ConnectionPoolImpl.kt"
    l = {
        0x8f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $connection:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/room/coroutines/PooledConnectionImpl;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lhd/p;Lkotlin/jvm/internal/Ref$ObjectRef;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/room/coroutines/PooledConnectionImpl;",
            ">;",
            "Lvc/c<",
            "-",
            "Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$block:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$connection:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$block:Lhd/p;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$connection:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;-><init>(Lhd/p;Lkotlin/jvm/internal/Ref$ObjectRef;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->label:I

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
    return-object p1

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
    iget-object p1, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$block:Lhd/p;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->$connection:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 30
    .line 31
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 32
    .line 33
    iput v2, p0, Landroidx/room/coroutines/ConnectionPoolImpl$useConnection$4;->label:I

    .line 34
    .line 35
    invoke-interface {p1, v1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    return-object p1
.end method
