.class public Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/graphics/Paint;

.field public f:I

.field public g:I

.field public h:Landroid/graphics/RectF;


# virtual methods
.method public getPressedColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->e:Landroid/graphics/Paint;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->f:I

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->a:I

    .line 14
    .line 15
    int-to-float v2, v1

    .line 16
    const/high16 v3, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float/2addr v2, v3

    .line 19
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->b:I

    .line 20
    .line 21
    int-to-float v4, v4

    .line 22
    div-float/2addr v4, v3

    .line 23
    int-to-float v1, v1

    .line 24
    const v3, 0x4006a4a9    # 2.1038f

    .line 25
    .line 26
    .line 27
    div-float/2addr v1, v3

    .line 28
    invoke-virtual {p1, v2, v4, v1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->h:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->g:I

    .line 35
    .line 36
    int-to-float v3, v2

    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p1, v1, v3, v2, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->b:I

    .line 7
    .line 8
    new-instance p1, Landroid/graphics/RectF;

    .line 9
    .line 10
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->a:I

    .line 11
    .line 12
    int-to-float p2, p2

    .line 13
    iget p3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->b:I

    .line 14
    .line 15
    int-to-float p3, p3

    .line 16
    const/4 p4, 0x0

    .line 17
    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->h:Landroid/graphics/RectF;

    .line 21
    .line 22
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->e:Landroid/graphics/Paint;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->e:Landroid/graphics/Paint;

    .line 25
    .line 26
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->c:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method public setPressedColor(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->e:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->d:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
