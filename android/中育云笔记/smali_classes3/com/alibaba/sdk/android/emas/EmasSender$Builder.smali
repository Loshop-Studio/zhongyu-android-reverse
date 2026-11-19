.class public final Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/sdk/android/emas/EmasSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appId:Ljava/lang/String;

.field private appKey:Ljava/lang/String;

.field private appSecret:Ljava/lang/String;

.field private appVersion:Ljava/lang/String;

.field private businessKey:Ljava/lang/String;

.field private cache:Z

.field private cacheLimitCapacity:I

.field private cacheLimitCount:I

.field private channel:Ljava/lang/String;

.field private context:Landroid/app/Application;

.field private diskCache:Z

.field private diskCacheLimitCapacity:I

.field private diskCacheLimitCount:I

.field private diskCacheLimitDay:I

.field private host:Ljava/lang/String;

.field private maxSendDiskCacheQueueCount:I

.field private openHttp:Z

.field private preSendHandler:Lcom/alibaba/sdk/android/emas/PreSendHandler;

.field private sendDiskCacheBackground:Z

.field private singleLogLimitCapacity:I

.field private userNick:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "common"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->businessKey:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cache:Z

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    iput v1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cacheLimitCount:I

    .line 14
    .line 15
    const v1, 0x32000

    .line 16
    .line 17
    .line 18
    iput v1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->singleLogLimitCapacity:I

    .line 19
    .line 20
    const/high16 v1, 0x200000

    .line 21
    .line 22
    iput v1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cacheLimitCapacity:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCache:Z

    .line 25
    .line 26
    const/16 v0, 0x32

    .line 27
    .line 28
    iput v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitCount:I

    .line 29
    .line 30
    const/high16 v0, 0x6400000

    .line 31
    .line 32
    iput v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitCapacity:I

    .line 33
    .line 34
    const/4 v0, 0x5

    .line 35
    iput v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitDay:I

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->sendDiskCacheBackground:Z

    .line 39
    .line 40
    iput v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->maxSendDiskCacheQueueCount:I

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic access$000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->singleLogLimitCapacity:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCache:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1100(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->channel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->userNick:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1300(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appSecret:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->openHttp:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1500(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->sendDiskCacheBackground:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1600(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->maxSendDiskCacheQueueCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1700(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Lcom/alibaba/sdk/android/emas/PreSendHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->preSendHandler:Lcom/alibaba/sdk/android/emas/PreSendHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cache:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1900(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cacheLimitCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Landroid/app/Application;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->context:Landroid/app/Application;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cacheLimitCapacity:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->host:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->businessKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$700(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitCapacity:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$800(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitDay:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$900(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public appId(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public appKey(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public appSecret(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appSecret:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public appVersion(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->appVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public build()Lcom/alibaba/sdk/android/emas/EmasSender;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/sdk/android/emas/EmasSender;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/alibaba/sdk/android/emas/EmasSender;-><init>(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;Lcom/alibaba/sdk/android/emas/EmasSender$1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public businessKey(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->businessKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public cache(Z)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cache:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public cacheLimitCount(I)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->cacheLimitCount:I

    .line 2
    .line 3
    return-object p0
.end method

.method public channel(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->channel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public context(Landroid/app/Application;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->context:Landroid/app/Application;

    .line 2
    .line 3
    return-object p0
.end method

.method public diskCache(Z)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCache:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public diskCacheLimitCount(I)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitCount:I

    .line 2
    .line 3
    return-object p0
.end method

.method public diskCacheLimitDay(I)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->diskCacheLimitDay:I

    .line 2
    .line 3
    return-object p0
.end method

.method public host(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->host:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public openHttp(Z)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->openHttp:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public preSendHandler(Lcom/alibaba/sdk/android/emas/PreSendHandler;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->preSendHandler:Lcom/alibaba/sdk/android/emas/PreSendHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public setMaxSendDiskCacheQueueCount(I)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->maxSendDiskCacheQueueCount:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setSendDiskCacheBackground(Z)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->sendDiskCacheBackground:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public userNick(Ljava/lang/String;)Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->userNick:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
