.class public Lcom/tendcloud/tenddata/aw;
.super Lcom/tendcloud/tenddata/av;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UseValueOf"
    }
.end annotation


# static fields
.field private static final n:[B


# instance fields
.field private m:Z

.field private final o:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/aw;->n:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        -0x1t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/av;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tendcloud/tenddata/aw;->m:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/Random;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/aw;->o:Ljava/util/Random;

    .line 13
    .line 14
    return-void
.end method

.method private static a(Ljava/lang/String;)[B
    .locals 7

    .line 22
    :try_start_0
    const-string v0, "[^0-9]"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 23
    const-string v2, " "

    invoke-virtual {p0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p0, p0

    const/4 v2, 0x1

    sub-int/2addr p0, v2

    int-to-long v3, p0

    const-wide/16 v5, 0x0

    cmp-long p0, v3, v5

    if-eqz p0, :cond_0

    .line 24
    new-instance p0, Ljava/lang/Long;

    div-long/2addr v0, v3

    invoke-direct {p0, v0, v1}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/16 p0, 0x18

    shr-long v3, v0, p0

    long-to-int v3, v3

    int-to-byte v3, v3

    const/16 v4, 0x8

    shl-long v4, v0, v4

    shr-long/2addr v4, p0

    long-to-int v4, v4

    int-to-byte v4, v4

    const/16 v5, 0x10

    shl-long v5, v0, v5

    shr-long/2addr v5, p0

    long-to-int v5, v5

    int-to-byte v5, v5

    shl-long/2addr v0, p0

    shr-long/2addr v0, p0

    long-to-int p0, v0

    int-to-byte p0, p0

    const/4 v0, 0x4

    .line 25
    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v3, v0, v1

    aput-byte v4, v0, v2

    const/4 v1, 0x2

    aput-byte v5, v0, v1

    const/4 v1, 0x3

    aput-byte p0, v0, v1

    return-object v0

    .line 26
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    const-string v0, "invalid Sec-WebSocket-Key (/key2/)"

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :catch_0
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    const-string v0, "invalid Sec-WebSocket-Key (/key1/ or /key2/)"

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[B)[B
    .locals 24

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/tendcloud/tenddata/aw;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 2
    invoke-static/range {p1 .. p1}, Lcom/tendcloud/tenddata/aw;->a(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    aget-byte v3, v0, v2

    const/4 v4, 0x1

    .line 4
    aget-byte v5, v0, v4

    const/4 v6, 0x2

    .line 5
    aget-byte v7, v0, v6

    const/4 v8, 0x3

    .line 6
    aget-byte v0, v0, v8

    .line 7
    aget-byte v9, v1, v2

    .line 8
    aget-byte v10, v1, v4

    .line 9
    aget-byte v11, v1, v6

    .line 10
    aget-byte v1, v1, v8

    .line 11
    aget-byte v12, p2, v2

    .line 12
    aget-byte v13, p2, v4

    .line 13
    aget-byte v14, p2, v6

    .line 14
    aget-byte v15, p2, v8

    const/16 v16, 0x4

    .line 15
    aget-byte v17, p2, v16

    const/16 v18, 0x5

    .line 16
    aget-byte v19, p2, v18

    const/16 v20, 0x6

    .line 17
    aget-byte v21, p2, v20

    const/16 v22, 0x7

    .line 18
    aget-byte v23, p2, v22

    move/from16 p0, v2

    const/16 v2, 0x10

    new-array v2, v2, [B

    aput-byte v3, v2, p0

    aput-byte v5, v2, v4

    aput-byte v7, v2, v6

    aput-byte v0, v2, v8

    aput-byte v9, v2, v16

    aput-byte v10, v2, v18

    aput-byte v11, v2, v20

    aput-byte v1, v2, v22

    const/16 v0, 0x8

    aput-byte v12, v2, v0

    const/16 v0, 0x9

    aput-byte v13, v2, v0

    const/16 v0, 0xa

    aput-byte v14, v2, v0

    const/16 v0, 0xb

    aput-byte v15, v2, v0

    const/16 v0, 0xc

    aput-byte v17, v2, v0

    const/16 v0, 0xd

    aput-byte v19, v2, v0

    const/16 v0, 0xe

    aput-byte v21, v2, v0

    const/16 v0, 0xf

    aput-byte v23, v2, v0

    .line 19
    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 21
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static f()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    int-to-long v2, v2

    .line 15
    new-instance v4, Ljava/lang/Long;

    .line 16
    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    div-long/2addr v5, v2

    .line 23
    invoke-direct {v4, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Long;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    int-to-long v4, v4

    .line 41
    mul-long/2addr v4, v2

    .line 42
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    move v6, v5

    .line 54
    :goto_0
    if-ge v6, v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-virtual {v0, v7}, Ljava/util/Random;->nextInt(I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const/16 v8, 0x5f

    .line 69
    .line 70
    invoke-virtual {v0, v8}, Ljava/util/Random;->nextInt(I)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    add-int/lit8 v8, v8, 0x21

    .line 75
    .line 76
    int-to-char v8, v8

    .line 77
    const/16 v9, 0x30

    .line 78
    .line 79
    if-lt v8, v9, :cond_0

    .line 80
    .line 81
    const/16 v9, 0x39

    .line 82
    .line 83
    if-gt v8, v9, :cond_0

    .line 84
    .line 85
    add-int/lit8 v8, v8, -0xf

    .line 86
    .line 87
    int-to-char v8, v8

    .line 88
    :cond_0
    new-instance v9, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    add-int/lit8 v6, v6, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    :goto_1
    int-to-long v6, v5

    .line 105
    cmp-long v1, v6, v2

    .line 106
    .line 107
    if-gez v1, :cond_2

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    add-int/lit8 v1, v1, -0x1

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    new-instance v6, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v4, " "

    .line 131
    .line 132
    invoke-virtual {v6, v1, v4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    return-object v4
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;
    .locals 3

    .line 39
    const-string v0, "Upgrade"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "WebSocket"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Connection"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Sec-WebSocket-Key1"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Sec-WebSocket-Key2"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 40
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 41
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)Lcom/tendcloud/tenddata/as$b;
    .locals 2

    .line 28
    iget-boolean v0, p0, Lcom/tendcloud/tenddata/aw;->m:Z

    if-eqz v0, :cond_0

    .line 29
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 30
    :cond_0
    :try_start_0
    const-string v0, "Sec-WebSocket-Origin"

    invoke-interface {p2, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Origin"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {p2}, Lcom/tendcloud/tenddata/bo;->d()[B

    move-result-object p2

    if-eqz p2, :cond_3

    .line 32
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 33
    const-string v0, "Sec-WebSocket-Key1"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Sec-WebSocket-Key2"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/tendcloud/tenddata/bo;->d()[B

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/tendcloud/tenddata/aw;->a(Ljava/lang/String;Ljava/lang/String;[B)[B

    move-result-object p1

    invoke-static {p2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 34
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    .line 35
    :cond_2
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;

    return-object p1

    .line 36
    :cond_3
    new-instance p1, Lcom/tendcloud/tenddata/ax;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/ax;-><init>()V

    throw p1

    .line 37
    :cond_4
    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/as$b;->NOT_MATCHED:Lcom/tendcloud/tenddata/as$b;
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ba; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 38
    :goto_1
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "bad handshakerequest"

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;
    .locals 3

    .line 42
    const-string v0, "WebSocket"

    const-string v1, "Upgrade"

    invoke-interface {p1, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "Connection"

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "Sec-WebSocket-Key1"

    invoke-static {}, Lcom/tendcloud/tenddata/aw;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "Sec-WebSocket-Key2"

    invoke-static {}, Lcom/tendcloud/tenddata/aw;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "random"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tendcloud/tenddata/aw;->o:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/16 v0, 0x8

    .line 48
    new-array v0, v0, [B

    .line 49
    iget-object v1, p0, Lcom/tendcloud/tenddata/aw;->o:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 50
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bl;->setContent([B)V

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/bl;
    .locals 4

    .line 51
    const-string v0, "WebSocket Protocol Handshake"

    invoke-interface {p2, v0}, Lcom/tendcloud/tenddata/br;->setHttpStatusMessage(Ljava/lang/String;)V

    .line 52
    const-string v0, "Upgrade"

    const-string v1, "WebSocket"

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "Connection"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "Origin"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Sec-WebSocket-Origin"

    invoke-interface {p2, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ws://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Host"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/tendcloud/tenddata/bj;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 56
    const-string v1, "Sec-WebSocket-Location"

    invoke-interface {p2, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "Sec-WebSocket-Key1"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    const-string v1, "Sec-WebSocket-Key2"

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bo;->d()[B

    move-result-object p1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 60
    array-length v2, p1

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    .line 61
    invoke-static {v0, v1, p1}, Lcom/tendcloud/tenddata/aw;->a(Ljava/lang/String;Ljava/lang/String;[B)[B

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/tendcloud/tenddata/bl;->setContent([B)V

    return-object p2

    .line 62
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ba;

    const-string p2, "Bad keys"

    invoke-direct {p1, p2}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;
    .locals 2

    .line 63
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bh;->f()Lcom/tendcloud/tenddata/bh$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/bh$a;->CLOSING:Lcom/tendcloud/tenddata/bh$a;

    if-ne v0, v1, :cond_0

    .line 64
    sget-object p1, Lcom/tendcloud/tenddata/aw;->n:[B

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    .line 65
    :cond_0
    invoke-super {p0, p1}, Lcom/tendcloud/tenddata/av;->a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/tendcloud/tenddata/as$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/as$a;->ONEWAY:Lcom/tendcloud/tenddata/as$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 17
    new-instance v0, Lcom/tendcloud/tenddata/aw;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/aw;-><init>()V

    return-object v0
.end method

.method public c(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 3
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
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 2
    invoke-super {p0, p1}, Lcom/tendcloud/tenddata/av;->e(Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    .line 3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lcom/tendcloud/tenddata/av;->j:Z

    .line 6
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_3

    const/4 v1, 0x2

    .line 7
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    .line 8
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget-object v2, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-gt v1, v2, :cond_2

    .line 9
    iget-object v1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 10
    iget-object p1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p1

    if-nez p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/tendcloud/tenddata/av;->l:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    sget-object v1, Lcom/tendcloud/tenddata/aw;->n:[B

    invoke-static {p1, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 12
    new-instance p1, Lcom/tendcloud/tenddata/bf;

    const/16 v1, 0x3e8

    invoke-direct {p1, v1}, Lcom/tendcloud/tenddata/bf;-><init>(I)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 13
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/az;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/az;-><init>()V

    throw p1

    .line 14
    :cond_1
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/av;->k:Ljava/util/List;

    return-object v0

    .line 15
    :cond_2
    new-instance p1, Lcom/tendcloud/tenddata/az;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/az;-><init>()V

    throw p1

    .line 16
    :cond_3
    new-instance p1, Lcom/tendcloud/tenddata/az;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/az;-><init>()V

    throw p1

    :cond_4
    return-object v0
.end method

.method public d(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bo;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/as;->a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/aj$b;)Lcom/tendcloud/tenddata/bl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Sec-WebSocket-Key1"

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    .line 16
    .line 17
    sget-object v2, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    .line 18
    .line 19
    if-ne v1, v2, :cond_2

    .line 20
    .line 21
    :cond_0
    const-string v1, "Sec-WebSocket-Version"

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/tendcloud/tenddata/bo;->b(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    .line 30
    .line 31
    sget-object v2, Lcom/tendcloud/tenddata/aj$b;->SERVER:Lcom/tendcloud/tenddata/aj$b;

    .line 32
    .line 33
    const/16 v3, 0x10

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v1, v3

    .line 41
    :goto_0
    new-array v1, v1, [B

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Lcom/tendcloud/tenddata/bl;->setContent([B)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :catch_0
    new-instance v0, Lcom/tendcloud/tenddata/ax;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/2addr p1, v3

    .line 57
    invoke-direct {v0, p1}, Lcom/tendcloud/tenddata/ax;-><init>(I)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    return-object v0
.end method
