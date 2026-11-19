.class public Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TXCAudioEngineJNI"

.field private static mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/audio/e;",
            ">;"
        }
    .end annotation
.end field

.field private static mAudioDumpingListener:Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->f()Z

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeCacheClassForNative()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    sput-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioDumpingListener:Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static InitTraeEngineLibrary(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "/lib"

    .line 2
    .line 3
    const-string v1, "add_libpath:"

    .line 4
    .line 5
    const-string v2, "TXCAudioEngineJNI"

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "InitTraeEngineLibrary failed, context is null!"

    .line 10
    .line 11
    invoke-static {v2, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object v3, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v6, "/data/data/"

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->g()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    const-string v0, ""

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v3}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeAppendLibraryPath(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeAppendLibraryPath(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeAppendLibraryPath(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeAppendLibraryPath(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :goto_1
    const-string v0, "init trae engine library failed."

    .line 145
    .line 146
    invoke-static {v2, v0, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public static SetAudioDumpingListener(Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioDumpingListener:Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;

    .line 2
    .line 3
    return-void
.end method

.method public static getStatus(I)Lcom/tencent/liteav/basic/module/StatusBucket;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeGetStatus(I)Lcom/tencent/liteav/basic/module/StatusBucket;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static native nativeAppendLibraryPath(Ljava/lang/String;)V
.end method

.method public static native nativeCacheClassForNative()V
.end method

.method public static nativeCheckTraeEngine(Landroid/content/Context;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "TXCAudioEngineJNI"

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    const-string p0, "nativeCheckTraeEngine failed, context is null!"

    .line 7
    .line 8
    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    const-string v2, "traeimp-rtmp"

    .line 13
    .line 14
    invoke-static {v2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const-string p0, "link traeimp-rtmp success !"

    .line 22
    .line 23
    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object v2, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "/lib"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v7, "/data/data/"

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->g()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-nez v5, :cond_2

    .line 79
    .line 80
    const-string v5, ""

    .line 81
    .line 82
    :cond_2
    new-instance v6, Ljava/io/File;

    .line 83
    .line 84
    new-instance v7, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v8, "/libtraeimp-rtmp.so"

    .line 93
    .line 94
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v7, "nativeCheckTraeEngine load so error "

    .line 118
    .line 119
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Ljava/io/File;

    .line 136
    .line 137
    new-instance v6, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_4

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v2, Ljava/io/File;

    .line 184
    .line 185
    new-instance v4, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_5

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance p0, Ljava/io/File;

    .line 232
    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_6

    .line 256
    .line 257
    :goto_0
    return v3

    .line 258
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const-string p0, "nativeCheckTraeEngine failed, can not find trae libs !"

    .line 280
    .line 281
    invoke-static {v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return v0
.end method

.method public static native nativeClean()V
.end method

.method public static native nativeDeleteAudioSessionDuplicate()V
.end method

.method public static native nativeEnableAudioEarMonitoring(Z)V
.end method

.method public static native nativeEnableAudioVolumeEvaluation(ZI)V
.end method

.method public static native nativeEnableAutoRestartDevice(Z)V
.end method

.method public static native nativeEnableCaptureEOSMode(Z)V
.end method

.method public static native nativeEnableEncodedDataCallback(Z)V
.end method

.method public static native nativeEnableEncodedDataPackWithTRAEHeaderCallback(Z)V
.end method

.method public static native nativeEnableMixMode(Z)V
.end method

.method public static native nativeForceCallbackMixedPlayAudioFrame(Z)V
.end method

.method public static native nativeGetEncoderChannels()I
.end method

.method public static native nativeGetEncoderConfig()Lcom/tencent/liteav/audio/TXCAudioEncoderConfig;
.end method

.method public static native nativeGetEncoderSampleRate()I
.end method

.method public static native nativeGetMixingPlayoutVolumeLevel()I
.end method

.method public static native nativeGetRemotePlayoutVolumeLevel(Ljava/lang/String;)I
.end method

.method public static native nativeGetSoftwareCaptureVolumeLevel()I
.end method

.method public static native nativeGetStatus(I)Lcom/tencent/liteav/basic/module/StatusBucket;
.end method

.method public static native nativeInitAudioDevice()V
.end method

.method public static native nativeInitBeforeEngineCreate(Landroid/content/Context;)V
.end method

.method public static native nativeIsAudioDeviceCapturing()Z
.end method

.method public static native nativeIsAudioDevicePlaying()Z
.end method

.method public static native nativeIsRemoteAudioPlaying(Ljava/lang/String;)Z
.end method

.method public static native nativeMuteLocalAudio(Z)V
.end method

.method public static native nativeMuteRemoteAudio(Ljava/lang/String;Z)V
.end method

.method public static native nativeMuteRemoteAudioInSpeaker(Ljava/lang/String;Z)V
.end method

.method public static native nativeNewAudioSessionDuplicate(Landroid/content/Context;)V
.end method

.method public static native nativePauseAudioCapture(Z)V
.end method

.method public static native nativePauseLocalAudio()V
.end method

.method public static native nativeResumeAudioCapture()V
.end method

.method public static native nativeResumeLocalAudio()V
.end method

.method public static native nativeSendCustomPCMData([BIJII)V
.end method

.method public static native nativeSetAudioEarMonitoringVolume(I)V
.end method

.method public static native nativeSetAudioEncoderParam(II)V
.end method

.method public static native nativeSetAudioEngineCaptureDataCallback(Z)V
.end method

.method public static native nativeSetAudioEngineCaptureRawDataCallback(Z)V
.end method

.method public static native nativeSetAudioEngineEncodedDataCallback(Z)V
.end method

.method public static native nativeSetAudioEngineRemoteStreamDataListener(Ljava/lang/String;Z)V
.end method

.method public static native nativeSetAudioPlayoutTunnelEnabled(Z)V
.end method

.method public static native nativeSetAudioQuality(II)V
.end method

.method public static native nativeSetAudioRoute(I)V
.end method

.method public static native nativeSetCaptureDataCallbackFormat(III)V
.end method

.method public static native nativeSetCaptureVoiceChanger(I)V
.end method

.method public static native nativeSetEncoderChannels(I)V
.end method

.method public static native nativeSetEncoderFECPercent(F)V
.end method

.method public static native nativeSetEncoderSampleRate(I)V
.end method

.method public static native nativeSetEventCallbackEnabled(Z)V
.end method

.method public static native nativeSetMaxSelectedPlayStreams(I)V
.end method

.method public static native nativeSetMixingPlayoutVolume(F)V
.end method

.method public static native nativeSetPlayoutDataCallbackFormat(III)V
.end method

.method public static native nativeSetPlayoutDataListener(Z)V
.end method

.method public static native nativeSetPlayoutDevice(I)V
.end method

.method public static native nativeSetRecordReverb(I)V
.end method

.method public static native nativeSetRemoteAudioBlockThreshold(Ljava/lang/String;J)V
.end method

.method public static native nativeSetRemoteAudioCacheParams(Ljava/lang/String;ZIII)V
.end method

.method public static native nativeSetRemoteAudioJitterCycle(Ljava/lang/String;J)V
.end method

.method public static native nativeSetRemotePlayoutVolume(Ljava/lang/String;I)V
.end method

.method public static native nativeSetRemoteStreamDataCallbackFormat(Ljava/lang/String;III)V
.end method

.method public static native nativeSetSoftAEC(I)V
.end method

.method public static native nativeSetSoftAGC(I)V
.end method

.method public static native nativeSetSoftANS(I)V
.end method

.method public static native nativeSetSoftwareCaptureVolume(F)V
.end method

.method public static native nativeSetSystemVolumeType(I)V
.end method

.method public static native nativeSetTRAEConfig(Ljava/lang/String;)V
.end method

.method public static native nativeStartLocalAudio(IZ)V
.end method

.method public static native nativeStartLocalAudioDumping(IILjava/lang/String;)I
.end method

.method public static native nativeStartRemoteAudio(Lcom/tencent/liteav/audio/TXCAudioEngine;ZLjava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeStopLocalAudio()V
.end method

.method public static native nativeStopLocalAudioDumping()V
.end method

.method public static native nativeStopRemoteAudio(Ljava/lang/String;)V
.end method

.method public static native nativeUnInitEngine()V
.end method

.method public static native nativeUseSysAudioDevice(Z)V
.end method

.method public static onError(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/tencent/liteav/audio/TXCAudioEngine;->onError(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static onEvent(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/liteav/audio/TXCAudioEngine;->getInstance()Lcom/tencent/liteav/audio/TXCAudioEngine;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/tencent/liteav/audio/TXCAudioEngine;->onEvent(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static onLocalAudioWriteFail()V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioDumpingListener:Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static onRecordEncData([BJII)V
    .locals 8

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lcom/tencent/liteav/audio/e;

    .line 19
    .line 20
    const/16 v7, 0x10

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    move-wide v3, p1

    .line 24
    move v5, p3

    .line 25
    move v6, p4

    .line 26
    invoke-interface/range {v1 .. v7}, Lcom/tencent/liteav/audio/e;->b([BJIII)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public static onRecordError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onRecordError: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "TXCAudioEngineJNI"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/tencent/liteav/audio/e;

    .line 48
    .line 49
    invoke-interface {v0, p0, p1}, Lcom/tencent/liteav/audio/e;->a(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public static onRecordPcmData([BJIII)V
    .locals 8

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lcom/tencent/liteav/audio/e;

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    move-wide v3, p1

    .line 22
    move v5, p3

    .line 23
    move v6, p4

    .line 24
    move v7, p5

    .line 25
    invoke-interface/range {v1 .. v7}, Lcom/tencent/liteav/audio/e;->a([BJIII)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public static onRecordRawPcmData([BJIII)V
    .locals 9

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lcom/tencent/liteav/audio/e;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    move-object v2, p0

    .line 22
    move-wide v3, p1

    .line 23
    move v5, p3

    .line 24
    move v6, p4

    .line 25
    move v7, p5

    .line 26
    invoke-interface/range {v1 .. v8}, Lcom/tencent/liteav/audio/e;->a([BJIIIZ)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public static pauseAudioCapture(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativePauseAudioCapture(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static resumeAudioCapture()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeResumeAudioCapture()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static sendCustomPCMData(Lcom/tencent/liteav/basic/structs/a;)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/basic/structs/a;->f:[B

    array-length v1, v0

    iget-wide v2, p0, Lcom/tencent/liteav/basic/structs/a;->e:J

    iget v4, p0, Lcom/tencent/liteav/basic/structs/a;->a:I

    iget v5, p0, Lcom/tencent/liteav/basic/structs/a;->b:I

    invoke-static/range {v0 .. v5}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeSendCustomPCMData([BIJII)V

    return-void
.end method

.method public static sendCustomPCMData([BII)V
    .locals 6

    .line 1
    array-length v1, p0

    const-wide/16 v2, 0x0

    move-object v0, p0

    move v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeSendCustomPCMData([BIJII)V

    return-void
.end method

.method public static setAudioCaptureDataListener(Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/audio/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    sput-object p0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    move p0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p0, v0

    .line 10
    :goto_0
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeSetAudioEngineCaptureDataCallback(Z)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    move p0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move p0, v0

    .line 20
    :goto_1
    invoke-static {p0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeSetAudioEngineCaptureRawDataCallback(Z)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->mAudioCaptureDataListener:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    move v0, v1

    .line 28
    :cond_2
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/TXCAudioEngineJNI;->nativeSetAudioEngineEncodedDataCallback(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
