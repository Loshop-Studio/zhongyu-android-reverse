.class public Lcom/tendcloud/tenddata/at;
.super Lcom/tendcloud/tenddata/as;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert",
        "UseValueOf"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/at$a;
    }
.end annotation


# static fields
.field static final synthetic f:Z = true


# instance fields
.field private g:Ljava/nio/ByteBuffer;

.field private h:Lcom/tendcloud/tenddata/bh;

.field private final i:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/as;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/at;->h:Lcom/tendcloud/tenddata/bh;

    .line 6
    .line 7
    new-instance v0, Ljava/util/Random;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/at;->i:Ljava/util/Random;

    .line 13
    .line 14
    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/bh$a;)B
    .locals 3

    .line 49
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CONTINUOUS:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 50
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 51
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->BINARY:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    return p1

    .line 52
    :cond_2
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x8

    return p1

    .line 53
    :cond_3
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->PING:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_4

    const/16 p1, 0x9

    return p1

    .line 54
    :cond_4
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    if-ne p1, v0, :cond_5

    const/16 p1, 0xa

    return p1

    .line 55
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Don\'t know how to handle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(B)Lcom/tendcloud/tenddata/bh$a;
    .locals 3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 75
    new-instance v0, Lcom/tendcloud/tenddata/az;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknow optcode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-short p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :pswitch_0
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    .line 77
    :pswitch_1
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->PING:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    .line 78
    :pswitch_2
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    .line 79
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->BINARY:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    .line 80
    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    .line 81
    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->CONTINUOUS:Lcom/tendcloud/tenddata/bh$a;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 58
    :try_start_0
    const-string v0, "SHA1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/bv;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 60
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private a(JI)[B
    .locals 5

    .line 73
    new-array v0, p3, [B

    mul-int/lit8 v1, p3, 0x8

    add-int/lit8 v1, v1, -0x8

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_0

    mul-int/lit8 v3, v2, 0x8

    sub-int v3, v1, v3

    ushr-long v3, p1, v3

    long-to-int v3, v3

    int-to-byte v3, v3

    .line 74
    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static b(Lcom/tendcloud/tenddata/bo;)I
    .locals 2

    .line 1
    const-string v0, "Sec-WebSocket-Version"

    invoke-interface {p0, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, -0x1

    if-lez v0, :cond_0

    .line 3
    :try_start_0
    new-instance v0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    return v1
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;
    .locals 2

    .line 9
    invoke-static {p1}, Lcom/tendcloud/tenddata/at;->b(Lcom/tendcloud/tenddata/bo;)I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)Lcom/tendcloud/tenddata/as$b;
    .locals 3

    .line 1
    const-string v0, "Sec-WebSocket-Key"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Sec-WebSocket-Accept"

    invoke-interface {p2, v1}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {p2, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/at;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 7
    :cond_1
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 8
    :cond_2
    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;
    .locals 2

    .line 61
    const-string v0, "websocket"

    const-string v1, "Upgrade"

    invoke-interface {p1, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "Connection"

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "Sec-WebSocket-Version"

    const-string v1, "8"

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x10

    .line 64
    new-array v0, v0, [B

    .line 65
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->i:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 66
    const-string v1, "Sec-WebSocket-Key"

    invoke-static {v0}, Lcom/tendcloud/tenddata/bv;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/bl;
    .locals 2

    .line 67
    const-string v0, "Upgrade"

    const-string v1, "websocket"

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, "Connection"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "Switching Protocols"

    invoke-interface {p2, v0}, Lcom/tendcloud/tenddata/br;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 70
    const-string v0, "Sec-WebSocket-Key"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 71
    const-string v0, "Sec-WebSocket-Accept"

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/at;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 72
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ba;

    const-string p2, "missing Sec-WebSocket-Key"

    invoke-direct {p1, p2}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;
    .locals 13

    .line 12
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    sget-object v2, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    const/16 v5, 0x7d

    const/16 v6, 0x8

    const/4 v7, 0x2

    if-gt v2, v5, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    const v5, 0xffff

    if-gt v2, v5, :cond_2

    move v2, v7

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    if-le v2, v3, :cond_3

    add-int/lit8 v5, v2, 0x1

    goto :goto_2

    :cond_3
    move v5, v2

    :goto_2
    add-int/2addr v5, v3

    const/4 v8, 0x4

    if-eqz v1, :cond_4

    move v9, v8

    goto :goto_3

    :cond_4
    move v9, v4

    :goto_3
    add-int/2addr v5, v9

    .line 15
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v9

    add-int/2addr v5, v9

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 16
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->f()Lcom/tendcloud/tenddata/bh$a;

    move-result-object v9

    invoke-direct {p0, v9}, Lcom/tendcloud/tenddata/at;->a(Lcom/tendcloud/tenddata/bh$a;)B

    move-result v9

    .line 17
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->d()Z

    move-result p1

    const/16 v10, -0x80

    if-eqz p1, :cond_5

    move p1, v10

    goto :goto_4

    :cond_5
    move p1, v4

    :goto_4
    int-to-byte p1, p1

    or-int/2addr p1, v9

    int-to-byte p1, p1

    .line 18
    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    int-to-long v11, p1

    invoke-direct {p0, v11, v12, v2}, Lcom/tendcloud/tenddata/at;->a(JI)[B

    move-result-object p1

    .line 20
    sget-boolean v9, Lcom/tendcloud/tenddata/at;->f:Z

    if-nez v9, :cond_7

    array-length v9, p1

    if-ne v9, v2, :cond_6

    goto :goto_5

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_7
    :goto_5
    if-ne v2, v3, :cond_9

    .line 21
    aget-byte p1, p1, v4

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    move v10, v4

    :goto_6
    or-int/2addr p1, v10

    int-to-byte p1, p1

    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_9

    :cond_9
    if-ne v2, v7, :cond_b

    if-eqz v1, :cond_a

    goto :goto_7

    :cond_a
    move v10, v4

    :goto_7
    or-int/lit8 v2, v10, 0x7e

    int-to-byte v2, v2

    .line 22
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 23
    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_9

    :cond_b
    if-ne v2, v6, :cond_11

    if-eqz v1, :cond_c

    goto :goto_8

    :cond_c
    move v10, v4

    :goto_8
    or-int/lit8 v2, v10, 0x7f

    int-to-byte v2, v2

    .line 24
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 25
    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_9
    if-eqz v1, :cond_d

    .line 26
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 27
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->i:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 29
    :goto_a
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 30
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    rem-int/lit8 v2, v4, 0x4

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/2addr v4, v3

    goto :goto_a

    .line 31
    :cond_d
    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 32
    :cond_e
    sget-boolean p1, Lcom/tendcloud/tenddata/at;->f:Z

    if-nez p1, :cond_10

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    if-nez p1, :cond_f

    goto :goto_b

    :cond_f
    new-instance p1, Ljava/lang/AssertionError;

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(I)V

    throw p1

    .line 33
    :cond_10
    :goto_b
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object v5

    .line 34
    :cond_11
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Size representation not supported/specified"

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

    .line 42
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bi;-><init>()V

    .line 43
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    .line 44
    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setFin(Z)V

    .line 45
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 46
    invoke-interface {v0, p2}, Lcom/tendcloud/tenddata/bg;->setTransferemasked(Z)V

    .line 47
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 48
    new-instance p2, Lcom/tendcloud/tenddata/bc;

    invoke-direct {p2, p1}, Lcom/tendcloud/tenddata/bc;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public a(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 1
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

    .line 35
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bi;-><init>()V

    .line 36
    :try_start_0
    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    .line 37
    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setFin(Z)V

    .line 38
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->BINARY:Lcom/tendcloud/tenddata/bh$a;

    invoke-interface {v0, p1}, Lcom/tendcloud/tenddata/bg;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 39
    invoke-interface {v0, p2}, Lcom/tendcloud/tenddata/bg;->setTransferemasked(Z)V

    .line 40
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 41
    new-instance p2, Lcom/tendcloud/tenddata/bc;

    invoke-direct {p2, p1}, Lcom/tendcloud/tenddata/bc;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public b()Lcom/tendcloud/tenddata/as$a;
    .locals 1

    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/as$a;->TWOWAY:Lcom/tendcloud/tenddata/as$a;

    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 29
    new-instance v0, Lcom/tendcloud/tenddata/at;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/at;-><init>()V

    return-object v0
.end method

.method public c(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 5
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
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_3

    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 4
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 5
    iget-object v2, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-le v2, v1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {v0, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 7
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-virtual {v1, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 11
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/at;->e(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bh;

    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Lcom/tendcloud/tenddata/at$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 14
    :goto_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 15
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/at$a;->getPreferedSize()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/as;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 16
    sget-boolean v1, Lcom/tendcloud/tenddata/at;->f:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    iget-object v2, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 17
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 18
    iget-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    iput-object v0, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    .line 20
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/at;->c(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 21
    :cond_3
    :goto_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 22
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 23
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/at;->e(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bh;

    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lcom/tendcloud/tenddata/at$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 25
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 26
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/at$a;->getPreferedSize()I

    move-result v1

    .line 27
    invoke-virtual {p0, v1}, Lcom/tendcloud/tenddata/as;->a(I)I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/at;->g:Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_4
    return-object v0
.end method

.method public e(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bh;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-lt v0, v1, :cond_11

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    shr-int/lit8 v3, v2, 0x8

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move v3, v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v4

    .line 21
    :goto_0
    and-int/lit8 v6, v2, 0x7f

    .line 22
    .line 23
    const/4 v7, 0x4

    .line 24
    shr-int/2addr v6, v7

    .line 25
    int-to-byte v6, v6

    .line 26
    if-nez v6, :cond_10

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    and-int/lit8 v8, v6, -0x80

    .line 33
    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    move v8, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v8, v4

    .line 39
    :goto_1
    and-int/lit8 v6, v6, 0x7f

    .line 40
    .line 41
    int-to-byte v6, v6

    .line 42
    and-int/lit8 v2, v2, 0xf

    .line 43
    .line 44
    int-to-byte v2, v2

    .line 45
    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/at;->a(B)Lcom/tendcloud/tenddata/bh$a;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->PING:Lcom/tendcloud/tenddata/bh$a;

    .line 52
    .line 53
    if-eq v2, v9, :cond_2

    .line 54
    .line 55
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    .line 56
    .line 57
    if-eq v2, v9, :cond_2

    .line 58
    .line 59
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    .line 60
    .line 61
    if-eq v2, v9, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    new-instance p1, Lcom/tendcloud/tenddata/az;

    .line 65
    .line 66
    const-string v0, "control frames may no be fragmented"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_3
    :goto_2
    if-ltz v6, :cond_4

    .line 73
    .line 74
    const/16 v9, 0x7d

    .line 75
    .line 76
    if-gt v6, v9, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->PING:Lcom/tendcloud/tenddata/bh$a;

    .line 80
    .line 81
    if-eq v2, v9, :cond_f

    .line 82
    .line 83
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    .line 84
    .line 85
    if-eq v2, v9, :cond_f

    .line 86
    .line 87
    sget-object v9, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    .line 88
    .line 89
    if-eq v2, v9, :cond_f

    .line 90
    .line 91
    const/16 v9, 0x7e

    .line 92
    .line 93
    if-ne v6, v9, :cond_6

    .line 94
    .line 95
    if-lt v0, v7, :cond_5

    .line 96
    .line 97
    const/4 v6, 0x3

    .line 98
    new-array v6, v6, [B

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    aput-byte v9, v6, v5

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    aput-byte v5, v6, v1

    .line 111
    .line 112
    new-instance v1, Ljava/math/BigInteger;

    .line 113
    .line 114
    invoke-direct {v1, v6}, Ljava/math/BigInteger;-><init>([B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    move v1, v7

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    new-instance p1, Lcom/tendcloud/tenddata/at$a;

    .line 124
    .line 125
    invoke-direct {p1, p0, v7}, Lcom/tendcloud/tenddata/at$a;-><init>(Lcom/tendcloud/tenddata/at;I)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_6
    const/16 v1, 0xa

    .line 130
    .line 131
    if-lt v0, v1, :cond_e

    .line 132
    .line 133
    const/16 v5, 0x8

    .line 134
    .line 135
    new-array v6, v5, [B

    .line 136
    .line 137
    move v9, v4

    .line 138
    :goto_3
    if-ge v9, v5, :cond_7

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    aput-byte v10, v6, v9

    .line 145
    .line 146
    add-int/lit8 v9, v9, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    new-instance v5, Ljava/math/BigInteger;

    .line 150
    .line 151
    invoke-direct {v5, v6}, Ljava/math/BigInteger;-><init>([B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/math/BigInteger;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide v5

    .line 158
    const-wide/32 v9, 0x7fffffff

    .line 159
    .line 160
    .line 161
    cmp-long v9, v5, v9

    .line 162
    .line 163
    if-gtz v9, :cond_d

    .line 164
    .line 165
    long-to-int v6, v5

    .line 166
    :goto_4
    if-eqz v8, :cond_8

    .line 167
    .line 168
    move v5, v7

    .line 169
    goto :goto_5

    .line 170
    :cond_8
    move v5, v4

    .line 171
    :goto_5
    add-int/2addr v1, v5

    .line 172
    add-int/2addr v1, v6

    .line 173
    if-lt v0, v1, :cond_c

    .line 174
    .line 175
    invoke-virtual {p0, v6}, Lcom/tendcloud/tenddata/as;->a(I)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    new-array v1, v7, [B

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    .line 190
    :goto_6
    if-ge v4, v6, :cond_a

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    rem-int/lit8 v7, v4, 0x4

    .line 197
    .line 198
    aget-byte v7, v1, v7

    .line 199
    .line 200
    xor-int/2addr v5, v7

    .line 201
    int-to-byte v5, v5

    .line 202
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 203
    .line 204
    .line 205
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_9
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    add-int/2addr v1, v4

    .line 232
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 233
    .line 234
    .line 235
    :cond_a
    sget-object p1, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    .line 236
    .line 237
    if-ne v2, p1, :cond_b

    .line 238
    .line 239
    new-instance p1, Lcom/tendcloud/tenddata/bf;

    .line 240
    .line 241
    invoke-direct {p1}, Lcom/tendcloud/tenddata/bf;-><init>()V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_b
    new-instance p1, Lcom/tendcloud/tenddata/bi;

    .line 246
    .line 247
    invoke-direct {p1}, Lcom/tendcloud/tenddata/bi;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-interface {p1, v3}, Lcom/tendcloud/tenddata/bg;->setFin(Z)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p1, v2}, Lcom/tendcloud/tenddata/bg;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 254
    .line 255
    .line 256
    :goto_7
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 257
    .line 258
    .line 259
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bg;->setPayload(Ljava/nio/ByteBuffer;)V

    .line 260
    .line 261
    .line 262
    return-object p1

    .line 263
    :cond_c
    new-instance p1, Lcom/tendcloud/tenddata/at$a;

    .line 264
    .line 265
    invoke-direct {p1, p0, v1}, Lcom/tendcloud/tenddata/at$a;-><init>(Lcom/tendcloud/tenddata/at;I)V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_d
    new-instance p1, Lcom/tendcloud/tenddata/bb;

    .line 270
    .line 271
    const-string v0, "Payloadsize is to big..."

    .line 272
    .line 273
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/bb;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p1

    .line 277
    :cond_e
    new-instance p1, Lcom/tendcloud/tenddata/at$a;

    .line 278
    .line 279
    invoke-direct {p1, p0, v1}, Lcom/tendcloud/tenddata/at$a;-><init>(Lcom/tendcloud/tenddata/at;I)V

    .line 280
    .line 281
    .line 282
    throw p1

    .line 283
    :cond_f
    new-instance p1, Lcom/tendcloud/tenddata/az;

    .line 284
    .line 285
    const-string v0, "more than 125 octets"

    .line 286
    .line 287
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw p1

    .line 291
    :cond_10
    new-instance p1, Lcom/tendcloud/tenddata/az;

    .line 292
    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    const-string v1, "bad rsv "

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/az;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p1

    .line 314
    :cond_11
    new-instance p1, Lcom/tendcloud/tenddata/at$a;

    .line 315
    .line 316
    invoke-direct {p1, p0, v1}, Lcom/tendcloud/tenddata/at$a;-><init>(Lcom/tendcloud/tenddata/at;I)V

    .line 317
    .line 318
    .line 319
    throw p1
.end method
