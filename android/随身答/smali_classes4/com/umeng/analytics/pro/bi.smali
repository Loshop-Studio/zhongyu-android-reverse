.class public Lcom/umeng/analytics/pro/bi;
.super Lg2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/bi$a;
    }
.end annotation


# static fields
.field public static final n:Lg2/u;


# instance fields
.field public b:Z

.field public c:Z

.field public d:I

.field public e:Z

.field public f:[B

.field public g:[B

.field public h:[B

.field public i:[B

.field public j:[B

.field public k:[B

.field public l:[B

.field public m:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg2/u;

    .line 2
    .line 3
    invoke-direct {v0}, Lg2/u;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/umeng/analytics/pro/bi;->n:Lg2/u;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lg2/c0;ZZ)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lg2/s;-><init>(Lg2/c0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/bi;->e:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    new-array v0, p1, [B

    .line 9
    .line 10
    iput-object v0, p0, Lcom/umeng/analytics/pro/bi;->f:[B

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    new-array v1, v0, [B

    .line 14
    .line 15
    iput-object v1, p0, Lcom/umeng/analytics/pro/bi;->g:[B

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    new-array v2, v1, [B

    .line 19
    .line 20
    iput-object v2, p0, Lcom/umeng/analytics/pro/bi;->h:[B

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    new-array v3, v2, [B

    .line 25
    .line 26
    iput-object v3, p0, Lcom/umeng/analytics/pro/bi;->i:[B

    .line 27
    .line 28
    new-array p1, p1, [B

    .line 29
    .line 30
    iput-object p1, p0, Lcom/umeng/analytics/pro/bi;->j:[B

    .line 31
    .line 32
    new-array p1, v0, [B

    .line 33
    .line 34
    iput-object p1, p0, Lcom/umeng/analytics/pro/bi;->k:[B

    .line 35
    .line 36
    new-array p1, v1, [B

    .line 37
    .line 38
    iput-object p1, p0, Lcom/umeng/analytics/pro/bi;->l:[B

    .line 39
    .line 40
    new-array p1, v2, [B

    .line 41
    .line 42
    iput-object p1, p0, Lcom/umeng/analytics/pro/bi;->m:[B

    .line 43
    .line 44
    iput-boolean p2, p0, Lcom/umeng/analytics/pro/bi;->b:Z

    .line 45
    .line 46
    iput-boolean p3, p0, Lcom/umeng/analytics/pro/bi;->c:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public B()B
    .locals 3

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
    if-lt v0, v1, :cond_0

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
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->j:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, v0, v2, v1}, Lcom/umeng/analytics/pro/bi;->H([BII)I

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->j:[B

    .line 37
    .line 38
    aget-byte v0, v0, v2

    .line 39
    .line 40
    return v0
.end method

.method public C()S
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->k:[B

    .line 2
    .line 3
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg2/c0;->f()[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 19
    .line 20
    invoke-virtual {v1}, Lg2/c0;->g()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Lg2/c0;->b(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bi;->k:[B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bi;->H([BII)I

    .line 34
    .line 35
    .line 36
    move v1, v3

    .line 37
    :goto_0
    aget-byte v2, v0, v1

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x8

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    aget-byte v0, v0, v1

    .line 46
    .line 47
    and-int/lit16 v0, v0, 0xff

    .line 48
    .line 49
    or-int/2addr v0, v2

    .line 50
    int-to-short v0, v0

    .line 51
    return v0
.end method

.method public D()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->l:[B

    .line 2
    .line 3
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg2/c0;->f()[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 19
    .line 20
    invoke-virtual {v1}, Lg2/c0;->g()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Lg2/c0;->b(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bi;->l:[B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bi;->H([BII)I

    .line 34
    .line 35
    .line 36
    move v1, v3

    .line 37
    :goto_0
    aget-byte v2, v0, v1

    .line 38
    .line 39
    and-int/lit16 v2, v2, 0xff

    .line 40
    .line 41
    shl-int/lit8 v2, v2, 0x18

    .line 42
    .line 43
    add-int/lit8 v3, v1, 0x1

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    and-int/lit16 v3, v3, 0xff

    .line 48
    .line 49
    shl-int/lit8 v3, v3, 0x10

    .line 50
    .line 51
    or-int/2addr v2, v3

    .line 52
    add-int/lit8 v3, v1, 0x2

    .line 53
    .line 54
    aget-byte v3, v0, v3

    .line 55
    .line 56
    and-int/lit16 v3, v3, 0xff

    .line 57
    .line 58
    shl-int/lit8 v3, v3, 0x8

    .line 59
    .line 60
    or-int/2addr v2, v3

    .line 61
    add-int/lit8 v1, v1, 0x3

    .line 62
    .line 63
    aget-byte v0, v0, v1

    .line 64
    .line 65
    and-int/lit16 v0, v0, 0xff

    .line 66
    .line 67
    or-int/2addr v0, v2

    .line 68
    return v0
.end method

.method public E()J
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->m:[B

    .line 2
    .line 3
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

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
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lg2/c0;->b(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/bi;->m:[B

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {p0, v1, v3, v2}, Lcom/umeng/analytics/pro/bi;->H([BII)I

    .line 35
    .line 36
    .line 37
    move v1, v3

    .line 38
    :goto_0
    aget-byte v3, v0, v1

    .line 39
    .line 40
    and-int/lit16 v3, v3, 0xff

    .line 41
    .line 42
    int-to-long v3, v3

    .line 43
    const/16 v5, 0x38

    .line 44
    .line 45
    shl-long/2addr v3, v5

    .line 46
    add-int/lit8 v5, v1, 0x1

    .line 47
    .line 48
    aget-byte v5, v0, v5

    .line 49
    .line 50
    and-int/lit16 v5, v5, 0xff

    .line 51
    .line 52
    int-to-long v5, v5

    .line 53
    const/16 v7, 0x30

    .line 54
    .line 55
    shl-long/2addr v5, v7

    .line 56
    or-long/2addr v3, v5

    .line 57
    add-int/lit8 v5, v1, 0x2

    .line 58
    .line 59
    aget-byte v5, v0, v5

    .line 60
    .line 61
    and-int/lit16 v5, v5, 0xff

    .line 62
    .line 63
    int-to-long v5, v5

    .line 64
    const/16 v7, 0x28

    .line 65
    .line 66
    shl-long/2addr v5, v7

    .line 67
    or-long/2addr v3, v5

    .line 68
    add-int/lit8 v5, v1, 0x3

    .line 69
    .line 70
    aget-byte v5, v0, v5

    .line 71
    .line 72
    and-int/lit16 v5, v5, 0xff

    .line 73
    .line 74
    int-to-long v5, v5

    .line 75
    const/16 v7, 0x20

    .line 76
    .line 77
    shl-long/2addr v5, v7

    .line 78
    or-long/2addr v3, v5

    .line 79
    add-int/lit8 v5, v1, 0x4

    .line 80
    .line 81
    aget-byte v5, v0, v5

    .line 82
    .line 83
    and-int/lit16 v5, v5, 0xff

    .line 84
    .line 85
    int-to-long v5, v5

    .line 86
    const/16 v7, 0x18

    .line 87
    .line 88
    shl-long/2addr v5, v7

    .line 89
    or-long/2addr v3, v5

    .line 90
    add-int/lit8 v5, v1, 0x5

    .line 91
    .line 92
    aget-byte v5, v0, v5

    .line 93
    .line 94
    and-int/lit16 v5, v5, 0xff

    .line 95
    .line 96
    int-to-long v5, v5

    .line 97
    const/16 v7, 0x10

    .line 98
    .line 99
    shl-long/2addr v5, v7

    .line 100
    or-long/2addr v3, v5

    .line 101
    add-int/lit8 v5, v1, 0x6

    .line 102
    .line 103
    aget-byte v5, v0, v5

    .line 104
    .line 105
    and-int/lit16 v5, v5, 0xff

    .line 106
    .line 107
    int-to-long v5, v5

    .line 108
    shl-long/2addr v5, v2

    .line 109
    or-long v2, v3, v5

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x7

    .line 112
    .line 113
    aget-byte v0, v0, v1

    .line 114
    .line 115
    and-int/lit16 v0, v0, 0xff

    .line 116
    .line 117
    int-to-long v0, v0

    .line 118
    or-long/2addr v0, v2

    .line 119
    return-wide v0
.end method

.method public F()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->E()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public G()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt v1, v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 16
    .line 17
    invoke-virtual {v2}, Lg2/c0;->f()[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lg2/s;->a:Lg2/c0;

    .line 22
    .line 23
    invoke-virtual {v3}, Lg2/c0;->g()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const-string v4, "UTF-8"

    .line 28
    .line 29
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lg2/c0;->b(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :catch_0
    new-instance v0, Lcom/umeng/analytics/pro/aw;

    .line 39
    .line 40
    const-string v1, "JVM DOES NOT SUPPORT UTF-8"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->K(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public final H([BII)I
    .locals 1

    .line 1
    invoke-virtual {p0, p3}, Lcom/umeng/analytics/pro/bi;->M(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lg2/c0;->e([BII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public I(B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->f:[B

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
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p1, v0, v1, v2}, Lg2/c0;->d([BII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public J(S)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->g:[B

    .line 2
    .line 3
    shr-int/lit8 v1, p1, 0x8

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    int-to-byte v1, v1

    .line 8
    const/4 v2, 0x0

    .line 9
    aput-byte v1, v0, v2

    .line 10
    .line 11
    and-int/lit16 p1, p1, 0xff

    .line 12
    .line 13
    int-to-byte p1, p1

    .line 14
    const/4 v1, 0x1

    .line 15
    aput-byte p1, v0, v1

    .line 16
    .line 17
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-virtual {p1, v0, v2, v1}, Lg2/c0;->d([BII)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public K(I)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bi;->M(I)V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [B

    .line 5
    .line 6
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v0, v2, p1}, Lg2/c0;->e([BII)I

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "UTF-8"

    .line 15
    .line 16
    invoke-direct {p1, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/aw;

    .line 21
    .line 22
    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public L(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/umeng/analytics/pro/bi;->d:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/bi;->e:Z

    .line 5
    .line 6
    return-void
.end method

.method public M(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/bi;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/umeng/analytics/pro/bi;->d:I

    .line 8
    .line 9
    sub-int/2addr v0, p1

    .line 10
    iput v0, p0, Lcom/umeng/analytics/pro/bi;->d:I

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "Message length exceeded: "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    return-void

    .line 39
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/bq;

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "Negative length: "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public a()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->D()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->M(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lg2/c0;->h()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lt v1, v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lg2/c0;->f()[B

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 23
    .line 24
    invoke-virtual {v2}, Lg2/c0;->g()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v1, v2, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lg2/c0;->b(I)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    new-array v1, v0, [B

    .line 39
    .line 40
    iget-object v2, p0, Lg2/s;->a:Lg2/c0;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-virtual {v2, v1, v3, v0}, Lg2/c0;->e([BII)I

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method

.method public d(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->h:[B

    .line 2
    .line 3
    shr-int/lit8 v1, p1, 0x18

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    int-to-byte v1, v1

    .line 8
    const/4 v2, 0x0

    .line 9
    aput-byte v1, v0, v2

    .line 10
    .line 11
    shr-int/lit8 v1, p1, 0x10

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    int-to-byte v1, v1

    .line 16
    const/4 v3, 0x1

    .line 17
    aput-byte v1, v0, v3

    .line 18
    .line 19
    shr-int/lit8 v1, p1, 0x8

    .line 20
    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    int-to-byte v1, v1

    .line 24
    const/4 v3, 0x2

    .line 25
    aput-byte v1, v0, v3

    .line 26
    .line 27
    and-int/lit16 p1, p1, 0xff

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    const/4 v1, 0x3

    .line 31
    aput-byte p1, v0, v1

    .line 32
    .line 33
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-virtual {p1, v0, v2, v1}, Lg2/c0;->d([BII)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bi;->i:[B

    .line 2
    .line 3
    const/16 v1, 0x38

    .line 4
    .line 5
    shr-long v1, p1, v1

    .line 6
    .line 7
    const-wide/16 v3, 0xff

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    long-to-int v1, v1

    .line 11
    int-to-byte v1, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v1, v0, v2

    .line 14
    .line 15
    const/16 v1, 0x30

    .line 16
    .line 17
    shr-long v5, p1, v1

    .line 18
    .line 19
    and-long/2addr v5, v3

    .line 20
    long-to-int v1, v5

    .line 21
    int-to-byte v1, v1

    .line 22
    const/4 v5, 0x1

    .line 23
    aput-byte v1, v0, v5

    .line 24
    .line 25
    const/16 v1, 0x28

    .line 26
    .line 27
    shr-long v5, p1, v1

    .line 28
    .line 29
    and-long/2addr v5, v3

    .line 30
    long-to-int v1, v5

    .line 31
    int-to-byte v1, v1

    .line 32
    const/4 v5, 0x2

    .line 33
    aput-byte v1, v0, v5

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    shr-long v5, p1, v1

    .line 38
    .line 39
    and-long/2addr v5, v3

    .line 40
    long-to-int v1, v5

    .line 41
    int-to-byte v1, v1

    .line 42
    const/4 v5, 0x3

    .line 43
    aput-byte v1, v0, v5

    .line 44
    .line 45
    const/16 v1, 0x18

    .line 46
    .line 47
    shr-long v5, p1, v1

    .line 48
    .line 49
    and-long/2addr v5, v3

    .line 50
    long-to-int v1, v5

    .line 51
    int-to-byte v1, v1

    .line 52
    const/4 v5, 0x4

    .line 53
    aput-byte v1, v0, v5

    .line 54
    .line 55
    const/16 v1, 0x10

    .line 56
    .line 57
    shr-long v5, p1, v1

    .line 58
    .line 59
    and-long/2addr v5, v3

    .line 60
    long-to-int v1, v5

    .line 61
    int-to-byte v1, v1

    .line 62
    const/4 v5, 0x5

    .line 63
    aput-byte v1, v0, v5

    .line 64
    .line 65
    const/16 v1, 0x8

    .line 66
    .line 67
    shr-long v5, p1, v1

    .line 68
    .line 69
    and-long/2addr v5, v3

    .line 70
    long-to-int v5, v5

    .line 71
    int-to-byte v5, v5

    .line 72
    const/4 v6, 0x6

    .line 73
    aput-byte v5, v0, v6

    .line 74
    .line 75
    and-long/2addr p1, v3

    .line 76
    long-to-int p1, p1

    .line 77
    int-to-byte p1, p1

    .line 78
    const/4 p2, 0x7

    .line 79
    aput-byte p1, v0, p2

    .line 80
    .line 81
    iget-object p1, p0, Lg2/s;->a:Lg2/c0;

    .line 82
    .line 83
    invoke-virtual {p1, v0, v2, v1}, Lg2/c0;->d([BII)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public f(Lg2/p;)V
    .locals 1

    .line 1
    iget-byte v0, p1, Lg2/p;->b:B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->I(B)V

    .line 4
    .line 5
    .line 6
    iget-short p1, p1, Lg2/p;->c:S

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bi;->J(S)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(Lg2/q;)V
    .locals 1

    .line 1
    iget-byte v0, p1, Lg2/q;->a:B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->I(B)V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Lg2/q;->b:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bi;->d(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public h(Lg2/r;)V
    .locals 1

    .line 1
    iget-byte v0, p1, Lg2/r;->a:B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->I(B)V

    .line 4
    .line 5
    .line 6
    iget-byte v0, p1, Lg2/r;->b:B

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->I(B)V

    .line 9
    .line 10
    .line 11
    iget p1, p1, Lg2/r;->c:I

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bi;->d(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public i(Lg2/u;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 3

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
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->d(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg2/s;->a:Lg2/c0;

    .line 12
    .line 13
    array-length v1, p1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, p1, v2, v1}, Lg2/c0;->d([BII)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/aw;

    .line 20
    .line 21
    const-string v0, "JVM DOES NOT SUPPORT UTF-8"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lcom/umeng/analytics/pro/aw;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public k(Ljava/nio/ByteBuffer;)V
    .locals 4

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
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->d(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lg2/s;->a:Lg2/c0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/2addr v3, p1

    .line 28
    invoke-virtual {v1, v2, v3, v0}, Lg2/c0;->d([BII)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public l()V
    .locals 0

    .line 1
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
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bi;->I(B)V

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
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bi;->n:Lg2/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()V
    .locals 0

    .line 1
    return-void
.end method

.method public s()Lg2/p;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

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
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->C()S

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    new-instance v2, Lg2/p;

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    invoke-direct {v2, v3, v0, v1}, Lg2/p;-><init>(Ljava/lang/String;BS)V

    .line 18
    .line 19
    .line 20
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
    new-instance v0, Lg2/r;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->D()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v0, v1, v2, v3}, Lg2/r;-><init>(BBI)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w()Lg2/q;
    .locals 3

    .line 1
    new-instance v0, Lg2/q;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->D()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, Lg2/q;-><init>(BI)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public x()V
    .locals 0

    .line 1
    return-void
.end method

.method public y()Lg2/t;
    .locals 3

    .line 1
    new-instance v0, Lg2/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->B()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bi;->D()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, Lg2/t;-><init>(BI)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public z()V
    .locals 0

    .line 1
    return-void
.end method
