.class Lcom/taobao/sophix/b/a/a/a;
.super Ldalvik/system/PathClassLoader;
.source "SourceFile"

# interfaces
.implements Lcom/taobao/sophix/core/dex/ILibPathLoader;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/reflect/Method;

.field private final c:Ljava/lang/reflect/Method;

.field private final d:Ljava/lang/reflect/Method;

.field private final e:Ljava/lang/reflect/Method;

.field private final f:Ljava/lang/reflect/Method;

.field private final g:Ljava/lang/reflect/Method;

.field private h:Ljava/lang/ClassLoader;

.field private i:Ljava/lang/ClassLoader;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldalvik/system/DexFile;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, v0, v1}, Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->j:Ljava/util/List;

    .line 16
    .line 17
    :try_start_0
    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :try_start_1
    const-class v0, Ljava/lang/ClassLoader;

    .line 19
    .line 20
    const-string v1, "parent"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 31
    .line 32
    const-class p1, Ljava/lang/ClassLoader;

    .line 33
    .line 34
    const-string v0, "findLibrary"

    .line 35
    .line 36
    const-class v1, Ljava/lang/String;

    .line 37
    .line 38
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->c:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    const-class p1, Ljava/lang/ClassLoader;

    .line 49
    .line 50
    const-string v0, "findClass"

    .line 51
    .line 52
    const-class v1, Ljava/lang/String;

    .line 53
    .line 54
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->d:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    const-class p1, Ljava/lang/ClassLoader;

    .line 65
    .line 66
    const-string v0, "findResource"

    .line 67
    .line 68
    const-class v1, Ljava/lang/String;

    .line 69
    .line 70
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->b:Ljava/lang/reflect/Method;

    .line 79
    .line 80
    const-class p1, Ljava/lang/ClassLoader;

    .line 81
    .line 82
    const-string v0, "findLoadedClass"

    .line 83
    .line 84
    const-class v1, Ljava/lang/String;

    .line 85
    .line 86
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->e:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    const-class p1, Ljava/lang/ClassLoader;

    .line 97
    .line 98
    const-string v0, "getPackage"

    .line 99
    .line 100
    const-class v1, Ljava/lang/String;

    .line 101
    .line 102
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->g:Ljava/lang/reflect/Method;

    .line 111
    .line 112
    const-class p1, Ljava/lang/ClassLoader;

    .line 113
    .line 114
    const-string v0, "findResources"

    .line 115
    .line 116
    const-class v1, Ljava/lang/String;

    .line 117
    .line 118
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lcom/taobao/sophix/b/a/a/a;->f:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    const-string p1, "zaszun#"

    .line 129
    .line 130
    const-string v0, "s"

    .line 131
    .line 132
    const-string v1, "m"

    .line 133
    .line 134
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v0, "z"

    .line 139
    .line 140
    const-string v1, "s"

    .line 141
    .line 142
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-string v0, "#"

    .line 147
    .line 148
    const-string v1, "g"

    .line 149
    .line 150
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lcom/taobao/sophix/e/b;->b()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    xor-int/lit8 v0, p1, 0x1

    .line 164
    .line 165
    iput-boolean v0, p0, Lcom/taobao/sophix/b/a/a/a;->a:Z

    .line 166
    .line 167
    if-nez p1, :cond_0

    .line 168
    .line 169
    move-object v0, p0

    .line 170
    goto :goto_0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 172
    .line 173
    :goto_0
    iput-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->i:Ljava/lang/ClassLoader;

    .line 174
    .line 175
    if-nez p1, :cond_1

    .line 176
    .line 177
    sget-object p1, Lcom/taobao/sophix/e/h;->a:Ljava/lang/Class;

    .line 178
    .line 179
    const-string v0, "mPackageInfo"

    .line 180
    .line 181
    invoke-static {p1, v0}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, "mClassLoader"

    .line 200
    .line 201
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1, p0}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->b()Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_1

    .line 220
    .line 221
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 222
    .line 223
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/a;->a(Landroid/app/Application;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/a;->b(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-direct {p0}, Lcom/taobao/sophix/b/a/a/a;->a()V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_0

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :catch_0
    move-exception p1

    .line 235
    goto :goto_1

    .line 236
    :catch_1
    move-exception p1

    .line 237
    goto :goto_2

    .line 238
    :catch_2
    move-exception p1

    .line 239
    goto :goto_3

    .line 240
    :cond_1
    return-void

    .line 241
    :catchall_0
    move-exception v0

    .line 242
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 243
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_0

    .line 244
    :goto_1
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 245
    .line 246
    const/16 v1, 0x56

    .line 247
    .line 248
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :goto_2
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 253
    .line 254
    const/16 v1, 0x55

    .line 255
    .line 256
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :goto_3
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 261
    .line 262
    const/16 v1, 0x54

    .line 263
    .line 264
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    throw v0
.end method

.method private a(Landroid/app/Application;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "dexCache"

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private a()V
    .locals 3

    .line 2
    const-class v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "classLoader"

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    .line 4
    invoke-virtual {v0, v2, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 3

    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "resolvedTypes"

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 6
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 8
    aget-object v2, p1, v1

    check-cast v2, Ljava/lang/Class;

    .line 9
    invoke-direct {p0, v2, v0}, Lcom/taobao/sophix/b/a/a/a;->a(Ljava/lang/Class;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 10
    aput-object v2, p1, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 11
    :goto_2
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x56

    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0

    .line 12
    :goto_3
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x55

    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method private a(Ljava/lang/Class;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 16
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .line 17
    const-string v0, "com.taobao.sophix."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.ali.fixHelper"

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lcom/taobao/sophix/b/b;->d:Ljava/io/File;

    .line 4
    .line 5
    const-string v2, "sophix.mkbm"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lcom/taobao/sophix/core/dex/SophixNative;->clearResolvedCache(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Lcom/taobao/sophix/a/b;

    .line 22
    .line 23
    const/16 v0, 0x4e

    .line 24
    .line 25
    const-string v1, "fail to clear cache! abort cold fix"

    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method


# virtual methods
.method public a(Ljava/io/File;)V
    .locals 3

    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ColdClassLoader"

    const-string v2, "addDexFile"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 20
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Ldalvik/system/DexFile;->loadDex(Ljava/lang/String;Ljava/lang/String;I)Ldalvik/system/DexFile;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :catch_0
    move-exception p1

    .line 22
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x51

    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/a;->a(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/taobao/sophix/b/a/a/a;->a:Z

    .line 6
    .line 7
    const-string v2, "ColdClassLoader"

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/taobao/sophix/b/a/a/a;->e:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Class;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    :goto_0
    return-object v1

    .line 57
    :catch_0
    move-exception v1

    .line 58
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lcom/taobao/sophix/a/e;

    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/taobao/sophix/a/e;->a()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    new-instance v3, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v4, "findClass fail to find loaded class: "

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    :cond_2
    const/4 v1, 0x0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    :try_start_1
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->d:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    iget-object v3, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 100
    .line 101
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    .line 111
    return-object v0

    .line 112
    :catch_1
    move-exception v0

    .line 113
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Lcom/taobao/sophix/a/e;

    .line 118
    .line 119
    invoke-virtual {v3}, Lcom/taobao/sophix/a/e;->a()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_3

    .line 124
    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v4, "findClass fail to find kept class: "

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    new-array v4, v1, [Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {v2, v3, v0, v4}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    :cond_3
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->j:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_5

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Ldalvik/system/DexFile;

    .line 164
    .line 165
    iget-object v4, p0, Lcom/taobao/sophix/b/a/a/a;->i:Ljava/lang/ClassLoader;

    .line 166
    .line 167
    invoke-virtual {v3, p1, v4}, Ldalvik/system/DexFile;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-eqz v3, :cond_4

    .line 172
    .line 173
    return-object v3

    .line 174
    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->d:Ljava/lang/reflect/Method;

    .line 175
    .line 176
    iget-object v3, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 177
    .line 178
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 187
    .line 188
    if-eqz v0, :cond_6

    .line 189
    .line 190
    return-object v0

    .line 191
    :catch_2
    move-exception v0

    .line 192
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Lcom/taobao/sophix/a/e;

    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/taobao/sophix/a/e;->a()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_6

    .line 203
    .line 204
    new-instance v3, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string v4, "findClass fail to find: "

    .line 210
    .line 211
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    new-array v4, v1, [Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {v2, v3, v0, v4}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    :cond_6
    :try_start_3
    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 230
    if-eqz p1, :cond_7

    .line 231
    .line 232
    return-object p1

    .line 233
    :catch_3
    move-exception v0

    .line 234
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Lcom/taobao/sophix/a/e;

    .line 239
    .line 240
    invoke-virtual {v3}, Lcom/taobao/sophix/a/e;->a()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_7

    .line 245
    .line 246
    new-instance v3, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v4, "super findClass fail to find: "

    .line 252
    .line 253
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    new-array v1, v1, [Ljava/lang/Object;

    .line 264
    .line 265
    invoke-static {v2, p1, v0, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 266
    .line 267
    .line 268
    :cond_7
    new-instance p1, Ljava/lang/ClassNotFoundException;

    .line 269
    .line 270
    invoke-direct {p1}, Ljava/lang/ClassNotFoundException;-><init>()V

    .line 271
    .line 272
    .line 273
    throw p1
.end method

.method public findLibrary(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->c:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    const/4 v0, 0x0

    .line 18
    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v1, "ColdClassLoader"

    .line 21
    .line 22
    const-string v2, "findLibrary"

    .line 23
    .line 24
    invoke-static {v1, v2, p1, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public findResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 5

    .line 1
    const-string v0, "ColdClassLoader"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/util/zip/ZipFile;

    .line 5
    .line 6
    sget-object v3, Lcom/taobao/sophix/b/b;->c:Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-direct {v2, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v3, "jar:"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    sget-object v3, Lcom/taobao/sophix/b/b;->c:Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/io/File;->toURI()Ljava/net/URI;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v3, "!/"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Ljava/net/URL;

    .line 57
    .line 58
    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :catch_0
    move-exception v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/a;->b:Ljava/lang/reflect/Method;

    .line 65
    .line 66
    iget-object v3, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 67
    .line 68
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/net/URL;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    return-object v2

    .line 81
    :goto_0
    const-string v3, "findResource"

    .line 82
    .line 83
    new-array v4, v1, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v0, v3, v2, v4}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "findResource don\'t find "

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-array v1, v1, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v0, p1, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    return-object p1
.end method

.method public findResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->findResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/taobao/sophix/b/a/a/a;->f:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Enumeration;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 31
    .line 32
    .line 33
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    return-object v1

    .line 37
    :catch_0
    move-exception v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v0

    .line 40
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "getResources appClassLoader name:"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v2, 0x0

    .line 58
    new-array v2, v2, [Ljava/lang/Object;

    .line 59
    .line 60
    const-string v3, "ColdClassLoader"

    .line 61
    .line 62
    invoke-static {v3, p1, v1, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public getLdLibraryPath()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "getLdLibraryPath"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    instance-of v1, v1, Ldalvik/system/BaseDexClassLoader;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    const-class v3, Ldalvik/system/BaseDexClassLoader;

    .line 12
    .line 13
    new-array v4, v1, [Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v3, v0, v4}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 20
    .line 21
    invoke-virtual {v3, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :catch_0
    move-exception v3

    .line 29
    const-string v4, "ColdClassLoader"

    .line 30
    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v4, v0, v3, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v2
.end method

.method public getPackage(Ljava/lang/String;)Ljava/lang/Package;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/a;->g:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/taobao/sophix/b/a/a/a;->h:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    const/4 v0, 0x0

    .line 18
    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v1, "ColdClassLoader"

    .line 21
    .line 22
    const-string v2, "getPackage"

    .line 23
    .line 24
    invoke-static {v1, v2, p1, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method
