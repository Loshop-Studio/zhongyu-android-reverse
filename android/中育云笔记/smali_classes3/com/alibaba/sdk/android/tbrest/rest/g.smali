.class public Lcom/alibaba/sdk/android/tbrest/rest/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Class;

.field private a:Ljava/lang/Object;

.field private a:Ljava/lang/reflect/Field;

.field private b:Ljava/lang/Object;

.field private b:Ljava/lang/reflect/Field;

.field private b:Ljava/lang/reflect/Method;

.field private c:Ljava/lang/reflect/Field;

.field private c:Z

.field private g:I

.field private h:Ljava/lang/String;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/reflect/Field;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->g:I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Z

    .line 24
    .line 25
    iput-object p1, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->mContext:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->h:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method

.method private declared-synchronized f()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_1
    const-string v1, "com.taobao.wireless.security.sdk.SecurityGuardManager"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    const-string v2, "getInstance"

    .line 16
    .line 17
    const-class v3, Landroid/content/Context;

    .line 18
    .line 19
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->mContext:Landroid/content/Context;

    .line 28
    .line 29
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Object;

    .line 38
    .line 39
    const-string v2, "getSecureSignatureComp"

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-object v1, v0

    .line 55
    :catchall_1
    :try_start_3
    const-string v2, "initSecurityCheck failure, It\'s ok "

    .line 56
    .line 57
    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 58
    .line 59
    .line 60
    :goto_0
    const/4 v2, 0x1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    :try_start_4
    const-string v3, "com.taobao.wireless.security.sdk.SecurityGuardParamContext"

    .line 64
    .line 65
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iput-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 70
    .line 71
    const-string v4, "appKey"

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/reflect/Field;

    .line 78
    .line 79
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 80
    .line 81
    const-string v4, "paramMap"

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Field;

    .line 88
    .line 89
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 90
    .line 91
    const-string v4, "requestType"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Ljava/lang/reflect/Field;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 98
    .line 99
    :try_start_5
    const-string v3, "isOpen"

    .line 100
    .line 101
    invoke-virtual {v1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 105
    goto :goto_1

    .line 106
    :catchall_2
    :try_start_6
    const-string v1, "initSecurityCheck failure, It\'s ok"

    .line 107
    .line 108
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v1, v0

    .line 112
    :goto_1
    if-eqz v1, :cond_1

    .line 113
    .line 114
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {v1, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 126
    goto :goto_3

    .line 127
    :cond_1
    :try_start_7
    const-string v1, "com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent"

    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 133
    goto :goto_2

    .line 134
    :catchall_3
    :try_start_8
    const-string v1, "initSecurityCheck failure, It\'s ok"

    .line 135
    .line 136
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    if-nez v0, :cond_2

    .line 140
    .line 141
    move v0, v2

    .line 142
    goto :goto_3

    .line 143
    :cond_2
    const/4 v0, 0x0

    .line 144
    :goto_3
    if-eqz v0, :cond_3

    .line 145
    .line 146
    move v0, v2

    .line 147
    goto :goto_4

    .line 148
    :cond_3
    const/16 v0, 0xc

    .line 149
    .line 150
    :goto_4
    iput v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->g:I

    .line 151
    .line 152
    const-string v0, "com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent"

    .line 153
    .line 154
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v1, "signRequest"

    .line 159
    .line 160
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 161
    .line 162
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Method;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :catchall_4
    :try_start_9
    const-string v0, "initSecurityCheck failure, It\'s ok"

    .line 174
    .line 175
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :catchall_5
    move-exception v0

    .line 180
    goto :goto_6

    .line 181
    :cond_4
    :goto_5
    iput-boolean v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 182
    .line 183
    monitor-exit p0

    .line 184
    return-void

    .line 185
    :goto_6
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 186
    throw v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/alibaba/sdk/android/tbrest/rest/g;->f()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->h:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string p1, "RestSecuritySDKRequestAuthentication:getSign There is no appkey,please check it!"

    .line 14
    .line 15
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    if-nez p1, :cond_2

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/reflect/Field;

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Field;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Ljava/lang/reflect/Field;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->a:Ljava/lang/reflect/Field;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->h:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Field;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/util/Map;

    .line 68
    .line 69
    const-string v3, "INPUT"

    .line 70
    .line 71
    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->c:Ljava/lang/reflect/Field;

    .line 75
    .line 76
    iget v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->g:I

    .line 77
    .line 78
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/reflect/Method;

    .line 86
    .line 87
    iget-object v2, p0, Lcom/alibaba/sdk/android/tbrest/rest/g;->b:Ljava/lang/Object;

    .line 88
    .line 89
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    return-object p1

    .line 100
    :catch_0
    move-exception p1

    .line 101
    goto :goto_0

    .line 102
    :catch_1
    move-exception p1

    .line 103
    goto :goto_1

    .line 104
    :catch_2
    move-exception p1

    .line 105
    goto :goto_2

    .line 106
    :catch_3
    move-exception p1

    .line 107
    goto :goto_3

    .line 108
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    :cond_3
    :goto_4
    return-object v1
.end method
