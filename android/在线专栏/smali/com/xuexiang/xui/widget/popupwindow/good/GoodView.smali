.class public Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;
.super Landroid/widget/PopupWindow;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;


# instance fields
.field private mAnimationSet:Landroid/view/animation/AnimationSet;

.field private mChanged:Z

.field private mContent:Landroid/widget/TextView;

.field private mDistance:I

.field private mDuration:I

.field private mFromAlpha:F

.field private mFromY:I

.field private mText:Ljava/lang/String;

.field private mTextColor:I

.field private mTextSize:I

.field private mToAlpha:F

.field private mToY:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mText:Ljava/lang/String;

    const/high16 v0, -0x1000000

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextColor:I

    const/16 v0, 0x10

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextSize:I

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromY:I

    const/16 v1, 0x3c

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToY:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromAlpha:F

    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToAlpha:F

    const/16 v2, 0x320

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDuration:I

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->initView(Landroid/content/Context;)V

    return-void
.end method

.method private createAnimation()Landroid/view/animation/AnimationSet;
    .locals 5

    .line 1
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 2
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromY:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToY:I

    neg-int v3, v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 3
    new-instance v2, Landroid/view/animation/AlphaAnimation;

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromAlpha:F

    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToAlpha:F

    invoke-direct {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 5
    invoke-virtual {v0, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 7
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-object v0
.end method

.method private static getTextViewHeight(Landroid/widget/TextView;I)I
    .locals 1

    const/high16 v0, -0x80000000

    .line 1
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 3
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->measure(II)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result p0

    return p0
.end method

.method private initView(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xe

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v2, 0xc

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 5
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    const/4 p1, 0x0

    .line 6
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextSize:I

    int-to-float v3, v3

    const/4 v4, 0x1

    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextColor:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mText:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 13
    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 14
    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->measure(II)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 17
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 18
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 21
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 22
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->createAnimation()Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mAnimationSet:Landroid/view/animation/AnimationSet;

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 3

    const-string v0, ""

    .line 1
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mText:Ljava/lang/String;

    const/high16 v0, -0x1000000

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextColor:I

    const/16 v0, 0x10

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextSize:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromY:I

    const/16 v1, 0x3c

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToY:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromAlpha:F

    const/4 v2, 0x0

    .line 7
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToAlpha:F

    const/16 v2, 0x320

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDuration:I

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->createAnimation()Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mAnimationSet:Landroid/view/animation/AnimationSet;

    return-void
.end method

.method public setAlpha(FF)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromAlpha:F

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToAlpha:F

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    return-object p0
.end method

.method public setDistance(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToY:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-object p0
.end method

.method public setDuration(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDuration:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    return-object p0
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-object p0

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "drawable cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setImageResource(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;

    move-result-object p1

    return-object p1
.end method

.method public setText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mText:Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-int p1, p1

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mDistance:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-static {v1, p1}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->getTextViewHeight(Landroid/widget/TextView;I)I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "text cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTextColor(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setTextInfo(Ljava/lang/String;II)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->setTextColor(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;

    .line 2
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->setTextSize(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->setText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;

    return-object p0
.end method

.method public setTextSize(I)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 2

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mTextSize:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    int-to-float p1, p1

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-object p0
.end method

.method public setTranslateY(II)Lcom/xuexiang/xui/widget/popupwindow/good/IGoodView;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mFromY:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mToY:I

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    return-object p0
.end method

.method public show(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    invoke-virtual {p0, p1, v1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mAnimationSet:Landroid/view/animation/AnimationSet;

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    if-eqz p1, :cond_1

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->createAnimation()Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mAnimationSet:Landroid/view/animation/AnimationSet;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mChanged:Z

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mContent:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/good/GoodView;->mAnimationSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_2
    return-void
.end method
