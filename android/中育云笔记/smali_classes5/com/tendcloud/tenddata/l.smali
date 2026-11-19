.class public final Lcom/tendcloud/tenddata/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:J = 0xf731400L

.field private static final c:J = 0x5L

.field private static d:J = 0x0L

.field private static e:J = 0x0L

.field private static final f:Ljava/lang/String; = "frequency"

.field private static final g:Ljava/lang/String; = "interval"

.field private static final h:Ljava/lang/String; = "configVersion"

.field private static final i:Ljava/lang/String; = "lastGetCloudSettingsTime"

.field private static final j:Ljava/lang/String; = "SDKInitNumber"

.field private static final k:Ljava/lang/String; = "TD"

.field private static volatile m:Lcom/tendcloud/tenddata/l; = null

.field private static final n:Ljava/lang/String; = "native"

.field private static final o:Ljava/lang/String; = "hybrid"


# instance fields
.field private l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/tendcloud/tenddata/aa;->F:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "?"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lcom/tendcloud/tenddata/l;->a:Ljava/lang/String;

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    sput-wide v0, Lcom/tendcloud/tenddata/l;->d:J

    .line 25
    .line 26
    sput-wide v0, Lcom/tendcloud/tenddata/l;->e:J

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    sput-object v0, Lcom/tendcloud/tenddata/l;->m:Lcom/tendcloud/tenddata/l;

    .line 30
    .line 31
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()Lcom/tendcloud/tenddata/l;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "TDCodelessGetConfig"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 15
    .line 16
    sget-object v2, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    .line 17
    .line 18
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 30
    .line 31
    sget-object v0, Lcom/tendcloud/tenddata/p;->a:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    new-instance v1, Lcom/tendcloud/tenddata/l$1;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/l$1;-><init>(Lcom/tendcloud/tenddata/l;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/l;
    .locals 2

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/l;->m:Lcom/tendcloud/tenddata/l;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tendcloud/tenddata/l;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/l;->m:Lcom/tendcloud/tenddata/l;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/l;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/l;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/l;->m:Lcom/tendcloud/tenddata/l;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/l;->m:Lcom/tendcloud/tenddata/l;

    return-object v0
.end method

.method private a(Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 79
    const-string p1, "[CodelessGetConfig] configMaps is null"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    return-void

    .line 80
    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/o;->e()Z

    move-result v0

    .line 81
    const-string v1, "native"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .line 82
    const-string v3, "currentElements"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 83
    const-string v5, "hybrid"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    .line 84
    const-string v7, "hybridCurrentEvents"

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 85
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v7

    invoke-virtual {v7}, Lcom/tendcloud/tenddata/o;->b()V

    if-eqz v2, :cond_2

    .line 86
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    .line 87
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 88
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 89
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v8, v7, v1}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_0

    .line 90
    :cond_1
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v8, v7, v1}, Lcom/tendcloud/tenddata/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_4

    .line 91
    const-string v1, "native_value"

    if-eqz v0, :cond_3

    .line 92
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, v4, v3}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_1

    .line 93
    :cond_3
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, v4, v3}, Lcom/tendcloud/tenddata/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 94
    :cond_4
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 95
    const-string v1, "hybrid_value"

    if-eqz v0, :cond_5

    .line 96
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v2

    invoke-virtual {v2, v1, p1, v3}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_2

    .line 97
    :cond_5
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v2

    invoke-virtual {v2, v1, p1, v3}, Lcom/tendcloud/tenddata/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    :cond_6
    :goto_2
    if-eqz v6, :cond_8

    .line 98
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 99
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 100
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 101
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v3

    invoke-virtual {v3, v2, v1, v5}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_3

    .line 102
    :cond_7
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object v3

    invoke-virtual {v3, v2, v1, v5}, Lcom/tendcloud/tenddata/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    goto :goto_3

    .line 103
    :cond_8
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/o;->c()V

    .line 104
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Lcom/tendcloud/tenddata/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/y;->d()Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/l;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/l;->c()Z

    move-result p0

    return p0
.end method

