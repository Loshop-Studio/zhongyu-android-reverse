.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RingRotation"
.end annotation


# instance fields
.field public a:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setRotation(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;->a:F

    return-void
.end method
