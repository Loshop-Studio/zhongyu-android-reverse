.class public Lcom/tencent/liteav/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;I)Lcom/tencent/liteav/i;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance p1, Lcom/tencent/liteav/c;

    invoke-direct {p1, p0}, Lcom/tencent/liteav/c;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 2
    :cond_1
    :goto_0
    new-instance p1, Lcom/tencent/liteav/g;

    invoke-direct {p1, p0}, Lcom/tencent/liteav/g;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 3
    const-string v0, ""

    return-object v0
.end method
