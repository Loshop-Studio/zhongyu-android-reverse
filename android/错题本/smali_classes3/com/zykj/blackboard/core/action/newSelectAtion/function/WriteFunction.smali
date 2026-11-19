.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u000f\u0010\u000c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00072\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\tJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008$\u0010\tR$\u0010&\u001a\u0004\u0018\u00010%8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008,\u0010.\"\u0004\u0008/\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\u0008\u0012\u0004\u0012\u00020\u0017`28\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001301j\u0008\u0012\u0004\u0012\u00020\u0013`28\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00104R$\u00107\u001a\u0012\u0012\u0004\u0012\u00020601j\u0008\u0012\u0004\u0012\u000206`28\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00104R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001301j\u0008\u0012\u0004\u0012\u00020\u0013`28\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00104R\u001c\u0010;\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010\u0019\u00a8\u0006<"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction;",
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "listener",
        "<init>",
        "(Lcom/zykj/blackboard/core/action/IActionListener;)V",
        "Ld6/s;",
        "initFunctionTypeList",
        "()V",
        "initFunctionRelativeRectF",
        "recalculateColorRectFList",
        "updateFunctionRectF",
        "",
        "x",
        "y",
        "",
        "isClickInSelectFunction",
        "(FF)Z",
        "Landroid/graphics/RectF;",
        "getMaxFunctionRectF",
        "()Landroid/graphics/RectF;",
        "",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "getCurrentFunctionTypeList",
        "()Ljava/util/List;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
        "setSelectGraphList",
        "(Ljava/util/List;)V",
        "reset",
        "handleClick",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "handleTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "handleCustomColorUsed",
        "",
        "lastChangeColor",
        "Ljava/lang/Integer;",
        "getLastChangeColor",
        "()Ljava/lang/Integer;",
        "setLastChangeColor",
        "(Ljava/lang/Integer;)V",
        "isHighlighter",
        "Z",
        "()Z",
        "setHighlighter",
        "(Z)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "functionTypeList",
        "Ljava/util/ArrayList;",
        "funcRelativeRectFList",
        "Landroid/graphics/PointF;",
        "strokeWidthPointFList",
        "colorRectFList",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "getFunctionColorList",
        "functionColorList",
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


# instance fields
.field private final colorRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final funcRelativeRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final functionTypeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isHighlighter:Z

