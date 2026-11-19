.class public final Lf2/a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf2/a;->a:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/a;->a:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
