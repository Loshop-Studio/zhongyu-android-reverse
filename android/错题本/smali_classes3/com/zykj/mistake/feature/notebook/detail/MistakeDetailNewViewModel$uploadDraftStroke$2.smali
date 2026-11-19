# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$uploadDraftStroke$2"
    f = "MistakeDetailNewViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x242,
        0x249
    }
    m = "invokeSuspend"
    n = {
        "modulePath",
        "resPath",
        "fe",
        "nonce",
        "reqStr",
        "tokenReq",
        "userId",
        "ft",
        "fo",
        "ts",
        "modulePath",
        "resPath",
        "fe",
        "nonce",
        "reqStr",
        "tokenReq",
        "resp",
        "credential",
        "date",
        "objectKey",
        "userId",
        "ft",
        "fo",
        "ts"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "J$0",
        "I$0",
        "I$1",
        "J$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "J$0",
        "I$0",
        "I$1",
        "J$1"
    }
.end annotation


# instance fields
.field final synthetic $strokeFile:Ljava/io/File;

.field I$0:I

.field I$1:I

.field J$0:J

.field J$1:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/io/File;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Ljava/io/File;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->$strokeFile:Ljava/io/File;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->$strokeFile:Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/io/File;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取长整数偏好（SharedPreferences.getLong）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->label:I

    .line 6
    .line 7
    const-string v3, "\u8349\u7a3f\u4e0a\u4f20\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u540e\u91cd\u8bd5"

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v5, :cond_1

    .line 16
    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$9:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$8:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$7:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 30
    .line 31
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$6:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 34
    .line 35
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$5:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lcom/zykj/mistake/entity/req/TokenReq;

    .line 38
    .line 39
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$4:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v2, p1

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_1
    iget-wide v8, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$1:J

    .line 75
    .line 76
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$1:I

    .line 77
    .line 78
    iget v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$0:I

    .line 79
    .line 80
    iget-wide v10, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$0:J

    .line 81
    .line 82
    iget-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$5:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v12, Lcom/zykj/mistake/entity/req/TokenReq;

    .line 85
    .line 86
    iget-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$4:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v12, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$3:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v12, Ljava/lang/String;

    .line 93
    .line 94
    iget-object v13, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v13, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v14, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v15, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v15, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v16, p1

    .line 110
    .line 111
    check-cast v16, Lkotlin/Result;

    .line 112
    .line 113
    invoke-virtual/range {v16 .. v16}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v16

    .line 117
    move-object/from16 v4, v16

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/lifecycle/AndroidViewModel;->getApplication()Landroid/app/Application;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v8, "zykjMistake"

    .line 131
    .line 132
    invoke-virtual {v2, v8, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-string v8, "SP_USER_ID"

    .line 137
    .line 138
    const-wide/16 v9, -0x1

    .line 139
    .line 140
    invoke-interface {v2, v8, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v10

    .line 144
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const-string v8, "toString(...)"

    .line 153
    .line 154
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v8, "-"

    .line 158
    .line 159
    const-string v9, ""

    .line 160
    .line 161
    invoke-static {v2, v8, v9}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 166
    .line 167
    .line 168
    move-result-wide v8

    .line 169
    new-instance v12, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v13, "+mistake_v2+res+1+.bin+0+"

    .line 178
    .line 179
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v13, "+"

    .line 186
    .line 187
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    move-object v13, v12

    .line 198
    new-instance v12, Lcom/zykj/mistake/entity/req/TokenReq;

    .line 199
    .line 200
    invoke-static {v13}, Lcom/blankj/utilcode/util/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v21

    .line 204
    const/16 v22, 0x19

    .line 205
    .line 206
    const/16 v23, 0x0

    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x1

    .line 210
    const-string v15, ".bin"

    .line 211
    .line 212
    const/16 v16, 0x0

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    move-object/from16 v18, v2

    .line 217
    .line 218
    move-wide/from16 v19, v8

    .line 219
    .line 220
    invoke-direct/range {v12 .. v23}, Lcom/zykj/mistake/entity/req/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v12

    .line 224
    move-object/from16 v12, v18

    .line 225
    .line 226
    new-instance v13, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2$resp$1;

    .line 227
    .line 228
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 229
    .line 230
    invoke-direct {v13, v4, v2, v7}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2$resp$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/entity/req/TokenReq;Lh6/c;)V

    .line 231
    .line 232
    .line 233
    const-string v2, "mistake_v2"

    .line 234
    .line 235
    iput-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$0:Ljava/lang/Object;

    .line 236
    .line 237
    const-string v4, "res"

    .line 238
    .line 239
    iput-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$1:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v15, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$2:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$3:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$4:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$5:Ljava/lang/Object;

    .line 248
    .line 249
    iput-wide v10, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$0:J

    .line 250
    .line 251
    iput v14, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$0:I

    .line 252
    .line 253
    iput v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$1:I

    .line 254
    .line 255
    iput-wide v8, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$1:J

    .line 256
    .line 257
    iput v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->label:I

    .line 258
    .line 259
    invoke-static {v13, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    if-ne v5, v1, :cond_3

    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_3
    move v13, v14

    .line 268
    move-object v14, v4

    .line 269
    move-object v4, v5

    .line 270
    move v5, v13

    .line 271
    move-object v13, v15

    .line 272
    move-object v15, v2

    .line 273
    move v2, v6

    .line 274
    :goto_0
    invoke-static {v4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    check-cast v4, Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 278
    .line 279
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/GeneratorResp;->getResult()Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-eqz v4, :cond_6

    .line 284
    .line 285
    invoke-static {}, Lcom/blankj/utilcode/util/s;->a()Ljava/text/SimpleDateFormat;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    new-instance v7, Ljava/util/Date;

    .line 290
    .line 291
    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v6, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    new-instance v7, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v15, "/"

    .line 307
    .line 308
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-static {v7, v15, v12, v13}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->$strokeFile:Ljava/io/File;

    .line 331
    .line 332
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    const-string v12, "getAbsolutePath(...)"

    .line 337
    .line 338
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const/4 v12, 0x0

    .line 342
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$0:Ljava/lang/Object;

    .line 343
    .line 344
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$1:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$2:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$3:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$4:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$5:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$6:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$7:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$8:Ljava/lang/Object;

    .line 359
    .line 360
    iput-object v12, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->L$9:Ljava/lang/Object;

    .line 361
    .line 362
    iput-wide v10, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$0:J

    .line 363
    .line 364
    iput v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$0:I

    .line 365
    .line 366
    iput v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->I$1:I

    .line 367
    .line 368
    iput-wide v8, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->J$1:J

    .line 369
    .line 370
    const/4 v2, 0x2

    .line 371
    iput v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$uploadDraftStroke$2;->label:I

    .line 372
    .line 373
    sget-object v2, Lcom/zykj/mistake/utils/l;->a:Lcom/zykj/mistake/utils/l;

    .line 374
    .line 375
    invoke-virtual {v2, v7, v6, v4, v0}, Lcom/zykj/mistake/utils/l;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    if-ne v2, v1, :cond_4

    .line 380
    .line 381
    :goto_1
    return-object v1

    .line 382
    :cond_4
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 383
    .line 384
    if-eqz v2, :cond_5

    .line 385
    .line 386
    return-object v2

    .line 387
    :cond_5
    new-instance v1, Lcom/zykj/mistake/network/ApiException;

    .line 388
    .line 389
    const/4 v2, 0x0

    .line 390
    invoke-direct {v1, v2, v3}, Lcom/zykj/mistake/network/ApiException;-><init>(ILjava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v1

    .line 394
    :cond_6
    move v2, v6

    .line 395
    new-instance v1, Lcom/zykj/mistake/network/ApiException;

    .line 396
    .line 397
    invoke-direct {v1, v2, v3}, Lcom/zykj/mistake/network/ApiException;-><init>(ILjava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v1
.end method
