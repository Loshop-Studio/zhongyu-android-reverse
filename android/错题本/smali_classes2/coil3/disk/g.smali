.class public final Lcoil3/disk/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lokio/Sink;Landroidx/navigation/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcoil3/disk/g;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt7/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcoil3/disk/g;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 5
    new-instance v0, Lokio/ForwardingTimeout;

    .line 6
    iget-object p1, p1, Lt7/g;->d:Lokio/BufferedSink;

    .line 7
    invoke-interface {p1}, Lokio/Sink;->timeout()Lokio/Timeout;

    move-result-object p1

    invoke-direct {v0, p1}, Lokio/ForwardingTimeout;-><init>(Lokio/Timeout;)V

    iput-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget v0, p0, Lcoil3/disk/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt7/g;

    .line 9
    .line 10
    iget-boolean v1, p0, Lcoil3/disk/g;->b:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Lcoil3/disk/g;->b:Z

    .line 17
    .line 18
    iget-object v1, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lokio/ForwardingTimeout;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lt7/g;->i(Lt7/g;Lokio/ForwardingTimeout;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    iput v1, v0, Lt7/g;->e:I

    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lokio/Sink;

    .line 32
    .line 33
    invoke-interface {v0}, Lokio/Sink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception v0

    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, p0, Lcoil3/disk/g;->b:Z

    .line 40
    .line 41
    iget-object v1, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroidx/navigation/i;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroidx/navigation/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget v0, p0, Lcoil3/disk/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcoil3/disk/g;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lt7/g;

    .line 14
    .line 15
    iget-object v0, v0, Lt7/g;->d:Lokio/BufferedSink;

    .line 16
    .line 17
    invoke-interface {v0}, Lokio/BufferedSink;->flush()V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lokio/Sink;

    .line 24
    .line 25
    invoke-interface {v0}, Lokio/Sink;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception v0

    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, Lcoil3/disk/g;->b:Z

    .line 32
    .line 33
    iget-object v1, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Landroidx/navigation/i;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroidx/navigation/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :goto_1
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final timeout()Lokio/Timeout;
    .locals 1

    .line 1
    iget v0, p0, Lcoil3/disk/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lokio/ForwardingTimeout;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lokio/Sink;

    .line 14
    .line 15
    invoke-interface {v0}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final write(Lokio/Buffer;J)V
    .locals 6

    .line 1
    iget v0, p0, Lcoil3/disk/g;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/disk/g;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "source"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lcoil3/disk/g;->b:Z

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    sget-object v0, Lp7/c;->a:[B

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v0, p2, v4

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    cmp-long v0, v4, v2

    .line 31
    .line 32
    if-gtz v0, :cond_0

    .line 33
    .line 34
    cmp-long v0, v2, p2

    .line 35
    .line 36
    if-ltz v0, :cond_0

    .line 37
    .line 38
    check-cast v1, Lt7/g;

    .line 39
    .line 40
    iget-object v0, v1, Lt7/g;->d:Lokio/BufferedSink;

    .line 41
    .line 42
    invoke-interface {v0, p1, p2, p3}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "closed"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :pswitch_0
    iget-boolean v0, p0, Lcoil3/disk/g;->b:Z

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p1, p2, p3}, Lokio/Buffer;->skip(J)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcoil3/disk/g;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lokio/Sink;

    .line 71
    .line 72
    invoke-interface {v0, p1, p2, p3}, Lokio/Sink;->write(Lokio/Buffer;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_0
    move-exception p1

    .line 77
    const/4 p2, 0x1

    .line 78
    iput-boolean p2, p0, Lcoil3/disk/g;->b:Z

    .line 79
    .line 80
    check-cast v1, Landroidx/navigation/i;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Landroidx/navigation/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :goto_0
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
