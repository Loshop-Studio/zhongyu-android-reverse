.class public Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/sdk/android/tbrest/SendService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RestThread"
.end annotation


# instance fields
.field private aArg1:Ljava/lang/Object;

.field private aArg2:Ljava/lang/Object;

.field private aArg3:Ljava/lang/Object;

.field private aEventId:I

.field private aExtData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private aPage:Ljava/lang/String;

.field private aTimestamp:J

.field private adashxServerHost:Ljava/lang/String;

.field private appKey:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private isUrl:Ljava/lang/Boolean;

.field private mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

.field final synthetic this$0:Lcom/alibaba/sdk/android/tbrest/SendService;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/tbrest/SendService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->this$0:Lcom/alibaba/sdk/android/tbrest/SendService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->isUrl:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/sdk/android/tbrest/SendService;Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
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
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->this$0:Lcom/alibaba/sdk/android/tbrest/SendService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p5, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->context:Landroid/content/Context;

    .line 5
    iput-object p6, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->adashxServerHost:Ljava/lang/String;

    .line 6
    iput-wide p7, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aTimestamp:J

    .line 7
    iput-object p9, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aPage:Ljava/lang/String;

    .line 8
    iput p10, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aEventId:I

    .line 9
    iput-object p11, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg1:Ljava/lang/Object;

    .line 10
    iput-object p12, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg2:Ljava/lang/Object;

    .line 11
    iput-object p13, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg3:Ljava/lang/Object;

    .line 12
    iput-object p14, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aExtData:Ljava/util/Map;

    .line 13
    iput-object p4, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->appKey:Ljava/lang/String;

    .line 14
    iput-object p15, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->isUrl:Ljava/lang/Boolean;

    .line 15
    iput-object p2, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->isUrl:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->appKey:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->context:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v4, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->adashxServerHost:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v5, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aTimestamp:J

    .line 18
    .line 19
    iget-object v7, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aPage:Ljava/lang/String;

    .line 20
    .line 21
    iget v8, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aEventId:I

    .line 22
    .line 23
    iget-object v9, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg1:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v10, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg2:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v11, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg3:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v12, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aExtData:Ljava/util/Map;

    .line 30
    .line 31
    invoke-static/range {v1 .. v12}, Lcom/alibaba/sdk/android/tbrest/rest/f;->b(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->mSendService:Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->appKey:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->context:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->adashxServerHost:Ljava/lang/String;

    .line 44
    .line 45
    iget-wide v5, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aTimestamp:J

    .line 46
    .line 47
    iget-object v7, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aPage:Ljava/lang/String;

    .line 48
    .line 49
    iget v8, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aEventId:I

    .line 50
    .line 51
    iget-object v9, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg1:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v10, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg2:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v11, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aArg3:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v12, p0, Lcom/alibaba/sdk/android/tbrest/SendService$RestThread;->aExtData:Ljava/util/Map;

    .line 58
    .line 59
    invoke-static/range {v1 .. v12}, Lcom/alibaba/sdk/android/tbrest/rest/f;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_0
    const-string v1, "send log asyn error "

    .line 64
    .line 65
    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
