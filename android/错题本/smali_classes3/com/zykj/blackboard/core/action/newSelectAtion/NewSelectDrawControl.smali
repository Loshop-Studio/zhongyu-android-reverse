.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JM\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JE\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0010H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J-\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u0011\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008+\u0010,JM\u00102\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00192\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u00102\u0008\u00101\u001a\u0004\u0018\u000100\u00a2\u0006\u0004\u00082\u00103J+\u00107\u001a\u00020(2\u0006\u00104\u001a\u00020\u000e2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u00102\u0006\u00106\u001a\u000205\u00a2\u0006\u0004\u00087\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;",
        "",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "<init>",
        "(Lcom/zykj/blackboard/bean/BoardConfig;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
        "functionRectF",
        "Landroid/graphics/Paint;",
        "paint",
        "",
        "backgroundColor",
        "Landroid/graphics/RectF;",
        "backgroundRectF",
        "",
        "",
        "sizeList",
        "currentSize",
        "Ld6/s;",
        "drawWriteSizeView",
        "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V",
        "drawTextSizeView",
        "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
        "functionBackgroundRectF",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "colorList",
        "drawColorView",
        "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V",
        "drawCustomColor",
        "color",
        "",
        "checkColorLight",
        "(I)Z",
        "l",
        "t",
        "r",
        "b",
        "Landroid/graphics/Path;",
        "drawSelectingPath",
        "(FFFF)Landroid/graphics/Path;",
        "drawSelectingPaint",
        "(I)Landroid/graphics/Paint;",
        "path",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "typeList",
        "Landroid/graphics/PointF;",
        "pointF",
        "drawSelect",
        "(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V",
        "selectRectF",
        "Landroid/graphics/Matrix;",
        "matrix",
        "getSelectPath",
        "(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "Landroid/graphics/Paint;",
        "Companion",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final backgroundRadius:F = 6.0f


# instance fields
.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/bean/BoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 34
    .line 35
    return-void
.end method

.method private final checkColorLight(I)Z
    .locals 6

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 p1, p1, 0xff

    int-to-double v2, v0

    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    mul-double/2addr v2, v4

    int-to-double v0, v1

    const-wide v4, 0x3fe27ef9db22d0e5L    # 0.578

    mul-double/2addr v0, v4

    add-double/2addr v0, v2

    int-to-double v2, p1

    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double/2addr v2, v4

    add-double/2addr v2, v0

    const-wide/high16 v0, 0x4068000000000000L    # 192.0

    cmpl-double p1, v2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Landroid/graphics/Paint;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v4, p4

    .line 4
    .line 5
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p4 .. p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getColorRectF()Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/high16 v1, 0x40c00000    # 6.0f

    .line 18
    .line 19
    invoke-virtual {v2, v0, v1, v1, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v5, 0x0

    .line 27
    move v0, v5

    .line 28
    move v6, v0

    .line 29
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eqz v7, :cond_5

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    add-int/lit8 v8, v0, 0x1

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    if-ltz v0, :cond_4

    .line 43
    .line 44
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 45
    .line 46
    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 47
    .line 48
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    new-instance v10, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    check-cast v11, Landroid/graphics/RectF;

    .line 69
    .line 70
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    check-cast v12, Landroid/graphics/RectF;

    .line 81
    .line 82
    iget v12, v12, Landroid/graphics/RectF;->top:F

    .line 83
    .line 84
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    check-cast v13, Landroid/graphics/RectF;

    .line 93
    .line 94
    iget v13, v13, Landroid/graphics/RectF;->right:F

    .line 95
    .line 96
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Landroid/graphics/RectF;

    .line 105
    .line 106
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    invoke-direct {v10, v11, v12, v13, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Landroid/graphics/Path;

    .line 112
    .line 113
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 114
    .line 115
    .line 116
    sget-object v11, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 117
    .line 118
    invoke-virtual {v0, v10, v1, v1, v11}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 133
    .line 134
    .line 135
    instance-of v0, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 136
    .line 137
    if-eqz v0, :cond_1

    .line 138
    .line 139
    move-object v0, v7

    .line 140
    check-cast v0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen()Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    if-eqz v12, :cond_0

    .line 159
    .line 160
    sget v12, Lcom/zykj/blackboard/R$drawable;->blackboard_icon_custom_color_selected:I

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    goto :goto_3

    .line 165
    :cond_0
    sget v12, Lcom/zykj/blackboard/R$drawable;->blackboard_icon_custom_color:I

    .line 166
    .line 167
    :goto_1
    invoke-static {v0, v12}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    new-instance v12, Landroid/graphics/Rect;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    invoke-direct {v12, v5, v5, v13, v14}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v0, v12, v10, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    :cond_1
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->isSelected()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_3

    .line 192
    .line 193
    sget-object v0, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 194
    .line 195
    invoke-virtual {v0, v10}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawTickInRectFToPath(Landroid/graphics/RectF;)Landroid/graphics/Path;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-direct {p0, v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_2

    .line 208
    .line 209
    const/high16 v7, -0x1000000

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_2
    const/4 v7, -0x1

    .line 213
    :goto_2
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    .line 215
    .line 216
    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 217
    .line 218
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 219
    .line 220
    .line 221
    const/high16 v7, 0x40400000    # 3.0f

    .line 222
    .line 223
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 227
    .line 228
    .line 229
    :cond_3
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 230
    .line 231
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :goto_3
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :goto_4
    invoke-virtual {v2, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 243
    .line 244
    .line 245
    move v0, v8

    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_4
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 249
    .line 250
    .line 251
    throw v9

    .line 252
    :cond_5
    if-eqz v6, :cond_6

    .line 253
    .line 254
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getCustomColorRectF()Landroid/graphics/RectF;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    move-object v1, p0

    .line 259
    move-object/from16 v3, p2

    .line 260
    .line 261
    move/from16 v5, p5

    .line 262
    .line 263
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawCustomColor(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V

    .line 264
    .line 265
    .line 266
    :cond_6
    return-void
.end method

.method private final drawCustomColor(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    const/high16 p4, 0x40c00000    # 6.0f

    .line 14
    .line 15
    invoke-virtual {p1, p5, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    iget p4, p2, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 25
    .line 26
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-interface {p2, p1}, Lcom/zykj/blackboard/proxy/CustomColorView;->draw(Landroid/graphics/Canvas;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final drawTextSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V
    .locals 7

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p3 .. p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    .line 8
    .line 9
    const/high16 v0, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-virtual {p1, p5, v0, v0, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    const/high16 v0, 0x40400000    # 3.0f

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/high16 v6, 0x41400000    # 12.0f

    .line 37
    .line 38
    sub-float/2addr v0, v6

    .line 39
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-float/2addr v3, v6

    .line 56
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    move-object v5, p3

    .line 65
    move v1, v0

    .line 66
    move-object v0, p1

    .line 67
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sub-float v1, v0, v6

    .line 79
    .line 80
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-float v3, v0, v6

    .line 93
    .line 94
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    move-object v0, p1

    .line 99
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    sub-float v2, v0, v6

    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    add-float v4, v0, v6

    .line 129
    .line 130
    move-object v0, p1

    .line 131
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 137
    .line 138
    .line 139
    const v0, -0x7f000001

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerX()F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    sub-float v2, v0, v6

    .line 154
    .line 155
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerX()F

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    add-float v4, v0, v6

    .line 164
    .line 165
    move-object v0, p1

    .line 166
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method private final drawWriteSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Landroid/graphics/Paint;",
            "I",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;F)V"
        }
    .end annotation

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    .line 8
    .line 9
    const/high16 p4, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-virtual {p1, p5, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    const/4 p5, 0x0

    .line 19
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p6

    .line 23
    if-eqz p6, :cond_2

    .line 24
    .line 25
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p6

    .line 29
    add-int/lit8 v0, p5, 0x1

    .line 30
    .line 31
    if-ltz p5, :cond_1

    .line 32
    .line 33
    check-cast p6, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p6}, Ljava/lang/Number;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result p6

    .line 39
    cmpg-float p6, p6, p7

    .line 40
    .line 41
    if-nez p6, :cond_0

    .line 42
    .line 43
    const p6, -0xea8901

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const p6, -0x363637

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {p3, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    .line 53
    int-to-float p6, p5

    .line 54
    const/high16 v1, 0x40400000    # 3.0f

    .line 55
    .line 56
    mul-float/2addr p6, v1

    .line 57
    const/high16 v1, 0x41000000    # 8.0f

    .line 58
    .line 59
    add-float/2addr p6, v1

    .line 60
    const/4 v1, 0x2

    .line 61
    int-to-float v1, v1

    .line 62
    div-float/2addr p6, v1

    .line 63
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroid/graphics/RectF;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p5

    .line 85
    check-cast p5, Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 88
    .line 89
    .line 90
    move-result p5

    .line 91
    invoke-virtual {p1, v1, p5, p6, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    move p5, v0

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    throw p1

    .line 101
    :cond_2
    return-void
.end method


# virtual methods
.method public final drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 14
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "I",
            "Landroid/graphics/Path;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    const-string v3, "canvas"

    .line 6
    .line 7
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "path"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v3, "functionRectF"

    .line 16
    .line 17
    move-object/from16 v4, p4

    .line 18
    .line 19
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "functionBackgroundRectF"

    .line 23
    .line 24
    move-object/from16 v8, p5

    .line 25
    .line 26
    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "typeList"

    .line 30
    .line 31
    move-object/from16 v5, p6

    .line 32
    .line 33
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    move-object v7, v6

    .line 56
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 57
    .line 58
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-lez v7, :cond_0

    .line 67
    .line 68
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_2
    move/from16 v5, p2

    .line 81
    .line 82
    invoke-direct {p0, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    const/high16 v6, -0x41000000    # -0.5f

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const v6, 0x33ffffff

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 95
    .line 96
    const/high16 v9, 0x40400000    # 3.0f

    .line 97
    .line 98
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 99
    .line 100
    .line 101
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 102
    .line 103
    if-eqz v5, :cond_4

    .line 104
    .line 105
    const v5, -0xb8680d

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    const v5, -0x333334

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 116
    .line 117
    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    invoke-virtual {v5, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 126
    .line 127
    .line 128
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-virtual {p1, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 131
    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 136
    .line 137
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 138
    .line 139
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 143
    .line 144
    const v5, -0x9a00

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    iget v0, v2, Landroid/graphics/PointF;->x:F

    .line 151
    .line 152
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 153
    .line 154
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 155
    .line 156
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    const/16 v10, 0x8

    .line 161
    .line 162
    int-to-float v10, v10

    .line 163
    div-float/2addr v5, v10

    .line 164
    iget-object v10, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v2, v5, v10}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 170
    .line 171
    const/high16 v2, 0x41c80000    # 25.0f

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 177
    .line 178
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getEditRectF()Landroid/graphics/RectF;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 186
    .line 187
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 188
    .line 189
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 190
    .line 191
    .line 192
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 193
    .line 194
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 195
    .line 196
    .line 197
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 198
    .line 199
    const/high16 v10, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {p1, v0, v10, v10, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 202
    .line 203
    .line 204
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 205
    .line 206
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 207
    .line 208
    .line 209
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 210
    .line 211
    const/high16 v7, -0x1000000

    .line 212
    .line 213
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    .line 215
    .line 216
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 217
    .line 218
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 219
    .line 220
    .line 221
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 228
    .line 229
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 234
    .line 235
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 236
    .line 237
    invoke-virtual {v7}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    iget v7, v7, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 242
    .line 243
    sub-float/2addr v5, v7

    .line 244
    sub-float/2addr v0, v5

    .line 245
    const/4 v5, 0x2

    .line 246
    int-to-float v5, v5

    .line 247
    div-float/2addr v0, v5

    .line 248
    sub-float/2addr v2, v0

    .line 249
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 256
    .line 257
    sub-float/2addr v2, v0

    .line 258
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/4 v5, 0x0

    .line 263
    move v7, v5

    .line 264
    :goto_3
    if-ge v7, v0, :cond_c

    .line 265
    .line 266
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    add-int/lit8 v7, v7, 0x1

    .line 271
    .line 272
    check-cast v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 273
    .line 274
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 275
    .line 276
    if-eqz v11, :cond_6

    .line 277
    .line 278
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_6
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 286
    .line 287
    if-eqz v11, :cond_7

    .line 288
    .line 289
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_7
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 297
    .line 298
    if-eqz v11, :cond_8

    .line 299
    .line 300
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getGeometryStroke()Landroid/graphics/RectF;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_8
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;

    .line 308
    .line 309
    if-eqz v11, :cond_9

    .line 310
    .line 311
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getImageCrop()Landroid/graphics/RectF;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_9
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 319
    .line 320
    if-eqz v11, :cond_a

    .line 321
    .line 322
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_a
    const/high16 v11, 0x41000000    # 8.0f

    .line 330
    .line 331
    :goto_4
    const/high16 v12, 0x41700000    # 15.0f

    .line 332
    .line 333
    add-float/2addr v11, v12

    .line 334
    iget-object v12, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 335
    .line 336
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_b

    .line 341
    .line 342
    const v13, -0xea8901

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_b
    const/4 v13, -0x1

    .line 347
    :goto_5
    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    iget-object v12, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 355
    .line 356
    invoke-virtual {p1, v10, v11, v2, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 357
    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    :cond_d
    if-ge v5, v0, :cond_e

    .line 365
    .line 366
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    add-int/lit8 v5, v5, 0x1

    .line 371
    .line 372
    move-object v7, v2

    .line 373
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 374
    .line 375
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-eqz v7, :cond_d

    .line 380
    .line 381
    move-object v9, v2

    .line 382
    :cond_e
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 383
    .line 384
    instance-of v0, v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 385
    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 389
    .line 390
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getWriteStrokeRectF()Landroid/graphics/RectF;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 395
    .line 396
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 397
    .line 398
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->isHighlighter()Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectStrokeWidthList(Z)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getWidth()F

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    move-object v1, p1

    .line 411
    move-object v2, v4

    .line 412
    move v4, v6

    .line 413
    move-object v6, v0

    .line 414
    move-object v0, p0

    .line 415
    invoke-direct/range {v0 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawWriteSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V

    .line 416
    .line 417
    .line 418
    move v5, v4

    .line 419
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 420
    .line 421
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getColorList()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    move-object/from16 v2, p4

    .line 426
    .line 427
    move-object v3, v8

    .line 428
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_f
    move v5, v6

    .line 433
    instance-of v1, v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 434
    .line 435
    if-eqz v1, :cond_10

    .line 436
    .line 437
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 438
    .line 439
    move v4, v5

    .line 440
    invoke-virtual/range {p5 .. p5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getTextSizeRectF()Landroid/graphics/RectF;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    move-object v0, p0

    .line 445
    move-object v1, p1

    .line 446
    move-object/from16 v2, p4

    .line 447
    .line 448
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawTextSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V

    .line 449
    .line 450
    .line 451
    move v5, v4

    .line 452
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 453
    .line 454
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 455
    .line 456
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->getColorList()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    move-object/from16 v3, p5

    .line 461
    .line 462
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_10
    instance-of v1, v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 467
    .line 468
    if-eqz v1, :cond_11

    .line 469
    .line 470
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 471
    .line 472
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 473
    .line 474
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;->getColorList()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    move-object v0, p0

    .line 479
    move-object v1, p1

    .line 480
    move-object/from16 v2, p4

    .line 481
    .line 482
    move-object/from16 v3, p5

    .line 483
    .line 484
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 485
    .line 486
    .line 487
    :cond_11
    :goto_6
    return-void
.end method

.method public final drawSelectingPaint(I)Landroid/graphics/Paint;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/high16 v1, 0x40400000    # 3.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/high16 p1, -0x1000000

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, -0x333334

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 26
    .line 27
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    new-array v1, v1, [F

    .line 38
    .line 39
    fill-array-data v1, :array_0

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final drawSelectingPath(FFFF)Landroid/graphics/Path;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final getSelectPath(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 20
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "selectRectF"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "typeList"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "matrix"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Landroid/graphics/Path;

    .line 23
    .line 24
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object/from16 v9, p0

    .line 32
    .line 33
    iget-object v4, v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v2, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v4, 0x2

    .line 44
    int-to-float v4, v4

    .line 45
    div-float v10, v2, v4

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    int-to-float v11, v5

    .line 49
    div-float v12, v10, v11

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    div-float v13, v5, v4

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    div-float v14, v5, v4

    .line 62
    .line 63
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x0

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v7, v5

    .line 79
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 80
    .line 81
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 82
    .line 83
    if-eqz v7, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object v5, v6

    .line 87
    :goto_0
    check-cast v5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    check-cast v5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 93
    .line 94
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;->isSingle()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    move v15, v5

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move v15, v4

    .line 101
    :goto_1
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_4

    .line 110
    .line 111
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    move-object v8, v7

    .line 116
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 117
    .line 118
    instance-of v8, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 119
    .line 120
    if-eqz v8, :cond_3

    .line 121
    .line 122
    move-object v6, v7

    .line 123
    :cond_4
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 124
    .line 125
    if-eqz v6, :cond_5

    .line 126
    .line 127
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 128
    .line 129
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move/from16 v16, v5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    move/from16 v16, v15

    .line 137
    .line 138
    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    const/4 v6, 0x1

    .line 143
    if-eqz v5, :cond_7

    .line 144
    .line 145
    :cond_6
    move/from16 v17, v4

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 163
    .line 164
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 165
    .line 166
    if-eqz v7, :cond_8

    .line 167
    .line 168
    move/from16 v17, v6

    .line 169
    .line 170
    :goto_3
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_a

    .line 175
    .line 176
    :cond_9
    move/from16 v18, v4

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_a
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_9

    .line 188
    .line 189
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 194
    .line 195
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 196
    .line 197
    if-eqz v7, :cond_b

    .line 198
    .line 199
    move/from16 v18, v6

    .line 200
    .line 201
    :goto_4
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 202
    .line 203
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 204
    .line 205
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 206
    .line 207
    .line 208
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 209
    .line 210
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 211
    .line 212
    add-float/2addr v5, v14

    .line 213
    sub-float/2addr v5, v12

    .line 214
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 215
    .line 216
    .line 217
    if-nez v15, :cond_c

    .line 218
    .line 219
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 220
    .line 221
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 222
    .line 223
    add-float/2addr v5, v14

    .line 224
    add-float/2addr v5, v12

    .line 225
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_c
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 230
    .line 231
    move v5, v4

    .line 232
    sub-float v4, v5, v12

    .line 233
    .line 234
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 235
    .line 236
    add-float v7, v6, v14

    .line 237
    .line 238
    sub-float/2addr v7, v12

    .line 239
    add-float/2addr v5, v12

    .line 240
    add-float/2addr v6, v14

    .line 241
    add-float/2addr v6, v12

    .line 242
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 243
    .line 244
    move/from16 v19, v6

    .line 245
    .line 246
    move v6, v5

    .line 247
    move v5, v7

    .line 248
    move/from16 v7, v19

    .line 249
    .line 250
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 251
    .line 252
    .line 253
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 254
    .line 255
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 256
    .line 257
    add-float/2addr v5, v14

    .line 258
    add-float/2addr v5, v12

    .line 259
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 260
    .line 261
    .line 262
    :goto_5
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 263
    .line 264
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 265
    .line 266
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 267
    .line 268
    .line 269
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 270
    .line 271
    add-float/2addr v4, v13

    .line 272
    sub-float/2addr v4, v12

    .line 273
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 274
    .line 275
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 276
    .line 277
    .line 278
    if-nez v15, :cond_d

    .line 279
    .line 280
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 281
    .line 282
    add-float/2addr v4, v13

    .line 283
    add-float/2addr v4, v12

    .line 284
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 285
    .line 286
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 287
    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_d
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 291
    .line 292
    add-float v5, v4, v13

    .line 293
    .line 294
    sub-float/2addr v5, v12

    .line 295
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 296
    .line 297
    move v7, v4

    .line 298
    move v4, v5

    .line 299
    sub-float v5, v6, v12

    .line 300
    .line 301
    add-float/2addr v7, v13

    .line 302
    add-float/2addr v7, v12

    .line 303
    add-float/2addr v6, v12

    .line 304
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 305
    .line 306
    move/from16 v19, v7

    .line 307
    .line 308
    move v7, v6

    .line 309
    move/from16 v6, v19

    .line 310
    .line 311
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 312
    .line 313
    .line 314
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 315
    .line 316
    add-float/2addr v4, v13

    .line 317
    add-float/2addr v4, v12

    .line 318
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 319
    .line 320
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 321
    .line 322
    .line 323
    :goto_6
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 324
    .line 325
    sub-float/2addr v4, v10

    .line 326
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 327
    .line 328
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 329
    .line 330
    .line 331
    if-eqz v18, :cond_e

    .line 332
    .line 333
    sget-object v4, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 334
    .line 335
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 336
    .line 337
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 338
    .line 339
    invoke-virtual {v4, v3, v5, v6, v10}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawNewScaleIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_e
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 344
    .line 345
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 346
    .line 347
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 348
    .line 349
    .line 350
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 351
    .line 352
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 353
    .line 354
    sub-float/2addr v5, v10

    .line 355
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 356
    .line 357
    .line 358
    :goto_7
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 359
    .line 360
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 361
    .line 362
    sub-float/2addr v5, v10

    .line 363
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 364
    .line 365
    .line 366
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 367
    .line 368
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 369
    .line 370
    add-float/2addr v5, v14

    .line 371
    add-float/2addr v5, v12

    .line 372
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 373
    .line 374
    .line 375
    if-nez v16, :cond_f

    .line 376
    .line 377
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 378
    .line 379
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 380
    .line 381
    add-float/2addr v5, v14

    .line 382
    sub-float/2addr v5, v12

    .line 383
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_f
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 388
    .line 389
    move v5, v4

    .line 390
    sub-float v4, v5, v12

    .line 391
    .line 392
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 393
    .line 394
    add-float v7, v6, v14

    .line 395
    .line 396
    sub-float/2addr v7, v12

    .line 397
    add-float/2addr v5, v12

    .line 398
    add-float/2addr v6, v14

    .line 399
    add-float/2addr v6, v12

    .line 400
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 401
    .line 402
    move/from16 v19, v6

    .line 403
    .line 404
    move v6, v5

    .line 405
    move v5, v7

    .line 406
    move/from16 v7, v19

    .line 407
    .line 408
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 409
    .line 410
    .line 411
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 412
    .line 413
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 414
    .line 415
    add-float/2addr v5, v14

    .line 416
    sub-float/2addr v5, v12

    .line 417
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 418
    .line 419
    .line 420
    :goto_8
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 421
    .line 422
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 423
    .line 424
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 425
    .line 426
    .line 427
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 428
    .line 429
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 430
    .line 431
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 432
    .line 433
    .line 434
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 435
    .line 436
    add-float/2addr v4, v13

    .line 437
    add-float/2addr v4, v12

    .line 438
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 439
    .line 440
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 441
    .line 442
    .line 443
    if-nez v15, :cond_10

    .line 444
    .line 445
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 446
    .line 447
    add-float/2addr v4, v13

    .line 448
    sub-float/2addr v4, v12

    .line 449
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 450
    .line 451
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_10
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 456
    .line 457
    add-float v5, v4, v13

    .line 458
    .line 459
    sub-float/2addr v5, v12

    .line 460
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 461
    .line 462
    move v7, v4

    .line 463
    move v4, v5

    .line 464
    sub-float v5, v6, v12

    .line 465
    .line 466
    add-float/2addr v7, v13

    .line 467
    add-float/2addr v7, v12

    .line 468
    add-float/2addr v6, v12

    .line 469
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 470
    .line 471
    move/from16 v19, v7

    .line 472
    .line 473
    move v7, v6

    .line 474
    move/from16 v6, v19

    .line 475
    .line 476
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 477
    .line 478
    .line 479
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 480
    .line 481
    add-float/2addr v4, v13

    .line 482
    sub-float/2addr v4, v12

    .line 483
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 484
    .line 485
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 486
    .line 487
    .line 488
    :goto_9
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 489
    .line 490
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 491
    .line 492
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 493
    .line 494
    .line 495
    if-eqz v17, :cond_12

    .line 496
    .line 497
    const/4 v4, 0x5

    .line 498
    int-to-float v4, v4

    .line 499
    mul-float/2addr v2, v4

    .line 500
    div-float/2addr v2, v11

    .line 501
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 502
    .line 503
    add-float/2addr v4, v13

    .line 504
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 505
    .line 506
    sub-float/2addr v5, v12

    .line 507
    sub-float/2addr v5, v2

    .line 508
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 509
    .line 510
    .line 511
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 512
    .line 513
    add-float/2addr v4, v13

    .line 514
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 515
    .line 516
    sub-float/2addr v5, v12

    .line 517
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 518
    .line 519
    .line 520
    if-nez v15, :cond_11

    .line 521
    .line 522
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 523
    .line 524
    add-float/2addr v4, v13

    .line 525
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 526
    .line 527
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 528
    .line 529
    .line 530
    :cond_11
    sget-object v4, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 531
    .line 532
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 533
    .line 534
    add-float/2addr v5, v13

    .line 535
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 536
    .line 537
    sub-float/2addr v0, v12

    .line 538
    sub-float/2addr v0, v2

    .line 539
    sub-float/2addr v0, v10

    .line 540
    invoke-virtual {v4, v3, v5, v0, v10}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawNewRotateIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 541
    .line 542
    .line 543
    :cond_12
    invoke-virtual {v3, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 544
    .line 545
    .line 546
    return-object v3
.end method
