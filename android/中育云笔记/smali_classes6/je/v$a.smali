.class public final Lje/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:Loe/g;

.field public a:Lje/m;

.field public b:Lje/i;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public e:Lje/o$c;

.field public f:Z

.field public g:Lje/b;

.field public h:Z

.field public i:Z

.field public j:Lje/k;

.field public k:Lje/n;

.field public l:Ljava/net/Proxy;

.field public m:Ljava/net/ProxySelector;

.field public n:Lje/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Lokhttp3/CertificatePinner;

.field public v:Lve/c;

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
    new-instance v0, Lje/m;

    invoke-direct {v0}, Lje/m;-><init>()V

    iput-object v0, p0, Lje/v$a;->a:Lje/m;

    .line 3
    new-instance v0, Lje/i;

    invoke-direct {v0}, Lje/i;-><init>()V

    iput-object v0, p0, Lje/v$a;->b:Lje/i;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lje/v$a;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lje/v$a;->d:Ljava/util/List;

    .line 6
    sget-object v0, Lje/o;->b:Lje/o;

    invoke-static {v0}, Lke/d;->g(Lje/o;)Lje/o$c;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->e:Lje/o$c;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lje/v$a;->f:Z

    .line 8
    sget-object v1, Lje/b;->b:Lje/b;

    iput-object v1, p0, Lje/v$a;->g:Lje/b;

    .line 9
    iput-boolean v0, p0, Lje/v$a;->h:Z

    .line 10
    iput-boolean v0, p0, Lje/v$a;->i:Z

    .line 11
    sget-object v0, Lje/k;->b:Lje/k;

    iput-object v0, p0, Lje/v$a;->j:Lje/k;

    .line 12
    sget-object v0, Lje/n;->b:Lje/n;

    iput-object v0, p0, Lje/v$a;->k:Lje/n;

    .line 13
    iput-object v1, p0, Lje/v$a;->n:Lje/b;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lje/v$a;->o:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Lje/v;->F:Lje/v$b;

    invoke-virtual {v0}, Lje/v$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lje/v$a;->r:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Lje/v$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->s:Ljava/util/List;

    .line 17
    sget-object v0, Lve/d;->a:Lve/d;

    iput-object v0, p0, Lje/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Lokhttp3/CertificatePinner;->d:Lokhttp3/CertificatePinner;

    iput-object v0, p0, Lje/v$a;->u:Lokhttp3/CertificatePinner;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Lje/v$a;->x:I

    .line 20
    iput v0, p0, Lje/v$a;->y:I

    .line 21
    iput v0, p0, Lje/v$a;->z:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Lje/v$a;->B:J

    return-void
.end method

