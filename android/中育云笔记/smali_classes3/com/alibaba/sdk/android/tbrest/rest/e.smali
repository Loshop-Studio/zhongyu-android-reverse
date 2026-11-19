.class public Lcom/alibaba/sdk/android/tbrest/rest/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lcom/alibaba/sdk/android/tbrest/rest/e;->b:J

    .line 6
    .line 7
    return-void
.end method

.method public static a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lcom/alibaba/sdk/android/tbrest/rest/d;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
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
            "Lcom/alibaba/sdk/android/tbrest/rest/d;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 116
    const-string v1, "aliyunos"

    const-string v2, ""

    const-string v3, "-"

    const/4 v4, 0x0

    if-nez p7, :cond_0

    return-object v4

    .line 117
    :cond_0
    :try_start_0
    iget-object v5, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getUtdid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    .line 118
    const-string v0, "get utdid failure, so build report failure, now return"

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    return-object v4

    :catch_0
    move-exception v0

    move-object/from16 v16, v4

    goto/16 :goto_3

    .line 119
    :cond_1
    iget-object v6, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getNetworkType(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 120
    aget-object v7, v6, v7

    .line 121
    array-length v8, v6

    const/4 v9, 0x1

    if-le v8, v9, :cond_2

    if-eqz v7, :cond_2

    const-string v8, "Wi-Fi"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 122
    aget-object v6, v6, v9

    goto :goto_0

    :cond_2
    move-object v6, v4

    :goto_0
    const-wide/16 v8, 0x0

    cmp-long v8, p4, v8

    if-lez v8, :cond_3

    move-wide/from16 v8, p4

    goto :goto_1

    .line 123
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 124
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 125
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v12, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v11, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v11, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 127
    invoke-static/range {p6 .. p6}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 128
    invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 129
    invoke-static/range {p8 .. p8}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 130
    invoke-static/range {p9 .. p9}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 131
    invoke-static/range {p10 .. p10}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 132
    invoke-static/range {p11 .. p11}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v16, v4

    .line 133
    :try_start_1
    const-string v4, "5.0.1"

    move-object/from16 v17, v5

    .line 134
    iget-object v5, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getImei(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v18, v6

    .line 135
    iget-object v6, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getImsi(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 136
    sget-object v19, Landroid/os/Build;->BRAND:Ljava/lang/String;

    move-object/from16 v20, v7

    invoke-static/range {v19 .. v19}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 137
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCpuName()Ljava/lang/String;

    move-result-object v19

    move-object/from16 p4, v15

    invoke-static/range {v19 .. v19}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 p5, v14

    .line 138
    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 139
    sget-object v19, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 p6, v13

    invoke-static/range {v19 .. v19}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 p7, v12

    .line 140
    iget-object v12, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v12}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getResolution(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v11

    .line 141
    iget-object v11, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v11}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCarrier(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v21, v9

    .line 142
    invoke-static/range {v20 .. v20}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v20, v10

    .line 143
    invoke-static/range {v18 .. v18}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v18, v8

    .line 144
    invoke-static/range {p1 .. p1}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v22, v3

    .line 145
    iget-object v3, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v28, v3

    .line 146
    iget-object v3, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->channel:Ljava/lang/String;

    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v26, v8

    .line 147
    iget-object v8, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    invoke-static {v8}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 p1, v8

    .line 148
    iget-object v8, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    invoke-static {v8}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 149
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCountry()Ljava/lang/String;

    move-result-object v23

    move-object/from16 p8, v8

    invoke-static/range {v23 .. v23}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 150
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getLanguage()Ljava/lang/String;

    move-result-object v23

    move-object/from16 p9, v8

    invoke-static/range {v23 .. v23}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 151
    iget-object v0, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 152
    const-string v23, "Android"

    if-eqz v0, :cond_4

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :cond_4
    move-object/from16 v1, v23

    .line 154
    :goto_2
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 p0, v0

    .line 155
    const-string v0, "mini"

    move-object/from16 p10, v0

    .line 156
    const-string v0, "1.0"

    move-object/from16 p11, v0

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v29, v1

    move-object/from16 v23, v2

    sget-wide v1, Lcom/alibaba/sdk/android/tbrest/rest/e;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static/range {v17 .. v17}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 159
    invoke-static/range {v23 .. v23}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    .line 160
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    move-object/from16 v31, v1

    .line 161
    const-string v1, "||"

    .line 162
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 163
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 164
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 165
    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 166
    invoke-virtual {v2, v15}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 167
    invoke-virtual {v2, v14}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 168
    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 169
    invoke-virtual {v2, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 170
    invoke-virtual {v2, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 171
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 172
    invoke-virtual {v2, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v4, v26

    .line 174
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v5, v28

    .line 175
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, p1

    .line 176
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, p8

    .line 177
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, v22

    .line 178
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v7, p9

    .line 179
    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 180
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v7, v29

    .line 181
    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v8, p0

    .line 182
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v8, p10

    .line 183
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v8, p11

    .line 184
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 185
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v0, v31

    .line 186
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 187
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 188
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 189
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 190
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, v18

    .line 191
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, v20

    .line 192
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, v21

    .line 193
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, v19

    .line 194
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, p7

    .line 195
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, p6

    .line 196
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v6, p5

    .line 197
    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v1, p4

    .line 198
    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 199
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    .line 200
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 201
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 202
    const-string v6, "stm_x"

    invoke-interface {v2, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    new-instance v1, Lcom/alibaba/sdk/android/tbrest/rest/d;

    invoke-direct {v1}, Lcom/alibaba/sdk/android/tbrest/rest/d;-><init>()V

    .line 204
    const-string v30, ""

    const/16 v23, 0x0

    move-object/from16 v22, p2

    move-object/from16 v25, p3

    move-object/from16 v31, v0

    move-object/from16 v24, v2

    move-object/from16 v27, v3

    move-object/from16 v26, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v7

    invoke-static/range {v22 .. v31}, Lcom/alibaba/sdk/android/tbrest/rest/RestUrlWrapper;->getSignedTransferUrl(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 205
    invoke-virtual {v1, v0}, Lcom/alibaba/sdk/android/tbrest/rest/d;->b(Ljava/lang/String;)V

    .line 206
    invoke-virtual {v1, v2}, Lcom/alibaba/sdk/android/tbrest/rest/d;->a(Ljava/util/Map;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    .line 207
    :goto_3
    const-string v1, "UTRestAPI buildTracePostReqDataObj catch!"

    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v16
.end method

.method public static a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
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

    move-object/from16 v0, p0

    .line 10
    const-string v1, ""

    const-string v2, "-"

    const/4 v3, 0x0

    if-nez p5, :cond_0

    return-object v3

    .line 11
    :cond_0
    :try_start_0
    iget-object v4, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getUtdid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 12
    const-string v0, "get utdid failure, so build report failure, now return"

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    return-object v3

    :catch_0
    move-exception v0

    move-object v4, v1

    goto/16 :goto_3

    .line 13
    :cond_1
    iget-object v5, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getNetworkType(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 14
    aget-object v6, v5, v6

    .line 15
    array-length v7, v5

    const/4 v8, 0x1

    if-le v7, v8, :cond_2

    if-eqz v6, :cond_2

    const-string v7, "Wi-Fi"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 16
    aget-object v3, v5, v8

    :cond_2
    const-wide/16 v7, 0x0

    cmp-long v5, p2, v7

    if-lez v5, :cond_3

    move-wide/from16 v7, p2

    goto :goto_0

    .line 17
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 18
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-static/range {p4 .. p4}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 20
    invoke-static/range {p5 .. p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 21
    invoke-static/range {p6 .. p6}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 22
    invoke-static/range {p7 .. p7}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 23
    invoke-static/range {p8 .. p8}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-static/range {p9 .. p9}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertMapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 25
    iget-object v13, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v13}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getImei(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 26
    iget-object v14, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v14}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getImsi(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 27
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v15}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 28
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCpuName()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    invoke-static {v13}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    sget-object v16, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v16}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v4

    .line 31
    iget-object v4, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getResolution(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v18, v6

    .line 32
    iget-object v6, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCarrier(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 p2, v12

    .line 33
    invoke-static/range {v18 .. v18}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 p3, v11

    .line 34
    invoke-static/range {v17 .. v17}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 p4, v10

    .line 35
    invoke-static/range {p1 .. p1}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 p5, v9

    .line 36
    iget-object v9, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->appVersion:Ljava/lang/String;

    invoke-static {v9}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v17, v8

    .line 37
    iget-object v8, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->channel:Ljava/lang/String;

    invoke-static {v8}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v18, v7

    .line 38
    iget-object v7, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    invoke-static {v7}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v19, v5

    .line 39
    iget-object v5, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->userNick:Ljava/lang/String;

    invoke-static {v5}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 40
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getCountry()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getLanguage()Ljava/lang/String;

    move-result-object v20
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v21, v1

    :try_start_1
    invoke-static/range {v20 .. v20}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v1

    .line 42
    iget-object v1, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->appId:Ljava/lang/String;

    .line 43
    const-string v20, "a"

    .line 44
    sget-object v22, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    move-object/from16 v23, v2

    invoke-static/range {v22 .. v22}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 p6, v2

    .line 45
    const-string v2, "mini"

    move-object/from16 p7, v2

    .line 46
    const-string v2, "1.0"

    move-object/from16 p8, v2

    .line 47
    invoke-static/range {v16 .. v16}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    iget-object v0, v0, Lcom/alibaba/sdk/android/tbrest/SendService;->country:Ljava/lang/String;

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-static/range {v21 .. v21}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    if-eqz v1, :cond_5

    move-object/from16 p0, v0

    .line 50
    const-string v0, "aliyunos"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 51
    const-string v20, "y"

    :cond_4
    :goto_1
    move-object/from16 v0, v20

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v4, v21

    goto/16 :goto_3

    :cond_5
    move-object/from16 p0, v0

    goto :goto_1

    .line 52
    :goto_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 53
    sget-object v16, Lcom/alibaba/sdk/android/tbrest/rest/a;->a:Lcom/alibaba/sdk/android/tbrest/rest/a;

    move-object/from16 p9, v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->b:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->c:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->d:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->e:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->f:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->g:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->h:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->i:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->j:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->k:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->l:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->m:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->n:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v23

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->o:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->p:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p1

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->q:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->r:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p6

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->s:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p8

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->t:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v4, v21

    :try_start_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v5, Lcom/alibaba/sdk/android/tbrest/rest/e;->b:J

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->u:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p9

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->v:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, p7

    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->w:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->x:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->y:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->z:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->A:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->B:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v19

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->C:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v18

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->D:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->E:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p5

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->F:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p4

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->G:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p3

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    .line 88
    :goto_3
    const-string v1, "UTRestAPI buildTracePostReqDataObj catch!"

    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v4
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string p0, "-"

    return-object p0

    :cond_0
    if-eqz p0, :cond_4

    .line 3
    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 7
    aget-char v2, p0, v1

    const/16 v3, 0xa

    if-eq v2, v3, :cond_2

    const/16 v3, 0xd

    if-eq v2, v3, :cond_2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_2

    const/16 v3, 0x7c

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static a(Ljava/util/Map;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 89
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 90
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/rest/a;->values()[Lcom/alibaba/sdk/android/tbrest/rest/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const-string v5, "||"

    const/4 v6, 0x0

    if-ge v4, v2, :cond_2

    aget-object v7, v1, v4

    .line 91
    sget-object v8, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    if-ne v7, v8, :cond_0

    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    :cond_1
    invoke-static {v6}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 96
    :cond_2
    :goto_1
    sget-object v1, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 98
    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v3

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    .line 100
    :goto_2
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 101
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 103
    invoke-interface {p0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 104
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->convertObjectToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object v7, v6

    .line 105
    :goto_4
    const-string v8, "="

    const-string v9, "StackTrace=====>"

    const-string v10, "StackTrace"

    if-eqz v1, :cond_6

    .line 106
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 107
    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_5

    .line 108
    :cond_5
    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_5
    move v1, v3

    goto :goto_3

    .line 109
    :cond_6
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const-string v11, ","

    if-eqz v10, :cond_7

    .line 110
    invoke-virtual {v0, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 111
    :cond_7
    invoke-virtual {v0, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 112
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    .line 113
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 114
    invoke-virtual {p0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_9
    return-object p0
.end method
