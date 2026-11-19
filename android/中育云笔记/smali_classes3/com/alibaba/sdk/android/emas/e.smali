.class public Lcom/alibaba/sdk/android/emas/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field timestamp:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/e;->e:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/sdk/android/emas/e;->d:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/alibaba/sdk/android/emas/e;->timestamp:J

    .line 9
    .line 10
    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/alibaba/sdk/android/emas/e;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 5
    :cond_0
    const-string v1, "eventId"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    const-string v2, "rawLog"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 7
    const-string v3, "timestamp"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    const-wide/16 v5, 0x0

    cmp-long p0, v3, v5

    if-nez p0, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    new-instance p0, Lcom/alibaba/sdk/android/emas/e;

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/alibaba/sdk/android/emas/e;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object p0

    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    :try_start_0
    const-string v1, "eventId"

    iget-object v2, p0, Lcom/alibaba/sdk/android/emas/e;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    const-string v1, "rawLog"

    iget-object v2, p0, Lcom/alibaba/sdk/android/emas/e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    const-string v1, "timestamp"

    iget-wide v2, p0, Lcom/alibaba/sdk/android/emas/e;->timestamp:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public length()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/e;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "UTF-8"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v0, v0

    .line 14
    return v0
.end method
