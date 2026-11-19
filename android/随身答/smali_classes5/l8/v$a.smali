.class public final Ll8/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:Lq8/g;

.field public a:Ll8/m;

.field public b:Ll8/i;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public e:Ll8/o$c;

.field public f:Z

.field public g:Ll8/b;

.field public h:Z

.field public i:Z

.field public j:Ll8/k;

.field public k:Ll8/n;

.field public l:Ljava/net/Proxy;

.field public m:Ljava/net/ProxySelector;

.field public n:Ll8/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Lokhttp3/CertificatePinner;

.field public v:Lx8/c;

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
    new-instance v0, Ll8/m;

    invoke-direct {v0}, Ll8/m;-><init>()V

    iput-object v0, p0, Ll8/v$a;->a:Ll8/m;

    .line 3
    new-instance v0, Ll8/i;

    invoke-direct {v0}, Ll8/i;-><init>()V

    iput-object v0, p0, Ll8/v$a;->b:Ll8/i;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll8/v$a;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll8/v$a;->d:Ljava/util/List;

    .line 6
    sget-object v0, Ll8/o;->b:Ll8/o;

    invoke-static {v0}, Lm8/d;->g(Ll8/o;)Ll8/o$c;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->e:Ll8/o$c;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ll8/v$a;->f:Z

    .line 8
    sget-object v1, Ll8/b;->b:Ll8/b;

    iput-object v1, p0, Ll8/v$a;->g:Ll8/b;

    .line 9
    iput-boolean v0, p0, Ll8/v$a;->h:Z

    .line 10
    iput-boolean v0, p0, Ll8/v$a;->i:Z

    .line 11
    sget-object v0, Ll8/k;->b:Ll8/k;

    iput-object v0, p0, Ll8/v$a;->j:Ll8/k;

    .line 12
    sget-object v0, Ll8/n;->b:Ll8/n;

    iput-object v0, p0, Ll8/v$a;->k:Ll8/n;

    .line 13
    iput-object v1, p0, Ll8/v$a;->n:Ll8/b;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll8/v$a;->o:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Ll8/v;->D:Ll8/v$b;

    invoke-virtual {v0}, Ll8/v$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll8/v$a;->r:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Ll8/v$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->s:Ljava/util/List;

    .line 17
    sget-object v0, Lx8/d;->a:Lx8/d;

    iput-object v0, p0, Ll8/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Lokhttp3/CertificatePinner;->d:Lokhttp3/CertificatePinner;

    iput-object v0, p0, Ll8/v$a;->u:Lokhttp3/CertificatePinner;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Ll8/v$a;->x:I

    .line 20
    iput v0, p0, Ll8/v$a;->y:I

    .line 21
    iput v0, p0, Ll8/v$a;->z:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Ll8/v$a;->B:J

    return-void
.end method

