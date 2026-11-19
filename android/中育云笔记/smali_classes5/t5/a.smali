.class public abstract Lt5/a;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/a$b;
    }
.end annotation


# static fields
.field public static final PROXY_TYPE:Ljava/lang/String; = "proxy_type"

.field public static final SUBJECT_ID:Ljava/lang/String; = "subject_id"


# instance fields
.field private final a:Landroid/os/Messenger;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Messenger;

    .line 5
    .line 6
    new-instance v1, Lt5/f;

    .line 7
    .line 8
    new-instance v2, Lt5/a$b;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, p0, v3}, Lt5/a$b;-><init>(Lt5/a;Lt5/a$a;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lt5/f;-><init>(Lt5/f$a;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lt5/a;->a:Landroid/os/Messenger;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "message_id"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "message_body"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 22
    .line 23
    .line 24
    const-string v1, "device_token"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, -0x1

    .line 34
    const-string v2, "inputType"

    .line 35
    .line 36
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/4 v1, 0x1

    .line 41
    if-ne p1, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized b(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "device_token"

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0, p3}, Lt5/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v1, v2, v3}, Le5/a;->c(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    const-string v2, "HmsMessageService"

    .line 37
    .line 38
    const-string v4, "onNewToken to host app."

    .line 39
    .line 40
    invoke-static {v2, v4}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lt5/a;->onNewToken(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v1, v2}, Le5/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    :goto_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-static {v1}, Le5/a;->f(Landroid/content/Context;)[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    array-length v2, p3

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    :goto_1
    array-length p1, p3

    .line 74
    if-ge v3, p1, :cond_2

    .line 75
    .line 76
    new-instance p1, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    aget-object p2, p3, v3

    .line 82
    .line 83
    const-string v2, "subject_id"

    .line 84
    .line 85
    invoke-virtual {p1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance p2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v2, "onNewToken to sub app, subjectId:"

    .line 94
    .line 95
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    aget-object v2, p3, v3

    .line 99
    .line 100
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const-string v2, "HmsMessageService"

    .line 108
    .line 109
    invoke-static {v2, p2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0, p1}, Lt5/a;->onNewToken(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    aget-object p1, p3, v3

    .line 116
    .line 117
    invoke-virtual {p0, v0, p1}, Lt5/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    invoke-static {v1}, Le5/a;->a(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    :goto_2
    const-string p3, "HmsMessageService"

    .line 128
    .line 129
    const-string v1, "onNewToken to host app with bundle."

    .line 130
    .line 131
    invoke-static {p3, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string p3, "belongId"

    .line 135
    .line 136
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string p3, "belongId"

    .line 141
    .line 142
    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v0, p2}, Lt5/a;->onNewToken(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    monitor-exit p0

    .line 149
    return-void

    .line 150
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v1, "onNewToken to sub app, subjectId:"

    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const-string p3, "HmsMessageService"

    .line 168
    .line 169
    invoke-static {p3, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0, p2}, Lt5/a;->onNewToken(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    .line 174
    .line 175
    :goto_3
    monitor-exit p0

    .line 176
    return-void

    .line 177
    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    throw p1
.end method

.method public final declared-synchronized c(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;I)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0, v1}, Le5/a;->c(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string v0, "HmsMessageService"

    .line 28
    .line 29
    const-string v2, "onTokenError to host app."

    .line 30
    .line 31
    invoke-static {v0, v2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/huawei/hms/push/BaseException;

    .line 35
    .line 36
    invoke-direct {v0, p4}, Lcom/huawei/hms/push/BaseException;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lt5/a;->onTokenError(Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p1, v0}, Le5/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_0
    :goto_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-static {p1}, Le5/a;->f(Landroid/content/Context;)[Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    if-eqz p3, :cond_3

    .line 64
    .line 65
    array-length v0, p3

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    :goto_1
    array-length p2, p3

    .line 70
    if-ge v1, p2, :cond_2

    .line 71
    .line 72
    new-instance p2, Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    aget-object v0, p3, v1

    .line 78
    .line 79
    const-string v2, "subject_id"

    .line 80
    .line 81
    invoke-virtual {p2, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v2, "onTokenError to sub app, subjectId:"

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    aget-object v2, p3, v1

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v2, "HmsMessageService"

    .line 104
    .line 105
    invoke-static {v2, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lcom/huawei/hms/push/BaseException;

    .line 109
    .line 110
    invoke-direct {v0, p4}, Lcom/huawei/hms/push/BaseException;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0, p2}, Lt5/a;->onTokenError(Ljava/lang/Exception;Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    invoke-static {p1}, Le5/a;->a(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    :goto_2
    const-string p1, "HmsMessageService"

    .line 124
    .line 125
    const-string p3, "onTokenError to host app with bundle."

    .line 126
    .line 127
    invoke-static {p1, p3}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, Lcom/huawei/hms/push/BaseException;

    .line 131
    .line 132
    invoke-direct {p1, p4}, Lcom/huawei/hms/push/BaseException;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, p2}, Lt5/a;->onTokenError(Ljava/lang/Exception;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    monitor-exit p0

    .line 139
    return-void

    .line 140
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v0, "onTokenError to sub app, subjectId:"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const-string p3, "HmsMessageService"

    .line 158
    .line 159
    invoke-static {p3, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    new-instance p1, Lcom/huawei/hms/push/BaseException;

    .line 163
    .line 164
    invoke-direct {p1, p4}, Lcom/huawei/hms/push/BaseException;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1, p2}, Lt5/a;->onTokenError(Ljava/lang/Exception;Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    .line 169
    .line 170
    :goto_3
    monitor-exit p0

    .line 171
    return-void

    .line 172
    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 173
    throw p1
.end method

.method public final d(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "error"

    .line 8
    .line 9
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "push.onNewToken"

    .line 14
    .line 15
    invoke-virtual {p0, v2, p2, v1}, Lt5/a;->f(Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string v2, "subjectId"

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "message_proxy_type"

    .line 25
    .line 26
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v5, "doOnNewToken:transactionId = "

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p2, " , internalCode = "

    .line 44
    .line 45
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p2, ",subjectId:"

    .line 52
    .line 53
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, ",proxyType:"

    .line 60
    .line 61
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-string v4, "HmsMessageService"

    .line 72
    .line 73
    invoke-static {v4, p2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_0

    .line 86
    .line 87
    const-string v5, "subject_id"

    .line 88
    .line 89
    invoke-virtual {p2, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_1

    .line 97
    .line 98
    const-string v5, "proxy_type"

    .line 99
    .line 100
    invoke-virtual {p2, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-ne v1, v0, :cond_2

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v1, "Apply token OnNewToken, subId: "

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v4, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, p1, p2, v2}, Lt5/a;->b(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v3, "Apply token failed, subId: "

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v4, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1, p2, v2, v1}, Lt5/a;->c(Landroid/content/Intent;Landroid/os/Bundle;Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public doMsgReceived(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lt5/a;->a(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/huawei/hms/push/RemoteMessage;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lcom/huawei/hms/push/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lt5/a;->onMessageReceived(Lcom/huawei/hms/push/RemoteMessage;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lt5/a$a;

    .line 9
    .line 10
    invoke-direct {v0, p0, p2, p1}, Lt5/a$a;-><init>(Lt5/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ld5/a;->a(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p2, "null"

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1, p2, p3}, Lu5/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Landroid/content/Intent;)V
    .locals 7

    .line 1
    const-string v0, "parse batch response."

    .line 2
    .line 3
    const-string v1, "HmsMessageService"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "batchMsgbody"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ge p1, v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "transactionId"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, "msgId"

    .line 44
    .line 45
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "ret"

    .line 50
    .line 51
    sget-object v6, Lcom/huawei/hms/aaid/constant/ErrorEnum;->l:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 52
    .line 53
    invoke-virtual {v6}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    sget-object v5, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 62
    .line 63
    invoke-virtual {v5}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ne v5, v2, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0, v3, v4}, Lt5/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p0, v3, v4, v2}, Lt5/a;->i(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    :goto_2
    return-void

    .line 80
    :catch_0
    const-string p1, "parse batch response failed."

    .line 81
    .line 82
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onMessageSent, message id:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", transactionId: "

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
    const-string v1, "HmsMessageService"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v1, "push.sendMessageRet"

    .line 38
    .line 39
    invoke-virtual {p0, v1, p1, v0}, Lt5/a;->f(Ljava/lang/String;Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Lt5/a;->onMessageSent(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public handleIntentMessage(Landroid/content/Intent;)V
    .locals 6

    .line 1
    const-string v0, "HmsMessageService"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, "receive message is null"

    .line 6
    .line 7
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "message_id"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "message_type"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "transaction_id"

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "new_token"

    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const-string v1, "onNewToken"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v3}, Lt5/a;->d(Landroid/content/Intent;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :catch_1
    move-exception p1

    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_1
    const-string v4, "received_message"

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "onMessageReceived, message id:"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v0, v2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v2, "push.receiveMessage"

    .line 81
    .line 82
    sget-object v3, Lcom/huawei/hms/aaid/constant/ErrorEnum;->f:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 83
    .line 84
    invoke-virtual {v3}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0, v2, v1, v3}, Lt5/a;->f(Ljava/lang/String;Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lt5/a;->doMsgReceived(Landroid/content/Intent;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    const-string v4, "sent_message"

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, v3, v1}, Lt5/a;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    const-string v4, "send_error"

    .line 108
    .line 109
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    const-string v5, "error"

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    :try_start_1
    sget-object v2, Lcom/huawei/hms/aaid/constant/ErrorEnum;->l:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {p1, v5, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0, v3, v1, p1}, Lt5/a;->i(Ljava/lang/String;Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_4
    const-string v4, "delivery"

    .line 132
    .line 133
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    sget-object v2, Lcom/huawei/hms/aaid/constant/ErrorEnum;->J:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->d()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p1, v5, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v4, "onMessageDelivery, message id:"

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v4, ", status:"

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v4, ", transactionId: "

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {v0, v2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v2, "push.deliveryMessage"

    .line 186
    .line 187
    invoke-virtual {p0, v2, v3, p1}, Lt5/a;->f(Ljava/lang/String;Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    new-instance v2, Lcom/huawei/hms/push/SendException;

    .line 191
    .line 192
    invoke-direct {v2, p1}, Lcom/huawei/hms/push/SendException;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v1, v2}, Lt5/a;->onMessageDelivered(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    const-string v3, "server_deleted_message"

    .line 200
    .line 201
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_6

    .line 206
    .line 207
    new-instance p1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v2, "delete message, message id:"

    .line 213
    .line 214
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Lt5/a;->onDeletedMessages()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_6
    const-string v1, "batchSent"

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_7

    .line 238
    .line 239
    invoke-virtual {p0, p1}, Lt5/a;->g(Landroid/content/Intent;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const-string v1, "Receive unknown message: "

    .line 249
    .line 250
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v2, "handle intent exception: "

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v2, "handle intent RuntimeException: "

    .line 295
    .line 296
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {v0, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :goto_2
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onSendError, message id:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " error:"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", transactionId: "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "HmsMessageService"

    .line 35
    .line 36
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "push.sendMessageRet"

    .line 40
    .line 41
    invoke-virtual {p0, v0, p1, p3}, Lt5/a;->f(Ljava/lang/String;Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lcom/huawei/hms/push/SendException;

    .line 45
    .line 46
    invoke-direct {p1, p3}, Lcom/huawei/hms/push/SendException;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2, p1}, Lt5/a;->onSendError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    const-string p1, "HmsMessageService"

    .line 2
    .line 3
    const-string v0, "start to bind"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lt5/a;->a:Landroid/os/Messenger;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public onDeletedMessages()V
    .locals 0

    .line 1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    const-string v0, "HmsMessageService"

    .line 2
    .line 3
    const-string v1, "start to destroy"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onMessageDelivered(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onMessageReceived(Lcom/huawei/hms/push/RemoteMessage;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onMessageSent(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onNewToken(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    return-void
.end method

.method public onSendError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "start to command , startId = "

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string p3, "HmsMessageService"

    .line 19
    .line 20
    invoke-static {p3, p2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lt5/a;->handleIntentMessage(Landroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    return p1
.end method

.method public onTokenError(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTokenError(Ljava/lang/Exception;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    return-void
.end method
