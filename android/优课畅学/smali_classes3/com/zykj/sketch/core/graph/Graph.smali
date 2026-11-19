.class public abstract Lcom/zykj/sketch/core/graph/Graph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/IGraph;
.implements Lcom/zykj/sketch/core/listener/IDraw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/graph/Graph$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/sketch/core/graph/Graph$Companion;

.field private static final cornerSize:Landroid/graphics/PointF;


# instance fields
.field private complete:Z

.field private final control:Lcom/zykj/sketch/core/listener/IControl;

.field private deleteBitmap:Landroid/graphics/Bitmap;

.field private deletePoint:Landroid/graphics/PointF;

.field private isSelect:Z

.field private final mBorderPaint:Landroid/graphics/Paint;

.field private final mChildExtendMatrix:Landroid/graphics/Matrix;

.field private mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation
.end field

.field private final mDeletePaint:Landroid/graphics/Paint;

.field private mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

.field private final mMatrix:Landroid/graphics/Matrix;

.field private mOutRect:Landroid/graphics/RectF;

.field private final mPaint:Landroid/graphics/Paint;

.field private name:Ljava/lang/String;

.field private showDelete:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/sketch/core/graph/Graph$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/graph/Graph$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/sketch/core/graph/Graph;->Companion:Lcom/zykj/sketch/core/graph/Graph$Companion;

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/PointF;

    .line 10
    .line 11
    const/high16 v1, 0x42700000    # 60.0f

    .line 12
    .line 13
    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/zykj/sketch/core/graph/Graph;->cornerSize:Landroid/graphics/PointF;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 5

    .line 1
    const-string v0, "control"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x2d

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mMatrix:Landroid/graphics/Matrix;

    .line 58
    .line 59
    new-instance v0, Landroid/graphics/Matrix;

    .line 60
    .line 61
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildExtendMatrix:Landroid/graphics/Matrix;

    .line 65
    .line 66
    new-instance v0, Landroid/graphics/RectF;

    .line 67
    .line 68
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 72
    .line 73
    new-instance v0, Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mPaint:Landroid/graphics/Paint;

    .line 79
    .line 80
    new-instance v1, Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mDeletePaint:Landroid/graphics/Paint;

    .line 86
    .line 87
    new-instance v2, Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mBorderPaint:Landroid/graphics/Paint;

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    iput-boolean v3, p0, Lcom/zykj/sketch/core/graph/Graph;->complete:Z

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFlags(I)V

    .line 104
    .line 105
    .line 106
    const v0, -0xffff01

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40000000    # 2.0f

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 115
    .line 116
    .line 117
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 135
    .line 136
    .line 137
    const/high16 v0, -0x10000

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 156
    .line 157
    const/4 v2, 0x2

    .line 158
    new-array v2, v2, [F

    .line 159
    .line 160
    fill-array-data v2, :array_0

    .line 161
    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-direct {v0, v2, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 168
    .line 169
    .line 170
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/IControl;->getDeleteBitmap()Landroid/graphics/Bitmap;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 175
    .line 176
    return-void

    .line 177
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method public static final synthetic access$getCornerSize$cp()Landroid/graphics/PointF;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/graph/Graph;->cornerSize:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method

.method private final drawBorder(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, v0, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->rectConvertPath(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mBorderPaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic findGraph$default(Lcom/zykj/sketch/core/graph/Graph;FFFILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/core/graph/Graph;->findGraph(FFF)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: findGraph"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final showDelete(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, v0, v1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->rectConvertPath(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mDeletePaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 17
    .line 18
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 19
    .line 20
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 21
    .line 22
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {p0, v1, v0, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 31
    .line 32
    sget-object v2, Lcom/zykj/sketch/core/graph/Graph;->cornerSize:Landroid/graphics/PointF;

    .line 33
    .line 34
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    int-to-float v4, v4

    .line 38
    div-float v5, v3, v4

    .line 39
    .line 40
    cmpg-float v1, v1, v5

    .line 41
    .line 42
    if-gez v1, :cond_0

    .line 43
    .line 44
    div-float/2addr v3, v4

    .line 45
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    :cond_0
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-float v3, v3

    .line 54
    iget v5, v2, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    div-float/2addr v5, v4

    .line 57
    sub-float/2addr v3, v5

    .line 58
    cmpl-float v1, v1, v3

    .line 59
    .line 60
    if-lez v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-float v1, v1

    .line 67
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    div-float/2addr v3, v4

    .line 70
    sub-float/2addr v1, v3

    .line 71
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 72
    .line 73
    :cond_1
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 74
    .line 75
    iget v3, v2, Landroid/graphics/PointF;->y:F

    .line 76
    .line 77
    div-float v5, v3, v4

    .line 78
    .line 79
    cmpg-float v1, v1, v5

    .line 80
    .line 81
    if-gez v1, :cond_2

    .line 82
    .line 83
    div-float/2addr v3, v4

    .line 84
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 85
    .line 86
    :cond_2
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    int-to-float v3, v3

    .line 93
    iget v5, v2, Landroid/graphics/PointF;->y:F

    .line 94
    .line 95
    div-float/2addr v5, v4

    .line 96
    sub-float/2addr v3, v5

    .line 97
    cmpl-float v1, v1, v3

    .line 98
    .line 99
    if-lez v1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    int-to-float v1, v1

    .line 106
    iget v3, v2, Landroid/graphics/PointF;->y:F

    .line 107
    .line 108
    div-float/2addr v3, v4

    .line 109
    sub-float/2addr v1, v3

    .line 110
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 111
    .line 112
    :cond_3
    new-instance v1, Landroid/graphics/PointF;

    .line 113
    .line 114
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 115
    .line 116
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 117
    .line 118
    div-float v5, v2, v4

    .line 119
    .line 120
    sub-float/2addr v3, v5

    .line 121
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 122
    .line 123
    div-float/2addr v2, v4

    .line 124
    sub-float/2addr v0, v2

    .line 125
    invoke-direct {v1, v3, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->deletePoint:Landroid/graphics/PointF;

    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 131
    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    :try_start_0
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 135
    .line 136
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 137
    .line 138
    iget-object v3, p0, Lcom/zykj/sketch/core/graph/Graph;->mDeletePaint:Landroid/graphics/Paint;

    .line 139
    .line 140
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    sget-object p1, Lh7/p;->a:Lh7/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catchall_0
    const-string p1, "graph"

    .line 147
    .line 148
    const-string v0, "deleteBitmap\u88ab\u56de\u6536"

    .line 149
    .line 150
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public addGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iput-object p0, p1, Lcom/zykj/sketch/core/graph/Graph;->mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 20
    .line 21
    return-void
.end method

.method public final cancelSelected()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 19
    .line 20
    iput-boolean v2, v1, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 21
    .line 22
    iput-boolean v2, v1, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->cancelSelected()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-boolean v2, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 31
    .line 32
    return-void
.end method

.method public final childTypeNumber(Ljava/lang/String;)I
    .locals 3

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Lcom/zykj/sketch/core/graph/Graph;->childTypeNumber(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return v0
.end method

.method public final clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mMatrix:Landroid/graphics/Matrix;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildExtendMatrix:Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public findGraph(FFF)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
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
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    :goto_0
    const/4 v2, -0x1

    .line 15
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2, p3}, Lcom/zykj/sketch/core/graph/Graph;->findGraph(FFF)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/core/graph/Graph;->isInRect(FFF)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v0
.end method

.method public findGraphByName(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/core/graph/Graph;->findGraphByName(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public findGraphByType(Ljava/lang/Class;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string p1, "null cannot be cast to non-null type T of com.zykj.sketch.core.graph.Graph.findGraphByType"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Lcom/zykj/sketch/core/graph/Graph;->findGraphByType(Ljava/lang/Class;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v0
.end method

.method public final findSelectGraph()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
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
    iget-boolean v1, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->findSelectGraph()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v0
.end method

.method public final getChild()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getChildExtendMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildExtendMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getComplete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->complete:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getControl()Lcom/zykj/sketch/core/listener/IControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGraphName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMFatherGraph()Lcom/zykj/sketch/core/graph/Graph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMOutRect()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMPaint()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOutRect()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final getShowDelete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSnapshotBuild()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 6

    .line 1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IGraph;->graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setGraphType(Lcom/zykj/sketch/GraphSnapshot$GraphType;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 31
    .line 32
    invoke-interface {v2}, Lcom/zykj/sketch/core/listener/IGraph;->getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->addChildGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/16 v1, 0x9

    .line 41
    .line 42
    new-array v2, v1, [F

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    move v4, v3

    .line 53
    :goto_1
    if-ge v4, v1, :cond_1

    .line 54
    .line 55
    aget v5, v2, v4

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->addMatrix(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChildExtendMatrix()Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 68
    .line 69
    .line 70
    :goto_2
    if-ge v3, v1, :cond_2

    .line 71
    .line 72
    aget v4, v2, v3

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->addChildExtendMatrix(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mPaint:Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setWidth(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->mPaint:Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setColor(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 96
    .line 97
    .line 98
    iget-boolean v1, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setIsSelect(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 101
    .line 102
    .line 103
    iget-boolean v1, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setShowDelete(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setName(Ljava/lang/String;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$RectF;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 118
    .line 119
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->setLeft(F)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 126
    .line 127
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->setTop(F)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 134
    .line 135
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->setRight(F)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 142
    .line 143
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->setBottom(F)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setOutRect(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 154
    .line 155
    .line 156
    const-string v1, "builder"

    .line 157
    .line 158
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v0
.end method

.method public final hasChild()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public final isClickDelete(FF)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->deletePoint:Landroid/graphics/PointF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/Graph;->control:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Landroid/graphics/PointF;

    .line 16
    .line 17
    invoke-direct {v2, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 27
    .line 28
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 29
    .line 30
    sget-object v2, Lcom/zykj/sketch/core/graph/Graph;->cornerSize:Landroid/graphics/PointF;

    .line 31
    .line 32
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 33
    .line 34
    add-float/2addr v3, v1

    .line 35
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    add-float/2addr v2, v0

    .line 38
    invoke-direct {p2, v1, v0, v3, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 39
    .line 40
    .line 41
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 42
    .line 43
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 44
    .line 45
    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public isComplete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->complete:Z

    .line 2
    .line 3
    return v0
.end method

.method public isInRect(FFF)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IGraph;->onMeasure()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p0, p1, p2, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2LPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, Landroid/graphics/PointF;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, v1, p3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2LPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    new-instance v0, Landroid/graphics/PointF;

    .line 39
    .line 40
    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 48
    .line 49
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    iget v1, p3, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    iget p3, p3, Landroid/graphics/PointF;->y:F

    .line 54
    .line 55
    invoke-static {v0, p2, v1, p3}, Lcom/zykj/sketch/extensions/ExtensionsKt;->lineSpace(FFFF)F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p0, p1, p3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p3, Landroid/graphics/RectF;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 74
    .line 75
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 76
    .line 77
    sub-float/2addr v1, p2

    .line 78
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 79
    .line 80
    sub-float/2addr v2, p2

    .line 81
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 82
    .line 83
    add-float/2addr v3, p2

    .line 84
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 85
    .line 86
    add-float/2addr v0, p2

    .line 87
    invoke-direct {p3, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 88
    .line 89
    .line 90
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 91
    .line 92
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 93
    .line 94
    invoke-virtual {p3, p2, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1
.end method

.method public final isSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 30
    .line 31
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IGraph;->onMeasure()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->render(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/core/graph/Graph;->onDraw(Landroid/graphics/Canvas;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->drawBorder(Landroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 59
    .line 60
    .line 61
    :cond_2
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->showDelete(Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    const/4 p1, 0x0

    .line 76
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->deletePoint:Landroid/graphics/PointF;

    .line 77
    .line 78
    return-void
.end method

.method public onDrawComplete(Landroid/graphics/Canvas;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "conditionVoid"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IGraph;->onMeasure()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/Graph;->complete:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p2, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->render(Landroid/graphics/Canvas;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1, p2}, Lcom/zykj/sketch/core/graph/Graph;->onDrawComplete(Landroid/graphics/Canvas;Lx7/l;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-void
.end method

.method public removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 7
    iput-object v0, p1, Lcom/zykj/sketch/core/graph/Graph;->mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 8
    invoke-virtual {p1}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    return-void
.end method

.method public removeGraph(Ljava/lang/String;)V
    .locals 2

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    invoke-static {v0, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildGraph:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/core/graph/Graph;

    .line 5
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public render(Landroid/graphics/Canvas;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setChildExtendMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    const-string v0, "matrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildExtendMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final setChildExtendMatrix(Landroid/graphics/PointF;)V
    .locals 2

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mChildExtendMatrix:Landroid/graphics/Matrix;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public final setComplete(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/graph/Graph;->complete:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDeleteBitmap(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/sketch/core/graph/Graph;->cornerSize:Landroid/graphics/PointF;

    .line 7
    .line 8
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    float-to-int v1, v1

    .line 11
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 12
    .line 13
    float-to-int v0, v0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {p1, v1, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->deleteBitmap:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    return-void
.end method

.method public final setMFatherGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->mFatherGraph:Lcom/zykj/sketch/core/graph/Graph;

    .line 2
    .line 3
    return-void
.end method

.method public final setMOutRect(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method

.method public final setMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setOutRect(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setSelect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/graph/Graph;->isSelect:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShowDelete(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/graph/Graph;->showDelete:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/Graph;->mOutRect:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v4, "child= "

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "buffer.toString()"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
