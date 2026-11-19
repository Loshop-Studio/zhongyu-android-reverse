.class public Lcom/tencent/liteav/network/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/network/m$a;
    }
.end annotation


# static fields
.field protected static a:Lcom/tencent/liteav/network/m;


# instance fields
.field private b:Landroid/content/Context;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/network/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/network/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/liteav/network/m;->a:Lcom/tencent/liteav/network/m;

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
    iput-object v0, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    .line 6
    .line 7
    const-wide/16 v0, 0x3

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/liteav/network/m;->c:J

    .line 10
    .line 11
    return-void
.end method

.method private a(Ljava/lang/String;Z)Lcom/tencent/liteav/network/m$a;
    .locals 24

    move-object/from16 v1, p0

    .line 33
    const-string v0, "avgAudioQue"

    const-string v2, "avgVideoQue"

    const-string v3, "avgBlockCnt"

    const-string v4, "networkRTT"

    const-string v5, ""

    invoke-direct/range {p0 .. p1}, Lcom/tencent/liteav/network/m;->b(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    return-object v7

    .line 34
    :cond_0
    :try_start_0
    iget-object v6, v1, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    const-string v8, "com.tencent.liteav.network"

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 35
    const-string v8, "34238512-C08C-4931-A000-40E1D8B5BA5B"

    invoke-interface {v6, v8, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 36
    invoke-direct {v1, v6}, Lcom/tencent/liteav/network/m;->b(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    return-object v7

    .line 37
    :cond_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v6, p1

    .line 38
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_2

    return-object v7

    :cond_2
    if-eqz p2, :cond_3

    .line 39
    const-string v8, "DomainArrayData"

    goto :goto_0

    :catch_0
    move-exception v0

    move-object/from16 v18, v7

    goto/16 :goto_2

    :cond_3
    const-string v8, "OriginArrayData"

    :goto_0
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-nez v6, :cond_4

    return-object v7

    .line 40
    :cond_4
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v10, v8

    const-wide/16 v12, 0x0

    cmp-long v8, v10, v12

    if-nez v8, :cond_5

    return-object v7

    :cond_5
    const/4 v8, 0x0

    move-object v12, v5

    move-object/from16 v18, v7

    move/from16 p1, v8

    move/from16 v5, p1

    move v13, v5

    move v14, v9

    move v9, v13

    :goto_1
    int-to-long v7, v14

    cmp-long v7, v7, v10

    if-gez v7, :cond_6

    .line 41
    :try_start_1
    invoke-virtual {v6, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    move v8, v14

    .line 42
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v14

    long-to-float v14, v14

    add-float v19, p1, v14

    float-to-double v14, v5

    .line 43
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v16

    add-double v14, v14, v16

    double-to-float v5, v14

    float-to-double v14, v9

    .line 44
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v16

    add-double v14, v14, v16

    double-to-float v9, v14

    float-to-double v13, v13

    .line 45
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v15

    add-double/2addr v13, v15

    double-to-float v13, v13

    .line 46
    const-string v14, "%s \n isDomainAddressBetter\uff1aitemData domain = %b NetworkRTT = %d avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f"

    move v15, v13

    .line 47
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v17

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v20

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    move-object/from16 v23, v20

    move-object/from16 v20, v0

    move-object v0, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v23

    move-object/from16 v23, v17

    move-object/from16 v17, v7

    move v7, v15

    move-object/from16 v15, v23

    filled-new-array/range {v12 .. v17}, [Ljava/lang/Object;

    move-result-object v12

    .line 48
    invoke-static {v0, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v14, v8, 0x1

    move v13, v7

    move/from16 p1, v19

    move-object/from16 v0, v20

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_6
    long-to-float v0, v10

    div-float v2, p1, v0

    div-float/2addr v5, v0

    div-float/2addr v9, v0

    div-float/2addr v13, v0

    .line 49
    new-instance v0, Lcom/tencent/liteav/network/m$a;

    invoke-direct {v0, v1}, Lcom/tencent/liteav/network/m$a;-><init>(Lcom/tencent/liteav/network/m;)V

    .line 50
    iput v2, v0, Lcom/tencent/liteav/network/m$a;->a:F

    .line 51
    iput v5, v0, Lcom/tencent/liteav/network/m$a;->b:F

    .line 52
    iput v9, v0, Lcom/tencent/liteav/network/m$a;->c:F

    .line 53
    iput v13, v0, Lcom/tencent/liteav/network/m$a;->d:F

    .line 54
    iput-wide v10, v0, Lcom/tencent/liteav/network/m$a;->e:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 55
    :goto_2
    const-string v2, "UploadQualityData"

    const-string v3, "get quality data failed."

    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v18
.end method

.method public static a()Lcom/tencent/liteav/network/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/network/m;->a:Lcom/tencent/liteav/network/m;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private c(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 15
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/m;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 17
    const-string v0, "UploadQualityData"

    const-string v1, "failed to parse json string"

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    return-object p1
.end method

.method private d()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Network"

    .line 6
    .line 7
    const-string v2, "QualityDataCacheCount"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/tencent/liteav/network/m;->c:J

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    const-wide/16 v3, 0x3

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    cmp-long v0, v0, v3

    .line 24
    .line 25
    if-gez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    iput-wide v3, p0, Lcom/tencent/liteav/network/m;->c:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 5

    .line 56
    iget-object v0, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    .line 57
    const-string v3, "com.tencent.liteav.network"

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    return-wide v1
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 59
    const-string v1, "com.tencent.liteav.network"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;JJJFFF)V
    .locals 14

    .line 4
    const-string v0, "34238512-C08C-4931-A000-40E1D8B5BA5B"

    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    move-result-object v1

    const-string v2, "Network"

    const-string v3, "QualityDataCacheCount"

    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_6

    .line 5
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static/range {p6 .. p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static/range {p8 .. p8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-static/range {p9 .. p9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-static/range {p10 .. p10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    move-object v2, p1

    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    move-result-object v1

    .line 6
    const-string v3, "updateQualityData: accessID = %s serverType = %d totalTime = %d networkRTT = %d avgBlockCnt = %f avgVideoQue = %f avgAudioQue = %f"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "UploadQualityData"

    invoke-static {v3, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-direct/range {p0 .. p1}, Lcom/tencent/liteav/network/m;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    const-string v4, "com.tencent.liteav.network"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 9
    const-string v4, ""

    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-direct {p0, v4}, Lcom/tencent/liteav/network/m;->c(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 11
    invoke-virtual {v4, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_1

    .line 12
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    const-wide/16 v6, 0x3

    cmp-long v6, p2, v6

    if-nez v6, :cond_2

    .line 13
    const-string v6, "DomainArrayData"

    goto :goto_1

    :cond_2
    const-string v6, "OriginArrayData"

    .line 14
    :goto_1
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    if-nez v7, :cond_3

    .line 15
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 16
    :cond_3
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 17
    const-string v9, "totalTime"

    move-wide/from16 v10, p4

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 18
    const-string v9, "networkRTT"

    move-wide/from16 v10, p6

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 19
    const-string v9, "avgBlockCnt"

    move/from16 v10, p8

    float-to-double v10, v10

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 20
    const-string v9, "avgVideoQue"

    move/from16 v10, p9

    float-to-double v10, v10

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 21
    const-string v9, "avgAudioQue"

    move/from16 v10, p10

    float-to-double v10, v10

    invoke-virtual {v8, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 22
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 23
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v8

    int-to-long v9, v8

    .line 24
    iget-wide v11, p0, Lcom/tencent/liteav/network/m;->c:J

    cmp-long v11, v9, v11

    if-lez v11, :cond_5

    .line 25
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 26
    iget-wide v12, p0, Lcom/tencent/liteav/network/m;->c:J

    sub-long/2addr v9, v12

    long-to-int v9, v9

    :goto_2
    if-ge v9, v8, :cond_4

    .line 27
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v11, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    move-object v7, v11

    .line 28
    :cond_5
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    invoke-virtual {v4, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 32
    :goto_3
    const-string v0, "build json object failed."

    invoke-static {v3, v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/m;->b:Landroid/content/Context;

    if-eqz v1, :cond_6

    .line 2
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 3
    const-string v0, "wifi:"

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    .line 4
    const-string v0, "4g:"

    return-object v0

    :cond_2
    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    .line 5
    const-string v0, "3g:"

    return-object v0

    :cond_3
    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    .line 6
    const-string v0, "2g:"

    return-object v0

    :cond_4
    const/4 v2, 0x5

    if-ne v1, v2, :cond_5

    .line 7
    const-string v0, "ethernet:"

    return-object v0

    .line 8
    :cond_5
    const-string v0, "xg:"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 9
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get network type failed."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UploadQualityData"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    return-object v0
.end method

.method public c()Z
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/m;->d()V

    .line 2
    invoke-virtual {p0}, Lcom/tencent/liteav/network/m;->b()Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isDomainAddressBetter: accessID = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " minQualityDataCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/tencent/liteav/network/m;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/network/m;->a(Ljava/lang/String;Z)Lcom/tencent/liteav/network/m$a;

    move-result-object v2

    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v0, v3}, Lcom/tencent/liteav/network/m;->a(Ljava/lang/String;Z)Lcom/tencent/liteav/network/m$a;

    move-result-object v0

    if-eqz v2, :cond_0

    .line 6
    iget-wide v5, v2, Lcom/tencent/liteav/network/m$a;->e:J

    .line 7
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget v6, v2, Lcom/tencent/liteav/network/m$a;->a:F

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    iget v7, v2, Lcom/tencent/liteav/network/m$a;->b:F

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    iget v8, v2, Lcom/tencent/liteav/network/m$a;->c:F

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    iget v9, v2, Lcom/tencent/liteav/network/m$a;->d:F

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    filled-new-array/range {v4 .. v9}, [Ljava/lang/Object;

    move-result-object v4

    .line 8
    const-string v5, "%s \n isDomainAddressBetter\uff1adomainQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :cond_0
    move-object v5, v4

    if-eqz v0, :cond_1

    .line 9
    iget-wide v6, v0, Lcom/tencent/liteav/network/m$a;->e:J

    .line 10
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget v4, v0, Lcom/tencent/liteav/network/m$a;->a:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    iget v4, v0, Lcom/tencent/liteav/network/m$a;->b:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    iget v4, v0, Lcom/tencent/liteav/network/m$a;->c:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    iget v4, v0, Lcom/tencent/liteav/network/m$a;->d:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    filled-new-array/range {v5 .. v10}, [Ljava/lang/Object;

    move-result-object v4

    .line 11
    const-string v5, "%s \n isDomainAddressBetter\uff1aoriginQualityData count = %d avgNetworkRTT = %f avgBlockCount = %f avgVideoQueue = %f avgAudioQueue = %f"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 12
    :cond_1
    const-string v4, "UploadQualityData"

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 13
    iget-wide v4, v2, Lcom/tencent/liteav/network/m$a;->e:J

    iget-wide v6, p0, Lcom/tencent/liteav/network/m;->c:J

    cmp-long v4, v4, v6

    if-ltz v4, :cond_3

    if-eqz v0, :cond_3

    iget-wide v4, v0, Lcom/tencent/liteav/network/m$a;->e:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_2

    goto :goto_0

    .line 14
    :cond_2
    iget v4, v2, Lcom/tencent/liteav/network/m$a;->b:F

    iget v5, v0, Lcom/tencent/liteav/network/m$a;->b:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_3

    iget v4, v2, Lcom/tencent/liteav/network/m$a;->c:F

    iget v5, v0, Lcom/tencent/liteav/network/m$a;->c:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_3

    iget v2, v2, Lcom/tencent/liteav/network/m$a;->d:F

    iget v0, v0, Lcom/tencent/liteav/network/m$a;->d:F

    cmpg-float v0, v2, v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    :goto_0
    return v3
.end method
