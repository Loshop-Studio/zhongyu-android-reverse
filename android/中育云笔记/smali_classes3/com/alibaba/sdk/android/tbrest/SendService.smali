.class public Lcom/alibaba/sdk/android/tbrest/SendService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;
    }
.end annotation


# static fields
.field static final instance:Lcom/alibaba/sdk/android/tbrest/SendService;


# instance fields
.field public appId:Ljava/lang/String;

.field public appKey:Ljava/lang/String;

.field public appSecret:Ljava/lang/String;

.field public appVersion:Ljava/lang/String;

.field public channel:Ljava/lang/String;

.field public context:Landroid/content/Context;

.field public country:Ljava/lang/String;

.field public host:Ljava/lang/String;

.field public openHttp:Ljava/lang/Boolean;

.field private sendAsyncExecutor:Lcom/alibaba/sdk/android/tbrest/a;

.field public userNick:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/sdk/android/tbrest/SendService;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/sdk/android/tbrest/SendService;->instance:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appSecret:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->channel:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->openHttp:Ljava/lang/Boolean;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->country:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/a;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/alibaba/sdk/android/tbrest/a;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->sendAsyncExecutor:Lcom/alibaba/sdk/android/tbrest/a;

    .line 33
    .line 34
    return-void
.end method

.method private canSend()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "have send args is null\uff0cyou must init first. appId "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " appVersion "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, " appKey "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    return-object v0
.end method

.method public static getInstance()Lcom/alibaba/sdk/android/tbrest/SendService;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/SendService;->instance:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public changeHost(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public getAppKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getChangeHost()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->channel:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public sendRequest(Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/alibaba/sdk/android/tbrest/SendService;->canSend()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_0
    move-object v3, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-string p1, "h-adashx.ut.taobao.com"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :goto_1
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-wide v4, p2

    .line 28
    move-object/from16 v6, p4

    .line 29
    .line 30
    move/from16 v7, p5

    .line 31
    .line 32
    move-object/from16 v8, p6

    .line 33
    .line 34
    move-object/from16 v9, p7

    .line 35
    .line 36
    move-object/from16 v10, p8

    .line 37
    .line 38
    move-object/from16 v11, p9

    .line 39
    .line 40
    invoke-static/range {v0 .. v11}, Lcom/alibaba/sdk/android/tbrest/rest/f;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    return-object p1
.end method

.method public sendRequestAsyn(Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/alibaba/sdk/android/tbrest/SendService;->canSend()Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object v0, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string v0, "h-adashx.ut.taobao.com"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object/from16 v6, p1

    .line 25
    .line 26
    :goto_1
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;

    .line 27
    .line 28
    iget-object v4, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 31
    .line 32
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    const-string v3, "rest thread"

    .line 35
    .line 36
    move-object/from16 v2, p0

    .line 37
    .line 38
    move-wide/from16 v7, p2

    .line 39
    .line 40
    move-object/from16 v9, p4

    .line 41
    .line 42
    move/from16 v10, p5

    .line 43
    .line 44
    move-object/from16 v11, p6

    .line 45
    .line 46
    move-object/from16 v12, p7

    .line 47
    .line 48
    move-object/from16 v13, p8

    .line 49
    .line 50
    move-object/from16 v14, p9

    .line 51
    .line 52
    invoke-direct/range {v0 .. v15}, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;-><init>(Lcom/alibaba/sdk/android/tbrest/SendService;Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Boolean;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->sendAsyncExecutor:Lcom/alibaba/sdk/android/tbrest/a;

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lcom/alibaba/sdk/android/tbrest/a;->a(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public sendRequestAsynByAppkeyAndUrl(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/alibaba/sdk/android/tbrest/SendService;->canSend()Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string v0, "RestApi"

    .line 16
    .line 17
    const-string v2, "need set url"

    .line 18
    .line 19
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    if-nez p2, :cond_1

    .line 24
    .line 25
    iget-object v0, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object/from16 v4, p2

    .line 30
    .line 31
    :goto_0
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;

    .line 32
    .line 33
    iget-object v5, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 34
    .line 35
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    const-string v3, "rest thread"

    .line 38
    .line 39
    move-object/from16 v2, p0

    .line 40
    .line 41
    move-object/from16 v6, p1

    .line 42
    .line 43
    move-wide/from16 v7, p3

    .line 44
    .line 45
    move-object/from16 v9, p5

    .line 46
    .line 47
    move/from16 v10, p6

    .line 48
    .line 49
    move-object/from16 v11, p7

    .line 50
    .line 51
    move-object/from16 v12, p8

    .line 52
    .line 53
    move-object/from16 v13, p9

    .line 54
    .line 55
    move-object/from16 v14, p10

    .line 56
    .line 57
    invoke-direct/range {v0 .. v15}, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;-><init>(Lcom/alibaba/sdk/android/tbrest/SendService;Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Boolean;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->sendAsyncExecutor:Lcom/alibaba/sdk/android/tbrest/a;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lcom/alibaba/sdk/android/tbrest/a;->a(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public sendRequestByUrl(Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/alibaba/sdk/android/tbrest/SendService;->canSend()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appKey:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-wide v4, p2

    .line 18
    move-object/from16 v6, p4

    .line 19
    .line 20
    move/from16 v7, p5

    .line 21
    .line 22
    move-object/from16 v8, p6

    .line 23
    .line 24
    move-object/from16 v9, p7

    .line 25
    .line 26
    move-object/from16 v10, p8

    .line 27
    .line 28
    move-object/from16 v11, p9

    .line 29
    .line 30
    invoke-static/range {v0 .. v11}, Lcom/alibaba/sdk/android/tbrest/rest/f;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    return-object v1

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method

.method public updateAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public updateChannel(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->channel:Ljava/lang/String;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public updateUserNick(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    .line 4
    .line 5
    :cond_0
    return-void
.end method
