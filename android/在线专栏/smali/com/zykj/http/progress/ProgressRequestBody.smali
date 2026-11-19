# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/http/progress/ProgressRequestBody;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final contentType:Lokhttp3/MediaType;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final file:Ljava/io/File;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final listener:Lcom/zykj/http/listener/UploadProgressListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/MediaType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/http/listener/UploadProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    .line 4
    iput-object p2, p0, Lcom/zykj/http/progress/ProgressRequestBody;->contentType:Lokhttp3/MediaType;

    .line 5
    iput-object p3, p0, Lcom/zykj/http/progress/ProgressRequestBody;->listener:Lcom/zykj/http/listener/UploadProgressListener;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;ILkotlin/jvm/internal/g;)V
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
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/http/progress/ProgressRequestBody;-><init>(Ljava/io/File;Lokhttp3/MediaType;Lcom/zykj/http/listener/UploadProgressListener;)V

    return-void
.end method


# virtual methods
.method public contentType()Lokhttp3/MediaType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/progress/ProgressRequestBody;->contentType:Lokhttp3/MediaType;

    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 9
    .param p1    # Lokio/BufferedSink;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 2
    new-instance v3, Ljava/io/FileInputStream;

    iget-object v4, p0, Lcom/zykj/http/progress/ProgressRequestBody;->file:Ljava/io/File;

    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const-wide/16 v4, 0x0

    .line 3
    :catch_0
    :goto_0
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/io/FileInputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1

    int-to-long v7, v6

    add-long/2addr v4, v7

    const/4 v7, 0x0

    .line 4
    invoke-interface {p1, v2, v7, v6}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-object v6, p0, Lcom/zykj/http/progress/ProgressRequestBody;->listener:Lcom/zykj/http/listener/UploadProgressListener;

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v6, v4, v5, v0, v1}, Lcom/zykj/http/listener/UploadProgressListener;->onProgressUpdate(JJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 6
    :cond_1
    :try_start_2
    sget-object p1, Lo2/r;->a:Lo2/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x0

    .line 7
    invoke-static {v3, p1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, p1}, Lv2/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
