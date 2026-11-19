# RE note 管理 Blackboard 页面编辑状态及页面快照。
.class public final Lcom/zykj/blackboard/core/edit/PageControl;
.super Lcom/zykj/blackboard/core/edit/BasePageControl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    const-string v0, "boardControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method private final addImageGraphFromLocal(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 14

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, p1, v2, v1, v2}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature$default(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    if-nez v5, :cond_0

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "localFile.absolutePath"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p3

    .line 22
    .line 23
    move-object/from16 v2, p4

    .line 24
    .line 25
    move-object/from16 v4, p5

    .line 26
    .line 27
    invoke-static {p0, v0, v1, v2, v4}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getWHFromLocalByType(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string v1, "localFile.name"

    .line 36
    .line 37
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aget-object v2, v0, v1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x1

    .line 48
    aget-object v7, v0, v3

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    aget-object v1, v0, v1

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    aget-object v0, v0, v3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/16 v11, 0x8

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    move-object v6, p0

    .line 71
    move-object/from16 v9, p2

    .line 72
    .line 73
    invoke-static/range {v6 .. v12}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getTranslateMatrix$default(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    move/from16 v9, p6

    .line 78
    .line 79
    move-object v3, v6

    .line 80
    move v7, v13

    .line 81
    move v6, v2

    .line 82
    invoke-direct/range {v3 .. v9}, Lcom/zykj/blackboard/core/edit/PageControl;->buildImageGraph(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public static synthetic addImageGraphFromLocal$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p4, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x10

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p5, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p7, 0x20

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    const/4 p6, 0x0

    .line 17
    :cond_2
    invoke-direct/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/PageControl;->addImageGraphFromLocal(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final buildImageGraph(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraphId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 20
    .line 21
    float-to-int v6, p3

    .line 22
    float-to-int v7, p4

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground()Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    move-object v3, p1

    .line 40
    move-object v5, p2

    .line 41
    invoke-virtual/range {v1 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    sget-object p3, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 56
    .line 57
    const-string p4, "graphData"

    .line 58
    .line 59
    invoke-static {p2, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getSourceLoad()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p3, p2, p4}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-eqz p3, :cond_3

    .line 71
    .line 72
    new-instance p4, Landroid/graphics/Matrix;

    .line 73
    .line 74
    move-object/from16 v0, p5

    .line 75
    .line 76
    invoke-direct {p4, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 77
    .line 78
    .line 79
    if-nez p6, :cond_0

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p4, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    filled-new-array {p3}, [Lcom/zykj/blackboard/core/graph/Graph;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-static {p4, v4, v5}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    filled-new-array {v2}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/action/ActionManager;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, p4}, Lcom/zykj/blackboard/core/graph/Graph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 128
    .line 129
    .line 130
    sget-object p4, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 131
    .line 132
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 133
    .line 134
    invoke-virtual {p4, v0}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 138
    .line 139
    invoke-virtual {p4, v0}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 143
    .line 144
    invoke-virtual {p4, v0}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-virtual {p4}, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground()Z

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph"

    .line 160
    .line 161
    if-eqz p4, :cond_1

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object p4, p3

    .line 171
    check-cast p4, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 172
    .line 173
    invoke-virtual {p2, p4}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 178
    .line 179
    .line 180
    move-result-object p4

    .line 181
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->w()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {p4, p2, p3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 186
    .line 187
    .line 188
    :goto_0
    new-instance p2, Ljava/io/File;

    .line 189
    .line 190
    sget-object p4, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    sget-object v2, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 197
    .line 198
    invoke-virtual {p4, v1, v2}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p4

    .line 202
    invoke-direct {p2, p4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->isRecording()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_2

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRecordingImageList()Ljava/util/ArrayList;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getNoRecordingImageList()Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    :goto_1
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast p3, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 234
    .line 235
    return-object p3

    .line 236
    :cond_3
    const/4 p1, 0x0

    .line 237
    return-object p1
.end method

.method public static synthetic buildImageGraph$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;->buildImageGraph(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final calculateMatrixForSpecial(FF)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    div-float v0, v2, p1

    .line 19
    .line 20
    mul-float/2addr p2, v2

    .line 21
    div-float v3, p2, p1

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 29
    .line 30
    .line 31
    sget-object v4, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-static/range {v1 .. v7}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getTranslateMatrix$default(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/4 v0, 0x0

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-interface {p2}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    move v1, v0

    .line 67
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 78
    .line 79
    instance-of v3, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 80
    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->getRenderRectF()Landroid/graphics/RectF;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    move v1, v0

    .line 95
    :cond_2
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method private final safeCountProgress(F)F
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    return v0

    :cond_1
    return p1
.end method

.method private final saveData(Lx7/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->isRecording()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->stopRecord()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/zykj/blackboard/utils/ProtoFileUtils;->Companion:Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "screenshot.png"

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, p1}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createBitmapFile(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->z(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    invoke-static {v1, v2, v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->x(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 61
    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "[PageControl]:saveData -> ["

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, "] s:"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, ", g:"

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_2

    .line 110
    .line 111
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const/4 p1, 0x0

    .line 127
    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p1, "cm:"

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->l()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, Lcom/zykj/blackboard/utils/ProtoFileUtils;->Companion:Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;

    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->e()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const-string v2, "builder.build()"

    .line 168
    .line 169
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v2, "snapshot.bin"

    .line 173
    .line 174
    invoke-virtual {p1, v1, v2, v0}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createPageSnapshotFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 190
    .line 191
    if-eqz p1, :cond_4

    .line 192
    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    .line 195
    .line 196
    move-result-wide v0

    .line 197
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setUpdateDate(J)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/TimeRecord;->getTime(J)J

    .line 209
    .line 210
    .line 211
    move-result-wide v0

    .line 212
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDuration(J)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getDefaultBackgroundColor()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDefaultBackgroundColor(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getDefaultBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->put()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 308
    .line 309
    .line 310
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-eqz p1, :cond_5

    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const/4 v0, 0x0

    .line 325
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setChange(Z)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const-string v0, ""

    .line 333
    .line 334
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandFileName(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    const/4 v0, -0x1

    .line 342
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandIndex(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 350
    .line 351
    .line 352
    :cond_5
    return-void
.end method


# virtual methods
.method public addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->registerEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public addGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getMGraphDeleteListenerList()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public addImage(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 8

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaleType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    const-string v3, ""

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/edit/PageControl;->addImage(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    move-result-object p1

    return-object p1
.end method

.method public addImage(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 9

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaleType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->getImageGraphCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 7
    invoke-static {p0, p1, p6, p2}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveBitmapToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;)Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v2, p0

    move-object v4, p3

    move-object v5, p4

    move v8, p5

    .line 10
    invoke-direct/range {v2 .. v8}, Lcom/zykj/blackboard/core/edit/PageControl;->addImageGraphFromLocal(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    throw p1
.end method

.method public addImage(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaleType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->getImageGraphCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveFileToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move v8, p4

    .line 3
    invoke-static/range {v2 .. v10}, Lcom/zykj/blackboard/core/edit/PageControl;->addImageGraphFromLocal$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    throw p1
.end method

.method public addImageList(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/board/EzyPositionEnum$PositionEnum;",
            "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "pathList"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "position"

    .line 9
    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "scaleType"

    .line 16
    .line 17
    move-object/from16 v8, p3

    .line 18
    .line 19
    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v13

    .line 31
    const/4 v14, 0x0

    .line 32
    move v15, v14

    .line 33
    :goto_0
    if-ge v15, v13, :cond_4

    .line 34
    .line 35
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/blackboard/core/edit/PageControl;->getImageGraphCount()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ge v3, v4, :cond_3

    .line 58
    .line 59
    move-object/from16 v6, p0

    .line 60
    .line 61
    invoke-static {v6, v2}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveFileToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    sget-object v3, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 69
    .line 70
    const/4 v4, 0x2

    .line 71
    const/4 v7, 0x0

    .line 72
    invoke-static {v3, v2, v7, v4, v7}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature$default(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v18

    .line 76
    if-nez v18, :cond_1

    .line 77
    .line 78
    :goto_1
    return-object v1

    .line 79
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string v3, "newFile.absolutePath"

    .line 84
    .line 85
    invoke-static {v7, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/16 v11, 0xc

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-static/range {v6 .. v12}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getWHFromLocalByType$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)[Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    aget-object v3, v9, v14

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    const/4 v10, 0x1

    .line 104
    aget-object v4, v9, v10

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    const/16 v7, 0x8

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    move-object v11, v2

    .line 115
    move-object/from16 v2, p0

    .line 116
    .line 117
    invoke-static/range {v2 .. v8}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getTranslateMatrix$default(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMultiImageOffset()F

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    int-to-float v4, v15

    .line 134
    mul-float/2addr v2, v4

    .line 135
    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const-string v4, "newFile.name"

    .line 143
    .line 144
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    aget-object v4, v9, v14

    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 150
    .line 151
    .line 152
    move-result v19

    .line 153
    aget-object v4, v9, v10

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result v20

    .line 159
    const/16 v23, 0x20

    .line 160
    .line 161
    const/16 v24, 0x0

    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    move-object/from16 v16, p0

    .line 166
    .line 167
    move-object/from16 v17, v2

    .line 168
    .line 169
    move-object/from16 v21, v3

    .line 170
    .line 171
    invoke-static/range {v16 .. v24}, Lcom/zykj/blackboard/core/edit/PageControl;->buildImageGraph$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-eqz v2, :cond_2

    .line 176
    .line 177
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_2
    add-int/lit8 v15, v15, 0x1

    .line 181
    .line 182
    move-object/from16 v5, p2

    .line 183
    .line 184
    move-object/from16 v8, p3

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_3
    new-instance v0, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    .line 189
    .line 190
    invoke-direct {v0}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    .line 191
    .line 192
    .line 193
    throw v0

    .line 194
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 195
    .line 196
    .line 197
    return-object v1
.end method

.method public addRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public addSpecialImage(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 9

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->getImageGraphCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    move-result v1

    if-ge v0, v1, :cond_3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    .line 18
    invoke-static/range {v2 .. v7}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveBitmapToLocal$default(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    move-result-object p1

    move-object v0, v2

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 19
    :cond_0
    sget-object v2, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    const/4 v4, 0x2

    invoke-static {v2, p1, v1, v4, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature$default(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    move-result-object v4

    if-nez v4, :cond_2

    return-object v1

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string p1, "newFile.name"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-float p1, p1

    .line 23
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    .line 24
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    .line 25
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 26
    invoke-direct {p0, v5, v3}, Lcom/zykj/blackboard/core/edit/PageControl;->calculateMatrixForSpecial(FF)Landroid/graphics/Matrix;

    move-result-object v5

    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 28
    sget-object v3, Lh7/p;->a:Lh7/p;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move v3, p1

    .line 29
    invoke-static/range {v0 .. v8}, Lcom/zykj/blackboard/core/edit/PageControl;->buildImageGraph$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    move-result-object p1

    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    return-object p1

    .line 31
    :cond_3
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    throw p1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public addSpecialImage(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 13

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->getImageGraphCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 2
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveFileToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    sget-object v2, Lcom/zykj/blackboard/utils/FileValidateUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileValidateUtils;

    const/4 v3, 0x2

    invoke-static {v2, v0, v1, v3, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->getFileSignature$default(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    return-object v1

    .line 4
    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v3, 0x1

    .line 5
    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 6
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 7
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v7, p1

    .line 8
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v8, p1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    .line 10
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string p1, "newFile.name"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, v7, v8}, Lcom/zykj/blackboard/core/edit/PageControl;->calculateMatrixForSpecial(FF)Landroid/graphics/Matrix;

    move-result-object v9

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {v9, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 13
    sget-object p1, Lh7/p;->a:Lh7/p;

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p0

    .line 14
    invoke-static/range {v4 .. v12}, Lcom/zykj/blackboard/core/edit/PageControl;->buildImageGraph$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    return-object p1

    .line 16
    :cond_3
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    throw p1
.end method

.method public addText(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;
    .locals 10

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextColor()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 101
    .line 102
    sub-float/2addr v2, v3

    .line 103
    sget-object v3, Lcom/zykj/blackboard/utils/TextGraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/TextGraphUtils;

    .line 104
    .line 105
    invoke-virtual {v3, p1, v0, v4}, Lcom/zykj/blackboard/utils/TextGraphUtils;->calculateTextToList(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-float v3, v3

    .line 114
    mul-float/2addr v2, v3

    .line 115
    cmpl-float v3, v2, v1

    .line 116
    .line 117
    if-lez v3, :cond_0

    .line 118
    .line 119
    move v5, v2

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    move v5, v1

    .line 122
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraphId()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/4 v1, 0x0

    .line 131
    if-nez v3, :cond_1

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/high16 v6, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    invoke-static {v0, v6, v7}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    move-object v7, p1

    .line 154
    invoke-virtual/range {v2 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addTextGraphCommand(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-nez p1, :cond_2

    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 170
    .line 171
    const-string v2, "graphData"

    .line 172
    .line 173
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getSourceLoad()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v0, p1, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-nez p1, :cond_3

    .line 185
    .line 186
    return-object v1

    .line 187
    :cond_3
    new-instance v0, Landroid/graphics/Matrix;

    .line 188
    .line 189
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-static {p0, v4, v5, p2, p3}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getTranslateMatrix(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;I)Landroid/graphics/Matrix;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-static {p2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    filled-new-array {p1}, [Lcom/zykj/blackboard/core/graph/Graph;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    invoke-static {p3}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 227
    .line 228
    .line 229
    move-result-wide v1

    .line 230
    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    filled-new-array {v1}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v1}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p2, p3, v1}, Lcom/zykj/blackboard/core/action/ActionManager;->transformGraphEvent(Ljava/util/List;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/graph/Graph;->concatMatrix(Landroid/graphics/Matrix;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p2, v3, p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 253
    .line 254
    .line 255
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 256
    .line 257
    return-object p1
.end method

.method public addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/edit/HistoryControl;->addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/MoveAction;->areaMovEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/MoveAction;->areaMoveStart()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/MoveAction;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public canSave()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getModeFactory()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/TouchActionModeFactory;->getWritingAction$blackboard_release()Lcom/zykj/blackboard/core/action/WritingAction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->executorsTaskDone()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCanSave()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public changeImageOriginRect(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V
    .locals 12

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 16
    .line 17
    const/16 v10, 0xf8

    .line 18
    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    move-object v2, p1

    .line 26
    move-object v4, p2

    .line 27
    invoke-static/range {v1 .. v11}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public changeTextColor(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->changeTextColor(I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public changeTextSize(F)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/TextAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->changeTextSize(F)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public cleanPage(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v3, v2

    .line 37
    check-cast v3, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 38
    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {p1, v1, v2, v3}, Lcom/zykj/blackboard/core/action/ActionManager;->deleteGraphEvent(Ljava/util/List;J)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 61
    .line 62
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {v1}, Lkotlin/jvm/internal/d0;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->delete(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public clearHistoryList()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryControl;->clearHistoryList()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public clearHistoryListWithoutCurrent()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryControl;->clearHistoryListWithoutCurrent()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getFirstGraph()Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public getGroupGraphSize()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public getImageGraphCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getImageGraphCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getMoveHorizontalProgress()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/MoveAction;->getHorizontalProgress()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public getMoveVerticalProgress()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "MoveProgress"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lcom/zykj/blackboard/core/action/MoveAction;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/MoveAction;->getVerticalProgress()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public getNoRecordImagePathList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/16 v2, 0xa

    .line 47
    .line 48
    invoke-static {v1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->initPath()V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    const-string v2, ""

    .line 87
    .line 88
    :cond_3
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    return-object v0

    .line 93
    :cond_5
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method

.method public getPageImagePathList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getNoRecordingImageList()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRecordingImageList()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public getRenderRect()Landroid/graphics/RectF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getZoomLevel()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->getScaleX(Landroid/graphics/Matrix;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public isMicroTurnOn()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/AudioControl;->isMicroTurnOn()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isPageNotEmpty()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x1

    .line 23
    xor-int/2addr v0, v2

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    return v1
.end method

.method public isRecording()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public minScreenshot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    move v6, p6

    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    move-object/from16 v8, p8

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->minScreenShot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public newSelectGraph(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->selectGraphList(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->handleTouchEvent(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public recover()Z
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryControl;->recover()Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundColor()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->rebuild(Lcom/zykj/blackboard/core/graph/Graph;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->unRegisterEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public removeGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getMGraphDeleteListenerList()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public removeRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public removeWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/edit/HistoryControl;->removeWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public save()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/edit/PageControl$save$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/PageControl;->saveData(Lx7/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public saveWithContentThumbnail()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/edit/PageControl$saveWithContentThumbnail$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/edit/PageControl$saveWithContentThumbnail$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/PageControl;->saveData(Lx7/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public screenshot()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->screenshot()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public selectedGraph(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->b:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.action.SelectAction"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/zykj/blackboard/core/action/SelectAction;

    .line 33
    .line 34
    filled-new-array {p1}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->selectGraphList(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->setMAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eq v2, p1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 12
    .line 13
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    move-object v5, v4

    .line 58
    move v3, p1

    .line 59
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addConfigCommand(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 75
    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public setBackgroundColorWithLineConfig(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 9

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-ne v0, p1, :cond_0

    .line 23
    .line 24
    invoke-static {v5, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :cond_0
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 31
    .line 32
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    move v4, p1

    .line 76
    move v3, p1

    .line 77
    move-object v6, p2

    .line 78
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addConfigCommand(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {v6}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public setGeometryCreateListener(Lx7/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->setMGeometryCreateListener(Lx7/l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setMicroPhoneListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/edit/AudioControl;->setListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setRecordListener(Lcom/zykj/blackboard/listener/RecordListener;)V
    .locals 1

    .line 1
    const-string v0, "recordListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/TimeRecord;->setListener(Lcom/zykj/blackboard/listener/RecordListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->setMTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVisibleAreaProgress(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterRectF()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    int-to-float v3, v3

    .line 26
    sub-float/2addr v2, v3

    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    int-to-float v4, v4

    .line 36
    sub-float/2addr v3, v4

    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    int-to-float v6, v6

    .line 49
    cmpl-float v5, v5, v6

    .line 50
    .line 51
    if-lez v5, :cond_0

    .line 52
    .line 53
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 54
    .line 55
    neg-float v5, v5

    .line 56
    div-float/2addr v5, v2

    .line 57
    invoke-direct {p0, v5}, Lcom/zykj/blackboard/core/edit/PageControl;->safeCountProgress(F)F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/PageControl;->safeCountProgress(F)F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    sub-float/2addr v5, p1

    .line 70
    mul-float/2addr v2, v5

    .line 71
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move-object p1, v4

    .line 77
    :goto_0
    if-eqz p2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    int-to-float v1, v1

    .line 88
    cmpl-float v1, v2, v1

    .line 89
    .line 90
    if-lez v1, :cond_1

    .line 91
    .line 92
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 93
    .line 94
    neg-float v0, v0

    .line 95
    div-float/2addr v0, v3

    .line 96
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/PageControl;->safeCountProgress(F)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-direct {p0, p2}, Lcom/zykj/blackboard/core/edit/PageControl;->safeCountProgress(F)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    sub-float/2addr v0, p2

    .line 109
    mul-float/2addr v3, v0

    .line 110
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, p1, v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->postCameraTranslate(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 127
    .line 128
    .line 129
    const-wide/16 v0, 0x0

    .line 130
    .line 131
    invoke-static {p2, v0, v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-static {p2, v0, v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->setCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public startRecord(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/TimeRecord;->startRecord(J)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->turnOnMicro()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRecordingImageList()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getNoRecordingImageList()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getNoRecordingImageList()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public stopRecord()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->isMicroTurnOn()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->turnOffMicro()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->stopRecord(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/TimeRecord;->stopRecord(J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public turnOffMicro()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl$turnOffMicro$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/PageControl$turnOffMicro$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/edit/AudioControl;->stopRecord(Lx7/p;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public turnOnMicro()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->isRecording()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/edit/AudioControl;->startRecord(Lx7/l;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public withdraw()Z
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryControl;->withDraw()Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundColor()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->rebuild(Lcom/zykj/blackboard/core/graph/Graph;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public zoomLevel(FFF)V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->getScaleX(Landroid/graphics/Matrix;)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    new-instance v2, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1, v1, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p3, p3, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2, v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 p2, 0x0

    .line 52
    .line 53
    invoke-static {p1, p2, p3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0, p2, p3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->setCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 73
    .line 74
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 82
    .line 83
    .line 84
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundMatrix()V

    .line 101
    .line 102
    .line 103
    return-void
.end method
