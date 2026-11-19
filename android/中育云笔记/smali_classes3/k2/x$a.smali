.class public final Lk2/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/x;
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
    invoke-direct {p0}, Lk2/x$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string p1, "getName(...)"

    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v1, "."

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static/range {v0 .. v5}, Lqd/c0;->l0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "substring(...)"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "getDefault(...)"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "toLowerCase(...)"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sparse-switch v0, :sswitch_data_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :sswitch_0
    const-string v0, "xlsx"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_0

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_1
    const-string v0, "pptx"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :sswitch_2
    const-string v0, "jpeg"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_7

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :sswitch_3
    const-string v0, "html"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :sswitch_4
    const-string v0, "docx"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :sswitch_5
    const-string v0, "xmf"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_4

    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :sswitch_6
    const-string v0, "xls"

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_0

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :cond_0
    const-string p1, "application/vnd.ms-excel"

    .line 133
    .line 134
    return-object p1

    .line 135
    :sswitch_7
    const-string v0, "wav"

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_4

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :sswitch_8
    const-string v0, "txt"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_1

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_1
    const-string p1, "text/plain"

    .line 156
    .line 157
    return-object p1

    .line 158
    :sswitch_9
    const-string v0, "ppt"

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_2

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_2
    const-string p1, "application/vnd.ms-powerpoint"

    .line 169
    .line 170
    return-object p1

    .line 171
    :sswitch_a
    const-string v0, "png"

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_7

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :sswitch_b
    const-string v0, "pdf"

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_3

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_3
    const-string p1, "application/pdf"

    .line 192
    .line 193
    return-object p1

    .line 194
    :sswitch_c
    const-string v0, "ogg"

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_4

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :sswitch_d
    const-string v0, "mp4"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-nez p1, :cond_9

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :sswitch_e
    const-string v0, "mp3"

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-nez p1, :cond_4

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :sswitch_f
    const-string v0, "mid"

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_4

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :sswitch_10
    const-string v0, "m4a"

    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-nez p1, :cond_4

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_4
    const-string p1, "audio/*"

    .line 242
    .line 243
    return-object p1

    .line 244
    :sswitch_11
    const-string v0, "jpg"

    .line 245
    .line 246
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-nez p1, :cond_7

    .line 251
    .line 252
    goto :goto_0

    .line 253
    :sswitch_12
    const-string v0, "htm"

    .line 254
    .line 255
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-nez p1, :cond_5

    .line 260
    .line 261
    goto :goto_0

    .line 262
    :cond_5
    const-string p1, "text/html"

    .line 263
    .line 264
    return-object p1

    .line 265
    :sswitch_13
    const-string v0, "gif"

    .line 266
    .line 267
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-nez p1, :cond_7

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :sswitch_14
    const-string v0, "doc"

    .line 275
    .line 276
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-nez p1, :cond_6

    .line 281
    .line 282
    goto :goto_0

    .line 283
    :cond_6
    const-string p1, "application/vnd.ms-word"

    .line 284
    .line 285
    return-object p1

    .line 286
    :sswitch_15
    const-string v0, "bmp"

    .line 287
    .line 288
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-nez p1, :cond_7

    .line 293
    .line 294
    goto :goto_0

    .line 295
    :cond_7
    const-string p1, "image/*"

    .line 296
    .line 297
    return-object p1

    .line 298
    :sswitch_16
    const-string v0, "apk"

    .line 299
    .line 300
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-nez p1, :cond_8

    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_8
    const-string p1, "application/vnd.android.package-archive"

    .line 308
    .line 309
    return-object p1

    .line 310
    :sswitch_17
    const-string v0, "3gp"

    .line 311
    .line 312
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-nez p1, :cond_9

    .line 317
    .line 318
    :goto_0
    const-string p1, "*/*"

    .line 319
    .line 320
    return-object p1

    .line 321
    :cond_9
    const-string p1, "video/*"

    .line 322
    .line 323
    return-object p1

    .line 324
    nop

    .line 325
    :sswitch_data_0
    .sparse-switch
        0xcc5c -> :sswitch_17
        0x17a1c -> :sswitch_16
        0x17d85 -> :sswitch_15
        0x18538 -> :sswitch_14
        0x18fc4 -> :sswitch_13
        0x194e1 -> :sswitch_12
        0x19be1 -> :sswitch_11
        0x19fda -> :sswitch_10
        0x1a648 -> :sswitch_f
        0x1a6f0 -> :sswitch_e
        0x1a6f1 -> :sswitch_d
        0x1ad8f -> :sswitch_c
        0x1b0f2 -> :sswitch_b
        0x1b229 -> :sswitch_a
        0x1b274 -> :sswitch_9
        0x1c270 -> :sswitch_8
        0x1caec -> :sswitch_7
        0x1cfff -> :sswitch_6
        0x1d011 -> :sswitch_5
        0x2f2240 -> :sswitch_4
        0x3107ab -> :sswitch_3
        0x31e068 -> :sswitch_2
        0x349c84 -> :sswitch_1
        0x383059 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Ljava/lang/String;)Landroid/content/Intent;
    .locals 6

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v1, "android.intent.action.VIEW"

    .line 14
    .line 15
    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/high16 v1, 0x10000000

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x1e

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-lt v1, v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {p1, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "file2Uri(...)"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lk2/x$a;->a(Ljava/io/File;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v2, "pdf"

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static {v0, v2, v5, v3, v4}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    const-string v2, "vnd.ms-powerpoint"

    .line 69
    .line 70
    invoke-static {v0, v2, v5, v3, v4}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    const-string v2, "vnd.ms-word"

    .line 77
    .line 78
    invoke-static {v0, v2, v5, v3, v4}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    const-string v2, "vnd.ms-excel"

    .line 85
    .line 86
    invoke-static {v0, v2, v5, v3, v4}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    return-object p1

    .line 94
    :catch_0
    move-exception v0

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    :goto_0
    const-string v0, "cn.wps.moffice_eng"

    .line 97
    .line 98
    const-string v2, "cn.wps.moffice.documentmanager.PreStartActivity2"

    .line 99
    .line 100
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 108
    .line 109
    .line 110
    return-object p1
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "getPackageManager(...)"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "getInstalledPackages(...)"

    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v1, p1

    .line 31
    check-cast v1, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move v2, v0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroid/content/pm/PackageInfo;

    .line 45
    .line 46
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    invoke-static {v3, p2, v4}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    return v4

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return v0
.end method
