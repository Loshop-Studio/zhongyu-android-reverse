.class public Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# instance fields
.field utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;


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
    new-instance v0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-direct {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    return-void
.end method


# virtual methods
.method public getLabelBackgroundColor()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelBackgroundColor()I

    move-result v0

    return v0
.end method

.method public getLabelDistance()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelDistance()I

    move-result v0

    return v0
.end method

.method public getLabelHeight()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelHeight()I

    move-result v0

    return v0
.end method

.method public getLabelOrientation()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelOrientation()I

    move-result v0

    return v0
.end method

.method public getLabelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLabelTextColor()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelTextColor()I

    move-result v0

    return v0
.end method

.method public getLabelTextFont()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelTextFont()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLabelTextSize()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelTextSize()I

    move-result v0

    return v0
.end method

.method public getLabelTextStyle()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->getLabelTextStyle()I

    move-result v0

    return v0
.end method

.method public isLabelVisual()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->isLabelVisual()Z

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {p0}, Landroid/widget/Button;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/Button;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->onDraw(Landroid/graphics/Canvas;II)V

    return-void
.end method

.method public setLabelBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelBackgroundColor(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelDistance(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelDistance(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelHeight(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelHeight(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelOrientation(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelOrientation(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelText(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public setLabelTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelTextColor(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelTextFont(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelTextFont(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public setLabelTextSize(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelTextSize(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelTextStyle(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelTextStyle(Landroid/view/View;I)V

    return-void
.end method

.method public setLabelVisual(Z)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelButtonView;->utils:Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;

    invoke-virtual {v0, p0, p1}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->setLabelVisual(Landroid/view/View;Z)V

    return-void
.end method
