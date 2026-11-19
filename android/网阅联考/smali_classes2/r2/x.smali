.class public Lr2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lr2/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/x$a;,
        Lr2/x$b;
    }
.end annotation


# static fields
.field public static final D:Ljava/util/List;

.field public static final E:Ljava/util/List;

.field public static final F:Lr2/x$b;


# instance fields
.field public final A:I

.field public final B:J

.field public final C:Lw2/h;

.field public final a:Lr2/o;

.field public final b:Lr2/j;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lr2/q$c;

.field public final f:Z

.field public final g:Lr2/b;

.field public final h:Z

.field public final i:Z

.field public final j:Lr2/m;

.field public final k:Lr2/p;

.field public final l:Ljava/net/Proxy;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lr2/b;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lokhttp3/CertificatePinner;

.field public final v:Ld3/c;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lr2/x$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr2/x$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr2/x;->F:Lr2/x$b;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v1, v0, [Lokhttp3/Protocol;

    .line 11
    .line 12
    sget-object v2, Lokhttp3/Protocol;->e:Lokhttp3/Protocol;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v2, v1, v3

    .line 16
    .line 17
    sget-object v2, Lokhttp3/Protocol;->c:Lokhttp3/Protocol;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    aput-object v2, v1, v4

    .line 21
    .line 22
    invoke-static {v1}, Ls2/b;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Lr2/x;->D:Ljava/util/List;

    .line 27
    .line 28
    new-array v0, v0, [Lr2/k;

    .line 29
    .line 30
    sget-object v1, Lr2/k;->h:Lr2/k;

    .line 31
    .line 32
    aput-object v1, v0, v3

    .line 33
    .line 34
    sget-object v1, Lr2/k;->j:Lr2/k;

    .line 35
    .line 36
    aput-object v1, v0, v4

    .line 37
    .line 38
    invoke-static {v0}, Ls2/b;->t([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lr2/x;->E:Ljava/util/List;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    new-instance v0, Lr2/x$a;

    invoke-direct {v0}, Lr2/x$a;-><init>()V

    invoke-direct {p0, v0}, Lr2/x;-><init>(Lr2/x$a;)V

    return-void
.end method

.method public constructor <init>(Lr2/x$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lr2/x$a;->m()Lr2/o;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->a:Lr2/o;

    .line 3
    invoke-virtual {p1}, Lr2/x$a;->j()Lr2/j;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->b:Lr2/j;

    .line 4
    invoke-virtual {p1}, Lr2/x$a;->s()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ls2/b;->N(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->c:Ljava/util/List;

    .line 5
    invoke-virtual {p1}, Lr2/x$a;->u()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ls2/b;->N(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->d:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Lr2/x$a;->o()Lr2/q$c;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->e:Lr2/q$c;

    .line 7
    invoke-virtual {p1}, Lr2/x$a;->B()Z

    move-result v0

    iput-boolean v0, p0, Lr2/x;->f:Z

    .line 8
    invoke-virtual {p1}, Lr2/x$a;->d()Lr2/b;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->g:Lr2/b;

    .line 9
    invoke-virtual {p1}, Lr2/x$a;->p()Z

    move-result v0

    iput-boolean v0, p0, Lr2/x;->h:Z

    .line 10
    invoke-virtual {p1}, Lr2/x$a;->q()Z

    move-result v0

    iput-boolean v0, p0, Lr2/x;->i:Z

    .line 11
    invoke-virtual {p1}, Lr2/x$a;->l()Lr2/m;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->j:Lr2/m;

    .line 12
    invoke-virtual {p1}, Lr2/x$a;->e()Lr2/c;

    .line 13
    invoke-virtual {p1}, Lr2/x$a;->n()Lr2/p;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->k:Lr2/p;

    .line 14
    invoke-virtual {p1}, Lr2/x$a;->x()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->l:Ljava/net/Proxy;

    .line 15
    invoke-virtual {p1}, Lr2/x$a;->x()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lc3/a;->a:Lc3/a;

    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lr2/x$a;->z()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lc3/a;->a:Lc3/a;

    .line 17
    :goto_1
    iput-object v0, p0, Lr2/x;->m:Ljava/net/ProxySelector;

    .line 18
    invoke-virtual {p1}, Lr2/x$a;->y()Lr2/b;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->n:Lr2/b;

    .line 19
    invoke-virtual {p1}, Lr2/x$a;->D()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->o:Ljavax/net/SocketFactory;

    .line 20
    invoke-virtual {p1}, Lr2/x$a;->k()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->r:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Lr2/x$a;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lr2/x;->s:Ljava/util/List;

    .line 22
    invoke-virtual {p1}, Lr2/x$a;->r()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Lr2/x;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 23
    invoke-virtual {p1}, Lr2/x$a;->f()I

    move-result v1

    iput v1, p0, Lr2/x;->w:I

    .line 24
    invoke-virtual {p1}, Lr2/x$a;->i()I

    move-result v1

    iput v1, p0, Lr2/x;->x:I

    .line 25
    invoke-virtual {p1}, Lr2/x$a;->A()I

    move-result v1

    iput v1, p0, Lr2/x;->y:I

    .line 26
    invoke-virtual {p1}, Lr2/x$a;->F()I

    move-result v1

    iput v1, p0, Lr2/x;->z:I

    .line 27
    invoke-virtual {p1}, Lr2/x$a;->v()I

    move-result v1

    iput v1, p0, Lr2/x;->A:I

    .line 28
    invoke-virtual {p1}, Lr2/x$a;->t()J

    move-result-wide v1

    iput-wide v1, p0, Lr2/x;->B:J

    .line 29
    invoke-virtual {p1}, Lr2/x$a;->C()Lw2/h;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lw2/h;

    invoke-direct {v1}, Lw2/h;-><init>()V

    :goto_2
    iput-object v1, p0, Lr2/x;->C:Lw2/h;

    .line 30
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    .line 31
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/k;

    .line 32
    invoke-virtual {v1}, Lr2/k;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    :cond_6
    :goto_3
    if-eqz v2, :cond_7

    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 34
    iput-object p1, p0, Lr2/x;->v:Ld3/c;

    .line 35
    iput-object p1, p0, Lr2/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 36
    sget-object p1, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    iput-object p1, p0, Lr2/x;->u:Lokhttp3/CertificatePinner;

    goto :goto_4

    .line 37
    :cond_7
    invoke-virtual {p1}, Lr2/x$a;->E()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 38
    invoke-virtual {p1}, Lr2/x$a;->E()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 39
    invoke-virtual {p1}, Lr2/x$a;->g()Ld3/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lr2/x;->v:Ld3/c;

    .line 40
    invoke-virtual {p1}, Lr2/x$a;->G()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v1, p0, Lr2/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 41
    invoke-virtual {p1}, Lr2/x$a;->h()Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lokhttp3/CertificatePinner;->e(Ld3/c;)Lokhttp3/CertificatePinner;

    move-result-object p1

    iput-object p1, p0, Lr2/x;->u:Lokhttp3/CertificatePinner;

    goto :goto_4

    .line 43
    :cond_8
    sget-object v0, La3/k;->c:La3/k$a;

    invoke-virtual {v0}, La3/k$a;->g()La3/k;

    move-result-object v1

    invoke-virtual {v1}, La3/k;->o()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lr2/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 44
    invoke-virtual {v0}, La3/k$a;->g()La3/k;

    move-result-object v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, La3/k;->n(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 45
    sget-object v0, Ld3/c;->a:Ld3/c$a;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ld3/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Ld3/c;

    move-result-object v0

    iput-object v0, p0, Lr2/x;->v:Ld3/c;

    .line 46
    invoke-virtual {p1}, Lr2/x$a;->h()Lokhttp3/CertificatePinner;

    move-result-object p1

    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lokhttp3/CertificatePinner;->e(Ld3/c;)Lokhttp3/CertificatePinner;

    move-result-object p1

    iput-object p1, p0, Lr2/x;->u:Lokhttp3/CertificatePinner;

    .line 48
    :goto_4
    invoke-virtual {p0}, Lr2/x;->E()V

    return-void
.end method

.method public static final synthetic c()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lr2/x;->E:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lr2/x;->D:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final C()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->o:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

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

.method public final E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr2/x;->c:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 4
    .line 5
    if-eqz v0, :cond_11

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v3, 0x1

    .line 13
    xor-int/2addr v0, v3

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    iget-object v0, p0, Lr2/x;->d:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_f

    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    xor-int/2addr v0, v3

    .line 25
    if-eqz v0, :cond_e

    .line 26
    .line 27
    iget-object v0, p0, Lr2/x;->r:Ljava/util/List;

    .line 28
    .line 29
    instance-of v1, v0, Ljava/util/Collection;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    :cond_0
    move v0, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lr2/k;

    .line 57
    .line 58
    invoke-virtual {v1}, Lr2/k;->f()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    move v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_a

    .line 66
    .line 67
    iget-object v0, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    move v0, v3

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v0, v2

    .line 74
    :goto_1
    const-string v1, "Check failed."

    .line 75
    .line 76
    if-eqz v0, :cond_9

    .line 77
    .line 78
    iget-object v0, p0, Lr2/x;->v:Ld3/c;

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    move v0, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v0, v2

    .line 85
    :goto_2
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iget-object v0, p0, Lr2/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    move v3, v2

    .line 93
    :goto_3
    if-eqz v3, :cond_7

    .line 94
    .line 95
    iget-object v0, p0, Lr2/x;->u:Lokhttp3/CertificatePinner;

    .line 96
    .line 97
    sget-object v2, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 98
    .line 99
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_a
    iget-object v0, p0, Lr2/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 147
    .line 148
    if-eqz v0, :cond_d

    .line 149
    .line 150
    iget-object v0, p0, Lr2/x;->v:Ld3/c;

    .line 151
    .line 152
    if-eqz v0, :cond_c

    .line 153
    .line 154
    iget-object v0, p0, Lr2/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 155
    .line 156
    if-eqz v0, :cond_b

    .line 157
    .line 158
    :goto_4
    return-void

    .line 159
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v1, "x509TrustManager == null"

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string v1, "certificateChainCleaner == null"

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    const-string v1, "sslSocketFactory == null"

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v1, "Null network interceptor: "

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget-object v1, p0, Lr2/x;->d:Ljava/util/List;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v1

    .line 224
    :cond_f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v1, "Null interceptor: "

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lr2/x;->c:Ljava/util/List;

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v1

    .line 259
    :cond_11
    new-instance v0, Ljava/lang/NullPointerException;

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0
.end method

.method public final F()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public a(Lr2/y;)Lr2/e;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw2/e;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lw2/e;-><init>(Lr2/x;Lr2/y;Z)V

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

.method public final e()Lr2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->g:Lr2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lr2/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Lokhttp3/CertificatePinner;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->u:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()Lr2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->b:Lr2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lr2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->j:Lr2/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lr2/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->a:Lr2/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lr2/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->k:Lr2/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lr2/q$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->e:Lr2/q$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr2/x;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final r()Lw2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->C:Lw2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/x;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final w()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->l:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Lr2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->n:Lr2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/x;->m:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method
