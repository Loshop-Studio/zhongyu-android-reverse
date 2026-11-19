.class Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->onStartDrawRipple()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$1;->this$0:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$1;->this$0:Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;

    invoke-virtual {v0}, Landroid/widget/Button;->postInvalidate()V

    return-void
.end method
