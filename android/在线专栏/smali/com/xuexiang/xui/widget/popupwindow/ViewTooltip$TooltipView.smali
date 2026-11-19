.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TooltipView"
.end annotation


# static fields
.field private static final MARGIN_SCREEN_BORDER_TOOLTIP:I = 0x1e


# instance fields
.field private final ARROW_HEIGHT:I

.field private mAlign:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

.field private mAutoHide:Z

.field private mBubbleColor:I

.field private mBubblePaint:Landroid/graphics/Paint;

.field private mBubblePath:Landroid/graphics/Path;

.field protected mChildView:Landroid/view/View;

.field private mClickToHide:Z

.field private mCorner:I

.field private mDuration:J

.field private mListenerDisplay:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerDisplay;

.field private mListenerHide:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;

.field private mPaddingBottom:I

.field private mPaddingLeft:I

.field private mPaddingRight:I

.field private mPaddingTop:I

.field private mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

.field private mTooltipAnimation:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;

.field private mViewRect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0xf

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->ARROW_HEIGHT:I

    const-string v0, "#B2299EE3"

    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubbleColor:I

    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAlign:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAutoHide:Z

    const-wide/16 v1, 0xfa0

    .line 7
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mDuration:J

    .line 8
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$FadeTooltipAnimation;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$FadeTooltipAnimation;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mTooltipAnimation:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;

    const/16 v1, 0x1e

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mCorner:I

    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    .line 11
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    .line 12
    move-object p1, v2

    check-cast p1, Landroid/widget/TextView;

    const/4 p1, -0x1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    const/4 v2, -0x2

    invoke-virtual {p0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePaint:Landroid/graphics/Paint;

    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubbleColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_top:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    .line 19
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_left:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    .line 20
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->setTextTypeFace(Landroid/graphics/Typeface;)V

    return-void
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    return p1
.end method

.method static synthetic access$302(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    return p1
.end method

.method static synthetic access$402(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    return p1
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    return p1
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerDisplay;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mListenerDisplay:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerDisplay;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mListenerHide:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;

    return-object p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mClickToHide:Z

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->onSetup(Landroid/graphics/Rect;)V

    return-void
.end method

.method private drawBubble(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 2
    iget-object v3, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mViewRect:Landroid/graphics/Rect;

    if-nez v3, :cond_0

    return-object v2

    :cond_0
    const/4 v4, 0x0

    cmpg-float v5, p2, v4

    if-gez v5, :cond_1

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    move/from16 v5, p2

    :goto_0
    cmpg-float v6, p3, v4

    if-gez v6, :cond_2

    const/4 v6, 0x0

    goto :goto_1

    :cond_2
    move/from16 v6, p3

    :goto_1
    cmpg-float v7, p5, v4

    if-gez v7, :cond_3

    const/4 v7, 0x0

    goto :goto_2

    :cond_3
    move/from16 v7, p5

    :goto_2
    cmpg-float v8, p4, v4

    if-gez v8, :cond_4

    const/4 v8, 0x0

    goto :goto_3

    :cond_4
    move/from16 v8, p4

    .line 3
    :goto_3
    iget-object v9, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v10, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->RIGHT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    const/high16 v11, 0x41700000    # 15.0f

    if-ne v9, v10, :cond_5

    const/high16 v12, 0x41700000    # 15.0f

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    .line 4
    :goto_4
    sget-object v13, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v9, v13, :cond_6

    const/high16 v14, 0x41700000    # 15.0f

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    .line 5
    :goto_5
    sget-object v15, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->LEFT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v9, v15, :cond_7

    const/high16 v16, 0x41700000    # 15.0f

    goto :goto_6

    :cond_7
    const/16 v16, 0x0

    .line 6
    :goto_6
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->TOP:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v9, v4, :cond_8

    goto :goto_7

    :cond_8
    const/4 v11, 0x0

    .line 7
    :goto_7
    iget v9, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v12, v9

    .line 8
    iget v9, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v14, v9

    .line 9
    iget v9, v1, Landroid/graphics/RectF;->right:F

    sub-float v9, v9, v16

    move-object/from16 p2, v10

    .line 10
    iget v10, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v10, v11

    .line 11
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/widget/FrameLayout;->getX()F

    move-result v11

    sub-float/2addr v3, v11

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v5, v11

    add-float v11, v12, v5

    .line 12
    invoke-virtual {v2, v11, v14}, Landroid/graphics/Path;->moveTo(FF)V

    move/from16 p4, v11

    const/16 v11, 0xf

    move/from16 p5, v5

    .line 13
    iget-object v5, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v5, v13, :cond_9

    int-to-float v5, v11

    sub-float v13, v3, v5

    .line 14
    invoke-virtual {v2, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 15
    iget v13, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {v2, v3, v13}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v5, v3

    .line 16
    invoke-virtual {v2, v5, v14}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_9
    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v6, v5

    sub-float v13, v9, v6

    .line 17
    invoke-virtual {v2, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v6, v14

    .line 18
    invoke-virtual {v2, v9, v14, v9, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 19
    iget-object v6, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v6, v15, :cond_a

    div-float v6, v10, v5

    int-to-float v13, v11

    sub-float v15, v6, v13

    .line 20
    invoke-virtual {v2, v9, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 21
    iget v15, v1, Landroid/graphics/RectF;->right:F

    invoke-virtual {v2, v15, v6}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v6, v13

    .line 22
    invoke-virtual {v2, v9, v6}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_a
    div-float/2addr v8, v5

    sub-float v5, v10, v8

    .line 23
    invoke-virtual {v2, v9, v5}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v5, v9, v8

    .line 24
    invoke-virtual {v2, v9, v10, v5, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 25
    iget-object v5, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v5, v4, :cond_b

    int-to-float v4, v11

    add-float v5, v3, v4

    .line 26
    invoke-virtual {v2, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    iget v5, v1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float/2addr v3, v4

    .line 28
    invoke-virtual {v2, v3, v10}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_b
    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v7, v3

    add-float v4, v12, v7

    .line 29
    invoke-virtual {v2, v4, v10}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v4, v10, v7

    .line 30
    invoke-virtual {v2, v12, v10, v12, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 31
    iget-object v4, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    move-object/from16 v5, p2

    if-ne v4, v5, :cond_c

    div-float/2addr v10, v3

    int-to-float v3, v11

    add-float v4, v10, v3

    .line 32
    invoke-virtual {v2, v12, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    iget v1, v1, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2, v1, v10}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float/2addr v10, v3

    .line 34
    invoke-virtual {v2, v12, v10}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_c
    add-float v5, v14, p5

    .line 35
    invoke-virtual {v2, v12, v5}, Landroid/graphics/Path;->lineTo(FF)V

    move/from16 v5, p4

    .line 36
    invoke-virtual {v2, v12, v14, v5, v14}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 37
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    return-object v2
.end method

.method private onSetup(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->setupPosition(Landroid/graphics/Rect;)V

    .line 2
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mCorner:I

    int-to-float v2, p1

    int-to-float v3, p1

    int-to-float v4, p1

    int-to-float v5, p1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->drawBubble(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePath:Landroid/graphics/Path;

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->startEnterAnimation()V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->handleAutoRemove()V

    return-void
.end method


# virtual methods
.method public adjustSize(Landroid/graphics/Rect;I)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->LEFT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    iget v2, p1, Landroid/graphics/Rect;->left:I

    if-le v1, v2, :cond_0

    add-int/lit8 v2, v2, -0x1e

    .line 3
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->RIGHT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v1, v2, :cond_1

    iget v1, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    if-le v1, p2, :cond_1

    .line 5
    iget p1, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x1e

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->TOP:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-eq v1, v2, :cond_2

    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v1, v2, :cond_4

    .line 7
    :cond_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 8
    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v4, v2

    add-float/2addr v4, v1

    int-to-float p2, p2

    const/high16 v5, 0x41f00000    # 30.0f

    cmpl-float v4, v4, p2

    if-lez v4, :cond_3

    int-to-float v4, v2

    add-float/2addr v4, v1

    sub-float/2addr v4, p2

    add-float/2addr v4, v5

    .line 9
    iget p2, p1, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    sub-float/2addr p2, v4

    float-to-int p2, p2

    iput p2, p1, Landroid/graphics/Rect;->left:I

    int-to-float p2, v2

    sub-float/2addr p2, v4

    float-to-int p2, p2

    .line 10
    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    .line 11
    :cond_3
    iget p2, p1, Landroid/graphics/Rect;->left:I

    int-to-float v4, p2

    sub-float/2addr v4, v1

    const/4 v6, 0x0

    cmpg-float v4, v4, v6

    if-gez v4, :cond_4

    int-to-float v4, p2

    sub-float/2addr v4, v1

    sub-float/2addr v6, v4

    add-float/2addr v6, v5

    int-to-float p2, p2

    add-float/2addr p2, v6

    float-to-int p2, p2

    .line 12
    iput p2, p1, Landroid/graphics/Rect;->left:I

    int-to-float p2, v2

    add-float/2addr p2, v6

    float-to-int p2, p2

    .line 13
    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return v3
.end method

.method public close()V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->remove()V

    return-void
.end method

.method protected handleAutoRemove()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mClickToHide:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$3;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)V

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAutoHide:Z

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$4;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$4;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)V

    iget-wide v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mDuration:J

    invoke-virtual {p0, v0, v1, v2}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePath:Landroid/graphics/Path;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2
    new-instance v1, Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-direct {v1, p3, p3, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mCorner:I

    int-to-float v2, p1

    int-to-float v3, p1

    int-to-float v4, p1

    int-to-float v5, p1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->drawBubble(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePath:Landroid/graphics/Path;

    return-void
.end method

.method public remove()V
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$5;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$5;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)V

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->startExitAnimation(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public setAlign(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAlign:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setAutoHide(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAutoHide:Z

    return-void
.end method

.method public setClickToHide(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mClickToHide:Z

    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubbleColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mBubblePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setCorner(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mCorner:I

    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    const/4 v0, -0x2

    .line 3
    invoke-virtual {p0, p1, v0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public setDuration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mDuration:J

    return-void
.end method

.method public setListenerDisplay(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerDisplay;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mListenerDisplay:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerDisplay;

    return-void
.end method

.method public setListenerHide(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mListenerHide:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ListenerHide;

    return-void
.end method

.method public setPosition(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$2;->$SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$Position:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    add-int/lit8 p1, p1, 0xf

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/widget/FrameLayout;->setPaddingRelative(IIII)V

    goto :goto_0

    .line 4
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    add-int/lit8 v1, v1, 0xf

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/widget/FrameLayout;->setPaddingRelative(IIII)V

    goto :goto_0

    .line 5
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    add-int/lit8 v0, v0, 0xf

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/widget/FrameLayout;->setPaddingRelative(IIII)V

    goto :goto_0

    .line 6
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingLeft:I

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingTop:I

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingRight:I

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPaddingBottom:I

    add-int/lit8 v2, v2, 0xf

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/widget/FrameLayout;->setPaddingRelative(IIII)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setTextColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setTextGravity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setTextSize(IF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setTextTypeFace(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mChildView:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->postInvalidate()V

    return-void
.end method

.method public setTooltipAnimation(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mTooltipAnimation:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;

    return-void
.end method

.method public setup(Landroid/graphics/Rect;I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mViewRect:Landroid/graphics/Rect;

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p0, v0, p2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->adjustSize(Landroid/graphics/Rect;I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->onSetup(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;

    invoke-direct {p2, p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/graphics/Rect;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :goto_0
    return-void
.end method

.method public setupPosition(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->LEFT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_3

    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->RIGHT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v0, v4, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAlign:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    sget-object v5, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    if-ne v4, v5, :cond_1

    int-to-float v1, v1

    div-float/2addr v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, v2

    div-float/2addr v0, v3

    sub-float/2addr v1, v0

    float-to-int v2, v1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v0, v1, :cond_2

    .line 6
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 7
    iget p1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    goto :goto_2

    .line 8
    :cond_2
    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 9
    iget p1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    goto :goto_2

    .line 10
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    .line 12
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 13
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 14
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$2;->$SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$ALIGN:[I

    iget-object v6, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mAlign:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v4, v4, v6

    const/4 v6, 0x1

    if-eq v4, v6, :cond_5

    const/4 v6, 0x2

    if-eq v4, v6, :cond_4

    goto :goto_1

    :cond_4
    const/high16 v2, -0x40800000    # -1.0f

    int-to-float v4, v5

    mul-float v4, v4, v2

    div-float/2addr v4, v3

    int-to-float v0, v0

    div-float/2addr v0, v3

    add-float/2addr v4, v0

    float-to-int v2, v4

    .line 15
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mPosition:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    if-ne v0, v1, :cond_6

    .line 16
    iget v0, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 17
    iget p1, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    goto :goto_2

    .line 18
    :cond_6
    iget v0, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 19
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    :goto_2
    return-void
.end method

.method protected startEnterAnimation()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mTooltipAnimation:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)V

    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;->animateEnter(Landroid/view/View;Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method protected startExitAnimation(Landroid/animation/Animator$AnimatorListener;)V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->mTooltipAnimation:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$2;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/animation/Animator$AnimatorListener;)V

    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipAnimation;->animateExit(Landroid/view/View;Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
