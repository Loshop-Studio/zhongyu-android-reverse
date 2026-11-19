.class public Lcom/ta/utdid2/device/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ta/utdid2/device/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/ta/utdid2/device/c;

.field private static b:Ljava/util/regex/Pattern;

.field private static final d:Ljava/lang/Object;

.field private static f:I

.field private static final i:Ljava/lang/String;

.field private static j:Ljava/lang/String;


# instance fields
.field private a:Ll2/c;

.field private e:Ljava/lang/String;

.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "[^0-9a-zA-Z=/+]+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/ta/utdid2/device/c;->b:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/ta/utdid2/device/c;->d:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, ".UTSystemConfig"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "Global"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lcom/ta/utdid2/device/c;->i:Ljava/lang/String;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    sput v0, Lcom/ta/utdid2/device/c;->f:I

    .line 44
    .line 45
    const-string v0, ""

    .line 46
    .line 47
    sput-object v0, Lcom/ta/utdid2/device/c;->j:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/ta/utdid2/device/c;->mContext:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {}, Le2/a;->b()Le2/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Le2/a;->e(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ll2/c;

    .line 19
    .line 20
    sget-object v1, Lcom/ta/utdid2/device/c;->i:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "Alvin2"

    .line 23
    .line 24
    invoke-direct {v0, p1, v1, v2}, Ll2/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 28
    .line 29
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/ta/utdid2/device/c;
    .locals 2

    if-eqz p0, :cond_1

    .line 3
    sget-object v0, Lcom/ta/utdid2/device/c;->a:Lcom/ta/utdid2/device/c;

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/ta/utdid2/device/c;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/ta/utdid2/device/c;->a:Lcom/ta/utdid2/device/c;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/ta/utdid2/device/c;

    invoke-direct {v1, p0}, Lcom/ta/utdid2/device/c;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/ta/utdid2/device/c;->a:Lcom/ta/utdid2/device/c;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 8
    :cond_1
    :goto_2
    sget-object p0, Lcom/ta/utdid2/device/c;->a:Lcom/ta/utdid2/device/c;

    return-object p0
.end method

.method public static synthetic a(Lcom/ta/utdid2/device/c;)Ll2/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    return-object p0
.end method

.method public static a(Lcom/ta/utdid2/device/c$a;)V
    .locals 2

    .line 9
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ta/utdid2/device/c$5;

    invoke-direct {v1, p0}, Lcom/ta/utdid2/device/c$5;-><init>(Lcom/ta/utdid2/device/c$a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic a(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/ta/utdid2/device/c;->h(Ljava/lang/String;)V

    return-void
.end method

.method private static b([B)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const/16 v0, 0x2c

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const-string v1, "HmacSHA1"

    .line 9
    .line 10
    invoke-static {v1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 15
    .line 16
    invoke-static {v0}, Lj2/g;->c([B)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1}, Ljavax/crypto/Mac;->getAlgorithm()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v2, v0, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-static {p0, v0}, Lk2/b;->f([BI)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :array_0
    .array-data 1
        0x45t
        0x72t
        0x74t
        -0x21t
        0x7dt
        -0x36t
        -0x1ft
        0x56t
        -0xbt
        0xbt
        -0x4et
        -0x60t
        -0x11t
        -0x63t
        0x40t
        0x17t
        -0x5ft
        -0x7et
        -0x52t
        -0x40t
        0x71t
        0x74t
        -0x10t
        -0x67t
        0x31t
        -0x1et
        0x9t
        -0x27t
        0x21t
        -0x50t
        -0x44t
        -0x4et
        -0x75t
        0x35t
        0x1et
        -0x7at
        0x40t
        -0x68t
        0x4at
        -0x31t
        0x6at
        0x55t
        -0x26t
        -0x5dt
    .end array-data
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    const-string v0, "\n"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const/16 v0, 0x18

    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_2

    .line 5
    sget-object v0, Lcom/ta/utdid2/device/c;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private c()[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 7
    const-string v0, "generateUtdid"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "UTUtdid"

    invoke-static {v1, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v1, v1

    .line 10
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    .line 11
    invoke-static {v1}, Lk2/d;->a(I)[B

    move-result-object v1

    .line 12
    invoke-static {v2}, Lk2/d;->a(I)[B

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    .line 13
    invoke-virtual {v0, v1, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 14
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    const/4 v1, 0x3

    .line 15
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 16
    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 17
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/ta/utdid2/device/c;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ta/utdid2/device/c;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lk2/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 18
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/ta/utdid2/device/c;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 19
    :goto_0
    invoke-static {v1}, Lk2/f;->a(Ljava/lang/String;)I

    move-result v1

    .line 20
    invoke-static {v1}, Lk2/d;->a(I)[B

    move-result-object v1

    .line 21
    invoke-virtual {v0, v1, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 22
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/ta/utdid2/device/c;->b([B)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v1}, Lk2/f;->a(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk2/d;->a(I)[B

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 25
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    sput v0, Lcom/ta/utdid2/device/c;->f:I

    .line 9
    .line 10
    const-string v1, "utdid type:"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "UTUtdid"

    .line 21
    .line 22
    invoke-static {v1, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 26
    .line 27
    sget v1, Lcom/ta/utdid2/device/c;->f:I

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Ll2/c;->d(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/ta/utdid2/device/c$1;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Lcom/ta/utdid2/device/c$1;-><init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/ta/utdid2/device/c$2;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/ta/utdid2/device/c$2;-><init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "mqBRboGZkQPcAkyk"

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/provider/Settings$System;->putString(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    :cond_0
    return-void
.end method

.method private s()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ta/utdid2/device/c;->t()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string v1, "\n"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/ta/utdid2/device/c;->c()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-static {v0, v1}, Lk2/b;->f([BI)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;

    .line 56
    .line 57
    const/4 v1, 0x6

    .line 58
    sput v1, Lcom/ta/utdid2/device/c;->f:I

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/ta/utdid2/device/c;->f(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    return-object v0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    const-string v1, ""

    .line 68
    .line 69
    new-array v2, v2, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v1, v0, v2}, Lj2/h;->d(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    const/4 v0, 0x0

    .line 75
    return-object v0
.end method

.method public static setExtendFactor(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/ta/utdid2/device/c;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static setType(I)V
    .locals 0

    .line 1
    sput p0, Lcom/ta/utdid2/device/c;->f:I

    .line 2
    .line 3
    return-void
.end method

.method private t()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0}, Lcom/ta/utdid2/device/c;->u()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const-string v4, "utdid type"

    .line 15
    .line 16
    const-string v5, "UTUtdid"

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sput v0, Lcom/ta/utdid2/device/c;->f:I

    .line 21
    .line 22
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v5, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v2}, Lcom/ta/utdid2/device/c;->g(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_0
    invoke-direct {p0}, Lcom/ta/utdid2/device/c;->v()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sput v0, Lcom/ta/utdid2/device/c;->f:I

    .line 44
    .line 45
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v5, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v2}, Lcom/ta/utdid2/device/c;->g(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 57
    .line 58
    invoke-virtual {v0}, Ll2/c;->h()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v1, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 69
    .line 70
    invoke-virtual {v1}, Ll2/c;->a()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    sput v1, Lcom/ta/utdid2/device/c;->f:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    sput v1, Lcom/ta/utdid2/device/c;->f:I

    .line 81
    .line 82
    :goto_0
    sget v1, Lcom/ta/utdid2/device/c;->f:I

    .line 83
    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "get utdid from sp. type"

    .line 89
    .line 90
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v5, v1}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lcom/ta/utdid2/device/c$3;

    .line 98
    .line 99
    invoke-direct {v1, p0, v0}, Lcom/ta/utdid2/device/c$3;-><init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 107
    .line 108
    invoke-virtual {v0}, Ll2/c;->i()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    const/4 v1, 0x3

    .line 119
    sput v1, Lcom/ta/utdid2/device/c;->f:I

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v5, v1}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lcom/ta/utdid2/device/c;->a:Ll2/c;

    .line 133
    .line 134
    sget v2, Lcom/ta/utdid2/device/c;->f:I

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ll2/c;->e(I)Z

    .line 137
    .line 138
    .line 139
    new-instance v1, Lcom/ta/utdid2/device/c$4;

    .line 140
    .line 141
    invoke-direct {v1, p0, v0}, Lcom/ta/utdid2/device/c$4;-><init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c$a;)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_4
    const-string v0, "read utdid is null"

    .line 149
    .line 150
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v5, v0}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    return-object v0
.end method

.method private u()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "mqBRboGZkQPcAkyk"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object v0

    .line 14
    :catch_0
    const-string v0, ""

    .line 15
    .line 16
    return-object v0
.end method

.method private v()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "UTUtdid"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/ta/utdid2/device/c;->mContext:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "dxCRMxhQkdGePGnp"

    .line 10
    .line 11
    invoke-static {v1, v2}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    :try_start_1
    invoke-static {v1}, Lk2/f;->c(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    new-instance v2, Lcom/ta/utdid2/device/e;

    .line 24
    .line 25
    invoke-direct {v2}, Lcom/ta/utdid2/device/e;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lcom/ta/utdid2/device/e;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    const-string v1, "OldSettings_1"

    .line 39
    .line 40
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v3}, Lcom/ta/utdid2/device/c;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {v2, v1}, Lcom/ta/utdid2/device/e;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    const-string v1, "OldSettings_2"

    .line 64
    .line 65
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, v1}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v2}, Lcom/ta/utdid2/device/c;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_1
    new-instance v2, Lcom/ta/utdid2/device/d;

    .line 77
    .line 78
    invoke-direct {v2}, Lcom/ta/utdid2/device/d;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Lcom/ta/utdid2/device/d;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_2

    .line 90
    .line 91
    const-string v2, "OldSettings_3"

    .line 92
    .line 93
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v0, v2}, Lj2/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v1}, Lcom/ta/utdid2/device/c;->h(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :goto_1
    const/4 v2, 0x0

    .line 105
    new-array v2, v2, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v0, v1, v2}, Lj2/h;->f(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    const-string v0, ""

    .line 111
    .line 112
    return-object v0
.end method


# virtual methods
.method public declared-synchronized getValue()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ta/utdid2/device/c;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/ta/utdid2/device/c;->s()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    monitor-exit p0

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 16
    throw v0
.end method
