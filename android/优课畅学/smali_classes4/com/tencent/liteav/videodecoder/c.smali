.class Lcom/tencent/liteav/videodecoder/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lcom/tencent/liteav/videodecoder/a;

.field b:I

.field private c:Ljava/io/InputStream;

.field private d:I

.field private e:I

.field private final f:Ljava/io/OutputStream;

.field private g:[I

.field private h:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/tencent/liteav/videodecoder/a;

    .line 5
    .line 6
    const/16 v1, 0x32

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/tencent/liteav/videodecoder/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/c;->a:Lcom/tencent/liteav/videodecoder/a;

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    new-array v0, v0, [I

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/c;->g:[I

    .line 18
    .line 19
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/c;->c:Ljava/io/InputStream;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/tencent/liteav/videodecoder/c;->f:Ljava/io/OutputStream;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iput p2, p0, Lcom/tencent/liteav/videodecoder/c;->d:I

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lcom/tencent/liteav/videodecoder/c;->e:I

    .line 34
    .line 35
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method private d()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->e:I

    iput v0, p0, Lcom/tencent/liteav/videodecoder/c;->d:I

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/c;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videodecoder/c;->e:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tencent/liteav/videodecoder/c;->b:I

    return-void
.end method

.method private e()I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x1

    .line 1
    invoke-virtual {p0, v2}, Lcom/tencent/liteav/videodecoder/c;->b(Z)I

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/videodecoder/c;->a(I)J

    move-result-wide v3

    shl-int v0, v2, v1

    sub-int/2addr v0, v2

    int-to-long v0, v0

    add-long/2addr v0, v3

    long-to-int v0, v0

    :cond_1
    return v0
.end method

.method private f()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/videodecoder/c;->b(Z)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-lez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/c;->b(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method private g()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/c;->g:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v1, v0, v1

    .line 5
    .line 6
    const/4 v2, 0x7

    .line 7
    shl-int/2addr v1, v2

    .line 8
    const/4 v3, 0x1

    .line 9
    aget v4, v0, v3

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    shl-int/2addr v4, v5

    .line 13
    or-int/2addr v1, v4

    .line 14
    const/4 v4, 0x2

    .line 15
    aget v6, v0, v4

    .line 16
    .line 17
    const/4 v7, 0x5

    .line 18
    shl-int/2addr v6, v7

    .line 19
    or-int/2addr v1, v6

    .line 20
    const/4 v6, 0x3

    .line 21
    aget v8, v0, v6

    .line 22
    .line 23
    const/4 v9, 0x4

    .line 24
    shl-int/2addr v8, v9

    .line 25
    or-int/2addr v1, v8

    .line 26
    aget v8, v0, v9

    .line 27
    .line 28
    shl-int/lit8 v6, v8, 0x3

    .line 29
    .line 30
    or-int/2addr v1, v6

    .line 31
    aget v6, v0, v7

    .line 32
    .line 33
    shl-int/lit8 v4, v6, 0x2

    .line 34
    .line 35
    or-int/2addr v1, v4

    .line 36
    aget v4, v0, v5

    .line 37
    .line 38
    shl-int/lit8 v3, v4, 0x1

    .line 39
    .line 40
    or-int/2addr v1, v3

    .line 41
    aget v0, v0, v2

    .line 42
    .line 43
    or-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/c;->f:Ljava/io/OutputStream;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 2

    .line 7
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->e()I

    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public a(I)J
    .locals 5

    const/16 v0, 0x40

    if-gt p1, v0, :cond_1

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    const/4 v3, 0x1

    shl-long/2addr v0, v3

    .line 3
    invoke-virtual {p0, v3}, Lcom/tencent/liteav/videodecoder/c;->b(Z)I

    move-result v3

    int-to-long v3, v3

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not readByte more then 64 bit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(ILjava/lang/String;)J
    .locals 2

    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videodecoder/c;->a(I)J

    move-result-wide v0

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-wide v0
.end method

.method public a()V
    .locals 3

    .line 9
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    :goto_0
    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/c;->g:[I

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 11
    :cond_0
    iput v2, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    .line 12
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->g()V

    return-void
.end method

.method public a(JI)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    sub-int v1, p3, v0

    add-int/lit8 v1, v1, -0x1

    shr-long v1, p1, v1

    long-to-int v1, v1

    and-int/lit8 v1, v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/videodecoder/c;->d(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(ZLjava/lang/String;)V
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videodecoder/c;->d(I)V

    return-void
.end method

.method public a(Z)Z
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videodecoder/c;->b(Z)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Z)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->b:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->d()V

    .line 3
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 4
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->d:I

    iget v1, p0, Lcom/tencent/liteav/videodecoder/c;->b:I

    rsub-int/lit8 v2, v1, 0x7

    shr-int/2addr v0, v2

    and-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    .line 5
    iput v1, p0, Lcom/tencent/liteav/videodecoder/c;->b:I

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/c;->f:Ljava/io/OutputStream;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/c;->d(I)V

    :cond_1
    return v0
.end method

.method public b()V
    .locals 3

    .line 14
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    rsub-int/lit8 v0, v0, 0x8

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->a(JI)V

    return-void
.end method

.method public b(I)V
    .locals 2

    const/16 v0, 0x40

    if-gt p1, v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v1}, Lcom/tencent/liteav/videodecoder/c;->b(Z)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not skip more then 64 bit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(ILjava/lang/String;)V
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videodecoder/c;->b(I)V

    .line 11
    const-string p1, "skip NBits"

    invoke-direct {p0, p2, p1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->f()V

    .line 13
    const-string v0, "skip UE"

    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->e()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    shl-int/lit8 v2, v1, 0x1

    add-int/lit8 v2, v2, -0x1

    shr-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    .line 2
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/c;->d(I)V

    .line 9
    invoke-virtual {p0}, Lcom/tencent/liteav/videodecoder/c;->b()V

    .line 10
    invoke-virtual {p0}, Lcom/tencent/liteav/videodecoder/c;->a()V

    return-void
.end method

.method public c(I)V
    .locals 4

    .line 3
    new-array v0, p1, [I

    const/16 v1, 0x8

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    :goto_0
    if-ge v3, p1, :cond_2

    if-eqz v1, :cond_0

    .line 4
    const-string v1, "deltaScale"

    invoke-virtual {p0, v1}, Lcom/tencent/liteav/videodecoder/c;->c(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v2

    add-int/lit16 v1, v1, 0x100

    .line 5
    rem-int/lit16 v1, v1, 0x100

    :cond_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    .line 6
    :goto_1
    aput v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c(ILjava/lang/String;)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videodecoder/c;->e(I)V

    return-void
.end method

.method public d(I)V
    .locals 3

    .line 6
    iget v0, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    .line 8
    invoke-direct {p0}, Lcom/tencent/liteav/videodecoder/c;->g()V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/c;->g:[I

    iget v1, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/tencent/liteav/videodecoder/c;->h:I

    aput p1, v0, v1

    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/c;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    invoke-direct {p0, p1, v1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public e(I)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0xf

    const/4 v4, 0x1

    if-ge v1, v3, :cond_1

    shl-int v3, v4, v1

    add-int/2addr v3, v2

    if-ge p1, v3, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    const-wide/16 v5, 0x0

    .line 5
    invoke-virtual {p0, v5, v6, v0}, Lcom/tencent/liteav/videodecoder/c;->a(JI)V

    .line 6
    invoke-virtual {p0, v4}, Lcom/tencent/liteav/videodecoder/c;->d(I)V

    sub-int/2addr p1, v2

    int-to-long v1, p1

    .line 7
    invoke-virtual {p0, v1, v2, v0}, Lcom/tencent/liteav/videodecoder/c;->a(JI)V

    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videodecoder/c;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    invoke-direct {p0, p1, v1}, Lcom/tencent/liteav/videodecoder/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method