.field private lastChangeColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final strokeWidthPointFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/IActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionTypeList()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionRelativeRectF()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final getFunctionColorList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getWriteEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getColorList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private final initFunctionRelativeRectF()V
    .locals 13

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 27
    .line 28
    sub-float/2addr v1, v2

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float/2addr v2, v1

    .line 38
    const/4 v3, 0x2

    .line 39
    int-to-float v3, v3

    .line 40
    div-float/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-float/2addr v4, v1

    .line 50
    div-float/2addr v4, v3

    .line 51
    add-float/2addr v4, v1

    .line 52
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x0

    .line 64
    move v8, v7

    .line 65
    :cond_0
    :goto_0
    if-ge v8, v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    move-object v10, v9

    .line 74
    check-cast v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 75
    .line 76
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-lez v10, :cond_0

    .line 85
    .line 86
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v6, 0x41b80000    # 23.0f

    .line 95
    .line 96
    move v8, v7

    .line 97
    :goto_1
    if-ge v8, v1, :cond_2

    .line 98
    .line 99
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    add-int/lit8 v8, v8, 0x1

    .line 104
    .line 105
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 106
    .line 107
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    iget-object v10, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 116
    .line 117
    new-instance v11, Landroid/graphics/RectF;

    .line 118
    .line 119
    add-float v12, v6, v9

    .line 120
    .line 121
    invoke-direct {v11, v6, v2, v12, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    const/high16 v10, 0x41f00000    # 30.0f

    .line 128
    .line 129
    add-float/2addr v9, v10

    .line 130
    add-float/2addr v6, v9

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/high16 v1, 0x41800000    # 16.0f

    .line 145
    .line 146
    :goto_2
    if-ge v7, v0, :cond_3

    .line 147
    .line 148
    int-to-float v2, v7

    .line 149
    const/high16 v4, 0x40400000    # 3.0f

    .line 150
    .line 151
    mul-float/2addr v2, v4

    .line 152
    const/high16 v4, 0x41000000    # 8.0f

    .line 153
    .line 154
    add-float/2addr v2, v4

    .line 155
    div-float/2addr v2, v3

    .line 156
    const/high16 v4, 0x41980000    # 19.0f

    .line 157
    .line 158
    add-float/2addr v2, v4

    .line 159
    add-float/2addr v1, v2

    .line 160
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 161
    .line 162
    new-instance v5, Landroid/graphics/PointF;

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    div-float/2addr v6, v3

    .line 173
    invoke-direct {v5, v1, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    add-float/2addr v1, v2

    .line 180
    add-int/lit8 v7, v7, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->recalculateColorRectFList()V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method private final initFunctionTypeList()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-direct {v1, v3, v2, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;-><init>(ZFLjava/util/List;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 62
    .line 63
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final recalculateColorRectFList()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x42180000    # 38.0f

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v0, v2

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-float/2addr v3, v1

    .line 29
    div-float/2addr v3, v2

    .line 30
    add-float/2addr v3, v1

    .line 31
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-ge v4, v2, :cond_0

    .line 49
    .line 50
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v6, Landroid/graphics/RectF;

    .line 53
    .line 54
    const/high16 v7, 0x42740000    # 61.0f

    .line 55
    .line 56
    int-to-float v8, v4

    .line 57
    mul-float/2addr v8, v7

    .line 58
    const/high16 v7, 0x41b80000    # 23.0f

    .line 59
    .line 60
    add-float/2addr v8, v7

    .line 61
    add-float v7, v8, v1

    .line 62
    .line 63
    invoke-direct {v6, v8, v0, v7, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method


# virtual methods
.method public getCurrentFunctionTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastChangeColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->lastChangeColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFunctionRectF()Landroid/graphics/RectF;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    const/high16 v1, 0x41700000    # 15.0f

    .line 12
    .line 13
    add-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x41000000    # 8.0f

    .line 15
    .line 16
    add-float/2addr v0, v1

    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    sub-int/2addr v3, v4

    .line 35
    int-to-float v3, v3

    .line 36
    const/high16 v5, 0x40400000    # 3.0f

    .line 37
    .line 38
    mul-float/2addr v3, v5

    .line 39
    add-float/2addr v3, v1

    .line 40
    const/4 v1, 0x2

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v3, v1

    .line 43
    add-float/2addr v3, v2

    .line 44
    const/high16 v2, 0x41980000    # 19.0f

    .line 45
    .line 46
    add-float/2addr v3, v2

    .line 47
    const/high16 v2, 0x41800000    # 16.0f

    .line 48
    .line 49
    add-float/2addr v3, v2

    .line 50
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Landroid/graphics/RectF;

    .line 57
    .line 58
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 59
    .line 60
    const/high16 v5, 0x41b80000    # 23.0f

    .line 61
    .line 62
    add-float/2addr v2, v5

    .line 63
    const/high16 v5, 0x41500000    # 13.0f

    .line 64
    .line 65
    add-float/2addr v3, v5

    .line 66
    add-float/2addr v3, v2

    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->getFunctionColorList()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v6, 0x0

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v2, v6

    .line 80
    :goto_0
    if-eqz v2, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v4, 0x0

    .line 84
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/4 v7, 0x0

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move-object v2, v6

    .line 99
    :goto_2
    if-eqz v2, :cond_3

    .line 100
    .line 101
    invoke-interface {v2}, Lcom/zykj/blackboard/proxy/CustomColorView;->getWidth()F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    move v2, v7

    .line 107
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-eqz v8, :cond_5

    .line 116
    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    move-object v6, v8

    .line 120
    :cond_4
    if-eqz v6, :cond_5

    .line 121
    .line 122
    invoke-interface {v6}, Lcom/zykj/blackboard/proxy/CustomColorView;->getHeight()F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    add-float/2addr v4, v5

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move v4, v7

    .line 129
    :goto_4
    new-instance v6, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    mul-float/2addr v3, v1

    .line 148
    add-float/2addr v3, v5

    .line 149
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectSizePair(Lkotlin/Pair;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectSizePair()Lkotlin/Pair;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    add-float/2addr v1, v4

    .line 192
    new-instance v2, Landroid/graphics/RectF;

    .line 193
    .line 194
    invoke-direct {v2, v7, v7, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 195
    .line 196
    .line 197
    return-object v2
.end method

.method public handleClick(FF)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleClick(FF)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v3, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v3, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;->getIndex()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-eq v1, v4, :cond_1

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    invoke-interface {v1, v2, v5, v6}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->reset()V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_2
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getWriteEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_13

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    xor-int/2addr v3, v4

    .line 99
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->setSelected(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_3
    instance-of v3, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 108
    .line 109
    if-eqz v3, :cond_a

    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize"

    .line 116
    .line 117
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 121
    .line 122
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;->getIndex()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-boolean v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 131
    .line 132
    invoke-virtual {v3, v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectStrokeWidthList(Z)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    move v6, v2

    .line 155
    :cond_4
    if-ge v6, v5, :cond_7

    .line 156
    .line 157
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    check-cast v7, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 164
    .line 165
    invoke-interface {v7}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    :cond_5
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_4

    .line 178
    .line 179
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    move-object v11, v9

    .line 184
    check-cast v11, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 185
    .line 186
    instance-of v9, v11, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 187
    .line 188
    if-eqz v9, :cond_6

    .line 189
    .line 190
    move-object v9, v11

    .line 191
    check-cast v9, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 192
    .line 193
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    if-eqz v9, :cond_6

    .line 198
    .line 199
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    sget-object v12, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 207
    .line 208
    new-instance v15, Landroid/graphics/Paint;

    .line 209
    .line 210
    invoke-direct {v15, v9}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 211
    .line 212
    .line 213
    const/16 v19, 0xec

    .line 214
    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    invoke-static/range {v10 .. v20}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_6
    instance-of v9, v7, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 229
    .line 230
    if-eqz v9, :cond_5

    .line 231
    .line 232
    move-object v9, v7

    .line 233
    check-cast v9, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 234
    .line 235
    invoke-interface {v9, v4}, Lcom/zykj/blackboard/core/graph/group/IChangeField;->changeUpdate(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    const-string v5, "WriteFunction:WriteSize -> size:"

    .line 242
    .line 243
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v5, " list: "

    .line 250
    .line 251
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    new-instance v6, Ljava/util/ArrayList;

    .line 259
    .line 260
    const/16 v7, 0xa

    .line 261
    .line 262
    invoke-static {v5, v7}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    move v8, v2

    .line 274
    :goto_1
    if-ge v8, v7, :cond_8

    .line 275
    .line 276
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    add-int/lit8 v8, v8, 0x1

    .line 281
    .line 282
    check-cast v9, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 283
    .line 284
    invoke-interface {v9}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_8
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-static {v3}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-interface {v3}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 318
    .line 319
    .line 320
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getWriteEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    if-nez v3, :cond_9

    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_9
    invoke-virtual {v3, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setWidth(F)V

    .line 330
    .line 331
    .line 332
    :goto_2
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_7

    .line 336
    .line 337
    :cond_a
    instance-of v1, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 338
    .line 339
    if-eqz v1, :cond_13

    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 346
    .line 347
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 351
    .line 352
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;->getIndex()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->getFunctionColorList()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    if-nez v3, :cond_b

    .line 361
    .line 362
    return v4

    .line 363
    :cond_b
    new-instance v5, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;

    .line 364
    .line 365
    invoke-direct {v5, v0, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;Ljava/util/List;)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    instance-of v6, v6, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 373
    .line 374
    if-eqz v6, :cond_12

    .line 375
    .line 376
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    if-eqz v1, :cond_d

    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen()Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    if-ne v6, v4, :cond_d

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->setOpen(Z)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    if-nez v1, :cond_c

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :cond_c
    const/4 v3, 0x0

    .line 403
    invoke-interface {v1, v3}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 404
    .line 405
    .line 406
    :goto_3
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 407
    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_d
    if-nez v1, :cond_e

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_e
    invoke-virtual {v1, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->setOpen(Z)V

    .line 414
    .line 415
    .line 416
    :goto_4
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    if-nez v6, :cond_f

    .line 425
    .line 426
    goto :goto_5

    .line 427
    :cond_f
    invoke-interface {v6, v5}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 428
    .line 429
    .line 430
    :goto_5
    if-eqz v1, :cond_10

    .line 431
    .line 432
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    goto :goto_6

    .line 437
    :cond_10
    move v1, v2

    .line 438
    :goto_6
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    if-eqz v6, :cond_11

    .line 447
    .line 448
    invoke-interface {v6, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->isColorExist(I)Z

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    if-ne v6, v4, :cond_11

    .line 453
    .line 454
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-interface {v5, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_11
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->selectCustom(Ljava/util/List;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 466
    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_12
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 474
    .line 475
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-interface {v5, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    :cond_13
    :goto_7
    return v4
.end method

.method public handleCustomColorUsed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->getLastChangeColor()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->onColorUsed(Ljava/lang/Integer;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public handleTouchEvent(Landroid/view/MotionEvent;)V
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    sub-float/2addr v1, v2

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    sub-float/2addr v2, v3

    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/proxy/CustomColorView;->dispatchTouchEvent(Landroid/view/MotionEvent;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public isClickInSelectFunction(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getEditRectF()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getWriteEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_a

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v3, v1

    .line 96
    :goto_0
    if-ge v3, v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Landroid/graphics/RectF;

    .line 111
    .line 112
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_3

    .line 117
    .line 118
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 119
    .line 120
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getWriteStrokeRectF()Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 147
    .line 148
    .line 149
    return v2

    .line 150
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    move v3, v1

    .line 163
    :goto_1
    if-ge v3, v0, :cond_7

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Landroid/graphics/RectF;

    .line 178
    .line 179
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 186
    .line 187
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 191
    .line 192
    .line 193
    return v2

    .line 194
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getColorRectF()Landroid/graphics/RectF;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->getFunctionColorList()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-eqz v0, :cond_a

    .line 222
    .line 223
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-eqz v0, :cond_a

    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-ne v0, v2, :cond_a

    .line 234
    .line 235
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 250
    .line 251
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 252
    .line 253
    .line 254
    return v2

    .line 255
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionBackgroundRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;->getCustomColorRectF()Landroid/graphics/RectF;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;

    .line 270
    .line 271
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 272
    .line 273
    .line 274
    return v2

    .line 275
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const/4 v3, 0x2

    .line 284
    new-array v4, v3, [F

    .line 285
    .line 286
    aput p1, v4, v1

    .line 287
    .line 288
    aput p2, v4, v2

    .line 289
    .line 290
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 291
    .line 292
    .line 293
    aget p1, v4, v1

    .line 294
    .line 295
    aget p2, v4, v2

    .line 296
    .line 297
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    new-instance v4, Landroid/graphics/RectF;

    .line 310
    .line 311
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    int-to-float v3, v3

    .line 320
    div-float v6, v0, v3

    .line 321
    .line 322
    sub-float/2addr v5, v6

    .line 323
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 328
    .line 329
    const/4 v8, 0x5

    .line 330
    int-to-float v8, v8

    .line 331
    invoke-static {v0, v8, v3, v7}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    add-float/2addr v8, v6

    .line 344
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 349
    .line 350
    const/4 v10, 0x3

    .line 351
    int-to-float v10, v10

    .line 352
    invoke-static {v0, v10, v3, v9}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    invoke-direct {v4, v5, v7, v8, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_b

    .line 364
    .line 365
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;

    .line 366
    .line 367
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 368
    .line 369
    .line 370
    return v2

    .line 371
    :cond_b
    new-instance v0, Landroid/graphics/RectF;

    .line 372
    .line 373
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 378
    .line 379
    sub-float/2addr v3, v6

    .line 380
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 385
    .line 386
    sub-float/2addr v4, v6

    .line 387
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 392
    .line 393
    add-float/2addr v5, v6

    .line 394
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 399
    .line 400
    add-float/2addr v7, v6

    .line 401
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_c

    .line 409
    .line 410
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;

    .line 411
    .line 412
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 413
    .line 414
    .line 415
    return v2

    .line 416
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    if-eqz p1, :cond_d

    .line 425
    .line 426
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 427
    .line 428
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 429
    .line 430
    .line 431
    return v2

    .line 432
    :cond_d
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 433
    .line 434
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 435
    .line 436
    .line 437
    return v1
.end method

.method public final isHighlighter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionTypeList()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->setChangeColor(Lr6/c;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->setLastChangeColor(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setHighlighter(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLastChangeColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->lastChangeColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectGraphList(Ljava/util/List;)V
    .locals 14
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectGraphList(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getWriteEditType(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    move-object v4, v1

    .line 24
    move-object v5, v4

    .line 25
    move v3, v2

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x0

    .line 31
    if-eqz v6, :cond_9

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 38
    .line 39
    invoke-interface {v6}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 58
    .line 59
    instance-of v9, v8, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 60
    .line 61
    if-eqz v9, :cond_8

    .line 62
    .line 63
    check-cast v8, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 64
    .line 65
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    if-eqz v8, :cond_7

    .line 70
    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    invoke-virtual {v8}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v13, v5

    .line 90
    move-object v5, v4

    .line 91
    move-object v4, v13

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {v8}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Float;F)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_3

    .line 102
    .line 103
    const/high16 v5, -0x40800000    # -1.0f

    .line 104
    .line 105
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :cond_3
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eq v10, v9, :cond_5

    .line 121
    .line 122
    :goto_1
    move-object v4, v1

    .line 123
    :cond_5
    :goto_2
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    const/16 v9, 0xff

    .line 132
    .line 133
    if-ne v8, v9, :cond_6

    .line 134
    .line 135
    move v3, v7

    .line 136
    :cond_6
    sget-object v8, Ld6/s;->a:Ld6/s;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move-object v8, v1

    .line 140
    :goto_3
    if-nez v8, :cond_1

    .line 141
    .line 142
    :cond_8
    move v3, v7

    .line 143
    goto :goto_0

    .line 144
    :cond_9
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setHighlighter(Z)V

    .line 145
    .line 146
    .line 147
    if-eqz v4, :cond_a

    .line 148
    .line 149
    sget-object p1, Lcom/zykj/blackboard/utils/ColorUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ColorUtils;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-virtual {p1, v3}, Lcom/zykj/blackboard/utils/ColorUtils;->toNoAlphaColor(I)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_4

    .line 164
    :cond_a
    move-object p1, v1

    .line 165
    :goto_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->createSelectColorList(Ljava/util/List;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    new-instance v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    const/4 v6, -0x1

    .line 183
    if-nez p1, :cond_c

    .line 184
    .line 185
    :cond_b
    move v9, v6

    .line 186
    goto :goto_6

    .line 187
    :cond_c
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    move v9, v7

    .line 192
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_b

    .line 197
    .line 198
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 203
    .line 204
    instance-of v11, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 205
    .line 206
    if-nez v11, :cond_d

    .line 207
    .line 208
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-ne v10, v11, :cond_d

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :goto_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    move v8, v7

    .line 227
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-eqz v10, :cond_1b

    .line 232
    .line 233
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    add-int/lit8 v11, v8, 0x1

    .line 238
    .line 239
    if-ltz v8, :cond_1a

    .line 240
    .line 241
    check-cast v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;

    .line 242
    .line 243
    instance-of v12, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 244
    .line 245
    if-eqz v12, :cond_11

    .line 246
    .line 247
    if-eqz p1, :cond_f

    .line 248
    .line 249
    if-ne v9, v6, :cond_f

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    if-eqz v10, :cond_e

    .line 264
    .line 265
    invoke-interface {v10, v8}, Lcom/zykj/blackboard/proxy/CustomColorView;->isColorExist(I)Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    goto :goto_8

    .line 270
    :cond_e
    move v8, v7

    .line 271
    :goto_8
    if-eqz v8, :cond_f

    .line 272
    .line 273
    move v8, v2

    .line 274
    goto :goto_9

    .line 275
    :cond_f
    move v8, v7

    .line 276
    :goto_9
    new-instance v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 277
    .line 278
    if-eqz v8, :cond_10

    .line 279
    .line 280
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    goto :goto_a

    .line 288
    :cond_10
    move v12, v7

    .line 289
    :goto_a
    invoke-direct {v10, v12, v8, v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;-><init>(IZZ)V

    .line 290
    .line 291
    .line 292
    goto :goto_f

    .line 293
    :cond_11
    instance-of v12, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;

    .line 294
    .line 295
    if-eqz v12, :cond_13

    .line 296
    .line 297
    new-instance v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;

    .line 298
    .line 299
    if-ne v8, v9, :cond_12

    .line 300
    .line 301
    move v8, v2

    .line 302
    goto :goto_b

    .line 303
    :cond_12
    move v8, v7

    .line 304
    :goto_b
    invoke-direct {v10, v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;-><init>(Z)V

    .line 305
    .line 306
    .line 307
    goto :goto_f

    .line 308
    :cond_13
    instance-of v12, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;

    .line 309
    .line 310
    if-eqz v12, :cond_15

    .line 311
    .line 312
    new-instance v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;

    .line 313
    .line 314
    if-ne v8, v9, :cond_14

    .line 315
    .line 316
    move v8, v2

    .line 317
    goto :goto_c

    .line 318
    :cond_14
    move v8, v7

    .line 319
    :goto_c
    invoke-direct {v10, v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;-><init>(Z)V

    .line 320
    .line 321
    .line 322
    goto :goto_f

    .line 323
    :cond_15
    instance-of v12, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;

    .line 324
    .line 325
    if-eqz v12, :cond_17

    .line 326
    .line 327
    new-instance v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;

    .line 328
    .line 329
    if-ne v8, v9, :cond_16

    .line 330
    .line 331
    move v8, v2

    .line 332
    goto :goto_d

    .line 333
    :cond_16
    move v8, v7

    .line 334
    :goto_d
    invoke-direct {v10, v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;-><init>(Z)V

    .line 335
    .line 336
    .line 337
    goto :goto_f

    .line 338
    :cond_17
    instance-of v12, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;

    .line 339
    .line 340
    if-eqz v12, :cond_19

    .line 341
    .line 342
    new-instance v12, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;

    .line 343
    .line 344
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    if-ne v8, v9, :cond_18

    .line 349
    .line 350
    move v8, v2

    .line 351
    goto :goto_e

    .line 352
    :cond_18
    move v8, v7

    .line 353
    :goto_e
    invoke-direct {v12, v10, v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;-><init>(IZ)V

    .line 354
    .line 355
    .line 356
    move-object v10, v12

    .line 357
    :goto_f
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move v8, v11

    .line 361
    goto/16 :goto_7

    .line 362
    .line 363
    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 364
    .line 365
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 366
    .line 367
    .line 368
    throw p1

    .line 369
    :cond_1a
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 370
    .line 371
    .line 372
    throw v1

    .line 373
    :cond_1b
    invoke-virtual {v0, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setColorList(Ljava/util/List;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    if-eqz p1, :cond_1d

    .line 385
    .line 386
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getColorList()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-eqz v2, :cond_1c

    .line 395
    .line 396
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->getValue()I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    :cond_1c
    invoke-interface {p1, v1}, Lcom/zykj/blackboard/proxy/CustomColorView;->initColor(Ljava/lang/Integer;)V

    .line 405
    .line 406
    .line 407
    :cond_1d
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->recalculateColorRectFList()V

    .line 408
    .line 409
    .line 410
    if-eqz v5, :cond_1e

    .line 411
    .line 412
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setWidth(F)V

    .line 417
    .line 418
    .line 419
    :cond_1e
    return-void
.end method

.method public updateFunctionRectF()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    add-float/2addr v3, v4

    .line 29
    const/high16 v4, 0x41700000    # 15.0f

    .line 30
    .line 31
    sub-float/2addr v3, v4

    .line 32
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget-object v8, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    add-float/2addr v7, v8

    .line 55
    add-float/2addr v7, v4

    .line 56
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    add-float/2addr v9, v8

    .line 71
    invoke-virtual {v2, v3, v6, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Landroid/graphics/RectF;

    .line 92
    .line 93
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    add-float/2addr v3, v6

    .line 96
    sub-float/2addr v3, v4

    .line 97
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 108
    .line 109
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 118
    .line 119
    add-float/2addr v8, v7

    .line 120
    add-float/2addr v8, v4

    .line 121
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    add-float/2addr v7, v4

    .line 136
    invoke-virtual {v2, v3, v6, v8, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    move v4, v5

    .line 153
    move v6, v4

    .line 154
    :goto_0
    const/4 v7, 0x2

    .line 155
    const/4 v8, 0x0

    .line 156
    const/high16 v9, 0x41500000    # 13.0f

    .line 157
    .line 158
    if-ge v6, v3, :cond_1

    .line 159
    .line 160
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    add-int/lit8 v6, v6, 0x1

    .line 165
    .line 166
    add-int/lit8 v11, v4, 0x1

    .line 167
    .line 168
    if-ltz v4, :cond_0

    .line 169
    .line 170
    check-cast v10, Landroid/graphics/PointF;

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    new-instance v12, Landroid/graphics/RectF;

    .line 177
    .line 178
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    iget v13, v13, Landroid/graphics/RectF;->left:F

    .line 183
    .line 184
    iget v14, v10, Landroid/graphics/PointF;->x:F

    .line 185
    .line 186
    add-float/2addr v13, v14

    .line 187
    int-to-float v4, v4

    .line 188
    const/high16 v14, 0x40400000    # 3.0f

    .line 189
    .line 190
    mul-float/2addr v4, v14

    .line 191
    const/high16 v14, 0x41000000    # 8.0f

    .line 192
    .line 193
    add-float/2addr v4, v14

    .line 194
    int-to-float v7, v7

    .line 195
    div-float/2addr v4, v7

    .line 196
    sub-float/2addr v13, v4

    .line 197
    const/high16 v14, 0x41980000    # 19.0f

    .line 198
    .line 199
    sub-float/2addr v13, v14

    .line 200
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 207
    .line 208
    .line 209
    move-result-object v16

    .line 210
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 211
    .line 212
    .line 213
    move-result v16

    .line 214
    add-float v16, v16, v15

    .line 215
    .line 216
    add-float v15, v16, v9

    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 223
    .line 224
    iget v10, v10, Landroid/graphics/PointF;->x:F

    .line 225
    .line 226
    add-float/2addr v5, v10

    .line 227
    add-float/2addr v5, v4

    .line 228
    add-float/2addr v5, v14

    .line 229
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 234
    .line 235
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    mul-float/2addr v10, v7

    .line 244
    add-float/2addr v10, v4

    .line 245
    add-float/2addr v10, v9

    .line 246
    invoke-direct {v12, v13, v15, v5, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move v4, v11

    .line 253
    const/4 v5, 0x0

    .line 254
    goto :goto_0

    .line 255
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 256
    .line 257
    .line 258
    throw v8

    .line 259
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Landroid/graphics/RectF;

    .line 272
    .line 273
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 274
    .line 275
    const/high16 v3, 0x41800000    # 16.0f

    .line 276
    .line 277
    add-float/2addr v2, v3

    .line 278
    add-float/2addr v2, v9

    .line 279
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 284
    .line 285
    .line 286
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    const/4 v6, 0x0

    .line 293
    :goto_1
    if-ge v6, v5, :cond_2

    .line 294
    .line 295
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    check-cast v10, Landroid/graphics/RectF;

    .line 302
    .line 303
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    new-instance v12, Landroid/graphics/RectF;

    .line 308
    .line 309
    iget v13, v10, Landroid/graphics/RectF;->left:F

    .line 310
    .line 311
    add-float/2addr v13, v2

    .line 312
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    iget v14, v14, Landroid/graphics/RectF;->top:F

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 319
    .line 320
    .line 321
    move-result-object v15

    .line 322
    invoke-virtual {v15}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 323
    .line 324
    .line 325
    move-result v15

    .line 326
    add-float/2addr v15, v14

    .line 327
    add-float/2addr v15, v9

    .line 328
    iget v14, v10, Landroid/graphics/RectF;->top:F

    .line 329
    .line 330
    add-float/2addr v15, v14

    .line 331
    iget v14, v10, Landroid/graphics/RectF;->right:F

    .line 332
    .line 333
    add-float/2addr v14, v2

    .line 334
    move/from16 v17, v3

    .line 335
    .line 336
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 341
    .line 342
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 343
    .line 344
    .line 345
    move-result-object v18

    .line 346
    invoke-virtual/range {v18 .. v18}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 347
    .line 348
    .line 349
    move-result v18

    .line 350
    add-float v18, v18, v3

    .line 351
    .line 352
    add-float v18, v18, v9

    .line 353
    .line 354
    iget v3, v10, Landroid/graphics/RectF;->bottom:F

    .line 355
    .line 356
    add-float v3, v18, v3

    .line 357
    .line 358
    invoke-direct {v12, v13, v15, v14, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move/from16 v3, v17

    .line 365
    .line 366
    goto :goto_1

    .line 367
    :cond_2
    move/from16 v17, v3

    .line 368
    .line 369
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    if-eqz v2, :cond_5

    .line 389
    .line 390
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->getFunctionColorList()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    if-eqz v3, :cond_3

    .line 395
    .line 396
    invoke-static {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt;->getCustomColor(Ljava/util/List;)Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    goto :goto_2

    .line 401
    :cond_3
    move-object v3, v8

    .line 402
    :goto_2
    if-eqz v3, :cond_4

    .line 403
    .line 404
    move-object v8, v2

    .line 405
    :cond_4
    if-eqz v8, :cond_5

    .line 406
    .line 407
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 416
    .line 417
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 422
    .line 423
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    add-float/2addr v5, v9

    .line 432
    int-to-float v6, v7

    .line 433
    mul-float/2addr v5, v6

    .line 434
    add-float/2addr v5, v4

    .line 435
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 440
    .line 441
    invoke-interface {v8}, Lcom/zykj/blackboard/proxy/CustomColorView;->getWidth()F

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    add-float/2addr v7, v4

    .line 446
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 451
    .line 452
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 457
    .line 458
    .line 459
    move-result v10

    .line 460
    add-float/2addr v10, v9

    .line 461
    mul-float/2addr v10, v6

    .line 462
    add-float/2addr v10, v4

    .line 463
    invoke-interface {v8}, Lcom/zykj/blackboard/proxy/CustomColorView;->getHeight()F

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    add-float/2addr v4, v10

    .line 468
    invoke-virtual {v2, v3, v5, v7, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 469
    .line 470
    .line 471
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-nez v2, :cond_8

    .line 476
    .line 477
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 482
    .line 483
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 488
    .line 489
    sub-float/2addr v2, v3

    .line 490
    add-float v2, v2, v17

    .line 491
    .line 492
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    sub-float/2addr v4, v2

    .line 505
    const/4 v5, 0x0

    .line 506
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    sub-float/2addr v4, v2

    .line 522
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    invoke-static {v2}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    check-cast v2, Landroid/graphics/RectF;

    .line 534
    .line 535
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 536
    .line 537
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-static {v3}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    check-cast v3, Landroid/graphics/RectF;

    .line 546
    .line 547
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 548
    .line 549
    sub-float/2addr v2, v3

    .line 550
    const/high16 v3, 0x42000000    # 32.0f

    .line 551
    .line 552
    add-float/2addr v2, v3

    .line 553
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    check-cast v3, Landroid/graphics/RectF;

    .line 562
    .line 563
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 564
    .line 565
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-static {v4}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    check-cast v4, Landroid/graphics/RectF;

    .line 574
    .line 575
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 576
    .line 577
    sub-float/2addr v3, v4

    .line 578
    const/high16 v4, 0x42380000    # 46.0f

    .line 579
    .line 580
    add-float/2addr v3, v4

    .line 581
    add-float/2addr v2, v9

    .line 582
    add-float/2addr v2, v3

    .line 583
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    sub-float/2addr v3, v2

    .line 592
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    const/4 v6, 0x0

    .line 601
    :goto_3
    if-ge v6, v4, :cond_6

    .line 602
    .line 603
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v7

    .line 607
    add-int/lit8 v6, v6, 0x1

    .line 608
    .line 609
    check-cast v7, Landroid/graphics/RectF;

    .line 610
    .line 611
    invoke-virtual {v7, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 612
    .line 613
    .line 614
    goto :goto_3

    .line 615
    :cond_6
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    const/4 v6, 0x0

    .line 624
    :goto_4
    if-ge v6, v4, :cond_7

    .line 625
    .line 626
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    add-int/lit8 v6, v6, 0x1

    .line 631
    .line 632
    check-cast v7, Landroid/graphics/RectF;

    .line 633
    .line 634
    invoke-virtual {v7, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 635
    .line 636
    .line 637
    goto :goto_4

    .line 638
    :cond_7
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getCustomColor()Landroid/graphics/RectF;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    sub-float/2addr v3, v2

    .line 659
    invoke-virtual {v1, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 660
    .line 661
    .line 662
    :cond_8
    return-void
.end method
