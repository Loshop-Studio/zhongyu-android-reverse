.class public final Ln9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/u$b;
.implements Lo9/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/e$a;,
        Ln9/e$b;
    }
.end annotation


# static fields
.field public static final y:Ln9/e$a;


# instance fields
.field public final a:Lm9/d;

.field public final b:Ln9/p;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Ln9/g;

.field public final j:Ln9/q;

.field public final k:Li9/f0;

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:Li9/b0;

.field public final o:I

.field public final p:Z

.field public volatile q:Z

.field public r:Ljava/net/Socket;

.field public s:Ljava/net/Socket;

.field public t:Lokhttp3/c;

.field public u:Lokhttp3/Protocol;

.field public v:Lokio/BufferedSource;

.field public w:Lokio/BufferedSink;

.field public x:Ln9/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln9/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln9/e$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln9/e;->y:Ln9/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lm9/d;Ln9/p;IIIIIZLn9/g;Ln9/q;Li9/f0;Ljava/util/List;ILi9/b0;IZ)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "connectionPool"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "user"

    .line 12
    .line 13
    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "routePlanner"

    .line 17
    .line 18
    invoke-static {p10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "route"

    .line 22
    .line 23
    invoke-static {p11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ln9/e;->a:Lm9/d;

    .line 30
    .line 31
    iput-object p2, p0, Ln9/e;->b:Ln9/p;

    .line 32
    .line 33
    iput p3, p0, Ln9/e;->c:I

    .line 34
    .line 35
    iput p4, p0, Ln9/e;->d:I

    .line 36
    .line 37
    iput p5, p0, Ln9/e;->e:I

    .line 38
    .line 39
    iput p6, p0, Ln9/e;->f:I

    .line 40
    .line 41
    iput p7, p0, Ln9/e;->g:I

    .line 42
    .line 43
    iput-boolean p8, p0, Ln9/e;->h:Z

    .line 44
    .line 45
    iput-object p9, p0, Ln9/e;->i:Ln9/g;

    .line 46
    .line 47
    iput-object p10, p0, Ln9/e;->j:Ln9/q;

    .line 48
    .line 49
    iput-object p11, p0, Ln9/e;->k:Li9/f0;

    .line 50
    .line 51
    iput-object p12, p0, Ln9/e;->l:Ljava/util/List;

    .line 52
    .line 53
    iput p13, p0, Ln9/e;->m:I

    .line 54
    .line 55
    move-object p1, p14

    .line 56
    iput-object p1, p0, Ln9/e;->n:Li9/b0;

    .line 57
    .line 58
    move/from16 p1, p15

    .line 59
    .line 60
    iput p1, p0, Ln9/e;->o:I

    .line 61
    .line 62
    move/from16 p1, p16

    .line 63
    .line 64
    iput-boolean p1, p0, Ln9/e;->p:Z

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic g(Li9/h;Lokhttp3/c;Li9/a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ln9/e;->l(Li9/h;Lokhttp3/c;Li9/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lokhttp3/c;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ln9/e;->m(Lokhttp3/c;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Li9/h;Lokhttp3/c;Li9/a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li9/h;->f()Lx9/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/c;->e()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p2}, Li9/a;->l()Li9/w;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Li9/w;->h()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p0, p1, p2}, Lx9/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final m(Lokhttp3/c;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lokhttp3/c;->e()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {p0, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/security/cert/Certificate;

    .line 31
    .line 32
    const-string v2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, Ljava/security/cert/X509Certificate;

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v0
.end method

.method public static synthetic p(Ln9/e;ILi9/b0;IZILjava/lang/Object;)Ln9/e;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget p1, p0, Ln9/e;->m:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ln9/e;->n:Li9/b0;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Ln9/e;->o:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-boolean p4, p0, Ln9/e;->p:Z

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ln9/e;->o(ILi9/b0;IZ)Ln9/e;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public a()Ln9/o;
    .locals 3

    .line 1
    iget-object v0, p0, Ln9/e;->i:Ln9/g;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ln9/g;->g(Li9/f0;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ln9/e;->x:Ln9/o;

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ln9/e;->i:Ln9/g;

    .line 16
    .line 17
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v1, v0, v2}, Ln9/g;->e(Li9/j;Li9/f0;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ln9/e;->j:Ln9/q;

    .line 25
    .line 26
    iget-object v2, p0, Ln9/e;->l:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v1, p0, v2}, Ln9/q;->l(Ln9/e;Ljava/util/List;)Ln9/s;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ln9/s;->g()Ln9/o;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :cond_0
    monitor-enter v0

    .line 40
    :try_start_0
    iget-object v1, p0, Ln9/e;->b:Ln9/p;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ln9/p;->g(Ln9/o;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ln9/e;->i:Ln9/g;

    .line 46
    .line 47
    invoke-interface {v1, v0}, Ln9/g;->i(Ln9/o;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lh7/p;->a:Lh7/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    iget-object v1, p0, Ln9/e;->i:Ln9/g;

    .line 54
    .line 55
    invoke-interface {v1, v0}, Ln9/g;->w(Li9/j;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Ln9/e;->i:Ln9/g;

    .line 59
    .line 60
    invoke-interface {v1, v0}, Ln9/g;->j(Ln9/o;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    monitor-exit v0

    .line 66
    throw v1
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Ln9/u$a;
    .locals 18

    move-object/from16 v1, p0

    .line 1
    iget-object v6, v1, Ln9/e;->r:Ljava/net/Socket;

    if-eqz v6, :cond_11

    .line 2
    invoke-virtual {v1}, Ln9/e;->isReady()Z

    move-result v0

    if-nez v0, :cond_10

    .line 3
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v0

    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    move-result-object v0

    invoke-virtual {v0}, Li9/a;->b()Ljava/util/List;

    move-result-object v0

    .line 4
    iget-object v2, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v2, v1}, Ln9/g;->f(Ln9/e;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 5
    :try_start_0
    iget-object v2, v1, Ln9/e;->n:Li9/b0;

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v1}, Ln9/e;->n()Ln9/u$a;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ln9/u$a;->c()Ln9/u$b;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ln9/u$a;->e()Ljava/lang/Throwable;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object v9, v14

    goto/16 :goto_4

    .line 8
    :cond_0
    :goto_0
    iget-object v0, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v0, v1}, Ln9/g;->m(Ln9/e;)V

    .line 9
    iget-object v0, v1, Ln9/e;->s:Ljava/net/Socket;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 10
    :cond_1
    invoke-static {v6}, Lj9/k;->h(Ljava/net/Socket;)V

    return-object v2

    .line 11
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v2

    invoke-virtual {v2}, Li9/f0;->a()Li9/a;

    move-result-object v2

    invoke-virtual {v2}, Li9/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x1

    const-string v4, "sink"

    const-string v5, "source"

    if-eqz v2, :cond_6

    .line 12
    :try_start_2
    iget-object v2, v1, Ln9/e;->v:Lokio/BufferedSource;

    if-nez v2, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    move-object v2, v14

    :cond_3
    invoke-interface {v2}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    move-result-object v2

    invoke-virtual {v2}, Lokio/Buffer;->exhausted()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v1, Ln9/e;->w:Lokio/BufferedSink;

    if-nez v2, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    move-object v2, v14

    :cond_4
    invoke-interface {v2}, Lokio/BufferedSink;->getBuffer()Lokio/Buffer;

    move-result-object v2

    invoke-virtual {v2}, Lokio/Buffer;->exhausted()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    iget-object v2, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v2}, Ln9/g;->r()V

    .line 14
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v2

    invoke-virtual {v2}, Li9/f0;->a()Li9/a;

    move-result-object v2

    invoke-virtual {v2}, Li9/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 15
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v7

    invoke-virtual {v7}, Li9/f0;->a()Li9/a;

    move-result-object v7

    invoke-virtual {v7}, Li9/a;->l()Li9/w;

    move-result-object v7

    invoke-virtual {v7}, Li9/w;->h()Ljava/lang/String;

    move-result-object v7

    .line 16
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v8

    invoke-virtual {v8}, Li9/f0;->a()Li9/a;

    move-result-object v8

    invoke-virtual {v8}, Li9/a;->l()Li9/w;

    move-result-object v8

    invoke-virtual {v8}, Li9/w;->m()I

    move-result v8

    .line 17
    invoke-virtual {v2, v6, v7, v8, v3}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v2

    const-string v7, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 18
    invoke-virtual {v1, v0, v2}, Ln9/e;->t(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ln9/e;

    move-result-object v7

    .line 19
    iget v8, v7, Ln9/e;->o:I

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lokhttp3/b;

    .line 20
    invoke-virtual {v7, v0, v2}, Ln9/e;->s(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ln9/e;

    move-result-object v9
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    :try_start_3
    iget-boolean v0, v7, Ln9/e;->p:Z

    invoke-virtual {v8, v2, v0}, Lokhttp3/b;->b(Ljavax/net/ssl/SSLSocket;Z)V

    .line 22
    invoke-virtual {v1, v2, v8}, Ln9/e;->k(Ljavax/net/ssl/SSLSocket;Lokhttp3/b;)V

    .line 23
    iget-object v0, v1, Ln9/e;->i:Ln9/g;

    iget-object v2, v1, Ln9/e;->t:Lokhttp3/c;

    invoke-interface {v0, v2}, Ln9/g;->p(Lokhttp3/c;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v16, v9

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_4

    .line 24
    :cond_5
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_6
    iput-object v6, v1, Ln9/e;->s:Ljava/net/Socket;

    .line 26
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v0

    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    move-result-object v0

    invoke-virtual {v0}, Li9/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    .line 27
    :cond_7
    sget-object v2, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 28
    :goto_1
    iput-object v2, v1, Ln9/e;->u:Lokhttp3/Protocol;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v16, v14

    .line 29
    :goto_2
    :try_start_5
    new-instance v2, Ln9/o;

    move v7, v3

    .line 30
    iget-object v3, v1, Ln9/e;->a:Lm9/d;

    move-object v0, v4

    .line 31
    iget-object v4, v1, Ln9/e;->b:Ln9/p;

    move-object v8, v5

    .line 32
    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v5

    move v9, v7

    .line 33
    iget-object v7, v1, Ln9/e;->s:Ljava/net/Socket;

    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object v10, v8

    .line 34
    iget-object v8, v1, Ln9/e;->t:Lokhttp3/c;

    move v11, v9

    .line 35
    iget-object v9, v1, Ln9/e;->u:Lokhttp3/Protocol;

    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 36
    iget-object v12, v1, Ln9/e;->v:Lokio/BufferedSource;

    if-nez v12, :cond_8

    invoke-static {v10}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    move-object v10, v14

    goto :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v9, v16

    goto :goto_4

    :cond_8
    move-object v10, v12

    .line 37
    :goto_3
    iget-object v12, v1, Ln9/e;->w:Lokio/BufferedSink;

    if-nez v12, :cond_9

    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    move-object v12, v14

    .line 38
    :cond_9
    iget v0, v1, Ln9/e;->g:I

    .line 39
    iget-object v13, v1, Ln9/e;->b:Ln9/p;

    invoke-virtual {v13}, Ln9/p;->d()Ln9/f;

    move-result-object v13

    move/from16 v17, v11

    move-object v11, v12

    move v12, v0

    .line 40
    invoke-direct/range {v2 .. v13}, Ln9/o;-><init>(Lm9/d;Ln9/p;Li9/f0;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/c;Lokhttp3/Protocol;Lokio/BufferedSource;Lokio/BufferedSink;ILn9/f;)V

    .line 41
    iput-object v2, v1, Ln9/e;->x:Ln9/o;

    .line 42
    invoke-virtual {v2}, Ln9/o;->y()V

    .line 43
    iget-object v0, v1, Ln9/e;->i:Ln9/g;

    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v2

    iget-object v3, v1, Ln9/e;->u:Lokhttp3/Protocol;

    invoke-interface {v0, v2, v3}, Ln9/g;->a(Li9/f0;Lokhttp3/Protocol;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 44
    :try_start_6
    new-instance v0, Ln9/u$a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 45
    iget-object v2, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v2, v1}, Ln9/g;->m(Ln9/e;)V

    return-object v0

    :catchall_1
    move-exception v0

    move/from16 v15, v17

    goto :goto_6

    :catch_3
    move-exception v0

    move-object/from16 v9, v16

    move/from16 v15, v17

    .line 46
    :goto_4
    :try_start_7
    iget-object v2, v1, Ln9/e;->i:Ln9/g;

    invoke-virtual {v1}, Ln9/e;->d()Li9/f0;

    move-result-object v3

    invoke-interface {v2, v3, v14, v0}, Ln9/g;->q(Li9/f0;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 47
    iget-boolean v2, v1, Ln9/e;->h:Z

    if-eqz v2, :cond_b

    invoke-static {v0}, Ln9/r;->a(Ljava/io/IOException;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_5

    :cond_a
    move-object v14, v9

    .line 48
    :cond_b
    :goto_5
    new-instance v2, Ln9/u$a;

    invoke-direct {v2, v1, v14, v0}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 49
    iget-object v0, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v0, v1}, Ln9/g;->m(Ln9/e;)V

    if-nez v15, :cond_d

    .line 50
    iget-object v0, v1, Ln9/e;->s:Ljava/net/Socket;

    if-eqz v0, :cond_c

    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 51
    :cond_c
    invoke-static {v6}, Lj9/k;->h(Ljava/net/Socket;)V

    :cond_d
    return-object v2

    .line 52
    :goto_6
    iget-object v2, v1, Ln9/e;->i:Ln9/g;

    invoke-interface {v2, v1}, Ln9/g;->m(Ln9/e;)V

    if-nez v15, :cond_f

    .line 53
    iget-object v2, v1, Ln9/e;->s:Ljava/net/Socket;

    if-eqz v2, :cond_e

    invoke-static {v2}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 54
    :cond_e
    invoke-static {v6}, Lj9/k;->h(Ljava/net/Socket;)V

    :cond_f
    throw v0

    .line 55
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "already connected"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "TCP not connected"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln9/e;->q:Z

    .line 3
    .line 4
    iget-object v0, p0, Ln9/e;->r:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public d()Li9/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/e;->k:Li9/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ln9/u$a;
    .locals 14

    .line 1
    iget-object v0, p0, Ln9/e;->r:Ljava/net/Socket;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Ln9/e;->i:Ln9/g;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ln9/g;->f(Ln9/e;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object v0, p0, Ln9/e;->i:Ln9/g;

    .line 12
    .line 13
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v2}, Ln9/g;->k(Li9/f0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ln9/e;->j()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    new-instance v2, Ln9/u$a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    const/4 v6, 0x6

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v3, p0

    .line 31
    :try_start_1
    invoke-direct/range {v2 .. v7}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    iget-object v0, v3, Ln9/e;->i:Ln9/g;

    .line 35
    .line 36
    invoke-interface {v0, p0}, Ln9/g;->m(Ln9/e;)V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :catch_0
    move-exception v0

    .line 44
    :goto_0
    move-object v11, v0

    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    move-object v3, p0

    .line 48
    goto :goto_2

    .line 49
    :catch_1
    move-exception v0

    .line 50
    move-object v3, p0

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Li9/a;->g()Ljava/net/Proxy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Li9/f0;->b()Ljava/net/Proxy;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 79
    .line 80
    if-eq v0, v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Li9/a;->i()Ljava/net/ProxySelector;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Li9/f0;->a()Li9/a;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Li9/a;->l()Li9/w;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Li9/w;->r()Ljava/net/URI;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Li9/f0;->b()Ljava/net/Proxy;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v0, v2, v4, v11}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 123
    .line 124
    .line 125
    :cond_0
    iget-object v0, v3, Ln9/e;->i:Ln9/g;

    .line 126
    .line 127
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-interface {v0, v2, v4, v11}, Ln9/g;->q(Li9/f0;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 133
    .line 134
    .line 135
    new-instance v8, Ln9/u$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    const/4 v12, 0x2

    .line 138
    const/4 v13, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    move-object v9, v3

    .line 141
    :try_start_3
    invoke-direct/range {v8 .. v13}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 142
    .line 143
    .line 144
    iget-object v0, v3, Ln9/e;->i:Ln9/g;

    .line 145
    .line 146
    invoke-interface {v0, p0}, Ln9/g;->m(Ln9/e;)V

    .line 147
    .line 148
    .line 149
    if-nez v1, :cond_1

    .line 150
    .line 151
    iget-object v0, v3, Ln9/e;->r:Ljava/net/Socket;

    .line 152
    .line 153
    if-eqz v0, :cond_1

    .line 154
    .line 155
    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 156
    .line 157
    .line 158
    :cond_1
    return-object v8

    .line 159
    :catchall_2
    move-exception v0

    .line 160
    move-object v3, v9

    .line 161
    :goto_2
    iget-object v2, v3, Ln9/e;->i:Ln9/g;

    .line 162
    .line 163
    invoke-interface {v2, p0}, Ln9/g;->m(Ln9/e;)V

    .line 164
    .line 165
    .line 166
    if-nez v1, :cond_2

    .line 167
    .line 168
    iget-object v1, v3, Ln9/e;->r:Ljava/net/Socket;

    .line 169
    .line 170
    if-eqz v1, :cond_2

    .line 171
    .line 172
    invoke-static {v1}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    throw v0

    .line 176
    :cond_3
    move-object v3, p0

    .line 177
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string v1, "TCP already connected"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0
.end method

.method public f(Ln9/n;Ljava/io/IOException;)V
    .locals 0

    .line 1
    const-string p2, "call"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/e;->s:Ljava/net/Socket;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/e;->u:Lokhttp3/Protocol;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li9/f0;->b()Ljava/net/Proxy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v1, Ln9/e$b;->a:[I

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    aget v0, v1, v0

    .line 24
    .line 25
    :goto_0
    const/4 v1, 0x1

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/net/Socket;

    .line 32
    .line 33
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Li9/f0;->b()Ljava/net/Proxy;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Li9/a;->j()Ljavax/net/SocketFactory;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iput-object v0, p0, Ln9/e;->r:Ljava/net/Socket;

    .line 65
    .line 66
    iget-boolean v1, p0, Ln9/e;->q:Z

    .line 67
    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    iget v1, p0, Ln9/e;->f:I

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 73
    .line 74
    .line 75
    :try_start_0
    sget-object v1, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 76
    .line 77
    invoke-virtual {v1}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Li9/f0;->d()Ljava/net/InetSocketAddress;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget v3, p0, Ln9/e;->e:I

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2, v3}, Lokhttp3/internal/platform/c;->h(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 92
    .line 93
    .line 94
    :try_start_1
    invoke-static {v0}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, p0, Ln9/e;->v:Lokio/BufferedSource;

    .line 103
    .line 104
    invoke-static {v0}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Ln9/e;->w:Lokio/BufferedSink;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    .line 114
    return-void

    .line 115
    :catch_0
    move-exception v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v2, "throw with null exception"

    .line 121
    .line 122
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_2

    .line 127
    .line 128
    return-void

    .line 129
    :cond_2
    new-instance v1, Ljava/io/IOException;

    .line 130
    .line 131
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :catch_1
    move-exception v0

    .line 136
    new-instance v1, Ljava/net/ConnectException;

    .line 137
    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v3, "Failed to connect to "

    .line 144
    .line 145
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Li9/f0;->d()Ljava/net/InetSocketAddress;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-direct {v1, v2}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 171
    .line 172
    const-string v1, "canceled"

    .line 173
    .line 174
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0
.end method

.method public final k(Ljavax/net/ssl/SSLSocket;Lokhttp3/b;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li9/f0;->a()Li9/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/b;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Li9/w;->h()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0}, Li9/a;->f()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, p1, v2, v3}, Lokhttp3/internal/platform/c;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p2

    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v2, Lokhttp3/c;->e:Lokhttp3/c$a;

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Lokhttp3/c$a;->b(Ljavax/net/ssl/SSLSession;)Lokhttp3/c;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0}, Li9/a;->e()Ljavax/net/ssl/HostnameVerifier;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Li9/w;->h()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v3, v4, v1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/4 v3, 0x0

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2}, Lokhttp3/c;->e()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_1

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 94
    .line 95
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    check-cast p2, Ljava/security/cert/X509Certificate;

    .line 99
    .line 100
    new-instance v1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v4, "\n            |Hostname "

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Li9/w;->h()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v0, " not verified:\n            |    certificate: "

    .line 124
    .line 125
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    sget-object v0, Li9/h;->c:Li9/h$b;

    .line 129
    .line 130
    invoke-virtual {v0, p2}, Li9/h$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v0, "\n            |    DN: "

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, "\n            |    subjectAltNames: "

    .line 154
    .line 155
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    sget-object v0, Lx9/d;->a:Lx9/d;

    .line 159
    .line 160
    invoke-virtual {v0, p2}, Lx9/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p2, "\n            "

    .line 168
    .line 169
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    const/4 v0, 0x1

    .line 177
    invoke-static {p2, v3, v0, v3}, Lg8/s;->p(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-direct {v1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v1

    .line 185
    :cond_1
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 186
    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string v2, "Hostname "

    .line 193
    .line 194
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Li9/w;->h()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v0, " not verified (no certificates)"

    .line 209
    .line 210
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-direct {p2, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p2

    .line 221
    :cond_2
    invoke-virtual {v0}, Li9/a;->a()Li9/h;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    new-instance v4, Lokhttp3/c;

    .line 229
    .line 230
    invoke-virtual {v2}, Lokhttp3/c;->g()Lokhttp3/TlsVersion;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v2}, Lokhttp3/c;->b()Lokhttp3/a;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v2}, Lokhttp3/c;->d()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    new-instance v8, Ln9/c;

    .line 243
    .line 244
    invoke-direct {v8, v1, v2, v0}, Ln9/c;-><init>(Li9/h;Lokhttp3/c;Li9/a;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v4, v5, v6, v7, v8}, Lokhttp3/c;-><init>(Lokhttp3/TlsVersion;Lokhttp3/a;Ljava/util/List;Lx7/a;)V

    .line 248
    .line 249
    .line 250
    iput-object v4, p0, Ln9/e;->t:Lokhttp3/c;

    .line 251
    .line 252
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Li9/w;->h()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v2, Ln9/d;

    .line 261
    .line 262
    invoke-direct {v2, v4}, Ln9/d;-><init>(Lokhttp3/c;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v0, v2}, Li9/h;->d(Ljava/lang/String;Lx7/a;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2}, Lokhttp3/b;->h()Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-eqz p2, :cond_3

    .line 273
    .line 274
    sget-object p2, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 275
    .line 276
    invoke-virtual {p2}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p2, p1}, Lokhttp3/internal/platform/c;->i(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    :cond_3
    iput-object p1, p0, Ln9/e;->s:Ljava/net/Socket;

    .line 285
    .line 286
    invoke-static {p1}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    invoke-static {p2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    iput-object p2, p0, Ln9/e;->v:Lokio/BufferedSource;

    .line 295
    .line 296
    invoke-static {p1}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    invoke-static {p2}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    iput-object p2, p0, Ln9/e;->w:Lokio/BufferedSink;

    .line 305
    .line 306
    if-eqz v3, :cond_4

    .line 307
    .line 308
    sget-object p2, Lokhttp3/Protocol;->b:Lokhttp3/Protocol$a;

    .line 309
    .line 310
    invoke-virtual {p2, v3}, Lokhttp3/Protocol$a;->a(Ljava/lang/String;)Lokhttp3/Protocol;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    goto :goto_1

    .line 315
    :cond_4
    sget-object p2, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 316
    .line 317
    :goto_1
    iput-object p2, p0, Ln9/e;->u:Lokhttp3/Protocol;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    .line 319
    sget-object p2, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 320
    .line 321
    invoke-virtual {p2}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-virtual {p2, p1}, Lokhttp3/internal/platform/c;->d(Ljavax/net/ssl/SSLSocket;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :goto_2
    sget-object v0, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 330
    .line 331
    invoke-virtual {v0}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0, p1}, Lokhttp3/internal/platform/c;->d(Ljavax/net/ssl/SSLSocket;)V

    .line 336
    .line 337
    .line 338
    invoke-static {p1}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 339
    .line 340
    .line 341
    throw p2
.end method

.method public final n()Ln9/u$a;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ln9/e;->q()Li9/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    new-instance v3, Ln9/u$a;

    .line 8
    .line 9
    const/4 v7, 0x6

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v4, p0

    .line 14
    invoke-direct/range {v3 .. v8}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 15
    .line 16
    .line 17
    move-object v10, v4

    .line 18
    return-object v3

    .line 19
    :cond_0
    move-object v10, p0

    .line 20
    iget-object v0, v10, Ln9/e;->r:Ljava/net/Socket;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Lj9/k;->h(Ljava/net/Socket;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v0, v10, Ln9/e;->m:I

    .line 28
    .line 29
    add-int/lit8 v1, v0, 0x1

    .line 30
    .line 31
    const/16 v0, 0x15

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-ge v1, v0, :cond_2

    .line 35
    .line 36
    iget-object v0, v10, Ln9/e;->i:Ln9/g;

    .line 37
    .line 38
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v0, v4, v3}, Ln9/g;->a(Li9/f0;Lokhttp3/Protocol;)V

    .line 43
    .line 44
    .line 45
    new-instance v9, Ln9/u$a;

    .line 46
    .line 47
    const/16 v5, 0xc

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    move-object v0, v10

    .line 53
    invoke-static/range {v0 .. v6}, Ln9/e;->p(Ln9/e;ILi9/b0;IZILjava/lang/Object;)Ln9/e;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    const/4 v13, 0x4

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    move-object v10, p0

    .line 61
    invoke-direct/range {v9 .. v14}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 62
    .line 63
    .line 64
    return-object v9

    .line 65
    :cond_2
    new-instance v12, Ljava/net/ProtocolException;

    .line 66
    .line 67
    const-string v0, "Too many tunnel connections attempted: 21"

    .line 68
    .line 69
    invoke-direct {v12, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v10, Ln9/e;->i:Ln9/g;

    .line 73
    .line 74
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v0, v1, v3, v12}, Ln9/g;->q(Li9/f0;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    new-instance v9, Ln9/u$a;

    .line 82
    .line 83
    const/4 v13, 0x2

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    invoke-direct/range {v9 .. v14}, Ln9/u$a;-><init>(Ln9/u$b;Ln9/u$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 87
    .line 88
    .line 89
    return-object v9
.end method

.method public final o(ILi9/b0;IZ)Ln9/e;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ln9/e;

    .line 4
    .line 5
    iget-object v2, v0, Ln9/e;->a:Lm9/d;

    .line 6
    .line 7
    iget-object v3, v0, Ln9/e;->b:Ln9/p;

    .line 8
    .line 9
    iget v4, v0, Ln9/e;->c:I

    .line 10
    .line 11
    iget v5, v0, Ln9/e;->d:I

    .line 12
    .line 13
    iget v6, v0, Ln9/e;->e:I

    .line 14
    .line 15
    iget v7, v0, Ln9/e;->f:I

    .line 16
    .line 17
    iget v8, v0, Ln9/e;->g:I

    .line 18
    .line 19
    iget-boolean v9, v0, Ln9/e;->h:Z

    .line 20
    .line 21
    iget-object v10, v0, Ln9/e;->i:Ln9/g;

    .line 22
    .line 23
    iget-object v11, v0, Ln9/e;->j:Ln9/q;

    .line 24
    .line 25
    invoke-virtual {v0}, Ln9/e;->d()Li9/f0;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    iget-object v13, v0, Ln9/e;->l:Ljava/util/List;

    .line 30
    .line 31
    move/from16 v14, p1

    .line 32
    .line 33
    move-object/from16 v15, p2

    .line 34
    .line 35
    move/from16 v16, p3

    .line 36
    .line 37
    move/from16 v17, p4

    .line 38
    .line 39
    invoke-direct/range {v1 .. v17}, Ln9/e;-><init>(Lm9/d;Ln9/p;IIIIIZLn9/g;Ln9/q;Li9/f0;Ljava/util/List;ILi9/b0;IZ)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public final q()Li9/b0;
    .locals 11

    .line 1
    iget-object v0, p0, Ln9/e;->n:Li9/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Li9/f0;->a()Li9/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Li9/a;->l()Li9/w;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "CONNECT "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-static {v1, v3}, Lj9/k;->t(Li9/w;Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " HTTP/1.1"

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    new-instance v2, Lp9/b;

    .line 46
    .line 47
    iget-object v4, p0, Ln9/e;->v:Lokio/BufferedSource;

    .line 48
    .line 49
    const-string v5, "source"

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    if-nez v4, :cond_0

    .line 53
    .line 54
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v4, v6

    .line 58
    :cond_0
    iget-object v7, p0, Ln9/e;->w:Lokio/BufferedSink;

    .line 59
    .line 60
    const-string v8, "sink"

    .line 61
    .line 62
    if-nez v7, :cond_1

    .line 63
    .line 64
    invoke-static {v8}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v7, v6

    .line 68
    :cond_1
    invoke-direct {v2, v6, p0, v4, v7}, Lp9/b;-><init>(Li9/a0;Lo9/d$a;Lokio/BufferedSource;Lokio/BufferedSink;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, p0, Ln9/e;->v:Lokio/BufferedSource;

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v6

    .line 79
    :cond_2
    invoke-interface {v4}, Lokio/Source;->timeout()Lokio/Timeout;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget v5, p0, Ln9/e;->c:I

    .line 84
    .line 85
    int-to-long v9, v5

    .line 86
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    invoke-virtual {v4, v9, v10, v5}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 89
    .line 90
    .line 91
    iget-object v4, p0, Ln9/e;->w:Lokio/BufferedSink;

    .line 92
    .line 93
    if-nez v4, :cond_3

    .line 94
    .line 95
    invoke-static {v8}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v4, v6

    .line 99
    :cond_3
    invoke-interface {v4}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iget v7, p0, Ln9/e;->d:I

    .line 104
    .line 105
    int-to-long v7, v7

    .line 106
    invoke-virtual {v4, v7, v8, v5}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Li9/b0;->f()Li9/v;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v2, v4, v1}, Lp9/b;->B(Li9/v;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lp9/b;->a()V

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v2, v4}, Lp9/b;->e(Z)Li9/d0$a;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v0}, Li9/d0$a;->q(Li9/b0;)Li9/d0$a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Li9/d0$a;->c()Li9/d0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v2, v0}, Lp9/b;->A(Li9/d0;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Li9/d0;->f()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const/16 v4, 0xc8

    .line 143
    .line 144
    if-eq v2, v4, :cond_7

    .line 145
    .line 146
    const/16 v4, 0x197

    .line 147
    .line 148
    if-ne v2, v4, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Li9/f0;->a()Li9/a;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Li9/a;->h()Li9/b;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {p0}, Ln9/e;->d()Li9/f0;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v2, v4, v0}, Li9/b;->a(Li9/f0;Li9/d0;)Li9/b0;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    const-string v4, "Connection"

    .line 173
    .line 174
    const/4 v5, 0x2

    .line 175
    invoke-static {v0, v4, v6, v5, v6}, Li9/d0;->k(Li9/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    const-string v4, "close"

    .line 180
    .line 181
    invoke-static {v4, v0, v3}, Lg8/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_4

    .line 186
    .line 187
    return-object v2

    .line 188
    :cond_4
    move-object v0, v2

    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 192
    .line 193
    const-string v1, "Failed to authenticate with proxy"

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :cond_6
    new-instance v1, Ljava/io/IOException;

    .line 200
    .line 201
    new-instance v2, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string v3, "Unexpected response code for CONNECT: "

    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Li9/d0;->f()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw v1

    .line 226
    :cond_7
    return-object v6
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/e;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public retry()Ln9/u$b;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ln9/e;

    .line 4
    .line 5
    iget-object v2, v0, Ln9/e;->a:Lm9/d;

    .line 6
    .line 7
    iget-object v3, v0, Ln9/e;->b:Ln9/p;

    .line 8
    .line 9
    iget v4, v0, Ln9/e;->c:I

    .line 10
    .line 11
    iget v5, v0, Ln9/e;->d:I

    .line 12
    .line 13
    iget v6, v0, Ln9/e;->e:I

    .line 14
    .line 15
    iget v7, v0, Ln9/e;->f:I

    .line 16
    .line 17
    iget v8, v0, Ln9/e;->g:I

    .line 18
    .line 19
    iget-boolean v9, v0, Ln9/e;->h:Z

    .line 20
    .line 21
    iget-object v10, v0, Ln9/e;->i:Ln9/g;

    .line 22
    .line 23
    iget-object v11, v0, Ln9/e;->j:Ln9/q;

    .line 24
    .line 25
    invoke-virtual {v0}, Ln9/e;->d()Li9/f0;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    iget-object v13, v0, Ln9/e;->l:Ljava/util/List;

    .line 30
    .line 31
    iget v14, v0, Ln9/e;->m:I

    .line 32
    .line 33
    iget-object v15, v0, Ln9/e;->n:Li9/b0;

    .line 34
    .line 35
    move-object/from16 v16, v1

    .line 36
    .line 37
    iget v1, v0, Ln9/e;->o:I

    .line 38
    .line 39
    move/from16 v17, v1

    .line 40
    .line 41
    iget-boolean v1, v0, Ln9/e;->p:Z

    .line 42
    .line 43
    move/from16 v18, v17

    .line 44
    .line 45
    move/from16 v17, v1

    .line 46
    .line 47
    move-object/from16 v1, v16

    .line 48
    .line 49
    move/from16 v16, v18

    .line 50
    .line 51
    invoke-direct/range {v1 .. v17}, Ln9/e;-><init>(Lm9/d;Ln9/p;IIIIIZLn9/g;Ln9/q;Li9/f0;Ljava/util/List;ILi9/b0;IZ)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v16, v1

    .line 55
    .line 56
    return-object v16
.end method

.method public final s(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ln9/e;
    .locals 10

    .line 1
    const-string v0, "connectionSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sslSocket"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Ln9/e;->o:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    add-int/2addr v0, v1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v6, v0

    .line 20
    :goto_0
    if-ge v6, v2, :cond_2

    .line 21
    .line 22
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lokhttp3/b;

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Lokhttp3/b;->e(Ljavax/net/ssl/SSLSocket;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget p1, p0, Ln9/e;->o:I

    .line 35
    .line 36
    const/4 p2, -0x1

    .line 37
    if-eq p1, p2, :cond_0

    .line 38
    .line 39
    :goto_1
    move v7, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    const/4 v8, 0x3

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    move-object v3, p0

    .line 48
    invoke-static/range {v3 .. v9}, Ln9/e;->p(Ln9/e;ILi9/b0;IZILjava/lang/Object;)Ln9/e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    return-object p1
.end method

.method public final t(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ln9/e;
    .locals 3

    .line 1
    const-string v0, "connectionSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sslSocket"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Ln9/e;->o:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0, p1, p2}, Ln9/e;->s(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ln9/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-boolean v2, p0, Ln9/e;->p:Z

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v2, ", modes="

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p1, ", supported protocols="

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "toString(...)"

    .line 66
    .line 67
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method