.method public constructor <init>(Lje/v;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Lje/v$a;-><init>()V

    .line 24
    invoke-virtual {p1}, Lje/v;->p()Lje/m;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->a:Lje/m;

    .line 25
    invoke-virtual {p1}, Lje/v;->m()Lje/i;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->b:Lje/i;

    .line 26
    iget-object v0, p0, Lje/v$a;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lje/v;->w()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 27
    iget-object v0, p0, Lje/v$a;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lje/v;->y()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 28
    invoke-virtual {p1}, Lje/v;->r()Lje/o$c;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->e:Lje/o$c;

    .line 29
    invoke-virtual {p1}, Lje/v;->G()Z

    move-result v0

    iput-boolean v0, p0, Lje/v$a;->f:Z

    .line 30
    invoke-virtual {p1}, Lje/v;->g()Lje/b;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->g:Lje/b;

    .line 31
    invoke-virtual {p1}, Lje/v;->s()Z

    move-result v0

    iput-boolean v0, p0, Lje/v$a;->h:Z

    .line 32
    invoke-virtual {p1}, Lje/v;->t()Z

    move-result v0

    iput-boolean v0, p0, Lje/v$a;->i:Z

    .line 33
    invoke-virtual {p1}, Lje/v;->o()Lje/k;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->j:Lje/k;

    .line 34
    invoke-virtual {p1}, Lje/v;->h()Lje/c;

    .line 35
    invoke-virtual {p1}, Lje/v;->q()Lje/n;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->k:Lje/n;

    .line 36
    invoke-virtual {p1}, Lje/v;->C()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->l:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Lje/v;->E()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->m:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Lje/v;->D()Lje/b;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->n:Lje/b;

    .line 39
    invoke-virtual {p1}, Lje/v;->H()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->o:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Lje/v;->f(Lje/v;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Lje/v;->L()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Lje/v;->n()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->r:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Lje/v;->B()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->s:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Lje/v;->v()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Lje/v;->k()Lokhttp3/CertificatePinner;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->u:Lokhttp3/CertificatePinner;

    .line 46
    invoke-virtual {p1}, Lje/v;->j()Lve/c;

    move-result-object v0

    iput-object v0, p0, Lje/v$a;->v:Lve/c;

    .line 47
    invoke-virtual {p1}, Lje/v;->i()I

    move-result v0

    iput v0, p0, Lje/v$a;->w:I

    .line 48
    invoke-virtual {p1}, Lje/v;->l()I

    move-result v0

    iput v0, p0, Lje/v$a;->x:I

    .line 49
    invoke-virtual {p1}, Lje/v;->F()I

    move-result v0

    iput v0, p0, Lje/v$a;->y:I

    .line 50
    invoke-virtual {p1}, Lje/v;->K()I

    move-result v0

    iput v0, p0, Lje/v$a;->z:I

    .line 51
    invoke-virtual {p1}, Lje/v;->A()I

    move-result v0

    iput v0, p0, Lje/v$a;->A:I

    .line 52
    invoke-virtual {p1}, Lje/v;->x()J

    move-result-wide v0

    iput-wide v0, p0, Lje/v$a;->B:J

    .line 53
    invoke-virtual {p1}, Lje/v;->u()Loe/g;

    move-result-object p1

    iput-object p1, p0, Lje/v$a;->C:Loe/g;

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Lje/v$a;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Lje/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->n:Lje/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->m:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()I
    .locals 1

    .line 1
    iget v0, p0, Lje/v$a;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lje/v$a;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final H()Loe/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->C:Loe/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->o:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()I
    .locals 1

    .line 1
    iget v0, p0, Lje/v$a;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final L()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(Ljavax/net/ssl/HostnameVerifier;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "hostnameVerifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lje/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lje/v$a;->C:Loe/g;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lje/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    .line 19
    return-object p0
.end method

.method public final N(Ljava/net/Proxy;)Lje/v$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lje/v$a;->C:Loe/g;

    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lje/v$a;->l:Ljava/net/Proxy;

    .line 13
    .line 14
    return-object p0
.end method

.method public final O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lke/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lje/v$a;->y:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final P(Z)Lje/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje/v$a;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "sslSocketFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "trustManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lje/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lje/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 20
    .line 21
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lje/v$a;->C:Loe/g;

    .line 29
    .line 30
    :cond_1
    iput-object p1, p0, Lje/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 31
    .line 32
    sget-object p1, Lve/c;->a:Lve/c$a;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lve/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lve/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lje/v$a;->v:Lve/c;

    .line 39
    .line 40
    iput-object p2, p0, Lje/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 41
    .line 42
    return-object p0
.end method

.method public final R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lke/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lje/v$a;->z:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final a(Lje/s;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lje/v$a;->c:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final b(Lje/s;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lje/v$a;->d:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final c()Lje/v;
    .locals 1

    .line 1
    new-instance v0, Lje/v;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lje/v;-><init>(Lje/v$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Lje/c;)Lje/v$a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lke/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lje/v$a;->x:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final f(Lje/m;)Lje/v$a;
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lje/v$a;->a:Lje/m;

    .line 7
    .line 8
    return-object p0
.end method

.method public final g(Z)Lje/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje/v$a;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Z)Lje/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje/v$a;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Lje/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->g:Lje/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lje/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lje/v$a;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()Lve/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->v:Lve/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lokhttp3/CertificatePinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->u:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Lje/v$a;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Lje/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->b:Lje/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Lje/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->j:Lje/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lje/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->a:Lje/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lje/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->k:Lje/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Lje/o$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->e:Lje/o$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lje/v$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lje/v$a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final w()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lje/v$a;->B:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lje/v$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
