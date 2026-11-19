.class public Lcom/umeng/analytics/pro/bj;
.super Lg2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/bj$a;
    }
.end annotation


# static fields
.field public static final k:Lg2/u;

.field public static final l:Lg2/p;

.field public static final m:[B


# instance fields
.field public b:Lg2/m;

.field public c:S

.field public d:Lg2/p;

.field public e:Ljava/lang/Boolean;

.field public final f:J

.field public g:[B

.field public h:[B

.field public i:[B

.field public j:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg2/u;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/umeng/analytics/pro/bj;->k:Lg2/u;

    .line 9
    .line 10
    new-instance v0, Lg2/p;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2, v2}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/umeng/analytics/pro/bj;->l:Lg2/p;

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    sput-object v0, Lcom/umeng/analytics/pro/bj;->m:[B

    .line 23
    .line 24
    aput-byte v2, v0, v2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const/4 v2, 0x1

    .line 28
    aput-byte v2, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    aput-byte v1, v0, v1

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    const/4 v2, 0x4

    .line 35
    aput-byte v2, v0, v1

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    aput-byte v3, v0, v4

    .line 41
    .line 42
    const/16 v3, 0xa

    .line 43
    .line 44
    aput-byte v1, v0, v3

    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    aput-byte v1, v0, v2

    .line 48
    .line 49
    const/16 v1, 0xb

    .line 50
    .line 51
    aput-byte v4, v0, v1

    .line 52
    .line 53
    const/16 v2, 0xf

    .line 54
    .line 55
    const/16 v4, 0x9

    .line 56
    .line 57
    aput-byte v4, v0, v2

    .line 58
    .line 59
    const/16 v2, 0xe

    .line 60
    .line 61
    aput-byte v3, v0, v2

    .line 62
    .line 63
    const/16 v2, 0xd

    .line 64
    .line 65
    aput-byte v1, v0, v2

    .line 66
    .line 67
    const/16 v1, 0xc

    .line 68
    .line 69
    aput-byte v1, v0, v1

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(Lg2/c0;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 11
    invoke-direct {p0, p1, v0, v1}, Lcom/umeng/analytics/pro/bj;-><init>(Lg2/c0;J)V

    return-void
.end method

.method public constructor <init>(Lg2/c0;J)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lg2/s;-><init>(Lg2/c0;)V

    .line 2
    new-instance p1, Lg2/m;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, Lg2/m;-><init>(I)V

    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    const/4 p1, 0x0

    .line 3
    iput-short p1, p0, Lcom/umeng/analytics/pro/bj;->c:S

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->d:Lg2/p;

    .line 5
    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->e:Ljava/lang/Boolean;

    const/4 p1, 0x5

    .line 6
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->g:[B

    const/16 p1, 0xa

    .line 7
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->h:[B

    const/4 p1, 0x1

    .line 8
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/umeng/analytics/pro/bj;->i:[B

    .line 9
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->j:[B

    .line 10
    iput-wide p2, p0, Lcom/umeng/analytics/pro/bj;->f:J

    return-void
.end method

.method private W(I)V
    .locals 0

    .line 1
    int-to-byte p1, p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->O(B)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lcom/umeng/analytics/pro/bj;->e:Ljava/lang/Boolean;

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public B()B
    .locals 4

    .line 1
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/c0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lg2/c0;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 17
    .line 18
    invoke-virtual {v2}, Lg2/c0;->g()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget-byte v0, v0, v2

    .line 23
    .line 24
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lg2/c0;->b(I)V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/umeng/analytics/pro/bj;->j:[B

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v2, v3, v1}, Lg2/c0;->e([BII)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->j:[B

    .line 39
    .line 40
    aget-byte v0, v0, v3

    .line 41
    .line 42
    return v0
.end method

.method public C()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->a0(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-short v0, v0

    .line 10
    return v0
.end method

.method public D()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->a0(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public E()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->I()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/umeng/analytics/pro/bj;->V(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public F()D
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v2, v1, v3, v0}, Lg2/c0;->e([BII)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bj;->J([B)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public G()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->Z(I)V

    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    :try_start_0
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 14
    .line 15
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    const-string v2, "UTF-8"

    .line 20
    .line 21
    if-lt v1, v0, :cond_1

    .line 22
    .line 23
    :try_start_1
    new-instance v1, Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 26
    .line 27
    invoke-virtual {v3}, Lg2/c0;->f()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lg2/s;->a:Lg2/c0;

    .line 32
    .line 33
    invoke-virtual {v4}, Lg2/c0;->g()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v1, v3, v4, v0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Lg2/c0;->b(I)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->Y(I)[B

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catch_0
    new-instance v0, Lcom/umeng/analytics/pro/aw;

    .line 57
    .line 58
    const-string v1, "UTF-8 not supported!"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public final H()I
    .locals 8

    .line 1
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/c0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x5

    .line 8
    const/16 v2, 0x80

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lg2/c0;->f()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 20
    .line 21
    invoke-virtual {v1}, Lg2/c0;->g()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    move v4, v3

    .line 26
    move v5, v4

    .line 27
    :goto_0
    add-int v6, v1, v3

    .line 28
    .line 29
    aget-byte v6, v0, v6

    .line 30
    .line 31
    and-int/lit8 v7, v6, 0x7f

    .line 32
    .line 33
    shl-int/2addr v7, v5

    .line 34
    or-int/2addr v4, v7

    .line 35
    and-int/2addr v6, v2

    .line 36
    if-eq v6, v2, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lg2/c0;->b(I)V

    .line 43
    .line 44
    .line 45
    return v4

    .line 46
    :cond_0
    add-int/lit8 v5, v5, 0x7

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v3

    .line 52
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    and-int/lit8 v4, v1, 0x7f

    .line 57
    .line 58
    shl-int/2addr v4, v0

    .line 59
    or-int/2addr v3, v4

    .line 60
    and-int/2addr v1, v2

    .line 61
    if-eq v1, v2, :cond_2

    .line 62
    .line 63
    return v3

    .line 64
    :cond_2
    add-int/lit8 v0, v0, 0x7

    .line 65
    .line 66
    goto :goto_1
.end method

.method public final I()J
    .locals 10

    .line 1
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/c0;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    const/16 v2, 0x80

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lg2/c0;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lg2/c0;->g()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move-wide v5, v4

    .line 29
    move v4, v3

    .line 30
    :goto_0
    add-int v7, v1, v3

    .line 31
    .line 32
    aget-byte v7, v0, v7

    .line 33
    .line 34
    and-int/lit8 v8, v7, 0x7f

    .line 35
    .line 36
    int-to-long v8, v8

    .line 37
    shl-long/2addr v8, v4

    .line 38
    or-long/2addr v5, v8

    .line 39
    and-int/2addr v7, v2

    .line 40
    if-eq v7, v2, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Lg2/c0;->b(I)V

    .line 47
    .line 48
    .line 49
    return-wide v5

    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x7

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    and-int/lit8 v1, v0, 0x7f

    .line 60
    .line 61
    int-to-long v6, v1

    .line 62
    shl-long/2addr v6, v3

    .line 63
    or-long/2addr v4, v6

    .line 64
    and-int/2addr v0, v2

    .line 65
    if-eq v0, v2, :cond_2

    .line 66
    .line 67
    return-wide v4

    .line 68
    :cond_2
    add-int/lit8 v3, v3, 0x7

    .line 69
    .line 70
    goto :goto_1
.end method

.method public final J([B)J
    .locals 7

    .line 1
    const/4 v0, 0x7

    .line 2
    aget-byte v0, p1, v0

    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    const-wide/16 v2, 0xff

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const/16 v4, 0x38

    .line 9
    .line 10
    shl-long/2addr v0, v4

    .line 11
    const/4 v4, 0x6

    .line 12
    aget-byte v4, p1, v4

    .line 13
    .line 14
    int-to-long v4, v4

    .line 15
    and-long/2addr v4, v2

    .line 16
    const/16 v6, 0x30

    .line 17
    .line 18
    shl-long/2addr v4, v6

    .line 19
    or-long/2addr v0, v4

    .line 20
    const/4 v4, 0x5

    .line 21
    aget-byte v4, p1, v4

    .line 22
    .line 23
    int-to-long v4, v4

    .line 24
    and-long/2addr v4, v2

    .line 25
    const/16 v6, 0x28

    .line 26
    .line 27
    shl-long/2addr v4, v6

    .line 28
    or-long/2addr v0, v4

    .line 29
    const/4 v4, 0x4

    .line 30
    aget-byte v4, p1, v4

    .line 31
    .line 32
    int-to-long v4, v4

    .line 33
    and-long/2addr v4, v2

    .line 34
    const/16 v6, 0x20

    .line 35
    .line 36
    shl-long/2addr v4, v6

    .line 37
    or-long/2addr v0, v4

    .line 38
    const/4 v4, 0x3

    .line 39
    aget-byte v4, p1, v4

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    and-long/2addr v4, v2

    .line 43
    const/16 v6, 0x18

    .line 44
    .line 45
    shl-long/2addr v4, v6

    .line 46
    or-long/2addr v0, v4

    .line 47
    const/4 v4, 0x2

    .line 48
    aget-byte v4, p1, v4

    .line 49
    .line 50
    int-to-long v4, v4

    .line 51
    and-long/2addr v4, v2

    .line 52
    const/16 v6, 0x10

    .line 53
    .line 54
    shl-long/2addr v4, v6

    .line 55
    or-long/2addr v0, v4

    .line 56
    const/4 v4, 0x1

    .line 57
    aget-byte v4, p1, v4

    .line 58
    .line 59
    int-to-long v4, v4

    .line 60
    and-long/2addr v4, v2

    .line 61
    const/16 v6, 0x8

    .line 62
    .line 63
    shl-long/2addr v4, v6

    .line 64
    or-long/2addr v0, v4

    .line 65
    const/4 v4, 0x0

    .line 66
    aget-byte p1, p1, v4

    .line 67
    .line 68
    int-to-long v4, p1

    .line 69
    and-long/2addr v2, v4

    .line 70
    or-long/2addr v0, v2

    .line 71
    return-wide v0
.end method

.method public K(BI)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    if-gt p2, v0, :cond_0

    .line 4
    .line 5
    shl-int/lit8 p2, p2, 0x4

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->X(B)B

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    or-int/2addr p1, p2

    .line 12
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bj;->W(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->X(B)B

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    or-int/lit16 p1, p1, 0xf0

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bj;->W(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/bj;->P(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final L(Lg2/p;B)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget-byte p2, p1, Lg2/p;->b:B

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/bj;->X(B)B

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    :cond_0
    iget-short v0, p1, Lg2/p;->c:S

    .line 11
    .line 12
    iget-short v1, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 13
    .line 14
    if-le v0, v1, :cond_1

    .line 15
    .line 16
    sub-int v2, v0, v1

    .line 17
    .line 18
    const/16 v3, 0xf

    .line 19
    .line 20
    if-gt v2, v3, :cond_1

    .line 21
    .line 22
    sub-int/2addr v0, v1

    .line 23
    shl-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    or-int/2addr p2, v0

    .line 26
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/bj;->W(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/bj;->O(B)V

    .line 31
    .line 32
    .line 33
    iget-short p2, p1, Lg2/p;->c:S

    .line 34
    .line 35
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/pro/bj;->M(S)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-short p1, p1, Lg2/p;->c:S

    .line 39
    .line 40
    iput-short p1, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 41
    .line 42
    return-void
.end method

.method public M(S)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->R(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->P(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final N([BII)V
    .locals 1

    .line 1
    invoke-virtual {p0, p3}, Lcom/umeng/analytics/pro/bj;->P(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lg2/c0;->d([BII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final O(B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->i:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput-byte p1, v0, v1

    .line 5
    .line 6
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lg2/c0;->c([B)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final P(I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    and-int/lit8 v2, p1, -0x80

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/umeng/analytics/pro/bj;->g:[B

    .line 8
    .line 9
    add-int/lit8 v3, v1, 0x1

    .line 10
    .line 11
    int-to-byte p1, p1

    .line 12
    aput-byte p1, v2, v1

    .line 13
    .line 14
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 15
    .line 16
    invoke-virtual {p1, v2, v0, v3}, Lg2/c0;->d([BII)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/bj;->g:[B

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    and-int/lit8 v4, p1, 0x7f

    .line 25
    .line 26
    or-int/lit16 v4, v4, 0x80

    .line 27
    .line 28
    int-to-byte v4, v4

    .line 29
    aput-byte v4, v2, v1

    .line 30
    .line 31
    ushr-int/lit8 p1, p1, 0x7

    .line 32
    .line 33
    move v1, v3

    .line 34
    goto :goto_0
.end method

.method public final Q(J)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const-wide/16 v2, -0x80

    .line 4
    .line 5
    and-long/2addr v2, p1

    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    cmp-long v2, v2, v4

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lcom/umeng/analytics/pro/bj;->h:[B

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    long-to-int p1, p1

    .line 17
    int-to-byte p1, p1

    .line 18
    aput-byte p1, v2, v1

    .line 19
    .line 20
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 21
    .line 22
    invoke-virtual {p1, v2, v0, v3}, Lg2/c0;->d([BII)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/bj;->h:[B

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    const-wide/16 v4, 0x7f

    .line 31
    .line 32
    and-long/2addr v4, p1

    .line 33
    const-wide/16 v6, 0x80

    .line 34
    .line 35
    or-long/2addr v4, v6

    .line 36
    long-to-int v4, v4

    .line 37
    int-to-byte v4, v4

    .line 38
    aput-byte v4, v2, v1

    .line 39
    .line 40
    const/4 v1, 0x7

    .line 41
    ushr-long/2addr p1, v1

    .line 42
    move v1, v3

    .line 43
    goto :goto_0
.end method

.method public final R(I)I
    .locals 1

    .line 1
    shl-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    return p1
.end method

.method public final S(J)J
    .locals 3

    .line 1
    const/4 v0, 0x1

    shl-long v0, p1, v0

    const/16 v2, 0x3f

    shr-long/2addr p1, v2

    xor-long/2addr p1, v0

    return-wide p1
.end method

.method public final T(B)Z
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0xf

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final U(B)B
    .locals 3

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    int-to-byte p1, p1

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "don\'t know what type: "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :pswitch_0
    const/16 p1, 0xc

    .line 32
    .line 33
    return p1

    .line 34
    :pswitch_1
    const/16 p1, 0xd

    .line 35
    .line 36
    return p1

    .line 37
    :pswitch_2
    const/16 p1, 0xe

    .line 38
    .line 39
    return p1

    .line 40
    :pswitch_3
    return v0

    .line 41
    :pswitch_4
    const/16 p1, 0xb

    .line 42
    .line 43
    return p1

    .line 44
    :pswitch_5
    const/4 p1, 0x4

    .line 45
    return p1

    .line 46
    :pswitch_6
    const/16 p1, 0xa

    .line 47
    .line 48
    return p1

    .line 49
    :pswitch_7
    const/16 p1, 0x8

    .line 50
    .line 51
    return p1

    .line 52
    :pswitch_8
    const/4 p1, 0x6

    .line 53
    return p1

    .line 54
    :pswitch_9
    const/4 p1, 0x3

    .line 55
    return p1

    .line 56
    :pswitch_a
    const/4 p1, 0x2

    .line 57
    return p1

    .line 58
    :pswitch_b
    const/4 p1, 0x0

    .line 59
    return p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final V(J)J
    .locals 4

    .line 1
    const/4 v0, 0x1

    ushr-long v0, p1, v0

    const-wide/16 v2, 0x1

    and-long/2addr p1, v2

    neg-long p1, p1

    xor-long/2addr p1, v0

    return-wide p1
.end method

.method public final X(B)B
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bj;->m:[B

    .line 2
    .line 3
    aget-byte p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public final Y(I)[B
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-array p1, v0, [B

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    new-array v1, p1, [B

    .line 8
    .line 9
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 10
    .line 11
    invoke-virtual {v2, v1, v0, p1}, Lg2/c0;->e([BII)I

    .line 12
    .line 13
    .line 14
    return-object v1
.end method

.method public final Z(I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/umeng/analytics/pro/bj;->f:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    int-to-long v2, p1

    .line 12
    cmp-long v0, v2, v0

    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Length exceeded max allowed: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    :goto_0
    return-void

    .line 41
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "Negative length: "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public a()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->Z(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-array v0, v1, [B

    .line 12
    .line 13
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    new-array v2, v0, [B

    .line 19
    .line 20
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 21
    .line 22
    invoke-virtual {v3, v2, v1, v0}, Lg2/c0;->e([BII)I

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final a0(I)I
    .locals 1

    .line 1
    ushr-int/lit8 v0, p1, 0x1

    and-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    xor-int/2addr p1, v0

    return p1
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/m;->c()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 8
    .line 9
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->R(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->P(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bj;->S(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bj;->Q(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Lg2/p;)V
    .locals 2

    .line 1
    iget-byte v0, p1, Lg2/p;->b:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/umeng/analytics/pro/bj;->d:Lg2/p;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, -0x1

    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/pro/bj;->L(Lg2/p;B)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(Lg2/q;)V
    .locals 1

    .line 1
    iget-byte v0, p1, Lg2/q;->a:B

    .line 2
    .line 3
    iget p1, p1, Lg2/q;->b:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/umeng/analytics/pro/bj;->K(BI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Lg2/r;)V
    .locals 1

    .line 1
    iget v0, p1, Lg2/r;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bj;->W(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->P(I)V

    .line 11
    .line 12
    .line 13
    iget-byte v0, p1, Lg2/r;->a:B

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->X(B)B

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    shl-int/lit8 v0, v0, 0x4

    .line 20
    .line 21
    iget-byte p1, p1, Lg2/r;->b:B

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bj;->X(B)B

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    or-int/2addr p1, v0

    .line 28
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bj;->W(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public i(Lg2/u;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    .line 2
    .line 3
    iget-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lg2/m;->b(S)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-short p1, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 10
    .line 11
    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, p1, v1, v0}, Lcom/umeng/analytics/pro/bj;->N([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/aw;

    .line 14
    .line 15
    const-string v0, "UTF-8 not supported!"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public k(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    add-int/2addr v2, p1

    .line 23
    invoke-virtual {p0, v1, v2, v0}, Lcom/umeng/analytics/pro/bj;->N([BII)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/m;->a()S

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 8
    .line 9
    return-void
.end method

.method public m()V
    .locals 0

    .line 1
    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->O(B)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()Lg2/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    .line 2
    .line 3
    iget-short v1, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lg2/m;->b(S)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 10
    .line 11
    sget-object v0, Lcom/umeng/analytics/pro/bj;->k:Lg2/u;

    .line 12
    .line 13
    return-object v0
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bj;->b:Lg2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/m;->a()S

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 8
    .line 9
    return-void
.end method

.method public s()Lg2/p;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/umeng/analytics/pro/bj;->l:Lg2/p;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    and-int/lit16 v1, v0, 0xf0

    .line 11
    .line 12
    shr-int/lit8 v1, v1, 0x4

    .line 13
    .line 14
    int-to-short v1, v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->C()S

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-short v2, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 23
    .line 24
    add-int/2addr v2, v1

    .line 25
    int-to-short v1, v2

    .line 26
    :goto_0
    new-instance v2, Lg2/p;

    .line 27
    .line 28
    and-int/lit8 v3, v0, 0xf

    .line 29
    .line 30
    int-to-byte v3, v3

    .line 31
    invoke-virtual {p0, v3}, Lcom/umeng/analytics/pro/bj;->U(B)B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, ""

    .line 36
    .line 37
    invoke-direct {v2, v5, v4, v1}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->T(B)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    if-ne v3, v0, :cond_2

    .line 48
    .line 49
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    :goto_1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bj;->e:Ljava/lang/Boolean;

    .line 55
    .line 56
    :cond_3
    iget-short v0, v2, Lg2/p;->c:S

    .line 57
    .line 58
    iput-short v0, p0, Lcom/umeng/analytics/pro/bj;->c:S

    .line 59
    .line 60
    return-object v2
.end method

.method public t()V
    .locals 0

    .line 1
    return-void
.end method

.method public u()Lg2/r;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    new-instance v2, Lg2/r;

    .line 14
    .line 15
    shr-int/lit8 v3, v1, 0x4

    .line 16
    .line 17
    int-to-byte v3, v3

    .line 18
    invoke-virtual {p0, v3}, Lcom/umeng/analytics/pro/bj;->U(B)B

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    and-int/lit8 v1, v1, 0xf

    .line 23
    .line 24
    int-to-byte v1, v1

    .line 25
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bj;->U(B)B

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v2, v3, v1, v0}, Lg2/r;-><init>(BBI)V

    .line 30
    .line 31
    .line 32
    return-object v2
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w()Lg2/q;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->B()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x4

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    and-int/2addr v1, v2

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->H()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :cond_0
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bj;->U(B)B

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Lg2/q;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Lg2/q;-><init>(BI)V

    .line 23
    .line 24
    .line 25
    return-object v2
.end method

.method public x()V
    .locals 0

    .line 1
    return-void
.end method

.method public y()Lg2/t;
    .locals 2

    .line 1
    new-instance v0, Lg2/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bj;->w()Lg2/q;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lg2/t;-><init>(Lg2/q;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public z()V
    .locals 0

    .line 1
    return-void
.end method
