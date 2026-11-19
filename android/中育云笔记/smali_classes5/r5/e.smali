.class public Lr5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/e$b;,
        Lr5/e$a;
    }
.end annotation


# static fields
.field public static b:Lr5/e;

.field public static c:Lr5/e;

.field public static d:Lr5/e;


# instance fields
.field public a:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lr5/e;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr5/e;

    .line 7
    .line 8
    invoke-direct {v0}, Lr5/e;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lr5/e;

    .line 12
    .line 13
    invoke-direct {v0}, Lr5/e;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lr5/e;->b:Lr5/e;

    .line 17
    .line 18
    new-instance v0, Lr5/e;

    .line 19
    .line 20
    invoke-direct {v0}, Lr5/e;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lr5/e;->c:Lr5/e;

    .line 24
    .line 25
    new-instance v0, Lr5/e;

    .line 26
    .line 27
    invoke-direct {v0}, Lr5/e;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lr5/e;->d:Lr5/e;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 5
    .line 6
    const/16 v0, 0x1388

    .line 7
    .line 8
    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    new-instance v7, Lr5/e$b;

    .line 16
    .line 17
    invoke-direct {v7}, Lr5/e$b;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const-wide/32 v3, 0xea60

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lr5/e;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 29
    .line 30
    return-void
.end method

.method public static a()Lr5/e;
    .locals 1

    .line 1
    sget-object v0, Lr5/e;->d:Lr5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static c()Lr5/e;
    .locals 1

    .line 1
    sget-object v0, Lr5/e;->c:Lr5/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d()Lr5/e;
    .locals 1

    .line 1
    sget-object v0, Lr5/e;->b:Lr5/e;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b(Lr5/u;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lr5/e;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v1, Lr5/e$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lr5/e$a;-><init>(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    const-string p1, "hmsSdk"

    .line 13
    .line 14
    const-string v0, "addToQueue() Exception has happened!Form rejected execution"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
