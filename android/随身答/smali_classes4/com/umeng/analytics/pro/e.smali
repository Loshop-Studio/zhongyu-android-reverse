.class public Lcom/umeng/analytics/pro/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/e$b;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:Landroid/content/Context; = null

.field public static c:Z = false

.field public static d:J = 0x0L

.field public static e:Z = true

.field public static f:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/umeng/analytics/pro/g;->f(Lcom/umeng/analytics/pro/g$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/e;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v2, "fg_count"

    .line 8
    .line 9
    invoke-interface {p0, v2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    return-wide v0
.end method

.method public static d()Lcom/umeng/analytics/pro/e;
    .locals 1

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/e$b;->a()Lcom/umeng/analytics/pro/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static k(Landroid/content/Context;)V
    .locals 5

    .line 1
    sget-object p0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    const-string v2, "fg_count"

    .line 12
    .line 13
    invoke-interface {p0, v2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const-wide/16 v3, 0x1

    .line 24
    .line 25
    add-long/2addr v0, v3

    .line 26
    invoke-interface {p0, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;JJJ)V
    .locals 9

    .line 1
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move-wide v5, p5

    .line 7
    move-wide/from16 v7, p7

    .line 8
    .line 9
    invoke-virtual/range {v0 .. v8}, Lcom/umeng/analytics/pro/e;->h(Landroid/content/Context;Ljava/lang/String;JJJ)V

    .line 10
    .line 11
    .line 12
    const-string p1, "MobclickRT"

    .line 13
    .line 14
    const-string p2, "saveSessionToDB: complete"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-boolean p1, Lu2/a;->a:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/umeng/analytics/process/b;->i(Landroid/content/Context;)Lcom/umeng/analytics/process/b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide p3

    .line 33
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const p4, 0x9051

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p4, p2, p3}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;JJJ)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/umeng/analytics/pro/e;->i(Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public e(Landroid/content/Context;JZ)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/g;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "--->>> onInstantSessionInternal: current session id = "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "MobclickRT"

    .line 27
    .line 28
    invoke-static {v2, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return-object p1

    .line 39
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "__e"

    .line 45
    .line 46
    invoke-virtual {v1, v2, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, Lcom/umeng/analytics/a;->h()Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-lez p3, :cond_1

    .line 64
    .line 65
    const-string p3, "__sp"

    .line 66
    .line 67
    invoke-virtual {v1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2}, Lcom/umeng/analytics/a;->j()Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-lez p3, :cond_2

    .line 85
    .line 86
    const-string p3, "__pp"

    .line 87
    .line 88
    invoke-virtual {v1, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    sget-object p3, Lcom/umeng/analytics/pro/h$a;->f:Lcom/umeng/analytics/pro/h$a;

    .line 96
    .line 97
    invoke-virtual {p2, v0, v1, p3}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v1, p4}, Lg2/k0;->g(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    :catchall_0
    return-object v0
.end method

.method public f(Landroid/content/Context;J)V
    .locals 1

    .line 1
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v0, "session_start_time"

    .line 16
    .line 17
    invoke-interface {p1, v0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public g(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 12

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "versionname"

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sput-object v2, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 16
    .line 17
    :cond_0
    check-cast p2, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    sget-object p2, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p2}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_1
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_2
    invoke-interface {p2, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    sget-object v6, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 46
    .line 47
    invoke-static {v6}, Lz2/d;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    const-string v8, "MobclickRT"

    .line 56
    .line 57
    const-string v9, "versioncode"

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    if-eqz v7, :cond_3

    .line 61
    .line 62
    :try_start_1
    invoke-static {p1}, Lz2/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-interface {v4, v9, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    invoke-interface {v4, v1, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_5

    .line 85
    .line 86
    new-instance v7, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v11, "--->>> onStartSessionInternal: upgrade version: "

    .line 92
    .line 93
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v11, "-> "

    .line 100
    .line 101
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-static {v8, v7}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p2, v9, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    const-string v8, "pre_date"

    .line 119
    .line 120
    invoke-interface {p2, v8, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    const-string v11, "pre_version"

    .line 125
    .line 126
    invoke-interface {p2, v11, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-interface {p2, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-static {p1}, Lz2/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-interface {v4, v9, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 143
    .line 144
    .line 145
    invoke-interface {v4, v1, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    const-string p1, "vers_date"

    .line 149
    .line 150
    invoke-interface {v4, p1, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    const-string p1, "vers_pre_version"

    .line 154
    .line 155
    invoke-interface {v4, p1, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    const-string p1, "cur_version"

    .line 159
    .line 160
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 161
    .line 162
    .line 163
    const-string p1, "vers_code"

    .line 164
    .line 165
    invoke-interface {v4, p1, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 166
    .line 167
    .line 168
    const-string p1, "vers_name"

    .line 169
    .line 170
    invoke-interface {v4, p1, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 171
    .line 172
    .line 173
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 174
    .line 175
    .line 176
    sget-boolean p1, Lcom/umeng/analytics/pro/e;->e:Z

    .line 177
    .line 178
    if-eqz p1, :cond_4

    .line 179
    .line 180
    sput-boolean v10, Lcom/umeng/analytics/pro/e;->e:Z

    .line 181
    .line 182
    :cond_4
    sget-boolean p1, Lcom/umeng/analytics/pro/e;->c:Z

    .line 183
    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    sput-boolean v10, Lcom/umeng/analytics/pro/e;->c:Z

    .line 187
    .line 188
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 189
    .line 190
    const/4 p2, 0x1

    .line 191
    invoke-virtual {p0, p1, v2, v3, p2}, Lcom/umeng/analytics/pro/e;->n(Landroid/content/Context;JZ)Z

    .line 192
    .line 193
    .line 194
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 195
    .line 196
    invoke-virtual {p0, p1, v2, v3}, Lcom/umeng/analytics/pro/e;->l(Landroid/content/Context;J)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_5
    :goto_0
    sget-boolean v0, Lcom/umeng/analytics/pro/e;->c:Z

    .line 201
    .line 202
    if-eqz v0, :cond_7

    .line 203
    .line 204
    sput-boolean v10, Lcom/umeng/analytics/pro/e;->c:Z

    .line 205
    .line 206
    sget-boolean p2, Lcom/umeng/analytics/pro/e;->e:Z

    .line 207
    .line 208
    if-eqz p2, :cond_6

    .line 209
    .line 210
    sput-boolean v10, Lcom/umeng/analytics/pro/e;->e:Z

    .line 211
    .line 212
    :cond_6
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/e;->s(Landroid/content/Context;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    sput-object p1, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 217
    .line 218
    new-instance p1, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string p2, "\u521b\u5efa\u65b0\u4f1a\u8bdd: "

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    sget-object p2, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-static {p1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    new-instance p1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string p2, "mSessionChanged flag has been set, Start new session: "

    .line 246
    .line 247
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    sget-object p2, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {v8, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_7
    const-string v0, "session_id"

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    sput-object p2, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 271
    .line 272
    const-string p2, "a_start_time"

    .line 273
    .line 274
    invoke-interface {v4, p2, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    const-string p2, "a_end_time"

    .line 278
    .line 279
    const-wide/16 v0, 0x0

    .line 280
    .line 281
    invoke-interface {v4, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 282
    .line 283
    .line 284
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 285
    .line 286
    .line 287
    new-instance p2, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v0, "\u5ef6\u7eed\u4e0a\u4e00\u4e2a\u4f1a\u8bdd: "

    .line 293
    .line 294
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-static {p2}, Lv2/d;->a(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    new-instance p2, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v0, "Extend current session: "

    .line 315
    .line 316
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    invoke-static {v8, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    sget-boolean p2, Lcom/umeng/analytics/pro/e;->e:Z

    .line 332
    .line 333
    if-eqz p2, :cond_8

    .line 334
    .line 335
    sput-boolean v10, Lcom/umeng/analytics/pro/e;->e:Z

    .line 336
    .line 337
    const-string p2, "header_foreground_count"

    .line 338
    .line 339
    invoke-static {p2}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result p2

    .line 343
    if-eqz p2, :cond_8

    .line 344
    .line 345
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 346
    .line 347
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const/4 v3, 0x0

    .line 352
    const-wide/16 v4, 0x0

    .line 353
    .line 354
    const/16 v1, 0x2015

    .line 355
    .line 356
    invoke-static/range {v0 .. v5}, Ln2/c;->n(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 357
    .line 358
    .line 359
    :cond_8
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/e;->t(Landroid/content/Context;)V

    .line 360
    .line 361
    .line 362
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 363
    .line 364
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-virtual {p1, v10}, Lg2/k0;->i(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    .line 370
    .line 371
    :catchall_0
    :cond_9
    :goto_1
    return-void
.end method

.method public final h(Landroid/content/Context;Ljava/lang/String;JJJ)V
    .locals 6

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/g;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_5

    .line 26
    .line 27
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "__f"

    .line 42
    .line 43
    invoke-virtual {v0, v1, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    const-string p5, "__g"

    .line 47
    .line 48
    invoke-virtual {v0, p5, p7, p8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 52
    .line 53
    .line 54
    move-result-object p5

    .line 55
    invoke-virtual {p5}, Lcom/umeng/analytics/a;->h()Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    if-eqz p5, :cond_2

    .line 60
    .line 61
    invoke-virtual {p5}, Lorg/json/JSONObject;->length()I

    .line 62
    .line 63
    .line 64
    move-result p6

    .line 65
    if-lez p6, :cond_2

    .line 66
    .line 67
    const-string p6, "__sp"

    .line 68
    .line 69
    invoke-virtual {v0, p6, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 73
    .line 74
    .line 75
    move-result-object p5

    .line 76
    invoke-virtual {p5}, Lcom/umeng/analytics/a;->j()Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    if-eqz p5, :cond_3

    .line 81
    .line 82
    invoke-virtual {p5}, Lorg/json/JSONObject;->length()I

    .line 83
    .line 84
    .line 85
    move-result p6

    .line 86
    if-lez p6, :cond_3

    .line 87
    .line 88
    const-string p6, "__pp"

    .line 89
    .line 90
    invoke-virtual {v0, p6, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 94
    .line 95
    .line 96
    move-result-object p5

    .line 97
    sget-object p6, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 98
    .line 99
    sget-object v1, Lcom/umeng/analytics/pro/h$a;->d:Lcom/umeng/analytics/pro/h$a;

    .line 100
    .line 101
    invoke-virtual {p5, p6, v0, v1}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    :catch_0
    :try_start_1
    new-instance p5, Lorg/json/JSONObject;

    .line 105
    .line 106
    invoke-direct {p5}, Lorg/json/JSONObject;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string p6, "__e"

    .line 110
    .line 111
    invoke-virtual {p5, p6, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    sget-object p4, Lcom/umeng/analytics/pro/h$a;->c:Lcom/umeng/analytics/pro/h$a;

    .line 119
    .line 120
    invoke-virtual {p3, p2, p5, p4}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z

    .line 121
    .line 122
    .line 123
    const-string p3, "header_foreground_count"

    .line 124
    .line 125
    invoke-static {p3}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    if-eqz p3, :cond_4

    .line 130
    .line 131
    sput-wide p7, Lcom/umeng/analytics/pro/e;->f:J

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/e;->r(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 137
    .line 138
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/4 v3, 0x0

    .line 143
    const-wide/16 v4, 0x0

    .line 144
    .line 145
    const/16 v1, 0x2015

    .line 146
    .line 147
    invoke-static/range {v0 .. v5}, Ln2/c;->n(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 148
    .line 149
    .line 150
    :catch_1
    :cond_4
    sput-object p2, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 151
    .line 152
    :cond_5
    :goto_0
    return-void
.end method

.method public final i(Ljava/lang/String;J)V
    .locals 8

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    const-string v1, "session_end_time"

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v5, "__ii"

    .line 25
    .line 26
    invoke-virtual {v4, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string v5, "__e"

    .line 30
    .line 31
    invoke-virtual {v4, v5, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string p2, "__f"

    .line 35
    .line 36
    invoke-virtual {v4, p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Le2/a;->b()[D

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    new-instance p3, Lorg/json/JSONObject;

    .line 46
    .line 47
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v0, "lat"

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    aget-wide v5, p2, v1

    .line 54
    .line 55
    invoke-virtual {p3, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    const-string v0, "lng"

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    aget-wide v5, p2, v1

    .line 62
    .line 63
    invoke-virtual {p3, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    const-string p2, "ts"

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-virtual {p3, p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    const-string p2, "__d"

    .line 76
    .line 77
    invoke-virtual {v4, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    :cond_1
    const-string p2, "android.net.TrafficStats"

    .line 81
    .line 82
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    const-string p3, "getUidRxBytes"

    .line 87
    .line 88
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p2, p3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    const-string v1, "getUidTxBytes"

    .line 99
    .line 100
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 115
    .line 116
    const/4 v1, -0x1

    .line 117
    if-ne v0, v1, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const/4 v5, 0x0

    .line 129
    invoke-virtual {p3, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    check-cast p3, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v6

    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-virtual {p2, v5, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    check-cast p2, Ljava/lang/Long;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide p2

    .line 157
    cmp-long v0, v6, v2

    .line 158
    .line 159
    if-lez v0, :cond_4

    .line 160
    .line 161
    cmp-long v0, p2, v2

    .line 162
    .line 163
    if-gtz v0, :cond_3

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_3
    new-instance v0, Lorg/json/JSONObject;

    .line 167
    .line 168
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v1, "download_traffic"

    .line 172
    .line 173
    invoke-virtual {v0, v1, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v1, "upload_traffic"

    .line 177
    .line 178
    invoke-virtual {v0, v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    const-string p2, "__c"

    .line 182
    .line 183
    invoke-virtual {v4, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    :cond_4
    :goto_0
    sget-object p2, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 187
    .line 188
    invoke-static {p2}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    sget-object p3, Lcom/umeng/analytics/pro/h$a;->e:Lcom/umeng/analytics/pro/h$a;

    .line 193
    .line 194
    invoke-virtual {p2, p1, v4, p3}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z

    .line 195
    .line 196
    .line 197
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 198
    .line 199
    invoke-static {p1}, Lcom/umeng/analytics/pro/f;->b(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 203
    .line 204
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->p(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    .line 206
    .line 207
    :catchall_0
    :goto_1
    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(Landroid/content/Context;J)V
    .locals 0

    .line 1
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p1, p2}, Lg2/k0;->u(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :goto_0
    return-void
.end method

.method public m(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v0, "MobclickRT"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sput-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    check-cast p2, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    :goto_0
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_2
    const-string v2, "a_end_time"

    .line 37
    .line 38
    const-wide/16 v3, 0x0

    .line 39
    .line 40
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    sput-wide v2, Lcom/umeng/analytics/pro/e;->d:J

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "------>>> lastActivityEndTime: "

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-wide v3, Lcom/umeng/analytics/pro/e;->d:J

    .line 57
    .line 58
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v0, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "versionname"

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 77
    .line 78
    invoke-static {v3}, Lz2/d;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    const-string v5, "session_start_time"

    .line 94
    .line 95
    const/4 v6, 0x1

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    const-string v2, "--->>> requestNewInstantSessionIf: version upgrade"

    .line 105
    .line 106
    invoke-static {v0, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v1, v5, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 110
    .line 111
    .line 112
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 113
    .line 114
    .line 115
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {v1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-virtual {v1, v2, v6}, Lg2/k0;->g(Ljava/lang/Object;Z)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sget-object v2, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lcom/umeng/analytics/pro/g;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v2, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v3, "--->>> force generate new session: session id = "

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v0, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    sput-boolean v6, Lcom/umeng/analytics/pro/e;->c:Z

    .line 156
    .line 157
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 158
    .line 159
    invoke-virtual {p0, v0, p1, p2, v6}, Lcom/umeng/analytics/pro/e;->e(Landroid/content/Context;JZ)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_4
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Lcom/umeng/analytics/pro/g;->j(Landroid/content/Context;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v3, 0x0

    .line 174
    if-eqz v2, :cond_5

    .line 175
    .line 176
    const-string v2, "--->>> More then 30 sec from last session."

    .line 177
    .line 178
    invoke-static {v0, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    sput-boolean v6, Lcom/umeng/analytics/pro/e;->c:Z

    .line 182
    .line 183
    invoke-interface {v1, v5, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 184
    .line 185
    .line 186
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 187
    .line 188
    .line 189
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 190
    .line 191
    invoke-virtual {p0, v0, p1, p2, v3}, Lcom/umeng/analytics/pro/e;->e(Landroid/content/Context;JZ)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_5
    const-string p1, "--->>> less then 30 sec from last session, do nothing."

    .line 196
    .line 197
    invoke-static {v0, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sput-boolean v3, Lcom/umeng/analytics/pro/e;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    .line 202
    :catchall_0
    :goto_1
    return-void
.end method

.method public n(Landroid/content/Context;JZ)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lcom/umeng/analytics/pro/g;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    :goto_0
    return v0

    .line 22
    :cond_1
    const-string v3, "a_start_time"

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    const-string v3, "a_end_time"

    .line 31
    .line 32
    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    cmp-long v1, v6, v4

    .line 37
    .line 38
    if-lez v1, :cond_8

    .line 39
    .line 40
    cmp-long v1, v8, v4

    .line 41
    .line 42
    if-nez v1, :cond_8

    .line 43
    .line 44
    const-string v0, "MobclickRT"

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    if-eqz p4, :cond_3

    .line 48
    .line 49
    :try_start_1
    sget-wide v6, Lcom/umeng/analytics/pro/e;->d:J

    .line 50
    .line 51
    cmp-long v3, v6, v4

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v6, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = "

    .line 61
    .line 62
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v0, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move-wide v6, p2

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v8, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = "

    .line 83
    .line 84
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    sget-wide v8, Lcom/umeng/analytics/pro/e;->d:J

    .line 88
    .line 89
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v0, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 100
    .line 101
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {p0, v3, v8}, Lcom/umeng/analytics/pro/e;->q(Landroid/content/Context;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    sget-object v3, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 110
    .line 111
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {p0, v3, v6}, Lcom/umeng/analytics/pro/e;->q(Landroid/content/Context;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-wide v6, p2

    .line 119
    :goto_2
    new-instance v3, Lorg/json/JSONObject;

    .line 120
    .line 121
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    .line 124
    const-string v8, "__f"

    .line 125
    .line 126
    if-eqz p4, :cond_4

    .line 127
    .line 128
    :try_start_2
    invoke-virtual {v3, v8, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-virtual {v3, v8, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p2}, Lcom/umeng/analytics/a;->h()Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    if-eqz p2, :cond_5

    .line 144
    .line 145
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 146
    .line 147
    .line 148
    move-result p3

    .line 149
    if-lez p3, :cond_5

    .line 150
    .line 151
    const-string p3, "__sp"

    .line 152
    .line 153
    invoke-virtual {v3, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p2}, Lcom/umeng/analytics/a;->j()Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    if-eqz p2, :cond_6

    .line 165
    .line 166
    invoke-virtual {p2}, Lorg/json/JSONObject;->length()I

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-lez p3, :cond_6

    .line 171
    .line 172
    const-string p3, "__pp"

    .line 173
    .line 174
    invoke-virtual {v3, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    :cond_6
    const-string p2, "header_foreground_count"

    .line 178
    .line 179
    invoke-static {p2}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    const-string p3, "__g"

    .line 184
    .line 185
    if-eqz p2, :cond_7

    .line 186
    .line 187
    :try_start_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string p4, "--->>>*** foregroundCount = "

    .line 193
    .line 194
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    sget-wide v6, Lcom/umeng/analytics/pro/e;->f:J

    .line 198
    .line 199
    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-static {v0, p2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sget-wide v6, Lcom/umeng/analytics/pro/e;->f:J

    .line 210
    .line 211
    invoke-virtual {v3, p3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    sput-wide v4, Lcom/umeng/analytics/pro/e;->f:J

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_7
    invoke-virtual {v3, p3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    :goto_4
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    sget-object p2, Lcom/umeng/analytics/pro/h$a;->d:Lcom/umeng/analytics/pro/h$a;

    .line 225
    .line 226
    invoke-virtual {p1, v2, v3, p2}, Lcom/umeng/analytics/pro/h;->l(Ljava/lang/String;Lorg/json/JSONObject;Lcom/umeng/analytics/pro/h$a;)Z

    .line 227
    .line 228
    .line 229
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 230
    .line 231
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Lg2/k0;->B()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    .line 237
    .line 238
    :catchall_0
    move v0, v1

    .line 239
    :catchall_1
    :cond_8
    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/e;->p(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public p(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "session_id"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object p1

    .line 17
    :catchall_0
    :cond_0
    sget-object p1, Lcom/umeng/analytics/pro/e;->a:Ljava/lang/String;

    .line 18
    .line 19
    return-object p1
.end method

.method public q(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    check-cast p2, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p2, "a_start_time"

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-interface {p1, p2, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long p2, v4, v2

    .line 35
    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    const-string p1, "onPause called before onResume"

    .line 39
    .line 40
    invoke-static {p1}, Lv2/d;->c(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "MobclickRT"

    .line 49
    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v3, "--->>> onEndSessionInternal: write activity end time = "

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {p2, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string p2, "a_end_time"

    .line 71
    .line 72
    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 73
    .line 74
    .line 75
    const-string p2, "session_end_time"

    .line 76
    .line 77
    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :catchall_0
    :goto_0
    return-void
.end method

.method public final r(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "fg_count"

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    return-void
.end method

.method public final s(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/e;->t(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lcom/umeng/analytics/pro/e;->b:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v1}, Lg2/k0;->y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :catchall_0
    return-object v0
.end method

.method public final t(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lg2/k0;->x()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
