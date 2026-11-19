.class public final Lcom/tendcloud/tenddata/dt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/tendcloud/tenddata/dt; = null

.field private static b:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:I = 0xa4cb80


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/dt;->b:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dt;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dt;->b()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dt;->d()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/tendcloud/tenddata/dt;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :cond_0
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/dt;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/dt;->a:Lcom/tendcloud/tenddata/dt;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tendcloud/tenddata/dt;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/dt;->a:Lcom/tendcloud/tenddata/dt;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tendcloud/tenddata/dt;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/dt;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/dt;->a:Lcom/tendcloud/tenddata/dt;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/dt;->a:Lcom/tendcloud/tenddata/dt;

    return-object v0
.end method

.method private a(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x1e

    .line 8
    :try_start_0
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1, v1}, Lcom/tendcloud/tenddata/cq;->a(Landroid/content/Context;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.QUERY_ALL_PACKAGES"

    invoke-static {p1, v1}, Lcom/tendcloud/tenddata/cq;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 10
    invoke-static {p1}, Lcom/tendcloud/tenddata/cd;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageInfo;

    .line 12
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 14
    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 15
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    .line 16
    invoke-static {v3}, Lcom/tendcloud/tenddata/cq;->b([B)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 18
    :catchall_0
    :try_start_2
    const-string v3, ""

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :goto_1
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x1

    if-lez v2, :cond_1

    .line 20
    const-string v2, "1"

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_1
    const-string v2, "0"

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    :cond_2
    :goto_2
    return-object v0
.end method

.method private b()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    invoke-static {v2}, Lcom/tendcloud/tenddata/cq;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-static {}, Lcom/tendcloud/tenddata/cl;->a()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_6

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/tendcloud/tenddata/by;

    .line 41
    .line 42
    iget-object v3, v2, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 43
    .line 44
    const-string v4, "android."

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    iget-object v3, v2, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 53
    .line 54
    const-string v4, "system"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v2, v2, Lcom/tendcloud/tenddata/by;->c:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->b(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 76
    .line 77
    const-string v2, "activity"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Landroid/app/ActivityManager;

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :catchall_0
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 114
    .line 115
    iget-object v3, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    .line 117
    :try_start_1
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-eqz v4, :cond_3

    .line 122
    .line 123
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/16 v1, 0x1e

    .line 128
    .line 129
    :try_start_2
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->b(I)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 136
    .line 137
    invoke-static {v1}, Lcom/tendcloud/tenddata/cd;->d(Landroid/content/Context;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-eqz v1, :cond_6

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_6

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Landroid/content/pm/PackageInfo;

    .line 158
    .line 159
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 160
    .line 161
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 162
    .line 163
    and-int/lit8 v4, v3, 0x1

    .line 164
    .line 165
    if-nez v4, :cond_5

    .line 166
    .line 167
    and-int/lit16 v4, v3, 0x80

    .line 168
    .line 169
    if-nez v4, :cond_5

    .line 170
    .line 171
    const/high16 v4, 0x200000

    .line 172
    .line 173
    and-int/2addr v3, v4

    .line 174
    if-nez v3, :cond_5

    .line 175
    .line 176
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 177
    .line 178
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    sget-object v1, Lcom/tendcloud/tenddata/dt;->b:Ljava/util/Map;

    .line 187
    .line 188
    const-string v2, "ras"

    .line 189
    .line 190
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    .line 195
    .line 196
    move-result-wide v0

    .line 197
    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/cb;->setCollectRunningTime(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 198
    .line 199
    .line 200
    :catchall_1
    return-void
.end method

.method private c()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->T:Z

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/cb;->g()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    sub-long/2addr v3, v1

    .line 16
    const-wide/32 v1, 0xa4cb80

    .line 17
    .line 18
    .line 19
    cmp-long v1, v3, v1

    .line 20
    .line 21
    if-lez v1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    :catchall_0
    :cond_1
    return v0
.end method

.method private d()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/dt;->a(Landroid/content/Context;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/dt;->b:Ljava/util/Map;

    .line 12
    .line 13
    const-string v2, "aas"

    .line 14
    .line 15
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 1
    const-string v0, "AppList"

    .line 2
    .line 3
    new-instance v1, Lcom/tendcloud/tenddata/el;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lcom/tendcloud/tenddata/cg;->getFileLock(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2, v0}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 24
    .line 25
    .line 26
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lcom/tendcloud/tenddata/cg;->releaseFileLock(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/du;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lcom/tendcloud/tenddata/cg;->releaseFileLock(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-lez v3, :cond_0

    .line 58
    .line 59
    new-instance v3, Landroid/util/Pair;

    .line 60
    .line 61
    invoke-direct {v3, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v3, v1, Lcom/tendcloud/tenddata/el;->e:Landroid/util/Pair;

    .line 65
    .line 66
    :cond_0
    const-string v0, "env"

    .line 67
    .line 68
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 69
    .line 70
    const-string v0, "apps"

    .line 71
    .line 72
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 73
    .line 74
    sget-object v0, Lcom/tendcloud/tenddata/dt;->b:Ljava/util/Map;

    .line 75
    .line 76
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 77
    .line 78
    sget-object v0, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 79
    .line 80
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 81
    .line 82
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void
.end method
