.class public Lcom/xuexiang/xui/widget/guidview/GuideCaseView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;
    }
.end annotation


# static fields
.field private static final CONTAINER_TAG:Ljava/lang/String; = "ShowCaseViewTag"

.field private static final PREF_NAME:Ljava/lang/String; = "PrefShowCaseView"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mAdjustHeight:I

.field private mAnimationDuration:I

.field private mBackgroundColor:I

.field private mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

.field private mCenterX:I

.field private mCenterY:I

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

.field private mFocusOffsetX:I

.field private mFocusPositionX:I

.field private mFocusPositionY:I

.field private mFocusRectangleHeight:I

.field private mFocusRectangleWidth:I

.field private mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field private mId:Ljava/lang/String;

.field private mPictureGravity:I

.field private mPictureHeight:I

.field private mPictureOffsetX:I

.field private mPictureOffsetY:I

.field private mPictureResId:I

.field private mPictureWidth:I

.field private mRoot:Landroid/view/ViewGroup;

.field private mRoundRectRadius:I

.field private mSharedPreferences:Landroid/content/SharedPreferences;

.field private mSpannedTitle:Landroid/text/Spanned;

.field private mTitle:Ljava/lang/String;

.field private mTitleGravity:I

.field private mTitleSize:I

.field private mTitleSizeUnit:I

.field private mTitleStyle:I

.field private mView:Landroid/view/View;

.field private mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;


# direct methods
.method private constructor <init>(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Landroid/text/Spanned;IIIIDIIIILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;Landroid/view/animation/Animation;Landroid/view/animation/Animation;ZZIILcom/xuexiang/xui/widget/guidview/FocusShape;Lcom/xuexiang/xui/widget/guidview/DismissListener;IIIIIIIIIIIIZII)V
    .locals 3

    move-object v0, p0

    .line 15
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v1, 0x190

    .line 16
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    move-object v1, p3

    .line 17
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    move-object v1, p1

    .line 18
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    move-object v1, p2

    .line 19
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    move-object v1, p4

    .line 20
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitle:Ljava/lang/String;

    move-object v1, p5

    .line 21
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mSpannedTitle:Landroid/text/Spanned;

    move-wide v1, p10

    .line 22
    iput-wide v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusCircleRadiusFactor:D

    move v1, p12

    .line 23
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mBackgroundColor:I

    move/from16 v1, p13

    .line 24
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusBorderColor:I

    move/from16 v1, p14

    .line 25
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusBorderSize:I

    move v1, p6

    .line 26
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleGravity:I

    move v1, p7

    .line 27
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleStyle:I

    move v1, p8

    .line 28
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleSize:I

    move v1, p9

    .line 29
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleSizeUnit:I

    move/from16 v1, p25

    .line 30
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mRoundRectRadius:I

    move/from16 v1, p26

    .line 31
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureResId:I

    move/from16 v1, p27

    .line 32
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureWidth:I

    move/from16 v1, p28

    .line 33
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureHeight:I

    move/from16 v1, p29

    .line 34
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureGravity:I

    move/from16 v1, p30

    .line 35
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureOffsetX:I

    move/from16 v1, p31

    .line 36
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureOffsetY:I

    move/from16 v1, p15

    .line 37
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCustomViewRes:I

    move-object/from16 v1, p16

    .line 38
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;

    move-object/from16 v1, p17

    .line 39
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mEnterAnimation:Landroid/view/animation/Animation;

    move-object/from16 v1, p18

    .line 40
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mExitAnimation:Landroid/view/animation/Animation;

    move/from16 v1, p19

    .line 41
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCloseOnTouch:Z

    move/from16 v1, p20

    .line 42
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFitSystemWindows:Z

    move/from16 v1, p21

    .line 43
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAdjustHeight:I

    move/from16 v1, p22

    .line 44
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusOffsetX:I

    move-object/from16 v1, p23

    .line 45
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    move-object/from16 v1, p24

    .line 46
    iput-object v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    move/from16 v1, p32

    .line 47
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionX:I

    move/from16 v1, p33

    .line 48
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionY:I

    move/from16 v1, p34

    .line 49
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusCircleRadius:I

    move/from16 v1, p35

    .line 50
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleWidth:I

    move/from16 v1, p36

    .line 51
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleHeight:I

    move/from16 v1, p37

    .line 52
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationEnabled:Z

    move/from16 v1, p38

    .line 53
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationMaxValue:I

    move/from16 v1, p39

    .line 54
    iput v1, v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationStep:I

    .line 55
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->initializeParameters()V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x190

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x190

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x190

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/16 p1, 0x190

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)V
    .locals 40

    move-object/from16 v0, p0

    .line 9
    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/app/Activity;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/View;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/text/Spanned;

    move-result-object v5

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v6

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v7

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v8

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v9

    .line 10
    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)D

    move-result-wide v10

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v12

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v13

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v14

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v15

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;

    move-result-object v16

    .line 11
    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/animation/Animation;

    move-result-object v17

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Landroid/view/animation/Animation;

    move-result-object v18

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z

    move-result v19

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z

    move-result v20

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$1900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v21

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v22

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/FocusShape;

    move-result-object v23

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Lcom/xuexiang/xui/widget/guidview/DismissListener;

    move-result-object v24

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v25

    .line 12
    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v26

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v27

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v28

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v29

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v30

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$2900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v31

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v32

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v33

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v34

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v35

    .line 13
    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v36

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)Z

    move-result v37

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v38

    invoke-static/range {p1 .. p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;->access$3700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView$Builder;)I

    move-result v39

    .line 14
    invoke-direct/range {v0 .. v39}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;-><init>(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Landroid/text/Spanned;IIIIDIIIILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;Landroid/view/animation/Animation;Landroid/view/animation/Animation;ZZIILcom/xuexiang/xui/widget/guidview/FocusShape;Lcom/xuexiang/xui/widget/guidview/DismissListener;IIIIIIIIIIIIZII)V

    return-void
