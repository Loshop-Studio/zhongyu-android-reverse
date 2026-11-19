.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RectTransformX"
.end annotation


# instance fields
.field public a:F

.field public b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    iget p1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    return-void
.end method


# virtual methods
.method public setScaleX(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    return-void
.end method

.method public setTranslateX(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    return-void
.end method
