.class public Lcom/tendcloud/tenddata/dp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/dp$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl"

.field private static final b:Ljava/lang/String; = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR"

.field private static c:Lcom/tendcloud/tenddata/dp;


# instance fields
.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/dp;->d:Ljava/util/Map;

    .line 6
    .line 7
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/dp;
    .locals 2

    .line 3
    sget-object v0, Lcom/tendcloud/tenddata/dp;->c:Lcom/tendcloud/tenddata/dp;

    if-nez v0, :cond_1

    .line 4
    const-class v0, Lcom/tendcloud/tenddata/dp;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/dp;->c:Lcom/tendcloud/tenddata/dp;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/tendcloud/tenddata/dp;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/dp;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/dp;->c:Lcom/tendcloud/tenddata/dp;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 8
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/dp;->c:Lcom/tendcloud/tenddata/dp;

    return-object v0
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/dp;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/dp;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pageUrl"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "shortUrl"

    .line 11
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "is_retargeting"

    .line 12
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "hAF3uVnSYyk2qN3trMjXFVsijBTGcR"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/dp;)Ljava/util/Map;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tendcloud/tenddata/dp;->d:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lcom/tendcloud/tenddata/dp;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/tendcloud/tenddata/dp;"
        }
    .end annotation

    .line 9
    iput-object p1, p0, Lcom/tendcloud/tenddata/dp;->d:Ljava/util/Map;

    return-object p0
.end method

.method public getShortUrl(Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/tendcloud/tenddata/dp$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/tendcloud/tenddata/dp$1;-><init>(Lcom/tendcloud/tenddata/dp;Lcom/tendcloud/tenddata/TDGenerateUrl;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
