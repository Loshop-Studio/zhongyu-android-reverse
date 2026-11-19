.class Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;->addItemView(Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

.field final synthetic val$itemView:Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;->this$0:Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;->val$itemView:Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView$Section$1;->val$itemView:Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/grouplist/XUICommonListItemView;->getSwitch()Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CheckBox;->toggle()V

    return-void
.end method
