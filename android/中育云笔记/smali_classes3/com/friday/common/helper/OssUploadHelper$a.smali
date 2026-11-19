.class public final Lcom/friday/common/helper/OssUploadHelper$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/helper/OssUploadHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/helper/OssUploadHelper$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;
    .locals 11

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p8, 0x8

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p2, "0"

    .line 13
    .line 14
    move-object v4, p2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    :goto_0
    and-int/lit8 p2, p8, 0x10

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string p2, "toString(...)"

    .line 30
    .line 31
    invoke-static {v5, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    const/4 v10, 0x0

    .line 36
    const-string v6, "-"

    .line 37
    .line 38
    const-string v7, ""

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-static/range {v5 .. v10}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    move-object v5, p2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object/from16 v5, p5

    .line 48
    .line 49
    :goto_1
    and-int/lit8 p2, p8, 0x20

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    move-wide v6, v0

    .line 58
    move-object v3, p3

    .line 59
    move-object v0, p0

    .line 60
    move-object v1, p1

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move-wide/from16 v6, p6

    .line 63
    .line 64
    move-object v0, p0

    .line 65
    move-object v1, p1

    .line 66
    move-object v3, p3

    .line 67
    :goto_2
    invoke-virtual/range {v0 .. v7}, Lcom/friday/common/helper/OssUploadHelper$a;->a(Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;J)Lcom/friday/common/entity/OssReqData;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method


# virtual methods
.method public final a(Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;J)Lcom/friday/common/entity/OssReqData;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v13, p3

    .line 6
    .line 7
    move-object/from16 v6, p4

    .line 8
    .line 9
    move-object/from16 v7, p5

    .line 10
    .line 11
    move-wide/from16 v8, p6

    .line 12
    .line 13
    const-string v1, "fileType"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "fileExt"

    .line 19
    .line 20
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "fileResource"

    .line 24
    .line 25
    invoke-static {v13, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "date"

    .line 29
    .line 30
    invoke-static {v6, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "uuid"

    .line 34
    .line 35
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 45
    .line 46
    .line 47
    move-result-wide v14

    .line 48
    invoke-virtual {v13}, Lcom/friday/common/entity/OssFileResource;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0}, Lcom/friday/common/entity/OssFileType;->getValue()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v5, "+"

    .line 65
    .line 66
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v10, "note_v2"

    .line 70
    .line 71
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1}, Lcom/blankj/utilcode/util/EncryptUtils;->encryptMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    move-object v2, v10

    .line 119
    move-object v10, v1

    .line 120
    new-instance v1, Lcom/friday/common/entity/OssTokenReq;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/friday/common/entity/OssFileType;->getValue()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-virtual {v13}, Lcom/friday/common/entity/OssFileResource;->getValue()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v11, 0x1

    .line 134
    const/4 v12, 0x0

    .line 135
    move-object/from16 v16, v2

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    move-object/from16 v0, v16

    .line 139
    .line 140
    invoke-direct/range {v1 .. v12}, Lcom/friday/common/entity/OssTokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Lcom/friday/common/entity/OssFileResource;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    new-instance v3, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v0, "/"

    .line 156
    .line 157
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const-string v3, "0"

    .line 174
    .line 175
    invoke-static {v6, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_0

    .line 180
    .line 181
    const-string v3, "yyyyMMdd"

    .line 182
    .line 183
    invoke-static {v3}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v8, v9, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    goto :goto_0

    .line 192
    :cond_0
    move-object v3, v6

    .line 193
    :goto_0
    sget-object v5, Lcom/friday/common/entity/OssFileResource$Log;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Log;

    .line 194
    .line 195
    invoke-static {v13, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_1

    .line 200
    .line 201
    const-string v4, ""

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_1
    sget-object v5, Lcom/friday/common/entity/OssFileType$File;->INSTANCE:Lcom/friday/common/entity/OssFileType$File;

    .line 205
    .line 206
    move-object/from16 v6, p1

    .line 207
    .line 208
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_2

    .line 213
    .line 214
    new-instance v5, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    goto :goto_1

    .line 230
    :cond_2
    move-object v4, v7

    .line 231
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-static {v2, v0}, Lqd/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    new-instance v2, Lcom/friday/common/entity/OssReqData;

    .line 260
    .line 261
    invoke-direct {v2, v1, v0}, Lcom/friday/common/entity/OssReqData;-><init>(Lcom/friday/common/entity/OssTokenReq;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-object v2
.end method
