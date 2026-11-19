.class public Lcom/tendcloud/tenddata/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/ap;


# instance fields
.field private final a:Ljava/nio/channels/ByteChannel;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/ap;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    return-void
.end method

.method public constructor <init>(Ljava/nio/channels/ByteChannel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, Lcom/tendcloud/tenddata/ap;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/tendcloud/tenddata/ap;

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/ap;->a(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, Lcom/tendcloud/tenddata/ap;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/tendcloud/tenddata/ap;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/tendcloud/tenddata/ap;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/tendcloud/tenddata/ap;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/tendcloud/tenddata/ap;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/tendcloud/tenddata/ap;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/nio/channels/SocketChannel;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    instance-of v1, v0, Lcom/tendcloud/tenddata/ap;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Lcom/tendcloud/tenddata/ap;

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/tendcloud/tenddata/ap;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/nio/channels/Channel;->isOpen()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ag;->a:Ljava/nio/channels/ByteChannel;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
