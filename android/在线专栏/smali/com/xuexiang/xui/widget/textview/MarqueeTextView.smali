.class public Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;
    }
.end annotation


# static fields
.field private static final REDRAW_TEXT:I = 0x1


# instance fields
.field private mBaseline:I

.field private mCurrentIndex:I

.field private mCurrentPosition:F

.field private mDisplayList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;",
            ">;"
        }
    .end annotation
.end field

.field private mDisplayTextWidth:F

.field private mHandler:Landroid/os/Handler;

.field private mIsAutoDisplay:Z

.field private mIsAutoFit:Z

.field private mIsRolling:Z

.field private final mLock:Ljava/lang/Object;

.field private mOnMarqueeListener:Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;

.field private mScrollWidth:I

.field private mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

.field private mSpeed:I

.field private mStopMarquee:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mSpeed:I

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mLock:Ljava/lang/Object;

    .line 7
    new-instance p1, Landroid/os/Handler;

    new-instance v0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;-><init>(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    .line 8
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    return p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayTextWidth:F

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollNextDisplay()V

    return-void
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mSpeed:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->reDraw(I)V

    return-void
.end method

.method private addEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v3

    :cond_3
    return v3
.end method

.method private calculateBaseLine()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    iget v2, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    return v1
.end method

.method private handleRollFinished()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mOnMarqueeListener:Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->onMarqueeFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->initRoll()V

    :goto_1
    return-void
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView_mtv_isAutoFit:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoFit:Z

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->MarqueeTextView_mtv_isAutoDisplay:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoDisplay:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initRoll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoDisplay:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    :cond_0
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    .line 5
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->getDisplayItem(I)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->updateDisplayText(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoDisplay:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    :cond_2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    :goto_0
    return-void
.end method

.method private isRollingDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private isShowDisplayEntityValid()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onMarqueeFinished()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mOnMarqueeListener:Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;->onMarqueeFinished(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private reDraw(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->invalidate()V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mStopMarquee:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    int-to-long v2, p1

    .line 3
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    :goto_0
    return-void
.end method

.method private removeByDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->getDisplaySize()I

    move-result v0

    if-lez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 9
    monitor-exit v1

    return v4

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 12
    monitor-exit v1

    return v4

    .line 13
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private rollDisplayByIndex(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->getDisplayItem(I)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->updateDisplayText(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->handleRollFinished()V

    :goto_0
    return-void
.end method

.method private rollNextDisplay()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollDisplayByIndex(I)V

    return-void
.end method

.method private showDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayTextWidth:F

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mScrollWidth:I

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mStopMarquee:Z

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    :goto_0
    return-void
.end method

.method private updateDisplayText(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)V
    .locals 2

    if-eqz p1, :cond_3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mOnMarqueeListener:Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;

    if-eqz v0, :cond_2

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-interface {v0, p1, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;->onStartMarquee(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;I)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 5
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 7
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollDisplayByIndex(I)V

    return-void

    .line 8
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->showDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)V

    goto :goto_1

    .line 9
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollNextDisplay()V

    :goto_1
    return-void
.end method


# virtual methods
.method public addDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->addEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z

    move-result p1

    .line 5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    if-nez v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->startRoll()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_0
    return p1
.end method

.method public addDisplayString(Ljava/lang/String;)Z
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->addDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoDisplay:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public getCurrentIndex()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    return v0
.end method

.method public getCurrentPosition()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    return v0
.end method

.method public getDisplayItem(I)Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDisplayList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    return-object v0
.end method

.method public getDisplaySize()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getScrollWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mScrollWidth:I

    return v0
.end method

.method public getShowDisplayEntity()Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    return-object v0
.end method

.method public getSpeed()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mSpeed:I

    return v0
.end method

.method public hasDisplayMessage()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->getDisplaySize()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRolling()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    return v0
.end method

.method public measureView()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mScrollWidth:I

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->calculateBaseLine()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mBaseline:I

    return-object p0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mStopMarquee:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->isShowDisplayEntityValid()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    .line 4
    :goto_0
    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mStopMarquee:Z

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->isShowDisplayEntityValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->calculateBaseLine()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mBaseline:I

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mShowDisplayEntity:Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mBaseline:I

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsRolling:Z

    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onSizeChanged(IIII)V

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mIsAutoFit:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->measureView()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    :cond_0
    return-void
.end method

.method public removeDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;->isValid()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->isRollingDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt p1, v1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollDisplayByIndex(I)V

    return v2

    .line 6
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentIndex:I

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->rollDisplayByIndex(I)V

    return v0

    .line 7
    :cond_1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->removeByDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z

    move-result p1

    return p1

    :cond_2
    return v0
.end method

.method public removeDisplayString(Ljava/lang/String;)Z
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->removeDisplayEntity(Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;)Z

    move-result p1

    return p1
.end method

.method public setCurrentPosition(F)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    return-object p0
.end method

.method public setDisplayList(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;",
            ">;)",
            "Lcom/xuexiang/xui/widget/textview/MarqueeTextView;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object p0
.end method

.method public setDisplaySimpleList(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/xuexiang/xui/widget/textview/MarqueeTextView;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mDisplayList:Ljava/util/List;

    new-instance v2, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;

    invoke-direct {v2, v0}, Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public setOnMarqueeListener(Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mOnMarqueeListener:Lcom/xuexiang/xui/widget/textview/MarqueeTextView$OnMarqueeListener;

    return-object p0
.end method

.method public setScrollWidth(I)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mScrollWidth:I

    return-object p0
.end method

.method public setSpeed(I)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mSpeed:I

    return-object p0
.end method

.method public setViewWidth(I)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 1

    int-to-float v0, p1

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mCurrentPosition:F

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->mScrollWidth:I

    return-object p0
.end method

.method public startRoll()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->initRoll()V

    return-object p0
.end method

.method public startRoll(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/xuexiang/xui/widget/textview/marqueen/DisplayEntity;",
            ">;)",
            "Lcom/xuexiang/xui/widget/textview/MarqueeTextView;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->setDisplayList(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->startRoll()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    move-result-object p1

    return-object p1
.end method

.method public startSimpleRoll(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/xuexiang/xui/widget/textview/MarqueeTextView;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->setDisplaySimpleList(Ljava/util/List;)Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->startRoll()Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    move-result-object p1

    return-object p1
.end method
