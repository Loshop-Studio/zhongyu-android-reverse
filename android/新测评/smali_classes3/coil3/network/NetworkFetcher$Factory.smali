.class public final Lcoil3/network/NetworkFetcher$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/network/NetworkFetcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;

.field public final c:Lv/b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcoil3/network/NetworkFetcher$Factory;->a:Lkotlin/Lazy;

    .line 3
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcoil3/network/NetworkFetcher$Factory;->b:Lkotlin/Lazy;

    .line 4
    invoke-static {p3}, Lv/c;->a(Lkotlin/jvm/functions/Function1;)Lv/b;

    move-result-object p1

    iput-object p1, p0, Lcoil3/network/NetworkFetcher$Factory;->c:Lv/b;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lu/i;

    invoke-direct {p2}, Lu/i;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Lcoil3/network/NetworkFetcher$Factory$2;->a:Lcoil3/network/NetworkFetcher$Factory$2;

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcoil3/network/NetworkFetcher$Factory;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic b()Lcoil3/network/b;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/network/NetworkFetcher$Factory;->d()Lcoil3/network/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcoil3/e;)Lcoil3/disk/a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/network/NetworkFetcher$Factory;->f(Lcoil3/e;)Lcoil3/disk/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Lcoil3/network/b;
    .locals 1

    .line 1
    sget-object v0, Lcoil3/network/b;->b:Lcoil3/network/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final f(Lcoil3/e;)Lcoil3/disk/a;
    .locals 0

    .line 1
    invoke-interface {p0}, Lcoil3/e;->a()Lcoil3/disk/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g(Lk/t;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lk/t;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "http"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lk/t;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "https"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ly/k;Lcoil3/e;)Lp/k;
    .locals 0

    .line 1
    check-cast p1, Lk/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcoil3/network/NetworkFetcher$Factory;->e(Lk/t;Ly/k;Lcoil3/e;)Lp/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(Lk/t;Ly/k;Lcoil3/e;)Lp/k;
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lcoil3/network/NetworkFetcher$Factory;->g(Lk/t;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v0, Lcoil3/network/NetworkFetcher;

    .line 10
    .line 11
    invoke-virtual {p1}, Lk/t;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v3, p0, Lcoil3/network/NetworkFetcher$Factory;->a:Lkotlin/Lazy;

    .line 16
    .line 17
    new-instance p1, Lu/h;

    .line 18
    .line 19
    invoke-direct {p1, p3}, Lu/h;-><init>(Lcoil3/e;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Lcoil3/network/NetworkFetcher$Factory;->b:Lkotlin/Lazy;

    .line 27
    .line 28
    iget-object p1, p0, Lcoil3/network/NetworkFetcher$Factory;->c:Lv/b;

    .line 29
    .line 30
    invoke-virtual {p2}, Ly/k;->c()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p1, p3}, Lv/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object v6, p1

    .line 39
    check-cast v6, Lu/b;

    .line 40
    .line 41
    move-object v2, p2

    .line 42
    invoke-direct/range {v0 .. v6}, Lcoil3/network/NetworkFetcher;-><init>(Ljava/lang/String;Ly/k;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lu/b;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
