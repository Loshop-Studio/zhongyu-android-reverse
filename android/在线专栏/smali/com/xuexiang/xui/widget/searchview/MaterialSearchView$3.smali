.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->initSearchView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$400(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showKeyboard(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$3;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSuggestions()V

    :cond_0
    return-void
.end method
