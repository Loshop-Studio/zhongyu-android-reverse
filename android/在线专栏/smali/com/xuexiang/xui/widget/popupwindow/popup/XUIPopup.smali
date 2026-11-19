.class public Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
.super Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;
.source "SourceFile"


# static fields
.field public static final ANIM_AUTO:I = 0x4

.field public static final ANIM_GROW_FROM_CENTER:I = 0x3

.field public static final ANIM_GROW_FROM_LEFT:I = 0x1

.field public static final ANIM_GROW_FROM_RIGHT:I = 0x2

.field public static final DIRECTION_BOTTOM:I = 0x1

.field public static final DIRECTION_NONE:I = 0x2

.field public static final DIRECTION_TOP:I


# instance fields
.field protected mAnimStyle:I

.field protected mArrowCenter:I

.field protected mArrowDown:Landroid/widget/ImageView;

.field protected mArrowUp:Landroid/widget/ImageView;

.field protected mDirection:I

.field private mOffsetX:I

.field private mOffsetYWhenBottom:I

.field private mOffsetYWhenTop:I

.field private mPopupLeftRightMinMargin:I

.field private mPopupTopBottomMinMargin:I

.field private mPreferredDirection:I

.field protected mX:I

.field protected mY:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupLeftRightMinMargin:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupTopBottomMinMargin:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetX:I

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenTop:I

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenBottom:I

    const/4 p1, 0x4

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mAnimStyle:I

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPreferredDirection:I

    .line 12
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    return-void
.end method

.method private calculatePosition(Landroid/view/View;)V
    .locals 9

    const/4 v0, 0x2

    if-eqz p1, :cond_5

    new-array v1, v0, [I

    .line 1
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    aget v3, v1, v2

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    div-int/2addr v4, v0

    add-int/2addr v3, v4

    iput v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowCenter:I

    .line 3
    iget-object v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v5, v4, 0x2

    if-ge v3, v5, :cond_0

    .line 4
    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    div-int/2addr v4, v0

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupLeftRightMinMargin:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    goto :goto_0

    .line 5
    :cond_0
    iget v5, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    div-int/lit8 v6, v5, 0x2

    add-int/2addr v6, v3

    iget v7, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupLeftRightMinMargin:I

    sub-int v8, v4, v7

    if-ge v6, v8, :cond_1

    .line 6
    div-int/2addr v5, v0

    sub-int/2addr v3, v5

    iput v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    goto :goto_0

    :cond_1
    sub-int/2addr v4, v7

    sub-int/2addr v4, v5

    .line 7
    iput v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    .line 8
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPreferredDirection:I

    iput v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v0, :cond_2

    goto :goto_1

    :cond_2
    aget p1, v1, v4

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    goto :goto_1

    :cond_3
    aget v0, v1, v4

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    iget p1, p1, Landroid/graphics/Point;->y:I

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupTopBottomMinMargin:I

    sub-int/2addr p1, v3

    if-le v0, p1, :cond_6

    aget p1, v1, v4

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 13
    iput v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    goto :goto_1

    :cond_4
    aget v0, v1, v4

    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupTopBottomMinMargin:I

    if-ge v0, v2, :cond_6

    aget v0, v1, v4

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 17
    iput v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    goto :goto_1

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    iget v1, p1, Landroid/graphics/Point;->x:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowWidth:I

    sub-int/2addr v1, v2

    div-int/2addr v1, v0

    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    .line 19
    iget p1, p1, Landroid/graphics/Point;->y:I

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mWindowHeight:I

    sub-int/2addr p1, v1

    div-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    .line 20
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    :cond_6
    :goto_1
    return-void
.end method

.method private initAnimationStyle(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    div-int/2addr v0, v1

    sub-int/2addr p2, v0

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mAnimStyle:I

    if-eq v3, v2, :cond_c

    if-eq v3, v1, :cond_a

    const/4 v1, 0x3

    if-eq v3, v1, :cond_8

    const/4 v2, 0x4

    if-eq v3, v2, :cond_2

    goto/16 :goto_7

    .line 5
    :cond_2
    div-int/2addr p1, v2

    if-gt p2, p1, :cond_4

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_3

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Left:I

    goto :goto_1

    :cond_3
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Left:I

    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_7

    :cond_4
    if-le p2, p1, :cond_6

    mul-int/lit8 p1, p1, 0x3

    if-ge p2, p1, :cond_6

    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_5

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Center:I

    goto :goto_2

    :cond_5
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Center:I

    :goto_2
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_7

    .line 8
    :cond_6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_7

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Right:I

    goto :goto_3

    :cond_7
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Right:I

    :goto_3
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_7

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_9

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Center:I

    goto :goto_4

    :cond_9
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Center:I

    :goto_4
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_7

    .line 10
    :cond_a
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_b

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Right:I

    goto :goto_5

    :cond_b
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Right:I

    :goto_5
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_7

    .line 11
    :cond_c
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getPopupWindow()Landroid/widget/PopupWindow;

    move-result-object p1

    if-eqz v0, :cond_d

    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Left:I

    goto :goto_6

    :cond_d
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Left:I

    :goto_6
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :goto_7
    return-void
.end method

.method private setViewVisibility(Landroid/view/View;Z)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/4 p2, 0x4

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private showArrow()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowDown:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v3}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v3}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowDown:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v3}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    goto :goto_1

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowDown:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v3}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setViewVisibility(Landroid/view/View;Z)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowDown:Landroid/widget/ImageView;

    :goto_1
    if-eqz v0, :cond_3

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 12
    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowCenter:I

    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    sub-int/2addr v3, v4

    div-int/2addr v2, v1

    sub-int/2addr v3, v2

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_3
    return-void
