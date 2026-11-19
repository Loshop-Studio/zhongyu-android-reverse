.class public Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/IXUILayout;


# instance fields
.field private mBorderColor:I

.field private mBorderRect:Landroid/graphics/RectF;

.field private mBorderWidth:I

.field private mBottomDividerAlpha:I

.field private mBottomDividerColor:I

.field private mBottomDividerHeight:I

.field private mBottomDividerInsetLeft:I

.field private mBottomDividerInsetRight:I

.field private mClipPaint:Landroid/graphics/Paint;

.field private mContext:Landroid/content/Context;

.field private mDividerPaint:Landroid/graphics/Paint;

.field private mHeightLimit:I

.field private mHeightMini:I

.field private mHideRadiusSide:I

.field private mIsOutlineExcludePadding:Z

.field private mIsShowBorderOnlyBeforeL:Z

.field private mLeftDividerAlpha:I

.field private mLeftDividerColor:I

.field private mLeftDividerInsetBottom:I

.field private mLeftDividerInsetTop:I

.field private mLeftDividerWidth:I

.field private mMode:Landroid/graphics/PorterDuffXfermode;

.field private mOuterNormalColor:I

.field private mOutlineInsetBottom:I

.field private mOutlineInsetLeft:I

.field private mOutlineInsetRight:I

.field private mOutlineInsetTop:I

.field private mOwner:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mPath:Landroid/graphics/Path;

.field private mRadius:I

