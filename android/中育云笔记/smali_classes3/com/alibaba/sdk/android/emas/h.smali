.class public Lcom/alibaba/sdk/android/emas/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/emas/h$a;,
        Lcom/alibaba/sdk/android/emas/h$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field private a:Lcom/alibaba/sdk/android/emas/PreSendHandler;

.field private b:Lcom/alibaba/sdk/android/emas/EmasSender;

.field private b:Z

.field private e:I

.field private mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

.field private mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-direct {v6, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v7, Lcom/alibaba/sdk/android/emas/h$a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v7, v1}, Lcom/alibaba/sdk/android/emas/h$a;-><init>(Lcom/alibaba/sdk/android/emas/h$1;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    const/4 v2, 0x3

    .line 20
    const-wide/16 v3, 0xa

    .line 21
    .line 22
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/alibaba/sdk/android/emas/h;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/sdk/android/emas/EmasSender;Lcom/alibaba/sdk/android/emas/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/h;->b:Z

    .line 6
    .line 7
    iput v0, p0, Lcom/alibaba/sdk/android/emas/h;->e:I

    .line 8
    .line 9
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/h;->b:Lcom/alibaba/sdk/android/emas/EmasSender;

    .line 10
    .line 11
    new-instance p1, Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/alibaba/sdk/android/tbrest/SendService;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/alibaba/sdk/android/emas/h;->mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/h;->e:I

    return p0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/EmasSender;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/h;->b:Lcom/alibaba/sdk/android/emas/EmasSender;

    return-object p0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/PreSendHandler;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/h;->a:Lcom/alibaba/sdk/android/emas/PreSendHandler;

    return-object p0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/h;->mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

    return-object p0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/tbrest/SendService;
    .locals 0

    .line 5
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    return-object p0
.end method

.method public static synthetic a()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    .line 6
    sget-object v0, Lcom/alibaba/sdk/android/emas/h;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/emas/h;Lcom/alibaba/sdk/android/emas/d;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/alibaba/sdk/android/emas/h;->c(Lcom/alibaba/sdk/android/emas/d;)V

    return-void
.end method

.method private c(Lcom/alibaba/sdk/android/emas/d;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/sdk/android/emas/h;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/sdk/android/emas/h$b;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/alibaba/sdk/android/emas/h;->b:Z

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/sdk/android/emas/h;->e:I

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, v2, v3}, Lcom/alibaba/sdk/android/emas/h$b;-><init>(Lcom/alibaba/sdk/android/emas/h;Lcom/alibaba/sdk/android/emas/d;ZI)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()Lcom/alibaba/sdk/android/tbrest/SendService;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 p1, 0x9

    .line 11
    iput p1, p0, Lcom/alibaba/sdk/android/emas/h;->e:I

    return-void

    .line 12
    :cond_0
    iput p1, p0, Lcom/alibaba/sdk/android/emas/h;->e:I

    return-void
.end method

.method public a(Lcom/alibaba/sdk/android/emas/PreSendHandler;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/h;->a:Lcom/alibaba/sdk/android/emas/PreSendHandler;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    iput-object p1, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->appSecret:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;)V"
        }
    .end annotation

    .line 13
    new-instance v0, Lcom/alibaba/sdk/android/emas/d;

    invoke-direct {v0, p1}, Lcom/alibaba/sdk/android/emas/d;-><init>(Ljava/util/List;)V

    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/h;->c(Lcom/alibaba/sdk/android/emas/d;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/h;->b:Z

    return-void
.end method

.method public b(Lcom/alibaba/sdk/android/emas/e;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/alibaba/sdk/android/emas/h;->a(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/alibaba/sdk/android/emas/h;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Thread;

    .line 19
    .line 20
    new-instance v1, Lcom/alibaba/sdk/android/emas/h$1;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/alibaba/sdk/android/emas/h$1;-><init>(Lcom/alibaba/sdk/android/emas/h;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move-object v6, p6

    .line 12
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/sdk/android/tbrest/SendService;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public openHttp(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->openHttp:Ljava/lang/Boolean;

    .line 8
    .line 9
    return-void
.end method

.method public setHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/tbrest/SendService;->changeHost(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUserNick(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    .line 4
    .line 5
    return-void
.end method
