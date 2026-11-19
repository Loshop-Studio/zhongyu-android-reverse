.class final Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->h(Ls/j;Lhd/p;Lvc/c;)Ljava/lang/Object;
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
    c = "coil3.network.NetworkFetcher$executeNetworkRequest$2"
    f = "NetworkFetcher.kt"
    l = {
        0xcd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lhd/p;


# direct methods
.method public constructor <init>(Lhd/p;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->e:Lhd/p;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->e:Lhd/p;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;-><init>(Lhd/p;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ls/l;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls/l;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->g(Ls/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls/l;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ls/l;->d()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/16 v2, 0xc8

    .line 36
    .line 37
    if-gt v2, p1, :cond_2

    .line 38
    .line 39
    const/16 v2, 0x12c

    .line 40
    .line 41
    if-ge p1, v2, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {v0}, Ls/l;->d()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/16 v2, 0x130

    .line 49
    .line 50
    if-ne p1, v2, :cond_4

    .line 51
    .line 52
    :goto_0
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->e:Lhd/p;

    .line 53
    .line 54
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->d:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, p0, Lcoil3/network/NetworkFetcher$executeNetworkRequest$2;->c:I

    .line 61
    .line 62
    invoke-interface {p1, v0, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    return-object p1

    .line 70
    :cond_4
    new-instance p1, Lcoil3/network/HttpException;

    .line 71
    .line 72
    invoke-direct {p1, v0}, Lcoil3/network/HttpException;-><init>(Ls/l;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method
