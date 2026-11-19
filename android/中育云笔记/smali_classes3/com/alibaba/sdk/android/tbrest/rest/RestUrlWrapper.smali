.class public Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FIELD_APPKEY:Ljava/lang/String; = "appkey"

.field public static final FIELD_APPVERSION:Ljava/lang/String; = "app_version"

.field public static final FIELD_CHANNEL:Ljava/lang/String; = "channel"

.field public static final FIELD_PLATFORM:Ljava/lang/String; = "platform"

.field public static final FIELD_SDK_VERSION:Ljava/lang/String; = "sdk_version"

.field public static final FIELD_T:Ljava/lang/String; = "t"

.field public static final FIELD_UTDID:Ljava/lang/String; = "utdid"

.field public static final FIELD_V:Ljava/lang/String; = "v"

.field static enableSecuritySDK:Z = false

.field static mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _getEncoded(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    const-string v0, "UTF-8"

    .line 7
    .line 8
    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method private static _wrapUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    move-object/from16 v1, p5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v14

    .line 2
    sget-boolean v0, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->enableSecuritySDK:Z

    const-string v12, "4.1.0"

    const-string v2, "3.0"

    const-string v3, ""

    if-eqz v0, :cond_3

    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_3

    .line 3
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    move-object/from16 v4, p6

    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v5, p7

    :try_start_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-object/from16 v13, p8

    :try_start_3
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-object/from16 v6, p10

    :try_start_4
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_0

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object/from16 v7, p2

    :goto_0
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_1

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object/from16 v7, p3

    :goto_1
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->getMd5Hex([B)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v7, Lcom/alibaba/sdk/android/tbrest/rest/g;

    sget-object v8, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->mContext:Landroid/content/Context;

    invoke-direct {v7, v8, v1}, Lcom/alibaba/sdk/android/tbrest/rest/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/tbrest/rest/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 7
    :try_start_5
    invoke-static {v12}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isNotBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    const-string v0, "1"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_2
    move-object v0, v3

    :goto_2
    move-object/from16 v16, v0

    goto :goto_8

    :catch_1
    move-exception v0

    :goto_3
    move-object v7, v3

    goto :goto_7

    :catch_2
    move-exception v0

    :goto_4
    move-object/from16 v6, p10

    goto :goto_3

    :catch_3
    move-exception v0

    :goto_5
    move-object/from16 v13, p8

    goto :goto_4

    :catch_4
    move-exception v0

    :goto_6
    move-object/from16 v5, p7

    goto :goto_5

    :catch_5
    move-exception v0

    move-object/from16 v4, p6

    goto :goto_6

    .line 9
    :goto_7
    const-string v8, "security sdk signed"

    invoke-static {v8, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object/from16 v16, v3

    goto :goto_8

    :cond_3
    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v13, p8

    move-object/from16 v6, p10

    move-object v7, v3

    move-object/from16 v16, v7

    .line 10
    :goto_8
    invoke-static/range {p1 .. p1}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, p1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 12
    :cond_4
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 13
    invoke-static {v7}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_getEncoded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v15, ""

    move-object/from16 v4, p0

    move-object v6, v0

    move-object v7, v1

    move-object v5, v3

    filled-new-array/range {v4 .. v16}, [Ljava/lang/Object;

    move-result-object v0

    .line 14
    const-string v1, "%s?%sak=%s&av=%s&c=%s&v=%s&s=%s&d=%s&sv=%s&p=%s&t=%s&u=%s&is=%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static enableSecuritySDK()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->enableSecuritySDK:Z

    .line 3
    .line 4
    return-void
.end method

.method public static getSignedTransferUrl(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-array v3, v3, [Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {v2, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/rest/c;->a()Lcom/alibaba/sdk/android/tbrest/rest/c;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-virtual {v2, v3, v4}, Lcom/alibaba/sdk/android/tbrest/rest/c;->a([Ljava/lang/String;Z)[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    array-length v3, v2

    .line 36
    const/4 v4, 0x0

    .line 37
    :goto_0
    if-ge v4, v3, :cond_0

    .line 38
    .line 39
    aget-object v5, v2, v4

    .line 40
    .line 41
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, [B

    .line 46
    .line 47
    new-instance v7, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/utils/MD5Utils;->getMd5Hex([B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-object v8, v1

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    move-object/from16 v5, p0

    .line 76
    .line 77
    move-object/from16 v9, p3

    .line 78
    .line 79
    move-object/from16 v10, p4

    .line 80
    .line 81
    move-object/from16 v11, p5

    .line 82
    .line 83
    move-object/from16 v12, p6

    .line 84
    .line 85
    move-object/from16 v13, p7

    .line 86
    .line 87
    move-object/from16 v14, p8

    .line 88
    .line 89
    move-object/from16 v15, p9

    .line 90
    .line 91
    :try_start_0
    invoke-static/range {v5 .. v15}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_wrapUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    return-object v0

    .line 96
    :catch_0
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/rest/RestConstants;->getTransferUrl()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x0

    .line 102
    move-object/from16 v9, p3

    .line 103
    .line 104
    move-object/from16 v10, p4

    .line 105
    .line 106
    move-object/from16 v11, p5

    .line 107
    .line 108
    move-object/from16 v12, p6

    .line 109
    .line 110
    move-object/from16 v13, p7

    .line 111
    .line 112
    move-object/from16 v14, p8

    .line 113
    .line 114
    move-object/from16 v15, p9

    .line 115
    .line 116
    invoke-static/range {v5 .. v15}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->_wrapUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    return-object v0
.end method

.method public static setContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    return-void
.end method
