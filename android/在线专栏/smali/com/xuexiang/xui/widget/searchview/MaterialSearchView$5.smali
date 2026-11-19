.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestions([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

.field final synthetic val$adapter:Lcom/xuexiang/xui/widget/searchview/SearchAdapter;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/SearchAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;->val$adapter:Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;->val$adapter:Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$5;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$1000(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Z

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    return-void
.end method
