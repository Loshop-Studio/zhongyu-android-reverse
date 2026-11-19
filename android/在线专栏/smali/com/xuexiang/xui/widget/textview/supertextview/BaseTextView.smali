.class public Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# instance fields
.field private mBottomTVParams:Landroid/widget/LinearLayout$LayoutParams;

.field private mBottomTextView:Landroid/widget/TextView;

.field private mCenterTVParams:Landroid/widget/LinearLayout$LayoutParams;

.field private mCenterTextView:Landroid/widget/TextView;

.field private mContext:Landroid/content/Context;

.field private mTopTVParams:Landroid/widget/LinearLayout$LayoutParams;

.field private mTopTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mContext:Landroid/content/Context;

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initView()V

    return-void
.end method

.method private initBottomView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTVParams:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getParams(Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTVParams:Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTVParams:Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initTextView(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    :cond_1
    return-void
.end method

.method private initCenterView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTVParams:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getParams(Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTVParams:Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTVParams:Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initTextView(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    :cond_1
    return-void
.end method

.method private initTextView(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTextView(Landroid/widget/TextView;Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/TextView;

    move-result-object p1

    const/16 p2, 0x11

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method private initTopView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTVParams:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getParams(Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTVParams:Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTVParams:Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initTextView(Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/TextView;)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    :cond_1
    return-void
.end method

.method private initView()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initTopView()V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initCenterView()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->initBottomView()V

    return-void
.end method

.method private setTextString(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getBottomTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public getCenterTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public getParams(Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    :cond_0
    return-object p1
.end method

.method public getTextView(Landroid/widget/TextView;Landroid/widget/LinearLayout$LayoutParams;)Landroid/widget/TextView;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 p2, 0x8

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-object p1
.end method

.method public getTopTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public setBottomTextString(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTextString(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCenterSpaceHeight(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTVParams:Landroid/widget/LinearLayout$LayoutParams;

    div-int/lit8 p1, p1, 0x2

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTVParams:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0, v1, p1, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTVParams:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    return-void
.end method

.method public setCenterTextString(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTextString(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setMaxEms(III)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v2, v1, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v3, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v3, v2, p1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    new-array v2, v1, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v3, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v3, v2, p1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    new-array v0, v1, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v1, v0, p1

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setTopTextString(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTextString(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mCenterTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->mBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    return-void
.end method
