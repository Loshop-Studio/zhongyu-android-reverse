.class public final Lcom/zykj/camera/view/ManualPointView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/camera/view/ManualPointView$PointType;,
        Lcom/zykj/camera/view/ManualPointView$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/camera/view/ManualPointView$a;


# instance fields
.field public a:Ljava/util/Map;

.field public b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public final d:Landroid/graphics/Paint;

.field public e:Lcom/zykj/camera/view/ManualPointView$PointType;

.field public f:Landroid/graphics/Bitmap;

.field public g:F

.field public h:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/camera/view/ManualPointView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/camera/view/ManualPointView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/camera/view/ManualPointView;->i:Lcom/zykj/camera/view/ManualPointView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 17
    .line 18
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->c:Ljava/util/Map;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->d:Landroid/graphics/Paint;

    .line 31
    .line 32
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    const v0, -0xff0100

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/high16 v0, 0x41200000    # 10.0f

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lj5/a;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lj5/a;-><init>(Lcom/zykj/camera/view/ManualPointView;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/camera/view/ManualPointView;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/camera/view/ManualPointView;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->f:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final e(FF)Lcom/zykj/camera/view/ManualPointView$PointType;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 34
    .line 35
    .line 36
    :cond_1
    check-cast v2, Landroid/graphics/Point;

    .line 37
    .line 38
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 39
    .line 40
    int-to-float v4, v3

    .line 41
    sub-float/2addr v4, p1

    .line 42
    int-to-float v3, v3

    .line 43
    sub-float/2addr v3, p1

    .line 44
    mul-float/2addr v4, v3

    .line 45
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 46
    .line 47
    int-to-float v3, v2

    .line 48
    sub-float/2addr v3, p2

    .line 49
    int-to-float v2, v2

    .line 50
    sub-float/2addr v2, p2

    .line 51
    mul-float/2addr v3, v2

    .line 52
    add-float/2addr v4, v3

    .line 53
    const v2, 0x459c4000    # 5000.0f

    .line 54
    .line 55
    .line 56
    cmpg-float v2, v4, v2

    .line 57
    .line 58
    if-gtz v2, :cond_0

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public final f(Lcom/zykj/camera/view/ManualPointView$PointType;Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 10
    .line 11
    .line 12
    :cond_0
    check-cast v0, Landroid/graphics/Point;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 23
    .line 24
    .line 25
    :cond_1
    check-cast v1, Landroid/graphics/Point;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->c:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 36
    .line 37
    .line 38
    :cond_2
    check-cast p1, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 41
    .line 42
    int-to-float v2, v2

    .line 43
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-float/2addr v2, v3

    .line 48
    iget v3, p0, Lcom/zykj/camera/view/ManualPointView;->g:F

    .line 49
    .line 50
    sub-float/2addr v2, v3

    .line 51
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 52
    .line 53
    int-to-float v1, v1

    .line 54
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    add-float/2addr v1, p2

    .line 59
    iget p2, p0, Lcom/zykj/camera/view/ManualPointView;->h:F

    .line 60
    .line 61
    sub-float/2addr v1, p2

    .line 62
    invoke-virtual {p1, v2, v1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    float-to-int p1, v2

    .line 69
    float-to-int p2, v1

    .line 70
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    iget p2, p1, Landroid/graphics/RectF;->left:F

    .line 75
    .line 76
    cmpg-float v3, v2, p2

    .line 77
    .line 78
    if-gez v3, :cond_4

    .line 79
    .line 80
    :goto_0
    move v2, p2

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    iget p2, p1, Landroid/graphics/RectF;->right:F

    .line 83
    .line 84
    cmpl-float v3, v2, p2

    .line 85
    .line 86
    if-lez v3, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    :goto_1
    iget p2, p1, Landroid/graphics/RectF;->top:F

    .line 90
    .line 91
    cmpg-float v3, v1, p2

    .line 92
    .line 93
    if-gez v3, :cond_6

    .line 94
    .line 95
    move v1, p2

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 98
    .line 99
    cmpl-float p2, v1, p1

    .line 100
    .line 101
    if-lez p2, :cond_7

    .line 102
    .line 103
    move v1, p1

    .line 104
    :cond_7
    :goto_2
    float-to-int p1, v2

    .line 105
    float-to-int p2, v1

    .line 106
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final getCurrentClickPointType()Lcom/zykj/camera/view/ManualPointView$PointType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->e:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPointMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/zykj/camera/view/ManualPointView$PointType;",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRangeRectMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/zykj/camera/view/ManualPointView$PointType;",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->f:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->f:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/graphics/Point;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    const/high16 v3, 0x41200000    # 10.0f

    .line 48
    .line 49
    iget-object v4, p0, Lcom/zykj/camera/view/ManualPointView;->d:Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    if-eq v1, v0, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView;->e:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0, v1, p1}, Lcom/zykj/camera/view/ManualPointView;->f(Lcom/zykj/camera/view/ManualPointView$PointType;Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->e:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 25
    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 37
    .line 38
    .line 39
    :cond_2
    check-cast v1, Landroid/graphics/Point;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 42
    .line 43
    new-instance v3, Landroid/graphics/Point;

    .line 44
    .line 45
    invoke-direct {v3, v1}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v1, p0, Lcom/zykj/camera/view/ManualPointView;->g:F

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iput v1, p0, Lcom/zykj/camera/view/ManualPointView;->h:F

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {p0, v1, p1}, Lcom/zykj/camera/view/ManualPointView;->e(FF)Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->e:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 77
    .line 78
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 79
    .line 80
    .line 81
    :cond_5
    return v0
.end method

.method public final setBackBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/camera/view/ManualPointView$b;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/camera/view/ManualPointView$b;-><init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setCurrentClickPointType(Lcom/zykj/camera/view/ManualPointView$PointType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/camera/view/ManualPointView;->e:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 2
    .line 3
    return-void
.end method

.method public final setImagePath(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/camera/view/ManualPointView$c;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/camera/view/ManualPointView$c;-><init>(Lcom/zykj/camera/view/ManualPointView;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setPointMap(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/zykj/camera/view/ManualPointView$PointType;",
            "Landroid/graphics/Point;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->a:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/graphics/Point;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v3, Landroid/graphics/Point;

    .line 19
    .line 20
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 21
    .line 22
    iget v5, v1, Landroid/graphics/Point;->y:I

    .line 23
    .line 24
    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 31
    .line 32
    new-instance v3, Landroid/graphics/Point;

    .line 33
    .line 34
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 35
    .line 36
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 37
    .line 38
    invoke-direct {v3, v4, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->c:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 45
    .line 46
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/graphics/Point;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 55
    .line 56
    new-instance v3, Landroid/graphics/Point;

    .line 57
    .line 58
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 59
    .line 60
    iget v5, v1, Landroid/graphics/Point;->y:I

    .line 61
    .line 62
    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 69
    .line 70
    new-instance v3, Landroid/graphics/Point;

    .line 71
    .line 72
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 73
    .line 74
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 75
    .line 76
    invoke-direct {v3, v4, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_1
    sget-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->b:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 83
    .line 84
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroid/graphics/Point;

    .line 89
    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 93
    .line 94
    new-instance v3, Landroid/graphics/Point;

    .line 95
    .line 96
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 97
    .line 98
    iget v5, v1, Landroid/graphics/Point;->y:I

    .line 99
    .line 100
    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 107
    .line 108
    new-instance v3, Landroid/graphics/Point;

    .line 109
    .line 110
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 111
    .line 112
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 113
    .line 114
    invoke-direct {v3, v4, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_2
    sget-object v0, Lcom/zykj/camera/view/ManualPointView$PointType;->d:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 121
    .line 122
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Landroid/graphics/Point;

    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView;->a:Ljava/util/Map;

    .line 131
    .line 132
    new-instance v2, Landroid/graphics/Point;

    .line 133
    .line 134
    iget v3, p1, Landroid/graphics/Point;->x:I

    .line 135
    .line 136
    iget v4, p1, Landroid/graphics/Point;->y:I

    .line 137
    .line 138
    invoke-direct {v2, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    iget-object v1, p0, Lcom/zykj/camera/view/ManualPointView;->b:Ljava/util/Map;

    .line 145
    .line 146
    new-instance v2, Landroid/graphics/Point;

    .line 147
    .line 148
    iget v3, p1, Landroid/graphics/Point;->x:I

    .line 149
    .line 150
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 151
    .line 152
    invoke-direct {v2, v3, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_3
    return-void
.end method
