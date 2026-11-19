.class public abstract Ll2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(JI)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p2, :cond_1

    .line 3
    .line 4
    const/16 v1, 0x3f

    .line 5
    .line 6
    if-le p2, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-wide/16 v1, 0x1

    .line 10
    .line 11
    shl-long/2addr v1, p2

    .line 12
    and-long/2addr p0, v1

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    cmp-long p0, p0, v1

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v0
.end method
