.class public abstract Lj0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([B)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    array-length v1, p0

    .line 5
    const/4 v2, 0x4

    .line 6
    if-le v1, v2, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    array-length v2, p0

    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-byte v2, p0, v0

    .line 14
    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    array-length v3, p0

    .line 18
    sub-int/2addr v3, v0

    .line 19
    add-int/lit8 v3, v3, -0x1

    .line 20
    .line 21
    mul-int/lit8 v3, v3, 0x8

    .line 22
    .line 23
    shl-int/2addr v2, v3

    .line 24
    or-int/2addr v1, v2

    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1

    .line 29
    :cond_2
    :goto_1
    return v0
.end method

.method public static b([BII)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-ltz p2, :cond_2

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    add-int v2, p1, p2

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-array v1, p2, [B

    .line 15
    .line 16
    :goto_0
    if-ge v0, p2, :cond_1

    .line 17
    .line 18
    aget-byte v2, p0, p1

    .line 19
    .line 20
    aput-byte v2, v1, v0

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {v1}, Lj0/b;->a([B)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_2
    :goto_1
    return v0
.end method

.method public static c(I)[B
    .locals 3

    .line 1
    shr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    int-to-byte v0, v0

    .line 6
    and-int/lit16 p0, p0, 0xff

    .line 7
    .line 8
    int-to-byte p0, p0

    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v0, v1, v2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-byte p0, v1, v0

    .line 17
    .line 18
    return-object v1
.end method

.method public static d(I)[B
    .locals 4

    .line 1
    shr-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    int-to-byte v0, v0

    .line 6
    shr-int/lit8 v1, p0, 0x8

    .line 7
    .line 8
    and-int/lit16 v1, v1, 0xff

    .line 9
    .line 10
    int-to-byte v1, v1

    .line 11
    and-int/lit16 p0, p0, 0xff

    .line 12
    .line 13
    int-to-byte p0, p0

    .line 14
    const/4 v2, 0x3

    .line 15
    new-array v2, v2, [B

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-byte v0, v2, v3

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aput-byte v1, v2, v0

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    aput-byte p0, v2, v0

    .line 25
    .line 26
    return-object v2
.end method

.method public static e(I)[B
    .locals 5

    .line 1
    shr-int/lit8 v0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    int-to-byte v0, v0

    .line 6
    shr-int/lit8 v1, p0, 0x10

    .line 7
    .line 8
    and-int/lit16 v1, v1, 0xff

    .line 9
    .line 10
    int-to-byte v1, v1

    .line 11
    shr-int/lit8 v2, p0, 0x8

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    int-to-byte v2, v2

    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    int-to-byte p0, p0

    .line 19
    const/4 v3, 0x4

    .line 20
    new-array v3, v3, [B

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-byte v0, v3, v4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput-byte v1, v3, v0

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    aput-byte v2, v3, v0

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    aput-byte p0, v3, v0

    .line 33
    .line 34
    return-object v3
.end method
