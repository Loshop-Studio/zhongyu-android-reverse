.class public Ls0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls0/a;->a:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/a;->a:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ls0/b;->a(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
