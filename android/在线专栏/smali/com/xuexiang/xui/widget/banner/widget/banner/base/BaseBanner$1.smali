.class Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner$1;->this$0:Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;

    iget v0, p1, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->mCurrentPosition:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->access$000(Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;I)V

    const/4 p1, 0x1

    return p1
.end method