.end method


# virtual methods
.method public generateLayoutParam(II)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method protected getPopupWidth()I
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getScreenType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/R$dimen;->xui_popup_width_tablet_small:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Lcom/xuexiang/xui/R$dimen;->xui_popup_width_tablet_big:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_0

    .line 4
    :cond_1
    sget v0, Lcom/xuexiang/xui/R$dimen;->xui_popup_width_tablet_small:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_0

    .line 5
    :cond_2
    sget v0, Lcom/xuexiang/xui/R$dimen;->xui_popup_width_phone:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    :goto_0
    return v0
.end method

.method protected onShow(Landroid/view/View;)Landroid/graphics/Point;
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->calculatePosition(Landroid/view/View;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->showArrow()V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->mScreenSize:Landroid/graphics/Point;

    iget p1, p1, Landroid/graphics/Point;->x:I

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowCenter:I

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->initAnimationStyle(II)V

    .line 4
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mDirection:I

    if-nez p1, :cond_0

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenTop:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 6
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenBottom:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 7
    :goto_0
    new-instance v0, Landroid/graphics/Point;

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mX:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetX:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mY:I

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method public setAnimStyle(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mAnimStyle:I

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_popup:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->arrow_down:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowDown:Landroid/widget/ImageView;

    .line 3
    sget v1, Lcom/xuexiang/xui/R$id;->arrow_up:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mArrowUp:Landroid/widget/ImageView;

    .line 4
    sget v1, Lcom/xuexiang/xui/R$id;->box:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 5
    invoke-virtual {v1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 6
    invoke-super {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setPopupLeftRightMinMargin(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupLeftRightMinMargin:I

    return-void
.end method

.method public setPopupTopBottomMinMargin(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPopupTopBottomMinMargin:I

    return-void
.end method

.method public setPositionOffsetX(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetX:I

    return-object p0
.end method

.method public setPositionOffsetYWhenBottom(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenBottom:I

    return-object p0
.end method

.method public setPositionOffsetYWhenTop(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mOffsetYWhenTop:I

    return-object p0
.end method

.method public setPreferredDirection(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->mPreferredDirection:I

    return-object p0
.end method

.method public showDown(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setPreferredDirection(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->show(Landroid/view/View;)V

    return-void
.end method

.method public showUp(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setPreferredDirection(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->show(Landroid/view/View;)V

    return-void
.end method
