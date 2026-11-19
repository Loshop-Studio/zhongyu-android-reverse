.class public Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;
.super Landroid/widget/Scroller;
.source "SourceFile"


# instance fields
.field private mScrollSpeed:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x1c2

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;->mScrollSpeed:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;->mScrollSpeed:I

    return-void
.end method


# virtual methods
.method public startScroll(IIIII)V
    .locals 6

    iget v5, p0, Lcom/xuexiang/xui/widget/banner/widget/loopviewpager/FixedSpeedScroller;->mScrollSpeed:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method
