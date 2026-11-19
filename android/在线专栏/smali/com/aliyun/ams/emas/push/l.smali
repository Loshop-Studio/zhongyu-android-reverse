.class public Lcom/aliyun/ams/emas/push/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/alibaba/sdk/android/logger/ILog;

.field public static b:Ljava/lang/String;

.field private static c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static d:Lcom/aliyun/ams/emas/push/j;

.field private static e:Lcom/aliyun/ams/emas/push/d;

.field private static f:I

.field private static g:I

.field private static h:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "[MPS]"

    .line 1
    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->getLogger(Ljava/lang/Object;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    sput-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "com.alibaba.sdk.android.push.NOTIFY_ACTION"

    .line 2
    sput-object v0, Lcom/aliyun/ams/emas/push/l;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    sput-object v0, Lcom/aliyun/ams/emas/push/l;->c:Ljava/lang/Class;

    .line 4
    sput-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    .line 5
    sput-object v0, Lcom/aliyun/ams/emas/push/l;->e:Lcom/aliyun/ams/emas/push/d;

    const/4 v1, 0x0

    .line 6
    sput v1, Lcom/aliyun/ams/emas/push/l;->f:I

    .line 7
    sput v1, Lcom/aliyun/ams/emas/push/l;->g:I

    .line 8
    sput-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    return-void
.end method

.method public static a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public static b(IIIILcom/aliyun/ams/emas/push/a;)V
    .locals 6

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/aliyun/ams/emas/push/j;->a(IIIILcom/aliyun/ams/emas/push/a;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/aliyun/ams/emas/push/j;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/aliyun/ams/emas/push/j;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->e:Lcom/aliyun/ams/emas/push/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0, p1, p2}, Lcom/aliyun/ams/emas/push/d;->reportPushArrive(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static e(Lcom/aliyun/ams/emas/push/d;)V
    .locals 0

    sput-object p0, Lcom/aliyun/ams/emas/push/l;->e:Lcom/aliyun/ams/emas/push/d;

    return-void
.end method

.method public static f(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 1

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    invoke-virtual {v0, p0}, Lcom/aliyun/ams/emas/push/j;->b(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V

    return-void
.end method

.method public static g(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    sput-object p0, Lcom/aliyun/ams/emas/push/l;->c:Ljava/lang/Class;

    return-void
.end method

.method public static h(Z)V
    .locals 1

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    invoke-virtual {v0, p0}, Lcom/aliyun/ams/emas/push/j;->c(Z)V

    return-void
.end method

.method public static i(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 1

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    invoke-virtual {v0, p0}, Lcom/aliyun/ams/emas/push/j;->e(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V

    return-void
.end method

.method public static j()Z
    .locals 1

    sget-object v0, Lcom/aliyun/ams/emas/push/l;->d:Lcom/aliyun/ams/emas/push/j;

    invoke-virtual {v0}, Lcom/aliyun/ams/emas/push/j;->d()Z

    move-result v0

    return v0
.end method

.method public static k()I
    .locals 3

    .line 1
    sget v0, Lcom/aliyun/ams/emas/push/l;->g:I

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    sput-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    .line 4
    :cond_0
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    const v1, 0xf4240

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    sput v0, Lcom/aliyun/ams/emas/push/l;->g:I

    if-gez v0, :cond_1

    mul-int/lit8 v0, v0, -0x1

    .line 5
    sput v0, Lcom/aliyun/ams/emas/push/l;->g:I

    .line 6
    :cond_1
    sget v0, Lcom/aliyun/ams/emas/push/l;->g:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/aliyun/ams/emas/push/l;->g:I

    return v0
.end method

.method public static l()I
    .locals 3

    .line 1
    sget v0, Lcom/aliyun/ams/emas/push/l;->f:I

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    sput-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    .line 4
    :cond_0
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->h:Ljava/util/Random;

    const v1, 0xf4240

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    sput v0, Lcom/aliyun/ams/emas/push/l;->f:I

    if-gez v0, :cond_1

    mul-int/lit8 v0, v0, -0x1

    .line 5
    sput v0, Lcom/aliyun/ams/emas/push/l;->f:I

    .line 6
    :cond_1
    sget v0, Lcom/aliyun/ams/emas/push/l;->f:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/aliyun/ams/emas/push/l;->f:I

    return v0
.end method
