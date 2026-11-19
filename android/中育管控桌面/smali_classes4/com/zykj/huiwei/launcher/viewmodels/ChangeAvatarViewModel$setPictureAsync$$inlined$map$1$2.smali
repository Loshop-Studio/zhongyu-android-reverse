# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/FlowCollector;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->a:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v7, :cond_3

    .line 44
    .line 45
    if-eq v4, v6, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    iget-object v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Lkotlinx/coroutines/flow/FlowCollector;

    .line 52
    .line 53
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    iget v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->k:I

    .line 71
    .line 72
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 75
    .line 76
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Lkotlin/coroutines/Continuation;

    .line 79
    .line 80
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, Lkotlinx/coroutines/flow/FlowCollector;

    .line 83
    .line 84
    iget-object v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v7, Lkotlinx/coroutines/flow/FlowCollector;

    .line 87
    .line 88
    iget-object v9, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v10, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 93
    .line 94
    iget-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :cond_3
    iget v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->l:I

    .line 102
    .line 103
    iget-boolean v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->m:Z

    .line 104
    .line 105
    iget v9, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->k:I

    .line 106
    .line 107
    iget-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v10, Lkotlin/coroutines/Continuation;

    .line 110
    .line 111
    iget-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v11, Lkotlinx/coroutines/flow/FlowCollector;

    .line 114
    .line 115
    iget-object v12, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v12, Lkotlinx/coroutines/flow/FlowCollector;

    .line 118
    .line 119
    iget-object v13, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 120
    .line 121
    iget-object v14, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;

    .line 124
    .line 125
    iget-object v15, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v16, v10

    .line 131
    .line 132
    move v10, v4

    .line 133
    move v4, v9

    .line 134
    move v9, v7

    .line 135
    move-object v7, v12

    .line 136
    move-object/from16 v12, v16

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    .line 143
    .line 144
    move-object/from16 v4, p1

    .line 145
    .line 146
    check-cast v4, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    iget-object v9, v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 153
    .line 154
    invoke-static {v9}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->a(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    iput v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->k:I

    .line 192
    .line 193
    iput-boolean v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->m:Z

    .line 194
    .line 195
    iput v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->l:I

    .line 196
    .line 197
    iput v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 198
    .line 199
    invoke-virtual {v9, v2}, Lcom/zykj/huiwei/launcher/repository/UserRepository;->e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    if-ne v7, v3, :cond_5

    .line 204
    .line 205
    goto/16 :goto_3

    .line 206
    .line 207
    :cond_5
    move-object/from16 v13, p1

    .line 208
    .line 209
    move-object v15, v13

    .line 210
    move-object v11, v1

    .line 211
    move-object v12, v2

    .line 212
    move-object v14, v12

    .line 213
    move v9, v4

    .line 214
    move v4, v10

    .line 215
    move-object v1, v7

    .line 216
    move-object v7, v11

    .line 217
    :goto_1
    check-cast v1, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 218
    .line 219
    iget-object v5, v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 220
    .line 221
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->e()Landroidx/datastore/core/DataStore;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    new-instance v6, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;

    .line 226
    .line 227
    invoke-direct {v6, v1, v8}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$1$1;-><init>(Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;Lkotlin/coroutines/Continuation;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iput-object v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 267
    .line 268
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->k:I

    .line 269
    .line 270
    iput-boolean v9, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->m:Z

    .line 271
    .line 272
    iput v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->l:I

    .line 273
    .line 274
    const/4 v1, 0x2

    .line 275
    iput v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 276
    .line 277
    invoke-interface {v5, v6, v2}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    if-ne v1, v3, :cond_6

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_6
    move-object v6, v11

    .line 285
    move-object v9, v13

    .line 286
    move-object v10, v14

    .line 287
    move-object v11, v15

    .line 288
    :goto_2
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 293
    .line 294
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 305
    .line 306
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 316
    .line 317
    iput-object v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 318
    .line 319
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->k:I

    .line 320
    .line 321
    const/4 v4, 0x3

    .line 322
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1;->b:I

    .line 323
    .line 324
    invoke-interface {v6, v1, v2}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-ne v1, v3, :cond_7

    .line 329
    .line 330
    :goto_3
    return-object v3

    .line 331
    :cond_7
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v1
.end method