.method private a(Lorg/json/JSONObject;)Z
    .locals 25

    move-object/from16 v0, p1

    .line 8
    const-string v1, "currentEvents"

    const-string v2, "pageEvents"

    const-string v3, "eventParams"

    const-string v4, "content"

    const-string v5, "hybrid"

    const-string v6, "native"

    const/4 v7, 0x0

    .line 9
    :try_start_0
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 10
    const-string v0, "[CodelessGetConfig] content is empty"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    return v7

    :catchall_0
    move-object/from16 v0, p0

    move/from16 v16, v7

    goto/16 :goto_9

    .line 11
    :cond_0
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 15
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, "events"

    const-string v12, "page"

    if-eqz v10, :cond_b

    .line 17
    :try_start_1
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    move v14, v7

    .line 18
    :goto_0
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v15

    if-ge v14, v15, :cond_a

    .line 19
    invoke-virtual {v10, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move/from16 v16, v7

    .line 20
    :try_start_2
    invoke-virtual {v15, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 21
    invoke-static {v7}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_1

    .line 22
    const-string v7, "[CodelessGetConfig] native page is empty"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    move-object/from16 v21, v1

    move-object/from16 v24, v3

    move-object/from16 v17, v10

    move-object/from16 v22, v11

    move/from16 v18, v14

    goto/16 :goto_5

    :catchall_1
    :goto_1
    move-object/from16 v0, p0

    goto/16 :goto_9

    .line 23
    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-virtual {v15, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    move-object/from16 v17, v10

    move/from16 v18, v14

    move/from16 v10, v16

    .line 25
    :goto_2
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-ge v10, v14, :cond_8

    .line 26
    invoke-virtual {v15, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v14

    move/from16 v19, v10

    .line 27
    new-instance v10, Lcom/tendcloud/tenddata/w;

    invoke-direct {v10}, Lcom/tendcloud/tenddata/w;-><init>()V

    move-object/from16 v20, v15

    .line 28
    const-string v15, "eventId"

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Lcom/tendcloud/tenddata/w;->setEventId(Ljava/lang/String;)V

    .line 29
    const-string v15, "eventName"

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Lcom/tendcloud/tenddata/w;->setEventName(Ljava/lang/String;)V

    .line 30
    const-string v15, "eventValue"

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v21, v1

    .line 31
    const-string v1, "propagation"

    invoke-virtual {v14, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v22, v11

    const/4 v11, 0x1

    if-ne v1, v11, :cond_2

    .line 32
    invoke-static {v15}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2

    .line 33
    invoke-virtual {v10, v15}, Lcom/tendcloud/tenddata/w;->setEventValue(Ljava/lang/String;)V

    .line 34
    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    :cond_2
    const-string v11, "eventSame"

    invoke-virtual {v14, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/tendcloud/tenddata/w;->setEventSame(Ljava/lang/String;)V

    .line 36
    const-string v11, "eventSameRules"

    invoke-virtual {v14, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/tendcloud/tenddata/w;->setEventSameRules(Lorg/json/JSONObject;)V

    .line 37
    const-string v11, "pagePath"

    invoke-virtual {v14, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/tendcloud/tenddata/w;->setPagePath(Ljava/lang/String;)V

    .line 38
    const-string v11, "eventPath"

    invoke-virtual {v14, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/tendcloud/tenddata/w;->setEventPath(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v10, v1}, Lcom/tendcloud/tenddata/w;->setPropagation(I)V

    .line 40
    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 41
    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 42
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move/from16 v14, v16

    .line 43
    :goto_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v15

    if-ge v14, v15, :cond_4

    .line 44
    invoke-virtual {v1, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    move-object/from16 v23, v1

    .line 45
    new-instance v1, Lcom/tendcloud/tenddata/k;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/k;-><init>()V

    move-object/from16 v24, v3

    .line 46
    const-string v3, "key"

    invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tendcloud/tenddata/k;->setKey(Ljava/lang/String;)V

    .line 47
    const-string v3, "xpath"

    invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/tendcloud/tenddata/k;->setXpath(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/k;->c()Z

    move-result v3

    if-nez v3, :cond_3

    .line 49
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v23

    move-object/from16 v3, v24

    goto :goto_3

    :cond_4
    move-object/from16 v24, v3

    .line 50
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 51
    invoke-virtual {v10, v11}, Lcom/tendcloud/tenddata/w;->setEventParams(Ljava/util/List;)V

    goto :goto_4

    :cond_5
    move-object/from16 v24, v3

    .line 52
    :cond_6
    :goto_4
    invoke-virtual {v10}, Lcom/tendcloud/tenddata/w;->j()Z

    move-result v1

    if-nez v1, :cond_7

    .line 53
    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v10, v19, 0x1

    move-object/from16 v15, v20

    move-object/from16 v1, v21

    move-object/from16 v11, v22

    move-object/from16 v3, v24

    goto/16 :goto_2

    :cond_8
    move-object/from16 v21, v1

    move-object/from16 v24, v3

    move-object/from16 v22, v11

    .line 54
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 55
    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_5
    add-int/lit8 v14, v18, 0x1

    move/from16 v7, v16

    move-object/from16 v10, v17

    move-object/from16 v1, v21

    move-object/from16 v11, v22

    move-object/from16 v3, v24

    goto/16 :goto_0

    :catchall_2
    move/from16 v16, v7

    goto/16 :goto_1

    :cond_a
    move-object/from16 v21, v1

    move/from16 v16, v7

    move-object/from16 v22, v11

    .line 56
    invoke-interface {v9, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 58
    const-string v0, "currentElements"

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_b
    move-object/from16 v21, v1

    move/from16 v16, v7

    move-object/from16 v22, v11

    .line 59
    :cond_c
    :goto_6
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 61
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 62
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 63
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    move/from16 v3, v16

    .line 64
    :goto_7
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_e

    .line 65
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 66
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 67
    invoke-static {v6}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 68
    const-string v4, "[CodelessGetConfig] hybrid page is empty"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    move-object/from16 v7, v22

    goto :goto_8

    :cond_d
    move-object/from16 v7, v22

    .line 69
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 70
    invoke-static {}, Lcom/tendcloud/tenddata/m;->c()Lcom/tendcloud/tenddata/m;

    move-result-object v8

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v6, v10}, Lcom/tendcloud/tenddata/m;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v8, "UTF-8"

    invoke-static {v6, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v22, v7

    goto :goto_7

    :cond_e
    move-object/from16 v2, v21

    .line 72
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 73
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 74
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 75
    const-string v2, "hybridCurrentEvents"

    invoke-interface {v9, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-static {}, Lcom/tendcloud/tenddata/m;->c()Lcom/tendcloud/tenddata/m;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/tendcloud/tenddata/m;->b(Ljava/lang/String;)V

    .line 77
    :cond_f
    invoke-interface {v9, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_10
    move-object/from16 v0, p0

    .line 78
    :try_start_3
    invoke-direct {v0, v9}, Lcom/tendcloud/tenddata/l;->a(Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/4 v11, 0x1

    return v11

    :catchall_3
    :goto_9
    return v16
.end method

.method private c()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/ab;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    const/4 v2, 0x1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const-string v5, "SDKInitNumber"

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    :try_start_1
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v6, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1, v6, v5, v3, v4}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    return v2

    .line 22
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v6, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v6, v5, v3, v4}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 31
    .line 32
    iget-object v8, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 33
    .line 34
    const-wide/16 v9, 0x1

    .line 35
    .line 36
    add-long/2addr v6, v9

    .line 37
    invoke-static {v1, v8, v5, v6, v7}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 45
    .line 46
    iget-object v8, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 47
    .line 48
    const-string v11, "lastGetCloudSettingsTime"

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v12

    .line 54
    invoke-static {v1, v8, v11, v12, v13}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v11

    .line 58
    sub-long/2addr v6, v11

    .line 59
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 60
    .line 61
    iget-object v8, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 62
    .line 63
    const-string v11, "interval"

    .line 64
    .line 65
    invoke-static {v1, v8, v11, v3, v4}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 70
    .line 71
    iget-object v8, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 72
    .line 73
    const-string v13, "frequency"

    .line 74
    .line 75
    invoke-static {v1, v8, v13, v9, v10}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v13

    .line 79
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v8, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v8, v5, v3, v4}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v15

    .line 87
    cmp-long v1, v13, v9

    .line 88
    .line 89
    if-nez v1, :cond_1

    .line 90
    .line 91
    cmp-long v6, v6, v11

    .line 92
    .line 93
    if-gez v6, :cond_2

    .line 94
    .line 95
    :cond_1
    if-eqz v1, :cond_3

    .line 96
    .line 97
    cmp-long v1, v15, v13

    .line 98
    .line 99
    if-ltz v1, :cond_3

    .line 100
    .line 101
    :cond_2
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 102
    .line 103
    iget-object v6, v0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v6, v5, v3, v4}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    return v2

    .line 109
    :catchall_0
    :cond_3
    const/4 v1, 0x0

    .line 110
    return v1
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v3, "id="

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 19
    .line 20
    sget-object v4, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, "&p=1"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/tendcloud/tenddata/bz;->a()Lcom/tendcloud/tenddata/bz;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/bz;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {}, Lcom/tendcloud/tenddata/bz;->a()Lcom/tendcloud/tenddata/bz;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Lcom/tendcloud/tenddata/bz;->b(Landroid/content/Context;)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v5, "&v="

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, "+"

    .line 80
    .line 81
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    new-instance v2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v3, "&sv="

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v3, ".0.17 gp"

    .line 116
    .line 117
    invoke-static {v3, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 132
    .line 133
    iget-object v2, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 134
    .line 135
    const-string v3, "configVersion"

    .line 136
    .line 137
    const-wide/16 v4, 0x1

    .line 138
    .line 139
    invoke-static {v0, v2, v3, v4, v5}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 140
    .line 141
    .line 142
    move-result-wide v2

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v4, "&cv="

    .line 149
    .line 150
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v2, Lcom/tendcloud/tenddata/l;->a:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {}, Lcom/tendcloud/tenddata/cz;->a()Lcom/tendcloud/tenddata/da$a;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    sget-object v2, Lcom/tendcloud/tenddata/dd;->a:Lcom/tendcloud/tenddata/dd;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/da$a;->method(Lcom/tendcloud/tenddata/dd;)Lcom/tendcloud/tenddata/da$a;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const-string v2, "conf.cpatrk.net"

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Lcom/tendcloud/tenddata/da$a;->host(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/da$a;->url(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v1, ""

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->cert(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/da$a;->build()Lcom/tendcloud/tenddata/da;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Lcom/tendcloud/tenddata/cz;->b(Lcom/tendcloud/tenddata/da;)Lcom/tendcloud/tenddata/de;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-eqz v0, :cond_2

    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->b()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    const/16 v2, 0xc8

    .line 225
    .line 226
    if-eq v1, v2, :cond_0

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_0
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->c()[B

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->c([B)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-string v1, "null"

    .line 238
    .line 239
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_2

    .line 244
    .line 245
    const-string v1, "\"\""

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_1

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_1
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_2

    .line 263
    .line 264
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 265
    .line 266
    iget-object v2, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 267
    .line 268
    const-string v3, "lastGetCloudSettingsTime"

    .line 269
    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 271
    .line 272
    .line 273
    move-result-wide v4

    .line 274
    invoke-static {v1, v2, v3, v4, v5}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    .line 275
    .line 276
    .line 277
    new-instance v1, Lorg/json/JSONObject;

    .line 278
    .line 279
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Lcom/tendcloud/tenddata/y;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/y;->onSaveConfig(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    .line 288
    .line 289
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public saveConfig(Lorg/json/JSONObject;)V
    .locals 9

    .line 1
    const-string v0, "pipline_settings"

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    const-string v2, "interval"

    .line 6
    .line 7
    const-string v3, "frequency"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/l;->a(Lorg/json/JSONObject;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "configVersion"

    .line 36
    .line 37
    int-to-long v7, v1

    .line 38
    invoke-static {v4, v5, v6, v7, v8}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_8

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const-wide/16 v4, 0x1

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    sput-wide v0, Lcom/tendcloud/tenddata/l;->d:J

    .line 64
    .line 65
    const-wide/16 v6, 0x5

    .line 66
    .line 67
    cmp-long v8, v0, v6

    .line 68
    .line 69
    if-ltz v8, :cond_3

    .line 70
    .line 71
    move-wide v0, v6

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    cmp-long v6, v0, v4

    .line 74
    .line 75
    if-gez v6, :cond_4

    .line 76
    .line 77
    move-wide v0, v4

    .line 78
    :cond_4
    :goto_0
    sput-wide v0, Lcom/tendcloud/tenddata/l;->d:J

    .line 79
    .line 80
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 83
    .line 84
    sget-wide v6, Lcom/tendcloud/tenddata/l;->d:J

    .line 85
    .line 86
    invoke-static {v0, v1, v3, v6, v7}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_8

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    sput-wide v0, Lcom/tendcloud/tenddata/l;->e:J

    .line 100
    .line 101
    sget-wide v6, Lcom/tendcloud/tenddata/l;->d:J

    .line 102
    .line 103
    cmp-long p1, v6, v4

    .line 104
    .line 105
    if-lez p1, :cond_6

    .line 106
    .line 107
    const-wide/16 v0, 0x0

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    const-wide/32 v3, 0xf731400

    .line 111
    .line 112
    .line 113
    cmp-long p1, v0, v3

    .line 114
    .line 115
    if-lez p1, :cond_7

    .line 116
    .line 117
    move-wide v0, v3

    .line 118
    :cond_7
    :goto_1
    sput-wide v0, Lcom/tendcloud/tenddata/l;->e:J

    .line 119
    .line 120
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 121
    .line 122
    iget-object v0, p0, Lcom/tendcloud/tenddata/l;->l:Ljava/lang/String;

    .line 123
    .line 124
    sget-wide v3, Lcom/tendcloud/tenddata/l;->e:J

    .line 125
    .line 126
    invoke-static {p1, v0, v2, v3, v4}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    :catch_0
    :cond_8
    :goto_2
    return-void
.end method