.method public constructor <init>(Ll8/v;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ll8/v$a;-><init>()V

    .line 24
    invoke-virtual {p1}, Ll8/v;->q()Ll8/m;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->a:Ll8/m;

    .line 25
    invoke-virtual {p1}, Ll8/v;->n()Ll8/i;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->b:Ll8/i;

    .line 26
    iget-object v0, p0, Ll8/v$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Ll8/v;->x()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 27
    iget-object v0, p0, Ll8/v$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Ll8/v;->z()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 28
    invoke-virtual {p1}, Ll8/v;->s()Ll8/o$c;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->e:Ll8/o$c;

    .line 29
    invoke-virtual {p1}, Ll8/v;->H()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v$a;->f:Z

    .line 30
    invoke-virtual {p1}, Ll8/v;->g()Ll8/b;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->g:Ll8/b;

    .line 31
    invoke-virtual {p1}, Ll8/v;->t()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v$a;->h:Z

    .line 32
    invoke-virtual {p1}, Ll8/v;->u()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v$a;->i:Z

    .line 33
    invoke-virtual {p1}, Ll8/v;->p()Ll8/k;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->j:Ll8/k;

    .line 34
    invoke-virtual {p1}, Ll8/v;->h()Ll8/c;

    .line 35
    invoke-virtual {p1}, Ll8/v;->r()Ll8/n;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->k:Ll8/n;

    .line 36
    invoke-virtual {p1}, Ll8/v;->D()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->l:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Ll8/v;->F()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->m:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Ll8/v;->E()Ll8/b;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->n:Ll8/b;

    .line 39
    invoke-virtual {p1}, Ll8/v;->I()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->o:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Ll8/v;->f(Ll8/v;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Ll8/v;->M()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Ll8/v;->o()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->r:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Ll8/v;->C()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->s:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Ll8/v;->w()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Ll8/v;->l()Lokhttp3/CertificatePinner;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->u:Lokhttp3/CertificatePinner;

    .line 46
    invoke-virtual {p1}, Ll8/v;->j()Lx8/c;

    move-result-object v0

    iput-object v0, p0, Ll8/v$a;->v:Lx8/c;

    .line 47
    invoke-virtual {p1}, Ll8/v;->i()I

    move-result v0

    iput v0, p0, Ll8/v$a;->w:I

    .line 48
    invoke-virtual {p1}, Ll8/v;->m()I

    move-result v0

    iput v0, p0, Ll8/v$a;->x:I

    .line 49
    invoke-virtual {p1}, Ll8/v;->G()I

    move-result v0

    iput v0, p0, Ll8/v$a;->y:I

    .line 50
    invoke-virtual {p1}, Ll8/v;->L()I

    move-result v0

    iput v0, p0, Ll8/v$a;->z:I

    .line 51
    invoke-virtual {p1}, Ll8/v;->B()I

    move-result v0

    iput v0, p0, Ll8/v$a;->A:I

    .line 52
    invoke-virtual {p1}, Ll8/v;->y()J

    move-result-wide v0

    iput-wide v0, p0, Ll8/v$a;->B:J

    .line 53
    invoke-virtual {p1}, Ll8/v;->v()Lq8/g;

    move-result-object p1

    iput-object p1, p0, Ll8/v$a;->C:Lq8/g;

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v$a;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ll8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->n:Ll8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->m:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v$a;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v$a;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final H()Lq8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->C:Lq8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->o:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v$a;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final L()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->q:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(Ljavax/net/ssl/HostnameVerifier;)Ll8/v$a;
    .locals 1

    .line 1
    const-string v0, "hostnameVerifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll8/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iput-object v0, p0, Ll8/v$a;->C:Lq8/g;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Ll8/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    .line 19
    return-object p0
.end method

.method public final N(Ljava/net/Proxy;)Ll8/v$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iput-object v0, p0, Ll8/v$a;->C:Lq8/g;

    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Ll8/v$a;->l:Ljava/net/Proxy;

    .line 13
    .line 14
    return-object p0
.end method

.method public final O(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;
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
    invoke-static {v0, p1, p2, p3}, Lm8/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ll8/v$a;->y:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final P(Z)Ll8/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll8/v$a;->f:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;
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
    invoke-static {v0, p1, p2, p3}, Lm8/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ll8/v$a;->z:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final a(Ll8/s;)Ll8/v$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll8/v$a;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b(Ll8/s;)Ll8/v$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll8/v$a;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final c()Ll8/v;
    .locals 1

    .line 1
    new-instance v0, Ll8/v;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll8/v;-><init>(Ll8/v$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ll8/c;)Ll8/v$a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;
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
    invoke-static {v0, p1, p2, p3}, Lm8/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ll8/v$a;->x:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final f(Ll8/m;)Ll8/v$a;
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ll8/v$a;->a:Ll8/m;

    .line 7
    .line 8
    return-object p0
.end method

.method public final g(Z)Ll8/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll8/v$a;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Z)Ll8/v$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll8/v$a;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Ll8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->g:Ll8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ll8/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v$a;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()Lx8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->v:Lx8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lokhttp3/CertificatePinner;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->u:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v$a;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Ll8/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->b:Ll8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ll8/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->j:Ll8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ll8/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->a:Ll8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ll8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->k:Ll8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ll8/o$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->e:Ll8/o$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v$a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final w()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll8/v$a;->B:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
