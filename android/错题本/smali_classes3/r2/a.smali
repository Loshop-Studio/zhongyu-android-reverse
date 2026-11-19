.class public final Lr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# instance fields
.field public final a:Lr2/k;


# direct methods
.method public constructor <init>(Lr2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr2/a;->a:Lr2/k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lr2/a;->a:Lr2/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-virtual {v0}, Lr2/k;->j()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v3, p0, Lr2/a;->a:Lr2/k;

    .line 21
    .line 22
    iget v4, v3, Lr2/k;->d:F

    .line 23
    .line 24
    cmpg-float v5, v0, v4

    .line 25
    .line 26
    if-gez v5, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3, v4, v2, p1, v1}, Lr2/k;->n(FFFZ)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    cmpl-float v4, v0, v4

    .line 33
    .line 34
    if-ltz v4, :cond_2

    .line 35
    .line 36
    iget v4, v3, Lr2/k;->e:F

    .line 37
    .line 38
    cmpg-float v0, v0, v4

    .line 39
    .line 40
    if-gez v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3, v4, v2, p1, v1}, Lr2/k;->n(FFFZ)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget v0, v3, Lr2/k;->c:F

    .line 47
    .line 48
    invoke-virtual {v3, v0, v2, p1, v1}, Lr2/k;->n(FFFZ)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :catch_0
    :goto_0
    return v1
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr2/a;->a:Lr2/k;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v1}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lr2/a;->a:Lr2/k;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lr2/a;->a:Lr2/k;

    .line 16
    .line 17
    iget-object v1, v1, Lr2/k;->p:Lr2/j;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 25
    .line 26
    .line 27
    check-cast v1, Lw2/a;

    .line 28
    .line 29
    iget-object p1, v1, Lw2/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 30
    .line 31
    iget-object v1, p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->getScale()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/high16 v3, 0x3f800000    # 1.0f

    .line 38
    .line 39
    cmpl-float v2, v2, v3

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget-object p1, v1, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->a:Lr2/k;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    int-to-float v2, v2

    .line 58
    const/high16 v4, 0x40000000    # 2.0f

    .line 59
    .line 60
    div-float/2addr v2, v4

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-float v1, v1

    .line 66
    div-float/2addr v1, v4

    .line 67
    const/4 v4, 0x1

    .line 68
    invoke-virtual {p1, v3, v2, v1, v4}, Lr2/k;->n(FFFZ)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return v0

    .line 72
    :cond_2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q()V

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_0
    return v0
.end method