.field private mRadiusArray:[F

.field private mRightDividerAlpha:I

.field private mRightDividerColor:I

.field private mRightDividerInsetBottom:I

.field private mRightDividerInsetTop:I

.field private mRightDividerWidth:I

.field private mShadowAlpha:F

.field private mShadowColor:I

.field private mShadowElevation:I

.field private mTopDividerAlpha:I

.field private mTopDividerColor:I

.field private mTopDividerHeight:I

.field private mTopDividerInsetLeft:I

.field private mTopDividerInsetRight:I

.field private mWidthLimit:I

.field private mWidthMini:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthMini:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightMini:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetLeft:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetRight:I

    const/16 v1, 0xff

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerAlpha:I

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetLeft:I

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetRight:I

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerAlpha:I

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetTop:I

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetBottom:I

    .line 17
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerAlpha:I

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetTop:I

    .line 20
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetBottom:I

    .line 21
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerAlpha:I

    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    .line 23
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    const/4 v1, 0x1

    .line 24
    iput v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderWidth:I

    .line 25
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    .line 26
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsOutlineExcludePadding:Z

    .line 27
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mPath:Landroid/graphics/Path;

    .line 28
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsShowBorderOnlyBeforeL:Z

    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    const/high16 v2, -0x1000000

    .line 30
    iput v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    .line 31
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetLeft:I

    .line 32
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetRight:I

    .line 33
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetTop:I

    .line 34
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetBottom:I

    .line 35
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mContext:Landroid/content/Context;

    .line 36
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    .line 37
    sget p4, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {p1, p4}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result p4

    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerColor:I

    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerColor:I

    .line 38
    new-instance p4, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p4, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mMode:Landroid/graphics/PorterDuffXfermode;

    .line 39
    new-instance p4, Landroid/graphics/Paint;

    invoke-direct {p4}, Landroid/graphics/Paint;-><init>()V

    iput-object p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    .line 40
    invoke-virtual {p4, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    sget p4, Lcom/xuexiang/xui/R$attr;->xui_general_shadow_alpha:I

    invoke-static {p1, p4}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveFloat(Landroid/content/Context;I)F

    move-result p4

    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    .line 42
    new-instance p4, Landroid/graphics/RectF;

    invoke-direct {p4}, Landroid/graphics/RectF;-><init>()V

    iput-object p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    goto/16 :goto_3

    .line 43
    :cond_1
    :goto_0
    sget-object p4, Lcom/xuexiang/xui/R$styleable;->XUILayout:[I

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 44
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p3

    const/4 p4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge p4, p3, :cond_24

    .line 45
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v4

    .line 46
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_maxWidth:I

    if-ne v4, v5, :cond_2

    .line 47
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    goto/16 :goto_2

    .line 48
    :cond_2
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_maxHeight:I

    if-ne v4, v5, :cond_3

    .line 49
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    goto/16 :goto_2

    .line 50
    :cond_3
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_minWidth:I

    if-ne v4, v5, :cond_4

    .line 51
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthMini:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthMini:I

    goto/16 :goto_2

    .line 52
    :cond_4
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_android_minHeight:I

    if-ne v4, v5, :cond_5

    .line 53
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightMini:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightMini:I

    goto/16 :goto_2

    .line 54
    :cond_5
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerColor:I

    if-ne v4, v5, :cond_6

    .line 55
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerColor:I

    goto/16 :goto_2

    .line 56
    :cond_6
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerHeight:I

    if-ne v4, v5, :cond_7

    .line 57
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    goto/16 :goto_2

    .line 58
    :cond_7
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerInsetLeft:I

    if-ne v4, v5, :cond_8

    .line 59
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetLeft:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetLeft:I

    goto/16 :goto_2

    .line 60
    :cond_8
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_topDividerInsetRight:I

    if-ne v4, v5, :cond_9

    .line 61
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetRight:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetRight:I

    goto/16 :goto_2

    .line 62
    :cond_9
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerColor:I

    if-ne v4, v5, :cond_a

    .line 63
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerColor:I

    goto/16 :goto_2

    .line 64
    :cond_a
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerHeight:I

    if-ne v4, v5, :cond_b

    .line 65
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    goto/16 :goto_2

    .line 66
    :cond_b
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerInsetLeft:I

    if-ne v4, v5, :cond_c

    .line 67
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetLeft:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetLeft:I

    goto/16 :goto_2

    .line 68
    :cond_c
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_bottomDividerInsetRight:I

    if-ne v4, v5, :cond_d

    .line 69
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetRight:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetRight:I

    goto/16 :goto_2

    .line 70
    :cond_d
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerColor:I

    if-ne v4, v5, :cond_e

    .line 71
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerColor:I

    goto/16 :goto_2

    .line 72
    :cond_e
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerWidth:I

    if-ne v4, v5, :cond_f

    .line 73
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    goto/16 :goto_2

    .line 74
    :cond_f
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerInsetTop:I

    if-ne v4, v5, :cond_10

    .line 75
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetTop:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetTop:I

    goto/16 :goto_2

    .line 76
    :cond_10
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_leftDividerInsetBottom:I

    if-ne v4, v5, :cond_11

    .line 77
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetBottom:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetBottom:I

    goto/16 :goto_2

    .line 78
    :cond_11
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerColor:I

    if-ne v4, v5, :cond_12

    .line 79
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerColor:I

    goto/16 :goto_2

    .line 80
    :cond_12
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerWidth:I

    if-ne v4, v5, :cond_13

    .line 81
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    goto/16 :goto_2

    .line 82
    :cond_13
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerInsetTop:I

    if-ne v4, v5, :cond_14

    .line 83
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetTop:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetTop:I

    goto/16 :goto_2

    .line 84
    :cond_14
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_rightDividerInsetBottom:I

    if-ne v4, v5, :cond_15

    .line 85
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetBottom:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetBottom:I

    goto/16 :goto_2

    .line 86
    :cond_15
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_borderColor:I

    if-ne v4, v5, :cond_16

    .line 87
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    goto/16 :goto_2

    .line 88
    :cond_16
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_borderWidth:I

    if-ne v4, v5, :cond_17

    .line 89
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderWidth:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderWidth:I

    goto/16 :goto_2

    .line 90
    :cond_17
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_radius:I

    if-ne v4, v5, :cond_18

    .line 91
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    goto/16 :goto_2

    .line 92
    :cond_18
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outerNormalColor:I

    if-ne v4, v5, :cond_19

    .line 93
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    goto/16 :goto_2

    .line 94
    :cond_19
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_hideRadiusSide:I

    if-ne v4, v5, :cond_1a

    .line 95
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    goto :goto_2

    .line 96
    :cond_1a
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_showBorderOnlyBeforeL:I

    if-ne v4, v5, :cond_1b

    .line 97
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsShowBorderOnlyBeforeL:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsShowBorderOnlyBeforeL:Z

    goto :goto_2

    .line 98
    :cond_1b
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_shadowElevation:I

    if-ne v4, v5, :cond_1c

    .line 99
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    goto :goto_2

    .line 100
    :cond_1c
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_shadowAlpha:I

    if-ne v4, v5, :cond_1d

    .line 101
    iget v5, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    goto :goto_2

    .line 102
    :cond_1d
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_useThemeGeneralShadowElevation:I

    if-ne v4, v5, :cond_1e

    .line 103
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    goto :goto_2

    .line 104
    :cond_1e
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetLeft:I

    if-ne v4, v5, :cond_1f

    .line 105
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetLeft:I

    goto :goto_2

    .line 106
    :cond_1f
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetRight:I

    if-ne v4, v5, :cond_20

    .line 107
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetRight:I

    goto :goto_2

    .line 108
    :cond_20
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetTop:I

    if-ne v4, v5, :cond_21

    .line 109
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetTop:I

    goto :goto_2

    .line 110
    :cond_21
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineInsetBottom:I

    if-ne v4, v5, :cond_22

    .line 111
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetBottom:I

    goto :goto_2

    .line 112
    :cond_22
    sget v5, Lcom/xuexiang/xui/R$styleable;->XUILayout_xui_outlineExcludePadding:I

    if-ne v4, v5, :cond_23

    .line 113
    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsOutlineExcludePadding:Z

    :cond_23
    :goto_2
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_1

    .line 114
    :cond_24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    move v0, v1

    :goto_3
    if-nez v0, :cond_25

    if-eqz v2, :cond_25

    .line 115
    sget p2, Lcom/xuexiang/xui/R$attr;->xui_general_shadow_elevation:I

    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    .line 116
    :cond_25
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    iget p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p0, v3, p1, v0, p2}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIF)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetTop:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetBottom:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetLeft:I

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetRight:I

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsOutlineExcludePadding:Z

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    return p0
.end method

.method private drawRoundRect(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/Paint;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mPath:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, p2, p3, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mPath:Landroid/graphics/Path;

    invoke-virtual {p1, p2, p4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method private invalidate()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    goto :goto_0

    :cond_1
    int-to-float v1, v1

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    :cond_2
    return-void
.end method

.method private setShadowColorInner(I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineAmbientShadowColor(I)V

    .line 4
    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineSpotShadowColor(I)V

    :cond_1
    return-void
.end method

.method public static useFeature()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public dispatchRoundBorderDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    if-nez v1, :cond_2

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    if-nez v1, :cond_2

    :cond_1
    return-void

    .line 3
    :cond_2
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsShowBorderOnlyBeforeL:Z

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    if-eqz v1, :cond_3

    return-void

    .line 4
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    .line 5
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsOutlineExcludePadding:Z

    if-eqz v3, :cond_4

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    int-to-float v5, v5

    add-int/lit8 v6, v1, -0x1

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    add-int/lit8 v7, v2, -0x1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v7, v0

    int-to-float v0, v7

    .line 8
    invoke-virtual {v3, v4, v5, v6, v0}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    add-int/lit8 v3, v1, -0x1

    int-to-float v3, v3

    add-int/lit8 v4, v2, -0x1

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v0, v5, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 10
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    if-nez v0, :cond_5

    goto/16 :goto_3

    .line 11
    :cond_5
    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v4, 0x0

    const/4 v5, 0x0

    int-to-float v6, v1

    int-to-float v7, v2

    const/4 v8, 0x0

    const/16 v9, 0x1f

    move-object v3, p1

    .line 12
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v0

    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mMode:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    if-nez v1, :cond_6

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 19
    :cond_6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v2, v1, v3}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->drawRoundRect(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    .line 20
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 22
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderWidth:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    if-nez v0, :cond_8

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 27
    :cond_8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v1, v0, v2}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->drawRoundRect(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    :goto_2
    return-void

    .line 28
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mClipPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public drawDividers(Landroid/graphics/Canvas;II)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    if-lez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    .line 3
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v3, 0xff

    if-lez v0, :cond_3

    .line 4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    iget v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerColor:I

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerAlpha:I

    if-ge v0, v3, :cond_2

    .line 7
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    int-to-float v0, v0

    mul-float v0, v0, v2

    div-float v8, v0, v1

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetLeft:I

    int-to-float v5, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetRight:I

    sub-int v0, p2, v0

    int-to-float v7, v0

    iget-object v9, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    move-object v4, p1

    move v6, v8

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 10
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    if-lez v0, :cond_5

    .line 11
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    iget v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerColor:I

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerAlpha:I

    if-ge v0, v3, :cond_4

    .line 14
    iget-object v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_4
    int-to-float v0, p3

    .line 15
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    int-to-float v4, v4

    mul-float v4, v4, v2

    div-float/2addr v4, v1

    sub-float/2addr v0, v4

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v8, v0

    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetLeft:I

    int-to-float v5, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetRight:I

    sub-int v0, p2, v0

    int-to-float v7, v0

    iget-object v9, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    move-object v4, p1

    move v6, v8

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 17
    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    if-lez v0, :cond_7

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerAlpha:I

    if-ge v0, v3, :cond_6

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_6
    const/4 v5, 0x0

    .line 22
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetTop:I

    int-to-float v6, v0

    const/4 v7, 0x0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetBottom:I

    sub-int v0, p3, v0

    int-to-float v8, v0

    iget-object v9, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 23
    :cond_7
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    if-lez v0, :cond_9

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerAlpha:I

    if-ge v0, v3, :cond_8

    .line 27
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_8
    int-to-float v5, p2

    .line 28
    iget p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetTop:I

    int-to-float v4, p2

    iget p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetBottom:I

    sub-int/2addr p3, p2

    int-to-float v6, p3

    iget-object v7, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mDividerPaint:Landroid/graphics/Paint;

    move-object v2, p1

    move v3, v5

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_9
    return-void
.end method

.method public getHideRadiusSide()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    return v0
.end method

.method public getMeasuredHeightSpec(I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    if-lez v0, :cond_1

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    if-le v0, v1, :cond_1

    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    .line 6
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method public getMeasuredWidthSpec(I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    if-lez v0, :cond_1

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    if-le v0, v1, :cond_1

    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    .line 6
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method public getRadius()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    return v0
.end method

.method public getShadowAlpha()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    return v0
.end method

.method public getShadowColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    return v0
.end method

.method public getShadowElevation()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    return v0
.end method

.method public handleMiniHeight(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightMini:I

    if-ge p2, v0, :cond_0

    .line 2
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public handleMiniWidth(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthMini:I

    if-ge p2, v0, :cond_0

    .line 2
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public isRadiusWithSideHidden()Z
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onlyShowBottomDivider(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->updateBottomDivider(IIII)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    return-void
.end method

.method public onlyShowLeftDivider(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->updateLeftDivider(IIII)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    return-void
.end method

.method public onlyShowRightDivider(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->updateRightDivider(IIII)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    return-void
.end method

.method public onlyShowTopDivider(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->updateTopDivider(IIII)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderColor:I

    return-void
.end method

.method public setBorderWidth(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBorderWidth:I

    return-void
.end method

.method public setBottomDividerAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerAlpha:I

    return-void
.end method

.method public setHeightLimit(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHeightLimit:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setHideRadiusSide(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIF)V

    return-void
.end method

.method public setLeftDividerAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerAlpha:I

    return-void
.end method

.method public setOuterNormalColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOuterNormalColor:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setOutlineExcludePadding(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsOutlineExcludePadding:Z

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    :cond_1
    return-void
.end method

.method public setOutlineInset(IIII)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetLeft:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetRight:I

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetTop:I

    .line 6
    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOutlineInsetBottom:I

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    :cond_1
    return-void
.end method

.method public setRadius(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-eq v0, p1, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIF)V

    :cond_0
    return-void
.end method

.method public setRadius(II)V
    .locals 2

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-ne v0, p1, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    if-ne p2, v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIF)V

    return-void
.end method

.method public setRadiusAndShadow(IIF)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIF)V

    return-void
.end method

.method public setRadiusAndShadow(IIIF)V
    .locals 6

    .line 2
    iget v4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIIF)V

    return-void
.end method

.method public setRadiusAndShadow(IIIIF)V
    .locals 14

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    .line 3
    iget-object v3, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mOwner:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_0

    return-void

    .line 4
    :cond_0
    iput v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    .line 5
    iput v2, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v1, :cond_5

    const/4 v7, 0x7

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    if-ne v2, v5, :cond_1

    new-array v2, v10, [F

    aput v6, v2, v4

    aput v6, v2, v5

    aput v6, v2, v13

    aput v6, v2, v12

    int-to-float v10, v1

    aput v10, v2, v11

    int-to-float v10, v1

    aput v10, v2, v9

    int-to-float v9, v1

    aput v9, v2, v8

    int-to-float v1, v1

    aput v1, v2, v7

    .line 6
    iput-object v2, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    goto :goto_0

    :cond_1
    if-ne v2, v13, :cond_2

    new-array v2, v10, [F

    int-to-float v10, v1

    aput v10, v2, v4

    int-to-float v10, v1

    aput v10, v2, v5

    aput v6, v2, v13

    aput v6, v2, v12

    aput v6, v2, v11

    aput v6, v2, v9

    int-to-float v9, v1

    aput v9, v2, v8

    int-to-float v1, v1

    aput v1, v2, v7

    .line 7
    iput-object v2, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    goto :goto_0

    :cond_2
    if-ne v2, v12, :cond_3

    new-array v2, v10, [F

    int-to-float v10, v1

    aput v10, v2, v4

    int-to-float v10, v1

    aput v10, v2, v5

    int-to-float v10, v1

    aput v10, v2, v13

    int-to-float v1, v1

    aput v1, v2, v12

    aput v6, v2, v11

    aput v6, v2, v9

    aput v6, v2, v8

    aput v6, v2, v7

    .line 8
    iput-object v2, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    goto :goto_0

    :cond_3
    if-ne v2, v11, :cond_4

    new-array v2, v10, [F

    aput v6, v2, v4

    aput v6, v2, v5

    int-to-float v10, v1

    aput v10, v2, v13

    int-to-float v10, v1

    aput v10, v2, v12

    int-to-float v10, v1

    aput v10, v2, v11

    int-to-float v1, v1

    aput v1, v2, v9

    aput v6, v2, v8

    aput v6, v2, v7

    .line 9
    iput-object v2, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    .line 10
    iput-object v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadiusArray:[F

    :cond_5
    :goto_0
    move/from16 v1, p3

    .line 11
    iput v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    move/from16 v1, p5

    .line 12
    iput v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    move/from16 v1, p4

    .line 13
    iput v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    .line 14
    invoke-static {}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->useFeature()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 15
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->isRadiusWithSideHidden()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    .line 16
    :cond_6
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    int-to-float v1, v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setElevation(F)V

    goto :goto_2

    .line 17
    :cond_7
    :goto_1
    invoke-virtual {v3, v6}, Landroid/view/View;->setElevation(F)V

    .line 18
    :goto_2
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setShadowColorInner(I)V

    .line 19
    new-instance v1, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper$1;-><init>(Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 20
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    if-lez v1, :cond_8

    const/4 v4, 0x1

    :cond_8
    invoke-virtual {v3, v4}, Landroid/view/View;->setClipToOutline(Z)V

    .line 21
    :cond_9
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRightDividerAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerAlpha:I

    return-void
.end method

.method public setShadowAlpha(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->invalidate()V

    return-void
.end method

.method public setShadowColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowColor:I

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setShadowColorInner(I)V

    return-void
.end method

.method public setShadowElevation(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->invalidate()V

    return-void
.end method

.method public setShowBorderOnlyBeforeL(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mIsShowBorderOnlyBeforeL:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->invalidate()V

    return-void
.end method

.method public setTopDividerAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerAlpha:I

    return-void
.end method

.method public setUseThemeGeneralShadowElevation()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mContext:Landroid/content/Context;

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_general_shadow_elevation:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowElevation:I

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRadius:I

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mHideRadiusSide:I

    iget v3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mShadowAlpha:F

    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->setRadiusAndShadow(IIIF)V

    return-void
.end method

.method public setWidthLimit(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mWidthLimit:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public updateBottomDivider(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetLeft:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerInsetRight:I

    .line 3
    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerColor:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mBottomDividerHeight:I

    return-void
.end method

.method public updateLeftDivider(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetTop:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerInsetBottom:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerWidth:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mLeftDividerColor:I

    return-void
.end method

.method public updateRightDivider(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetTop:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerInsetBottom:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerWidth:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mRightDividerColor:I

    return-void
.end method

.method public updateTopDivider(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetLeft:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerInsetRight:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerHeight:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/layout/XUILayoutHelper;->mTopDividerColor:I

    return-void
.end method
