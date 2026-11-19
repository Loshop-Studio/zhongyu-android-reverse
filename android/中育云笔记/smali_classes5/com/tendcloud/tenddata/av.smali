.class public Lcom/tendcloud/tenddata/av;
.super Lcom/tendcloud/tenddata/as;
.source "SourceFile"


# static fields
.field public static final f:B = 0xdt

.field public static final g:B = 0xat

.field public static final h:B = 0x0t

.field public static final i:B = -0x1t


# instance fields
.field protected j:Z

.field protected k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation
.end field

.field protected l:Ljava/nio/ByteBuffer;

.field private final m:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/as;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/av;->j:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    .line 13
    .line 14
    new-instance v0, Ljava/util/Random;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/tendcloud/tenddata/av;->m:Ljava/util/Random;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;
    .locals 1

    .line 2
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 4
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)Lcom/tendcloud/tenddata/as$b;
    .locals 1

    .line 1
    const-string v0, "WebSocket-Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Origin"

    invoke-interface {p2, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;
    .locals 3

    .line 23
    const-string v0, "WebSocket"

    const-string v1, "Upgrade"

    invoke-interface {p1, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string v0, "Connection"

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "random"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tendcloud/tenddata/av;->m:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/bl;
    .locals 2

    .line 27
    const-string v0, "Web Socket Protocol Handshake"

    invoke-interface {p2, v0}, Lcom/tendcloud/tenddata/br;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 28
    const-string v0, "Upgrade"

    const-string v1, "WebSocket"

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "Connection"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebSocket-Origin"

    invoke-interface {p2, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ws://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Host"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/tendcloud/tenddata/bj;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    const-string v0, "WebSocket-Location"

    invoke-interface {p2, v0, p1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;
    .locals 2

    .line 5
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->f()Lcom/tendcloud/tenddata/bh$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    if-ne v0, v1, :cond_0

    .line 6
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 9
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 10
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 11
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    const/4 p1, -0x1

    .line 12
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 13
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "only text frames supported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation

    .line 16
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bi;-><init>()V

    .line 17
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    .line 18
    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setFin(Z)V

    .line 19
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 20
    invoke-interface {v0, p2}, Lcom/tendcloud/tenddata/bg;->setTransferemasked(Z)V

    .line 21
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 22
    new-instance p2, Lcom/tendcloud/tenddata/bc;

    invoke-direct {p2, p1}, Lcom/tendcloud/tenddata/bc;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public a(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation

    .line 15
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "not yet implemented"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/av;->j:Z

    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public b()Lcom/tendcloud/tenddata/as$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/as$a;->NONE:Lcom/tendcloud/tenddata/as$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 3
    new-instance v0, Lcom/tendcloud/tenddata/av;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/av;-><init>()V

    return-object v0
.end method

.method public c(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/av;->e(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const/16 v0, 0x3ea

    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/ay;-><init>(I)V

    throw p1
.end method

.method public e()Ljava/nio/ByteBuffer;
    .locals 1

    .line 26
    sget v0, Lcom/tendcloud/tenddata/as;->b:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/av;->j:Z

    if-nez v0, :cond_0

    .line 4
    iput-boolean v1, p0, Lcom/tendcloud/tenddata/av;->j:Z

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/az;

    const-string v0, "unexpected START_OF_FRAME"

    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_4

    .line 6
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/av;->j:Z

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 9
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bi;-><init>()V

    .line 10
    iget-object v2, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Lcom/tendcloud/tenddata/bi;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 11
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/bi;->setFin(Z)V

    .line 12
    sget-object v1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/bi;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    iput-object v3, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    .line 15
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    :cond_2
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/av;->j:Z

    goto :goto_0

    .line 17
    :cond_3
    new-instance p1, Lcom/tendcloud/tenddata/az;

    const-string v0, "unexpected END_OF_FRAME"

    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_4
    iget-boolean v1, p0, Lcom/tendcloud/tenddata/av;->j:Z

    if-eqz v1, :cond_7

    .line 19
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_5

    .line 20
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/av;->e()Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 21
    :cond_5
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_6

    .line 22
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/av;->f(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    .line 23
    :cond_6
    :goto_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_7
    return-object v3

    .line 24
    :cond_8
    iget-object p1, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    return-object p1
.end method

.method public f(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    mul-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/as;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
