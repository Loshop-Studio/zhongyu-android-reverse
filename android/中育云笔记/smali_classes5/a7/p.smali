.class public abstract La7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:J

.field public static b:Ljava/lang/String;


# direct methods
.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, La7/p;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static b()Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, La7/p;->a:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x3e8

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    sput-wide v0, La7/p;->a:J

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, La7/p;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, La7/p;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Lj6/b;->c()Lj6/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lj6/b;->b()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-static {}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->m()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    invoke-static {v0, p1, p0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 42
    .line 43
    .line 44
    sput-object p1, La7/p;->b:Ljava/lang/String;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    new-instance v0, La7/p$a;

    .line 48
    .line 49
    invoke-direct {v0, p0, p1}, La7/p$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->n(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
