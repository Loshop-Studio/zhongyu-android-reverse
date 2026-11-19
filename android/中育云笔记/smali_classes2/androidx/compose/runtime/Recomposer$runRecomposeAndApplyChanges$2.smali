.class final Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer;->runRecomposeAndApplyChanges(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2"
    f = "Recomposer.kt"
    l = {
        0x244,
        0x24f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/runtime/Recomposer;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/Recomposer;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Recomposer;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    .locals 0

    invoke-static/range {p0 .. p7}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;)V

    return-void
.end method

.method private static final invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Recomposer;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    monitor-enter v5

    .line 16
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    .line 17
    .line 18
    .line 19
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    .line 20
    .line 21
    .line 22
    move-object v6, v1

    .line 23
    check-cast v6, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    if-ge v8, v6, :cond_0

    .line 31
    .line 32
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    check-cast v9, Landroidx/compose/runtime/ControlledComposition;

    .line 37
    .line 38
    invoke-interface {v9}, Landroidx/compose/runtime/ControlledComposition;->abandonChanges()V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v9}, Landroidx/compose/runtime/Recomposer;->access$recordFailedCompositionLocked(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v8, v8, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v1, v2, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v6, v2, Landroidx/collection/ScatterSet;->metadata:[J

    .line 56
    .line 57
    array-length v8, v6

    .line 58
    add-int/lit8 v8, v8, -0x2

    .line 59
    .line 60
    const/16 v7, 0x8

    .line 61
    .line 62
    const-wide/16 p2, 0x80

    .line 63
    .line 64
    if-ltz v8, :cond_4

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const-wide/16 v16, 0xff

    .line 68
    .line 69
    :goto_1
    aget-wide v11, v6, v9

    .line 70
    .line 71
    const/4 v10, 0x7

    .line 72
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    not-long v13, v11

    .line 78
    shl-long/2addr v13, v10

    .line 79
    and-long/2addr v13, v11

    .line 80
    and-long v13, v13, v18

    .line 81
    .line 82
    cmp-long v13, v13, v18

    .line 83
    .line 84
    if-eqz v13, :cond_3

    .line 85
    .line 86
    sub-int v13, v9, v8

    .line 87
    .line 88
    not-int v13, v13

    .line 89
    ushr-int/lit8 v13, v13, 0x1f

    .line 90
    .line 91
    rsub-int/lit8 v13, v13, 0x8

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    :goto_2
    if-ge v14, v13, :cond_2

    .line 95
    .line 96
    and-long v20, v11, v16

    .line 97
    .line 98
    cmp-long v15, v20, p2

    .line 99
    .line 100
    if-gez v15, :cond_1

    .line 101
    .line 102
    shl-int/lit8 v15, v9, 0x3

    .line 103
    .line 104
    add-int/2addr v15, v14

    .line 105
    aget-object v15, v1, v15

    .line 106
    .line 107
    check-cast v15, Landroidx/compose/runtime/ControlledComposition;

    .line 108
    .line 109
    invoke-interface {v15}, Landroidx/compose/runtime/ControlledComposition;->abandonChanges()V

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v15}, Landroidx/compose/runtime/Recomposer;->access$recordFailedCompositionLocked(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    shr-long/2addr v11, v7

    .line 116
    add-int/lit8 v14, v14, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    if-ne v13, v7, :cond_5

    .line 120
    .line 121
    :cond_3
    if-eq v9, v8, :cond_5

    .line 122
    .line 123
    add-int/lit8 v9, v9, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const/4 v10, 0x7

    .line 127
    const-wide/16 v16, 0xff

    .line 128
    .line 129
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {v2}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 135
    .line 136
    .line 137
    iget-object v1, v3, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v2, v3, Landroidx/collection/ScatterSet;->metadata:[J

    .line 140
    .line 141
    array-length v6, v2

    .line 142
    add-int/lit8 v6, v6, -0x2

    .line 143
    .line 144
    if-ltz v6, :cond_9

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    :goto_3
    aget-wide v11, v2, v8

    .line 148
    .line 149
    not-long v13, v11

    .line 150
    shl-long/2addr v13, v10

    .line 151
    and-long/2addr v13, v11

    .line 152
    and-long v13, v13, v18

    .line 153
    .line 154
    cmp-long v9, v13, v18

    .line 155
    .line 156
    if-eqz v9, :cond_8

    .line 157
    .line 158
    sub-int v9, v8, v6

    .line 159
    .line 160
    not-int v9, v9

    .line 161
    ushr-int/lit8 v9, v9, 0x1f

    .line 162
    .line 163
    rsub-int/lit8 v9, v9, 0x8

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    :goto_4
    if-ge v13, v9, :cond_7

    .line 167
    .line 168
    and-long v14, v11, v16

    .line 169
    .line 170
    cmp-long v14, v14, p2

    .line 171
    .line 172
    if-gez v14, :cond_6

    .line 173
    .line 174
    shl-int/lit8 v14, v8, 0x3

    .line 175
    .line 176
    add-int/2addr v14, v13

    .line 177
    aget-object v14, v1, v14

    .line 178
    .line 179
    check-cast v14, Landroidx/compose/runtime/ControlledComposition;

    .line 180
    .line 181
    invoke-interface {v14}, Landroidx/compose/runtime/ControlledComposition;->changesApplied()V

    .line 182
    .line 183
    .line 184
    :cond_6
    shr-long/2addr v11, v7

    .line 185
    add-int/lit8 v13, v13, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    if-ne v9, v7, :cond_9

    .line 189
    .line 190
    :cond_8
    if-eq v8, v6, :cond_9

    .line 191
    .line 192
    add-int/lit8 v8, v8, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_9
    invoke-virtual {v3}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {p6 .. p6}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 199
    .line 200
    .line 201
    iget-object v1, v4, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 202
    .line 203
    iget-object v2, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 204
    .line 205
    array-length v3, v2

    .line 206
    add-int/lit8 v3, v3, -0x2

    .line 207
    .line 208
    if-ltz v3, :cond_d

    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    :goto_5
    aget-wide v8, v2, v6

    .line 212
    .line 213
    not-long v11, v8

    .line 214
    shl-long/2addr v11, v10

    .line 215
    and-long/2addr v11, v8

    .line 216
    and-long v11, v11, v18

    .line 217
    .line 218
    cmp-long v11, v11, v18

    .line 219
    .line 220
    if-eqz v11, :cond_c

    .line 221
    .line 222
    sub-int v11, v6, v3

    .line 223
    .line 224
    not-int v11, v11

    .line 225
    ushr-int/lit8 v11, v11, 0x1f

    .line 226
    .line 227
    rsub-int/lit8 v11, v11, 0x8

    .line 228
    .line 229
    const/4 v12, 0x0

    .line 230
    :goto_6
    if-ge v12, v11, :cond_b

    .line 231
    .line 232
    and-long v13, v8, v16

    .line 233
    .line 234
    cmp-long v13, v13, p2

    .line 235
    .line 236
    if-gez v13, :cond_a

    .line 237
    .line 238
    shl-int/lit8 v13, v6, 0x3

    .line 239
    .line 240
    add-int/2addr v13, v12

    .line 241
    aget-object v13, v1, v13

    .line 242
    .line 243
    check-cast v13, Landroidx/compose/runtime/ControlledComposition;

    .line 244
    .line 245
    invoke-interface {v13}, Landroidx/compose/runtime/ControlledComposition;->abandonChanges()V

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v13}, Landroidx/compose/runtime/Recomposer;->access$recordFailedCompositionLocked(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 249
    .line 250
    .line 251
    :cond_a
    shr-long/2addr v8, v7

    .line 252
    add-int/lit8 v12, v12, 0x1

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_b
    if-ne v11, v7, :cond_d

    .line 256
    .line 257
    :cond_c
    if-eq v6, v3, :cond_d

    .line 258
    .line 259
    add-int/lit8 v6, v6, 0x1

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_d
    invoke-virtual {v4}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 263
    .line 264
    .line 265
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    .line 267
    monitor-exit v5

    .line 268
    return-void

    .line 269
    :goto_7
    monitor-exit v5

    .line 270
    throw v0
.end method

.method private static final invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/compose/runtime/Recomposer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {p1}, Landroidx/compose/runtime/Recomposer;->access$getMovableContentAwaitingInsert$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroidx/compose/runtime/MovableContentStateReference;

    .line 28
    .line 29
    move-object v5, p0

    .line 30
    check-cast v5, Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {p1}, Landroidx/compose/runtime/Recomposer;->access$getMovableContentAwaitingInsert$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v0

    .line 52
    throw p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Landroidx/compose/runtime/MonotonicFrameClock;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invoke(Lsd/i0;Landroidx/compose/runtime/MonotonicFrameClock;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Landroidx/compose/runtime/MonotonicFrameClock;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance p1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-direct {p1, v0, p3}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;-><init>(Landroidx/compose/runtime/Recomposer;Lvc/c;)V

    iput-object p2, p1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Landroidx/collection/MutableScatterSet;

    .line 20
    .line 21
    iget-object v5, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Ljava/util/Set;

    .line 24
    .line 25
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Landroidx/collection/MutableScatterSet;

    .line 28
    .line 29
    iget-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, Landroidx/collection/MutableScatterSet;

    .line 32
    .line 33
    iget-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, Landroidx/collection/MutableScatterSet;

    .line 36
    .line 37
    iget-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v9, Ljava/util/List;

    .line 40
    .line 41
    iget-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v10, Ljava/util/List;

    .line 44
    .line 45
    iget-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v11, Ljava/util/List;

    .line 48
    .line 49
    iget-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v12, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v15, v12

    .line 57
    move-object v12, v2

    .line 58
    move-object v2, v15

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_1
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroidx/collection/MutableScatterSet;

    .line 72
    .line 73
    iget-object v5, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Ljava/util/Set;

    .line 76
    .line 77
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Landroidx/collection/MutableScatterSet;

    .line 80
    .line 81
    iget-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v7, Landroidx/collection/MutableScatterSet;

    .line 84
    .line 85
    iget-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, Landroidx/collection/MutableScatterSet;

    .line 88
    .line 89
    iget-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v9, Ljava/util/List;

    .line 92
    .line 93
    iget-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v10, Ljava/util/List;

    .line 96
    .line 97
    iget-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v11, Ljava/util/List;

    .line 100
    .line 101
    iget-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v12, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v13, v8

    .line 109
    move-object v8, v2

    .line 110
    move-object v2, v12

    .line 111
    move-object v12, v9

    .line 112
    move-object v9, v11

    .line 113
    move-object v11, v13

    .line 114
    :goto_0
    move-object v14, v5

    .line 115
    move-object v13, v7

    .line 116
    move-object v7, v6

    .line 117
    goto/16 :goto_2

    .line 118
    .line 119
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 125
    .line 126
    new-instance v5, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    new-instance v6, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v7, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    new-instance v10, Landroidx/collection/MutableScatterSet;

    .line 150
    .line 151
    const/4 v11, 0x0

    .line 152
    const/4 v12, 0x0

    .line 153
    invoke-direct {v10, v11, v4, v12}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/n;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v10}, Landroidx/compose/runtime/collection/ScatterSetWrapperKt;->wrapIntoSet(Landroidx/collection/ScatterSet;)Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    move-object v15, v11

    .line 165
    move-object v11, v5

    .line 166
    move-object v5, v15

    .line 167
    move-object v15, v10

    .line 168
    move-object v10, v6

    .line 169
    move-object v6, v15

    .line 170
    move-object v15, v9

    .line 171
    move-object v9, v7

    .line 172
    move-object v7, v15

    .line 173
    :goto_1
    iget-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 174
    .line 175
    invoke-static {v13}, Landroidx/compose/runtime/Recomposer;->access$getShouldKeepRecomposing(Landroidx/compose/runtime/Recomposer;)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_6

    .line 180
    .line 181
    iget-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 182
    .line 183
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v5, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 200
    .line 201
    iput v4, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 202
    .line 203
    invoke-static {v13, v0}, Landroidx/compose/runtime/Recomposer;->access$awaitWorkAvailable(Landroidx/compose/runtime/Recomposer;Lvc/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    if-ne v13, v1, :cond_3

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_3
    move-object v13, v11

    .line 211
    move-object v11, v8

    .line 212
    move-object v8, v12

    .line 213
    move-object v12, v9

    .line 214
    move-object v9, v13

    .line 215
    goto :goto_0

    .line 216
    :goto_2
    iget-object v5, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 217
    .line 218
    invoke-static {v5}, Landroidx/compose/runtime/Recomposer;->access$recordComposerModifications(Landroidx/compose/runtime/Recomposer;)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_5

    .line 223
    .line 224
    new-instance v5, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;

    .line 225
    .line 226
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 227
    .line 228
    invoke-direct/range {v5 .. v14}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;-><init>(Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/Set;)V

    .line 229
    .line 230
    .line 231
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$0:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v9, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$1:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v10, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$2:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v12, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$3:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v11, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$4:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$5:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v7, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$6:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v14, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$7:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v8, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->L$8:Ljava/lang/Object;

    .line 248
    .line 249
    iput v3, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->label:I

    .line 250
    .line 251
    invoke-interface {v2, v5, v0}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    if-ne v5, v1, :cond_4

    .line 256
    .line 257
    :goto_3
    return-object v1

    .line 258
    :cond_4
    move-object v5, v12

    .line 259
    move-object v12, v8

    .line 260
    move-object v8, v11

    .line 261
    move-object v11, v9

    .line 262
    move-object v9, v5

    .line 263
    move-object v6, v7

    .line 264
    move-object v7, v13

    .line 265
    move-object v5, v14

    .line 266
    :goto_4
    iget-object v13, v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->this$0:Landroidx/compose/runtime/Recomposer;

    .line 267
    .line 268
    invoke-static {v13}, Landroidx/compose/runtime/Recomposer;->access$discardUnusedMovableContentState(Landroidx/compose/runtime/Recomposer;)V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_5
    move-object v5, v12

    .line 273
    move-object v12, v8

    .line 274
    move-object v8, v11

    .line 275
    move-object v11, v9

    .line 276
    move-object v9, v5

    .line 277
    move-object v6, v7

    .line 278
    move-object v7, v13

    .line 279
    move-object v5, v14

    .line 280
    goto :goto_1

    .line 281
    :cond_6
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 282
    .line 283
    return-object v1
.end method
