.class public Lcom/tencent/liteav/network/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/network/k$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iput v0, p0, Lcom/tencent/liteav/network/k;->a:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lcom/tencent/liteav/network/k;->b:I

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->c:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->d:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lcom/tencent/liteav/network/k;->e:I

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->f:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance v0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->g:Landroid/os/Handler;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/network/k;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/network/k;->e:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/network/k;)J
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/tencent/liteav/network/k;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lcom/tencent/liteav/network/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/network/k;->c:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-eqz p1, :cond_3

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 25
    const-string v0, "[?&]"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 26
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    .line 27
    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 28
    const-string v4, "[=]"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 29
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    .line 30
    aget-object v4, v3, v1

    const/4 v5, 0x1

    .line 31
    aget-object v3, v3, v5

    if-eqz v4, :cond_1

    .line 32
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 33
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 34
    :cond_2
    const-string p1, ""

    return-object p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)V
    .locals 9

    .line 21
    new-instance v0, Lcom/tencent/liteav/network/k$2;

    const-string v2, "getRTMPAccUrl"

    move-object v1, p0

    move-object v6, p1

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/tencent/liteav/network/k$2;-><init>(Lcom/tencent/liteav/network/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)V

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/network/k;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/network/k;->a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 18
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    .line 19
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p4, :cond_0

    .line 20
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public static synthetic b(Lcom/tencent/liteav/network/k;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/k;->g:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/liteav/network/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/network/k;->d:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/network/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/k;->f:Ljava/lang/String;

    return-object p1
.end method

.method private e()J
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Network"

    .line 6
    .line 7
    const-string v2, "AccRetryCountWithoutSecret"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method


# virtual methods
.method public a(Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)I
    .locals 9

    .line 6
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/liteav/network/k;->c:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->d:Ljava/lang/String;

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lcom/tencent/liteav/network/k;->e:I

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/network/k;->f:Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getStreamIDByStreamUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 12
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    const-string v0, "bizid"

    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 14
    const-string v0, "txSecret"

    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 15
    const-string v0, "txTime"

    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1, v4, v6, v5}, Lcom/tencent/liteav/network/k;->a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, -0x3

    return p1

    .line 17
    :cond_2
    new-instance v2, Lcom/tencent/liteav/network/k$1;

    move-object v8, p3

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/tencent/liteav/network/k$1;-><init>(Lcom/tencent/liteav/network/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/network/k$a;)V

    move-object v8, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move v7, p2

    invoke-direct/range {v2 .. v8}, Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)V

    return v1

    :cond_3
    :goto_0
    const/4 p1, -0x2

    return p1

    :cond_4
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/network/k;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/network/k;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/tencent/liteav/network/k;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/k;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
