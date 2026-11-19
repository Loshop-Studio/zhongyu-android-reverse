.class public abstract Lt5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Landroid/content/Context;Lt5/m;[I)Landroid/app/Notification;
    .locals 3

    .line 1
    new-instance v0, Landroid/app/Notification$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lt5/i;->a(Lt5/m;)Lcom/huawei/hms/push/k;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/huawei/hms/push/k;->d:Lcom/huawei/hms/push/k;

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lt5/m;->m()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1, p1}, Lt5/i;->b(Landroid/app/Notification$Builder;Ljava/lang/String;Lt5/m;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p0, v0, p1}, Lt5/g;->c(Landroid/content/Context;Landroid/app/Notification$Builder;Lt5/m;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lt5/l;->l(Lt5/m;Landroid/app/Notification$Builder;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lt5/l;->o(Lt5/m;Landroid/app/Notification$Builder;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, v0}, Lt5/l;->f(Landroid/content/Context;Lt5/m;Landroid/app/Notification$Builder;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lt5/l;->c(Landroid/app/Notification$Builder;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lt5/l;->g(Lt5/m;Landroid/app/Notification$Builder;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Lt5/l;->n(Lt5/m;Landroid/app/Notification$Builder;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p1, p2}, Lt5/l;->m(Landroid/content/Context;Lt5/m;[I)Landroid/app/PendingIntent;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 47
    .line 48
    .line 49
    invoke-static {p0, p1, p2}, Lt5/l;->j(Landroid/content/Context;Lt5/m;[I)Landroid/app/PendingIntent;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {v0, p2}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 54
    .line 55
    .line 56
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v1, 0x1a

    .line 59
    .line 60
    if-lt p2, v1, :cond_1

    .line 61
    .line 62
    const-string p2, "HwPushChannelID"

    .line 63
    .line 64
    invoke-static {v0, p2}, Lcom/alibaba/sdk/android/push/notification/f;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {p0, v0, p1}, Lt5/l;->k(Landroid/content/Context;Landroid/app/Notification$Builder;Lt5/m;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v0, p1}, Lt5/l;->d(Landroid/content/Context;Landroid/app/Notification$Builder;Lt5/m;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public static b(Landroid/content/Context;Lt5/m;[ILjava/lang/String;I)Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "com.huawei.intent.action.PUSH_DELAY_NOTIFY"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lt5/m;->A()[B

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "selfshow_info"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1}, Lt5/m;->K()[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v2, "selfshow_token"

    .line 23
    .line 24
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "selfshow_event_id"

    .line 29
    .line 30
    invoke-virtual {p1, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p3, 0x0

    .line 35
    aget p3, p2, p3

    .line 36
    .line 37
    const-string v1, "selfshow_notify_id"

    .line 38
    .line 39
    invoke-virtual {p1, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 p3, 0x3

    .line 44
    aget p2, p2, p3

    .line 45
    .line 46
    const-string p3, "selfshow_auto_clear_id"

    .line 47
    .line 48
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0, p4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

.method public static c(Landroid/app/Notification$Builder;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/app/Notification$Builder;Lt5/m;)V
    .locals 3

    .line 1
    sget v0, Lcom/huawei/hms/android/HwBuildEx$VERSION;->EMUI_SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lt5/e;->d(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lt5/m;->u()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "the package name of notification is:"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "PushSelfShowLog"

    .line 40
    .line 41
    invoke-static {v2, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    invoke-static {p0, p2}, Lt5/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "the app name is:"

    .line 60
    .line 61
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-static {v2, p2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p0, :cond_0

    .line 75
    .line 76
    const-string p2, "android.extraAppName"

    .line 77
    .line 78
    invoke-virtual {v0, p2, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;Lt5/m;)V
    .locals 8

    .line 1
    const-class v0, Lt5/l;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_9

    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lt5/l;->i(Lt5/m;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "showNotification, the msg id = "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lt5/m;->B()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "PushSelfShowLog"

    .line 36
    .line 37
    invoke-static {v2, v1}, Lcom/huawei/hms/support/log/HMSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget v1, Lt5/l;->a:I

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sput v1, Lt5/l;->a:I

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lt5/m;->w()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    invoke-virtual {p1}, Lt5/m;->C()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p1, v1}, Lt5/m;->d(I)V

    .line 102
    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v3, "notification msgTag = "

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "PushSelfShowLog"

    .line 122
    .line 123
    invoke-static {v2, v1}, Lcom/huawei/hms/support/log/HMSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    invoke-virtual {p1}, Lt5/m;->E()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const/4 v2, -0x1

    .line 131
    if-eq v1, v2, :cond_3

    .line 132
    .line 133
    invoke-virtual {p1}, Lt5/m;->E()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lt5/m;->u()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v3

    .line 153
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    add-int/lit8 v3, v2, 0x1

    .line 165
    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Lt5/m;->E()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lt5/m;->u()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    goto :goto_1

    .line 201
    :cond_3
    sget v1, Lt5/l;->a:I

    .line 202
    .line 203
    add-int/lit8 v2, v1, 0x1

    .line 204
    .line 205
    add-int/lit8 v3, v1, 0x2

    .line 206
    .line 207
    add-int/lit8 v4, v1, 0x3

    .line 208
    .line 209
    add-int/lit8 v1, v1, 0x4

    .line 210
    .line 211
    sput v1, Lt5/l;->a:I

    .line 212
    .line 213
    move v7, v4

    .line 214
    move v4, v1

    .line 215
    move v1, v2

    .line 216
    move v2, v3

    .line 217
    move v3, v7

    .line 218
    goto :goto_1

    .line 219
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lt5/m;->w()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Lt5/m;->u()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    sget v2, Lt5/l;->a:I

    .line 247
    .line 248
    add-int/lit8 v3, v2, 0x1

    .line 249
    .line 250
    add-int/lit8 v2, v2, 0x2

    .line 251
    .line 252
    sput v2, Lt5/l;->a:I

    .line 253
    .line 254
    new-instance v4, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lt5/m;->w()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lt5/m;->u()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    move v7, v3

    .line 289
    move v3, v2

    .line 290
    move v2, v7

    .line 291
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v6, "notifyId:"

    .line 297
    .line 298
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v6, ",openNotifyId:"

    .line 305
    .line 306
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v6, ",delNotifyId:"

    .line 313
    .line 314
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v6, ",alarmNotifyId:"

    .line 321
    .line 322
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    const-string v6, "PushSelfShowLog"

    .line 333
    .line 334
    invoke-static {v6, v5}, Lcom/huawei/hms/support/log/HMSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p1}, Lt5/m;->k()I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-lez v5, :cond_5

    .line 342
    .line 343
    goto :goto_2

    .line 344
    :cond_5
    const/4 v4, 0x0

    .line 345
    :goto_2
    filled-new-array {v1, v2, v3, v4}, [I

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {}, Lt5/e;->i()Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-eqz v3, :cond_6

    .line 354
    .line 355
    invoke-static {p0, p1, v2}, Lt5/l;->a(Landroid/content/Context;Lt5/m;[I)Landroid/app/Notification;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    goto :goto_3

    .line 360
    :cond_6
    const/4 v2, 0x0

    .line 361
    :goto_3
    const-string v3, "notification"

    .line 362
    .line 363
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Landroid/app/NotificationManager;

    .line 368
    .line 369
    if-eqz v3, :cond_8

    .line 370
    .line 371
    if-eqz v2, :cond_8

    .line 372
    .line 373
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 374
    .line 375
    const/16 v5, 0x1a

    .line 376
    .line 377
    if-lt v4, v5, :cond_7

    .line 378
    .line 379
    const-string v4, "hms_push_channel"

    .line 380
    .line 381
    invoke-static {v4}, Lcom/huawei/hms/utils/ResourceLoaderUtil;->getStringId(Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-static {}, Lj2/a;->a()V

    .line 390
    .line 391
    .line 392
    const-string v5, "HwPushChannelID"

    .line 393
    .line 394
    const/4 v6, 0x3

    .line 395
    invoke-static {v5, v4, v6}, Lcom/blankj/utilcode/util/j;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-static {v3, v4}, Lcom/blankj/utilcode/util/g;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 400
    .line 401
    .line 402
    :cond_7
    invoke-virtual {v3, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1}, Lt5/m;->B()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {p1}, Lt5/m;->e()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    const-string v2, "100"

    .line 414
    .line 415
    invoke-static {p0, v1, p1, v2}, Lt5/j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 416
    .line 417
    .line 418
    :cond_8
    monitor-exit v0

    .line 419
    return-void

    .line 420
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 421
    throw p0

    .line 422
    :cond_9
    :goto_5
    monitor-exit v0

    .line 423
    return-void
.end method

.method public static f(Landroid/content/Context;Lt5/m;Landroid/app/Notification$Builder;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lt5/g;->b(Landroid/content/Context;Lt5/m;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static g(Lt5/m;Landroid/app/Notification$Builder;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt5/m;->i()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v0

    .line 11
    :goto_0
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static h()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static i(Lt5/m;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lt5/m;->G()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lt5/m;->s()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public static j(Landroid/content/Context;Lt5/m;[I)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    const-string v0, "2"

    .line 2
    .line 3
    const/high16 v1, 0x10000000

    .line 4
    .line 5
    invoke-static {p0, p1, p2, v0, v1}, Lt5/l;->b(Landroid/content/Context;Lt5/m;[ILjava/lang/String;I)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x2

    .line 10
    aget p2, p2, v0

    .line 11
    .line 12
    invoke-static {}, Lt5/e;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p0, p2, p1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static k(Landroid/content/Context;Landroid/app/Notification$Builder;Lt5/m;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "com.huawei.android.pushagent"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lt5/m;->u()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const-string v0, "hw_origin_sender_package_name"

    .line 29
    .line 30
    invoke-virtual {p0, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public static l(Lt5/m;Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt5/m;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static m(Landroid/content/Context;Lt5/m;[I)Landroid/app/PendingIntent;
    .locals 2

    .line 1
    const-string v0, "1"

    .line 2
    .line 3
    const/high16 v1, 0x10000000

    .line 4
    .line 5
    invoke-static {p0, p1, p2, v0, v1}, Lt5/l;->b(Landroid/content/Context;Lt5/m;[ILjava/lang/String;I)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lt5/l;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-class v0, Lcom/huawei/hms/support/api/push/TransActivity;

    .line 17
    .line 18
    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const v0, 0x10008000

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    aget p2, p2, v1

    .line 28
    .line 29
    invoke-static {}, Lt5/e;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p0, p2, p1, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    aget p2, p2, v1

    .line 39
    .line 40
    invoke-static {}, Lt5/e;->a()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p0, p2, p1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static n(Lt5/m;Landroid/app/Notification$Builder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt5/m;->J()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static o(Lt5/m;Landroid/app/Notification$Builder;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt5/m;->G()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lt5/m;->s()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1, p0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method
