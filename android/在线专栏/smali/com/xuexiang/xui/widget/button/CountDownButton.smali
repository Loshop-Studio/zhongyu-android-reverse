.class public Lcom/xuexiang/xui/widget/button/CountDownButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# static fields
.field private static final DEFAULT_COUNTDOWN_TIME:I = 0xea60

.field private static final DEFAULT_COUNT_FORMAT:Ljava/lang/String; = "%ds"

.field private static final DEFAULT_INTERVAL:I = 0x3e8


# instance fields
.field private isCountDownNow:Z

.field private mCountDownFormat:Ljava/lang/String;

.field private mCountDownTime:J

.field private mCountDownTimer:Landroid/os/CountDownTimer;

.field private mDefaultText:Ljava/lang/String;

.field private mEnableCountDown:Z

.field private mInterval:J

.field private mOnClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->CountDownButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mEnableCountDown:Z

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/CountDownButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/button/CountDownButton;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownFormat:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/button/CountDownButton;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->isCountDownNow:Z

    return p1
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/button/CountDownButton;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mDefaultText:Ljava/lang/String;

    return-object p0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/CountDownButton;->initAttr(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTimer:Landroid/os/CountDownTimer;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lcom/xuexiang/xui/widget/button/CountDownButton$1;

    iget-wide v2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    iget-wide v4, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mInterval:J

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/button/CountDownButton$1;-><init>(Lcom/xuexiang/xui/widget/button/CountDownButton;JJ)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTimer:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method private initAttr(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->CountDownButton:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->CountDownButton_cdbt_countDownFormat:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownFormat:Ljava/lang/String;

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "%ds"

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownFormat:Ljava/lang/String;

    .line 5
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->CountDownButton_cdbt_countDown:I

    const p3, 0xea60

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    int-to-long p2, p2

    iput-wide p2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->CountDownButton_cdbt_countDownInterval:I

    const/16 p3, 0x3e8

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    int-to-long p2, p2

    iput-wide p2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mInterval:J

    .line 7
    iget-wide v2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    const/4 v0, 0x1

    cmp-long v4, v2, p2

    if-lez v4, :cond_1

    sget p2, Lcom/xuexiang/xui/R$styleable;->CountDownButton_cdbt_enableCountDown:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mEnableCountDown:Z

    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private startCountDown()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mDefaultText:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->isCountDownNow:Z

    return-void
.end method


# virtual methods
.method public cancelCountDown()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->isCountDownNow:Z

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mDefaultText:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->setEnabled(Z)V

    return-void
.end method

.method public isCountDownNow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->isCountDownNow:Z

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/Button;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mOnClickListener:Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-interface {v1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 6
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mEnableCountDown:Z

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->startCountDown()V

    .line 8
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/Button;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setCountDown(JJLjava/lang/String;)Lcom/xuexiang/xui/widget/button/CountDownButton;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    .line 2
    iput-object p5, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownFormat:Ljava/lang/String;

    .line 3
    iput-wide p3, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mInterval:J

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/CountDownButton;->setEnableCountDown(Z)Lcom/xuexiang/xui/widget/button/CountDownButton;

    return-object p0
.end method

.method public setCountDownFormat(Ljava/lang/String;)Lcom/xuexiang/xui/widget/button/CountDownButton;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownFormat:Ljava/lang/String;

    return-object p0
.end method

.method public setCountDownTime(J)Lcom/xuexiang/xui/widget/button/CountDownButton;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    return-object p0
.end method

.method public setEnableCountDown(Z)Lcom/xuexiang/xui/widget/button/CountDownButton;
    .locals 5

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mCountDownTime:J

    iget-wide v2, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mInterval:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mEnableCountDown:Z

    return-object p0
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->isCountDownNow()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/Button;->setClickable(Z)V

    return-void
.end method

.method public setInterval(J)Lcom/xuexiang/xui/widget/button/CountDownButton;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mInterval:J

    return-object p0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton;->mOnClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method
