.class public abstract Lw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()Lu/f;
    .locals 1

    .line 1
    invoke-static {}, Lw/b;->b()Lu/f;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lu/f;
    .locals 1

    .line 1
    new-instance v0, Ll8/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ll8/v;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lw/b;->c(Ll8/e$a;)Lu/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static final c(Ll8/e$a;)Lu/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/network/okhttp/internal/CallFactoryNetworkClient;->c(Ll8/e$a;)Ll8/e$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcoil3/network/okhttp/internal/CallFactoryNetworkClient;->b(Ll8/e$a;)Lcoil3/network/okhttp/internal/CallFactoryNetworkClient;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final d()Lcoil3/network/NetworkFetcher$Factory;
    .locals 6

    .line 1
    new-instance v0, Lcoil3/network/NetworkFetcher$Factory;

    .line 2
    .line 3
    new-instance v1, Lw/a;

    .line 4
    .line 5
    invoke-direct {v1}, Lw/a;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x6

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct/range {v0 .. v5}, Lcoil3/network/NetworkFetcher$Factory;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
