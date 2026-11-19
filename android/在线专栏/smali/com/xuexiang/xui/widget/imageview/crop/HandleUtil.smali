.class final Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TARGET_RADIUS_DP:I = 0x18


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static focusCenter()Z
    .locals 1

    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->showGuidelines()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method static getOffset(Lcom/xuexiang/xui/widget/imageview/crop/Handle;FFFFFF)Landroid/util/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/imageview/crop/Handle;",
            "FFFFFF)",
            "Landroid/util/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    :goto_0
    const/4 p0, 0x0

    goto :goto_4

    :pswitch_0
    add-float/2addr p5, p3

    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr p5, p0

    add-float/2addr p4, p6

    div-float/2addr p4, p0

    goto :goto_2

    :pswitch_1
    sub-float/2addr p6, p2

    move p0, p6

    goto :goto_4

    :pswitch_2
    sub-float/2addr p5, p1

    move v0, p5

    goto :goto_0

    :pswitch_3
    sub-float/2addr p4, p2

    move p0, p4

    goto :goto_4

    :pswitch_4
    sub-float/2addr p3, p1

    move v0, p3

    goto :goto_0

    :pswitch_5
    sub-float v0, p5, p1

    goto :goto_1

    :pswitch_6
    sub-float v0, p3, p1

    :goto_1
    sub-float p0, p6, p2

    goto :goto_4

    :goto_2
    :pswitch_7
    sub-float v0, p5, p1

    goto :goto_3

    :pswitch_8
    sub-float v0, p3, p1

    :goto_3
    sub-float p0, p4, p2

    .line 2
    :goto_4
    new-instance p1, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static getPressedHandle(FFFFFFF)Lcom/xuexiang/xui/widget/imageview/crop/Handle;
    .locals 6

    .line 1
    invoke-static {p0, p1, p2, p3, p6}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCornerTargetZone(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-static {p0, p1, p4, p3, p6}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCornerTargetZone(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto/16 :goto_0

    .line 5
    :cond_1
    invoke-static {p0, p1, p2, p5, p6}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCornerTargetZone(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto/16 :goto_0

    .line 7
    :cond_2
    invoke-static {p0, p1, p4, p5, p6}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCornerTargetZone(FFFFF)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto/16 :goto_0

    .line 9
    :cond_3
    invoke-static/range {p0 .. p5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCenterTargetZone(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->focusCenter()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto/16 :goto_0

    :cond_4
    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p4

    move v4, p3

    move v5, p6

    .line 11
    invoke-static/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInHorizontalTargetZone(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto :goto_0

    :cond_5
    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p4

    move v4, p5

    move v5, p6

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInHorizontalTargetZone(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto :goto_0

    :cond_6
    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p5

    move v5, p6

    .line 15
    invoke-static/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInVerticalTargetZone(FFFFFF)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 16
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto :goto_0

    :cond_7
    move v0, p0

    move v1, p1

    move v2, p4

    move v3, p3

    move v4, p5

    move v5, p6

    .line 17
    invoke-static/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInVerticalTargetZone(FFFFFF)Z

    move-result p6

    if-eqz p6, :cond_8

    .line 18
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto :goto_0

    .line 19
    :cond_8
    invoke-static/range {p0 .. p5}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->isInCenterTargetZone(FFFFFF)Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/HandleUtil;->focusCenter()Z

    move-result p0

    if-nez p0, :cond_9

    .line 20
    sget-object p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    goto :goto_0

    :cond_9
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method static getTargetRadius(Landroid/content/Context;)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v0, 0x1

    const/high16 v1, 0x41c00000    # 24.0f

    .line 2
    invoke-static {v0, v1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0
.end method

.method private static isInCenterTargetZone(FFFFFF)Z
    .locals 0

    cmpl-float p2, p0, p2

    if-lez p2, :cond_0

    cmpg-float p0, p0, p4

    if-gez p0, :cond_0

    cmpl-float p0, p1, p3

    if-lez p0, :cond_0

    cmpg-float p0, p1, p5

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isInCornerTargetZone(FFFFF)Z
    .locals 0

    sub-float/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p4

    if-gtz p0, :cond_0

    sub-float/2addr p1, p3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p4

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isInHorizontalTargetZone(FFFFFF)Z
    .locals 0

    cmpl-float p2, p0, p2

    if-lez p2, :cond_0

    cmpg-float p0, p0, p3

    if-gez p0, :cond_0

    sub-float/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p5

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isInVerticalTargetZone(FFFFFF)Z
    .locals 0

    sub-float/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, p5

    if-gtz p0, :cond_0

    cmpl-float p0, p1, p3

    if-lez p0, :cond_0

    cmpg-float p0, p1, p4

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
