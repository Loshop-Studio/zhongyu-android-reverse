.class final Lcom/friday/common/network/StudentSession$ensureReady$ready$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/network/StudentSession;->i(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.network.StudentSession$ensureReady$ready$1"
    f = "StudentSession.kt"
    l = {
        0x83,
        0x44,
        0x45
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public i:I

.field public final synthetic j:Lcom/friday/common/network/StudentSession;


# direct methods
.method public constructor <init>(Lcom/friday/common/network/StudentSession;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->j:Lcom/friday/common/network/StudentSession;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->j:Lcom/friday/common/network/StudentSession;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;-><init>(Lcom/friday/common/network/StudentSession;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->i:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    if-eq v2, v6, :cond_2

    .line 17
    .line 18
    if-eq v2, v5, :cond_1

    .line 19
    .line 20
    if-ne v2, v4, :cond_0

    .line 21
    .line 22
    iget-object v0, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/zykj/message/server/bean/ServerInfo;

    .line 25
    .line 26
    iget-object v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 29
    .line 30
    iget-object v3, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lcom/friday/common/network/StudentSession;

    .line 33
    .line 34
    iget-object v4, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Lbe/a;

    .line 37
    .line 38
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object v6, v3

    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    :goto_0
    move-object v8, v2

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    iget v3, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->h:I

    .line 59
    .line 60
    iget v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->g:I

    .line 61
    .line 62
    iget-object v5, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Lcom/zykj/http/bean/HeaderBean;

    .line 65
    .line 66
    iget-object v6, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v6, Lcom/friday/common/network/StudentSession;

    .line 69
    .line 70
    iget-object v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v8, Lbe/a;

    .line 73
    .line 74
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    move-object v9, v8

    .line 78
    move v8, v3

    .line 79
    move v3, v2

    .line 80
    move-object v2, v5

    .line 81
    move-object/from16 v5, p1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    move-object v4, v8

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_2
    iget v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->g:I

    .line 89
    .line 90
    iget-object v6, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v6, Lcom/friday/common/network/StudentSession;

    .line 93
    .line 94
    iget-object v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v8, Lbe/a;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->j:Lcom/friday/common/network/StudentSession;

    .line 106
    .line 107
    invoke-static {v2}, Lcom/friday/common/network/StudentSession;->e(Lcom/friday/common/network/StudentSession;)Lbe/a;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->j:Lcom/friday/common/network/StudentSession;

    .line 112
    .line 113
    iput-object v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    iput v3, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->g:I

    .line 118
    .line 119
    iput v6, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->i:I

    .line 120
    .line 121
    invoke-interface {v2, v7, v1}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-ne v6, v0, :cond_4

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    move-object v6, v8

    .line 129
    move-object v8, v2

    .line 130
    move v2, v3

    .line 131
    :goto_1
    :try_start_2
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->g(Lcom/friday/common/network/StudentSession;)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-nez v9, :cond_8

    .line 136
    .line 137
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->d(Lcom/friday/common/network/StudentSession;)Lvd/l;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-interface {v9}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Lcom/zykj/http/bean/HeaderBean;

    .line 146
    .line 147
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->c(Lcom/friday/common/network/StudentSession;)Lhd/l;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    iput-object v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v6, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v9, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->e:Ljava/lang/Object;

    .line 156
    .line 157
    iput v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->g:I

    .line 158
    .line 159
    iput v3, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->h:I

    .line 160
    .line 161
    iput v5, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->i:I

    .line 162
    .line 163
    invoke-interface {v10, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    if-ne v5, v0, :cond_5

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    move/from16 v16, v3

    .line 171
    .line 172
    move v3, v2

    .line 173
    move-object v2, v9

    .line 174
    move-object v9, v8

    .line 175
    move/from16 v8, v16

    .line 176
    .line 177
    :goto_2
    :try_start_3
    check-cast v5, Lcom/zykj/message/server/bean/ServerInfo;

    .line 178
    .line 179
    invoke-static {v6, v5}, Lcom/friday/common/network/StudentSession;->h(Lcom/friday/common/network/StudentSession;Lcom/zykj/message/server/bean/ServerInfo;)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_7

    .line 184
    .line 185
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->f(Lcom/friday/common/network/StudentSession;)Lhd/l;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    iput-object v9, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->c:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v6, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->d:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v2, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v5, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->f:Ljava/lang/Object;

    .line 196
    .line 197
    iput v3, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->g:I

    .line 198
    .line 199
    iput v8, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->h:I

    .line 200
    .line 201
    iput v4, v1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;->i:I

    .line 202
    .line 203
    invoke-interface {v10, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 207
    if-ne v3, v0, :cond_6

    .line 208
    .line 209
    :goto_3
    return-object v0

    .line 210
    :cond_6
    move-object v0, v5

    .line 211
    move-object v4, v9

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :goto_4
    :try_start_4
    check-cast v3, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_9

    .line 221
    .line 222
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->d(Lcom/friday/common/network/StudentSession;)Lvd/l;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    const/16 v14, 0x13

    .line 238
    .line 239
    const/4 v15, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v13, 0x0

    .line 243
    invoke-static/range {v8 .. v15}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v2, v8, v0}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :catchall_2
    move-exception v0

    .line 252
    move-object v4, v9

    .line 253
    goto :goto_6

    .line 254
    :cond_7
    move-object v4, v9

    .line 255
    goto :goto_5

    .line 256
    :cond_8
    move-object v4, v8

    .line 257
    :cond_9
    :goto_5
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->g(Lcom/friday/common/network/StudentSession;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 265
    invoke-interface {v4, v7}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :goto_6
    invoke-interface {v4, v7}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    throw v0
.end method
