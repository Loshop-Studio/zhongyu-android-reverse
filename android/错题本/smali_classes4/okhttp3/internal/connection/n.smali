.class public final Lokhttp3/internal/connection/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lokhttp3/a;

.field public final b:Lo2/a;

.field public final c:Ljava/util/List;

.field public d:I

.field public e:Ljava/lang/Object;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lokhttp3/a;Lo2/a;Lokhttp3/e;)V
    .locals 1

    .line 1
    const-string p3, "routeDatabase"

    .line 2
    .line 3
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/connection/n;->a:Lokhttp3/a;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/connection/n;->b:Lo2/a;

    .line 12
    .line 13
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 14
    .line 15
    iput-object p2, p0, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 16
    .line 17
    iput-object p2, p0, Lokhttp3/internal/connection/n;->e:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lokhttp3/internal/connection/n;->f:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object p2, p1, Lokhttp3/a;->i:Lokhttp3/r;

    .line 27
    .line 28
    iget-object p3, p1, Lokhttp3/a;->g:Ljava/net/Proxy;

    .line 29
    .line 30
    const-string v0, "url"

    .line 31
    .line 32
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    invoke-static {p3}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {p2}, Lokhttp3/r;->h()Ljava/net/URI;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    if-nez p3, :cond_1

    .line 51
    .line 52
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 53
    .line 54
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lp7/c;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object p1, p1, Lokhttp3/a;->h:Ljava/net/ProxySelector;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-static {p1}, Lp7/c;->v(Ljava/util/List;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 84
    .line 85
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lp7/c;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    iput-object p1, p0, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    iput p1, p0, Lokhttp3/internal/connection/n;->d:I

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/connection/n;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/n;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/connection/n;->f:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    return v0
.end method
