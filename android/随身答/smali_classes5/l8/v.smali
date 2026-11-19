.class public Ll8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ll8/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/v$a;,
        Ll8/v$b;
    }
.end annotation


# static fields
.field public static final D:Ll8/v$b;

.field public static final E:Ljava/util/List;

.field public static final F:Ljava/util/List;


# instance fields
.field public final A:I

.field public final B:J

.field public final C:Lq8/g;

.field public final a:Ll8/m;

.field public final b:Ll8/i;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ll8/o$c;

.field public final f:Z

.field public final g:Ll8/b;

.field public final h:Z

.field public final i:Z

.field public final j:Ll8/k;

.field public final k:Ll8/n;

.field public final l:Ljava/net/Proxy;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Ll8/b;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lokhttp3/CertificatePinner;

.field public final v:Lx8/c;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll8/v$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll8/v$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll8/v;->D:Ll8/v$b;

    .line 8
    .line 9
    sget-object v0, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 10
    .line 11
    sget-object v1, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Lokhttp3/Protocol;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lm8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Ll8/v;->E:Ljava/util/List;

    .line 22
    .line 23
    sget-object v0, Lokhttp3/b;->i:Lokhttp3/b;

    .line 24
    .line 25
    sget-object v1, Lokhttp3/b;->k:Lokhttp3/b;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [Lokhttp3/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lm8/d;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ll8/v;->F:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    new-instance v0, Ll8/v$a;

    invoke-direct {v0}, Ll8/v$a;-><init>()V

    invoke-direct {p0, v0}, Ll8/v;-><init>(Ll8/v$a;)V

    return-void
.end method

.method public constructor <init>(Ll8/v$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ll8/v$a;->r()Ll8/m;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->a:Ll8/m;

    .line 3
    invoke-virtual {p1}, Ll8/v$a;->o()Ll8/i;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->b:Ll8/i;

    .line 4
    invoke-virtual {p1}, Ll8/v$a;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->c:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Ll8/v$a;->z()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm8/d;->S(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->d:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Ll8/v$a;->t()Ll8/o$c;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->e:Ll8/o$c;

    .line 7
    invoke-virtual {p1}, Ll8/v$a;->G()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v;->f:Z

    .line 8
    invoke-virtual {p1}, Ll8/v$a;->i()Ll8/b;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->g:Ll8/b;

    .line 9
    invoke-virtual {p1}, Ll8/v$a;->u()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v;->h:Z

    .line 10
    invoke-virtual {p1}, Ll8/v$a;->v()Z

    move-result v0

    iput-boolean v0, p0, Ll8/v;->i:Z

    .line 11
    invoke-virtual {p1}, Ll8/v$a;->q()Ll8/k;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->j:Ll8/k;

    .line 12
    invoke-virtual {p1}, Ll8/v$a;->j()Ll8/c;

    .line 13
    invoke-virtual {p1}, Ll8/v$a;->s()Ll8/n;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->k:Ll8/n;

    .line 14
    invoke-virtual {p1}, Ll8/v$a;->C()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->l:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, Ll8/v$a;->C()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lw8/a;->a:Lw8/a;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ll8/v$a;->E()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lw8/a;->a:Lw8/a;

    .line 17
    :cond_2
    :goto_0
    iput-object v0, p0, Ll8/v;->m:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, Ll8/v$a;->D()Ll8/b;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->n:Ll8/b;

    .line 19
    invoke-virtual {p1}, Ll8/v$a;->I()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->o:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, Ll8/v$a;->p()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->r:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Ll8/v$a;->B()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll8/v;->s:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, Ll8/v$a;->w()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Ll8/v;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, Ll8/v$a;->k()I

    move-result v1

    iput v1, p0, Ll8/v;->w:I

    .line 24
    invoke-virtual {p1}, Ll8/v$a;->n()I

    move-result v1

    iput v1, p0, Ll8/v;->x:I

    .line 25
    invoke-virtual {p1}, Ll8/v$a;->F()I

    move-result v1

    iput v1, p0, Ll8/v;->y:I

    .line 26
    invoke-virtual {p1}, Ll8/v$a;->K()I

    move-result v1

    iput v1, p0, Ll8/v;->z:I

    .line 27
    invoke-virtual {p1}, Ll8/v$a;->A()I

    move-result v1

    iput v1, p0, Ll8/v;->A:I

    .line 28
    invoke-virtual {p1}, Ll8/v$a;->y()J

    move-result-wide v1

    iput-wide v1, p0, Ll8/v;->B:J

    .line 29
    invoke-virtual {p1}, Ll8/v$a;->H()Lq8/g;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lq8/g;

    invoke-direct {v1}, Lq8/g;-><init>()V

    :cond_3
    iput-object v1, p0, Ll8/v;->C:Lq8/g;

    if-eqz v0, :cond_4

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 31
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/b;

    .line 32
    invoke-virtual {v1}, Lokhttp3/b;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 33
    invoke-virtual {p1}, Ll8/v$a;->J()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 34
    invoke-virtual {p1}, Ll8/v$a;->J()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 35
    invoke-virtual {p1}, Ll8/v$a;->l()Lx8/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Ll8/v;->v:Lx8/c;

    .line 36
    invoke-virtual {p1}, Ll8/v$a;->L()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v1, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 37
    invoke-virtual {p1}, Ll8/v$a;->m()Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 38
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lokhttp3/CertificatePinner;->e(Lx8/c;)Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 39
    iput-object p1, p0, Ll8/v;->u:Lokhttp3/CertificatePinner;

    goto :goto_2

    .line 40
    :cond_6
    sget-object v0, Lu8/j;->a:Lu8/j$a;

    invoke-virtual {v0}, Lu8/j$a;->g()Lu8/j;

    move-result-object v1

    invoke-virtual {v1}, Lu8/j;->o()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 41
    invoke-virtual {v0}, Lu8/j$a;->g()Lu8/j;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lu8/j;->n(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 42
    sget-object v0, Lx8/c;->a:Lx8/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lx8/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lx8/c;

    move-result-object v0

    iput-object v0, p0, Ll8/v;->v:Lx8/c;

    .line 43
    invoke-virtual {p1}, Ll8/v$a;->m()Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lokhttp3/CertificatePinner;->e(Lx8/c;)Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 45
    iput-object p1, p0, Ll8/v;->u:Lokhttp3/CertificatePinner;

    goto :goto_2

    :cond_7
    :goto_1
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 47
    iput-object p1, p0, Ll8/v;->v:Lx8/c;

    .line 48
    iput-object p1, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 49
    sget-object p1, Lokhttp3/CertificatePinner;->d:Lokhttp3/CertificatePinner;

    iput-object p1, p0, Ll8/v;->u:Lokhttp3/CertificatePinner;

    .line 50
    :goto_2
    invoke-virtual {p0}, Ll8/v;->K()V

    return-void
.end method

.method public static final synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/v;->F:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/v;->E:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f(Ll8/v;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A()Ll8/v$a;
    .locals 1

    .line 1
    new-instance v0, Ll8/v$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll8/v$a;-><init>(Ll8/v;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final B()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ll8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->n:Ll8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->m:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final I()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->o:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "CLEARTEXT-only client"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final K()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll8/v;->c:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_b

    .line 14
    .line 15
    iget-object v0, p0, Ll8/v;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-object v0, p0, Ll8/v;->r:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lokhttp3/b;

    .line 52
    .line 53
    invoke-virtual {v1}, Lokhttp3/b;->f()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Ll8/v;->v:Lx8/c;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "x509TrustManager == null"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "certificateChainCleaner == null"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v1, "sslSocketFactory == null"

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_5
    :goto_0
    iget-object v0, p0, Ll8/v;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 97
    .line 98
    const-string v1, "Check failed."

    .line 99
    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    iget-object v0, p0, Ll8/v;->v:Lx8/c;

    .line 103
    .line 104
    if-nez v0, :cond_8

    .line 105
    .line 106
    iget-object v0, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p0, Ll8/v;->u:Lokhttp3/CertificatePinner;

    .line 111
    .line 112
    sget-object v2, Lokhttp3/CertificatePinner;->d:Lokhttp3/CertificatePinner;

    .line 113
    .line 114
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v1, "Null network interceptor: "

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Ll8/v;->d:Ljava/util/List;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v1, "Null interceptor: "

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget-object v1, p0, Ll8/v;->c:Ljava/util/List;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1
.end method

.method public final L()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final M()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->q:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ll8/w;)Ll8/e;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq8/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lq8/e;-><init>(Ll8/v;Ll8/w;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g()Ll8/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->g:Ll8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ll8/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()Lx8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->v:Lx8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lokhttp3/CertificatePinner;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->u:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Ll8/v;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Ll8/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->b:Ll8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ll8/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->j:Ll8/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ll8/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->a:Ll8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ll8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->k:Ll8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ll8/o$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->e:Ll8/o$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll8/v;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final v()Lq8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->C:Lq8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll8/v;->B:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/v;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
