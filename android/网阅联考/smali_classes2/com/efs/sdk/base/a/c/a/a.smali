.class public final Lcom/efs/sdk/base/a/c/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/IConfigRefreshAction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/a/c/a/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/efs/sdk/base/a/c/a/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/a/c/a/a$a;->a()Lcom/efs/sdk/base/a/c/a/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public final refresh()Ljava/lang/String;
    .locals 10
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/efs/sdk/base/a/c/a;->c:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/e;->a(Landroid/content/Context;)Landroid/net/NetworkInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v3, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    .line 26
    .line 27
    if-ne v0, v3, :cond_0

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    :goto_0
    const-string v3, "efs.config"

    .line 33
    .line 34
    const-string v4, ""

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, "Config refresh fail, network is disconnected."

    .line 39
    .line 40
    invoke-static {v3, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :cond_1
    invoke-static {}, Lcom/efs/sdk/base/a/c/a/c;->a()Lcom/efs/sdk/base/a/c/a/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Lcom/efs/sdk/base/a/c/a/c;->a(Z)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {}, Lcom/efs/sdk/base/a/a/c;->a()Lcom/efs/sdk/base/a/a/c;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :goto_1
    const/4 v6, 0x3

    .line 57
    if-ge v1, v6, :cond_6

    .line 58
    .line 59
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->a()Lcom/efs/sdk/base/a/a/a;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v5}, Lcom/efs/sdk/base/a/a/c;->b()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v9, "/apm_cc"

    .line 76
    .line 77
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    iget-boolean v6, v6, Lcom/efs/sdk/base/a/a/a;->a:Z

    .line 85
    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const-string v9, "get config from server, url is "

    .line 93
    .line 94
    invoke-virtual {v9, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const-string v9, "efs.px.api"

    .line 99
    .line 100
    invoke-static {v9, v6}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    new-instance v6, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-direct {v6, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 106
    .line 107
    .line 108
    const-string v9, "wpk-header"

    .line 109
    .line 110
    invoke-interface {v6, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    new-instance v7, Lcom/efs/sdk/base/a/h/b/d;

    .line 114
    .line 115
    invoke-direct {v7, v8}, Lcom/efs/sdk/base/a/h/b/d;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v6}, Lcom/efs/sdk/base/a/h/b/d;->a(Ljava/util/Map;)Lcom/efs/sdk/base/a/h/b/d;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {}, Lcom/efs/sdk/base/a/a/b;->a()Lcom/efs/sdk/base/a/a/b;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-virtual {v6, v7}, Lcom/efs/sdk/base/a/h/b/d;->a(Lcom/efs/sdk/base/http/AbsHttpListener;)Lcom/efs/sdk/base/a/h/b/d;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v6}, Lcom/efs/sdk/base/a/h/b/d;->a()Lcom/efs/sdk/base/a/h/b/c;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    iget-object v7, v6, Lcom/efs/sdk/base/a/h/b/c;->a:Lcom/efs/sdk/base/a/h/b/b;

    .line 135
    .line 136
    const-string v8, "get"

    .line 137
    .line 138
    iput-object v8, v7, Lcom/efs/sdk/base/a/h/b/b;->e:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v6}, Lcom/efs/sdk/base/a/h/a/e;->a()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Lcom/efs/sdk/base/http/HttpResponse;

    .line 145
    .line 146
    iget-boolean v7, v6, Lcom/efs/sdk/base/a/f/d;->succ:Z

    .line 147
    .line 148
    if-eqz v7, :cond_3

    .line 149
    .line 150
    iget-object v4, v6, Lcom/efs/sdk/base/a/f/d;->data:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    invoke-virtual {v6}, Lcom/efs/sdk/base/http/HttpResponse;->getBizCode()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-nez v7, :cond_5

    .line 162
    .line 163
    const-string v7, "1000"

    .line 164
    .line 165
    invoke-virtual {v6}, Lcom/efs/sdk/base/http/HttpResponse;->getBizCode()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-nez v6, :cond_4

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    :goto_2
    return-object v4

    .line 180
    :cond_6
    :goto_3
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "config request succ, config is:\n "

    .line 185
    .line 186
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v3, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object v4
.end method
