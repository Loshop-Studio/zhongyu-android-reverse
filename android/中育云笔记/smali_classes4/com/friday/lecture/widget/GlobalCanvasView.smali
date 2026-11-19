.class public final Lcom/friday/lecture/widget/GlobalCanvasView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/widget/GlobalCanvasView$a;,
        Lcom/friday/lecture/widget/GlobalCanvasView$b;
    }
.end annotation


# static fields
.field public static final n:Lcom/friday/lecture/widget/GlobalCanvasView$a;

.field public static final o:I


# instance fields
.field public c:F

.field public d:I

.field public e:F

.field public f:Landroid/graphics/Path;

.field public final g:Landroid/graphics/Paint;

.field public final h:Landroid/graphics/Paint;

.field public i:F

.field public j:F

.field public k:Landroid/graphics/Bitmap;

.field public l:Landroid/graphics/Canvas;

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/lecture/widget/GlobalCanvasView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/lecture/widget/GlobalCanvasView$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/lecture/widget/GlobalCanvasView;->n:Lcom/friday/lecture/widget/GlobalCanvasView$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/lecture/widget/GlobalCanvasView;->o:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, 0x40400000    # 3.0f

    .line 5
    .line 6
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->c:F

    .line 7
    .line 8
    const-string p1, "#FF4931"

    .line 9
    .line 10
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->d:I

    .line 15
    .line 16
    const/high16 p1, 0x42f00000    # 120.0f

    .line 17
    .line 18
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->e:F

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 28
    .line 29
    .line 30
    new-instance p2, Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 39
    .line 40
    .line 41
    iget v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->d:I

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 52
    .line 53
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 54
    .line 55
    .line 56
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 57
    .line 58
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 59
    .line 60
    .line 61
    iget v2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->c:F

    .line 62
    .line 63
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 67
    .line 68
    new-instance p2, Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 74
    .line 75
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 76
    .line 77
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 97
    .line 98
    .line 99
    iget p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->e:F

    .line 100
    .line 101
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->h:Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const-string p2, "getDisplayMetrics(...)"

    .line 115
    .line 116
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 120
    .line 121
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 122
    .line 123
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 124
    .line 125
    invoke-static {p2, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 130
    .line 131
    new-instance p1, Landroid/graphics/Canvas;

    .line 132
    .line 133
    iget-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 134
    .line 135
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 142
    .line 143
    new-instance p1, Landroid/graphics/Path;

    .line 144
    .line 145
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 151
    .line 152
    .line 153
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(FF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 2
    .line 3
    iget v1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->i:F

    .line 4
    .line 5
    iget v2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->j:F

    .line 6
    .line 7
    add-float v3, p1, v1

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    int-to-float v4, v4

    .line 11
    div-float/2addr v3, v4

    .line 12
    add-float v5, p2, v2

    .line 13
    .line 14
    div-float/2addr v5, v4

    .line 15
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 16
    .line 17
    .line 18
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->i:F

    .line 19
    .line 20
    iput p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->j:F

    .line 21
    .line 22
    iget p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 28
    .line 29
    iget-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->h:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 38
    .line 39
    iget-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final c(FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getDisplayMetrics(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 19
    .line 20
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 21
    .line 22
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Canvas;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 50
    .line 51
    .line 52
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->i:F

    .line 53
    .line 54
    iput p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->j:F

    .line 55
    .line 56
    iget p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    if-ne p1, p2, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->h:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 2
    .line 3
    iget v1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->i:F

    .line 4
    .line 5
    iget v2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->j:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->h:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->l:Landroid/graphics/Canvas;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->f:Landroid/graphics/Path;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

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
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "arg0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p2, :cond_3

    .line 32
    .line 33
    if-eq p2, v2, :cond_2

    .line 34
    .line 35
    if-eq p2, v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/friday/lecture/widget/GlobalCanvasView;->b(FF)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/friday/lecture/widget/GlobalCanvasView;->d()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    invoke-virtual {p0, p1, v1}, Lcom/friday/lecture/widget/GlobalCanvasView;->c(FF)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 50
    .line 51
    .line 52
    return v2
.end method

.method public final setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->k:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public final setMode(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->m:I

    .line 11
    .line 12
    return-void
.end method

.method public final setOnDrawChangedListener(Lcom/friday/lecture/widget/GlobalCanvasView$b;)V
    .locals 0

    return-void
.end method

.method public final setPaintColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->d:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPaintSize(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->c:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/widget/GlobalCanvasView;->g:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
