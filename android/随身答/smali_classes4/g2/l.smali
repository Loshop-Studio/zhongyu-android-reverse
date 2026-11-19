.class public abstract Lg2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(BIZ)B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lg2/l;->b(IIZ)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-byte p0, p0

    .line 6
    return p0
.end method

.method public static final b(IIZ)I
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    shl-int p1, p2, p1

    .line 5
    .line 6
    or-int/2addr p0, p1

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-static {p0, p1}, Lg2/l;->e(II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static final c(BI)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg2/l;->d(II)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final d(II)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-int p1, v0, p1

    .line 3
    .line 4
    and-int/2addr p0, p1

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public static final e(II)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-int p1, v0, p1

    .line 3
    .line 4
    not-int p1, p1

    .line 5
    and-int/2addr p0, p1

    .line 6
    return p0
.end method
