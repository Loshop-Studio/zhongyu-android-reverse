.class Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$200(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;Landroid/content/Context;)V

    return-void
.end method
