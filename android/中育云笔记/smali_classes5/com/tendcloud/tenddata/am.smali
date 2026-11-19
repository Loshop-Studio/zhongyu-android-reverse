.class public Lcom/tendcloud/tenddata/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/aj;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation


# static fields
.field public static c:I = 0x4000

.field public static d:Z = false

.field public static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;"
        }
    .end annotation
.end field

.field static final synthetic k:Z = true


# instance fields
.field public f:Ljava/nio/channels/SelectionKey;

.field public g:Ljava/nio/channels/ByteChannel;

.field public final h:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public volatile j:Lcom/tendcloud/tenddata/bu$b;

.field private volatile l:Z

.field private m:Lcom/tendcloud/tenddata/aj$a;

.field private final n:Lcom/tendcloud/tenddata/an;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/tendcloud/tenddata/as;

.field private q:Lcom/tendcloud/tenddata/aj$b;

.field private r:Lcom/tendcloud/tenddata/bh$a;

.field private s:Ljava/nio/ByteBuffer;

.field private t:Lcom/tendcloud/tenddata/bj;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/Integer;

.field private w:Ljava/lang/Boolean;

.field private x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/am;->e:Ljava/util/List;

    .line 8
    .line 9
    new-instance v1, Lcom/tendcloud/tenddata/au;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/tendcloud/tenddata/au;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Lcom/tendcloud/tenddata/at;

    .line 18
    .line 19
    invoke-direct {v1}, Lcom/tendcloud/tenddata/at;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    new-instance v1, Lcom/tendcloud/tenddata/aw;

    .line 26
    .line 27
    invoke-direct {v1}, Lcom/tendcloud/tenddata/aw;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/tendcloud/tenddata/av;

    .line 34
    .line 35
    invoke-direct {v1}, Lcom/tendcloud/tenddata/av;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    .line 8
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->NOT_YET_CONNECTED:Lcom/tendcloud/tenddata/aj$a;

    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 10
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    .line 11
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 12
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    .line 13
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->u:Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->v:Ljava/lang/Integer;

    .line 15
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->w:Ljava/lang/Boolean;

    .line 16
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->x:Ljava/lang/String;

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    .line 17
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    sget-object v1, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;

    if-eq v0, v1, :cond_2

    .line 18
    :cond_0
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    .line 19
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->i:Ljava/util/concurrent/BlockingQueue;

    .line 20
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 21
    sget-object p1, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    if-eqz p2, :cond_1

    .line 22
    invoke-virtual {p2}, Lcom/tendcloud/tenddata/as;->c()Lcom/tendcloud/tenddata/as;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    :cond_1
    return-void

    .line 23
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "parameters must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;)V

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/an;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/an;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;)V

    .line 2
    sget-object p1, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    if-eqz p2, :cond_1

    .line 3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/tendcloud/tenddata/am;->o:Ljava/util/List;

    return-void

    .line 5
    :cond_1
    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/am;->e:Ljava/util/List;

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->o:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/an;Ljava/util/List;Ljava/net/Socket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/an;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;",
            "Ljava/net/Socket;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/bo;)V
    .locals 3

    .line 96
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->d:Z

    if-eqz v0, :cond_0

    .line 97
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open using draft: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 98
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/aj$a;->OPEN:Lcom/tendcloud/tenddata/aj$a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketOpen(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bo;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 100
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    return-void
.end method

.method private a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;)V"
        }
    .end annotation

    .line 90
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bh;

    .line 92
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/am;->sendFrame(Lcom/tendcloud/tenddata/bh;)V

    goto :goto_0

    :cond_0
    return-void

    .line 93
    :cond_1
    new-instance p1, Lcom/tendcloud/tenddata/bd;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/bd;-><init>()V

    throw p1
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;)V"
        }
    .end annotation

    .line 94
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 95
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/am;->d(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Ljava/nio/ByteBuffer;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 5
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 8
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    const/4 v3, 0x1

    if-nez v2, :cond_2

    .line 12
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/am;->c(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/as$b;

    move-result-object v2

    .line 13
    sget-object v4, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v2, v4, :cond_2

    .line 14
    :try_start_1
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v2, p0}, Lcom/tendcloud/tenddata/an;->getFlashPolicy(Lcom/tendcloud/tenddata/aj;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/am;->d(Ljava/nio/ByteBuffer;)V

    .line 15
    const-string v2, ""

    const/4 v4, -0x3

    invoke-virtual {p0, v4, v2}, Lcom/tendcloud/tenddata/am;->close(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    goto/16 :goto_7

    .line 16
    :catch_1
    :try_start_2
    const-string v2, "remote peer closed connection before flashpolicy could be transmitted"

    const/16 v4, 0x3ee

    invoke-direct {p0, v4, v2, v3}, Lcom/tendcloud/tenddata/am;->c(ILjava/lang/String;Z)V
    :try_end_2
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    return v1

    .line 17
    :cond_2
    :try_start_3
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    sget-object v4, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;
    :try_end_3
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_3 .. :try_end_3} :catch_5
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_3 .. :try_end_3} :catch_0

    const/4 v5, -0x1

    const-string v6, "wrong http function"

    const/16 v7, 0x3ea

    if-ne v2, v4, :cond_a

    .line 18
    :try_start_4
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    if-nez v2, :cond_7

    .line 19
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_2
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tendcloud/tenddata/as;

    .line 20
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/as;->c()Lcom/tendcloud/tenddata/as;

    move-result-object v4
    :try_end_4
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_4 .. :try_end_4} :catch_0

    .line 21
    :try_start_5
    iget-object v8, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    invoke-virtual {v4, v8}, Lcom/tendcloud/tenddata/as;->setParseMode(Lcom/tendcloud/tenddata/aj$b;)V

    .line 22
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 23
    invoke-virtual {v4, v0}, Lcom/tendcloud/tenddata/as;->d(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bo;

    move-result-object v8

    .line 24
    instance-of v9, v8, Lcom/tendcloud/tenddata/bj;

    if-nez v9, :cond_4

    .line 25
    invoke-virtual {p0, v7, v6, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 26
    :cond_4
    check-cast v8, Lcom/tendcloud/tenddata/bj;

    .line 27
    invoke-virtual {v4, v8}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;

    move-result-object v9

    .line 28
    sget-object v10, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    if-ne v9, v10, :cond_3

    .line 29
    invoke-interface {v8}, Lcom/tendcloud/tenddata/bj;->a()Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Lcom/tendcloud/tenddata/am;->x:Ljava/lang/String;
    :try_end_5
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_5 .. :try_end_5} :catch_0

    .line 30
    :try_start_6
    iget-object v9, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v9, p0, v4, v8}, Lcom/tendcloud/tenddata/an;->onWebsocketHandshakeReceivedAsServer(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/as;Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/br;

    move-result-object v9
    :try_end_6
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3

    .line 31
    :try_start_7
    invoke-virtual {v4, v8, v9}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/bl;

    move-result-object v9

    iget-object v10, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    invoke-virtual {v4, v9, v10}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;Lcom/tendcloud/tenddata/aj$b;)Ljava/util/List;

    move-result-object v9

    invoke-direct {p0, v9}, Lcom/tendcloud/tenddata/am;->a(Ljava/util/List;)V

    .line 32
    iput-object v4, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 33
    invoke-direct {p0, v8}, Lcom/tendcloud/tenddata/am;->a(Lcom/tendcloud/tenddata/bo;)V

    return v3

    :catch_3
    move-exception v4

    goto :goto_2

    :catch_4
    move-exception v4

    goto :goto_3

    .line 34
    :goto_2
    iget-object v8, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v8, p0, v4}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 35
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v5, v4, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 36
    :goto_3
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/ay;->a()I

    move-result v8

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v8, v4, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V
    :try_end_7
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_7 .. :try_end_7} :catch_0

    return v1

    :catch_5
    move-exception v2

    goto/16 :goto_6

    .line 37
    :cond_5
    :try_start_8
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    if-nez v2, :cond_6

    .line 38
    const-string v2, "no draft matches"

    invoke-virtual {p0, v7, v2}, Lcom/tendcloud/tenddata/am;->close(ILjava/lang/String;)V

    :cond_6
    return v1

    .line 39
    :cond_7
    invoke-virtual {v2, v0}, Lcom/tendcloud/tenddata/as;->d(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bo;

    move-result-object v2

    .line 40
    instance-of v4, v2, Lcom/tendcloud/tenddata/bj;

    if-nez v4, :cond_8

    .line 41
    invoke-virtual {p0, v7, v6, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 42
    :cond_8
    check-cast v2, Lcom/tendcloud/tenddata/bj;

    .line 43
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v4, v2}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;

    move-result-object v4

    .line 44
    sget-object v5, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    if-ne v4, v5, :cond_9

    .line 45
    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Lcom/tendcloud/tenddata/bo;)V

    return v3

    .line 46
    :cond_9
    const-string v2, "the handshake did finaly not match"

    invoke-virtual {p0, v7, v2}, Lcom/tendcloud/tenddata/am;->close(ILjava/lang/String;)V

    return v1

    .line 47
    :cond_a
    sget-object v4, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    if-ne v2, v4, :cond_11

    .line 48
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v4, v2}, Lcom/tendcloud/tenddata/as;->setParseMode(Lcom/tendcloud/tenddata/aj$b;)V

    .line 49
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v2, v0}, Lcom/tendcloud/tenddata/as;->d(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bo;

    move-result-object v2

    .line 50
    instance-of v4, v2, Lcom/tendcloud/tenddata/bq;

    if-nez v4, :cond_b

    .line 51
    invoke-virtual {p0, v7, v6, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 52
    :cond_b
    check-cast v2, Lcom/tendcloud/tenddata/bq;

    .line 53
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    iget-object v6, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    invoke-virtual {v4, v6, v2}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)Lcom/tendcloud/tenddata/as$b;

    move-result-object v4

    .line 54
    sget-object v6, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;
    :try_end_8
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_8 .. :try_end_8} :catch_5
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_8 .. :try_end_8} :catch_0

    if-ne v4, v6, :cond_c

    .line 55
    :try_start_9
    iget-object v4, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    iget-object v6, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    invoke-interface {v4, p0, v6, v2}, Lcom/tendcloud/tenddata/an;->onWebsocketHandshakeReceivedAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)V
    :try_end_9
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_6

    .line 56
    :try_start_a
    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/am;->a(Lcom/tendcloud/tenddata/bo;)V

    return v3

    :catch_6
    move-exception v2

    goto :goto_4

    :catch_7
    move-exception v2

    goto :goto_5

    .line 57
    :goto_4
    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v3, p0, v2}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 58
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v5, v2, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 59
    :goto_5
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/ay;->a()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v3, v2, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return v1

    .line 60
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "draft "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " refuses handshake"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v7, v2}, Lcom/tendcloud/tenddata/am;->close(ILjava/lang/String;)V
    :try_end_a
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_a .. :try_end_a} :catch_5
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_a .. :try_end_a} :catch_0

    goto :goto_9

    .line 61
    :goto_6
    :try_start_b
    invoke-virtual {p0, v2}, Lcom/tendcloud/tenddata/am;->close(Lcom/tendcloud/tenddata/ay;)V
    :try_end_b
    .catch Lcom/tendcloud/tenddata/ax; {:try_start_b .. :try_end_b} :catch_0

    goto :goto_9

    .line 62
    :goto_7
    iget-object v3, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    if-nez v3, :cond_10

    .line 63
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 64
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/ax;->a()I

    move-result v3

    if-nez v3, :cond_d

    .line 65
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    add-int/lit8 v3, v0, 0x10

    goto :goto_8

    .line 66
    :cond_d
    sget-boolean v4, Lcom/tendcloud/tenddata/am;->k:Z

    if-nez v4, :cond_f

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/ax;->a()I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lt v2, v0, :cond_e

    goto :goto_8

    :cond_e
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 67
    :cond_f
    :goto_8
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 68
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_9

    .line 69
    :cond_10
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 70
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_11
    :goto_9
    return v1
