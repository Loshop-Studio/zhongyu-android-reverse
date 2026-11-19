.class public Lcom/alibaba/sdk/android/tbrest/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private d:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->a:[B

    .line 6
    .line 7
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->i:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p3, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->d:Z

    .line 12
    .line 13
    return-void
.end method

.method public static a([B[B)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "HmacSHA1"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 2
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 3
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 4
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->toHexString([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a()[B
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->a:[B

    if-nez v0, :cond_0

    const/16 v0, 0x20

    .line 7
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    .line 8
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/RC4;->rc4([B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->a:[B

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->a:[B

    return-object v0

    :array_0
    .array-data 1
        0x42t
        0x25t
        0x2at
        -0x77t
        0x76t
        -0x68t
        -0x1et
        0x4t
        -0x5ft
        0xft
        -0x1at
        -0xct
        -0x4bt
        -0x66t
        0x47t
        0x17t
        -0x3t
        -0x78t
        -0x1t
        -0x39t
        0x2at
        0x63t
        -0x10t
        -0x65t
        0x67t
        -0x4at
        0x5dt
        -0x72t
        0x70t
        -0x1at
        -0x18t
        -0x18t
    .end array-data
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->h:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->i:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    :try_start_0
    iget-boolean v1, p0, Lcom/alibaba/sdk/android/tbrest/a/a;->d:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, Lcom/alibaba/sdk/android/tbrest/a/a;->a([B[B)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_2
    invoke-direct {p0}, Lcom/alibaba/sdk/android/tbrest/a/a;->a()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v0, p1}, Lcom/alibaba/sdk/android/tbrest/a/a;->a([B[B)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return-object p1

    .line 44
    :catch_0
    const-string p1, ""

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    :goto_0
    const-string p1, "There is no appkey,please check it!"

    .line 48
    .line 49
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method
