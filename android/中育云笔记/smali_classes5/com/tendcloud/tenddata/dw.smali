.class public final Lcom/tendcloud/tenddata/dw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/dw$a;
    }
.end annotation


# static fields
.field public static a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/dw;->a:Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/dw;->a(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/dw$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dw;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/dw;
    .locals 1

    .line 2
    invoke-static {}, Lcom/tendcloud/tenddata/dw$a;->access$000()Lcom/tendcloud/tenddata/dw;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/co;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/tendcloud/tenddata/dw$1;

    invoke-direct {v1, p0, p1}, Lcom/tendcloud/tenddata/dw$1;-><init>(Lcom/tendcloud/tenddata/dw;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method
