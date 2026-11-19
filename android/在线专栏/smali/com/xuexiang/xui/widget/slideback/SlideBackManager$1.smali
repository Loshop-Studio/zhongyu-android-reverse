.class Lcom/xuexiang/xui/widget/slideback/SlideBackManager$1;
.super Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->callBack(Lcom/xuexiang/xui/widget/slideback/callback/SlideBackCallBack;)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/slideback/SlideBackManager;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/slideback/SlideBackManager;Lcom/xuexiang/xui/widget/slideback/callback/SlideBackCallBack;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager$1;->this$0:Lcom/xuexiang/xui/widget/slideback/SlideBackManager;

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;-><init>(Lcom/xuexiang/xui/widget/slideback/callback/SlideBackCallBack;)V

    return-void
.end method


# virtual methods
.method public onSlide(I)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;->onSlideBack()V

    return-void
.end method
