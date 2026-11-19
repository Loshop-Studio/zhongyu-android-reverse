.class public final Lcom/zykj/blackboard/utils/RectBoardUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/RectBoardUtils;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/RectBoardUtils;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/RectBoardUtils;->INSTANCE:Lcom/zykj/blackboard/utils/RectBoardUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getSelectActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;
    .locals 4

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    int-to-float v1, v1

    .line 18
    div-float/2addr p3, v1

    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    div-float/2addr p3, v1

    .line 26
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    add-float/2addr v1, p3

    .line 29
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 32
    .line 33
    .line 34
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 35
    .line 36
    sub-float/2addr v1, p3

    .line 37
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 40
    .line 41
    .line 42
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 45
    .line 46
    add-float/2addr v2, p3

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 48
    .line 49
    .line 50
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 53
    .line 54
    sub-float/2addr v2, p3

    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 56
    .line 57
    .line 58
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 59
    .line 60
    sub-float/2addr v1, p3

    .line 61
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 64
    .line 65
    .line 66
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 67
    .line 68
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 71
    .line 72
    .line 73
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 78
    .line 79
    .line 80
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 83
    .line 84
    add-float/2addr v2, p3

    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 89
    .line 90
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 91
    .line 92
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 93
    .line 94
    invoke-virtual {v1, v0, v2, v3, p3}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawRotateIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 95
    .line 96
    .line 97
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 98
    .line 99
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2, v3, p3}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawDeleteIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 102
    .line 103
    .line 104
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 105
    .line 106
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    invoke-virtual {v1, v0, v2, p1, p3}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawScaleIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method

.method public final getTextActionRectBoardPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;F)Landroid/graphics/Path;
    .locals 5

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    int-to-float v1, v1

    .line 18
    div-float/2addr p3, v1

    .line 19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {p2, v2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    div-float/2addr p3, v2

    .line 26
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 31
    .line 32
    .line 33
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 34
    .line 35
    sub-float/2addr v2, p3

    .line 36
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 39
    .line 40
    .line 41
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    add-float/2addr v3, p3

    .line 46
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 47
    .line 48
    .line 49
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 50
    .line 51
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 52
    .line 53
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 54
    .line 55
    .line 56
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 57
    .line 58
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 59
    .line 60
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 61
    .line 62
    .line 63
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 64
    .line 65
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 68
    .line 69
    .line 70
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 73
    .line 74
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 75
    .line 76
    .line 77
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 80
    .line 81
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 82
    .line 83
    .line 84
    sget-object v2, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 85
    .line 86
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 87
    .line 88
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 89
    .line 90
    invoke-virtual {v2, v0, v3, v4, p3}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawDeleteIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 91
    .line 92
    .line 93
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 94
    .line 95
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    div-float v1, p3, v1

    .line 98
    .line 99
    sub-float/2addr v3, v1

    .line 100
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 101
    .line 102
    .line 103
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 104
    .line 105
    sub-float/2addr v2, v1

    .line 106
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 109
    .line 110
    .line 111
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 112
    .line 113
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 114
    .line 115
    sub-float/2addr v2, p3

    .line 116
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 117
    .line 118
    .line 119
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 120
    .line 121
    sub-float/2addr v1, p3

    .line 122
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 123
    .line 124
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method
