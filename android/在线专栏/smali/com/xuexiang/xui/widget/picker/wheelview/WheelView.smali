.class public Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;,
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;
    }
.end annotation


# static fields
.field private static final DEFAULT_TEXT_TARGET_SKEWX:F = 0.5f

.field private static final SCALE_CONTENT:F = 0.8f

.field private static final VELOCITY_FLING:I = 0x5


# instance fields
.field private CENTER_CONTENT_OFFSET:F

.field private adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

.field private centerY:F

.field private context:Landroid/content/Context;

.field private dividerColor:I

.field private dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field private drawCenterContentStart:I

.field private drawOutContentStart:I

.field private firstLineY:F

.field private gestureDetector:Landroid/view/GestureDetector;

.field private handler:Landroid/os/Handler;

.field private initPosition:I

.field private isCenterLabel:Z

.field private isLoop:Z

.field private isOptions:Z

.field private itemHeight:F

.field private itemsVisible:I

.field private label:Ljava/lang/String;

.field private lineSpacingMultiplier:F

.field private mExecutor:Ljava/util/concurrent/ScheduledExecutorService;

.field private mFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private mGravity:I

.field private mOffset:I

.field private maxTextHeight:I

.field private maxTextWidth:I

.field private measuredHeight:I

.field private measuredWidth:I

.field private onItemSelectedListener:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

.field private paintCenterText:Landroid/text/TextPaint;

.field private paintIndicator:Landroid/graphics/Paint;

.field private paintOuterText:Landroid/text/TextPaint;

.field private preCurrentIndex:I

.field private previousY:F

.field private radius:I

.field private secondLineY:F

.field private selectedItem:I

.field private startTime:J

.field private textColorCenter:I

.field private textColorOut:I

.field private textSize:I

.field private textXOffset:I

.field private totalScrollY:F

.field private typeface:Landroid/graphics/Typeface;

