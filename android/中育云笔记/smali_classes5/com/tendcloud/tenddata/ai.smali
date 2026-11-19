.class public Lcom/tendcloud/tenddata/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/tendcloud/tenddata/am;Ljava/nio/channels/ByteChannel;)Z
    .locals 4

    .line 10
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 11
    instance-of v0, p1, Lcom/tendcloud/tenddata/ap;

    if-eqz v0, :cond_2

    .line 12
    move-object v0, p1

    check-cast v0, Lcom/tendcloud/tenddata/ap;

    .line 13
    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 14
    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->b()V

    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 16
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lez v0, :cond_1

    return v1

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 18
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    :cond_2
    const/4 v0, 0x0

    .line 19
    :cond_3
    :goto_0
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->isFlushAndClose()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->getDraft()Lcom/tendcloud/tenddata/as;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/as;->d()Lcom/tendcloud/tenddata/aj$b;

    move-result-object v2

    sget-object v3, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;

    if-ne v2, v3, :cond_4

    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->a()V

    .line 22
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    :goto_1
    const/4 p0, 0x1

    if-eqz v0, :cond_6

    .line 23
    check-cast p1, Lcom/tendcloud/tenddata/ap;

    invoke-interface {p1}, Lcom/tendcloud/tenddata/ap;->a()Z

    move-result p1

    if-nez p1, :cond_5

    return p0

    :cond_5
    return v1

    :cond_6
    return p0
.end method

.method public static a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/am;Lcom/tendcloud/tenddata/ap;)Z
    .locals 1

    .line 5
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 6
    invoke-interface {p2, p0}, Lcom/tendcloud/tenddata/ap;->a(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 7
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const/4 p0, -0x1

    if-ne v0, p0, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/am;->b()V

    const/4 p0, 0x0

    return p0

    .line 9
    :cond_0
    invoke-interface {p2}, Lcom/tendcloud/tenddata/ap;->c()Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/am;Ljava/nio/channels/ByteChannel;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 2
    invoke-interface {p2, p0}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p2

    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const/4 p0, -0x1

    const/4 v0, 0x0

    if-ne p2, p0, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/am;->b()V

    return v0

    :cond_0
    if-eqz p2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method
