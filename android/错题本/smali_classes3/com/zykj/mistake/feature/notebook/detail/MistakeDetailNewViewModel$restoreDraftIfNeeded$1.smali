.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$restoreDraftIfNeeded$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x25e,
        0x262
    }
    m = "invokeSuspend"
    n = {
        "localPath",
        "localPath"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1\n*L\n619#1:2475,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $draftUrl:Ljava/lang/String;

.field final synthetic $itemId:I

.field final synthetic $remoteDraftUrl:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ILjava/lang/String;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$remoteDraftUrl:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$draftUrl:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$remoteDraftUrl:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$draftUrl:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ILjava/lang/String;Ljava/lang/String;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 76

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    sget-object v4, Ld6/s;->a:Ld6/s;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v5, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v6, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 49
    .line 50
    iget v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->v(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 60
    .line 61
    iput-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->label:I

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->x(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-ne v6, v1, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    :goto_0
    if-eqz v6, :cond_4

    .line 76
    .line 77
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 78
    .line 79
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 80
    .line 81
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$remoteDraftUrl:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f0(ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v4

    .line 87
    :cond_4
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 88
    .line 89
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$remoteDraftUrl:Ljava/lang/String;

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    iput-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->label:I

    .line 95
    .line 96
    invoke-static {v6, v7, v2, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->b(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-ne v2, v1, :cond_5

    .line 101
    .line 102
    :goto_1
    return-object v1

    .line 103
    :cond_5
    :goto_2
    check-cast v2, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 112
    .line 113
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 114
    .line 115
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 120
    .line 121
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 122
    .line 123
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 124
    .line 125
    if-ne v1, v2, :cond_8

    .line 126
    .line 127
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 128
    .line 129
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 130
    .line 131
    const-string v3, "\u8349\u7a3f\u4e0b\u8f7d\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u540e\u91cd\u8bd5"

    .line 132
    .line 133
    invoke-direct {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 137
    .line 138
    .line 139
    return-object v4

    .line 140
    :cond_6
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 141
    .line 142
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 143
    .line 144
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 149
    .line 150
    iget v1, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 151
    .line 152
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$itemId:I

    .line 153
    .line 154
    if-ne v1, v2, :cond_8

    .line 155
    .line 156
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 157
    .line 158
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->$draftUrl:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v1, v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f0(ILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$restoreDraftIfNeeded$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 164
    .line 165
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 166
    .line 167
    :cond_7
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    move-object v6, v2

    .line 172
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 173
    .line 174
    iget v3, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    .line 175
    .line 176
    add-int/lit8 v50, v3, 0x1

    .line 177
    .line 178
    const/16 v74, -0x401

    .line 179
    .line 180
    const/16 v75, 0x1

    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const-wide/16 v9, 0x0

    .line 185
    .line 186
    const/4 v11, 0x0

    .line 187
    const/4 v12, 0x0

    .line 188
    const/4 v13, 0x0

    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const/16 v23, 0x0

    .line 206
    .line 207
    const/16 v24, 0x0

    .line 208
    .line 209
    const/16 v25, 0x0

    .line 210
    .line 211
    const/16 v26, 0x0

    .line 212
    .line 213
    const/16 v27, 0x0

    .line 214
    .line 215
    const/16 v28, 0x0

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    const/16 v30, 0x0

    .line 220
    .line 221
    const/16 v31, 0x0

    .line 222
    .line 223
    const/16 v32, 0x0

    .line 224
    .line 225
    const/16 v33, 0x0

    .line 226
    .line 227
    const/16 v34, 0x0

    .line 228
    .line 229
    const/16 v35, 0x0

    .line 230
    .line 231
    const/16 v36, 0x0

    .line 232
    .line 233
    const/16 v37, 0x0

    .line 234
    .line 235
    const/16 v38, 0x0

    .line 236
    .line 237
    const/16 v39, 0x0

    .line 238
    .line 239
    const/16 v40, 0x0

    .line 240
    .line 241
    const/16 v41, 0x0

    .line 242
    .line 243
    const/16 v42, 0x0

    .line 244
    .line 245
    const/16 v43, 0x0

    .line 246
    .line 247
    const/16 v44, 0x0

    .line 248
    .line 249
    const/16 v45, 0x0

    .line 250
    .line 251
    const/16 v46, 0x0

    .line 252
    .line 253
    const/16 v47, 0x0

    .line 254
    .line 255
    const/16 v48, 0x0

    .line 256
    .line 257
    const/16 v49, 0x0

    .line 258
    .line 259
    const/16 v51, 0x0

    .line 260
    .line 261
    const/16 v52, 0x0

    .line 262
    .line 263
    const/16 v53, 0x0

    .line 264
    .line 265
    const/16 v54, 0x0

    .line 266
    .line 267
    const/16 v55, 0x0

    .line 268
    .line 269
    const/16 v56, 0x0

    .line 270
    .line 271
    const/16 v57, 0x0

    .line 272
    .line 273
    const/16 v58, 0x0

    .line 274
    .line 275
    const/16 v59, 0x0

    .line 276
    .line 277
    const/16 v60, 0x0

    .line 278
    .line 279
    const/16 v61, 0x0

    .line 280
    .line 281
    const/16 v62, 0x0

    .line 282
    .line 283
    const/16 v63, 0x0

    .line 284
    .line 285
    const/16 v64, 0x0

    .line 286
    .line 287
    const/16 v65, 0x0

    .line 288
    .line 289
    const/16 v66, 0x0

    .line 290
    .line 291
    const/16 v67, 0x0

    .line 292
    .line 293
    const/16 v68, 0x0

    .line 294
    .line 295
    const/16 v69, 0x0

    .line 296
    .line 297
    const/16 v70, 0x0

    .line 298
    .line 299
    const/16 v71, 0x0

    .line 300
    .line 301
    const/16 v72, 0x0

    .line 302
    .line 303
    const/16 v73, -0x1

    .line 304
    .line 305
    invoke-static/range {v6 .. v75}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_7

    .line 314
    .line 315
    :cond_8
    return-object v4
.end method
