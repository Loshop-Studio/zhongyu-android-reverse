.class public Lcom/xuexiang/xui/widget/textview/ExpandableTextView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;,
        Lcom/xuexiang/xui/widget/textview/ExpandableTextView$ExpandCollapseAnimation;
    }
.end annotation


# static fields
.field private static final DEFAULT_ANIM_ALPHA_START:F = 0.7f

.field private static final DEFAULT_ANIM_DURATION:I = 0x12c

.field private static final MAX_COLLAPSED_LINES:I = 0x8


# instance fields
.field private mAnimAlphaStart:F

.field private mAnimating:Z

.field private mAnimationDuration:I

.field protected mButton:Landroid/widget/ImageButton;

.field private mCollapseDrawable:Landroid/graphics/drawable/Drawable;

.field private mCollapsed:Z

.field private mCollapsedHeight:I

.field private mCollapsedStatus:Landroid/util/SparseBooleanArray;

.field private mExpandDrawable:Landroid/graphics/drawable/Drawable;

.field private mListener:Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;

.field private mMarginBetweenTxtAndBottom:I

.field private mMaxCollapsedLines:I

.field private mPosition:I

.field private mRelayout:Z

.field private mTextHeightWithMaxLines:I

.field protected mTv:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    .line 6
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    .line 9
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimAlphaStart:F

    return p0
.end method

.method static synthetic access$100(Landroid/view/View;F)V
    .locals 0

    invoke-static {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->applyAlphaAnimation(Landroid/view/View;F)V

    return-void
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimating:Z

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mListener:Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mMarginBetweenTxtAndBottom:I

    return p0
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mMarginBetweenTxtAndBottom:I

    return p1
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimationDuration:I

    return p0
.end method

.method private static applyAlphaAnimation(Landroid/view/View;F)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->isPostHoneycomb()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {v0, p1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method

.method private findViews()V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->expandable_text:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    .line 2
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->expand_collapse:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    .line 4
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->isPostLolipop()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static getRealTextViewHeight(Landroid/widget/TextView;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getLineCount()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result p0

    add-int/2addr v1, p0

    add-int/2addr v0, v1

    return v0
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->initAttr(Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->setOrientation(I)V

    const/16 p1, 0x8

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private initAttr(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_maxCollapsedLines:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mMaxCollapsedLines:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_animDuration:I

    const/16 v1, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimationDuration:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_animAlphaStart:I

    const v1, 0x3f333333    # 0.7f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimAlphaStart:F

    .line 5
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_expandDrawable:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->ExpandableTextView_etv_collapseDrawable:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_more_black_12dp:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 10
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_ic_expand_less_black_12dp:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    .line 11
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private static isPostHoneycomb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static isPostLolipop()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsedStatus:Landroid/util/SparseBooleanArray;

    if-eqz p1, :cond_2

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mPosition:I

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 6
    :cond_2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimating:Z

    .line 7
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    if-eqz p1, :cond_3

    .line 8
    new-instance p1, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$ExpandCollapseAnimation;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsedHeight:I

    invoke-direct {p1, p0, p0, v1, v2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$ExpandCollapseAnimation;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/view/View;II)V

    goto :goto_1

    .line 9
    :cond_3
    new-instance p1, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$ExpandCollapseAnimation;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTextHeightWithMaxLines:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    .line 10
    invoke-virtual {v3}, Landroid/widget/TextView;->getHeight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-direct {p1, p0, p0, v1, v2}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$ExpandCollapseAnimation;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/view/View;II)V

    .line 11
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$1;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 13
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->findViews()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mAnimating:Z

    return p1
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mRelayout:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mRelayout:Z

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    invoke-virtual {v2, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    const v2, 0x7fffffff

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 5
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLineCount()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mMaxCollapsedLines:I

    if-gt v1, v2, :cond_1

    return-void

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->getRealTextViewHeight(Landroid/widget/TextView;)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTextHeightWithMaxLines:I

    .line 8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    if-eqz v1, :cond_2

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mMaxCollapsedLines:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 11
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 12
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    new-instance p2, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$2;-><init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 14
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsedHeight:I

    :cond_3
    return-void

    .line 15
    :cond_4
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method

.method public setOnExpandStateChangeListener(Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mListener:Lcom/xuexiang/xui/widget/textview/ExpandableTextView$OnExpandStateChangeListener;

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ExpandableTextView only supports Vertical Orientation."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mRelayout:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/util/SparseBooleanArray;I)V
    .locals 1

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsedStatus:Landroid/util/SparseBooleanArray;

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mPosition:I

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, p3, v0}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result p2

    .line 7
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 8
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapsed:Z

    .line 9
    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mButton:Landroid/widget/ImageButton;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mExpandDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->mCollapseDrawable:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {p3, p2}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 p2, -0x2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 12
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->requestLayout()V

    return-void
.end method
