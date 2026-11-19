.class final Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"
    }
    d2 = {
        "T",
        "Lcoil3/network/m;",
        "response",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.network.NetworkFetcher$executeNetworkRequest$2"
    f = "NetworkFetcher.kt"
    i = {}
    l = {
        0xcd
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $block:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lr6/e;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/e;",
            "Lh6/c<",
            "-",
            "Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->$block:Lr6/e;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->$block:Lr6/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;-><init>(Lr6/e;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lcoil3/network/m;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcoil3/network/m;",
            "Lh6/c<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcoil3/network/m;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->invoke(Lcoil3/network/m;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcoil3/network/m;

    .line 28
    .line 29
    iget v1, p1, Lcoil3/network/m;->a:I

    .line 30
    .line 31
    const/16 v3, 0xc8

    .line 32
    .line 33
    if-gt v3, v1, :cond_2

    .line 34
    .line 35
    const/16 v3, 0x12c

    .line 36
    .line 37
    if-ge v1, v3, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/16 v3, 0x130

    .line 41
    .line 42
    if-ne v1, v3, :cond_4

    .line 43
    .line 44
    :goto_0
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->$block:Lr6/e;

    .line 45
    .line 46
    iput v2, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->label:I

    .line 47
    .line 48
    invoke-interface {v1, p1, p0}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    return-object p1

    .line 56
    :cond_4
    new-instance v0, Lcoil3/network/HttpException;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lcoil3/network/HttpException;-><init>(Lcoil3/network/m;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method
