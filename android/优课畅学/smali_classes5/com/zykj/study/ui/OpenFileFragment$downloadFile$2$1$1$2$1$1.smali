# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.OpenFileFragment$downloadFile$2$1$1$2$1$1"
    f = "OpenFileFragment.kt"
    l = {
        0x98,
        0xb5,
        0xb8,
        0xbb
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:I

.field public j:I

.field public k:I

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lcom/zykj/study/ui/OpenFileFragment;

.field public final synthetic n:Landroidx/work/WorkInfo;

.field public final synthetic o:Landroid/content/DialogInterface;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->l:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->n:Landroidx/work/WorkInfo;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->o:Landroid/content/DialogInterface;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->n:Landroidx/work/WorkInfo;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->o:Landroid/content/DialogInterface;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->k:I

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v6, :cond_3

    .line 18
    .line 19
    if-eq v0, v5, :cond_2

    .line 20
    .line 21
    if-eq v0, v4, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Li9/d0;

    .line 28
    .line 29
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Li9/a0;

    .line 32
    .line 33
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/google/gson/JsonSyntaxException;

    .line 53
    .line 54
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v4, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Li9/d0;

    .line 65
    .line 66
    iget-object v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Li9/a0;

    .line 69
    .line 70
    iget-object v6, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_2
    iget v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->i:I

    .line 80
    .line 81
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/zykj/study/bean/ConvertEntity;

    .line 84
    .line 85
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->g:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v6, v0

    .line 88
    check-cast v6, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->f:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v9, v0

    .line 93
    check-cast v9, Landroid/content/DialogInterface;

    .line 94
    .line 95
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->e:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v10, v0

    .line 98
    check-cast v10, Landroidx/work/WorkInfo;

    .line 99
    .line 100
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->d:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v11, v0

    .line 103
    check-cast v11, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v12, v0

    .line 108
    check-cast v12, Li9/d0;

    .line 109
    .line 110
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v13, v0

    .line 113
    check-cast v13, Li9/a0;

    .line 114
    .line 115
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v14, v0

    .line 118
    check-cast v14, Ljava/lang/String;

    .line 119
    .line 120
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :catch_0
    move-exception v0

    .line 126
    move-object/from16 v16, v9

    .line 127
    .line 128
    move v9, v5

    .line 129
    move-object v5, v13

    .line 130
    move-object v13, v10

    .line 131
    move-object v10, v6

    .line 132
    move-object v6, v11

    .line 133
    move-object/from16 v11, v16

    .line 134
    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :cond_3
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lcom/zykj/study/ui/OpenFileFragment;

    .line 140
    .line 141
    iget-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v9, Ljava/lang/Integer;

    .line 144
    .line 145
    iget-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v9, Ljava/lang/String;

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->l:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v9, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v10, "http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl="

    .line 164
    .line 165
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 176
    .line 177
    invoke-static {v0}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/lang/Integer;

    .line 186
    .line 187
    if-eqz v0, :cond_6

    .line 188
    .line 189
    iget-object v10, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->n:Landroidx/work/WorkInfo;

    .line 190
    .line 191
    iget-object v11, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->o:Landroid/content/DialogInterface;

    .line 192
    .line 193
    iget-object v12, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    if-lt v13, v5, :cond_6

    .line 200
    .line 201
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iput-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v12, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 209
    .line 210
    iput v13, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->i:I

    .line 211
    .line 212
    iput v7, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->j:I

    .line 213
    .line 214
    iput v6, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->k:I

    .line 215
    .line 216
    invoke-static {v10, v11, v1}, Lcom/zykj/study/ui/OpenFileFragment;->l(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-ne v0, v2, :cond_5

    .line 221
    .line 222
    goto/16 :goto_6

    .line 223
    .line 224
    :cond_5
    move-object v0, v12

    .line 225
    :goto_0
    invoke-static {v0}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v7}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :cond_6
    move-object v14, v9

    .line 237
    new-instance v0, Li9/a0$a;

    .line 238
    .line 239
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 247
    .line 248
    invoke-static {v0}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_7

    .line 257
    .line 258
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 259
    .line 260
    invoke-static {v0}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iget-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 265
    .line 266
    invoke-static {v9}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-virtual {v9, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    check-cast v9, Ljava/lang/Number;

    .line 278
    .line 279
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    add-int/2addr v9, v6

    .line 284
    invoke-static {v9}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    invoke-interface {v0, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_7
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 293
    .line 294
    invoke-static {v0}, Lcom/zykj/study/ui/OpenFileFragment;->m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v7}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-interface {v0, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :goto_1
    new-instance v0, Li9/b0$a;

    .line 306
    .line 307
    invoke-direct {v0}, Li9/b0$a;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Li9/b0$a;->g()Li9/b0$a;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0, v14}, Li9/b0$a;->v(Ljava/lang/String;)Li9/b0$a;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Li9/b0$a;->b()Li9/b0;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v13, v0}, Li9/a0;->a(Li9/b0;)Li9/e;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-interface {v0}, Li9/e;->execute()Li9/d0;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-virtual {v12}, Li9/d0;->b()Li9/e0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-eqz v0, :cond_b

    .line 335
    .line 336
    invoke-virtual {v0}, Li9/e0;->string()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    if-eqz v6, :cond_b

    .line 341
    .line 342
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->m:Lcom/zykj/study/ui/OpenFileFragment;

    .line 343
    .line 344
    iget-object v10, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->n:Landroidx/work/WorkInfo;

    .line 345
    .line 346
    iget-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->o:Landroid/content/DialogInterface;

    .line 347
    .line 348
    :try_start_1
    new-instance v11, Lcom/google/gson/Gson;

    .line 349
    .line 350
    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    .line 351
    .line 352
    .line 353
    const-class v15, Lcom/zykj/study/bean/ConvertEntity;

    .line 354
    .line 355
    invoke-virtual {v11, v6, v15}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    check-cast v11, Lcom/zykj/study/bean/ConvertEntity;

    .line 360
    .line 361
    invoke-virtual {v11}, Lcom/zykj/study/bean/ConvertEntity;->getSuccess()Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-eqz v15, :cond_8

    .line 366
    .line 367
    invoke-virtual {v11}, Lcom/zykj/study/bean/ConvertEntity;->getData()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-static {v0, v5}, Lcom/zykj/study/ui/OpenFileFragment;->k(Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_5

    .line 375
    .line 376
    :catch_1
    move-exception v0

    .line 377
    move-object v11, v9

    .line 378
    move-object v5, v13

    .line 379
    move v9, v7

    .line 380
    move-object v13, v10

    .line 381
    move-object v10, v6

    .line 382
    goto :goto_3

    .line 383
    :cond_8
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v14}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 391
    .line 392
    invoke-static {v13}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 397
    .line 398
    invoke-static {v12}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 403
    .line 404
    iput-object v6, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->d:Ljava/lang/Object;

    .line 405
    .line 406
    iput-object v10, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->e:Ljava/lang/Object;

    .line 407
    .line 408
    iput-object v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->f:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->g:Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static {v11}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->h:Ljava/lang/Object;

    .line 421
    .line 422
    iput v7, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->i:I

    .line 423
    .line 424
    iput v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->k:I

    .line 425
    .line 426
    invoke-static {v10, v9, v1}, Lcom/zykj/study/ui/OpenFileFragment;->l(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 430
    if-ne v0, v2, :cond_9

    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_9
    move-object v11, v6

    .line 435
    :goto_2
    move-object v6, v11

    .line 436
    goto :goto_5

    .line 437
    :goto_3
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v14}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v15

    .line 444
    iput-object v15, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 445
    .line 446
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v15

    .line 450
    iput-object v15, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 451
    .line 452
    invoke-static {v12}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v15

    .line 456
    iput-object v15, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v6, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->d:Ljava/lang/Object;

    .line 459
    .line 460
    invoke-static {v10}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    iput-object v10, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->e:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iput-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->f:Ljava/lang/Object;

    .line 471
    .line 472
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->g:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->h:Ljava/lang/Object;

    .line 475
    .line 476
    iput v9, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->i:I

    .line 477
    .line 478
    iput v4, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->k:I

    .line 479
    .line 480
    invoke-static {v13, v11, v1}, Lcom/zykj/study/ui/OpenFileFragment;->l(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    if-ne v0, v2, :cond_a

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_a
    move-object v0, v6

    .line 488
    move-object v4, v12

    .line 489
    move-object v6, v14

    .line 490
    :goto_4
    move-object v12, v4

    .line 491
    move-object v13, v5

    .line 492
    move-object v14, v6

    .line 493
    move-object v6, v0

    .line 494
    :goto_5
    if-nez v6, :cond_d

    .line 495
    .line 496
    :cond_b
    iget-object v0, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->n:Landroidx/work/WorkInfo;

    .line 497
    .line 498
    iget-object v4, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->o:Landroid/content/DialogInterface;

    .line 499
    .line 500
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    invoke-static {v14}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    iput-object v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->a:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-static {v13}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    iput-object v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->b:Ljava/lang/Object;

    .line 514
    .line 515
    invoke-static {v12}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iput-object v5, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->c:Ljava/lang/Object;

    .line 520
    .line 521
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->d:Ljava/lang/Object;

    .line 522
    .line 523
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->e:Ljava/lang/Object;

    .line 524
    .line 525
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->f:Ljava/lang/Object;

    .line 526
    .line 527
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->g:Ljava/lang/Object;

    .line 528
    .line 529
    iput-object v8, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->h:Ljava/lang/Object;

    .line 530
    .line 531
    iput v7, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->i:I

    .line 532
    .line 533
    iput v3, v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2$1$1;->k:I

    .line 534
    .line 535
    invoke-static {v0, v4, v1}, Lcom/zykj/study/ui/OpenFileFragment;->l(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    if-ne v0, v2, :cond_c

    .line 540
    .line 541
    :goto_6
    return-object v2

    .line 542
    :cond_c
    :goto_7
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 543
    .line 544
    :cond_d
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 545
    .line 546
    return-object v0
.end method