.field private widthMeasureSpec:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isOptions:Z

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->typeface:Landroid/graphics/Typeface;

    const v1, 0x3fcccccd    # 1.6f

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    const/16 v1, 0xb

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->previousY:F

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->startTime:J

    const/16 v1, 0x11

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mGravity:I

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_wheel_view_text_size:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 17
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, v2, v3

    if-gez v4, :cond_0

    const v2, 0x4019999a    # 2.4f

    .line 18
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    goto :goto_0

    :cond_0
    const/high16 v4, 0x3fc00000    # 1.5f

    cmpg-float v3, v3, v2

    if-gtz v3, :cond_1

    cmpg-float v3, v2, v4

    if-gez v3, :cond_1

    const v2, 0x40666666    # 3.6f

    .line 19
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    goto :goto_0

    :cond_1
    const/high16 v3, 0x40000000    # 2.0f

    cmpg-float v4, v4, v2

    if-gtz v4, :cond_2

    cmpg-float v4, v2, v3

    if-gez v4, :cond_2

    const/high16 v2, 0x40900000    # 4.5f

    .line 20
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    goto :goto_0

    :cond_2
    const/high16 v4, 0x40400000    # 3.0f

    cmpg-float v3, v3, v2

    if-gtz v3, :cond_3

    cmpg-float v3, v2, v4

    if-gez v3, :cond_3

    const/high16 v2, 0x40c00000    # 6.0f

    .line 21
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    goto :goto_0

    :cond_3
    cmpl-float v3, v2, v4

    if-ltz v3, :cond_4

    const/high16 v3, 0x40200000    # 2.5f

    mul-float v2, v2, v3

    .line 22
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 23
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->WheelView:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_gravity:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mGravity:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorOut:I

    const v1, -0x575758

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorOut:I

    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textColorCenter:I

    const v1, -0xd5d5d6

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorCenter:I

    .line 27
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_dividerColor:I

    const v1, -0x2a2a2b

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->dividerColor:I

    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_textSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->WheelView_wv_lineSpacingMultiplier:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    .line 30
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    :cond_5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->judgeLineSpace()V

    .line 32
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initLoopView(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->onItemSelectedListener:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    return-object p0
.end method

.method private getContentText(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/xuexiang/xui/widget/picker/wheelview/interfaces/IPickerViewItem;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/interfaces/IPickerViewItem;

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/interfaces/IPickerViewItem;->getPickerViewText()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%02d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getLoopMappingIndex(I)I
    .locals 1

    if-gez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    add-int/2addr p1, v0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getLoopMappingIndex(I)I

    move-result p1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    sub-int/2addr p1, v0

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getLoopMappingIndex(I)I

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method private initLoopView(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->context:Landroid/content/Context;

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->handler:Landroid/os/Handler;

    .line 3
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/wheelview/listener/LoopViewGestureListener;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/wheelview/listener/LoopViewGestureListener;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->gestureDetector:Landroid/view/GestureDetector;

    const/4 p1, 0x0

    .line 4
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPaints()V

    return-void
.end method

.method private initPaints()V
    .locals 3

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorOut:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 6
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorCenter:I

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    const v2, 0x3f8ccccd    # 1.1f

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextScaleX(F)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 12
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->dividerColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method private judgeLineSpace()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    .line 2
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    goto :goto_0

    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    :cond_1
    :goto_0
    return-void
.end method

.method private measureTextWidthHeight()V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v3, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getContentText(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v4, v3, v1, v5, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    .line 6
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextWidth:I

    if-le v3, v4, :cond_0

    .line 7
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextWidth:I

    .line 8
    :cond_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    const-string v4, "\u661f\u671f"

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v1, v5, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    add-int/2addr v3, v5

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    return-void
.end method

.method private measuredCenterContentStart(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mGravity:I

    const/4 v1, 0x3

    if-eq p1, v1, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_3

    const/16 v1, 0x11

    if-eq p1, v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isOptions:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    if-nez p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    goto :goto_1

    .line 6
    :cond_2
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    goto :goto_1

    .line 7
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    float-to-int v0, v0

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    goto :goto_1

    .line 8
    :cond_4
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    :goto_1
    return-void
.end method

.method private measuredOutContentStart(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mGravity:I

    const/4 v1, 0x3

    if-eq p1, v1, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_3

    const/16 v1, 0x11

    if-eq p1, v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isOptions:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    if-nez p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    goto :goto_1

    .line 6
    :cond_2
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    goto :goto_1

    .line 7
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    float-to-int v0, v0

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    goto :goto_1

    .line 8
    :cond_4
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    :goto_1
    return-void
.end method

.method private reMeasureTextSize(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    .line 5
    :goto_0
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    if-le v1, v4, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    int-to-float v4, v2

    invoke-virtual {v1, v4}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, p1, v3, v4, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    int-to-float v0, v2

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    return-void
.end method

.method private remeasure()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measureTextWidthHeight()V

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    mul-int/lit8 v1, v0, 0x2

    int-to-double v1, v1

    const-wide v3, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v1, v3

    double-to-int v1, v1

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredHeight:I

    int-to-double v0, v0

    div-double/2addr v0, v3

    double-to-int v0, v0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->widthMeasureSpec:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredHeight:I

    int-to-float v1, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    sub-float/2addr v1, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    int-to-float v0, v0

    add-float/2addr v0, v2

    div-float/2addr v0, v3

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v1, v1

    sub-float/2addr v2, v1

    div-float/2addr v2, v3

    sub-float/2addr v0, v2

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->centerY:F

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 11
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    if-eqz v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    .line 14
    :cond_2
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    return-void
.end method


# virtual methods
.method public cancelFuture()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mFuture:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mFuture:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mFuture:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final getAdapter()Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    return-object v0
.end method

.method public final getCurrentItem()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->selectedItem:I

    if-ltz v2, :cond_1

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    if-lt v2, v0, :cond_2

    .line 3
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->selectedItem:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    .line 4
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->selectedItem:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    return v0
.end method

.method public getItemHeight()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    return v0
.end method

.method public getItemsCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getTextWidth(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    .line 3
    new-array v2, v1, [F

    .line 4
    invoke-virtual {p1, p2, v2}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    const/4 p1, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5
    aget p2, v2, v0

    float-to-double v3, p2

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p2, v3

    add-int/2addr p1, p2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p1

    :cond_1
    return v0
.end method

.method public getTotalScrollY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    return v0
.end method

.method public isCenterLabel(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    return-void
.end method

.method public isLoop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    if-nez v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    const/4 v8, 0x0

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    const/4 v9, 0x1

    sub-int/2addr v2, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    .line 3
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    new-array v10, v2, [Ljava/lang/Object;

    .line 4
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    .line 5
    :try_start_0
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v3}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v3

    rem-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "WheelView"

    const-string v2, "\u51fa\u9519\u4e86\uff01adapter.getItemsCount() == 0\uff0c\u8054\u52a8\u6570\u636e\u4e0d\u5339\u914d"

    .line 6
    invoke-static {v1, v2}, Lcom/xuexiang/xui/logs/UILog;->eTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :goto_0
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    if-nez v1, :cond_2

    .line 8
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    if-gez v1, :cond_1

    .line 9
    iput v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    .line 10
    :cond_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v1, v2, :cond_4

    .line 11
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v1

    sub-int/2addr v1, v9

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    goto :goto_1

    .line 12
    :cond_2
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    if-gez v1, :cond_3

    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v1

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    .line 14
    :cond_3
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v1, v2, :cond_4

    .line 15
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    .line 16
    :cond_4
    :goto_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    rem-float v11, v1, v2

    const/4 v1, 0x0

    .line 17
    :goto_2
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    if-ge v1, v2, :cond_8

    .line 18
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v1

    sub-int/2addr v3, v2

    .line 19
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    if-eqz v2, :cond_5

    .line 20
    invoke-direct {v0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getLoopMappingIndex(I)I

    move-result v2

    .line 21
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v3, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v10, v1

    goto :goto_3

    :cond_5
    const-string v2, ""

    if-gez v3, :cond_6

    .line 22
    aput-object v2, v10, v1

    goto :goto_3

    .line 23
    :cond_6
    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v4}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v4

    sub-int/2addr v4, v9

    if-le v3, v4, :cond_7

    .line 24
    aput-object v2, v10, v1

    goto :goto_3

    .line 25
    :cond_7
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v10, v1

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 26
    :cond_8
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    sget-object v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;->WRAP:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    const/4 v12, 0x0

    if-ne v1, v2, :cond_b

    .line 27
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/high16 v2, 0x41400000    # 12.0f

    if-eqz v1, :cond_9

    .line 28
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextWidth:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v3, 0x40000000    # 2.0f

    goto :goto_4

    .line 29
    :cond_9
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextWidth:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v3, 0x40800000    # 4.0f

    :goto_4
    div-float/2addr v1, v3

    sub-float/2addr v1, v2

    cmpg-float v2, v1, v12

    if-gtz v2, :cond_a

    const/high16 v1, 0x41200000    # 10.0f

    const/high16 v13, 0x41200000    # 10.0f

    goto :goto_5

    :cond_a
    move v13, v1

    .line 30
    :goto_5
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v1, v1

    sub-float v14, v1, v13

    .line 31
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v13

    move v3, v5

    move v4, v14

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 32
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    .line 33
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v4, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 34
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v4, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 35
    :goto_6
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    if-eqz v1, :cond_c

    .line 36
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getTextWidth(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v1, v2

    .line 37
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    int-to-float v1, v1

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    sub-float/2addr v1, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->centerY:F

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_c
    const/4 v1, 0x0

    .line 38
    :goto_7
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    if-ge v1, v2, :cond_16

    .line 39
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 40
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    int-to-float v3, v1

    mul-float v2, v2, v3

    sub-float/2addr v2, v11

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    const-wide v4, 0x4056800000000000L    # 90.0

    const-wide v13, 0x400921fb54442d18L    # Math.PI

    div-double v13, v2, v13

    const-wide v15, 0x4066800000000000L    # 180.0

    mul-double v13, v13, v15

    sub-double/2addr v4, v13

    double-to-float v4, v4

    const/high16 v5, 0x42b40000    # 90.0f

    cmpl-float v6, v4, v5

    if-gez v6, :cond_15

    const/high16 v6, -0x3d4c0000    # -90.0f

    cmpg-float v6, v4, v6

    if-gtz v6, :cond_d

    goto/16 :goto_e

    .line 41
    :cond_d
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v6

    div-float/2addr v6, v5

    float-to-double v5, v6

    const-wide v13, 0x400199999999999aL    # 2.2

    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float v5, v5

    .line 42
    iget-boolean v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel:Z

    if-nez v6, :cond_e

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    aget-object v6, v10, v1

    invoke-direct {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getContentText(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    .line 43
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v13, v10, v1

    invoke-direct {v0, v13}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getContentText(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_8

    .line 44
    :cond_e
    aget-object v6, v10, v1

    invoke-direct {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getContentText(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 45
    :goto_8
    invoke-direct {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->reMeasureTextSize(Ljava/lang/String;)V

    .line 46
    invoke-direct {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredCenterContentStart(Ljava/lang/String;)V

    .line 47
    invoke-direct {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredOutContentStart(Ljava/lang/String;)V

    .line 48
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    int-to-double v13, v13

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v15

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    int-to-double v8, v9

    mul-double v15, v15, v8

    sub-double/2addr v13, v15

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    move-wide/from16 v17, v13

    int-to-double v12, v15

    mul-double v8, v8, v12

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    div-double/2addr v8, v12

    sub-double v13, v17, v8

    double-to-float v8, v13

    const/4 v9, 0x0

    .line 49
    invoke-virtual {v7, v9, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 50
    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    const v12, 0x3f4ccccd    # 0.8f

    const/high16 v13, 0x3f800000    # 1.0f

    cmpg-float v14, v8, v9

    if-gtz v14, :cond_f

    iget v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v14, v14

    add-float/2addr v14, v8

    cmpl-float v14, v14, v9

    if-ltz v14, :cond_f

    .line 51
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 52
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    sub-float/2addr v5, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v9, v4, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float v4, v4, v12

    invoke-virtual {v7, v13, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 54
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v5, v5

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 55
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 56
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 57
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->firstLineY:F

    sub-float/2addr v4, v8

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v5, v5

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    float-to-int v8, v8

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v4, v5, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v13

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 59
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v3, v3

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    sub-float/2addr v3, v4

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 60
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_9
    const/4 v9, 0x0

    const/4 v14, 0x0

    goto/16 :goto_d

    .line 61
    :cond_f
    iget v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    cmpg-float v15, v8, v14

    if-gtz v15, :cond_10

    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v15, v15

    add-float/2addr v15, v8

    cmpl-float v15, v15, v14

    if-ltz v15, :cond_10

    .line 62
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 63
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    sub-float/2addr v5, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v9, v4, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 64
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float v4, v4, v13

    invoke-virtual {v7, v13, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 65
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v5, v5

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    sub-float/2addr v5, v9

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 67
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 68
    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->secondLineY:F

    sub-float/2addr v4, v8

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    int-to-float v5, v5

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    float-to-int v8, v8

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v4, v5, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 69
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v12

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 70
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 71
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_9

    :cond_10
    cmpl-float v9, v8, v9

    if-ltz v9, :cond_11

    .line 72
    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v15, v9

    add-float/2addr v15, v8

    cmpg-float v8, v15, v14

    if-gtz v8, :cond_11

    int-to-float v2, v9

    .line 73
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->CENTER_CONTENT_OFFSET:F

    sub-float/2addr v2, v3

    .line 74
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawCenterContentStart:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v3, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 75
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->preCurrentIndex:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v1

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->selectedItem:I

    goto/16 :goto_9

    .line 76
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 77
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    float-to-int v9, v9

    const/4 v14, 0x0

    invoke-virtual {v7, v14, v14, v8, v9}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 78
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v12

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 79
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textXOffset:I

    const/4 v8, -0x1

    if-nez v3, :cond_12

    const/4 v3, 0x0

    :goto_a
    const/4 v9, 0x0

    goto :goto_b

    :cond_12
    if-lez v3, :cond_13

    const/4 v3, 0x1

    goto :goto_a

    :cond_13
    const/4 v3, -0x1

    goto :goto_a

    :goto_b
    cmpl-float v4, v4, v9

    if-lez v4, :cond_14

    goto :goto_c

    :cond_14
    const/4 v8, 0x1

    :goto_c
    mul-int v3, v3, v8

    int-to-float v3, v3

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    mul-float v3, v3, v5

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSkewX(F)V

    .line 80
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    sub-float/2addr v13, v5

    const/high16 v3, 0x437f0000    # 255.0f

    mul-float v13, v13, v3

    float-to-int v3, v13

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setAlpha(I)V

    .line 81
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->drawOutContentStart:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textXOffset:I

    int-to-float v3, v3

    mul-float v3, v3, v5

    add-float/2addr v2, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->maxTextHeight:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 82
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 83
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 84
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_f

    :cond_15
    :goto_e
    const/4 v9, 0x0

    const/4 v14, 0x0

    .line 85
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_f
    add-int/lit8 v1, v1, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v12, 0x0

    goto/16 :goto_7

    :cond_16
    return-void
.end method

.method public final onItemSelected()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->onItemSelectedListener:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$1;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->widthMeasureSpec:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->remeasure()V

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredWidth:I

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->measuredHeight:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->gestureDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    mul-float v1, v1, v2

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    invoke-interface {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    mul-float v2, v2, v4

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    const/4 v6, 0x2

    if-eq v4, v6, :cond_1

    if-nez v0, :cond_5

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    int-to-float v2, v1

    sub-float/2addr v2, v0

    int-to-float v0, v1

    div-float/2addr v2, v0

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->radius:I

    int-to-double v7, v2

    mul-double v0, v0, v7

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    float-to-double v7, v4

    add-double/2addr v0, v7

    float-to-double v7, v2

    div-double/2addr v0, v7

    double-to-int v0, v0

    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    rem-float/2addr v1, v2

    add-float/2addr v1, v2

    rem-float/2addr v1, v2

    .line 9
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemsVisible:I

    div-int/2addr v4, v6

    sub-int/2addr v0, v4

    int-to-float v0, v0

    mul-float v0, v0, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->startTime:J

    sub-long/2addr v0, v6

    const-wide/16 v6, 0x78

    cmp-long v2, v0, v6

    if-lez v2, :cond_0

    .line 11
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->DAGGLE:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->smoothScroll(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V

    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->CLICK:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->smoothScroll(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V

    goto :goto_0

    .line 13
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->previousY:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    sub-float/2addr v0, v4

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->previousY:F

    .line 15
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    add-float/2addr v4, v0

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    .line 16
    iget-boolean v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    if-nez v6, :cond_5

    .line 17
    iget v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    const/high16 v7, 0x3e800000    # 0.25f

    mul-float v8, v6, v7

    sub-float v8, v4, v8

    const/4 v9, 0x0

    cmpg-float v1, v8, v1

    if-gez v1, :cond_2

    cmpg-float v1, v0, v9

    if-ltz v1, :cond_3

    :cond_2
    mul-float v6, v6, v7

    add-float/2addr v6, v4

    cmpl-float v1, v6, v2

    if-lez v1, :cond_5

    cmpl-float v1, v0, v9

    if-lez v1, :cond_5

    :cond_3
    sub-float/2addr v4, v0

    .line 18
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    const/4 v5, 0x1

    goto :goto_0

    .line 19
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->startTime:J

    .line 20
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->cancelFuture()V

    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->previousY:F

    :cond_5
    :goto_0
    if-nez v5, :cond_6

    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_6

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_6
    return v3
.end method

.method public final scrollBy(F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->cancelFuture()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/wheelview/timer/InertiaTimerTask;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/timer/InertiaTimerTask;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;F)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x5

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mFuture:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->adapter:Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->remeasure()V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->selectedItem:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->initPosition:I

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCyclic(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isLoop:Z

    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->dividerColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintIndicator:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    return-void
.end method

.method public setGravity(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mGravity:I

    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isOptions:Z

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->label:Ljava/lang/String;

    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->lineSpacingMultiplier:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->judgeLineSpace()V

    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->onItemSelectedListener:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorCenter:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    return-void
.end method

.method public setTextColorOut(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textColorOut:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, p1

    float-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textSize:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method public setTextXOffset(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->textXOffset:I

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextScaleX(F)V

    :cond_0
    return-void
.end method

.method public setTotalScrollY(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->typeface:Landroid/graphics/Typeface;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintOuterText:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->paintCenterText:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public smoothScroll(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->cancelFuture()V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->FLING:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->DAGGLE:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    if-ne p1, v0, :cond_2

    .line 3
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->totalScrollY:F

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->itemHeight:F

    rem-float/2addr p1, v0

    add-float/2addr p1, v0

    rem-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    int-to-float v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v0, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    int-to-float p1, p1

    sub-float/2addr v0, p1

    float-to-int p1, v0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    goto :goto_0

    :cond_1
    neg-int p1, p1

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/wheelview/timer/SmoothScrollTimerTask;

    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mOffset:I

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/timer/SmoothScrollTimerTask;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->mFuture:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
