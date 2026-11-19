.class public final Lokhttp3/d0;
.super Lokhttp3/g0;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lokhttp3/u;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lokhttp3/g0;Lokhttp3/u;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lokhttp3/d0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lokhttp3/d0;->b:Lokhttp3/u;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/u;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lokhttp3/d0;->a:I

    iput-object p1, p0, Lokhttp3/d0;->b:Lokhttp3/u;

    iput-object p2, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lokhttp3/g0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lokhttp3/g0;->contentLength()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lokio/ByteString;

    .line 18
    .line 19
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v0, v0

    .line 24
    return-wide v0

    .line 25
    :pswitch_1
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/io/File;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final contentType()Lokhttp3/u;
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/d0;->b:Lokhttp3/u;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lokhttp3/d0;->b:Lokhttp3/u;

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    iget-object v0, p0, Lokhttp3/d0;->b:Lokhttp3/u;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final writeTo(Lokio/BufferedSink;)V
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lokhttp3/g0;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lokhttp3/g0;->writeTo(Lokio/BufferedSink;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const-string v0, "sink"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lokio/ByteString;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lokio/BufferedSink;->write(Lokio/ByteString;)Lokio/BufferedSink;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    const-string v0, "sink"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lokhttp3/d0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/io/File;

    .line 35
    .line 36
    invoke-static {v0}, Lokio/Okio;->source(Ljava/io/File;)Lokio/Source;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :try_start_0
    invoke-interface {p1, v0}, Lokio/BufferedSink;->writeAll(Lokio/Source;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-static {v0, p1}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    invoke-static {v0, p1}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
