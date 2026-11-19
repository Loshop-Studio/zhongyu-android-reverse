.class public abstract Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;
    }
.end annotation


# instance fields
.field protected mAnimatorSet:Landroid/animation/AnimatorSet;

.field private mDelay:J

.field protected mDuration:J

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mListener:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1f4

    .line 2
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mDuration:J

    .line 3
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mListener:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    return-object p0
.end method

.method public static reset(Landroid/view/View;)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method


# virtual methods
.method public delay(J)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mDelay:J

    return-object p0
.end method

.method public duration(J)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mDuration:J

    return-object p0
.end method

.method public interpolator(Landroid/view/animation/Interpolator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mInterpolator:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public listener(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mListener:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    return-object p0
.end method

.method public playOn(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->start(Landroid/view/View;)V

    return-void
.end method

.method public abstract setAnimation(Landroid/view/View;)V
.end method

.method protected start(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->reset(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->setAnimation(Landroid/view/View;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mDuration:J

    invoke-virtual {p1, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    :cond_0
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mDelay:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {p1, v0, v1}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mListener:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    new-instance v0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;-><init>(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)V

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method
