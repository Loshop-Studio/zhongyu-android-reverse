.class public Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# instance fields
.field public final a:Lu3/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lu3/b;

    invoke-direct {v0, p1, p2, p3}, Lu3/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    return-void
.end method


# virtual methods
.method public getLabelBackgroundColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v0, v0, Lu3/b;->e:I

    .line 4
    .line 5
    return v0
.end method

.method public getLabelDistance()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->c:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-virtual {v0, v1}, Lu3/b;->c(F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public getLabelHeight()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->d:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-virtual {v0, v1}, Lu3/b;->c(F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public getLabelOrientation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v0, v0, Lu3/b;->n:I

    .line 4
    .line 5
    return v0
.end method

.method public getLabelText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lu3/b;->h:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public getLabelTextColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v0, v0, Lu3/b;->l:I

    .line 4
    .line 5
    return v0
.end method

.method public getLabelTextFont()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lu3/b;->k:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public getLabelTextSize()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->i:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-virtual {v0, v1}, Lu3/b;->c(F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public getLabelTextStyle()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v0, v0, Lu3/b;->j:I

    .line 4
    .line 5
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 13
    .line 14
    invoke-virtual {v2, p1, v0, v1}, Lu3/b;->b(Landroid/graphics/Canvas;II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setLabelBackgroundColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lu3/b;->e:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setLabelDistance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lu3/b;->d(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lu3/b;->e(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelOrientation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lu3/b;->f(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget-object v1, v0, Lu3/b;->h:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iput-object p1, v0, Lu3/b;->h:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setLabelTextColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->l:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lu3/b;->l:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setLabelTextFont(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iput-object p1, v0, Lu3/b;->k:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLabelTextSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->i:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lu3/b;->i:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setLabelTextStyle(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget v1, v0, Lu3/b;->j:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, v0, Lu3/b;->j:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setLabelVisual(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->a:Lu3/b;

    .line 2
    .line 3
    iget-boolean v1, v0, Lu3/b;->m:Z

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-boolean p1, v0, Lu3/b;->m:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
