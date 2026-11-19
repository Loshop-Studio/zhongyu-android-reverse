.class Lcom/tendcloud/tenddata/ar$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/ar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/ar;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/ar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/ar$a;->this$0:Lcom/tendcloud/tenddata/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/ar;Lcom/tendcloud/tenddata/ar$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ar$a;-><init>(Lcom/tendcloud/tenddata/ar;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "WebsocketWriteThread"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar$a;->this$0:Lcom/tendcloud/tenddata/ar;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/tendcloud/tenddata/ar;->access$100(Lcom/tendcloud/tenddata/ar;)Lcom/tendcloud/tenddata/am;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar$a;->this$0:Lcom/tendcloud/tenddata/ar;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/tendcloud/tenddata/ar;->access$200(Lcom/tendcloud/tenddata/ar;)Ljava/io/OutputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar$a;->this$0:Lcom/tendcloud/tenddata/ar;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/tendcloud/tenddata/ar;->access$200(Lcom/tendcloud/tenddata/ar;)Ljava/io/OutputStream;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar$a;->this$0:Lcom/tendcloud/tenddata/ar;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/tendcloud/tenddata/ar;->access$100(Lcom/tendcloud/tenddata/ar;)Lcom/tendcloud/tenddata/am;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->b()V

    .line 65
    .line 66
    .line 67
    :catchall_0
    :cond_0
    return-void
.end method
