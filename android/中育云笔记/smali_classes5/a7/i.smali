.class public abstract La7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, La7/i;->c(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, La7/i;->d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string p4, "mounted"

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    sget-object p0, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p4, Ljava/io/File;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, "Camera"

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-static {p0, p1}, La7/i;->i(Landroid/content/Context;I)Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p4, Ljava/io/File;

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    new-instance p0, Ljava/io/File;

    .line 105
    .line 106
    invoke-direct {p0, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 117
    .line 118
    .line 119
    move-result p4

    .line 120
    if-nez p4, :cond_2

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-virtual {p4}, Ljava/io/File;->mkdirs()Z

    .line 127
    .line 128
    .line 129
    :cond_2
    move-object p4, p0

    .line 130
    :cond_3
    :goto_1
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-nez p0, :cond_4

    .line 135
    .line 136
    invoke-virtual {p4}, Ljava/io/File;->mkdirs()Z

    .line 137
    .line 138
    .line 139
    :cond_4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    const/4 v0, 0x2

    .line 144
    if-eq p1, v0, :cond_9

    .line 145
    .line 146
    const/4 v0, 0x3

    .line 147
    if-eq p1, v0, :cond_7

    .line 148
    .line 149
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_5

    .line 154
    .line 155
    const-string p3, ".jpg"

    .line 156
    .line 157
    :cond_5
    if-eqz p0, :cond_6

    .line 158
    .line 159
    new-instance p0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string p1, "IMG_"

    .line 165
    .line 166
    invoke-static {p1}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    :cond_6
    new-instance p0, Ljava/io/File;

    .line 181
    .line 182
    invoke-direct {p0, p4, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_7
    if-eqz p0, :cond_8

    .line 187
    .line 188
    new-instance p0, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string p1, "AUD_"

    .line 194
    .line 195
    invoke-static {p1}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string p1, ".amr"

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    :cond_8
    new-instance p0, Ljava/io/File;

    .line 212
    .line 213
    invoke-direct {p0, p4, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_9
    if-eqz p0, :cond_a

    .line 218
    .line 219
    new-instance p0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string p1, "VID_"

    .line 225
    .line 226
    invoke-static {p1}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string p1, ".mp4"

    .line 234
    .line 235
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    :cond_a
    new-instance p0, Ljava/io/File;

    .line 243
    .line 244
    invoke-direct {p0, p4, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object p0
.end method

.method public static e(J)Ljava/lang/String;
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-ltz v0, :cond_7

    .line 6
    .line 7
    const-wide/16 v0, 0x3e8

    .line 8
    .line 9
    cmp-long v0, p0, v0

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    const-string v3, "%.2f"

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    long-to-double p0, p0

    .line 18
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    long-to-double v7, v5

    .line 44
    sub-double/2addr v7, v3

    .line 45
    cmpl-double v0, v7, v1

    .line 46
    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "B"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_1
    const-wide/32 v4, 0xf4240

    .line 67
    .line 68
    .line 69
    cmp-long v0, p0, v4

    .line 70
    .line 71
    if-gez v0, :cond_3

    .line 72
    .line 73
    long-to-double p0, p0

    .line 74
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    div-double/2addr p0, v4

    .line 80
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    long-to-double v7, v5

    .line 106
    sub-double/2addr v7, v3

    .line 107
    cmpl-double v0, v7, v1

    .line 108
    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p0, "KB"

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_3
    const-wide/32 v4, 0x3b9aca00

    .line 129
    .line 130
    .line 131
    cmp-long v0, p0, v4

    .line 132
    .line 133
    if-gez v0, :cond_5

    .line 134
    .line 135
    long-to-double p0, p0

    .line 136
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    div-double/2addr p0, v4

    .line 142
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    new-instance p1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    long-to-double v7, v5

    .line 168
    sub-double/2addr v7, v3

    .line 169
    cmpl-double v0, v7, v1

    .line 170
    .line 171
    if-nez v0, :cond_4

    .line 172
    .line 173
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :cond_4
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p0, "MB"

    .line 181
    .line 182
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :cond_5
    long-to-double p0, p0

    .line 191
    const-wide v4, 0x41cdcd6500000000L    # 1.0E9

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    div-double/2addr p0, v4

    .line 197
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 210
    .line 211
    .line 212
    move-result-wide v3

    .line 213
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 214
    .line 215
    .line 216
    move-result-wide v5

    .line 217
    new-instance p1, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    long-to-double v7, v5

    .line 223
    sub-double/2addr v7, v3

    .line 224
    cmpl-double v0, v7, v1

    .line 225
    .line 226
    if-nez v0, :cond_6

    .line 227
    .line 228
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    :cond_6
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string p0, "GB"

    .line 236
    .line 237
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    const-string p1, "byteSize shouldn\'t be less than zero!"

    .line 248
    .line 249
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p0
.end method

.method public static f(J)Ljava/lang/String;
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-ltz v0, :cond_7

    .line 6
    .line 7
    const-wide/16 v0, 0x400

    .line 8
    .line 9
    cmp-long v0, p0, v0

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    const-string v3, "%.2f"

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    long-to-double p0, p0

    .line 18
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    long-to-double v7, v5

    .line 44
    sub-double/2addr v7, v3

    .line 45
    cmpl-double v0, v7, v1

    .line 46
    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, "B"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_1
    const-wide/32 v4, 0x100000

    .line 67
    .line 68
    .line 69
    cmp-long v0, p0, v4

    .line 70
    .line 71
    if-gez v0, :cond_3

    .line 72
    .line 73
    long-to-double p0, p0

    .line 74
    const-wide/high16 v4, 0x4090000000000000L    # 1024.0

    .line 75
    .line 76
    div-double/2addr p0, v4

    .line 77
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    long-to-double v7, v5

    .line 103
    sub-double/2addr v7, v3

    .line 104
    cmpl-double v0, v7, v1

    .line 105
    .line 106
    if-nez v0, :cond_2

    .line 107
    .line 108
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p0, "KB"

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_3
    const-wide/32 v4, 0x40000000

    .line 126
    .line 127
    .line 128
    cmp-long v0, p0, v4

    .line 129
    .line 130
    if-gez v0, :cond_5

    .line 131
    .line 132
    long-to-double p0, p0

    .line 133
    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    .line 134
    .line 135
    div-double/2addr p0, v4

    .line 136
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    new-instance p1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    long-to-double v7, v5

    .line 162
    sub-double/2addr v7, v3

    .line 163
    cmpl-double v0, v7, v1

    .line 164
    .line 165
    if-nez v0, :cond_4

    .line 166
    .line 167
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    :cond_4
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p0, "MB"

    .line 175
    .line 176
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :cond_5
    long-to-double p0, p0

    .line 185
    const-wide/high16 v4, 0x41d0000000000000L    # 1.073741824E9

    .line 186
    .line 187
    div-double/2addr p0, v4

    .line 188
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, La7/q;->a(Ljava/lang/Object;)D

    .line 201
    .line 202
    .line 203
    move-result-wide v3

    .line 204
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 205
    .line 206
    .line 207
    move-result-wide v5

    .line 208
    new-instance p1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    long-to-double v7, v5

    .line 214
    sub-double/2addr v7, v3

    .line 215
    cmpl-double v0, v7, v1

    .line 216
    .line 217
    if-nez v0, :cond_6

    .line 218
    .line 219
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    :cond_6
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string p0, "GB"

    .line 227
    .line 228
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 237
    .line 238
    const-string p1, "byteSize shouldn\'t be less than zero!"

    .line 239
    .line 240
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p0
.end method

.method public static g(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "_data"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const/4 v7, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v2, p1

    .line 14
    move-object v4, p2

    .line 15
    move-object v5, p3

    .line 16
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-interface {v7, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    goto :goto_3

    .line 43
    :catch_0
    move-exception v0

    .line 44
    move-object p0, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    if-eqz v7, :cond_1

    .line 47
    .line 48
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    :try_start_1
    const-string p1, "PictureFileUtils"

    .line 53
    .line 54
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const-string p3, "getDataColumn: _data - [%s]"

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p2, p3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    :goto_2
    const-string p0, ""

    .line 79
    .line 80
    return-object p0

    .line 81
    :goto_3
    if-eqz v7, :cond_2

    .line 82
    .line 83
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 84
    .line 85
    .line 86
    :cond_2
    throw p0
.end method

.method public static h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    invoke-static {p1}, La7/i;->k(Landroid/net/Uri;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    const-string v3, ":"

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    aget-object v0, p1, v2

    .line 31
    .line 32
    const-string v1, "primary"

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_9

    .line 39
    .line 40
    invoke-static {}, La7/j;->e()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const-string v1, "/"

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v2, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    aget-object p0, p1, v4

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    aget-object p1, p1, v4

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_1
    invoke-static {p1}, La7/i;->j(Landroid/net/Uri;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string v0, "content://downloads/public_downloads"

    .line 111
    .line 112
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {p1}, La7/q;->e(Ljava/lang/Object;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    invoke-static {v0, v2, v3}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p0, p1, v1, v1}, La7/i;->g(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_2
    invoke-static {p1}, La7/i;->o(Landroid/net/Uri;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    aget-object v0, p1, v2

    .line 144
    .line 145
    const-string v2, "image"

    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_3

    .line 152
    .line 153
    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const-string v2, "video"

    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_4
    const-string v2, "audio"

    .line 168
    .line 169
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 176
    .line 177
    :cond_5
    :goto_0
    aget-object p1, p1, v4

    .line 178
    .line 179
    filled-new-array {p1}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const-string v0, "_id=?"

    .line 184
    .line 185
    invoke-static {p0, v1, v0, p1}, La7/i;->g(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :cond_6
    const-string v0, "content"

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    invoke-static {p1}, La7/i;->m(Landroid/net/Uri;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :cond_7
    invoke-static {p0, p1, v1, v1}, La7/i;->g(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :cond_8
    const-string p0, "file"

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_9

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :cond_9
    const-string p0, ""

    .line 236
    .line 237
    return-object p0
.end method

.method public static i(Landroid/content/Context;I)Ljava/io/File;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p1, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p1, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static j(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    const-string v0, "com.android.providers.downloads.documents"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static k(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    const-string v0, "com.android.externalstorage.documents"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static m(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    const-string v0, "com.google.android.apps.photos.content"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static n(Ljava/lang/String;)Z
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    .line 12
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    iget p0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 16
    .line 17
    if-lez p0, :cond_0

    .line 18
    .line 19
    iget p0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 20
    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static o(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    const-string v0, "com.android.providers.media.documents"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static p(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ".luckProvider"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p0, v0, p1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static q(Ljava/io/InputStream;Ljava/io/OutputStream;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 4
    .line 5
    invoke-direct {v2, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    .line 7
    .line 8
    :try_start_1
    new-instance p0, Ljava/io/BufferedOutputStream;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x400

    .line 14
    .line 15
    :try_start_2
    new-array v1, v1, [B

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, -0x1

    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v1, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :goto_1
    move-object v1, v2

    .line 30
    goto :goto_4

    .line 31
    :catch_0
    move-exception p1

    .line 32
    :goto_2
    move-object v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, La7/i;->a(Ljava/io/Closeable;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, La7/i;->a(Ljava/io/Closeable;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :catchall_1
    move-exception p1

    .line 46
    move-object p0, v1

    .line 47
    goto :goto_1

    .line 48
    :catch_1
    move-exception p1

    .line 49
    move-object p0, v1

    .line 50
    goto :goto_2

    .line 51
    :catchall_2
    move-exception p1

    .line 52
    move-object p0, v1

    .line 53
    goto :goto_4

    .line 54
    :catch_2
    move-exception p1

    .line 55
    move-object p0, v1

    .line 56
    :goto_3
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, La7/i;->a(Ljava/io/Closeable;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0}, La7/i;->a(Ljava/io/Closeable;)V

    .line 63
    .line 64
    .line 65
    return v0

    .line 66
    :catchall_3
    move-exception p1

    .line 67
    :goto_4
    invoke-static {v1}, La7/i;->a(Ljava/io/Closeable;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, La7/i;->a(Ljava/io/Closeable;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method
