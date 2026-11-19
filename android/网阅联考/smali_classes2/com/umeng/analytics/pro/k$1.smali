.class Lcom/umeng/analytics/pro/k$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/analytics/pro/k;


# direct methods
.method public constructor <init>(Lcom/umeng/analytics/pro/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "header_first_resume"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "MobclickRT"

    .line 10
    .line 11
    const-string v1, "--->>> onActivityPaused: FirstResumeTrigger enabled."

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/umeng/analytics/pro/k;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    invoke-static {}, Lcom/umeng/analytics/pro/k;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :cond_0
    monitor-exit v0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p1

    .line 34
    :cond_1
    const-string v0, "MobclickRT"

    .line 35
    .line 36
    const-string v1, "--->>> onActivityPaused: FirstResumeTrigger disabled."

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object v0, Lcom/umeng/analytics/pro/k;->b:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 42
    .line 43
    sget-object v1, Lcom/umeng/analytics/MobclickAgent$PageMode;->AUTO:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 44
    .line 45
    if-eq v0, v1, :cond_2

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 49
    .line 50
    invoke-static {v0, p1}, Lcom/umeng/analytics/pro/k;->b(Lcom/umeng/analytics/pro/k;Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/umeng/analytics/b;->i()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-boolean v0, p1, Lcom/umeng/analytics/pro/k;->c:Z

    .line 64
    .line 65
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "header_first_resume"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "MobclickRT"

    .line 10
    .line 11
    const-string v1, "--->>> onActivityResumed: FirstResumeTrigger enabled."

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/umeng/analytics/pro/k;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    invoke-static {}, Lcom/umeng/analytics/pro/k;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v1}, Lcom/umeng/analytics/pro/k;->a(Z)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lcom/umeng/analytics/pro/k;->a(Lcom/umeng/analytics/pro/k;Landroid/app/Activity;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1

    .line 41
    :cond_1
    const-string v0, "MobclickRT"

    .line 42
    .line 43
    const-string v1, "--->>> onActivityResumed: FirstResumeTrigger disabled."

    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 49
    .line 50
    invoke-static {v0, p1}, Lcom/umeng/analytics/pro/k;->a(Lcom/umeng/analytics/pro/k;Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/umeng/analytics/pro/k;->c(Lcom/umeng/analytics/pro/k;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gtz v0, :cond_4

    .line 10
    .line 11
    sget-object v0, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 24
    .line 25
    :cond_0
    sget v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/app/Activity;->isTaskRoot()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 35
    .line 36
    :cond_1
    sget v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 37
    .line 38
    const-string v1, "activityName"

    .line 39
    .line 40
    const-string v2, "isMainProcess"

    .line 41
    .line 42
    const-string v3, "pid"

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "$$_onUMengEnterForegroundInitError"

    .line 91
    .line 92
    invoke-virtual {v1, p1, v2, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    const/4 p1, -0x2

    .line 96
    sput p1, Lcom/umeng/analytics/pro/k;->f:I

    .line 97
    .line 98
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    const-string p1, "\u8bf7\u5728Application.onCreate\u51fd\u6570\u4e2d\u4f7f\u7528UMConfigure.preInit\u51fd\u6570\u521d\u59cb\u5316\u53cb\u76dfsdk"

    .line 105
    .line 106
    filled-new-array {p1}, [Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/4 v0, 0x2

    .line 111
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    sget v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    if-eq v0, v4, :cond_3

    .line 119
    .line 120
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v4, "pairUUID"

    .line 132
    .line 133
    sget-object v5, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 134
    .line 135
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v2, "$$_onUMengEnterForeground"

    .line 172
    .line 173
    invoke-virtual {v1, p1, v2, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 174
    .line 175
    .line 176
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 177
    .line 178
    invoke-static {p1}, Lcom/umeng/analytics/pro/k;->d(Lcom/umeng/analytics/pro/k;)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-gez p1, :cond_5

    .line 183
    .line 184
    iget-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 185
    .line 186
    invoke-static {p1}, Lcom/umeng/analytics/pro/k;->e(Lcom/umeng/analytics/pro/k;)I

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    iget-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 191
    .line 192
    invoke-static {p1}, Lcom/umeng/analytics/pro/k;->f(Lcom/umeng/analytics/pro/k;)I

    .line 193
    .line 194
    .line 195
    :cond_6
    :goto_1
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/k;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->AUTO:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/umeng/analytics/pro/k;->a(Lcom/umeng/analytics/pro/k;)I

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/umeng/analytics/pro/k;->b(Lcom/umeng/analytics/pro/k;)I

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/umeng/analytics/pro/k$1;->a:Lcom/umeng/analytics/pro/k;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/umeng/analytics/pro/k;->c(Lcom/umeng/analytics/pro/k;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-gtz v0, :cond_3

    .line 31
    .line 32
    sget v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget v0, Lcom/umeng/analytics/pro/k;->f:I

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    if-eq v0, v1, :cond_2

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "pairUUID"

    .line 62
    .line 63
    sget-object v2, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-string v1, "reason"

    .line 69
    .line 70
    const-string v2, "Normal"

    .line 71
    .line 72
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v2, "pid"

    .line 84
    .line 85
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "isMainProcess"

    .line 97
    .line 98
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const-string v1, "activityName"

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v2, "$$_onUMengEnterBackground"

    .line 115
    .line 116
    invoke-virtual {v1, p1, v2, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 120
    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    const/4 p1, 0x0

    .line 124
    sput-object p1, Lcom/umeng/analytics/pro/k;->e:Ljava/lang/String;

    .line 125
    .line 126
    :cond_3
    :goto_0
    return-void
.end method
