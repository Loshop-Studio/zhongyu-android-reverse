.class public final Lokhttp3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lokhttp3/d;


# static fields
.field public static final B:Ljava/util/List;

.field public static final C:Ljava/util/List;


# instance fields
.field public final A:Lo2/a;

.field public final a:Lc0/g;

.field public final b:Lo2/a;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lp7/a;

.field public final f:Z

.field public final g:Lokhttp3/b;

.field public final h:Z

.field public final i:Z

.field public final j:Lokhttp3/b;

.field public final k:Lokhttp3/b;

.field public final l:Ljava/net/Proxy;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lokhttp3/b;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lokhttp3/h;

.field public final v:Ly1/a;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    .line 2
    .line 3
    sget-object v1, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lokhttp3/Protocol;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lp7/c;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lokhttp3/z;->B:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, Lokhttp3/l;->e:Lokhttp3/l;

    .line 16
    .line 17
    sget-object v1, Lokhttp3/l;->f:Lokhttp3/l;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lokhttp3/l;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lp7/c;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lokhttp3/z;->C:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 99
    new-instance v0, Lokhttp3/y;

    invoke-direct {v0}, Lokhttp3/y;-><init>()V

    invoke-direct {p0, v0}, Lokhttp3/z;-><init>(Lokhttp3/y;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/y;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lokhttp3/y;->a:Lc0/g;

    .line 3
    iput-object v0, p0, Lokhttp3/z;->a:Lc0/g;

    .line 4
    iget-object v0, p1, Lokhttp3/y;->b:Lo2/a;

    .line 5
    iput-object v0, p0, Lokhttp3/z;->b:Lo2/a;

    .line 6
    iget-object v0, p1, Lokhttp3/y;->c:Ljava/util/ArrayList;

    .line 7
    invoke-static {v0}, Lp7/c;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/z;->c:Ljava/util/List;

    .line 8
    iget-object v0, p1, Lokhttp3/y;->d:Ljava/util/ArrayList;

    .line 9
    invoke-static {v0}, Lp7/c;->v(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/z;->d:Ljava/util/List;

    .line 10
    iget-object v0, p1, Lokhttp3/y;->e:Lp7/a;

    .line 11
    iput-object v0, p0, Lokhttp3/z;->e:Lp7/a;

    .line 12
    iget-boolean v0, p1, Lokhttp3/y;->f:Z

    .line 13
    iput-boolean v0, p0, Lokhttp3/z;->f:Z

    .line 14
    iget-object v0, p1, Lokhttp3/y;->g:Lokhttp3/b;

    .line 15
    iput-object v0, p0, Lokhttp3/z;->g:Lokhttp3/b;

    .line 16
    iget-boolean v0, p1, Lokhttp3/y;->h:Z

    .line 17
    iput-boolean v0, p0, Lokhttp3/z;->h:Z

    .line 18
    iget-boolean v0, p1, Lokhttp3/y;->i:Z

    .line 19
    iput-boolean v0, p0, Lokhttp3/z;->i:Z

    .line 20
    iget-object v0, p1, Lokhttp3/y;->j:Lokhttp3/b;

    .line 21
    iput-object v0, p0, Lokhttp3/z;->j:Lokhttp3/b;

    .line 22
    iget-object v0, p1, Lokhttp3/y;->k:Lokhttp3/b;

    .line 23
    iput-object v0, p0, Lokhttp3/z;->k:Lokhttp3/b;

    .line 24
    iget-object v0, p1, Lokhttp3/y;->l:Ljava/net/Proxy;

    .line 25
    iput-object v0, p0, Lokhttp3/z;->l:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lx7/a;->a:Lx7/a;

    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p1, Lokhttp3/y;->m:Ljava/net/ProxySelector;

    if-nez v0, :cond_1

    .line 28
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lx7/a;->a:Lx7/a;

    .line 29
    :cond_2
    :goto_0
    iput-object v0, p0, Lokhttp3/z;->m:Ljava/net/ProxySelector;

    .line 30
    iget-object v0, p1, Lokhttp3/y;->n:Lokhttp3/b;

    .line 31
    iput-object v0, p0, Lokhttp3/z;->n:Lokhttp3/b;

    .line 32
    iget-object v0, p1, Lokhttp3/y;->o:Ljavax/net/SocketFactory;

    .line 33
    iput-object v0, p0, Lokhttp3/z;->o:Ljavax/net/SocketFactory;

    .line 34
    iget-object v0, p1, Lokhttp3/y;->r:Ljava/util/List;

    .line 35
    iput-object v0, p0, Lokhttp3/z;->r:Ljava/util/List;

    .line 36
    iget-object v1, p1, Lokhttp3/y;->s:Ljava/util/List;

    .line 37
    iput-object v1, p0, Lokhttp3/z;->s:Ljava/util/List;

    .line 38
    iget-object v1, p1, Lokhttp3/y;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 39
    iput-object v1, p0, Lokhttp3/z;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 40
    iget v1, p1, Lokhttp3/y;->w:I

    .line 41
    iput v1, p0, Lokhttp3/z;->w:I

    .line 42
    iget v1, p1, Lokhttp3/y;->x:I

    .line 43
    iput v1, p0, Lokhttp3/z;->x:I

    .line 44
    iget v1, p1, Lokhttp3/y;->y:I

    .line 45
    iput v1, p0, Lokhttp3/z;->y:I

    .line 46
    iget-wide v1, p1, Lokhttp3/y;->z:J

    .line 47
    iput-wide v1, p0, Lokhttp3/z;->z:J

    .line 48
    iget-object v1, p1, Lokhttp3/y;->A:Lo2/a;

    if-nez v1, :cond_3

    .line 49
    new-instance v1, Lo2/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lo2/a;-><init>(I)V

    :cond_3
    iput-object v1, p0, Lokhttp3/z;->A:Lo2/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 50
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto/16 :goto_3

    .line 51
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/l;

    .line 52
    iget-boolean v2, v2, Lokhttp3/l;->a:Z

    if-eqz v2, :cond_5

    .line 53
    iget-object v0, p1, Lokhttp3/y;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_7

    .line 54
    iput-object v0, p0, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 55
    iget-object v0, p1, Lokhttp3/y;->v:Ly1/a;

    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    iput-object v0, p0, Lokhttp3/z;->v:Ly1/a;

    .line 57
    iget-object v2, p1, Lokhttp3/y;->q:Ljavax/net/ssl/X509TrustManager;

    .line 58
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    iput-object v2, p0, Lokhttp3/z;->q:Ljavax/net/ssl/X509TrustManager;

    .line 59
    iget-object p1, p1, Lokhttp3/y;->u:Lokhttp3/h;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    iget-object v2, p1, Lokhttp3/h;->b:Ly1/a;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    .line 62
    :cond_6
    new-instance v2, Lokhttp3/h;

    iget-object p1, p1, Lokhttp3/h;->a:Ljava/util/Set;

    invoke-direct {v2, p1, v0}, Lokhttp3/h;-><init>(Ljava/util/Set;Ly1/a;)V

    move-object p1, v2

    .line 63
    :goto_1
    iput-object p1, p0, Lokhttp3/z;->u:Lokhttp3/h;

    goto :goto_4

    .line 64
    :cond_7
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 65
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 66
    invoke-virtual {v0}, Lv7/n;->m()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/z;->q:Ljavax/net/ssl/X509TrustManager;

    .line 67
    sget-object v2, Lv7/n;->a:Lv7/n;

    .line 68
    invoke-virtual {v2, v0}, Lv7/n;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    iput-object v2, p0, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 69
    sget-object v2, Lv7/n;->a:Lv7/n;

    .line 70
    invoke-virtual {v2, v0}, Lv7/n;->b(Ljavax/net/ssl/X509TrustManager;)Ly1/a;

    move-result-object v0

    .line 71
    iput-object v0, p0, Lokhttp3/z;->v:Ly1/a;

    .line 72
    iget-object p1, p1, Lokhttp3/y;->u:Lokhttp3/h;

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    iget-object v2, p1, Lokhttp3/h;->b:Ly1/a;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_2

    .line 75
    :cond_8
    new-instance v2, Lokhttp3/h;

    iget-object p1, p1, Lokhttp3/h;->a:Ljava/util/Set;

    invoke-direct {v2, p1, v0}, Lokhttp3/h;-><init>(Ljava/util/Set;Ly1/a;)V

    move-object p1, v2

    .line 76
    :goto_2
    iput-object p1, p0, Lokhttp3/z;->u:Lokhttp3/h;

    goto :goto_4

    .line 77
    :cond_9
    :goto_3
    iput-object v1, p0, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 78
    iput-object v1, p0, Lokhttp3/z;->v:Ly1/a;

    .line 79
    iput-object v1, p0, Lokhttp3/z;->q:Ljavax/net/ssl/X509TrustManager;

    .line 80
    sget-object p1, Lokhttp3/h;->c:Lokhttp3/h;

    iput-object p1, p0, Lokhttp3/z;->u:Lokhttp3/h;

    .line 81
    :goto_4
    iget-object p1, p0, Lokhttp3/z;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v0, p0, Lokhttp3/z;->v:Ly1/a;

    iget-object v2, p0, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v3, p0, Lokhttp3/z;->d:Ljava/util/List;

    iget-object v4, p0, Lokhttp3/z;->c:Ljava/util/List;

    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    .line 82
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 83
    iget-object v1, p0, Lokhttp3/z;->r:Ljava/util/List;

    if-eqz v1, :cond_a

    .line 84
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    .line 85
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lokhttp3/l;

    .line 86
    iget-boolean v3, v3, Lokhttp3/l;->a:Z

    if-eqz v3, :cond_b

    if-eqz v2, :cond_e

    if-eqz v0, :cond_d

    if-eqz p1, :cond_c

    goto :goto_6

    .line 87
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 90
    :cond_f
    :goto_5
    const-string v1, "Check failed."

    if-nez v2, :cond_13

    if-nez v0, :cond_12

    if-nez p1, :cond_11

    .line 91
    iget-object p1, p0, Lokhttp3/z;->u:Lokhttp3/h;

    sget-object v0, Lokhttp3/h;->c:Lokhttp3/h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    :goto_6
    return-void

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 94
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_14
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Null network interceptor: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 96
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Null interceptor: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 98
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final c(Lokhttp3/c0;)Lokhttp3/internal/connection/i;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/internal/connection/i;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lokhttp3/internal/connection/i;-><init>(Lokhttp3/z;Lokhttp3/c0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
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
