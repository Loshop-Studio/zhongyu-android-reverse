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
    .annotation build Landroidx/annotation/NonNull;
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
    const-string v1, "efs.config"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_5

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v3, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    .line 28
    .line 29
    if-ne v0, v3, :cond_5

    .line 30
    .line 31
    invoke-static {}, Lcom/efs/sdk/base/a/c/a/c;->a()Lcom/efs/sdk/base/a/c/a/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v0, v3}, Lcom/efs/sdk/base/a/c/a/c;->a(Z)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Lcom/efs/sdk/base/a/a/c;->a()Lcom/efs/sdk/base/a/a/c;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    :goto_0
    const/4 v6, 0x3

    .line 46
    if-ge v5, v6, :cond_4

    .line 47
    .line 48
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->a()Lcom/efs/sdk/base/a/a/a;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v4}, Lcom/efs/sdk/base/a/a/c;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    new-instance v8, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v9, "/apm_cc"

    .line 65
    .line 66
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    iget-boolean v6, v6, Lcom/efs/sdk/base/a/a/a;->a:Z

    .line 74
    .line 75
    if-eqz v6, :cond_0

    .line 76
    .line 77
    const-string v6, "get config from server, url is "

    .line 78
    .line 79
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const-string v9, "efs.px.api"

    .line 88
    .line 89
    invoke-static {v9, v6}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-direct {v6, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 95
    .line 96
    .line 97
    const-string v9, "wpk-header"

    .line 98
    .line 99
    invoke-interface {v6, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    new-instance v7, Lcom/efs/sdk/base/a/h/b/d;

    .line 103
    .line 104
    invoke-direct {v7, v8}, Lcom/efs/sdk/base/a/h/b/d;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, v6}, Lcom/efs/sdk/base/a/h/b/d;->a(Ljava/util/Map;)Lcom/efs/sdk/base/a/h/b/d;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {}, Lcom/efs/sdk/base/a/a/b;->a()Lcom/efs/sdk/base/a/a/b;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v6, v7}, Lcom/efs/sdk/base/a/h/b/d;->a(Lcom/efs/sdk/base/http/AbsHttpListener;)Lcom/efs/sdk/base/a/h/b/d;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v6}, Lcom/efs/sdk/base/a/h/b/d;->a()Lcom/efs/sdk/base/a/h/b/c;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    iget-object v7, v6, Lcom/efs/sdk/base/a/h/b/c;->a:Lcom/efs/sdk/base/a/h/b/b;

    .line 124
    .line 125
    const-string v8, "get"

    .line 126
    .line 127
    iput-object v8, v7, Lcom/efs/sdk/base/a/h/b/b;->e:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v6}, Lcom/efs/sdk/base/a/h/a/e;->a()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    check-cast v6, Lcom/efs/sdk/base/http/HttpResponse;

    .line 134
    .line 135
    iget-boolean v7, v6, Lcom/efs/sdk/base/a/f/d;->succ:Z

    .line 136
    .line 137
    if-eqz v7, :cond_1

    .line 138
    .line 139
    iget-object v2, v6, Lcom/efs/sdk/base/a/f/d;->data:Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_1
    invoke-virtual {v6}, Lcom/efs/sdk/base/http/HttpResponse;->getBizCode()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-nez v7, :cond_3

    .line 151
    .line 152
    const-string v7, "1000"

    .line 153
    .line 154
    invoke-virtual {v6}, Lcom/efs/sdk/base/http/HttpResponse;->getBizCode()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-nez v6, :cond_2

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_3
    :goto_1
    return-object v2

    .line 169
    :cond_4
    :goto_2
    const-string v0, "config request succ, config is:\n "

    .line 170
    .line 171
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v1, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v2

    .line 183
    :cond_5
    const-string v0, "Config refresh fail, network is disconnected."

    .line 184
    .line 185
    invoke-static {v1, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v2
.end method
