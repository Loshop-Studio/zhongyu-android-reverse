.class public Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;
.super Landroid/widget/ViewFlipper;
.source "SourceFile"


# instance fields
.field private mAnimDuration:I

.field private mAnimIn:Landroid/view/animation/Animation;

.field private mAnimInRes:I

.field private mAnimOut:Landroid/view/animation/Animation;

.field private mAnimOutRes:I

.field private mInterval:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x9c4

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    const/16 p1, 0x1f4

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    .line 4
    sget p1, Lcom/xuexiang/xui/R$anim;->marquee_bottom_in:I

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimInRes:I

    .line 5
    sget p1, Lcom/xuexiang/xui/R$anim;->marquee_top_out:I

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOutRes:I

    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x9c4

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    const/16 p1, 0x1f4

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    .line 10
    sget p1, Lcom/xuexiang/xui/R$anim;->marquee_bottom_in:I

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimInRes:I

    .line 11
    sget p1, Lcom/xuexiang/xui/R$anim;->marquee_top_out:I

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOutRes:I

    .line 12
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MarqueeView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeView_mq_interval:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeView_mq_animIn:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimInRes:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimInRes:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeView_mq_animOut:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOutRes:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOutRes:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeView_mq_animDuration:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setFlipInterval(I)V

    .line 8
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimInRes:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 11
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOutRes:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method public getAnimIn()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public getAnimOut()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/ViewFlipper;->onDetachedFromWindow()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->stopFlipping()V

    return-void
.end method

.method public setAnimDuration(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    invoke-virtual {p1, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setAnimInAndOut(II)V
    .locals 2

    .line 5
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    .line 6
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimDuration:I

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setAnimInAndOut(Landroid/view/animation/Animation;Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimIn:Landroid/view/animation/Animation;

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mAnimOut:Landroid/view/animation/Animation;

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 4
    invoke-virtual {p0, p2}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public setInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->mInterval:I

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/ViewFlipper;->setFlipInterval(I)V

    return-void
.end method

.method public setMarqueeFactory(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;)V
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->setAttachedToMarqueeView(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ViewFlipper;->removeAllViews()V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->getMarqueeViews()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
