.class public final synthetic Lcom/zykj/mistake/feature/collection/component/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field public final synthetic b:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Z

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic g:Lr6/c;

.field public final synthetic h:Lr6/c;

.field public final synthetic i:Z

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;Ljava/util/List;Ljava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/g;->a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/g;->b:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/component/g;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/component/g;->d:Ljava/util/Set;

    iput-boolean p5, p0, Lcom/zykj/mistake/feature/collection/component/g;->e:Z

    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/component/g;->f:Ljava/util/Set;

    iput-object p7, p0, Lcom/zykj/mistake/feature/collection/component/g;->g:Lr6/c;

    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/component/g;->h:Lr6/c;

    iput-boolean p9, p0, Lcom/zykj/mistake/feature/collection/component/g;->i:Z

    iput-boolean p10, p0, Lcom/zykj/mistake/feature/collection/component/g;->j:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroidx/compose/foundation/layout/BoxScope;

    .line 6
    .line 7
    move-object/from16 v13, p2

    .line 8
    .line 9
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "$this$PullToRefreshBox"

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v1, v2, 0x11

    .line 25
    .line 26
    const/16 v3, 0x10

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    if-eq v1, v3, :cond_0

    .line 30
    .line 31
    move v1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    and-int/lit8 v3, v2, 0x1

    .line 35
    .line 36
    invoke-interface {v13, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const/4 v1, -0x1

    .line 49
    const-string v3, "com.zykj.mistake.feature.collection.component.MistakeQuestionGrid.<anonymous> (MistakeQuestionGrid.kt:97)"

    .line 50
    .line 51
    const v5, 0x4caa1c04    # 8.918634E7f

    .line 52
    .line 53
    .line 54
    invoke-static {v5, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    new-instance v2, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    invoke-direct {v2, v1}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 72
    .line 73
    const/16 v4, 0xc

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-virtual {v1, v5}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {v1, v4}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    iget-object v15, v0, Lcom/zykj/mistake/feature/collection/component/g;->c:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/component/g;->d:Ljava/util/Set;

    .line 99
    .line 100
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    or-int/2addr v1, v5

    .line 105
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/component/g;->e:Z

    .line 106
    .line 107
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    or-int/2addr v1, v6

    .line 112
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/component/g;->f:Ljava/util/Set;

    .line 113
    .line 114
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    or-int/2addr v1, v9

    .line 119
    iget-object v9, v0, Lcom/zykj/mistake/feature/collection/component/g;->g:Lr6/c;

    .line 120
    .line 121
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    or-int/2addr v1, v10

    .line 126
    iget-object v10, v0, Lcom/zykj/mistake/feature/collection/component/g;->h:Lr6/c;

    .line 127
    .line 128
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    or-int/2addr v1, v11

    .line 133
    iget-boolean v11, v0, Lcom/zykj/mistake/feature/collection/component/g;->i:Z

    .line 134
    .line 135
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    or-int/2addr v1, v12

    .line 140
    iget-boolean v12, v0, Lcom/zykj/mistake/feature/collection/component/g;->j:Z

    .line 141
    .line 142
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    or-int/2addr v1, v14

    .line 147
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    if-nez v1, :cond_2

    .line 152
    .line 153
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 154
    .line 155
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v14, v1, :cond_3

    .line 160
    .line 161
    :cond_2
    new-instance v14, Lcom/zykj/mistake/feature/collection/component/i;

    .line 162
    .line 163
    move-object/from16 v18, v4

    .line 164
    .line 165
    move/from16 v19, v5

    .line 166
    .line 167
    move-object/from16 v20, v6

    .line 168
    .line 169
    move-object/from16 v21, v9

    .line 170
    .line 171
    move-object/from16 v22, v10

    .line 172
    .line 173
    move/from16 v16, v11

    .line 174
    .line 175
    move/from16 v17, v12

    .line 176
    .line 177
    invoke-direct/range {v14 .. v22}, Lcom/zykj/mistake/feature/collection/component/i;-><init>(Ljava/util/List;ZZLjava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    move-object v12, v14

    .line 184
    check-cast v12, Lr6/c;

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    const/16 v16, 0x390

    .line 188
    .line 189
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/component/g;->a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 190
    .line 191
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/component/g;->b:Landroidx/compose/foundation/layout/PaddingValues;

    .line 192
    .line 193
    const/4 v6, 0x0

    .line 194
    const/4 v9, 0x0

    .line 195
    const/4 v10, 0x0

    .line 196
    const/4 v11, 0x0

    .line 197
    const v14, 0x1b0030

    .line 198
    .line 199
    .line 200
    invoke-static/range {v2 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_5

    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_4
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 214
    .line 215
    .line 216
    :cond_5
    :goto_1
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 217
    .line 218
    return-object v1
.end method
