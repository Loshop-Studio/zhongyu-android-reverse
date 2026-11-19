.class public Le/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/n$a;
    }
.end annotation


# static fields
.field public static final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Le/n$a;


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/b;

.field public final e:Le/h;

.field public final f:Le/k;

.field public final g:Le/b;

.field public final h:Ljavax/net/ssl/SSLSocketFactory;

.field public final i:Ljavax/net/ssl/X509TrustManager;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Le/c;

.field public final l:Le/q/i/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Le/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/n$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/n;->o:Le/n$a;

    const/4 v0, 0x2

    new-array v1, v0, [Le/o;

    sget-object v2, Le/o;->d:Le/o;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Le/o;->c:Le/o;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Le/q/b;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Le/n;->m:Ljava/util/List;

    new-array v0, v0, [Le/f;

    sget-object v1, Le/f;->g:Le/f;

    aput-object v1, v0, v3

    sget-object v1, Le/f;->h:Le/f;

    aput-object v1, v0, v4

    invoke-static {v0}, Le/q/b;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/n;->n:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    new-instance v0, Le/i;

    invoke-direct {v0}, Le/i;-><init>()V

    new-instance v0, Le/e;

    invoke-direct {v0}, Le/e;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Le/l;->a:Le/l;

    const-string v3, "$this$asFactory"

    .line 2
    invoke-static {v2, v3}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v2, Le/b;->a:Le/b;

    sget-object v3, Le/h;->a:Le/h;

    sget-object v4, Le/k;->a:Le/k;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v5

    const-string v6, "SocketFactory.getDefault()"

    invoke-static {v5, v6}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v5, Le/n;->n:Ljava/util/List;

    .line 5
    sget-object v6, Le/c;->c:Le/c;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v7, "$this$toImmutableList"

    .line 7
    invoke-static {v0, v7}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld/e/e;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v8, "Collections.unmodifiableList(toMutableList())"

    invoke-static {v0, v8}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iput-object v0, p0, Le/n;->b:Ljava/util/List;

    .line 9
    invoke-static {v1, v7}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ld/e/e;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v8}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput-object v0, p0, Le/n;->c:Ljava/util/List;

    iput-object v2, p0, Le/n;->d:Le/b;

    iput-object v3, p0, Le/n;->e:Le/h;

    iput-object v4, p0, Le/n;->f:Le/k;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le/q/h/a;->a:Le/q/h/a;

    :goto_0
    iput-object v2, p0, Le/n;->g:Le/b;

    iput-object v5, p0, Le/n;->j:Ljava/util/List;

    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    instance-of v0, v5, Ljava/util/Collection;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f;

    .line 13
    iget-boolean v3, v3, Le/f;->a:Z

    if-eqz v3, :cond_2

    move v0, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v2

    :goto_2
    const/4 v3, 0x0

    if-eqz v0, :cond_4

    .line 14
    iput-object v3, p0, Le/n;->h:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v3, p0, Le/n;->l:Le/q/i/c;

    iput-object v3, p0, Le/n;->i:Ljavax/net/ssl/X509TrustManager;

    sget-object v0, Le/c;->c:Le/c;

    goto :goto_3

    :cond_4
    sget-object v0, Le/q/g/h;->c:Le/q/g/h$a;

    .line 15
    sget-object v0, Le/q/g/h;->a:Le/q/g/h;

    .line 16
    invoke-virtual {v0}, Le/q/g/h;->f()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Le/n;->i:Ljavax/net/ssl/X509TrustManager;

    .line 17
    sget-object v4, Le/q/g/h;->a:Le/q/g/h;

    .line 18
    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Le/q/g/h;->e(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    iput-object v4, p0, Le/n;->h:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    const-string v4, "trustManager"

    .line 19
    invoke-static {v0, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v4, Le/q/g/h;->a:Le/q/g/h;

    .line 21
    invoke-virtual {v4, v0}, Le/q/g/h;->a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;

    move-result-object v0

    .line 22
    iput-object v0, p0, Le/n;->l:Le/q/i/c;

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    invoke-virtual {v6, v0}, Le/c;->a(Le/q/i/c;)Le/c;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Le/n;->k:Le/c;

    .line 23
    iget-object v0, p0, Le/n;->b:Ljava/util/List;

    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v0, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_14

    iget-object v0, p0, Le/n;->c:Ljava/util/List;

    invoke-static {v0, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_13

    iget-object v0, p0, Le/n;->j:Ljava/util/List;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f;

    .line 24
    iget-boolean v3, v3, Le/f;->a:Z

    if-eqz v3, :cond_6

    move v0, v1

    goto :goto_5

    :cond_7
    :goto_4
    move v0, v2

    :goto_5
    if-eqz v0, :cond_f

    .line 25
    iget-object v0, p0, Le/n;->h:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_8

    move v0, v2

    goto :goto_6

    :cond_8
    move v0, v1

    :goto_6
    const-string v3, "Check failed."

    if-eqz v0, :cond_e

    iget-object v0, p0, Le/n;->l:Le/q/i/c;

    if-nez v0, :cond_9

    move v0, v2

    goto :goto_7

    :cond_9
    move v0, v1

    :goto_7
    if-eqz v0, :cond_d

    iget-object v0, p0, Le/n;->i:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_a

    move v1, v2

    :cond_a
    if-eqz v1, :cond_c

    iget-object v0, p0, Le/n;->k:Le/c;

    sget-object v1, Le/c;->c:Le/c;

    invoke-static {v0, v1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_8

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    iget-object v0, p0, Le/n;->h:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_12

    iget-object v0, p0, Le/n;->l:Le/q/i/c;

    if-eqz v0, :cond_11

    iget-object v0, p0, Le/n;->i:Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_10

    :goto_8
    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    const-string v0, "Null network interceptor: "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Le/n;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    const-string v0, "Null interceptor: "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Le/n;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
