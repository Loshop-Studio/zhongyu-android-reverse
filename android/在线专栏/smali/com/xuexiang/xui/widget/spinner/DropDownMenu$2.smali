.class Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->addTab(Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;

.field final synthetic val$tab:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;->this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;->val$tab:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;->this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$2;->val$tab:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->access$000(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;Landroid/view/View;)V

    return-void
.end method
