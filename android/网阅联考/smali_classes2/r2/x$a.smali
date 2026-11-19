.class public final Lr2/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:Lw2/h;

.field public a:Lr2/o;

.field public b:Lr2/j;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public e:Lr2/q$c;

.field public f:Z

.field public g:Lr2/b;

.field public h:Z

.field public i:Z

.field public j:Lr2/m;

.field public k:Lr2/p;

.field public l:Ljava/net/Proxy;

.field public m:Ljava/net/ProxySelector;

.field public n:Lr2/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Lokhttp3/CertificatePinner;

.field public v:Ld3/c;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr2/o;

    .line 5
    .line 6
    invoke-direct {v0}, Lr2/o;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr2/x$a;->a:Lr2/o;

    .line 10
    .line 11
    new-instance v0, Lr2/j;

    .line 12
    .line 13
    invoke-direct {v0}, Lr2/j;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr2/x$a;->b:Lr2/j;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr2/x$a;->c:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lr2/x$a;->d:Ljava/util/List;

    .line 31
    .line 32
    sget-object v0, Lr2/q;->a:Lr2/q;

    .line 33
    .line 34
    invoke-static {v0}, Ls2/b;->e(Lr2/q;)Lr2/q$c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lr2/x$a;->e:Lr2/q$c;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lr2/x$a;->f:Z

    .line 42
    .line 43
    sget-object v1, Lr2/b;->a:Lr2/b;

    .line 44
    .line 45
    iput-object v1, p0, Lr2/x$a;->g:Lr2/b;

    .line 46
    .line 47
    iput-boolean v0, p0, Lr2/x$a;->h:Z

    .line 48
    .line 49
    iput-boolean v0, p0, Lr2/x$a;->i:Z

    .line 50
    .line 51
    sget-object v0, Lr2/m;->a:Lr2/m;

    .line 52
    .line 53
    iput-object v0, p0, Lr2/x$a;->j:Lr2/m;

    .line 54
    .line 55
    sget-object v0, Lr2/p;->a:Lr2/p;

    .line 56
    .line 57
    iput-object v0, p0, Lr2/x$a;->k:Lr2/p;

    .line 58
    .line 59
    iput-object v1, p0, Lr2/x$a;->n:Lr2/b;

    .line 60
    .line 61
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "SocketFactory.getDefault()"

    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lr2/x$a;->o:Ljavax/net/SocketFactory;

    .line 71
    .line 72
    sget-object v0, Lr2/x;->F:Lr2/x$b;

    .line 73
    .line 74
    invoke-virtual {v0}, Lr2/x$b;->a()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Lr2/x$a;->r:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0}, Lr2/x$b;->b()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lr2/x$a;->s:Ljava/util/List;

    .line 85
    .line 86
    sget-object v0, Ld3/d;->a:Ld3/d;

    .line 87
    .line 88
    iput-object v0, p0, Lr2/x$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 89
    .line 90
    sget-object v0, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 91
    .line 92
    iput-object v0, p0, Lr2/x$a;->u:Lokhttp3/CertificatePinner;

    .line 93
    .line 94
    const/16 v0, 0x2710

    .line 95
    .line 96
    iput v0, p0, Lr2/x$a;->x:I

    .line 97
    .line 98
    iput v0, p0, Lr2/x$a;->y:I

    .line 99
    .line 100
    iput v0, p0, Lr2/x$a;->z:I

    .line 101
    .line 102
    const-wide/16 v0, 0x400

    .line 103
    .line 104
    iput-wide v0, p0, Lr2/x$a;->B:J

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x$a;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x$a;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final C()Lw2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->C:Lw2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->o:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x$a;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final G()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H(JLjava/util/concurrent/TimeUnit;)Lr2/x$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Ls2/b;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lr2/x$a;->y:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final I(JLjava/util/concurrent/TimeUnit;)Lr2/x$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Ls2/b;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lr2/x$a;->z:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final a(Lr2/u;)Lr2/x$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr2/x$a;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b()Lr2/x;
    .locals 1

    .line 1
    new-instance v0, Lr2/x;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr2/x;-><init>(Lr2/x$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(JLjava/util/concurrent/TimeUnit;)Lr2/x$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Ls2/b;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lr2/x$a;->x:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final d()Lr2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->g:Lr2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lr2/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x$a;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ld3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->v:Ld3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lokhttp3/CertificatePinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->u:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x$a;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()Lr2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->b:Lr2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lr2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->j:Lr2/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lr2/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->a:Lr2/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lr2/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->k:Lr2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lr2/q$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->e:Lr2/q$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x$a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final r()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lr2/x$a;->B:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final u()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x$a;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final w()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Lr2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->n:Lr2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x$a;->m:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method