.end method

.method private b(Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/as;->c(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tendcloud/tenddata/bh;

    .line 3
    sget-boolean v1, Lcom/tendcloud/tenddata/am;->d:Z

    if-eqz v1, :cond_0

    .line 4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "matched frame: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_5

    .line 5
    :cond_0
    :goto_1
    invoke-interface {v0}, Lcom/tendcloud/tenddata/bh;->f()Lcom/tendcloud/tenddata/bh$a;

    move-result-object v1

    .line 6
    invoke-interface {v0}, Lcom/tendcloud/tenddata/bh;->d()Z

    move-result v2

    .line 7
    sget-object v3, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    if-ne v1, v3, :cond_4

    .line 8
    const-string v1, ""

    .line 9
    instance-of v2, v0, Lcom/tendcloud/tenddata/be;

    if-eqz v2, :cond_1

    .line 10
    check-cast v0, Lcom/tendcloud/tenddata/be;

    .line 11
    invoke-interface {v0}, Lcom/tendcloud/tenddata/be;->a()I

    move-result v1

    .line 12
    invoke-interface {v0}, Lcom/tendcloud/tenddata/be;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_1
    const/16 v0, 0x3ed

    move-object v5, v1

    move v1, v0

    move-object v0, v5

    .line 13
    :goto_2
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    sget-object v3, Lcom/tendcloud/tenddata/aj$a;->CLOSING:Lcom/tendcloud/tenddata/aj$a;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    .line 14
    invoke-virtual {p0, v1, v0, v4}, Lcom/tendcloud/tenddata/am;->a(ILjava/lang/String;Z)V

    goto :goto_0

    .line 15
    :cond_2
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v2}, Lcom/tendcloud/tenddata/as;->b()Lcom/tendcloud/tenddata/as$a;

    move-result-object v2

    sget-object v3, Lcom/tendcloud/tenddata/as$a;->TWOWAY:Lcom/tendcloud/tenddata/as$a;

    if-ne v2, v3, :cond_3

    .line 16
    invoke-direct {p0, v1, v0, v4}, Lcom/tendcloud/tenddata/am;->c(ILjava/lang/String;Z)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, v1, v0, v2}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    goto :goto_0

    .line 18
    :cond_4
    sget-object v3, Lcom/tendcloud/tenddata/bh$a;->PING:Lcom/tendcloud/tenddata/bh$a;

    if-ne v1, v3, :cond_5

    .line 19
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketPing(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V

    goto :goto_0

    .line 20
    :cond_5
    sget-object v3, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    if-ne v1, v3, :cond_6

    .line 21
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketPong(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V

    goto :goto_0

    :cond_6
    const/16 v3, 0x3ea

    if-eqz v2, :cond_b

    .line 22
    sget-object v4, Lcom/tendcloud/tenddata/bh$a;->CONTINUOUS:Lcom/tendcloud/tenddata/bh$a;

    if-ne v1, v4, :cond_7

    goto :goto_3

    .line 23
    :cond_7
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    if-nez v2, :cond_a

    .line 24
    sget-object v2, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v1, v2, :cond_8

    .line 25
    :try_start_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/bw;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    .line 26
    :try_start_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 27
    :cond_8
    sget-object v2, Lcom/tendcloud/tenddata/bh$a;->BINARY:Lcom/tendcloud/tenddata/bh$a;
    :try_end_2
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_2 .. :try_end_2} :catch_0

    if-ne v1, v2, :cond_9

    .line 28
    :try_start_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    :catch_2
    move-exception v0

    .line 29
    :try_start_4
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 30
    :cond_9
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const-string v0, "non control or continious frame expected"

    invoke-direct {p1, v3, v0}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1

    .line 31
    :cond_a
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const-string v0, "Continuous frame sequence not completed."

    invoke-direct {p1, v3, v0}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1

    .line 32
    :cond_b
    :goto_3
    sget-object v4, Lcom/tendcloud/tenddata/bh$a;->CONTINUOUS:Lcom/tendcloud/tenddata/bh$a;

    if-eq v1, v4, :cond_d

    .line 33
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    if-nez v2, :cond_c

    .line 34
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    goto :goto_4

    .line 35
    :cond_c
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const-string v0, "Previous continuous frame sequence not completed."

    invoke-direct {p1, v3, v0}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_4
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_4 .. :try_end_4} :catch_0

    .line 36
    :cond_d
    const-string v1, "Continuous frame sequence was not started."

    if-eqz v2, :cond_f

    .line 37
    :try_start_5
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    if-eqz v2, :cond_e

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;

    goto :goto_4

    .line 39
    :cond_e
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    invoke-direct {p1, v3, v1}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1

    .line 40
    :cond_f
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->r:Lcom/tendcloud/tenddata/bh$a;
    :try_end_5
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_5 .. :try_end_5} :catch_0

    if-eqz v2, :cond_10

    .line 41
    :goto_4
    :try_start_6
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketMessageFragment(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_0

    :catch_3
    move-exception v0

    .line 42
    :try_start_7
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 43
    :cond_10
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    invoke-direct {p1, v3, v1}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_7
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_7 .. :try_end_7} :catch_0

    :cond_11
    return-void

    .line 44
    :goto_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 45
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/am;->close(Lcom/tendcloud/tenddata/ay;)V

    return-void
