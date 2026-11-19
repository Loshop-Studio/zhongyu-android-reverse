.class final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->u(Lcom/friday/common/entity/NoteBean;)V
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
    c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$insertNewFile$1"
    f = "PickNoteViewModel.kt"
    l = {
        0x7d,
        0x89,
        0x9e,
        0xa3,
        0xbf,
        0xd6,
        0xe0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:J

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

.field public final synthetic u:Lcom/friday/common/entity/NoteBean;


# direct methods
.method public constructor <init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->u:Lcom/friday/common/entity/NoteBean;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->u:Lcom/friday/common/entity/NoteBean;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Lsd/i0;

    .line 7
    .line 8
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 13
    .line 14
    const-string v4, ".zip"

    .line 15
    .line 16
    const-string v5, "/"

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :pswitch_0
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 32
    .line 33
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->n:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 36
    .line 37
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    .line 52
    .line 53
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    .line 56
    .line 57
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lcom/friday/common/entity/OssReqData;

    .line 60
    .line 61
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Landroid/net/Uri;

    .line 80
    .line 81
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_b

    .line 85
    .line 86
    :pswitch_1
    iget-wide v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 87
    .line 88
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->n:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 91
    .line 92
    iget-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v10, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v11, Lcom/friday/common/helper/OssUploadHelper;

    .line 107
    .line 108
    iget-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v12, Lcom/friday/common/entity/OssTokenResponse;

    .line 111
    .line 112
    iget-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v13, Lcom/friday/common/entity/OssReqData;

    .line 115
    .line 116
    iget-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v14, Ljava/lang/String;

    .line 119
    .line 120
    iget-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v15, Ljava/lang/String;

    .line 123
    .line 124
    const/16 v16, 0x1

    .line 125
    .line 126
    iget-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v8, Ljava/lang/String;

    .line 129
    .line 130
    iget-object v7, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v7, Ljava/lang/String;

    .line 133
    .line 134
    move-object/from16 v18, v0

    .line 135
    .line 136
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Landroid/net/Uri;

    .line 139
    .line 140
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    move-object/from16 v19, v18

    .line 144
    .line 145
    move-object/from16 v18, v2

    .line 146
    .line 147
    move-object v2, v9

    .line 148
    move-object/from16 v9, p1

    .line 149
    .line 150
    goto/16 :goto_9

    .line 151
    .line 152
    :pswitch_2
    const/16 v16, 0x1

    .line 153
    .line 154
    iget-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 155
    .line 156
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/lang/String;

    .line 159
    .line 160
    iget-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v8, Ljava/lang/String;

    .line 163
    .line 164
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v9, Ljava/lang/String;

    .line 167
    .line 168
    iget-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v10, Lcom/friday/common/helper/OssUploadHelper;

    .line 171
    .line 172
    iget-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v11, Lcom/friday/common/entity/OssTokenResponse;

    .line 175
    .line 176
    iget-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v12, Lcom/friday/common/entity/OssReqData;

    .line 179
    .line 180
    iget-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v13, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v14, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v15, Ljava/lang/String;

    .line 191
    .line 192
    move-object/from16 v18, v0

    .line 193
    .line 194
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ljava/lang/String;

    .line 197
    .line 198
    move-object/from16 v19, v0

    .line 199
    .line 200
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Landroid/net/Uri;

    .line 203
    .line 204
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v21, v18

    .line 208
    .line 209
    move-object/from16 v18, v2

    .line 210
    .line 211
    move-object/from16 v2, v21

    .line 212
    .line 213
    move-object/from16 v21, v4

    .line 214
    .line 215
    move-object/from16 v27, v8

    .line 216
    .line 217
    move-object v4, v13

    .line 218
    move-object v8, v15

    .line 219
    move-object/from16 v31, v19

    .line 220
    .line 221
    move-object v13, v12

    .line 222
    move-object v12, v11

    .line 223
    move-object v11, v10

    .line 224
    move-object v10, v9

    .line 225
    goto/16 :goto_8

    .line 226
    .line 227
    :pswitch_3
    const/16 v16, 0x1

    .line 228
    .line 229
    iget-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 230
    .line 231
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Ljava/lang/String;

    .line 234
    .line 235
    iget-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v8, Ljava/lang/String;

    .line 238
    .line 239
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v9, Lcom/friday/common/helper/OssUploadHelper;

    .line 242
    .line 243
    iget-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v10, Lcom/friday/common/entity/OssTokenResponse;

    .line 246
    .line 247
    iget-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v11, Lcom/friday/common/entity/OssReqData;

    .line 250
    .line 251
    iget-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v12, Ljava/lang/String;

    .line 254
    .line 255
    iget-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v13, Ljava/lang/String;

    .line 258
    .line 259
    iget-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v14, Ljava/lang/String;

    .line 262
    .line 263
    iget-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v15, Ljava/lang/String;

    .line 266
    .line 267
    move-object/from16 v18, v0

    .line 268
    .line 269
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Landroid/net/Uri;

    .line 272
    .line 273
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    move-object/from16 v21, v4

    .line 277
    .line 278
    move-object/from16 v20, v10

    .line 279
    .line 280
    move-object/from16 v19, v14

    .line 281
    .line 282
    move-object v4, v0

    .line 283
    move-object v10, v9

    .line 284
    move-object v14, v13

    .line 285
    move-object/from16 v9, v18

    .line 286
    .line 287
    move-object/from16 v0, p1

    .line 288
    .line 289
    goto/16 :goto_7

    .line 290
    .line 291
    :pswitch_4
    const/16 v16, 0x1

    .line 292
    .line 293
    iget-wide v7, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 294
    .line 295
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Ljava/lang/String;

    .line 298
    .line 299
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v9, Lcom/friday/common/helper/OssUploadHelper;

    .line 302
    .line 303
    iget-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v10, Lcom/friday/common/entity/OssTokenResponse;

    .line 306
    .line 307
    iget-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v11, Lcom/friday/common/entity/OssReqData;

    .line 310
    .line 311
    iget-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v12, Ljava/lang/String;

    .line 314
    .line 315
    iget-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v13, Ljava/lang/String;

    .line 318
    .line 319
    iget-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v14, Ljava/lang/String;

    .line 322
    .line 323
    iget-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v15, Ljava/lang/String;

    .line 326
    .line 327
    iget-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v6, Landroid/net/Uri;

    .line 330
    .line 331
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-wide/from16 v46, v7

    .line 335
    .line 336
    move-object v8, v0

    .line 337
    move-object v0, v6

    .line 338
    move-wide/from16 v6, v46

    .line 339
    .line 340
    move-object/from16 v19, v14

    .line 341
    .line 342
    move-object v14, v13

    .line 343
    move-object v13, v12

    .line 344
    move-object v12, v11

    .line 345
    move-object v11, v10

    .line 346
    move-object v10, v9

    .line 347
    move-object/from16 v9, p1

    .line 348
    .line 349
    goto/16 :goto_6

    .line 350
    .line 351
    :pswitch_5
    const/16 v16, 0x1

    .line 352
    .line 353
    iget-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 354
    .line 355
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    .line 358
    .line 359
    iget-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v8, Lcom/friday/common/entity/OssTokenResponse;

    .line 362
    .line 363
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v9, Lcom/friday/common/entity/OssReqData;

    .line 366
    .line 367
    iget-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v10, Ljava/lang/String;

    .line 370
    .line 371
    iget-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v11, Ljava/lang/String;

    .line 374
    .line 375
    iget-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v12, Ljava/lang/String;

    .line 378
    .line 379
    iget-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v13, Ljava/lang/String;

    .line 382
    .line 383
    iget-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v14, Landroid/net/Uri;

    .line 386
    .line 387
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    move-object v15, v13

    .line 391
    move-object v13, v11

    .line 392
    move-object v11, v10

    .line 393
    move-object v10, v9

    .line 394
    move-object v9, v8

    .line 395
    move-object/from16 v8, p1

    .line 396
    .line 397
    goto/16 :goto_5

    .line 398
    .line 399
    :pswitch_6
    const/16 v16, 0x1

    .line 400
    .line 401
    iget-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 402
    .line 403
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 404
    .line 405
    move-object v8, v0

    .line 406
    check-cast v8, Lcom/friday/common/entity/OssReqData;

    .line 407
    .line 408
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 409
    .line 410
    move-object v9, v0

    .line 411
    check-cast v9, Ljava/lang/String;

    .line 412
    .line 413
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 414
    .line 415
    move-object v10, v0

    .line 416
    check-cast v10, Ljava/lang/String;

    .line 417
    .line 418
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 419
    .line 420
    move-object v11, v0

    .line 421
    check-cast v11, Ljava/lang/String;

    .line 422
    .line 423
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 424
    .line 425
    move-object v12, v0

    .line 426
    check-cast v12, Ljava/lang/String;

    .line 427
    .line 428
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 429
    .line 430
    move-object v13, v0

    .line 431
    check-cast v13, Landroid/net/Uri;

    .line 432
    .line 433
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 434
    .line 435
    .line 436
    move-object/from16 v0, p1

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :catchall_0
    move-exception v0

    .line 441
    goto/16 :goto_3

    .line 442
    .line 443
    :pswitch_7
    const/16 v16, 0x1

    .line 444
    .line 445
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 449
    .line 450
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->r()Landroid/net/Uri;

    .line 451
    .line 452
    .line 453
    move-result-object v13

    .line 454
    if-nez v13, :cond_0

    .line 455
    .line 456
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 457
    .line 458
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->o()Landroidx/lifecycle/MutableLiveData;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-static/range {v16 .. v16}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 470
    .line 471
    return-object v0

    .line 472
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 473
    .line 474
    .line 475
    move-result-wide v6

    .line 476
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 477
    .line 478
    invoke-static {v0}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v6, v7, v0}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v12

    .line 486
    const-string v0, "yyyyMMdd"

    .line 487
    .line 488
    invoke-static {v0}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v6, v7, v0}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v23

    .line 496
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v24

    .line 500
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 501
    .line 502
    invoke-static {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->h(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    sget-object v19, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 507
    .line 508
    sget-object v20, Lcom/friday/common/entity/OssFileType$Folder;->INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;

    .line 509
    .line 510
    sget-object v22, Lcom/friday/common/entity/OssFileResource$Resource;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Resource;

    .line 511
    .line 512
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    const/16 v27, 0x2

    .line 519
    .line 520
    const/16 v28, 0x0

    .line 521
    .line 522
    const/16 v21, 0x0

    .line 523
    .line 524
    move-wide/from16 v25, v6

    .line 525
    .line 526
    invoke-static/range {v19 .. v28}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    .line 527
    .line 528
    .line 529
    move-result-object v8

    .line 530
    move-object/from16 v10, v24

    .line 531
    .line 532
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 533
    .line 534
    :try_start_1
    sget-object v11, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 535
    .line 536
    invoke-static {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->f(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Ld2/i;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v8}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    iput-object v2, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 545
    .line 546
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 547
    .line 548
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 549
    .line 550
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v14

    .line 554
    iput-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 555
    .line 556
    iput-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 561
    .line 562
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    iput v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->q:I

    .line 566
    .line 567
    move/from16 v14, v16

    .line 568
    .line 569
    iput v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 570
    .line 571
    invoke-interface {v0, v11, v1}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 575
    if-ne v0, v3, :cond_1

    .line 576
    .line 577
    goto/16 :goto_a

    .line 578
    .line 579
    :cond_1
    move-object/from16 v11, v23

    .line 580
    .line 581
    :goto_0
    :try_start_2
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 582
    .line 583
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    .line 584
    .line 585
    .line 586
    move-result v14

    .line 587
    if-eqz v14, :cond_2

    .line 588
    .line 589
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    goto :goto_1

    .line 594
    :cond_2
    const/4 v0, 0x0

    .line 595
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 599
    :goto_2
    move-object v14, v8

    .line 600
    move-object v8, v0

    .line 601
    move-object v0, v10

    .line 602
    move-object v10, v9

    .line 603
    move-object v9, v14

    .line 604
    move-object v14, v13

    .line 605
    goto :goto_4

    .line 606
    :catchall_1
    move-exception v0

    .line 607
    move-object/from16 v11, v23

    .line 608
    .line 609
    :goto_3
    sget-object v14, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 610
    .line 611
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    goto :goto_2

    .line 620
    :goto_4
    invoke-static {v8}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v13

    .line 624
    if-eqz v13, :cond_3

    .line 625
    .line 626
    const/4 v8, 0x0

    .line 627
    :cond_3
    check-cast v8, Lcom/friday/common/entity/OssTokenResponse;

    .line 628
    .line 629
    if-nez v8, :cond_4

    .line 630
    .line 631
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 632
    .line 633
    const-string v2, "ossToken\u83b7\u53d6\u5931\u8d25"

    .line 634
    .line 635
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    invoke-static/range {v17 .. v17}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 656
    .line 657
    return-object v0

    .line 658
    :cond_4
    new-instance v13, Lcom/friday/common/helper/OssUploadHelper;

    .line 659
    .line 660
    invoke-direct {v13, v8}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 661
    .line 662
    .line 663
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    move-object/from16 p1, v8

    .line 668
    .line 669
    new-instance v8, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;

    .line 670
    .line 671
    move-object/from16 v19, v11

    .line 672
    .line 673
    const/4 v11, 0x0

    .line 674
    invoke-direct {v8, v10, v0, v14, v11}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$zipFilePath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lvc/c;)V

    .line 675
    .line 676
    .line 677
    iput-object v2, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 678
    .line 679
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v11

    .line 683
    iput-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 684
    .line 685
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 686
    .line 687
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v11

    .line 691
    iput-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 692
    .line 693
    iput-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 694
    .line 695
    iput-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 696
    .line 697
    iput-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 698
    .line 699
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v11

    .line 703
    iput-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 704
    .line 705
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 706
    .line 707
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 708
    .line 709
    const/4 v11, 0x2

    .line 710
    iput v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 711
    .line 712
    invoke-static {v15, v8, v1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v8

    .line 716
    if-ne v8, v3, :cond_5

    .line 717
    .line 718
    goto/16 :goto_a

    .line 719
    .line 720
    :cond_5
    move-object v11, v13

    .line 721
    move-object v13, v0

    .line 722
    move-object v0, v11

    .line 723
    move-object v11, v10

    .line 724
    move-object v15, v12

    .line 725
    move-object/from16 v12, v19

    .line 726
    .line 727
    move-object v10, v9

    .line 728
    move-object/from16 v9, p1

    .line 729
    .line 730
    :goto_5
    check-cast v8, Ljava/lang/String;

    .line 731
    .line 732
    if-nez v8, :cond_6

    .line 733
    .line 734
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 735
    .line 736
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->o()Landroidx/lifecycle/MutableLiveData;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    const/16 v16, 0x1

    .line 741
    .line 742
    invoke-static/range {v16 .. v16}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 750
    .line 751
    return-object v0

    .line 752
    :cond_6
    move-object/from16 p1, v9

    .line 753
    .line 754
    invoke-virtual {v10}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v9

    .line 758
    move-object/from16 v19, v12

    .line 759
    .line 760
    new-instance v12, Ljava/lang/StringBuilder;

    .line 761
    .line 762
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v9

    .line 781
    iput-object v2, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 782
    .line 783
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v12

    .line 787
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 788
    .line 789
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 790
    .line 791
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v12

    .line 795
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 796
    .line 797
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 798
    .line 799
    iput-object v11, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 800
    .line 801
    iput-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 802
    .line 803
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v12

    .line 807
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 808
    .line 809
    iput-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 810
    .line 811
    iput-object v8, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 812
    .line 813
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 814
    .line 815
    const/4 v12, 0x3

    .line 816
    iput v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 817
    .line 818
    invoke-virtual {v0, v8, v9, v1}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v9

    .line 822
    if-ne v9, v3, :cond_7

    .line 823
    .line 824
    goto/16 :goto_a

    .line 825
    .line 826
    :cond_7
    move-object v12, v10

    .line 827
    move-object v10, v0

    .line 828
    move-object v0, v14

    .line 829
    move-object v14, v13

    .line 830
    move-object v13, v11

    .line 831
    move-object/from16 v11, p1

    .line 832
    .line 833
    :goto_6
    check-cast v9, Ljava/lang/String;

    .line 834
    .line 835
    move-object/from16 p1, v0

    .line 836
    .line 837
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    move-object/from16 v20, v11

    .line 842
    .line 843
    new-instance v11, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;

    .line 844
    .line 845
    move-object/from16 v21, v4

    .line 846
    .line 847
    const/4 v4, 0x0

    .line 848
    invoke-direct {v11, v13, v14, v8, v4}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1$thumbnailPath$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 849
    .line 850
    .line 851
    iput-object v2, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 852
    .line 853
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    iput-object v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 858
    .line 859
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 860
    .line 861
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    iput-object v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 866
    .line 867
    iput-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 868
    .line 869
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 870
    .line 871
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 872
    .line 873
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    iput-object v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 878
    .line 879
    iput-object v10, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 880
    .line 881
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    iput-object v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 886
    .line 887
    iput-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 888
    .line 889
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 890
    .line 891
    const/4 v4, 0x4

    .line 892
    iput v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 893
    .line 894
    invoke-static {v0, v11, v1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    if-ne v0, v3, :cond_8

    .line 899
    .line 900
    goto/16 :goto_a

    .line 901
    .line 902
    :cond_8
    move-object/from16 v4, p1

    .line 903
    .line 904
    move-object v11, v12

    .line 905
    move-object v12, v13

    .line 906
    :goto_7
    check-cast v0, Ljava/lang/String;

    .line 907
    .line 908
    if-nez v0, :cond_9

    .line 909
    .line 910
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 911
    .line 912
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    const/16 v17, 0x0

    .line 917
    .line 918
    invoke-static/range {v17 .. v17}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 926
    .line 927
    return-object v0

    .line 928
    :cond_9
    invoke-virtual {v11}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v13

    .line 932
    move-object/from16 v18, v2

    .line 933
    .line 934
    new-instance v2, Ljava/lang/StringBuilder;

    .line 935
    .line 936
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 946
    .line 947
    .line 948
    const-string v13, ".jpg"

    .line 949
    .line 950
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v13

    .line 961
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 962
    .line 963
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v13

    .line 967
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 968
    .line 969
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 970
    .line 971
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v13

    .line 975
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 976
    .line 977
    iput-object v14, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 978
    .line 979
    iput-object v12, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 980
    .line 981
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v13

    .line 985
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 986
    .line 987
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v13

    .line 991
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 992
    .line 993
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v13

    .line 997
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 998
    .line 999
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v13

    .line 1003
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 1004
    .line 1005
    iput-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 1006
    .line 1007
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v13

    .line 1011
    iput-object v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 1012
    .line 1013
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 1014
    .line 1015
    const/4 v13, 0x5

    .line 1016
    iput v13, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 1017
    .line 1018
    invoke-virtual {v10, v0, v2, v1}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    if-ne v2, v3, :cond_a

    .line 1023
    .line 1024
    goto/16 :goto_a

    .line 1025
    .line 1026
    :cond_a
    move-object v2, v0

    .line 1027
    move-object v0, v4

    .line 1028
    move-object/from16 v27, v9

    .line 1029
    .line 1030
    move-object v13, v11

    .line 1031
    move-object v4, v12

    .line 1032
    move-object/from16 v31, v15

    .line 1033
    .line 1034
    move-object/from16 v12, v20

    .line 1035
    .line 1036
    move-object v11, v10

    .line 1037
    move-object v10, v8

    .line 1038
    move-object/from16 v8, v19

    .line 1039
    .line 1040
    :goto_8
    invoke-static {v14}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    sget-object v9, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 1044
    .line 1045
    invoke-virtual {v9}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v9

    .line 1049
    invoke-virtual {v9}, Lcom/friday/common/helper/b;->t()J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v24

    .line 1053
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 1054
    .line 1055
    invoke-virtual {v9}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->s()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v26

    .line 1059
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v28

    .line 1077
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->u:Lcom/friday/common/entity/NoteBean;

    .line 1078
    .line 1079
    invoke-virtual {v9}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v30

    .line 1083
    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    move-object/from16 v5, v21

    .line 1104
    .line 1105
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v5

    .line 1112
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v39

    .line 1116
    new-instance v22, Lcom/friday/common/entity/FileEntity;

    .line 1117
    .line 1118
    const v44, 0x66000

    .line 1119
    .line 1120
    .line 1121
    const/16 v45, 0x0

    .line 1122
    .line 1123
    const-string v29, "11"

    .line 1124
    .line 1125
    const/16 v33, 0x1

    .line 1126
    .line 1127
    const/16 v34, 0x0

    .line 1128
    .line 1129
    const/16 v35, 0x0

    .line 1130
    .line 1131
    const/16 v36, 0x0

    .line 1132
    .line 1133
    const/16 v37, 0x0

    .line 1134
    .line 1135
    const/16 v38, 0x0

    .line 1136
    .line 1137
    const/16 v40, 0x1

    .line 1138
    .line 1139
    const-wide/16 v41, 0x0

    .line 1140
    .line 1141
    const/16 v43, 0x0

    .line 1142
    .line 1143
    move-object/from16 v32, v31

    .line 1144
    .line 1145
    move-object/from16 v23, v14

    .line 1146
    .line 1147
    invoke-direct/range {v22 .. v45}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 1148
    .line 1149
    .line 1150
    move-object/from16 v5, v22

    .line 1151
    .line 1152
    iget-object v9, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 1153
    .line 1154
    invoke-static {v9}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->i(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lpa/a;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v9

    .line 1158
    new-instance v32, Lcom/friday/common/entity/UpdateRequest;

    .line 1159
    .line 1160
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v33

    .line 1164
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v34

    .line 1168
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v35

    .line 1172
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v36

    .line 1176
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v37

    .line 1180
    invoke-direct/range {v32 .. v37}, Lcom/friday/common/entity/UpdateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    move-object/from16 v14, v32

    .line 1184
    .line 1185
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v15

    .line 1189
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 1190
    .line 1191
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v15

    .line 1195
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 1196
    .line 1197
    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v15

    .line 1201
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 1202
    .line 1203
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v15

    .line 1207
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 1208
    .line 1209
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v15

    .line 1213
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 1214
    .line 1215
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v15

    .line 1219
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 1220
    .line 1221
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v15

    .line 1225
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 1226
    .line 1227
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v15

    .line 1231
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 1232
    .line 1233
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v15

    .line 1237
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 1238
    .line 1239
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v15

    .line 1243
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 1244
    .line 1245
    invoke-static/range {v27 .. v27}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v15

    .line 1249
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 1250
    .line 1251
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v15

    .line 1255
    iput-object v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 1256
    .line 1257
    iput-object v5, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->n:Ljava/lang/Object;

    .line 1258
    .line 1259
    iput-wide v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 1260
    .line 1261
    const/4 v15, 0x6

    .line 1262
    iput v15, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 1263
    .line 1264
    invoke-interface {v9, v14, v1}, Lpa/a;->c(Lcom/friday/common/entity/UpdateRequest;Lvc/c;)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v9

    .line 1268
    if-ne v9, v3, :cond_b

    .line 1269
    .line 1270
    goto/16 :goto_a

    .line 1271
    .line 1272
    :cond_b
    move-object v14, v4

    .line 1273
    move-object/from16 v19, v5

    .line 1274
    .line 1275
    move-wide v4, v6

    .line 1276
    move-object/from16 v15, v23

    .line 1277
    .line 1278
    move-object/from16 v7, v31

    .line 1279
    .line 1280
    move-object v6, v2

    .line 1281
    move-object/from16 v2, v27

    .line 1282
    .line 1283
    :goto_9
    check-cast v9, Lcom/friday/common/property/BaseResponse;

    .line 1284
    .line 1285
    invoke-virtual {v9}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 1286
    .line 1287
    .line 1288
    move-result v20

    .line 1289
    if-nez v20, :cond_d

    .line 1290
    .line 1291
    move-object/from16 p1, v0

    .line 1292
    .line 1293
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 1294
    .line 1295
    invoke-static {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->g(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    const v41, 0x7f9ff

    .line 1300
    .line 1301
    .line 1302
    const/16 v42, 0x0

    .line 1303
    .line 1304
    const/16 v20, 0x0

    .line 1305
    .line 1306
    const-wide/16 v21, 0x0

    .line 1307
    .line 1308
    const/16 v23, 0x0

    .line 1309
    .line 1310
    const/16 v24, 0x0

    .line 1311
    .line 1312
    const/16 v25, 0x0

    .line 1313
    .line 1314
    const/16 v26, 0x0

    .line 1315
    .line 1316
    const/16 v27, 0x0

    .line 1317
    .line 1318
    const/16 v28, 0x0

    .line 1319
    .line 1320
    const/16 v29, 0x0

    .line 1321
    .line 1322
    const/16 v30, 0x0

    .line 1323
    .line 1324
    const/16 v31, 0x1

    .line 1325
    .line 1326
    const/16 v32, 0x0

    .line 1327
    .line 1328
    const/16 v33, 0x0

    .line 1329
    .line 1330
    const/16 v34, 0x0

    .line 1331
    .line 1332
    const/16 v35, 0x0

    .line 1333
    .line 1334
    const/16 v36, 0x0

    .line 1335
    .line 1336
    const/16 v37, 0x0

    .line 1337
    .line 1338
    const-wide/16 v38, 0x0

    .line 1339
    .line 1340
    const/16 v40, 0x0

    .line 1341
    .line 1342
    move-object/from16 v43, v2

    .line 1343
    .line 1344
    invoke-static/range {v19 .. v42}, Lcom/friday/common/entity/FileEntity;->copy$default(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILjava/lang/Object;)Lcom/friday/common/entity/FileEntity;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v2

    .line 1348
    move-object/from16 v20, v6

    .line 1349
    .line 1350
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v6

    .line 1354
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->s:Ljava/lang/Object;

    .line 1355
    .line 1356
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v6

    .line 1360
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->c:Ljava/lang/Object;

    .line 1361
    .line 1362
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v6

    .line 1366
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->d:Ljava/lang/Object;

    .line 1367
    .line 1368
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v6

    .line 1372
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->e:Ljava/lang/Object;

    .line 1373
    .line 1374
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v6

    .line 1378
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->f:Ljava/lang/Object;

    .line 1379
    .line 1380
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v6

    .line 1384
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->g:Ljava/lang/Object;

    .line 1385
    .line 1386
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v6

    .line 1390
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->h:Ljava/lang/Object;

    .line 1391
    .line 1392
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v6

    .line 1396
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->i:Ljava/lang/Object;

    .line 1397
    .line 1398
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v6

    .line 1402
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->j:Ljava/lang/Object;

    .line 1403
    .line 1404
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v6

    .line 1408
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->k:Ljava/lang/Object;

    .line 1409
    .line 1410
    invoke-static/range {v43 .. v43}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v6

    .line 1414
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->l:Ljava/lang/Object;

    .line 1415
    .line 1416
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v6

    .line 1420
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->m:Ljava/lang/Object;

    .line 1421
    .line 1422
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v6

    .line 1426
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->n:Ljava/lang/Object;

    .line 1427
    .line 1428
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v6

    .line 1432
    iput-object v6, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->o:Ljava/lang/Object;

    .line 1433
    .line 1434
    iput-wide v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->p:J

    .line 1435
    .line 1436
    const/4 v4, 0x7

    .line 1437
    iput v4, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->r:I

    .line 1438
    .line 1439
    invoke-interface {v0, v2, v1}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    if-ne v0, v3, :cond_c

    .line 1444
    .line 1445
    :goto_a
    return-object v3

    .line 1446
    :cond_c
    :goto_b
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 1447
    .line 1448
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    const/16 v16, 0x1

    .line 1453
    .line 1454
    invoke-static/range {v16 .. v16}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 1459
    .line 1460
    .line 1461
    goto :goto_c

    .line 1462
    :cond_d
    iget-object v0, v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;->t:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 1463
    .line 1464
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    const/16 v17, 0x0

    .line 1469
    .line 1470
    invoke-static/range {v17 .. v17}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v2

    .line 1474
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 1475
    .line 1476
    .line 1477
    :goto_c
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 1478
    .line 1479
    return-object v0

    .line 1480
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
