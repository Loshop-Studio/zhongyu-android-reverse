.class public abstract Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field public static final i:Landroid/graphics/PorterDuffXfermode;


# instance fields
.field public a:Landroid/graphics/Canvas;

.field public b:Landroid/graphics/Bitmap;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Canvas;

.field public e:Landroid/graphics/Bitmap;

.field public f:Landroid/graphics/Paint;

.field public g:I

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->i:Landroid/graphics/PorterDuffXfermode;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(IIII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p3, :cond_1

    .line 3
    .line 4
    if-eq p2, p4, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p3, 0x0

    .line 8
    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    move p3, v0

    .line 10
    :goto_1
    if-lez p1, :cond_3

    .line 11
    .line 12
    if-lez p2, :cond_3

    .line 13
    .line 14
    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->a:Landroid/graphics/Canvas;

    .line 15
    .line 16
    if-eqz p4, :cond_2

    .line 17
    .line 18
    if-eqz p3, :cond_3

    .line 19
    .line 20
    :cond_2
    new-instance p3, Landroid/graphics/Canvas;

    .line 21
    .line 22
    invoke-direct {p3}, Landroid/graphics/Canvas;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->a:Landroid/graphics/Canvas;

    .line 26
    .line 27
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 28
    .line 29
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->b:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->a:Landroid/graphics/Canvas;

    .line 36
    .line 37
    invoke-virtual {p4, p3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 38
    .line 39
    .line 40
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->c:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/graphics/Paint;->reset()V

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->a:Landroid/graphics/Canvas;

    .line 46
    .line 47
    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->c:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {p0, p3, p4, p1, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 50
    .line 51
    .line 52
    new-instance p3, Landroid/graphics/Canvas;

    .line 53
    .line 54
    invoke-direct {p3}, Landroid/graphics/Canvas;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 58
    .line 59
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 60
    .line 61
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->e:Landroid/graphics/Bitmap;

    .line 66
    .line 67
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 78
    .line 79
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->g:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->h:Z

    .line 85
    .line 86
    :cond_3
    return-void
.end method

.method public abstract b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->h:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/ImageView;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v3, v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v4, v0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/16 v6, 0x1f

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :try_start_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->h:Z

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->h:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 59
    .line 60
    invoke-virtual {v6, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 64
    .line 65
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 69
    .line 70
    invoke-virtual {v1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 84
    .line 85
    sget-object v3, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->i:Landroid/graphics/PorterDuffXfermode;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->d:Landroid/graphics/Canvas;

    .line 91
    .line 92
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->b:Landroid/graphics/Bitmap;

    .line 93
    .line 94
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-virtual {v1, v3, v2, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->h:Z

    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->e:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_0
    move-exception v1

    .line 118
    goto :goto_2

    .line 119
    :catch_0
    move-exception v1

    .line 120
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_1
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :goto_2
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 128
    .line 129
    .line 130
    throw v1
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move p1, v0

    .line 6
    :cond_0
    if-nez p2, :cond_1

    .line 7
    .line 8
    move p2, v0

    .line 9
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->a(IIII)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setTintColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->g:I

    .line 2
    .line 3
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->f:Landroid/graphics/Paint;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
