.class Lcom/xuexiang/xui/widget/guidview/GuideCaseView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->focus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$1;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$1;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->hide()V

    return-void
.end method
