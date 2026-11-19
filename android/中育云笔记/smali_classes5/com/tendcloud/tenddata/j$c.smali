.class Lcom/tendcloud/tenddata/j$c;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/j;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/j$c;->this$0:Lcom/tendcloud/tenddata/j;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/j;Lcom/tendcloud/tenddata/j$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/j$c;-><init>(Lcom/tendcloud/tenddata/j;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/j$c;->this$0:Lcom/tendcloud/tenddata/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/j;->b(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    .line 8
    .line 9
    invoke-static {}, Lcom/tendcloud/tenddata/j;->c()Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v2, v3}, Lcom/tendcloud/tenddata/ar;->sendFragmentedFrame(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :catchall_0
    return-void
.end method

.method public write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 1
    :try_start_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 2
    invoke-virtual {p0, v1, v2, v0}, Lcom/tendcloud/tenddata/j$c;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public write([B)V
    .locals 2

    .line 3
    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/tendcloud/tenddata/j$c;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 4
    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 5
    :try_start_0
    iget-object p2, p0, Lcom/tendcloud/tenddata/j$c;->this$0:Lcom/tendcloud/tenddata/j;

    invoke-static {p2}, Lcom/tendcloud/tenddata/j;->b(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$b;

    move-result-object p2

    sget-object p3, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, p1, v0}, Lcom/tendcloud/tenddata/ar;->sendFragmentedFrame(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
