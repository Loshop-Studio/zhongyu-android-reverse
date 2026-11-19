.class public final Lokhttp3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Lo2/a;

.field public a:Lc0/g;

.field public b:Lo2/a;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Lp7/a;

.field public f:Z

.field public g:Lokhttp3/b;

.field public h:Z

.field public i:Z

.field public j:Lokhttp3/b;

.field public k:Lokhttp3/b;

.field public l:Ljava/net/Proxy;

.field public m:Ljava/net/ProxySelector;

.field public n:Lokhttp3/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Lokhttp3/h;

.field public v:Ly1/a;

.field public w:I

.field public x:I

.field public y:I

.field public z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lc0/g;

    .line 5
    .line 6
    invoke-direct {v0}, Lc0/g;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lokhttp3/y;->a:Lc0/g;

    .line 10
    .line 11
    new-instance v0, Lo2/a;

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lo2/a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lokhttp3/y;->b:Lo2/a;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lokhttp3/y;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lokhttp3/y;->d:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance v0, Lp7/a;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lokhttp3/y;->e:Lp7/a;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lokhttp3/y;->f:Z

    .line 43
    .line 44
    sget-object v1, Lokhttp3/b;->a:Lokhttp3/b;

    .line 45
    .line 46
    iput-object v1, p0, Lokhttp3/y;->g:Lokhttp3/b;

    .line 47
    .line 48
    iput-boolean v0, p0, Lokhttp3/y;->h:Z

    .line 49
    .line 50
    iput-boolean v0, p0, Lokhttp3/y;->i:Z

    .line 51
    .line 52
    sget-object v0, Lokhttp3/b;->b:Lokhttp3/b;

    .line 53
    .line 54
    iput-object v0, p0, Lokhttp3/y;->j:Lokhttp3/b;

    .line 55
    .line 56
    sget-object v0, Lokhttp3/b;->c:Lokhttp3/b;

    .line 57
    .line 58
    iput-object v0, p0, Lokhttp3/y;->k:Lokhttp3/b;

    .line 59
    .line 60
    iput-object v1, p0, Lokhttp3/y;->n:Lokhttp3/b;

    .line 61
    .line 62
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "getDefault()"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lokhttp3/y;->o:Ljavax/net/SocketFactory;

    .line 72
    .line 73
    sget-object v0, Lokhttp3/z;->C:Ljava/util/List;

    .line 74
    .line 75
    iput-object v0, p0, Lokhttp3/y;->r:Ljava/util/List;

    .line 76
    .line 77
    sget-object v0, Lokhttp3/z;->B:Ljava/util/List;

    .line 78
    .line 79
    iput-object v0, p0, Lokhttp3/y;->s:Ljava/util/List;

    .line 80
    .line 81
    sget-object v0, Lz7/c;->a:Lz7/c;

    .line 82
    .line 83
    iput-object v0, p0, Lokhttp3/y;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 84
    .line 85
    sget-object v0, Lokhttp3/h;->c:Lokhttp3/h;

    .line 86
    .line 87
    iput-object v0, p0, Lokhttp3/y;->u:Lokhttp3/h;

    .line 88
    .line 89
    const/16 v0, 0x2710

    .line 90
    .line 91
    iput v0, p0, Lokhttp3/y;->w:I

    .line 92
    .line 93
    iput v0, p0, Lokhttp3/y;->x:I

    .line 94
    .line 95
    iput v0, p0, Lokhttp3/y;->y:I

    .line 96
    .line 97
    const-wide/16 v0, 0x400

    .line 98
    .line 99
    iput-wide v0, p0, Lokhttp3/y;->z:J

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final a(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Lp7/c;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lokhttp3/y;->w:I

    .line 11
    .line 12
    return-void
.end method

.method public final b(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Lp7/c;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lokhttp3/y;->x:I

    .line 11
    .line 12
    return-void
.end method

.method public final c(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Lp7/c;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lokhttp3/y;->y:I

    .line 11
    .line 12
    return-void
.end method
