.class public Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mAdjustHeight:I

.field private mBackgroundColor:I

.field private mCloseOnTouch:Z

.field private mCustomViewRes:I

.field private mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

.field private mEnterAnimation:Landroid/view/animation/Animation;

.field private mExitAnimation:Landroid/view/animation/Animation;

.field private mFitSystemWindows:Z

.field private mFocusAnimationEnabled:Z

.field private mFocusAnimationMaxValue:I

.field private mFocusAnimationStep:I

.field private mFocusBorderColor:I

.field private mFocusBorderSize:I

.field private mFocusCircleRadius:I

.field private mFocusCircleRadiusFactor:D

.field private mFocusOffSetX:I

.field private mFocusPositionX:I

.field private mFocusPositionY:I

.field private mFocusRectangleHeight:I

.field private mFocusRectangleWidth:I

.field private mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field private mId:Ljava/lang/String;

.field private mPictureGravity:I

.field private mPictureHeight:I

.field private mPictureOffSetX:I

.field private mPictureOffSetY:I

.field private mPictureResId:I

.field private mPictureWidth:I

.field private mRoundRectRadius:I

.field private mSpannedTitle:Landroid/text/Spanned;

.field private mTitle:Ljava/lang/String;

.field private mTitleGravity:I

.field private mTitleSize:I

.field private mTitleSizeUnit:I

.field private mTitleStyle:I

.field private mView:Landroid/view/View;

.field private mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 2
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusCircleRadiusFactor:D

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleGravity:I

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSize:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSizeUnit:I

    const/16 v1, 0x11

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureGravity:I

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mCloseOnTouch:Z

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mAdjustHeight:I

    .line 9
    sget-object v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    .line 11
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationEnabled:Z

    const/16 v0, 0x14

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationMaxValue:I

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationStep:I

    .line 14
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mActivity:Landroid/app/Activity;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mBackgroundColor:I

    return p0
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusBorderColor:I

    return p0
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusBorderSize:I

    return p0
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mCustomViewRes:I

    return p0
.end method

.method static synthetic access$1400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mEnterAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mExitAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mCloseOnTouch:Z

    return p0
.end method

.method static synthetic access$1800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFitSystemWindows:Z

    return p0
.end method

.method static synthetic access$1900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mAdjustHeight:I

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusOffSetX:I

    return p0
.end method

.method static synthetic access$2100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/FocusShape;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    return-object p0
.end method

.method static synthetic access$2200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/DismissListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mRoundRectRadius:I

    return p0
.end method

.method static synthetic access$2400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureResId:I

    return p0
.end method

.method static synthetic access$2500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureWidth:I

    return p0
.end method

.method static synthetic access$2600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureHeight:I

    return p0
.end method

.method static synthetic access$2700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureGravity:I

    return p0
.end method

.method static synthetic access$2800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetX:I

    return p0
.end method

.method static synthetic access$2900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetY:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitle:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionX:I

    return p0
.end method

.method static synthetic access$3100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionY:I

    return p0
.end method

.method static synthetic access$3200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusCircleRadius:I

    return p0
.end method

.method static synthetic access$3300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusRectangleWidth:I

    return p0
.end method

.method static synthetic access$3400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusRectangleHeight:I

    return p0
.end method

.method static synthetic access$3500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationEnabled:Z

    return p0
.end method

.method static synthetic access$3600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationMaxValue:I

    return p0
.end method

.method static synthetic access$3700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationStep:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/text/Spanned;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mSpannedTitle:Landroid/text/Spanned;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleGravity:I

    return p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleStyle:I

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSize:I

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSizeUnit:I

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)D
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusCircleRadiusFactor:D

    return-wide v0
.end method


# virtual methods
.method public adjustHeight(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mAdjustHeight:I

    return-object p0
.end method

.method public backgroundColor(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mBackgroundColor:I

    return-object p0
.end method

.method public build()Lcom/xuexiang/xui/widget/guidview/GuideCaseView;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)V

    return-object v0
.end method

.method public closeOnTouch(Z)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mCloseOnTouch:Z

    return-object p0
.end method

.method public customView(ILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mCustomViewRes:I

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;

    return-object p0
.end method

.method public disableFocusAnimation()Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationEnabled:Z

    return-object p0
.end method

.method public dismissListener(Lcom/xuexiang/xui/widget/guidview/DismissListener;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    return-object p0
.end method

.method public enterAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mEnterAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public exitAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mExitAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public fitSystemWindows(Z)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFitSystemWindows:Z

    return-object p0
.end method

.method public fitWindowsAuto()Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFitSystemWindows:Z

    return-object p0
.end method

.method public focusAnimationMaxValue(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationMaxValue:I

    return-object p0
.end method

.method public focusAnimationStep(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusAnimationStep:I

    return-object p0
.end method

.method public focusBorderColor(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusBorderColor:I

    return-object p0
.end method

.method public focusBorderSize(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusBorderSize:I

    return-object p0
.end method

.method public focusCircleAtPosition(III)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionX:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionY:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusCircleRadius:I

    return-object p0
.end method

.method public focusCircleRadiusFactor(D)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusCircleRadiusFactor:D

    return-object p0
.end method

.method public focusOn(Landroid/view/View;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mView:Landroid/view/View;

    return-object p0
.end method

.method public focusRectAtPosition(IIII)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionX:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusPositionY:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusRectangleWidth:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusRectangleHeight:I

    return-object p0
.end method

.method public focusShape(Lcom/xuexiang/xui/widget/guidview/FocusShape;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    return-object p0
.end method

.method public picture(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureResId:I

    return-object p0
.end method

.method public picture(III)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureResId:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureWidth:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureHeight:I

    return-object p0
.end method

.method public pictureGravity(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureGravity:I

    return-object p0
.end method

.method public pictureGravity(III)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureGravity:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetX:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetY:I

    return-object p0
.end method

.method public pictureOffSet(II)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetX:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetY:I

    return-object p0
.end method

.method public pictureOffSetX(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetX:I

    return-object p0
.end method

.method public pictureOffSetY(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mPictureOffSetY:I

    return-object p0
.end method

.method public roundRectRadius(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mRoundRectRadius:I

    return-object p0
.end method

.method public setFocusOffSetX(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mFocusOffSetX:I

    return-object p0
.end method

.method public show()V
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->build()Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->show()V

    return-void
.end method

.method public showOnce(Ljava/lang/String;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mId:Ljava/lang/String;

    return-object p0
.end method

.method public title(Landroid/text/Spanned;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mSpannedTitle:Landroid/text/Spanned;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitle:Ljava/lang/String;

    return-object p0
.end method

.method public title(Ljava/lang/String;)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitle:Ljava/lang/String;

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mSpannedTitle:Landroid/text/Spanned;

    return-object p0
.end method

.method public titleGravity(I)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleGravity:I

    return-object p0
.end method

.method public titleSize(II)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSize:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleSizeUnit:I

    return-object p0
.end method

.method public titleStyle(II)Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleGravity:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->mTitleStyle:I

    return-object p0
.end method
