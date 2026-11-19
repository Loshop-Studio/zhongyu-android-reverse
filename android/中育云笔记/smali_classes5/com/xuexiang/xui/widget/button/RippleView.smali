.class public Lcom/xuexiang/xui/widget/button/RippleView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/RippleView$RippleType;,
        Lcom/xuexiang/xui/widget/button/RippleView$c;
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroid/os/Handler;

.field public i:F

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:F

.field public o:F

.field public p:I

.field public q:F

.field public r:Landroid/view/animation/ScaleAnimation;

.field public s:Ljava/lang/Boolean;

.field public t:Ljava/lang/Boolean;

.field public u:Ljava/lang/Integer;

.field public v:Landroid/graphics/Paint;

.field public w:Landroid/graphics/Bitmap;

.field public x:I

.field public y:I

.field public z:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RippleViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/RippleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    const/16 v0, 0x190

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    const/16 v0, 0x5a

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:Z

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->l:I

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 14
    new-instance v0, Lcom/xuexiang/xui/widget/button/RippleView$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/RippleView$a;-><init>(Lcom/xuexiang/xui/widget/button/RippleView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->A:Ljava/lang/Runnable;

    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/RippleView;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/button/RippleView;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->h(Ljava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->c(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c(FF)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:Z

    .line 8
    .line 9
    if-nez v0, :cond_5

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->s:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->r:Landroid/view/animation/ScaleAnimation;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->c:I

    .line 25
    .line 26
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->d:I

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    int-to-float v0, v0

    .line 33
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x2

    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    .line 44
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 45
    .line 46
    const/high16 v1, 0x40000000    # 2.0f

    .line 47
    .line 48
    div-float/2addr v0, v1

    .line 49
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 50
    .line 51
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 52
    .line 53
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:I

    .line 54
    .line 55
    int-to-float v1, v1

    .line 56
    sub-float/2addr v0, v1

    .line 57
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->t:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x1

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-ne v0, v1, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 78
    .line 79
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    shr-int/2addr p1, v1

    .line 87
    int-to-float p1, p1

    .line 88
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    shr-int/2addr p1, v1

    .line 95
    int-to-float p1, p1

    .line 96
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 97
    .line 98
    :goto_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:Z

    .line 99
    .line 100
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 109
    .line 110
    if-nez p1, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Landroid/view/View;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 117
    .line 118
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 119
    .line 120
    .line 121
    :cond_5
    return-void
.end method

.method public final d(I)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroid/graphics/Canvas;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v3, Landroid/graphics/Rect;

    .line 30
    .line 31
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    sub-float v5, v4, p1

    .line 35
    .line 36
    float-to-int v5, v5

    .line 37
    iget v6, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 38
    .line 39
    sub-float v7, v6, p1

    .line 40
    .line 41
    float-to-int v7, v7

    .line 42
    add-float/2addr v4, p1

    .line 43
    float-to-int v4, v4

    .line 44
    add-float/2addr v6, p1

    .line 45
    float-to-int v6, v6

    .line 46
    invoke-direct {v3, v5, v7, v4, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 55
    .line 56
    .line 57
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 58
    .line 59
    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 60
    .line 61
    invoke-virtual {v1, v4, v5, p1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    .line 65
    .line 66
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 67
    .line 68
    invoke-direct {p1, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v1, p1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:Z

    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 14
    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 16
    .line 17
    mul-int/2addr v1, v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-gt v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->j:Z

    .line 23
    .line 24
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 25
    .line 26
    iput v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    .line 27
    .line 28
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->l:I

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->h:Landroid/os/Handler;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->A:Ljava/lang/Runnable;

    .line 40
    .line 41
    int-to-long v4, v2

    .line 42
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 50
    .line 51
    .line 52
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->n:F

    .line 53
    .line 54
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->o:F

    .line 55
    .line 56
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 57
    .line 58
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 59
    .line 60
    int-to-float v4, v4

    .line 61
    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 62
    .line 63
    int-to-float v5, v5

    .line 64
    mul-float/2addr v4, v5

    .line 65
    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 66
    .line 67
    int-to-float v5, v5

    .line 68
    div-float/2addr v4, v5

    .line 69
    mul-float/2addr v2, v4

    .line 70
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 76
    .line 77
    const-string v1, "#FFFF4444"

    .line 78
    .line 79
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const/4 v1, 0x1

    .line 93
    if-ne v0, v1, :cond_3

    .line 94
    .line 95
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->w:Landroid/graphics/Bitmap;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 100
    .line 101
    int-to-float v2, v0

    .line 102
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 103
    .line 104
    int-to-float v5, v4

    .line 105
    mul-float/2addr v2, v5

    .line 106
    iget v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 107
    .line 108
    int-to-float v6, v5

    .line 109
    div-float/2addr v2, v6

    .line 110
    const v6, 0x3ecccccd    # 0.4f

    .line 111
    .line 112
    .line 113
    cmpl-float v2, v2, v6

    .line 114
    .line 115
    if-lez v2, :cond_3

    .line 116
    .line 117
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    .line 118
    .line 119
    if-ne v2, v3, :cond_2

    .line 120
    .line 121
    mul-int/2addr v0, v4

    .line 122
    sub-int/2addr v5, v0

    .line 123
    iput v5, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    .line 124
    .line 125
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->l:I

    .line 126
    .line 127
    add-int/2addr v0, v1

    .line 128
    iput v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->l:I

    .line 129
    .line 130
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->i:F

    .line 131
    .line 132
    int-to-float v0, v0

    .line 133
    int-to-float v3, v4

    .line 134
    mul-float/2addr v0, v3

    .line 135
    iget v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    .line 136
    .line 137
    int-to-float v3, v3

    .line 138
    div-float/2addr v0, v3

    .line 139
    mul-float/2addr v2, v0

    .line 140
    float-to-int v0, v2

    .line 141
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/RippleView;->d(I)Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    invoke-virtual {p1, v0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 152
    .line 153
    .line 154
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 155
    .line 156
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:I

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-ne p1, v1, :cond_5

    .line 168
    .line 169
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 170
    .line 171
    int-to-float p1, p1

    .line 172
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 173
    .line 174
    int-to-float v2, v0

    .line 175
    mul-float/2addr p1, v2

    .line 176
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 177
    .line 178
    int-to-float v2, v2

    .line 179
    div-float/2addr p1, v2

    .line 180
    const v2, 0x3f19999a    # 0.6f

    .line 181
    .line 182
    .line 183
    cmpl-float p1, p1, v2

    .line 184
    .line 185
    if-lez p1, :cond_4

    .line 186
    .line 187
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 188
    .line 189
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 190
    .line 191
    int-to-float v3, v2

    .line 192
    int-to-float v2, v2

    .line 193
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->l:I

    .line 194
    .line 195
    int-to-float v4, v4

    .line 196
    int-to-float v0, v0

    .line 197
    mul-float/2addr v4, v0

    .line 198
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->m:I

    .line 199
    .line 200
    int-to-float v0, v0

    .line 201
    div-float/2addr v4, v0

    .line 202
    mul-float/2addr v2, v4

    .line 203
    sub-float/2addr v3, v2

    .line 204
    float-to-int v0, v3

    .line 205
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 210
    .line 211
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 214
    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 218
    .line 219
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 220
    .line 221
    int-to-float v2, v0

    .line 222
    int-to-float v0, v0

    .line 223
    iget v3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 224
    .line 225
    int-to-float v3, v3

    .line 226
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 227
    .line 228
    int-to-float v4, v4

    .line 229
    mul-float/2addr v3, v4

    .line 230
    iget v4, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 231
    .line 232
    int-to-float v4, v4

    .line 233
    div-float/2addr v3, v4

    .line 234
    mul-float/2addr v0, v3

    .line 235
    sub-float/2addr v2, v0

    .line 236
    float-to-int v0, v2

    .line 237
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 238
    .line 239
    .line 240
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 241
    .line 242
    add-int/2addr p1, v1

    .line 243
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->k:I

    .line 244
    .line 245
    :cond_6
    return-void
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/RippleView;->f(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/RippleView;->g()V

    .line 5
    .line 6
    .line 7
    new-instance p2, Landroid/view/GestureDetector;

    .line 8
    .line 9
    new-instance p3, Lcom/xuexiang/xui/widget/button/RippleView$b;

    .line 10
    .line 11
    invoke-direct {p3, p0}, Lcom/xuexiang/xui/widget/button/RippleView$b;-><init>(Lcom/xuexiang/xui/widget/button/RippleView;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->z:Landroid/view/GestureDetector;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final f(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RippleView:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_color:I

    .line 9
    .line 10
    sget p3, Lcom/xuexiang/xui/R$color;->xui_config_color_white:I

    .line 11
    .line 12
    invoke-static {p3}, Lcom/xuexiang/xui/utils/f;->c(I)I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:I

    .line 21
    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_type:I

    .line 23
    .line 24
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 33
    .line 34
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoom:I

    .line 35
    .line 36
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->s:Ljava/lang/Boolean;

    .line 45
    .line 46
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_centered:I

    .line 47
    .line 48
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->t:Ljava/lang/Boolean;

    .line 57
    .line 58
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_rippleDuration:I

    .line 59
    .line 60
    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 61
    .line 62
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 67
    .line 68
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_frameRate:I

    .line 69
    .line 70
    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 71
    .line 72
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 77
    .line 78
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_alpha:I

    .line 79
    .line 80
    iget p3, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 81
    .line 82
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 87
    .line 88
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_ripplePadding:I

    .line 89
    .line 90
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:I

    .line 95
    .line 96
    new-instance p2, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->h:Landroid/os/Handler;

    .line 102
    .line 103
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoomScale:I

    .line 104
    .line 105
    const p3, 0x3f83d70a    # 1.03f

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->q:F

    .line 113
    .line 114
    sget p2, Lcom/xuexiang/xui/R$styleable;->RippleView_rv_zoomDuration:I

    .line 115
    .line 116
    const/16 p3, 0xc8

    .line 117
    .line 118
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->p:I

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 13
    .line 14
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->v:Landroid/graphics/Paint;

    .line 27
    .line 28
    iget v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public getFrameRate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getRipplePadding()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleType()Lcom/xuexiang/xui/widget/button/RippleView$RippleType;
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/button/RippleView$RippleType;->values()[Lcom/xuexiang/xui/widget/button/RippleView$RippleType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    return-object v0
.end method

.method public getZoomDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getZoomScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->q:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(Ljava/lang/Boolean;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/widget/AdapterView;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Landroid/widget/AdapterView;

    .line 15
    .line 16
    invoke-virtual {v2, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v2, v4}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v3, p0

    .line 41
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v3, p0

    .line 56
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public onSizeChanged(IIII)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->c:I

    .line 5
    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->d:I

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    .line 9
    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/button/RippleView;->q:F

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    shr-int/2addr p1, p3

    .line 14
    int-to-float v5, p1

    .line 15
    shr-int/lit8 p1, p2, 0x1

    .line 16
    .line 17
    int-to-float v6, p1

    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/high16 v3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    move v4, v2

    .line 23
    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->r:Landroid/view/animation/ScaleAnimation;

    .line 27
    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->p:I

    .line 29
    .line 30
    int-to-long p1, p1

    .line 31
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->r:Landroid/view/animation/ScaleAnimation;

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-virtual {p1, p2}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->r:Landroid/view/animation/ScaleAnimation;

    .line 41
    .line 42
    invoke-virtual {p1, p3}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/RippleView;->z:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/RippleView;->b(Landroid/view/MotionEvent;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/RippleView;->h(Ljava/lang/Boolean;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public setCentered(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->t:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public setFrameRate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnRippleCompleteListener(Lcom/xuexiang/xui/widget/button/RippleView$c;)V
    .locals 0

    return-void
.end method

.method public setRippleAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->x:I

    .line 10
    .line 11
    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public setRipplePadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->y:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleType(Lcom/xuexiang/xui/widget/button/RippleView$RippleType;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->u:Ljava/lang/Integer;

    .line 10
    .line 11
    return-void
.end method

.method public setZoomDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->p:I

    .line 2
    .line 3
    return-void
.end method

.method public setZoomScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->q:F

    .line 2
    .line 3
    return-void
.end method

.method public setZooming(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/RippleView;->s:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method
