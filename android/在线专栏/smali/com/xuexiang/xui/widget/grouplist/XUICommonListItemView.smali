.class public Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$LayoutParamConfig;,
        Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$XUICommonListItemRedDotPosition;,
        Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$XUICommonListItemOrientation;,
        Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$XUICommonListItemAccessoryType;
    }
.end annotation


# static fields
.field public static final ACCESSORY_TYPE_CHEVRON:I = 0x1

.field public static final ACCESSORY_TYPE_CUSTOM:I = 0x3

.field public static final ACCESSORY_TYPE_NONE:I = 0x0

.field public static final ACCESSORY_TYPE_SWITCH:I = 0x2

.field public static final HORIZONTAL:I = 0x1

.field public static final RED_DOT_POSITION_LEFT:I = 0x0

.field public static final RED_DOT_POSITION_RIGHT:I = 0x1

.field public static final VERTICAL:I


# instance fields
.field private mAccessoryType:I

.field private mAccessoryView:Landroid/view/ViewGroup;

.field protected mDetailTextView:Landroid/widget/TextView;

.field protected mImageView:Landroid/widget/ImageView;

.field private mNewTip:Landroid/view/View;

.field private mNewTipViewStub:Landroid/view/ViewStub;

.field private mOrientation:I

.field private mRedDot:Landroid/widget/ImageView;

.field private mRedDotPosition:I

.field protected mSwitch:Landroid/widget/CheckBox;

.field protected mTextContainer:Landroid/widget/LinearLayout;

.field protected mTextDetailSpace:Landroid/widget/Space;

.field protected mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->XUICommonListItemViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mOrientation:I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDotPosition:I

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getAccessoryImageView()Landroid/widget/ImageView;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->getAccessoryLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-object v0
.end method

.method private getAccessoryLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public addAccessoryCustomView(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryType:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public getAccessoryContainerView()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public getAccessoryType()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryType:I

    return v0
.end method

.method public getDetailText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getDetailTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mOrientation:I

    return v0
.end method

.method public getSwitch()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_common_list_item:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUICommonListItemView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->XUICommonListItemView_xui_orientation:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->XUICommonListItemView_xui_accessory_type:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 5
    sget v2, Lcom/xuexiang/xui/R$styleable;->XUICommonListItemView_xui_commonList_titleColor:I

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_1:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v3

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 6
    sget v3, Lcom/xuexiang/xui/R$styleable;->XUICommonListItemView_xui_commonList_detailColor:I

    sget v4, Lcom/xuexiang/xui/R$color;->xui_config_color_gray_5:I

    invoke-static {v4}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 7
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_imageView:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    .line 9
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_textContainer:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    .line 10
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_textView:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_tips_dot:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    .line 13
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_tips_new:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTipViewStub:Landroid/view/ViewStub;

    .line 14
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_detailTextView:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    .line 15
    sget p2, Lcom/xuexiang/xui/R$id;->group_list_item_space:I

    invoke-virtual {p0, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Space;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextDetailSpace:Landroid/widget/Space;

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 18
    invoke-static {}, Lcom/xuexiang/xui/utils/ViewUtils;->getIsLastLineSpacingExtraError()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 19
    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_detail_line_space:I

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    neg-int p1, p1

    iput p1, p2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    :cond_0
    if-nez p3, :cond_1

    .line 20
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    goto :goto_0

    .line 21
    :cond_1
    iput v1, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 22
    :goto_0
    sget p1, Lcom/xuexiang/xui/R$id;->group_list_item_accessoryView:I

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    .line 23
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->setOrientation(I)V

    .line 24
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->setAccessoryType(I)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    const/high16 p2, 0x40800000    # 4.0f

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iget-object p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    invoke-virtual {p3}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int/2addr p1, p3

    .line 4
    iget-object p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p3}, Landroid/widget/LinearLayout;->getLeft()I

    move-result p3

    .line 5
    iget p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDotPosition:I

    if-nez p4, :cond_0

    .line 6
    iget-object p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p4

    iget-object p5, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p5

    invoke-interface {p5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p4

    int-to-float p3, p3

    add-float/2addr p3, p4

    .line 7
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p4

    int-to-float p4, p4

    add-float/2addr p3, p4

    float-to-int p3, p3

    goto :goto_0

    :cond_0
    const/4 p5, 0x1

    if-ne p4, p5, :cond_1

    .line 8
    iget-object p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p4}, Landroid/widget/LinearLayout;->getWidth()I

    move-result p4

    add-int/2addr p3, p4

    iget-object p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    invoke-virtual {p4}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result p4

    sub-int/2addr p3, p4

    .line 9
    :goto_0
    iget-object p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p4}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result p5

    add-int/2addr p5, p3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    .line 11
    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, p1

    .line 12
    invoke-virtual {p4, p3, p1, p5, v0}, Landroid/widget/ImageView;->layout(IIII)V

    goto :goto_1

    :cond_1
    return-void

    .line 13
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_3

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLeft()I

    move-result p1

    .line 15
    iget-object p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p3

    iget-object p4, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p4

    invoke-interface {p4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p3

    int-to-float p1, p1

    add-float/2addr p1, p3

    .line 16
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 17
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    iget-object p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int/2addr p2, p3

    .line 18
    iget-object p3, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    .line 19
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    add-int/2addr p4, p1

    iget-object p5, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    .line 20
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    add-int/2addr p5, p2

    .line 21
    invoke-virtual {p3, p1, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_3
    return-void
.end method

.method public setAccessoryType(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryType:I

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    if-nez p1, :cond_2

    .line 5
    new-instance p1, Landroid/widget/CheckBox;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    .line 6
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_switch:I

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->getAccessoryLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setClickable(Z)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mSwitch:Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 12
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->getAccessoryImageView()Landroid/widget/ImageView;

    move-result-object p1

    .line 13
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_chevron:I

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/xuexiang/xui/R$drawable;->xui_icon_chevron:I

    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDrawable(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/xuexiang/xui/utils/DrawableUtils;->getSupportRTLDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 17
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mAccessoryView:Landroid/view/ViewGroup;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setDetailText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setOrientation(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mOrientation:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextDetailSpace:Landroid/widget/Space;

    invoke-virtual {p1}, Landroid/widget/Space;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mOrientation:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    const v2, 0x800003

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v0, -0x2

    .line 6
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 7
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v0, 0x0

    .line 8
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_title_v_text_size:I

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_detail_v_text_size:I

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextContainer:Landroid/widget/LinearLayout;

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    iput v1, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 14
    iput v1, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_title_h_text_size:I

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mDetailTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_common_list_item_detail_h_text_size:I

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :goto_0
    return-void
.end method

.method public setRedDotPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDotPosition:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->requestLayout()V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public showNewTip(Z)V
    .locals 2

    const/16 v0, 0x8

    if-eqz p1, :cond_1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTipViewStub:Landroid/view/ViewStub;

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mNewTip:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public showRedDot(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->showRedDot(ZZ)V

    return-void
.end method

.method public showRedDot(ZZ)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mRedDot:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public updateImageViewLp(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$LayoutParamConfig;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->mImageView:Landroid/widget/ImageView;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView$LayoutParamConfig;->onConfig(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method
