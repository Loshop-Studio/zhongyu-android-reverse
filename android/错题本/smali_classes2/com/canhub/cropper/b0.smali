.class public final Lcom/canhub/cropper/b0;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/canhub/cropper/CropOverlayView;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/CropOverlayView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/b0;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 8

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/b0;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpanY()F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v6, 0x2

    .line 29
    int-to-float v6, v6

    .line 30
    div-float/2addr v5, v6

    .line 31
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpanX()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    div-float/2addr p1, v6

    .line 36
    sub-float v6, v4, v5

    .line 37
    .line 38
    sub-float v7, v3, p1

    .line 39
    .line 40
    add-float/2addr v3, p1

    .line 41
    add-float/2addr v4, v5

    .line 42
    cmpg-float p1, v7, v3

    .line 43
    .line 44
    if-gez p1, :cond_0

    .line 45
    .line 46
    cmpg-float p1, v6, v4

    .line 47
    .line 48
    if-gtz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    cmpl-float v5, v7, p1

    .line 52
    .line 53
    if-ltz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/canhub/cropper/e0;->c()F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    cmpg-float v5, v3, v5

    .line 60
    .line 61
    if-gtz v5, :cond_0

    .line 62
    .line 63
    cmpl-float p1, v6, p1

    .line 64
    .line 65
    if-ltz p1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/canhub/cropper/e0;->b()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    cmpg-float p1, v4, p1

    .line 72
    .line 73
    if-gtz p1, :cond_0

    .line 74
    .line 75
    invoke-virtual {v1, v7, v6, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v2, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 84
    .line 85
    .line 86
    :cond_0
    const/4 p1, 0x1

    .line 87
    return p1
.end method
