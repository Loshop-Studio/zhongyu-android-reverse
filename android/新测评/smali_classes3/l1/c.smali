.class public abstract Ll1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, ".cropper.fileprovider"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static final b(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 9

    .line 1
    const-string v0, "getUriForFile(...)"

    .line 2
    .line 3
    const-string v1, "AIC"

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "file"

    .line 11
    .line 12
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ll1/c;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    const-string v3, "Try get URI for scope storage - content://"

    .line 20
    .line 21
    invoke-static {v1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :catch_0
    move-exception v3

    .line 33
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    const-string v3, "ANR Risk -- Copying the file the location cache to avoid \'external-files-path\' bug for N+ devices"

    .line 45
    .line 46
    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/io/File;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v5, "CROP_LIB_CACHE"

    .line 56
    .line 57
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Ljava/io/File;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    :try_start_2
    new-instance v6, Ljava/io/FileInputStream;

    .line 72
    .line 73
    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 74
    .line 75
    .line 76
    :try_start_3
    new-instance v7, Ljava/io/FileOutputStream;

    .line 77
    .line 78
    invoke-direct {v7, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 79
    .line 80
    .line 81
    const/4 v8, 0x2

    .line 82
    :try_start_4
    invoke-static {v6, v7, v3, v8, v5}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    .line 83
    .line 84
    .line 85
    const-string v5, "Completed Android N+ file copy. Attempting to return the cached file"

    .line 86
    .line 87
    invoke-static {v1, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v2, v4}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 101
    .line 102
    .line 103
    return-object v4

    .line 104
    :catch_1
    move-exception v0

    .line 105
    goto/16 :goto_5

    .line 106
    .line 107
    :catchall_0
    move-exception v0

    .line 108
    :goto_0
    move-object v5, v6

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :catch_2
    move-exception v0

    .line 112
    :goto_1
    move-object v5, v6

    .line 113
    goto :goto_2

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object v7, v5

    .line 116
    goto :goto_0

    .line 117
    :catch_3
    move-exception v0

    .line 118
    move-object v7, v5

    .line 119
    goto :goto_1

    .line 120
    :catchall_2
    move-exception v0

    .line 121
    move-object v7, v5

    .line 122
    goto :goto_4

    .line 123
    :catch_4
    move-exception v0

    .line 124
    move-object v7, v5

    .line 125
    :goto_2
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    const-string v0, "Trying to provide URI manually"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v4, "content://"

    .line 147
    .line 148
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v2, "/files/my_images/"

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    const/16 v4, 0x1a

    .line 166
    .line 167
    if-lt v2, v4, :cond_0

    .line 168
    .line 169
    new-array v2, v3, [Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v0, v2}, Ll1/a;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    new-array v3, v3, [Ljava/nio/file/attribute/FileAttribute;

    .line 176
    .line 177
    invoke-static {v2, v3}, Ll1/b;->a(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    goto :goto_4

    .line 183
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 184
    .line 185
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_1

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 195
    .line 196
    .line 197
    :cond_1
    :goto_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    new-instance v3, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v2, "parse(...)"

    .line 221
    .line 222
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 223
    .line 224
    .line 225
    if-eqz v5, :cond_2

    .line 226
    .line 227
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 228
    .line 229
    .line 230
    :cond_2
    if-eqz v7, :cond_3

    .line 231
    .line 232
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 233
    .line 234
    .line 235
    :cond_3
    return-object v0

    .line 236
    :goto_4
    if-eqz v5, :cond_4

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 239
    .line 240
    .line 241
    :cond_4
    if-eqz v7, :cond_5

    .line 242
    .line 243
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 244
    .line 245
    .line 246
    :cond_5
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 247
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 259
    .line 260
    const/16 v2, 0x1d

    .line 261
    .line 262
    const-string v3, "fromFile(...)"

    .line 263
    .line 264
    if-ge v0, v2, :cond_6

    .line 265
    .line 266
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    if-eqz p0, :cond_6

    .line 271
    .line 272
    :try_start_8
    const-string v0, "Use External storage, do not work for OS 29 and above"

    .line 273
    .line 274
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    new-instance v0, Ljava/io/File;

    .line 278
    .line 279
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-direct {v0, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 295
    .line 296
    .line 297
    return-object p0

    .line 298
    :catch_5
    move-exception p0

    .line 299
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    :cond_6
    const-string p0, "Try get URI using file://"

    .line 311
    .line 312
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-object p0
.end method
