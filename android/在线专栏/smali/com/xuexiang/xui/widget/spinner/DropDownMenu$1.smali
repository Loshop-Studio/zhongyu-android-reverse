.class Lcom/xuexiang/xui/widget/spinner/DropDownMenu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->setDropDownMenu(Ljava/util/List;Ljava/util/List;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/DropDownMenu;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$1;->this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/DropDownMenu$1;->this$0:Lcom/xuexiang/xui/widget/spinner/DropDownMenu;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/DropDownMenu;->closeMenu()V

    return-void
.end method
