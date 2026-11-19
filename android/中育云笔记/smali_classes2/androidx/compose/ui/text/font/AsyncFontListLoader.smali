.class public final Landroidx/compose/ui/text/font/AsyncFontListLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final asyncTypefaceCache:Landroidx/compose/ui/text/font/AsyncTypefaceCache;

.field private cacheable:Z

.field private final fontList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/font/Font;",
            ">;"
        }
    .end annotation
.end field

.field private final onCompletion:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final platformFontLoader:Landroidx/compose/ui/text/font/PlatformFontLoader;

.field private final typefaceRequest:Landroidx/compose/ui/text/font/TypefaceRequest;

.field private final value$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lhd/l;Landroidx/compose/ui/text/font/PlatformFontLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/font/Font;",
            ">;",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/text/font/TypefaceRequest;",
            "Landroidx/compose/ui/text/font/AsyncTypefaceCache;",
            "Lhd/l;",
            "Landroidx/compose/ui/text/font/PlatformFontLoader;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->fontList:Ljava/util/List;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->typefaceRequest:Landroidx/compose/ui/text/font/TypefaceRequest;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->asyncTypefaceCache:Landroidx/compose/ui/text/font/AsyncTypefaceCache;

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->onCompletion:Lhd/l;

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->platformFontLoader:Landroidx/compose/ui/text/font/PlatformFontLoader;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p3, 0x2

    .line 16
    invoke-static {p2, p1, p3, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic access$getPlatformFontLoader$p(Landroidx/compose/ui/text/font/AsyncFontListLoader;)Landroidx/compose/ui/text/font/PlatformFontLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->platformFontLoader:Landroidx/compose/ui/text/font/PlatformFontLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method private setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getCacheable$ui_text_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 2
    .line 3
    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final load(Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->label:I

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
    iput v3, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;-><init>(Landroidx/compose/ui/text/font/AsyncFontListLoader;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    if-eq v4, v7, :cond_2

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    iget v4, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$1:I

    .line 48
    .line 49
    iget v9, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$0:I

    .line 50
    .line 51
    iget-object v10, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/util/List;

    .line 54
    .line 55
    iget-object v11, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v11, Landroidx/compose/ui/text/font/AsyncFontListLoader;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    iget v4, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$1:I

    .line 76
    .line 77
    iget v9, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$0:I

    .line 78
    .line 79
    iget-object v10, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Landroidx/compose/ui/text/font/Font;

    .line 82
    .line 83
    iget-object v11, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/util/List;

    .line 86
    .line 87
    iget-object v12, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;

    .line 90
    .line 91
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    move-object/from16 v16, v11

    .line 95
    .line 96
    move-object v11, v10

    .line 97
    move-object/from16 v10, v16

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    move-object v11, v12

    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :try_start_2
    iget-object v0, v1, Landroidx/compose/ui/text/font/AsyncFontListLoader;->fontList:Ljava/util/List;

    .line 108
    .line 109
    move-object v4, v0

    .line 110
    check-cast v4, Ljava/util/Collection;

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 116
    move-object v14, v2

    .line 117
    move v15, v8

    .line 118
    move-object v2, v1

    .line 119
    :goto_1
    if-ge v15, v4, :cond_8

    .line 120
    .line 121
    :try_start_3
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    move-object v10, v9

    .line 126
    check-cast v10, Landroidx/compose/ui/text/font/Font;

    .line 127
    .line 128
    invoke-interface {v10}, Landroidx/compose/ui/text/font/Font;->getLoadingStrategy-PKNRLFQ()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    sget-object v11, Landroidx/compose/ui/text/font/FontLoadingStrategy;->Companion:Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;

    .line 133
    .line 134
    invoke-virtual {v11}, Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;->getAsync-PKNRLFQ()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    invoke-static {v9, v11}, Landroidx/compose/ui/text/font/FontLoadingStrategy;->equals-impl0(II)Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-eqz v9, :cond_7

    .line 143
    .line 144
    iget-object v9, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader;->asyncTypefaceCache:Landroidx/compose/ui/text/font/AsyncTypefaceCache;

    .line 145
    .line 146
    iget-object v11, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader;->platformFontLoader:Landroidx/compose/ui/text/font/PlatformFontLoader;

    .line 147
    .line 148
    new-instance v13, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1;

    .line 149
    .line 150
    invoke-direct {v13, v2, v10, v5}, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$2$typeface$1;-><init>(Landroidx/compose/ui/text/font/AsyncFontListLoader;Landroidx/compose/ui/text/font/Font;Lvc/c;)V

    .line 151
    .line 152
    .line 153
    iput-object v2, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v0, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v10, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$2:Ljava/lang/Object;

    .line 158
    .line 159
    iput v15, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$0:I

    .line 160
    .line 161
    iput v4, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$1:I

    .line 162
    .line 163
    iput v7, v14, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->label:I

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    invoke-virtual/range {v9 .. v14}, Landroidx/compose/ui/text/font/AsyncTypefaceCache;->runCached(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    if-ne v9, v3, :cond_4

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_4
    move-object v12, v2

    .line 174
    move-object v11, v10

    .line 175
    move-object v2, v14

    .line 176
    move-object v10, v0

    .line 177
    move-object v0, v9

    .line 178
    move v9, v15

    .line 179
    :goto_2
    if-eqz v0, :cond_5

    .line 180
    .line 181
    :try_start_4
    iget-object v3, v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;->typefaceRequest:Landroidx/compose/ui/text/font/TypefaceRequest;

    .line 182
    .line 183
    invoke-virtual {v3}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontSynthesis-GVVA2EU()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    iget-object v4, v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;->typefaceRequest:Landroidx/compose/ui/text/font/TypefaceRequest;

    .line 188
    .line 189
    invoke-virtual {v4}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontWeight()Landroidx/compose/ui/text/font/FontWeight;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    iget-object v5, v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;->typefaceRequest:Landroidx/compose/ui/text/font/TypefaceRequest;

    .line 194
    .line 195
    invoke-virtual {v5}, Landroidx/compose/ui/text/font/TypefaceRequest;->getFontStyle-_-LCdwA()I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-static {v3, v0, v11, v4, v5}, Landroidx/compose/ui/text/font/FontSynthesis_androidKt;->synthesizeTypeface-FxwP2eA(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-direct {v12, v0}, Landroidx/compose/ui/text/font/AsyncFontListLoader;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 207
    .line 208
    invoke-interface {v2}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2}, Lsd/o1;->n(Lkotlin/coroutines/d;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    iput-boolean v8, v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 217
    .line 218
    iget-object v3, v12, Landroidx/compose/ui/text/font/AsyncFontListLoader;->onCompletion:Lhd/l;

    .line 219
    .line 220
    new-instance v4, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;

    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/text/font/AsyncFontListLoader;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-direct {v4, v5, v2}, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;-><init>(Ljava/lang/Object;Z)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_5
    :try_start_5
    iput-object v12, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$0:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v10, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$1:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v5, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->L$2:Ljava/lang/Object;

    .line 238
    .line 239
    iput v9, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$0:I

    .line 240
    .line 241
    iput v4, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->I$1:I

    .line 242
    .line 243
    iput v6, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader$load$1;->label:I

    .line 244
    .line 245
    invoke-static {v2}, Lsd/p2;->a(Lvc/c;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 249
    if-ne v0, v3, :cond_6

    .line 250
    .line 251
    :goto_3
    return-object v3

    .line 252
    :cond_6
    move-object v11, v12

    .line 253
    :goto_4
    move-object v14, v2

    .line 254
    move v15, v9

    .line 255
    move-object v0, v10

    .line 256
    move-object v2, v11

    .line 257
    goto :goto_5

    .line 258
    :catchall_2
    move-exception v0

    .line 259
    move-object v11, v2

    .line 260
    move-object v2, v14

    .line 261
    goto :goto_6

    .line 262
    :cond_7
    :goto_5
    add-int/2addr v15, v7

    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :cond_8
    invoke-interface {v14}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-static {v0}, Lsd/o1;->n(Lkotlin/coroutines/d;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    iput-boolean v8, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 274
    .line 275
    iget-object v3, v2, Landroidx/compose/ui/text/font/AsyncFontListLoader;->onCompletion:Lhd/l;

    .line 276
    .line 277
    new-instance v4, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;

    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/text/font/AsyncFontListLoader;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-direct {v4, v2, v0}, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;-><init>(Ljava/lang/Object;Z)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v3, v4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 290
    .line 291
    return-object v0

    .line 292
    :catchall_3
    move-exception v0

    .line 293
    move-object v11, v1

    .line 294
    :goto_6
    invoke-interface {v2}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-static {v2}, Lsd/o1;->n(Lkotlin/coroutines/d;)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    iput-boolean v8, v11, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 303
    .line 304
    iget-object v3, v11, Landroidx/compose/ui/text/font/AsyncFontListLoader;->onCompletion:Lhd/l;

    .line 305
    .line 306
    new-instance v4, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;

    .line 307
    .line 308
    invoke-virtual {v11}, Landroidx/compose/ui/text/font/AsyncFontListLoader;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-direct {v4, v5, v2}, Landroidx/compose/ui/text/font/TypefaceResult$Immutable;-><init>(Ljava/lang/Object;Z)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v3, v4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    throw v0
.end method

.method public final loadWithTimeoutOrNull$ui_text_release(Landroidx/compose/ui/text/font/Font;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/font/Font;",
            "Lvc/c<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;-><init>(Landroidx/compose/ui/text/font/AsyncFontListLoader;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Landroidx/compose/ui/text/font/Font;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :catch_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :catch_1
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    new-instance p2, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$2;

    .line 63
    .line 64
    invoke-direct {p2, p0, p1, v4}, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$2;-><init>(Landroidx/compose/ui/text/font/AsyncFontListLoader;Landroidx/compose/ui/text/font/Font;Lvc/c;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v3, v0, Landroidx/compose/ui/text/font/AsyncFontListLoader$loadWithTimeoutOrNull$1;->label:I

    .line 70
    .line 71
    const-wide/16 v2, 0x3a98

    .line 72
    .line 73
    invoke-static {v2, v3, p2, v0}, Lkotlinx/coroutines/TimeoutKt;->e(JLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    return-object p1

    .line 81
    :goto_1
    invoke-interface {v0}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, Lsd/f0;->d0:Lsd/f0$a;

    .line 86
    .line 87
    invoke-interface {v1, v2}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lsd/f0;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-interface {v0}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v5, "Unable to load font "

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v2, p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v0, v2}, Lsd/f0;->handleException(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :goto_2
    invoke-interface {v0}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p2}, Lsd/o1;->n(Lkotlin/coroutines/d;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    :cond_4
    :goto_3
    return-object v4

    .line 136
    :cond_5
    throw p1
.end method

.method public final setCacheable$ui_text_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/text/font/AsyncFontListLoader;->cacheable:Z

    .line 2
    .line 3
    return-void
.end method
