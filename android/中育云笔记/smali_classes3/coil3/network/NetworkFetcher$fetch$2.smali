.class final Lcoil3/network/NetworkFetcher$fetch$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/network/NetworkFetcher;->a(Lvc/c;)Ljava/lang/Object;
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
    c = "coil3.network.NetworkFetcher$fetch$2"
    f = "NetworkFetcher.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcoil3/network/NetworkFetcher;


# direct methods
.method public constructor <init>(Lcoil3/network/NetworkFetcher;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$2;->e:Lcoil3/network/NetworkFetcher;

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
    new-instance v0, Lcoil3/network/NetworkFetcher$fetch$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$2;->e:Lcoil3/network/NetworkFetcher;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcoil3/network/NetworkFetcher$fetch$2;-><init>(Lcoil3/network/NetworkFetcher;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcoil3/network/NetworkFetcher$fetch$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ls/l;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcoil3/network/NetworkFetcher$fetch$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcoil3/network/NetworkFetcher$fetch$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcoil3/network/NetworkFetcher$fetch$2;->g(Ls/l;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$2;->d:Ljava/lang/Object;

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
    iget v2, p0, Lcoil3/network/NetworkFetcher$fetch$2;->c:I

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
    goto :goto_0

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
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$fetch$2;->e:Lcoil3/network/NetworkFetcher;

    .line 32
    .line 33
    invoke-static {v0}, Lcoil3/network/internal/UtilsKt;->f(Ls/l;)Ls/m;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v0, p0, Lcoil3/network/NetworkFetcher$fetch$2;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput v3, p0, Lcoil3/network/NetworkFetcher$fetch$2;->c:I

    .line 40
    .line 41
    invoke-static {p1, v2, p0}, Lcoil3/network/NetworkFetcher;->c(Lcoil3/network/NetworkFetcher;Ls/m;Lvc/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    :goto_0
    check-cast p1, Ll/r;

    .line 49
    .line 50
    iget-object v1, p0, Lcoil3/network/NetworkFetcher$fetch$2;->e:Lcoil3/network/NetworkFetcher;

    .line 51
    .line 52
    invoke-static {v1}, Lcoil3/network/NetworkFetcher;->b(Lcoil3/network/NetworkFetcher;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0}, Ls/l;->e()Lcoil3/network/c;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v3, "Content-Type"

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Lcoil3/network/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1, v2, v0}, Lcoil3/network/NetworkFetcher;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Lcoil3/decode/DataSource;->f:Lcoil3/decode/DataSource;

    .line 71
    .line 72
    new-instance v2, Ln/p;

    .line 73
    .line 74
    invoke-direct {v2, p1, v0, v1}, Ln/p;-><init>(Ll/r;Ljava/lang/String;Lcoil3/decode/DataSource;)V

    .line 75
    .line 76
    .line 77
    return-object v2
.end method
