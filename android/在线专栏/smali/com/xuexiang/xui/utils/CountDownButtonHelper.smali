.class public Lcom/xuexiang/xui/utils/CountDownButtonHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;
    }
.end annotation


# instance fields
.field private mButton:Landroid/widget/TextView;

.field private mCountDownTime:I

.field private mCountDownTimer:Landroid/os/CountDownTimer;

.field private mInterval:I

.field private mListener:Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;I)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;-><init>(Landroid/widget/TextView;II)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mButton:Landroid/widget/TextView;

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTime:I

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mInterval:I

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->initCountDownTimer()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mListener:Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mButton:Landroid/widget/TextView;

    return-object p0
.end method

.method private initCountDownTimer()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;

    iget v1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTime:I

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v3, v1

    iget v1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mInterval:I

    mul-int/lit16 v1, v1, 0x3e8

    add-int/lit8 v1, v1, -0xa

    int-to-long v5, v1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;-><init>(Lcom/xuexiang/xui/utils/CountDownButtonHelper;JJ)V

    iput-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->cancel()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mListener:Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mButton:Landroid/widget/TextView;

    return-void
.end method

.method public setOnCountDownListener(Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;)Lcom/xuexiang/xui/utils/CountDownButtonHelper;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mListener:Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    return-object p0
.end method

.method public start()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->initCountDownTimer()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mButton:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method
