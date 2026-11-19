# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/http/progress/ProgressRequestBody;
.super Li9/c0;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final contentType:Li9/y;

.field private final file:Ljava/io/File;

.field private final listener:Lcom/zykj/http/listener/UploadProgressListener;


# direct methods
.method public constructor <init>(Ljava/io/File;Li9/y;Lcom/zykj/http/listener/UploadProgressListener;)V
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Li9/c0;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    .line 4
    iput-object p2, p0, Lcom/zykj/http/progress/ProgressRequestBody;->contentType:Li9/y;

    .line 5
    iput-object p3, p0, Lcom/zykj/http/progress/ProgressRequestBody;->listener:Lcom/zykj/http/listener/UploadProgressListener;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Li9/y;Lcom/zykj/http/listener/UploadProgressListener;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/http/progress/ProgressRequestBody;-><init>(Ljava/io/File;Li9/y;Lcom/zykj/http/listener/UploadProgressListener;)V

    return-void
.end method


# virtual methods
.method public contentType()Li9/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/progress/ProgressRequestBody;->contentType:Li9/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 9

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const/16 v2, 0x400

    .line 13
    .line 14
    new-array v2, v2, [B

    .line 15
    .line 16
    new-instance v3, Ljava/io/FileInputStream;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    :catch_0
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/io/FileInputStream;->read([B)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/4 v7, -0x1

    .line 30
    if-eq v6, v7, :cond_1

    .line 31
    .line 32
    int-to-long v7, v6

    .line 33
    add-long/2addr v4, v7

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-interface {p1, v2, v7, v6}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :try_start_1
    iget-object v6, p0, Lcom/zykj/http/progress/ProgressRequestBody;->listener:Lcom/zykj/http/listener/UploadProgressListener;

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    invoke-interface {v6, v4, v5, v0, v1}, Lcom/zykj/http/listener/UploadProgressListener;->onProgressUpdate(JJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :try_start_2
    sget-object p1, Lh7/p;->a:Lh7/p;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-static {v3, p1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    invoke-static {v3, p1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method
