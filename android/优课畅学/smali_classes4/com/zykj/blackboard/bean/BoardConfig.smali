.class public final Lcom/zykj/blackboard/bean/BoardConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/bean/BoardConfig$WhenMappings;
    }
.end annotation


# instance fields
.field private addTextOriginalText:Ljava/lang/String;

.field private addTextOriginalTextColor:I

.field private addTextOriginalTextMaxSize:F

.field private addTextOriginalTextMinSize:F

.field private addTextOriginalTextSize:F

.field private addTextRectF:Landroid/graphics/RectF;

.field private author:Lcom/zykj/blackboard/bean/Author;

.field private backgroundColor:I

.field private backgroundColorOutside:I

.field private final backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field private beelinePaintColor:I

.field private beelinePaintWidth:F

.field private cursorColor:I

.field private cursorOffset:F

.field private cursorWidth:F

.field private eraserWidth:F

.field private geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

.field private geometryMinSize:F

.field private geometryStrokeColor:I

.field private geometryStrokeWidth:F

.field private final height:I

.field private highlighterColorAlpha:F

.field private imageCropView:Lcom/zykj/blackboard/listener/ImageCropView;

.field private isDottedLine:Z

.field private isFingerDraw:Z

.field private isGroupGraphComplete:Z

.field private isImageBackground:Z

.field private maxImageSize:I

.field private mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field private final moveActionConfig:Lcom/zykj/blackboard/bean/MoveActionConfig;

.field private multiImageOffset:F

.field private paintColor:I

.field private paintDottedLineItemLength:F

.field private paintDottedLineSpacing:F

.field private paintWidth:F

.field private final selectButtonHeight:F

.field private selectExcludeGraphList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/Graph;",
            ">;"
        }
    .end annotation
.end field

.field private selectHighlighterLevel:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private selectIconWidth:F

