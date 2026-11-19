.class public Lcom/tendcloud/tenddata/bu$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private iqueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/tendcloud/tenddata/am;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/tendcloud/tenddata/bu;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/bu;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bu$b;->this$0:Lcom/tendcloud/tenddata/bu;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/tendcloud/tenddata/bu$b;->iqueue:Ljava/util/concurrent/BlockingQueue;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "WebSocketWorker-"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lcom/tendcloud/tenddata/bu$b$1;

    .line 38
    .line 39
    invoke-direct {v0, p0, p1}, Lcom/tendcloud/tenddata/bu$b$1;-><init>(Lcom/tendcloud/tenddata/bu$b;Lcom/tendcloud/tenddata/bu;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public put(Lcom/tendcloud/tenddata/am;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu$b;->iqueue:Ljava/util/concurrent/BlockingQueue;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu$b;->iqueue:Ljava/util/concurrent/BlockingQueue;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lcom/tendcloud/tenddata/am;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    .line 10
    :try_start_1
    iget-object v0, v1, Lcom/tendcloud/tenddata/am;->i:Ljava/util/concurrent/BlockingQueue;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 17
    .line 18
    :try_start_2
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/am;->decode(Ljava/nio/ByteBuffer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_3
    iget-object v2, p0, Lcom/tendcloud/tenddata/bu$b;->this$0:Lcom/tendcloud/tenddata/bu;

    .line 22
    .line 23
    invoke-static {v2, v0}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/bu;Ljava/nio/ByteBuffer;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    iget-object v3, p0, Lcom/tendcloud/tenddata/bu$b;->this$0:Lcom/tendcloud/tenddata/bu;

    .line 32
    .line 33
    invoke-static {v3, v0}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/bu;Ljava/nio/ByteBuffer;)V

    .line 34
    .line 35
    .line 36
    throw v2
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 37
    :catch_1
    move-exception v1

    .line 38
    move-object v4, v1

    .line 39
    move-object v1, v0

    .line 40
    move-object v0, v4

    .line 41
    :goto_1
    iget-object v2, p0, Lcom/tendcloud/tenddata/bu$b;->this$0:Lcom/tendcloud/tenddata/bu;

    .line 42
    .line 43
    invoke-static {v2, v1, v0}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/bu;Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 44
    .line 45
    .line 46
    :catch_2
    return-void
.end method
