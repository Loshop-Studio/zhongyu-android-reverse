.class Lcom/umeng/commonsdk/internal/utils/b$1;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/internal/utils/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/internal/utils/b;


# direct methods
.method public constructor <init>(Lcom/umeng/commonsdk/internal/utils/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/telephony/PhoneStateListener;->onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "base station onSignalStrengthsChanged"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aput-object v2, v1, v3

    .line 11
    .line 12
    const-string v2, "BaseStationUtils"

    .line 13
    .line 14
    invoke-static {v2, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 18
    .line 19
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/b;->d()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "phone"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 30
    .line 31
    invoke-static {v1, v4}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;Landroid/telephony/TelephonyManager;)Landroid/telephony/TelephonyManager;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v4, " "

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v4, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 45
    .line 46
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 47
    .line 48
    .line 49
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    const/16 v5, 0x9

    .line 51
    .line 52
    const-string v6, ""

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    :try_start_1
    iget-object v4, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 57
    .line 58
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/16 v7, 0xd

    .line 67
    .line 68
    if-ne v4, v7, :cond_0

    .line 69
    .line 70
    aget-object p1, v1, v5

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_0
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 94
    .line 95
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 102
    .line 103
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/16 v4, 0x8

    .line 112
    .line 113
    if-eq v1, v4, :cond_1

    .line 114
    .line 115
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 116
    .line 117
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const/16 v4, 0xa

    .line 126
    .line 127
    if-eq v1, v4, :cond_1

    .line 128
    .line 129
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 130
    .line 131
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eq v1, v5, :cond_1

    .line 140
    .line 141
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 142
    .line 143
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    const/4 v4, 0x3

    .line 152
    if-ne v1, v4, :cond_5

    .line 153
    .line 154
    :cond_1
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 155
    .line 156
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/utils/b;->b(Lcom/umeng/commonsdk/internal/utils/b;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_2

    .line 165
    .line 166
    const-string v4, "\u4e2d\u56fd\u79fb\u52a8"

    .line 167
    .line 168
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_2

    .line 173
    .line 174
    const-string p1, "0"

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_3

    .line 182
    .line 183
    const-string v4, "\u4e2d\u56fd\u8054\u901a"

    .line 184
    .line 185
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_3

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getCdmaDbm()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    goto :goto_0

    .line 211
    :cond_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_4

    .line 216
    .line 217
    const-string v4, "\u4e2d\u56fd\u7535\u4fe1"

    .line 218
    .line 219
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_4

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getEvdoDbm()I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    goto :goto_0

    .line 245
    :cond_4
    const/4 p1, 0x0

    .line 246
    goto :goto_0

    .line 247
    :cond_5
    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getGsmSignalStrength()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    mul-int/lit8 p1, p1, 0x2

    .line 252
    .line 253
    add-int/lit8 p1, p1, -0x71

    .line 254
    .line 255
    new-instance v1, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 271
    .line 272
    new-instance v1, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v4, "stationStrength is "

    .line 278
    .line 279
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    aput-object v1, v0, v3

    .line 290
    .line 291
    invoke-static {v2, v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 298
    if-nez v0, :cond_6

    .line 299
    .line 300
    :try_start_2
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/b;->d()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/b;->d()Landroid/content/Context;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    const v2, 0x8004

    .line 317
    .line 318
    .line 319
    invoke-static {v0, v2, v1, p1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 320
    .line 321
    .line 322
    :catchall_0
    :cond_6
    :try_start_3
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/utils/b$1;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 323
    .line 324
    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/utils/b;->c()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 325
    .line 326
    .line 327
    :catch_0
    return-void
.end method