.end method

.method static synthetic access$3800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleStyle:I

    return p0
.end method

.method static synthetic access$3900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$4000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleSize:I

    return p0
.end method

.method static synthetic access$4100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleSizeUnit:I

    return p0
.end method

.method static synthetic access$4200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleGravity:I

    return p0
.end method

.method static synthetic access$4300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/text/Spanned;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mSpannedTitle:Landroid/text/Spanned;

    return-object p0
.end method

.method static synthetic access$4400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitle:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureResId:I

    return p0
.end method

.method static synthetic access$4600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureGravity:I

    return p0
.end method

.method static synthetic access$4700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureWidth:I

    return p0
.end method

.method static synthetic access$4800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureHeight:I

    return p0
.end method

.method static synthetic access$4900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureOffsetY:I

    return p0
.end method

.method static synthetic access$5000(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureOffsetX:I

    return p0
.end method

.method static synthetic access$5100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$5200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusCircleRadius:I

    return p0
.end method

.method static synthetic access$5300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleWidth:I

    return p0
.end method

.method static synthetic access$5400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleHeight:I

    return p0
.end method

.method static synthetic access$5500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterX:I

    return p0
.end method

.method static synthetic access$5502(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterX:I

    return p1
.end method

.method static synthetic access$5600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionX:I

    return p0
.end method

.method static synthetic access$5700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterY:I

    return p0
.end method

.method static synthetic access$5702(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterY:I

    return p1
.end method

.method static synthetic access$5800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionY:I

    return p0
.end method

.method static synthetic access$5900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    return p0
.end method

.method private doCircularEnterAnimation()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method private doCircularExitAnimation()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-int v0, v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterX:I

    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterY:I

    int-to-float v0, v0

    const/4 v3, 0x0

    invoke-static {p0, v1, v2, v0, v3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v0

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAnimationDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    const v2, 0x10c0003

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$6;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$6;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method private focus()V
    .locals 10

    .line 1
    new-instance v9, Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    iget-wide v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusCircleRadiusFactor:D

    iget-boolean v6, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFitSystemWindows:Z

    iget v7, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mAdjustHeight:I

    iget v8, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusOffsetX:I

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/xuexiang/xui/widget/guidview/Calculator;-><init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/guidview/FocusShape;Landroid/view/View;DZII)V

    iput-object v9, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mRoot:Landroid/view/ViewGroup;

    const-string v1, "ShowCaseViewTag"

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    const/4 v2, 0x1

    .line 5
    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->setClickable(Z)V

    if-nez v0, :cond_8

    .line 6
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCloseOnTouch:Z

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$1;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_0
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mRoot:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    new-instance v0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;-><init>(Landroid/content/Context;)V

    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationMaxValue:I

    iget v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationStep:I

    invoke-virtual {v0, v2, v3}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->setFocusAnimationParameters(II)V

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 14
    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterX:I

    .line 15
    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterY:I

    .line 16
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mBackgroundColor:I

    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0, v2, v3}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->setParameters(ILcom/xuexiang/xui/widget/guidview/Calculator;)V

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleWidth:I

    if-lez v2, :cond_2

    iget v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusRectangleHeight:I

    if-lez v3, :cond_2

    .line 18
    iget-object v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v5, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionX:I

    iget v6, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionY:I

    invoke-virtual {v4, v5, v6, v2, v3}, Lcom/xuexiang/xui/widget/guidview/Calculator;->setRectPosition(IIII)V

    .line 19
    :cond_2
    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusCircleRadius:I

    if-lez v2, :cond_3

    .line 20
    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionX:I

    iget v5, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusPositionY:I

    invoke-virtual {v3, v4, v5, v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->setCirclePosition(III)V

    .line 21
    :cond_3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusAnimationEnabled:Z

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->setAnimationEnabled(Z)V

    .line 22
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusBorderColor:I

    if-eqz v1, :cond_4

    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusBorderSize:I

    if-lez v2, :cond_4

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->setBorderParameters(II)V

    .line 25
    :cond_4
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mRoundRectRadius:I

    if-lez v1, :cond_5

    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->setRoundRectRadius(I)V

    .line 27
    :cond_5
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCustomViewRes:I

    if-nez v0, :cond_7

    .line 29
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mPictureResId:I

    if-nez v0, :cond_6

    .line 30
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflateTitleView()V

    goto :goto_0

    .line 31
    :cond_6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflatePicture()V

    goto :goto_0

    .line 32
    :cond_7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mViewInflateListener:Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflateCustomView(ILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;)V

    .line 33
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->startEnterAnimation()V

    .line 34
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->writeShown()V

    :cond_8
    return-void
.end method

.method public static hideCurrent(Landroid/app/Activity;)V
    .locals 1

    const v0, 0x1020002

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    const-string v0, "ShowCaseViewTag"

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->hide()V

    return-void
.end method

.method private inflateCustomView(ILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, p1}, Lcom/xuexiang/xui/widget/guidview/OnViewInflateListener;->onViewInflated(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private inflatePicture()V
    .locals 2

    sget v0, Lcom/xuexiang/xui/R$layout;->gcv_layout_image:I

    new-instance v1, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$4;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflateCustomView(ILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;)V

    return-void
.end method

.method private inflateTitleView()V
    .locals 2

    sget v0, Lcom/xuexiang/xui/R$layout;->gcv_layout_title:I

    new-instance v1, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$3;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->inflateCustomView(ILcom/xuexiang/xui/widget/guidview/OnViewInflateListener;)V

    return-void
.end method

.method private initializeParameters()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mBackgroundColor:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    .line 2
    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$color;->default_guide_case_view_background_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mBackgroundColor:I

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleGravity:I

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x11

    :goto_1
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleGravity:I

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleStyle:I

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget v0, Lcom/xuexiang/xui/R$style;->DefaultGuideCaseTitleStyle:I

    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mTitleStyle:I

    .line 5
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 7
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 8
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 9
    div-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterX:I

    .line 10
    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCenterY:I

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    const/4 v1, 0x0

    const-string v2, "PrefShowCaseView"

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mSharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static isShowOnce(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "PrefShowCaseView"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 2
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static isVisible(Landroid/app/Activity;)Ljava/lang/Boolean;
    .locals 1

    const v0, 0x1020002

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    const-string v0, "ShowCaseViewTag"

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 4
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static resetAllShowOnce(Landroid/content/Context;)V
    .locals 2

    const-string v0, "PrefShowCaseView"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static resetShowOnce(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "PrefShowCaseView"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static setShowOnce(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "PrefShowCaseView"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private startEnterAnimation()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mEnterAnimation:Landroid/view/animation/Animation;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/widget/guidview/Utils;->shouldShowCircularAnimation()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->doCircularEnterAnimation()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    sget v1, Lcom/xuexiang/xui/R$anim;->gcv_fade_in:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method

.method private writeShown()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method protected getDismissListener()Lcom/xuexiang/xui/widget/guidview/DismissListener;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    return-object v0
.end method

.method public getFocusCenterX()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v0

    return v0
.end method

.method public getFocusCenterY()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v0

    return v0
.end method

.method public getFocusHeight()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getFocusHeight()I

    move-result v0

    return v0
.end method

.method public getFocusRadius()F
    .locals 4

    sget-object v0, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    const/4 v1, 0x0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/guidview/Calculator;->circleRadius(ID)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getFocusWidth()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getFocusWidth()I

    move-result v0

    return v0
.end method

.method public hide()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mExitAnimation:Landroid/view/animation/Animation;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/widget/guidview/Utils;->shouldShowCircularAnimation()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->doCircularExitAnimation()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    sget v1, Lcom/xuexiang/xui/R$anim;->gcv_fade_out:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 6
    new-instance v1, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$2;-><init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method

.method public isShownBefore()Z
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mSharedPreferences:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->focus()V

    return-void
.end method

.method public removeView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mRoot:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/guidview/DismissListener;->onDismiss(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected setDismissListener(Lcom/xuexiang/xui/widget/guidview/DismissListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->isShownBefore()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->focus()V

    goto :goto_0

    .line 6
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->focus()V

    :goto_0
    return-void

    .line 7
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mDismissListener:Lcom/xuexiang/xui/widget/guidview/DismissListener;

    if-eqz v0, :cond_4

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->mId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/guidview/DismissListener;->onSkipped(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
