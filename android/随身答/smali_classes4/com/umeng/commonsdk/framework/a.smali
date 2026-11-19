.class public abstract Lcom/umeng/commonsdk/framework/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 8

    .line 1
    const-string v0, "share"

    .line 2
    .line 3
    const-string v1, "MobclickRT"

    .line 4
    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    new-instance v6, Landroid/content/ContentValues;

    .line 24
    .line 25
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v7, "_tp"

    .line 29
    .line 30
    invoke-virtual {v6, v7, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v2, p1}, Lcom/umeng/analytics/pro/h;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v7, "_hd"

    .line 42
    .line 43
    invoke-virtual {v6, v7, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v2, p1}, Lcom/umeng/analytics/pro/h;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v2, "_bd"

    .line 55
    .line 56
    invoke-virtual {v6, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string p1, "_ts"

    .line 60
    .line 61
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v6, p1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string p1, "_uuid"

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v6, p1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string p1, "_re1"

    .line 78
    .line 79
    invoke-virtual {v6, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string p1, "_re2"

    .line 83
    .line 84
    invoke-virtual {v6, p1, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0}, Lg2/j;->c(Landroid/content/Context;)Lg2/j;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string p1, "stf"

    .line 92
    .line 93
    invoke-virtual {p0, p1, v6}, Lg2/j;->i(Ljava/lang/String;Landroid/content/ContentValues;)V

    .line 94
    .line 95
    .line 96
    const-string p0, "i"

    .line 97
    .line 98
    invoke-virtual {p0, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_1

    .line 103
    .line 104
    const-string p0, "--->>> [\u6709\u72b6\u6001]inner\u4e1a\u52a1\uff0c\u8fd4\u56de\u7a7a JSONObject\u3002"

    .line 105
    .line 106
    invoke-static {v1, p0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const-string p0, "s"

    .line 111
    .line 112
    invoke-virtual {p0, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    const-string p1, "header"

    .line 117
    .line 118
    if-eqz p0, :cond_2

    .line 119
    .line 120
    const-string p0, "--->>> [\u6709\u72b6\u6001]\u5206\u4eab\u4e1a\u52a1 \u8fd4\u56debody\u3002"

    .line 121
    .line 122
    invoke-static {v1, p0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Lorg/json/JSONObject;

    .line 126
    .line 127
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 128
    .line 129
    .line 130
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    .line 131
    .line 132
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_2
    const-string p0, "p"

    .line 147
    .line 148
    invoke-virtual {p0, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_3

    .line 153
    .line 154
    :catch_0
    :goto_0
    new-instance p0, Lorg/json/JSONObject;

    .line 155
    .line 156
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_3
    const-string p0, "st"

    .line 161
    .line 162
    invoke-virtual {p0, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    const-string p3, "analytics"

    .line 167
    .line 168
    if-eqz p0, :cond_4

    .line 169
    .line 170
    const-string p0, "--->>> [\u6709\u72b6\u6001]\u7edf\u8ba1\u4e1a\u52a1 \u534a\u5f00\u62a5\u6587\uff0c\u8fd4\u56debody\u3002"

    .line 171
    .line 172
    invoke-static {v1, p0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance p0, Lorg/json/JSONObject;

    .line 176
    .line 177
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 178
    .line 179
    .line 180
    :try_start_1
    new-instance p4, Lorg/json/JSONObject;

    .line 181
    .line 182
    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_4
    const-string p0, "--->>> [\u6709\u72b6\u6001]\u7edf\u8ba1\u4e1a\u52a1 \u95ed\u5408\u62a5\u6587\uff0c\u8fd4\u56debody\u3002"

    .line 197
    .line 198
    invoke-static {v1, p0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    new-instance p0, Lorg/json/JSONObject;

    .line 202
    .line 203
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 204
    .line 205
    .line 206
    :try_start_2
    new-instance p4, Lorg/json/JSONObject;

    .line 207
    .line 208
    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :catch_1
    return-object p2

    .line 223
    :cond_5
    :goto_1
    const-string p0, "--->>> [\u6709\u72b6\u6001]\u6784\u5efa\u4fe1\u5c01\u4f20\u5165 header \u6216 body \u5b57\u6bb5\u4e3a\u7a7a\uff0c\u76f4\u63a5\u8fd4\u56de"

    .line 224
    .line 225
    invoke-static {v1, p0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/4 p0, 0x0

    .line 229
    return-object p0
.end method

.method public static b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    const-string v0, "st"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "t"

    .line 10
    .line 11
    :goto_0
    move-object v5, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const-string v0, "inner"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "i"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string v0, "a"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    sget-object v4, Lu2/c;->d:Ljava/lang/String;

    .line 28
    .line 29
    const-string v6, "9.3.7"

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    move-object v2, p1

    .line 33
    move-object v3, p2

    .line 34
    invoke-static/range {v1 .. v6}, Lcom/umeng/commonsdk/framework/a;->c(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static c(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    const-string v0, "--->>> [\u6709\u72b6\u6001]\u4e1a\u52a1\u53d1\u8d77\u6784\u5efa\u666e\u901a\u6709\u72b6\u6001\u4fe1\u5c01\u8bf7\u6c42\u3002"

    .line 2
    .line 3
    const-string v1, "MobclickRT"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v2, "exception"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x79

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {p0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :catch_0
    move-object v3, p0

    .line 29
    :catch_1
    return-object v3

    .line 30
    :cond_0
    invoke-static {p0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :try_start_2
    new-instance p0, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x78

    .line 42
    .line 43
    :try_start_3
    invoke-virtual {p0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :catch_2
    move-object v3, p0

    .line 48
    :catch_3
    return-object v3

    .line 49
    :cond_1
    invoke-static {p0}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    const-string v0, "--->>> [\u6709\u72b6\u6001]\u96f6\u53f7\u62a5\u6587\u5e94\u7b54\u6570\u636e \u672a\u83b7\u53d6\u5230\uff0c\u5199\u5165\u4e8c\u7ea7\u7f13\u5b58"

    .line 56
    .line 57
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static/range {p0 .. p5}, Lcom/umeng/commonsdk/framework/a;->a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    const-string v0, "--->>> [\u6709\u72b6\u6001]\u96f6\u53f7\u62a5\u6587\u5e94\u7b54\u6570\u636e \u5df2\u83b7\u53d6\u5230\uff0c\u5224\u65ad\u4e8c\u7ea7\u7f13\u5b58\u662f\u5426\u4e3a\u7a7a"

    .line 66
    .line 67
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Lg2/j;->c(Landroid/content/Context;)Lg2/j;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lg2/j;->o()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    const-string v0, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u4e3a\u7a7a\uff0c\u76f4\u63a5\u6253\u4fe1\u5c01"

    .line 81
    .line 82
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lu2/e;

    .line 86
    .line 87
    invoke-direct {v2}, Lu2/e;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    move-object v4, p1

    .line 95
    move-object v5, p2

    .line 96
    move-object v6, p3

    .line 97
    move-object v7, p4

    .line 98
    move-object v8, p5

    .line 99
    invoke-virtual/range {v2 .. v8}, Lu2/e;->e(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_3
    const-string v0, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u4e0d\u4e3a\u7a7a\uff0c\u5199\u5165\u4e8c\u7ea7\u7f13\u5b58"

    .line 105
    .line 106
    invoke-static {v1, v0}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static/range {p0 .. p5}, Lcom/umeng/commonsdk/framework/a;->a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const p2, 0x8011

    .line 114
    .line 115
    .line 116
    invoke-static {p2}, Ln2/c;->f(I)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-nez p3, :cond_4

    .line 121
    .line 122
    invoke-static {p0}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-virtual {p3}, Lo2/b;->b()Lo2/c;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {p0, p2, p3, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    return-object p1
.end method

.method public static d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-static {p0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    const-string p0, "exception"

    .line 14
    .line 15
    const/16 p2, 0x78

    .line 16
    .line 17
    invoke-virtual {p1, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :catch_0
    move-object p0, p1

    .line 22
    :catch_1
    return-object p0

    .line 23
    :cond_0
    new-instance v0, Lu2/e;

    .line 24
    .line 25
    invoke-direct {v0}, Lu2/e;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0, p1, p2, p3}, Lu2/e;->d(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static e(Landroid/content/Context;)J
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/b;->f(Landroid/content/Context;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public static f(Landroid/content/Context;)J
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/b;->g(Landroid/content/Context;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public static declared-synchronized g()Z
    .locals 2

    .line 1
    const-class v0, Lcom/umeng/commonsdk/framework/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/framework/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lw2/b;->o()Lw2/b$a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1, p2}, Lw2/b$a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/b;->l(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static j(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/umeng/commonsdk/framework/a;->k(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static k(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;Z)Z
    .locals 5

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/b;->l(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/b;->b(Landroid/content/Context;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->b:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/framework/b;->k(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    :cond_0
    :goto_0
    move p2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move p2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {}, Ln2/d;->f()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    invoke-static {}, Ln2/d;->h()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    int-to-long p0, p0

    .line 44
    invoke-static {p0, p1}, Ln2/c;->l(J)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/framework/b;->k(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    invoke-static {p0}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 62
    .line 63
    if-lez v2, :cond_5

    .line 64
    .line 65
    invoke-static {}, Ln2/d;->l()V

    .line 66
    .line 67
    .line 68
    :cond_5
    return p2
.end method

.method public static l(Landroid/content/Context;)J
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lu2/e;->b(Landroid/content/Context;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public static declared-synchronized m(Z)V
    .locals 1

    .line 1
    const-class v0, Lcom/umeng/commonsdk/framework/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sput-boolean p0, Lcom/umeng/commonsdk/framework/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw p0
.end method