.end method

.method private c(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/as$b;
    .locals 3

    .line 19
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 20
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    sget-object v1, Lcom/tendcloud/tenddata/as;->c:[B

    array-length v2, v1

    if-le v0, v2, :cond_0

    .line 21
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    array-length v2, v1

    if-lt v0, v2, :cond_3

    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 24
    sget-object v1, Lcom/tendcloud/tenddata/as;->c:[B

    aget-byte v1, v1, v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    if-eq v1, v2, :cond_1

    .line 25
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 26
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 27
    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 28
    :cond_3
    new-instance p1, Lcom/tendcloud/tenddata/ax;

    array-length v0, v1

    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/ax;-><init>(I)V

    throw p1
.end method

.method private c(ILjava/lang/String;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CLOSING:Lcom/tendcloud/tenddata/aj$a;

    if-eq v0, v1, :cond_a

    sget-object v2, Lcom/tendcloud/tenddata/aj$a;->CLOSED:Lcom/tendcloud/tenddata/aj$a;

    if-eq v0, v2, :cond_a

    .line 2
    sget-object v2, Lcom/tendcloud/tenddata/aj$a;->OPEN:Lcom/tendcloud/tenddata/aj$a;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_5

    const/16 v0, 0x3ee

    if-ne p1, v0, :cond_2

    .line 3
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->k:Z

    if-nez v0, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 4
    :cond_1
    :goto_0
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 5
    invoke-virtual {p0, p1, p2, v3}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    return-void

    .line 6
    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/as;->b()Lcom/tendcloud/tenddata/as$a;

    move-result-object v1

    sget-object v2, Lcom/tendcloud/tenddata/as$a;->NONE:Lcom/tendcloud/tenddata/as$a;

    if-eq v1, v2, :cond_4

    if-nez p3, :cond_3

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, p1, p2}, Lcom/tendcloud/tenddata/an;->onWebsocketCloseInitiated(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 8
    :try_start_1
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v2, p0, v1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 9
    :cond_3
    :goto_1
    new-instance v1, Lcom/tendcloud/tenddata/bf;

    invoke-direct {v1, p1, p2}, Lcom/tendcloud/tenddata/bf;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/am;->sendFrame(Lcom/tendcloud/tenddata/bh;)V
    :try_end_1
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 10
    :goto_2
    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v2, p0, v1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 11
    const-string v1, "generated frame is invalid"

    invoke-virtual {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    .line 12
    :cond_4
    :goto_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    goto :goto_5

    :cond_5
    const/4 v0, -0x3

    if-ne p1, v0, :cond_8

    .line 13
    sget-boolean v1, Lcom/tendcloud/tenddata/am;->k:Z

    if-nez v1, :cond_7

    if-eqz p3, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_7
    :goto_4
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p0, v0, p2, v1}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    goto :goto_5

    :cond_8
    const/4 v0, -0x1

    .line 15
    invoke-virtual {p0, v0, p2, v3}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    :goto_5
    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_9

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/am;->b(ILjava/lang/String;Z)V

    .line 17
    :cond_9
    sget-object p1, Lcom/tendcloud/tenddata/aj$a;->CLOSING:Lcom/tendcloud/tenddata/aj$a;

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    :cond_a
    return-void
.end method

.method private d(Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "write("

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, "): {"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x3e8

    .line 34
    .line 35
    if-le v2, v3, :cond_0

    .line 36
    .line 37
    const-string v2, "too big to display"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v2, "}"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    .line 65
    .line 66
    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 70
    .line 71
    invoke-interface {p1, p0}, Lcom/tendcloud/tenddata/an;->onWriteDemand(Lcom/tendcloud/tenddata/aj;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->w:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->v:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->u:Ljava/lang/String;

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->w:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/am;->a(ILjava/lang/String;Z)V

    return-void

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "this method must be used in conjuction with flushAndClose"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public declared-synchronized a(ILjava/lang/String;Z)V
    .locals 2

    monitor-enter p0

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CLOSED:Lcom/tendcloud/tenddata/aj$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    .line 72
    monitor-exit p0

    return-void

    .line 73
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->f:Ljava/nio/channels/SelectionKey;

    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->cancel()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 75
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->g:Ljava/nio/channels/ByteChannel;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 76
    :try_start_2
    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 77
    :try_start_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    :cond_2
    :goto_1
    :try_start_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/an;->onWebsocketClose(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catch_1
    move-exception p1

    .line 79
    :try_start_5
    iget-object p2, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 80
    :goto_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    if-eqz p1, :cond_3

    .line 81
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/as;->a()V

    :cond_3
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    .line 83
    sget-object p1, Lcom/tendcloud/tenddata/aj$a;->CLOSED:Lcom/tendcloud/tenddata/aj$a;

    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 84
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1}, Ljava/util/Collection;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 85
    monitor-exit p0

    return-void

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public a(IZ)V
    .locals 1

    .line 86
    const-string v0, ""

    invoke-virtual {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/am;->a(ILjava/lang/String;Z)V

    return-void
.end method

.method public b()V
    .locals 5

    .line 59
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->getReadyState()Lcom/tendcloud/tenddata/aj$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->NOT_YET_CONNECTED:Lcom/tendcloud/tenddata/aj$a;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    .line 60
    invoke-virtual {p0, v0, v2}, Lcom/tendcloud/tenddata/am;->a(IZ)V

    return-void

    .line 61
    :cond_0
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    if-eqz v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->v:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->u:Ljava/lang/String;

    iget-object v2, p0, Lcom/tendcloud/tenddata/am;->w:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/am;->a(ILjava/lang/String;Z)V

    return-void

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/as;->b()Lcom/tendcloud/tenddata/as$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/as$a;->NONE:Lcom/tendcloud/tenddata/as$a;

    const/16 v3, 0x3e8

    if-ne v0, v1, :cond_2

    .line 64
    invoke-virtual {p0, v3, v2}, Lcom/tendcloud/tenddata/am;->a(IZ)V

    return-void

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/as;->b()Lcom/tendcloud/tenddata/as$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/as$a;->ONEWAY:Lcom/tendcloud/tenddata/as$a;

    const/16 v4, 0x3ee

    if-ne v0, v1, :cond_4

    .line 66
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    sget-object v1, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;

    if-ne v0, v1, :cond_3

    .line 67
    invoke-virtual {p0, v4, v2}, Lcom/tendcloud/tenddata/am;->a(IZ)V

    return-void

    .line 68
    :cond_3
    invoke-virtual {p0, v3, v2}, Lcom/tendcloud/tenddata/am;->a(IZ)V

    return-void

    .line 69
    :cond_4
    invoke-virtual {p0, v4, v2}, Lcom/tendcloud/tenddata/am;->a(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public declared-synchronized b(ILjava/lang/String;Z)V
    .locals 1

    monitor-enter p0

    .line 46
    :try_start_0
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 47
    monitor-exit p0

    return-void

    .line 48
    :cond_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->v:Ljava/lang/Integer;

    .line 49
    iput-object p2, p0, Lcom/tendcloud/tenddata/am;->u:Ljava/lang/String;

    .line 50
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/tendcloud/tenddata/am;->w:Ljava/lang/Boolean;

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    .line 52
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0}, Lcom/tendcloud/tenddata/an;->onWriteDemand(Lcom/tendcloud/tenddata/aj;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/an;->onWebsocketClosing(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 54
    :try_start_3
    iget-object p2, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    invoke-interface {p2, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 55
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    if-eqz p1, :cond_1

    .line 56
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/as;->a()V

    :cond_1
    const/4 p1, 0x0

    .line 57
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :catchall_0
    monitor-exit p0

    return-void
.end method

.method public close()V
    .locals 1

    const/16 v0, 0x3e8

    .line 4
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/am;->close(I)V

    return-void
.end method

.method public close(I)V
    .locals 2

    .line 2
    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/tendcloud/tenddata/am;->c(ILjava/lang/String;Z)V

    return-void
.end method

.method public close(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/am;->c(ILjava/lang/String;Z)V

    return-void
.end method

.method public close(Lcom/tendcloud/tenddata/ay;)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/ay;->a()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/am;->c(ILjava/lang/String;Z)V

    return-void
.end method

.method public closeConnection(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/am;->a(ILjava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public decode(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    sget-boolean v1, Lcom/tendcloud/tenddata/am;->d:Z

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "process("

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, "): {"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/16 v4, 0x3e8

    .line 51
    .line 52
    if-le v3, v4, :cond_2

    .line 53
    .line 54
    const-string v3, "too big to display"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    new-instance v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-direct {v3, v4, v5, v6}, Ljava/lang/String;-><init>([BII)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, "}"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 90
    .line 91
    sget-object v2, Lcom/tendcloud/tenddata/aj$a;->NOT_YET_CONNECTED:Lcom/tendcloud/tenddata/aj$a;

    .line 92
    .line 93
    if-eq v1, v2, :cond_4

    .line 94
    .line 95
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->b(Ljava/nio/ByteBuffer;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->a(Ljava/nio/ByteBuffer;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    if-nez v0, :cond_6

    .line 106
    .line 107
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-ne v1, v2, :cond_6

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    .line 127
    .line 128
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_6
    :goto_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->b(Ljava/nio/ByteBuffer;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->s:Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/am;->b(Ljava/nio/ByteBuffer;)V

    .line 153
    .line 154
    .line 155
    :cond_8
    :goto_3
    if-nez v0, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->isClosing()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_a

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/am;->isFlushAndClose()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_a

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-nez p1, :cond_9

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    new-instance p1, Ljava/lang/AssertionError;

    .line 177
    .line 178
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 179
    .line 180
    .line 181
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    :catchall_0
    :cond_a
    :goto_4
    return-void
.end method

.method public getDraft()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLocalSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lcom/tendcloud/tenddata/an;->getLocalSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getReadyState()Lcom/tendcloud/tenddata/aj$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemoteSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lcom/tendcloud/tenddata/an;->getRemoteSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getResourceDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->x:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasBufferedData()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->h:Ljava/util/concurrent/BlockingQueue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public isClosed()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CLOSED:Lcom/tendcloud/tenddata/aj$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public isClosing()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CLOSING:Lcom/tendcloud/tenddata/aj$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public isConnecting()Z
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 10
    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CONNECTING:Lcom/tendcloud/tenddata/aj$a;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 23
    .line 24
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->CONNECTING:Lcom/tendcloud/tenddata/aj$a;

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public isFlushAndClose()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public isOpen()Z
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 6
    .line 7
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->OPEN:Lcom/tendcloud/tenddata/aj$a;

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/am;->l:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 23
    .line 24
    sget-object v1, Lcom/tendcloud/tenddata/aj$a;->OPEN:Lcom/tendcloud/tenddata/aj$a;

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public send(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    sget-object v2, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/tendcloud/tenddata/as;->a(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->a(Ljava/util/Collection;)V

    return-void

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot send \'null\' data to a WebSocketImpl."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public send(Ljava/nio/ByteBuffer;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    sget-object v2, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/tendcloud/tenddata/as;->a(Ljava/nio/ByteBuffer;Z)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->a(Ljava/util/Collection;)V

    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot send \'null\' data to a WebSocketImpl."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public send([B)V
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/am;->send(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public sendFragmentedFrame(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->a(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public sendFrame(Lcom/tendcloud/tenddata/bh;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "send frame: "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->d(Ljava/nio/ByteBuffer;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public startHandshake(Lcom/tendcloud/tenddata/bk;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/am;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->m:Lcom/tendcloud/tenddata/aj$a;

    .line 6
    .line 7
    sget-object v2, Lcom/tendcloud/tenddata/aj$a;->CONNECTING:Lcom/tendcloud/tenddata/aj$a;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 13
    .line 14
    const-string v0, "shall only be called once"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bj;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/tendcloud/tenddata/am;->x:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_3
    :goto_1
    :try_start_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    .line 48
    .line 49
    invoke-interface {p1, p0, v0}, Lcom/tendcloud/tenddata/an;->onWebsocketHandshakeSentAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;)V
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/tendcloud/tenddata/am;->p:Lcom/tendcloud/tenddata/as;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->t:Lcom/tendcloud/tenddata/bj;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/tendcloud/tenddata/am;->q:Lcom/tendcloud/tenddata/aj$b;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;Lcom/tendcloud/tenddata/aj$b;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/am;->a(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catch_0
    move-exception p1

    .line 67
    iget-object v0, p0, Lcom/tendcloud/tenddata/am;->n:Lcom/tendcloud/tenddata/an;

    .line 68
    .line 69
    invoke-interface {v0, p0, p1}, Lcom/tendcloud/tenddata/an;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lcom/tendcloud/tenddata/ba;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v2, "rejected because of"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v0, p1}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :catch_1
    new-instance p1, Lcom/tendcloud/tenddata/ba;

    .line 96
    .line 97
    const-string v0, "Handshake data rejected by client."

    .line 98
    .line 99
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
