.class public Lcom/lzy/okgo/request/base/a;
.super Lje/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lzy/okgo/request/base/a$c;,
        Lcom/lzy/okgo/request/base/a$b;
    }
.end annotation


# instance fields
.field public a:Lje/x;


# direct methods
.method public constructor <init>(Lje/x;Lc7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lje/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lzy/okgo/request/base/a;->a:Lje/x;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/lzy/okgo/request/base/a;)Lcom/lzy/okgo/request/base/a$c;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/lzy/okgo/request/base/a;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/lzy/okgo/request/base/a;->d(Lcom/lzy/okgo/model/Progress;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/lzy/okgo/request/base/a;)Lc7/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lzy/okgo/request/base/a;->a:Lje/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje/x;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lf7/c;->a(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    return-wide v0
.end method

.method public contentType()Lje/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lzy/okgo/request/base/a;->a:Lje/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje/x;->contentType()Lje/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d(Lcom/lzy/okgo/model/Progress;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/lzy/okgo/request/base/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/lzy/okgo/request/base/a$a;-><init>(Lcom/lzy/okgo/request/base/a;Lcom/lzy/okgo/model/Progress;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lf7/a;->g(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(Lcom/lzy/okgo/request/base/a$c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/lzy/okgo/request/base/a$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/lzy/okgo/request/base/a$b;-><init>(Lcom/lzy/okgo/request/base/a;Lokio/Sink;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/lzy/okgo/request/base/a;->a:Lje/x;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lje/x;->writeTo(Lokio/BufferedSink;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
