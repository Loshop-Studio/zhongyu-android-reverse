.class public final Lk2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk2/o;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk2/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lk2/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/o;->a:Lk2/o;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, "/deviceId/deviceId.bin"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lk2/o;->b:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "schoolCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "username"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lk2/o;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-static {v1, v2, v0, v2}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "\n"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lqd/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "decode(...)"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Ljava/lang/String;

    .line 74
    .line 75
    sget-object v3, Lqd/c;->b:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-direct {v1, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lorg/json/JSONObject;

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v1, "toLowerCase(...)"

    .line 92
    .line 93
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, "_"

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_1

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    return-object p1

    .line 127
    :catch_0
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 129
    .line 130
    .line 131
    :cond_1
    return-object v2
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createFileByDeleteOldFile(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p2, v1, p1, v1}, Lcd/g;->g(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 28
    return p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-string v0, "schoolCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "username"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "deviceId"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lk2/o;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v3, v4, v0, v4}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v3, "\n"

    .line 47
    .line 48
    invoke-static {v0, v3}, Lqd/c0;->z0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v3, "decode(...)"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ljava/lang/String;

    .line 68
    .line 69
    sget-object v4, Lqd/c;->b:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Lorg/json/JSONObject;

    .line 75
    .line 76
    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v4, "keys(...)"

    .line 84
    .line 85
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_0

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const-string v5, "next(...)"

    .line 99
    .line 100
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catch_0
    move-exception v0

    .line 114
    goto :goto_1

    .line 115
    :catch_1
    move-exception p1

    .line 116
    goto :goto_2

    .line 117
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 118
    .line 119
    .line 120
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const-string v0, "toLowerCase(...)"

    .line 127
    .line 128
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p1, "_"

    .line 140
    .line 141
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-interface {v1, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    new-instance p1, Lcom/google/gson/Gson;

    .line 155
    .line 156
    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object p2, Lqd/c;->b:Ljava/nio/charset/Charset;

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    const-string p3, "getBytes(...)"

    .line 173
    .line 174
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v2}, Landroid/util/Base64;->encode([BI)[B

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const-string p3, "encode(...)"

    .line 182
    .line 183
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    new-instance p3, Ljava/lang/String;

    .line 187
    .line 188
    invoke-direct {p3, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 189
    .line 190
    .line 191
    sget-object p1, Lk2/o;->b:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p0, p1, p3}, Lk2/o;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    return p1

    .line 198
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 199
    .line 200
    .line 201
    const-string p1, "\u6ca1\u6709\u5b58\u50a8\u6743\u9650"

    .line 202
    .line 203
    invoke-static {p1}, Lz1/b;->d(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string p1, "STORAGE"

    .line 207
    .line 208
    filled-new-array {p1}, [Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permissionGroup([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->request()V

    .line 217
    .line 218
    .line 219
    return v2
.end method
