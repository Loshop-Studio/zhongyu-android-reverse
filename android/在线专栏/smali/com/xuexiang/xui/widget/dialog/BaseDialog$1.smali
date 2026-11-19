.class Lcom/xuexiang/xui/widget/dialog/BaseDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/BaseDialog;->showIfSync(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/BaseDialog;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/BaseDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/BaseDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public show(Landroid/view/Window;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/BaseDialog;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->performShow()V

    return-void
.end method
