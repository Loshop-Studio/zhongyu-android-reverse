.class public Lcom/tendcloud/tenddata/bf;
.super Lcom/tendcloud/tenddata/bi;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/be;


# static fields
.field static final p:Ljava/nio/ByteBuffer;


# instance fields
.field private q:I

.field private r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/bf;->p:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bh$a;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bi;->setFin(Z)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bh$a;)V

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bi;->setFin(Z)V

    .line 5
    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/tendcloud/tenddata/bf;->a(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bh$a;)V

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/bi;->setFin(Z)V

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/bf;->a(ILjava/lang/String;)V

    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, ""

    if-nez p2, :cond_0

    move-object p2, v0

    :cond_0
    const/16 v1, 0x3f7

    const/16 v2, 0x3ed

    if-ne p1, v1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    if-ne p1, v2, :cond_3

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-gtz p1, :cond_2

    return-void

    .line 3
    :cond_2
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const/16 p2, 0x3ea

    const-string v0, "A close frame must have a closecode if it has a reason"

    invoke-direct {p1, p2, v0}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1

    .line 4
    :cond_3
    invoke-static {v0}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    move-result-object p2

    const/4 v0, 0x4

    .line 5
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    const/4 p1, 0x2

    .line 7
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    array-length v1, p2

    add-int/2addr v1, p1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 9
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 10
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 11
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 12
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/bf;->setPayload(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private g()V
    .locals 4

    .line 1
    const/16 v0, 0x3ed

    .line 2
    .line 3
    iput v0, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 4
    .line 5
    invoke-super {p0}, Lcom/tendcloud/tenddata/bi;->c()Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x2

    .line 17
    if-lt v2, v3, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iput v2, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 43
    .line 44
    const/16 v3, 0x3ee

    .line 45
    .line 46
    if-eq v2, v3, :cond_0

    .line 47
    .line 48
    const/16 v3, 0x3f7

    .line 49
    .line 50
    if-eq v2, v3, :cond_0

    .line 51
    .line 52
    if-eq v2, v0, :cond_0

    .line 53
    .line 54
    const/16 v0, 0x1387

    .line 55
    .line 56
    if-gt v2, v0, :cond_0

    .line 57
    .line 58
    const/16 v0, 0x3e8

    .line 59
    .line 60
    if-lt v2, v0, :cond_0

    .line 61
    .line 62
    const/16 v0, 0x3ec

    .line 63
    .line 64
    if-eq v2, v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    new-instance v0, Lcom/tendcloud/tenddata/az;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v2, "closecode must not be sent over the wire: "

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v2, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private h()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 2
    .line 3
    const/16 v1, 0x3ed

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Lcom/tendcloud/tenddata/bi;->c()Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/tendcloud/tenddata/bw;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/tendcloud/tenddata/bf;->r:Ljava/lang/String;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-super {p0}, Lcom/tendcloud/tenddata/bi;->c()Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/tendcloud/tenddata/bw;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lcom/tendcloud/tenddata/bf;->r:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v2

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v2

    .line 48
    :try_start_1
    new-instance v3, Lcom/tendcloud/tenddata/az;

    .line 49
    .line 50
    invoke-direct {v3, v2}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :goto_0
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 55
    .line 56
    .line 57
    throw v2
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/tendcloud/tenddata/bf;->q:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bf;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 2
    .line 3
    const/16 v1, 0x3ed

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/bf;->p:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-super {p0}, Lcom/tendcloud/tenddata/bi;->c()Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public setPayload(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/tendcloud/tenddata/bi;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bf;->g()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bf;->h()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/tendcloud/tenddata/bi;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "code: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/tendcloud/tenddata/bf;->q:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
