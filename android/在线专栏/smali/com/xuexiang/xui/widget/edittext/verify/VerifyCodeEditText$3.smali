.class Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/edittext/verify/TInputConnection$BackspaceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->setListener()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackspace()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;->access$300(Lcom/xuexiang/xui/widget/edittext/verify/VerifyCodeEditText;)V

    const/4 v0, 0x1

    return v0
.end method
