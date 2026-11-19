.class public Lcom/xuexiang/xui/widget/banner/transform/FlowTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$PageTransformer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final transformPage(Landroid/view/View;F)V
    .locals 1

    .line 1
    const/high16 v0, -0x3e100000    # -30.0f

    .line 2
    .line 3
    mul-float/2addr p2, v0

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
