.class public abstract Lt5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lt5/m;)Lcom/huawei/hms/push/k;
    .locals 3

    .line 1
    sget-object v0, Lcom/huawei/hms/push/k;->c:Lcom/huawei/hms/push/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Lt5/m;->I()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lt5/m;->I()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {}, Lcom/huawei/hms/push/k;->values()[Lcom/huawei/hms/push/k;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    array-length v2, v2

    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/huawei/hms/push/k;->values()[Lcom/huawei/hms/push/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Lt5/m;->I()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    aget-object p0, v0, p0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static b(Landroid/app/Notification$Builder;Ljava/lang/String;Lt5/m;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/app/Notification$BigTextStyle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lt5/m;->o()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Lt5/m;->o()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {v0, p2}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 41
    .line 42
    .line 43
    return-void
.end method
