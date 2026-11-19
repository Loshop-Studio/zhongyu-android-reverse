.class public Lcom/umeng/analytics/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/j0;
.implements Lg2/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/a$b;
    }
.end annotation


# static fields
.field public static n:Landroid/content/Context;


# instance fields
.field public a:Lg2/l0;

.field public b:Lcom/umeng/analytics/pro/f;

.field public c:Lg2/h0;

.field public d:Lcom/umeng/analytics/pro/e;

.field public e:Lcom/umeng/analytics/pro/d;

.field public f:Z

.field public volatile g:Lorg/json/JSONObject;

.field public volatile h:Lorg/json/JSONObject;

.field public volatile i:Lorg/json/JSONObject;

.field public j:Z

.field public k:Lf2/b;

.field public l:Lf2/c;

.field public m:Lg2/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ls2/a;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lg2/l0;

    invoke-direct {v0}, Lg2/l0;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/a;->a:Lg2/l0;

    .line 4
    new-instance v0, Lcom/umeng/analytics/pro/f;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/f;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/a;->b:Lcom/umeng/analytics/pro/f;

    .line 5
    new-instance v0, Lg2/h0;

    invoke-direct {v0}, Lg2/h0;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/a;->c:Lg2/h0;

    .line 6
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    move-result-object v0

    iput-object v0, p0, Lcom/umeng/analytics/a;->d:Lcom/umeng/analytics/pro/e;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/umeng/analytics/a;->e:Lcom/umeng/analytics/pro/d;

    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/umeng/analytics/a;->f:Z

    .line 9
    iput-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 10
    iput-object v0, p0, Lcom/umeng/analytics/a;->h:Lorg/json/JSONObject;

    .line 11
    iput-object v0, p0, Lcom/umeng/analytics/a;->i:Lorg/json/JSONObject;

    .line 12
    iput-boolean v1, p0, Lcom/umeng/analytics/a;->j:Z

    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/a;->k:Lf2/b;

    .line 14
    iput-object v0, p0, Lcom/umeng/analytics/a;->l:Lf2/c;

    .line 15
    iput-object v0, p0, Lcom/umeng/analytics/a;->m:Lg2/i0;

    .line 16
    iget-object v0, p0, Lcom/umeng/analytics/a;->a:Lg2/l0;

    invoke-virtual {v0, p0}, Lg2/l0;->a(Lg2/p0;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/a;-><init>()V

    return-void
.end method

.method public static b()Lcom/umeng/analytics/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/umeng/analytics/a$b;->a()Lcom/umeng/analytics/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string p1, "onAppCrash can not be called in child process"

    .line 14
    .line 15
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_1
    sget-boolean v0, Le2/a;->i:Z

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/a;->b:Lcom/umeng/analytics/pro/f;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/f;->c()V

    .line 33
    .line 34
    .line 35
    :cond_3
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 36
    .line 37
    const-string v1, "onAppCrash"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/d;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/umeng/analytics/a;->c:Lg2/h0;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/f;->c()V

    .line 47
    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lcom/umeng/analytics/a;->e:Lcom/umeng/analytics/pro/d;

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/d;->n()V

    .line 54
    .line 55
    .line 56
    :cond_5
    iget-object v0, p0, Lcom/umeng/analytics/a;->d:Lcom/umeng/analytics/pro/e;

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    sget-object v1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0, v1, v2}, Lcom/umeng/analytics/pro/e;->q(Landroid/content/Context;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_6
    if-eqz p1, :cond_7

    .line 74
    .line 75
    new-instance v0, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "ts"

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    const-string v1, "error_source"

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v1, "context"

    .line 96
    .line 97
    invoke-static {p1}, Lv2/a;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v1, p0, Lcom/umeng/analytics/a;->d:Lcom/umeng/analytics/pro/e;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/e;->o()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, v1, v0, v2}, Lcom/umeng/analytics/pro/h;->k(Ljava/lang/String;Ljava/lang/String;I)Z

    .line 121
    .line 122
    .line 123
    :cond_7
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 124
    .line 125
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lg2/k0;->x()V

    .line 130
    .line 131
    .line 132
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {p1}, Lcom/umeng/analytics/pro/f;->b(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    sget-object p1, Lcom/umeng/analytics/pro/d;->m:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 138
    .line 139
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->a:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 140
    .line 141
    if-ne p1, v0, :cond_8

    .line 142
    .line 143
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 144
    .line 145
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->p(Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 149
    .line 150
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_0
    sget-boolean v0, Lv2/d;->a:Z

    .line 163
    .line 164
    if-eqz v0, :cond_9

    .line 165
    .line 166
    const-string v0, "Exception in onAppCrash"

    .line 167
    .line 168
    invoke-static {v0, p1}, Lv2/d;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_1
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/a;->k:Lf2/b;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Lf2/b;

    .line 20
    .line 21
    const-string v1, "ekv_bl"

    .line 22
    .line 23
    const-string v2, "ekv_bl_ver"

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lf2/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/umeng/analytics/a;->k:Lf2/b;

    .line 29
    .line 30
    sget-object v1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lf2/a;->j(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/a;->l:Lf2/c;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    new-instance v0, Lf2/c;

    .line 40
    .line 41
    const-string v1, "ekv_wl"

    .line 42
    .line 43
    const-string v2, "ekv_wl_ver"

    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Lf2/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/umeng/analytics/a;->l:Lf2/c;

    .line 49
    .line 50
    sget-object v1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lf2/a;->j(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 56
    .line 57
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    iget-boolean v0, p0, Lcom/umeng/analytics/a;->f:Z

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iput-boolean v1, p0, Lcom/umeng/analytics/a;->f:Z

    .line 70
    .line 71
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/a;->p(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 77
    :try_start_1
    iget-boolean v0, p0, Lcom/umeng/analytics/a;->j:Z

    .line 78
    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/d;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lcom/umeng/analytics/a;->e:Lcom/umeng/analytics/pro/d;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/d;->f()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    iput-boolean v1, p0, Lcom/umeng/analytics/a;->j:Z

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto :goto_1

    .line 98
    :cond_6
    :goto_0
    invoke-static {}, Lg2/i0;->a()Lg2/i0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, Lcom/umeng/analytics/a;->m:Lg2/i0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    :try_start_2
    invoke-static {p1}, Lg2/i0;->b(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lcom/umeng/analytics/a;->m:Lg2/i0;

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Lg2/i0;->c(Lg2/j0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 110
    .line 111
    .line 112
    :catchall_1
    :cond_7
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    :try_start_4
    invoke-static {}, Lk2/a;->e()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_8

    .line 118
    .line 119
    const-string p1, "\u7edf\u8ba1SDK\u5e38\u89c1\u95ee\u9898\u7d22\u5f15\u8d34 \u8be6\u89c1\u94fe\u63a5 http://developer.umeng.com/docs/66650/cate/66650"

    .line 120
    .line 121
    const-string v0, ""

    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    const/4 v2, 0x3

    .line 125
    invoke-static {p1, v2, v0, v1, v1}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Ln2/c;->j(Ln2/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 139
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 140
    :catchall_2
    :goto_2
    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 7

    .line 1
    const-wide/16 v4, -0x1

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    invoke-virtual/range {v0 .. v6}, Lcom/umeng/analytics/a;->e(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;JZ)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    const-string p1, "context is null in onEventNoCheck, please check!"

    .line 4
    .line 5
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    move-object p1, v0

    .line 11
    goto :goto_2

    .line 12
    :cond_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sput-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 21
    .line 22
    :cond_1
    iget-boolean p1, p0, Lcom/umeng/analytics/a;->f:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-boolean p1, p0, Lcom/umeng/analytics/a;->j:Z

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    :cond_2
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/a;->c(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/a;->k(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    const-string p1, "MobclickRT"

    .line 42
    .line 43
    new-instance p3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string p4, "--->>> filter ekv ["

    .line 49
    .line 50
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p2, "]."

    .line 57
    .line 58
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    const-string p1, ""

    .line 70
    .line 71
    iget-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    new-instance v0, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 81
    .line 82
    :goto_0
    move-object v5, p1

    .line 83
    goto :goto_1

    .line 84
    :cond_5
    iget-object p1, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 85
    .line 86
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    goto :goto_0

    .line 91
    :goto_1
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {p1}, Lg2/o0;->a(Landroid/content/Context;)Lg2/o0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v1, p2

    .line 98
    move-object v2, p3

    .line 99
    move-wide v3, p4

    .line 100
    move v6, p6

    .line 101
    invoke-virtual/range {v0 .. v6}, Lg2/o0;->c(Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_2
    sget-boolean p2, Lv2/d;->a:Z

    .line 106
    .line 107
    if-eqz p2, :cond_6

    .line 108
    .line 109
    invoke-static {p1}, Lv2/d;->g(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public f(Lcom/umeng/analytics/MobclickAgent$PageMode;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string p1, "setPageCollectionMode can not be called in child process"

    .line 13
    .line 14
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    sput-object p1, Lcom/umeng/analytics/pro/d;->m:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 19
    .line 20
    return-void
.end method

.method public declared-synchronized g(Ljava/lang/Object;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string p1, "registerSuperPropertyByCoreProtocol can not be called in child process"

    .line 15
    .line 16
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_1
    if-eqz p1, :cond_2

    .line 22
    .line 23
    :try_start_2
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    const-string p1, "sp_uapp"

    .line 44
    .line 45
    iget-object v1, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 46
    .line 47
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    :cond_2
    monitor-exit p0

    .line 59
    return-void
.end method

.method public h()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string p1, "updateNativePrePropertiesByCoreProtocol can not be called in child process"

    .line 15
    .line 16
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_1
    :try_start_2
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    const-string v1, "prepp_uapp"

    .line 44
    .line 45
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const-string p1, "prepp_uapp"

    .line 56
    .line 57
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    :catchall_0
    :cond_3
    :goto_0
    monitor-exit p0

    .line 65
    return-void
.end method

.method public j()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/a;->i:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/a;->k:Lf2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf2/a;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/umeng/analytics/a;->k:Lf2/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lf2/b;->m(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/a;->l:Lf2/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Lf2/a;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/umeng/analytics/a;->l:Lf2/c;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lf2/c;->m(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "--->>> white list match! id = "

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "MobclickRT"

    .line 54
    .line 55
    invoke-static {v0, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :cond_1
    return v1

    .line 60
    :cond_2
    return v2
.end method

.method public l(Landroid/content/Context;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 13
    .line 14
    :cond_1
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string p1, "onKillProcess can not be called in child process"

    .line 23
    .line 24
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/a;->e:Lcom/umeng/analytics/pro/d;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/d;->n()V

    .line 33
    .line 34
    .line 35
    :cond_3
    const-string v0, "onKillProcess"

    .line 36
    .line 37
    invoke-static {p1, v0}, Lcom/umeng/analytics/pro/d;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/umeng/analytics/a;->c:Lg2/h0;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/f;->c()V

    .line 45
    .line 46
    .line 47
    :cond_4
    iget-object p1, p0, Lcom/umeng/analytics/a;->b:Lcom/umeng/analytics/pro/f;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/f;->c()V

    .line 52
    .line 53
    .line 54
    :cond_5
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 55
    .line 56
    if-eqz p1, :cond_8

    .line 57
    .line 58
    iget-object v0, p0, Lcom/umeng/analytics/a;->d:Lcom/umeng/analytics/pro/e;

    .line 59
    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, p1, v1}, Lcom/umeng/analytics/pro/e;->q(Landroid/content/Context;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_6
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lg2/k0;->x()V

    .line 80
    .line 81
    .line 82
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/umeng/analytics/pro/f;->b(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    sget-object p1, Lcom/umeng/analytics/pro/d;->m:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 88
    .line 89
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->a:Lcom/umeng/analytics/MobclickAgent$PageMode;

    .line 90
    .line 91
    if-ne p1, v0, :cond_7

    .line 92
    .line 93
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->p(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    sget-object p1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 99
    .line 100
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    :catchall_0
    :cond_8
    :goto_0
    return-void
.end method

.method public m()V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "onStartSessionInternal can not be called in child process"

    .line 12
    .line 13
    invoke-static {v0}, Lv2/d;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Lk2/a;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lk2/a;->c()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "\u68c0\u6d4b\u5230\u8fdb\u5165\u9875\u9762\u751f\u547d\u5468\u671f\u65f6\u5c1a\u672a\u5b8c\u6210SDK\u521d\u59cb\u5316\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u672a\u5728Application.onCreate\u51fd\u6570\u4e2d\u6267\u884cSDK\u521d\u59cb\u5316\u51fd\u6570\u3002"

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-static {v0, v3, v1, v2, v2}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    sget-object v2, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {v2}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const/16 v5, 0x1100

    .line 53
    .line 54
    invoke-static {v2, v5, v3, v4}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 58
    .line 59
    invoke-static {v2}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/16 v1, 0x1007

    .line 68
    .line 69
    invoke-static {v2, v1, v3, v0}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :catchall_0
    :cond_2
    return-void
.end method

.method public n()V
    .locals 4

    .line 1
    const-string v0, "--->>> onIntoBackground triggered."

    .line 2
    .line 3
    const-string v1, "MobclickRT"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-boolean v0, Le2/a;->i:Z

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-static {}, Lcom/umeng/commonsdk/config/a;->f()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "header_ekv_send_on_exit"

    .line 20
    .line 21
    invoke-static {v0}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/16 v0, 0x2012

    .line 28
    .line 29
    invoke-static {v0}, Ln2/c;->f(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    const-string v2, "--->>> \u9000\u51fa\u65f6\u53d1\u9001\u7b56\u7565 \u88ab\u89e6\u53d1\uff01"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {v1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-static {v1, v0, v2, v3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string v0, "--->>> \u9000\u51fa\u53d1\u9001\u7b56\u7565: \u4e91\u63a7\u63a7\u5236\u5b57\u5173\u95ed\u3002\u529f\u80fd\u4e0d\u751f\u6548"

    .line 52
    .line 53
    invoke-static {v1, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "onEndSessionInternal can not be called in child process"

    .line 12
    .line 13
    invoke-static {v0}, Lv2/d;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/16 v3, 0x1008

    .line 32
    .line 33
    invoke-static {v0, v3, v1, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    const/16 v3, 0x1004

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/16 v3, 0x1003

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/16 v3, 0x1009

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :catchall_0
    :cond_1
    return-void
.end method

.method public final p(Landroid/content/Context;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    const-string p1, "unexpected null context in getNativeSuperProperties"

    .line 4
    .line 5
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 18
    .line 19
    :cond_1
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 33
    .line 34
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/a;->h:Lorg/json/JSONObject;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    new-instance v0, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/umeng/analytics/a;->h:Lorg/json/JSONObject;

    .line 44
    .line 45
    :cond_3
    const-string v0, "prepp_uapp"

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/umeng/analytics/a;->i:Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    :catch_0
    :cond_4
    :try_start_2
    iget-object p1, p0, Lcom/umeng/analytics/a;->i:Lorg/json/JSONObject;

    .line 66
    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    new-instance p1, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/umeng/analytics/a;->i:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    :catchall_0
    :cond_5
    return-void
.end method

.method public declared-synchronized q()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "unregisterSuperPropertyByCoreProtocol can not be called in child process"

    .line 15
    .line 16
    invoke-static {v0}, Lv2/d;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "sp_uapp"

    .line 36
    .line 37
    iget-object v2, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance v0, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/umeng/analytics/a;->g:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    :catchall_0
    :goto_0
    monitor-exit p0

    .line 58
    return-void
.end method

.method public declared-synchronized r()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {v0}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "clearSuperPropertiesByCoreProtocol can not be called in child process"

    .line 13
    .line 14
    invoke-static {v0}, Lv2/d;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    sget-object v0, Lcom/umeng/analytics/a;->n:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "sp_uapp"

    .line 30
    .line 31
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    :cond_1
    monitor-exit p0

    .line 38
    return-void
.end method
