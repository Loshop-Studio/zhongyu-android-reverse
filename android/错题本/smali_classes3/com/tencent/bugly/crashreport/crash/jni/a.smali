.class public final Lcom/tencent/bugly/crashreport/crash/jni/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/jni/a;->a:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/tencent/bugly/crashreport/crash/jni/a;->a:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 4
    .line 5
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v3, "native_record_lock"

    .line 10
    .line 11
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/ap;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "[Native] Failed to lock file for handling native crash record."

    .line 19
    .line 20
    new-array v2, v4, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, "false"

    .line 33
    .line 34
    invoke-static {v2, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v0, v5, v6}, Lcom/tencent/bugly/proguard/be;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const-string v5, "[Native] Get crash from native record."

    .line 56
    .line 57
    new-array v6, v4, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Lcom/tencent/bugly/proguard/as;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/4 v6, 0x1

    .line 67
    invoke-virtual {v5, v0, v6}, Lcom/tencent/bugly/proguard/as;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Lcom/tencent/bugly/proguard/as;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5, v0, v4}, Lcom/tencent/bugly/proguard/as;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v4, v0}, Lcom/tencent/bugly/proguard/be;->a(ZLjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/proguard/ap;->b()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    sget-wide v7, Lcom/tencent/bugly/proguard/at;->j:J

    .line 92
    .line 93
    sub-long/2addr v5, v7

    .line 94
    invoke-static {}, Lcom/tencent/bugly/proguard/ap;->b()J

    .line 95
    .line 96
    .line 97
    move-result-wide v7

    .line 98
    const-wide/32 v9, 0x5265c00

    .line 99
    .line 100
    .line 101
    add-long/2addr v7, v9

    .line 102
    new-instance v0, Ljava/io/File;

    .line 103
    .line 104
    sget-object v9, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eqz v9, :cond_9

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_9

    .line 120
    .line 121
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_9

    .line 126
    .line 127
    array-length v9, v0

    .line 128
    if-nez v9, :cond_4

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    new-instance v9, Lcoil3/t;

    .line 132
    .line 133
    const/4 v10, 0x3

    .line 134
    invoke-direct {v9, v10}, Lcoil3/t;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v9}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 138
    .line 139
    .line 140
    array-length v9, v0

    .line 141
    const-wide/16 v10, 0x0

    .line 142
    .line 143
    move-wide v12, v10

    .line 144
    move v10, v4

    .line 145
    move v11, v10

    .line 146
    :goto_0
    if-ge v4, v9, :cond_8

    .line 147
    .line 148
    aget-object v14, v0, v4

    .line 149
    .line 150
    invoke-virtual {v14}, Ljava/io/File;->lastModified()J

    .line 151
    .line 152
    .line 153
    move-result-wide v15

    .line 154
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 155
    .line 156
    .line 157
    move-result-wide v17

    .line 158
    add-long v12, v12, v17

    .line 159
    .line 160
    cmp-long v17, v15, v5

    .line 161
    .line 162
    if-ltz v17, :cond_6

    .line 163
    .line 164
    cmp-long v15, v15, v7

    .line 165
    .line 166
    if-gez v15, :cond_6

    .line 167
    .line 168
    sget-wide v15, Lcom/tencent/bugly/proguard/at;->i:J

    .line 169
    .line 170
    cmp-long v15, v12, v15

    .line 171
    .line 172
    if-ltz v15, :cond_5

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_5
    move-object/from16 v17, v0

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :catchall_0
    move-exception v0

    .line 179
    goto :goto_3

    .line 180
    :cond_6
    :goto_1
    const-string v15, "[Native] Delete record file: %s"

    .line 181
    .line 182
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v16

    .line 186
    move-object/from16 v17, v0

    .line 187
    .line 188
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v15, v0}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    add-int/lit8 v10, v10, 0x1

    .line 196
    .line 197
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    add-int/lit8 v11, v11, 0x1

    .line 204
    .line 205
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    move-object/from16 v0, v17

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_8
    const-string v0, "[Native] Number of record files overdue: %d, has deleted: %d"

    .line 211
    .line 212
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :goto_3
    invoke-static {v0}, Lcom/tencent/bugly/proguard/al;->a(Ljava/lang/Throwable;)Z

    .line 229
    .line 230
    .line 231
    :cond_9
    :goto_4
    invoke-static {v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Landroid/content/Context;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/ap;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    return-void
.end method
