.class public Lh7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public c:Lcom/lzy/okgo/model/Progress;

.field public d:Ljava/util/Map;

.field public e:Ljava/util/concurrent/ThreadPoolExecutor;

.field public f:Li7/b;


# direct methods
.method public constructor <init>(Lcom/lzy/okgo/model/Progress;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, "progress == null"

    invoke-static {p1, v0}, Lf7/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    iput-object p1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 15
    invoke-static {}, Lg7/a;->b()Lg7/a;

    move-result-object p1

    invoke-virtual {p1}, Lg7/a;->e()Lh7/c;

    move-result-object p1

    invoke-virtual {p1}, Lh7/c;->a()Li7/c;

    move-result-object p1

    iput-object p1, p0, Lh7/b;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 16
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lh7/b;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/lzy/okgo/request/base/Request;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "tag == null"

    invoke-static {p1, v0}, Lf7/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    new-instance v0, Lcom/lzy/okgo/model/Progress;

    invoke-direct {v0}, Lcom/lzy/okgo/model/Progress;-><init>()V

    iput-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 4
    iput-object p1, v0, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 5
    invoke-static {}, Lg7/a;->b()Lg7/a;

    move-result-object p1

    invoke-virtual {p1}, Lg7/a;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 6
    iget-object p1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    invoke-virtual {p2}, Lcom/lzy/okgo/request/base/Request;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/lzy/okgo/model/Progress;->d:Ljava/lang/String;

    .line 7
    iget-object p1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    const/4 v0, 0x0

    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    const-wide/16 v0, -0x1

    .line 8
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->i:J

    .line 9
    iput-object p2, p1, Lcom/lzy/okgo/model/Progress;->o:Lcom/lzy/okgo/request/base/Request;

    .line 10
    invoke-static {}, Lg7/a;->b()Lg7/a;

    move-result-object p1

    invoke-virtual {p1}, Lg7/a;->e()Lh7/c;

    move-result-object p1

    invoke-virtual {p1}, Lh7/c;->a()Li7/c;

    move-result-object p1

    iput-object p1, p0, Lh7/b;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lh7/b;->d:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Lh7/b;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lh7/b;->f(Lcom/lzy/okgo/model/Progress;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/InputStream;Ljava/io/RandomAccessFile;Lcom/lzy/okgo/model/Progress;)V
    .locals 10

    .line 1
    move-object v1, p3

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    iput v0, v1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 9
    .line 10
    const/16 v7, 0x2000

    .line 11
    .line 12
    new-array v8, v7, [B

    .line 13
    .line 14
    new-instance v9, Ljava/io/BufferedInputStream;

    .line 15
    .line 16
    invoke-direct {v9, p1, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    const/4 v2, 0x0

    .line 20
    :try_start_0
    invoke-virtual {v9, v8, v2, v7}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, -0x1

    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    iget v4, v1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 28
    .line 29
    if-ne v4, v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, v8, v2, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 32
    .line 33
    .line 34
    int-to-long v2, v3

    .line 35
    iget-wide v4, v1, Lcom/lzy/okgo/model/Progress;->i:J

    .line 36
    .line 37
    new-instance v6, Lh7/b$a;

    .line 38
    .line 39
    invoke-direct {v6, p0}, Lh7/b$a;-><init>(Lh7/b;)V

    .line 40
    .line 41
    .line 42
    invoke-static/range {v1 .. v6}, Lcom/lzy/okgo/model/Progress;->e(Lcom/lzy/okgo/model/Progress;JJLcom/lzy/okgo/model/Progress$a;)Lcom/lzy/okgo/model/Progress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    move-object v1, p3

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {p2}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v9}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_1
    invoke-static {p2}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v9}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lf7/b;->a(Ljava/io/Closeable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_2
    return-void
.end method

.method public c(Ljava/lang/String;)Lh7/b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 14
    .line 15
    iput-object p1, v0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p1, "fileName is null, ignored!"

    .line 19
    .line 20
    invoke-static {p1}, Lf7/c;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lh7/b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 14
    .line 15
    iput-object p1, v0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p1, "folder is null, ignored!"

    .line 19
    .line 20
    invoke-static {p1}, Lf7/c;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh7/b;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    iget-object v1, p0, Lh7/b;->f:Li7/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 9
    .line 10
    iget v1, v0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lh7/b;->j(Lcom/lzy/okgo/model/Progress;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 v2, 0x2

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->k:J

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    iput v1, v0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "only the task with status WAITING(1) or LOADING(2) can pause, current status is "

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 41
    .line 42
    iget v1, v1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lf7/c;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final f(Lcom/lzy/okgo/model/Progress;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh7/b$e;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lh7/b$e;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->k:J

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 7
    .line 8
    iput-object p2, p1, Lcom/lzy/okgo/model/Progress;->s:Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Lh7/b$f;

    .line 14
    .line 15
    invoke-direct {p2, p0, p1}, Lh7/b$f;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final h(Lcom/lzy/okgo/model/Progress;Ljava/io/File;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->k:J

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->h:F

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lh7/b$g;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, p2}, Lh7/b$g;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final i(Lcom/lzy/okgo/model/Progress;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->k:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lh7/b$b;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lh7/b$b;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final j(Lcom/lzy/okgo/model/Progress;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->k:J

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lh7/b$d;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lh7/b$d;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final k(Lcom/lzy/okgo/model/Progress;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p1, Lcom/lzy/okgo/model/Progress;->k:J

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lh7/b;->q(Lcom/lzy/okgo/model/Progress;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lh7/b$c;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lh7/b$c;-><init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public l(Lh7/a;)Lh7/b;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lh7/b;->d:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v1, p1, Lh7/a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
.end method

.method public m()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh7/b;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lf7/b;->e(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput v3, v0, Lcom/lzy/okgo/model/Progress;->h:F

    .line 22
    .line 23
    iput-wide v1, v0, Lcom/lzy/okgo/model/Progress;->k:J

    .line 24
    .line 25
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ld7/a;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lh7/b;->o()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public n()Lh7/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 22
    .line 23
    new-instance v1, Ljava/io/File;

    .line 24
    .line 25
    iget-object v2, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 26
    .line 27
    iget-object v3, v2, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v2, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 39
    .line 40
    :cond_0
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ld7/a;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public o()V
    .locals 6

    .line 1
    invoke-static {}, Lg7/a;->b()Lg7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lg7/a;->c(Ljava/lang/String;)Lh7/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ld7/e;->k(Ljava/lang/String;)Lcom/lzy/okgo/model/Progress;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 30
    .line 31
    iget v1, v0, Lcom/lzy/okgo/model/Progress;->l:I

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    if-eq v1, v2, :cond_4

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    const/4 v2, 0x5

    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    iget-object v1, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 47
    .line 48
    const-string v2, " may be invalid or damaged, please call the method restart() to download again\uff01"

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    new-instance v1, Lcom/lzy/okgo/exception/StorageException;

    .line 53
    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v4, "the file of the task with tag:"

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v4, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 65
    .line 66
    iget-object v4, v4, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v1, v2}, Lcom/lzy/okgo/exception/StorageException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 86
    .line 87
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 88
    .line 89
    iget-object v1, v1, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    iget-object v3, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 105
    .line 106
    iget-wide v4, v3, Lcom/lzy/okgo/model/Progress;->i:J

    .line 107
    .line 108
    cmp-long v0, v0, v4

    .line 109
    .line 110
    if-nez v0, :cond_2

    .line 111
    .line 112
    new-instance v0, Ljava/io/File;

    .line 113
    .line 114
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 115
    .line 116
    iget-object v1, v1, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3, v0}, Lh7/b;->h(Lcom/lzy/okgo/model/Progress;Ljava/io/File;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_2
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 126
    .line 127
    new-instance v1, Lcom/lzy/okgo/exception/StorageException;

    .line 128
    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v4, "the file "

    .line 135
    .line 136
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v4, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 140
    .line 141
    iget-object v4, v4, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-direct {v1, v2}, Lcom/lzy/okgo/exception/StorageException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v1, "the task with tag "

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 171
    .line 172
    iget-object v1, v1, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v1, " is already in the download queue, current task status is "

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 183
    .line 184
    iget v1, v1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lf7/c;->c(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_4
    :goto_0
    invoke-virtual {p0, v0}, Lh7/b;->i(Lcom/lzy/okgo/model/Progress;)V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 201
    .line 202
    invoke-virtual {p0, v0}, Lh7/b;->k(Lcom/lzy/okgo/model/Progress;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Li7/b;

    .line 206
    .line 207
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 208
    .line 209
    iget v1, v1, Lcom/lzy/okgo/model/Progress;->m:I

    .line 210
    .line 211
    invoke-direct {v0, v1, p0}, Li7/b;-><init>(ILjava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    iput-object v0, p0, Lh7/b;->f:Li7/b;

    .line 215
    .line 216
    iget-object v1, p0, Lh7/b;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 223
    .line 224
    const-string v1, "you must call DownloadTask#save() before DownloadTask#start()\uff01"

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0
.end method

.method public p(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "tag == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lf7/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh7/b;->d:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q(Lcom/lzy/okgo/model/Progress;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/lzy/okgo/model/Progress;->d(Lcom/lzy/okgo/model/Progress;)Landroid/content/ContentValues;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p1, p1, Lcom/lzy/okgo/model/Progress;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Ld7/e;->p(Landroid/content/ContentValues;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/lzy/okgo/model/Progress;->j:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v3, v1, v3

    .line 8
    .line 9
    if-gez v3, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->a()Lcom/lzy/okgo/exception/OkGoException;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-lez v3, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/io/File;

    .line 30
    .line 31
    iget-object v4, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 32
    .line 33
    iget-object v4, v4, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 45
    .line 46
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->c()Lcom/lzy/okgo/exception/OkGoException;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    :try_start_0
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->o:Lcom/lzy/okgo/request/base/Request;

    .line 57
    .line 58
    const-string v4, "Range"

    .line 59
    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v6, "bytes="

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v6, "-"

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v0, v4, v5}, Lcom/lzy/okgo/request/base/Request;->k(Ljava/lang/String;Ljava/lang/String;)Lcom/lzy/okgo/request/base/Request;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/lzy/okgo/request/base/Request;->a()Lje/y;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 89
    invoke-virtual {v0}, Lje/y;->j()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    const/16 v5, 0x194

    .line 94
    .line 95
    if-eq v4, v5, :cond_10

    .line 96
    .line 97
    const/16 v5, 0x1f4

    .line 98
    .line 99
    if-lt v4, v5, :cond_2

    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :cond_2
    invoke-virtual {v0}, Lje/y;->e()Lje/z;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-nez v4, :cond_3

    .line 108
    .line 109
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 110
    .line 111
    new-instance v1, Lcom/lzy/okgo/exception/HttpException;

    .line 112
    .line 113
    const-string v2, "response body is null"

    .line 114
    .line 115
    invoke-direct {v1, v2}, Lcom/lzy/okgo/exception/HttpException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 123
    .line 124
    iget-wide v6, v5, Lcom/lzy/okgo/model/Progress;->i:J

    .line 125
    .line 126
    const-wide/16 v8, -0x1

    .line 127
    .line 128
    cmp-long v6, v6, v8

    .line 129
    .line 130
    if-nez v6, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4}, Lje/z;->contentLength()J

    .line 133
    .line 134
    .line 135
    move-result-wide v6

    .line 136
    iput-wide v6, v5, Lcom/lzy/okgo/model/Progress;->i:J

    .line 137
    .line 138
    :cond_4
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 139
    .line 140
    iget-object v5, v5, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_5

    .line 147
    .line 148
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 149
    .line 150
    iget-object v5, v5, Lcom/lzy/okgo/model/Progress;->d:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v0, v5}, Lf7/a;->e(Lje/y;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 157
    .line 158
    iput-object v5, v0, Lcom/lzy/okgo/model/Progress;->g:Ljava/lang/String;

    .line 159
    .line 160
    :cond_5
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 161
    .line 162
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v0}, Lf7/b;->c(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_6

    .line 169
    .line 170
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 171
    .line 172
    invoke-static {}, Lcom/lzy/okgo/exception/StorageException;->a()Lcom/lzy/okgo/exception/StorageException;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_6
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 181
    .line 182
    iget-object v0, v0, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    new-instance v0, Ljava/io/File;

    .line 191
    .line 192
    iget-object v6, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 193
    .line 194
    iget-object v6, v6, Lcom/lzy/okgo/model/Progress;->e:Ljava/lang/String;

    .line 195
    .line 196
    invoke-direct {v0, v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    iput-object v6, v5, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_7
    new-instance v0, Ljava/io/File;

    .line 209
    .line 210
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 211
    .line 212
    iget-object v5, v5, Lcom/lzy/okgo/model/Progress;->f:Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_0
    if-lez v3, :cond_8

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-nez v5, :cond_8

    .line 224
    .line 225
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 226
    .line 227
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->a()Lcom/lzy/okgo/exception/OkGoException;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_8
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 236
    .line 237
    iget-wide v6, v5, Lcom/lzy/okgo/model/Progress;->i:J

    .line 238
    .line 239
    cmp-long v6, v1, v6

    .line 240
    .line 241
    if-lez v6, :cond_9

    .line 242
    .line 243
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->a()Lcom/lzy/okgo/exception/OkGoException;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {p0, v5, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_9
    if-nez v3, :cond_a

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_a

    .line 258
    .line 259
    invoke-static {v0}, Lf7/b;->d(Ljava/io/File;)Z

    .line 260
    .line 261
    .line 262
    :cond_a
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 263
    .line 264
    iget-wide v5, v5, Lcom/lzy/okgo/model/Progress;->i:J

    .line 265
    .line 266
    cmp-long v5, v1, v5

    .line 267
    .line 268
    if-nez v5, :cond_c

    .line 269
    .line 270
    if-lez v3, :cond_c

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_b

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 279
    .line 280
    .line 281
    move-result-wide v3

    .line 282
    cmp-long v1, v1, v3

    .line 283
    .line 284
    if-nez v1, :cond_b

    .line 285
    .line 286
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 287
    .line 288
    invoke-virtual {p0, v1, v0}, Lh7/b;->h(Lcom/lzy/okgo/model/Progress;Ljava/io/File;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_b
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 293
    .line 294
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->a()Lcom/lzy/okgo/exception/OkGoException;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_c
    :try_start_1
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 303
    .line 304
    const-string v5, "rw"

    .line 305
    .line 306
    invoke-direct {v3, v0, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 310
    .line 311
    .line 312
    iget-object v5, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 313
    .line 314
    iput-wide v1, v5, Lcom/lzy/okgo/model/Progress;->j:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 315
    .line 316
    :try_start_2
    invoke-static {}, Ld7/e;->n()Ld7/e;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    iget-object v2, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 321
    .line 322
    invoke-virtual {v1, v2}, Ld7/a;->h(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Lje/z;->byteStream()Ljava/io/InputStream;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v2, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 330
    .line 331
    invoke-virtual {p0, v1, v3, v2}, Lh7/b;->b(Ljava/io/InputStream;Ljava/io/RandomAccessFile;Lcom/lzy/okgo/model/Progress;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 332
    .line 333
    .line 334
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 335
    .line 336
    iget v2, v1, Lcom/lzy/okgo/model/Progress;->l:I

    .line 337
    .line 338
    const/4 v3, 0x3

    .line 339
    if-ne v2, v3, :cond_d

    .line 340
    .line 341
    invoke-virtual {p0, v1}, Lh7/b;->j(Lcom/lzy/okgo/model/Progress;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :cond_d
    const/4 v3, 0x2

    .line 346
    if-ne v2, v3, :cond_f

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 349
    .line 350
    .line 351
    move-result-wide v1

    .line 352
    iget-object v3, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 353
    .line 354
    iget-wide v4, v3, Lcom/lzy/okgo/model/Progress;->i:J

    .line 355
    .line 356
    cmp-long v1, v1, v4

    .line 357
    .line 358
    if-nez v1, :cond_e

    .line 359
    .line 360
    invoke-virtual {p0, v3, v0}, Lh7/b;->h(Lcom/lzy/okgo/model/Progress;Ljava/io/File;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :cond_e
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->a()Lcom/lzy/okgo/exception/OkGoException;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {p0, v3, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_f
    invoke-static {}, Lcom/lzy/okgo/exception/OkGoException;->d()Lcom/lzy/okgo/exception/OkGoException;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {p0, v1, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :catch_0
    move-exception v0

    .line 381
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 382
    .line 383
    invoke-virtual {p0, v1, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :catch_1
    move-exception v0

    .line 388
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 389
    .line 390
    invoke-virtual {p0, v1, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_10
    :goto_1
    iget-object v0, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 395
    .line 396
    invoke-static {}, Lcom/lzy/okgo/exception/HttpException;->a()Lcom/lzy/okgo/exception/HttpException;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {p0, v0, v1}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :catch_2
    move-exception v0

    .line 405
    iget-object v1, p0, Lh7/b;->c:Lcom/lzy/okgo/model/Progress;

    .line 406
    .line 407
    invoke-virtual {p0, v1, v0}, Lh7/b;->g(Lcom/lzy/okgo/model/Progress;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    return-void
.end method
