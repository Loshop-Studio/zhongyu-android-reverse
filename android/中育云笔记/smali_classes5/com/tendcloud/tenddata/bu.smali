.class public abstract Lcom/tendcloud/tenddata/bu;
.super Lcom/tendcloud/tenddata/ak;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bu$a;,
        Lcom/tendcloud/tenddata/bu$b;
    }
.end annotation


# static fields
.field public static a:I = 0x0

.field static final synthetic b:Z = true


# instance fields
.field private final c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/tendcloud/tenddata/aj;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/net/InetSocketAddress;

.field private e:Ljava/nio/channels/ServerSocketChannel;

.field private f:Ljava/nio/channels/Selector;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Thread;

.field private volatile i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bu$b;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/am;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Ljava/util/concurrent/atomic/AtomicInteger;

.field private o:Lcom/tendcloud/tenddata/bu$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Lcom/tendcloud/tenddata/bu;->a:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/net/InetSocketAddress;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    sget v1, Lcom/tendcloud/tenddata/bu;->a:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/bu;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 2

    .line 2
    sget v0, Lcom/tendcloud/tenddata/bu;->a:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/tendcloud/tenddata/bu;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;I)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/bu;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "I",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;)V"
        }
    .end annotation

    .line 5
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/tendcloud/tenddata/bu;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;Ljava/util/Collection;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;ILjava/util/List;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "I",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;",
            "Ljava/util/Collection<",
            "Lcom/tendcloud/tenddata/aj;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ak;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    iput v1, p0, Lcom/tendcloud/tenddata/bu;->m:I

    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    new-instance v0, Lcom/tendcloud/tenddata/bt;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bt;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->o:Lcom/tendcloud/tenddata/bu$a;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-lt p2, v0, :cond_2

    if-eqz p4, :cond_2

    if-nez p3, :cond_0

    .line 11
    sget-object p3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p3, p0, Lcom/tendcloud/tenddata/bu;->g:Ljava/util/List;

    goto :goto_0

    .line 12
    :cond_0
    iput-object p3, p0, Lcom/tendcloud/tenddata/bu;->g:Ljava/util/List;

    .line 13
    :goto_0
    iput-object p1, p0, Lcom/tendcloud/tenddata/bu;->d:Ljava/net/InetSocketAddress;

    .line 14
    iput-object p4, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    .line 15
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/bu;->k:Ljava/util/List;

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 17
    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/bu;->l:Ljava/util/concurrent/BlockingQueue;

    :goto_1
    if-ge v1, p2, :cond_1

    .line 18
    new-instance p1, Lcom/tendcloud/tenddata/bu$b;

    invoke-direct {p1, p0}, Lcom/tendcloud/tenddata/bu$b;-><init>(Lcom/tendcloud/tenddata/bu;)V

    .line 19
    iget-object p3, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void

    .line 21
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "address and connectionscontainer must not be null and you need at least 1 decoder"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/InetSocketAddress;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;)V"
        }
    .end annotation

    .line 4
    sget v0, Lcom/tendcloud/tenddata/bu;->a:I

    invoke-direct {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/bu;-><init>(Ljava/net/InetSocketAddress;ILjava/util/List;)V

    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/am;)V
    .locals 3

    .line 14
    iget-object v0, p1, Lcom/tendcloud/tenddata/am;->j:Lcom/tendcloud/tenddata/bu$b;

    if-nez v0, :cond_0

    .line 15
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    iget v1, p0, Lcom/tendcloud/tenddata/bu;->m:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bu$b;

    iput-object v0, p1, Lcom/tendcloud/tenddata/am;->j:Lcom/tendcloud/tenddata/bu$b;

    .line 16
    iget v0, p0, Lcom/tendcloud/tenddata/bu;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tendcloud/tenddata/bu;->m:I

    .line 17
    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/am;->j:Lcom/tendcloud/tenddata/bu$b;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/bu$b;->put(Lcom/tendcloud/tenddata/am;)V

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/bu;Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/bu;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private a(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->l:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->l:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/nio/channels/SelectionKey;Lcom/tendcloud/tenddata/aj;Ljava/io/IOException;)V
    .locals 1

    if-eqz p2, :cond_0

    const/16 p1, 0x3ee

    .line 20
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/tendcloud/tenddata/aj;->closeConnection(ILjava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 21
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 22
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 23
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :catch_0
    sget-boolean p1, Lcom/tendcloud/tenddata/am;->d:Z

    if-eqz p1, :cond_1

    .line 25
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Connection closed because of"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private b(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    const/4 p1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bu;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private e(Lcom/tendcloud/tenddata/aj;)Ljava/net/Socket;
    .locals 0

    .line 4
    check-cast p1, Lcom/tendcloud/tenddata/am;

    .line 5
    iget-object p1, p1, Lcom/tendcloud/tenddata/am;->f:Ljava/nio/channels/SelectionKey;

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    check-cast p1, Ljava/nio/channels/SocketChannel;

    invoke-virtual {p1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method private j()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->l:Ljava/util/concurrent/BlockingQueue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 8
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " can only be started once."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/tendcloud/tenddata/aj;)V
    .locals 1

    .line 11
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    if-lt p1, v0, :cond_0

    return-void

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 13
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->l:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bu;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 0

    .line 3
    return-void
.end method

.method public abstract a(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;)V
.end method

.method public abstract a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
.end method

.method public abstract a(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V
.end method

.method public a(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 4
    return-void
.end method

.method public a(Ljava/nio/channels/SelectionKey;)Z
    .locals 0

    .line 5
    const/4 p1, 0x1

    return p1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bu;->stop(I)V

    return-void
.end method

.method public b(Lcom/tendcloud/tenddata/aj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract b(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
.end method

.method public c()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/tendcloud/tenddata/aj;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    return-object v0
.end method

.method public c(Lcom/tendcloud/tenddata/aj;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    .line 4
    sget-boolean v1, Lcom/tendcloud/tenddata/bu;->b:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    return p1

    .line 8
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d()Ljava/net/InetSocketAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->d:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public d(Lcom/tendcloud/tenddata/aj;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    .line 5
    sget-boolean v1, Lcom/tendcloud/tenddata/bu;->b:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    monitor-exit v0

    return p1

    .line 7
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    const/16 v0, 0x3e9

    .line 8
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/aj;->close(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public e()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bu;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v0

    :cond_0
    return v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    sget v0, Lcom/tendcloud/tenddata/am;->c:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLocalSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bu;->e(Lcom/tendcloud/tenddata/aj;)Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/net/InetSocketAddress;

    .line 10
    .line 11
    return-object p1
.end method

.method public getRemoteSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/bu;->e(Lcom/tendcloud/tenddata/aj;)Ljava/net/Socket;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/net/InetSocketAddress;

    .line 10
    .line 11
    return-object p1
.end method

.method public h()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/bu;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "\" /></cross-domain-policy>"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final i()Lcom/tendcloud/tenddata/al;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->o:Lcom/tendcloud/tenddata/bu$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onWebsocketClose(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/bu;->c(Lcom/tendcloud/tenddata/aj;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p2

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 39
    .line 40
    .line 41
    :goto_2
    throw p2
.end method

.method public onWebsocketCloseInitiated(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onWebsocketClosing(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onWebsocketHandshakeReceivedAsServer(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/as;Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/br;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/ak;->onWebsocketHandshakeReceivedAsServer(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/as;Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/br;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V

    return-void
.end method

.method public final onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public onWebsocketMessageFragment(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onWebsocketOpen(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bo;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/bu;->d(Lcom/tendcloud/tenddata/aj;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p2, Lcom/tendcloud/tenddata/bj;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onWriteDemand(Lcom/tendcloud/tenddata/aj;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/am;->f:Ljava/nio/channels/SelectionKey;

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    invoke-virtual {v0, v1}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    iget-object p1, p1, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public run()V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 3
    .line 4
    if-nez v0, :cond_17

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto/16 :goto_16

    .line 24
    .line 25
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "WebsocketSelector"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    :try_start_1
    invoke-static {}, Ljava/nio/channels/ServerSocketChannel;->open()Ljava/nio/channels/ServerSocketChannel;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-virtual {v1, v2}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget v3, Lcom/tendcloud/tenddata/am;->c:I

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/net/ServerSocket;->setReceiveBufferSize(I)V

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lcom/tendcloud/tenddata/bu;->d:Ljava/net/InetSocketAddress;

    .line 77
    .line 78
    invoke-virtual {v1, v3}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 86
    .line 87
    iget-object v3, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/nio/channels/ServerSocketChannel;->validOps()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3, v1, v4}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_d

    .line 94
    .line 95
    .line 96
    :catch_0
    :cond_1
    :goto_0
    :try_start_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    .line 99
    .line 100
    .line 101
    move-result v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    if-nez v1, :cond_11

    .line 103
    .line 104
    :try_start_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/nio/channels/Selector;->select()I

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1
    :try_end_3
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    move-object v3, v0

    .line 120
    move-object v4, v3

    .line 121
    :goto_1
    :try_start_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_b

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    check-cast v5, Ljava/nio/channels/SelectionKey;
    :try_end_4
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_4 .. :try_end_4} :catch_b
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    .line 133
    :try_start_5
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_2

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/4 v6, 0x1

    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0, v5}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/channels/SelectionKey;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_3

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catchall_1
    move-exception v1

    .line 158
    goto/16 :goto_13

    .line 159
    .line 160
    :catch_1
    move-exception v1

    .line 161
    goto/16 :goto_10

    .line 162
    .line 163
    :catch_2
    move-exception v1

    .line 164
    :goto_2
    move-object v3, v5

    .line 165
    goto/16 :goto_d

    .line 166
    .line 167
    :cond_3
    iget-object v3, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3, v2}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 174
    .line 175
    .line 176
    iget-object v7, p0, Lcom/tendcloud/tenddata/bu;->o:Lcom/tendcloud/tenddata/bu$a;

    .line 177
    .line 178
    iget-object v8, p0, Lcom/tendcloud/tenddata/bu;->g:Ljava/util/List;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-interface {v7, p0, v8, v9}, Lcom/tendcloud/tenddata/bu$a;->createWebSocket(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    iget-object v8, p0, Lcom/tendcloud/tenddata/bu;->f:Ljava/nio/channels/Selector;

    .line 189
    .line 190
    invoke-virtual {v3, v8, v6, v7}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    iput-object v6, v7, Lcom/tendcloud/tenddata/am;->f:Ljava/nio/channels/SelectionKey;

    .line 195
    .line 196
    iget-object v8, p0, Lcom/tendcloud/tenddata/bu;->o:Lcom/tendcloud/tenddata/bu$a;

    .line 197
    .line 198
    invoke-interface {v8, v3, v6}, Lcom/tendcloud/tenddata/bu$a;->wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iput-object v3, v7, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, v7}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;)V

    .line 208
    .line 209
    .line 210
    :cond_4
    :goto_3
    move-object v3, v5

    .line 211
    goto :goto_1

    .line 212
    :cond_5
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_9

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lcom/tendcloud/tenddata/am;
    :try_end_5
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_5 .. :try_end_5} :catch_b
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 223
    .line 224
    :try_start_6
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bu;->j()Ljava/nio/ByteBuffer;

    .line 225
    .line 226
    .line 227
    move-result-object v4
    :try_end_6
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_6 .. :try_end_6} :catch_b
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 228
    :try_start_7
    iget-object v7, v3, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;

    .line 229
    .line 230
    invoke-static {v4, v3, v7}, Lcom/tendcloud/tenddata/ai;->a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/am;Ljava/nio/channels/ByteChannel;)Z

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    if-eqz v7, :cond_7

    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eqz v7, :cond_6

    .line 241
    .line 242
    iget-object v7, v3, Lcom/tendcloud/tenddata/am;->i:Ljava/util/concurrent/BlockingQueue;

    .line 243
    .line 244
    invoke-interface {v7, v4}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p0, v3}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/am;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 251
    .line 252
    .line 253
    iget-object v7, v3, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;

    .line 254
    .line 255
    instance-of v8, v7, Lcom/tendcloud/tenddata/ap;

    .line 256
    .line 257
    if-eqz v8, :cond_8

    .line 258
    .line 259
    check-cast v7, Lcom/tendcloud/tenddata/ap;

    .line 260
    .line 261
    invoke-interface {v7}, Lcom/tendcloud/tenddata/ap;->c()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_8

    .line 266
    .line 267
    iget-object v7, p0, Lcom/tendcloud/tenddata/bu;->k:Ljava/util/List;

    .line 268
    .line 269
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :catch_3
    move-exception v1

    .line 274
    goto :goto_5

    .line 275
    :cond_6
    invoke-direct {p0, v4}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_7
    invoke-direct {p0, v4}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 280
    .line 281
    .line 282
    :cond_8
    :goto_4
    move-object v4, v3

    .line 283
    goto :goto_6

    .line 284
    :goto_5
    :try_start_8
    invoke-direct {p0, v4}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V

    .line 285
    .line 286
    .line 287
    throw v1
    :try_end_8
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_8 .. :try_end_8} :catch_b
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 288
    :catch_4
    move-exception v1

    .line 289
    move-object v4, v3

    .line 290
    goto :goto_2

    .line 291
    :cond_9
    :goto_6
    :try_start_9
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_4

    .line 296
    .line 297
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    check-cast v3, Lcom/tendcloud/tenddata/am;
    :try_end_9
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_9 .. :try_end_9} :catch_b
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 302
    .line 303
    :try_start_a
    iget-object v4, v3, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;

    .line 304
    .line 305
    invoke-static {v3, v4}, Lcom/tendcloud/tenddata/ai;->a(Lcom/tendcloud/tenddata/am;Ljava/nio/channels/ByteChannel;)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_a

    .line 310
    .line 311
    invoke-virtual {v5}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_a

    .line 316
    .line 317
    invoke-virtual {v5, v6}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_a
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_a .. :try_end_a} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_a .. :try_end_a} :catch_b
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 318
    .line 319
    .line 320
    :cond_a
    move-object v4, v3

    .line 321
    goto :goto_3

    .line 322
    :catch_5
    move-exception v1

    .line 323
    goto/16 :goto_d

    .line 324
    .line 325
    :cond_b
    :goto_7
    :try_start_b
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->k:Ljava/util/List;

    .line 326
    .line 327
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-nez v1, :cond_1

    .line 332
    .line 333
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->k:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, Lcom/tendcloud/tenddata/am;
    :try_end_b
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_b .. :try_end_b} :catch_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 340
    .line 341
    :try_start_c
    iget-object v4, v1, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;

    .line 342
    .line 343
    check-cast v4, Lcom/tendcloud/tenddata/ap;

    .line 344
    .line 345
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bu;->j()Ljava/nio/ByteBuffer;

    .line 346
    .line 347
    .line 348
    move-result-object v5
    :try_end_c
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_c .. :try_end_c} :catch_b
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 349
    :try_start_d
    invoke-static {v5, v1, v4}, Lcom/tendcloud/tenddata/ai;->a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/am;Lcom/tendcloud/tenddata/ap;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_c

    .line 354
    .line 355
    iget-object v4, p0, Lcom/tendcloud/tenddata/bu;->k:Ljava/util/List;

    .line 356
    .line 357
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :catch_6
    move-exception v4

    .line 362
    goto :goto_a

    .line 363
    :cond_c
    :goto_8
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-eqz v4, :cond_d

    .line 368
    .line 369
    iget-object v4, v1, Lcom/tendcloud/tenddata/am;->i:Ljava/util/concurrent/BlockingQueue;

    .line 370
    .line 371
    invoke-interface {v4, v5}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/am;)V

    .line 375
    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_d
    invoke-direct {p0, v5}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_d .. :try_end_d} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 379
    .line 380
    .line 381
    :goto_9
    move-object v4, v1

    .line 382
    goto :goto_7

    .line 383
    :goto_a
    :try_start_e
    invoke-direct {p0, v5}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/ByteBuffer;)V

    .line 384
    .line 385
    .line 386
    throw v4
    :try_end_e
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_e .. :try_end_e} :catch_0
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 387
    :catch_7
    move-exception v4

    .line 388
    move-object v10, v4

    .line 389
    move-object v4, v1

    .line 390
    move-object v1, v10

    .line 391
    goto :goto_d

    .line 392
    :catch_8
    move-exception v1

    .line 393
    move-object v3, v0

    .line 394
    move-object v4, v3

    .line 395
    goto :goto_d

    .line 396
    :catch_9
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 397
    .line 398
    if-eqz v1, :cond_e

    .line 399
    .line 400
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_e

    .line 409
    .line 410
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    check-cast v2, Lcom/tendcloud/tenddata/bu$b;

    .line 415
    .line 416
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 417
    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_e
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 421
    .line 422
    if-eqz v1, :cond_14

    .line 423
    .line 424
    :goto_c
    :try_start_f
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 425
    .line 426
    .line 427
    goto/16 :goto_12

    .line 428
    .line 429
    :catch_a
    move-exception v1

    .line 430
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 431
    .line 432
    .line 433
    goto :goto_12

    .line 434
    :goto_d
    if-eqz v3, :cond_f

    .line 435
    .line 436
    :try_start_10
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 437
    .line 438
    .line 439
    :cond_f
    invoke-direct {p0, v3, v4, v1}, Lcom/tendcloud/tenddata/bu;->a(Ljava/nio/channels/SelectionKey;Lcom/tendcloud/tenddata/aj;Ljava/io/IOException;)V
    :try_end_10
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 440
    .line 441
    .line 442
    goto/16 :goto_0

    .line 443
    .line 444
    :catch_b
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 445
    .line 446
    if-eqz v1, :cond_10

    .line 447
    .line 448
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_10

    .line 457
    .line 458
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v2, Lcom/tendcloud/tenddata/bu$b;

    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 465
    .line 466
    .line 467
    goto :goto_e

    .line 468
    :cond_10
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 469
    .line 470
    if-eqz v1, :cond_14

    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_11
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 474
    .line 475
    if-eqz v1, :cond_12

    .line 476
    .line 477
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    if-eqz v2, :cond_12

    .line 486
    .line 487
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    check-cast v2, Lcom/tendcloud/tenddata/bu$b;

    .line 492
    .line 493
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 494
    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_12
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 498
    .line 499
    if-eqz v1, :cond_14

    .line 500
    .line 501
    goto :goto_c

    .line 502
    :goto_10
    :try_start_11
    invoke-direct {p0, v0, v1}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 503
    .line 504
    .line 505
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 506
    .line 507
    if-eqz v1, :cond_13

    .line 508
    .line 509
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_13

    .line 518
    .line 519
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    check-cast v2, Lcom/tendcloud/tenddata/bu$b;

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 526
    .line 527
    .line 528
    goto :goto_11

    .line 529
    :cond_13
    iget-object v1, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 530
    .line 531
    if-eqz v1, :cond_14

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :cond_14
    :goto_12
    return-void

    .line 535
    :goto_13
    iget-object v2, p0, Lcom/tendcloud/tenddata/bu;->j:Ljava/util/List;

    .line 536
    .line 537
    if-eqz v2, :cond_15

    .line 538
    .line 539
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-eqz v3, :cond_15

    .line 548
    .line 549
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    check-cast v3, Lcom/tendcloud/tenddata/bu$b;

    .line 554
    .line 555
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 556
    .line 557
    .line 558
    goto :goto_14

    .line 559
    :cond_15
    iget-object v2, p0, Lcom/tendcloud/tenddata/bu;->e:Ljava/nio/channels/ServerSocketChannel;

    .line 560
    .line 561
    if-eqz v2, :cond_16

    .line 562
    .line 563
    :try_start_12
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_c

    .line 564
    .line 565
    .line 566
    goto :goto_15

    .line 567
    :catch_c
    move-exception v2

    .line 568
    invoke-virtual {p0, v0, v2}, Lcom/tendcloud/tenddata/bu;->a(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 569
    .line 570
    .line 571
    :cond_16
    :goto_15
    throw v1

    .line 572
    :catch_d
    move-exception v1

    .line 573
    invoke-direct {p0, v0, v1}, Lcom/tendcloud/tenddata/bu;->b(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :cond_17
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 578
    .line 579
    new-instance v1, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const-string v2, " can only be started once."

    .line 596
    .line 597
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    throw v0

    .line 608
    :goto_16
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 609
    throw v0
.end method

.method public final setWebSocketFactory(Lcom/tendcloud/tenddata/bu$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bu;->o:Lcom/tendcloud/tenddata/bu$a;

    .line 2
    .line 3
    return-void
.end method

.method public stop(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/tendcloud/tenddata/bu;->c:Ljava/util/Collection;

    .line 18
    .line 19
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :goto_0
    if-ge v2, v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    check-cast v3, Lcom/tendcloud/tenddata/aj;

    .line 36
    .line 37
    const/16 v4, 0x3e9

    .line 38
    .line 39
    invoke-interface {v3, v4}, Lcom/tendcloud/tenddata/aj;->close(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    monitor-enter p0

    .line 44
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eq v0, v2, :cond_3

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 66
    .line 67
    int-to-long v1, p1

    .line 68
    invoke-virtual {v0, v1, v2}, Ljava/lang/Thread;->join(J)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/tendcloud/tenddata/bu;->h:Ljava/lang/Thread;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Thread;->join()V

    .line 82
    .line 83
    .line 84
    :cond_3
    monitor-exit p0

    .line 85
    return-void

    .line 86
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p1

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    throw p1
.end method