.field private selectNormalColor:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private selectWriteLevel:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private textEditView:Lcom/zykj/blackboard/listener/TextEditView;

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->width:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->height:I

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->maxImageSize:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw:Z

    .line 13
    .line 14
    const/high16 p1, -0x1000000

    .line 15
    .line 16
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintColor:I

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintColor:I

    .line 19
    .line 20
    const/high16 p2, 0x40a00000    # 5.0f

    .line 21
    .line 22
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintWidth:F

    .line 23
    .line 24
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintWidth:F

    .line 25
    .line 26
    const/high16 p2, 0x42200000    # 40.0f

    .line 27
    .line 28
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->eraserWidth:F

    .line 29
    .line 30
    const/high16 p2, 0x41f00000    # 30.0f

    .line 31
    .line 32
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineItemLength:F

    .line 33
    .line 34
    const/high16 p2, 0x41700000    # 15.0f

    .line 35
    .line 36
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineSpacing:F

    .line 37
    .line 38
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/RectF;

    .line 43
    .line 44
    const/high16 v1, 0x43c80000    # 400.0f

    .line 45
    .line 46
    const/high16 v2, 0x42c80000    # 100.0f

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextRectF:Landroid/graphics/RectF;

    .line 53
    .line 54
    const-string v0, "\u8bf7\u8f93\u5165\u6587\u5b57"

    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalText:Ljava/lang/String;

    .line 57
    .line 58
    const/high16 v0, 0x41e00000    # 28.0f

    .line 59
    .line 60
    iput v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextSize:F

    .line 61
    .line 62
    const/high16 v1, 0x41a00000    # 20.0f

    .line 63
    .line 64
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMinSize:F

    .line 65
    .line 66
    const/high16 v2, 0x42400000    # 48.0f

    .line 67
    .line 68
    iput v2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMaxSize:F

    .line 69
    .line 70
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextColor:I

    .line 71
    .line 72
    new-instance v3, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 73
    .line 74
    const/16 v8, 0xf

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    invoke-direct/range {v3 .. v9}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/n;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 85
    .line 86
    const/high16 v2, -0x10000

    .line 87
    .line 88
    iput v2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorColor:I

    .line 89
    .line 90
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorWidth:F

    .line 91
    .line 92
    const/high16 v1, 0x42480000    # 50.0f

    .line 93
    .line 94
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorOffset:F

    .line 95
    .line 96
    new-instance v2, Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 97
    .line 98
    const/16 v10, 0x7f

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    invoke-direct/range {v2 .. v11}, Lcom/zykj/blackboard/bean/MoveActionConfig;-><init>(ZZZZZIIILkotlin/jvm/internal/n;)V

    .line 108
    .line 109
    .line 110
    iput-object v2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->moveActionConfig:Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 111
    .line 112
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->multiImageOffset:F

    .line 113
    .line 114
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iput-object v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectExcludeGraphList:Ljava/util/List;

    .line 119
    .line 120
    const/4 v1, -0x1

    .line 121
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundColorOutside:I

    .line 122
    .line 123
    const/high16 v1, 0x42700000    # 60.0f

    .line 124
    .line 125
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectButtonHeight:F

    .line 126
    .line 127
    const/high16 v1, 0x42100000    # 36.0f

    .line 128
    .line 129
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectIconWidth:F

    .line 130
    .line 131
    const/high16 v2, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const/high16 v4, 0x41000000    # 8.0f

    .line 138
    .line 139
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    filled-new-array {v3, v4, p2}, [Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p2}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    iput-object p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectWriteLevel:Ljava/util/List;

    .line 156
    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const p2, -0x111112

    .line 162
    .line 163
    .line 164
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const p2, -0xb6cf

    .line 169
    .line 170
    .line 171
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const/16 p2, -0x47d2

    .line 176
    .line 177
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    const p2, -0xbf3600

    .line 182
    .line 183
    .line 184
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    const p2, -0xcc6601

    .line 189
    .line 190
    .line 191
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    const p2, -0x39b601

    .line 196
    .line 197
    .line 198
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    const p2, -0xaa2f

    .line 203
    .line 204
    .line 205
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    filled-new-array/range {v3 .. v10}, [Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {p2}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    iput-object p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectNormalColor:Ljava/util/List;

    .line 218
    .line 219
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const/high16 v3, 0x42600000    # 56.0f

    .line 228
    .line 229
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    filled-new-array {p2, v0, v3}, [Ljava/lang/Float;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    invoke-static {p2}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    iput-object p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectHighlighterLevel:Ljava/util/List;

    .line 242
    .line 243
    const/high16 p2, 0x3f000000    # 0.5f

    .line 244
    .line 245
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->highlighterColorAlpha:F

    .line 246
    .line 247
    sget-object p2, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->RECTANGLE:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 248
    .line 249
    iput-object p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 250
    .line 251
    iput v2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeWidth:F

    .line 252
    .line 253
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeColor:I

    .line 254
    .line 255
    iput v1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryMinSize:F

    .line 256
    .line 257
    return-void
.end method

.method public static synthetic setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x41f00000    # 30.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/high16 p3, 0x41700000    # 15.0f

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine(ZFF)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getAddTextOriginalText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAddTextOriginalTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAddTextOriginalTextMaxSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMaxSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getAddTextOriginalTextMinSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMinSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getAddTextOriginalTextSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getAddTextRectF()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAuthor()Lcom/zykj/blackboard/bean/Author;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->author:Lcom/zykj/blackboard/bean/Author;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBackgroundColorOutside()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundColorOutside:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBeelinePaintColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBeelinePaintWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCursorColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCursorOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorOffset:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCursorWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getEraserWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->eraserWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGeometryMinSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryMinSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getGeometryStrokeColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGeometryStrokeWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->height:I

    .line 2
    .line 3
    return v0
.end method

.method public final getHighlighterColorAlpha()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->highlighterColorAlpha:F

    .line 2
    .line 3
    return v0
.end method

.method public final getImageCropView()Lcom/zykj/blackboard/listener/ImageCropView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->imageCropView:Lcom/zykj/blackboard/listener/ImageCropView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxImageSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->maxImageSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMode()Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->moveActionConfig:Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMultiImageOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->multiImageOffset:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintDottedLineItemLength()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineItemLength:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintDottedLineSpacing()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineSpacing:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectButtonHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectButtonHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectExcludeGraphList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectExcludeGraphList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectHighlighterLevel()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectHighlighterLevel:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectIconWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectIconWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectNormalColor()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectNormalColor:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelectWriteLevel()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectWriteLevel:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextEditView()Lcom/zykj/blackboard/listener/TextEditView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->textEditView:Lcom/zykj/blackboard/listener/TextEditView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->width:I

    .line 2
    .line 3
    return v0
.end method

.method public final isDottedLine()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isDottedLine:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isFingerDraw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isGroupGraphComplete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isImageBackground()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setAddTextOriginalText(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalText:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setAddTextOriginalTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setAddTextOriginalTextMaxSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMaxSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setAddTextOriginalTextMinSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextMinSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setAddTextOriginalTextSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextOriginalTextSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setAddTextRectF(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->addTextRectF:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method

.method public final setAuthor(Lcom/zykj/blackboard/bean/Author;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->author:Lcom/zykj/blackboard/bean/Author;

    .line 2
    .line 3
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setBackgroundColorOutside(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->backgroundColorOutside:I

    .line 2
    .line 3
    return-void
.end method

.method public final setBeelinePaintColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setBeelinePaintWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->beelinePaintWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public final setCursorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setCursorOffset(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorOffset:F

    .line 2
    .line 3
    return-void
.end method

.method public final setCursorWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->cursorWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public final setDottedLine(ZFF)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isDottedLine:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isDottedLine:Z

    .line 13
    .line 14
    iput p2, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineItemLength:F

    .line 15
    .line 16
    iput p3, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintDottedLineSpacing:F

    .line 17
    .line 18
    return-void
.end method

.method public final setEraserWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->eraserWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public final setFingerDraw(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw:Z

    .line 18
    .line 19
    return-void
.end method

.method public final setGeometryActionEnum(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryActionEnum:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 7
    .line 8
    return-void
.end method

.method public final setGeometryMinSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryMinSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setGeometryStrokeColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setGeometryStrokeWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->geometryStrokeWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public final setGroupGraphComplete(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isGroupGraphComplete:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHighlighterColorAlpha(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->highlighterColorAlpha:F

    .line 2
    .line 3
    return-void
.end method

.method public final setImageBackground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setImageCropView(Lcom/zykj/blackboard/listener/ImageCropView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->imageCropView:Lcom/zykj/blackboard/listener/ImageCropView;

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxImageSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->maxImageSize:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V
    .locals 2

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/blackboard/bean/BoardConfig$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

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
    goto :goto_0

    .line 38
    :cond_1
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 39
    .line 40
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->DELETE_ACTION:Lcom/zykj/blackboard/utils/EventKey;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 65
    .line 66
    if-eq v0, p1, :cond_5

    .line 67
    .line 68
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 69
    .line 70
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 77
    .line 78
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_0
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->mode:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 89
    .line 90
    return-void
.end method

.method public final setMultiImageOffset(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->multiImageOffset:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPaintColor(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintColor:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintColor:I

    .line 18
    .line 19
    return-void
.end method

.method public final setPaintWidth(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintWidth:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->WRITE_BEELINE_NEW_GROUP:Lcom/zykj/blackboard/utils/EventKey;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->paintWidth:F

    .line 21
    .line 22
    return-void
.end method

.method public final setSelectExcludeGraphList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/Graph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectExcludeGraphList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelectHighlighterLevel(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectHighlighterLevel:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelectIconWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectIconWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public final setSelectNormalColor(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectNormalColor:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setSelectWriteLevel(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->selectWriteLevel:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setTextEditView(Lcom/zykj/blackboard/listener/TextEditView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BoardConfig;->textEditView:Lcom/zykj/blackboard/listener/TextEditView;

    .line 2
    .line 3
    return-void
.end method
