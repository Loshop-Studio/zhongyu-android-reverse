.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p2, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$102(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p2, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$200(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V

    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$2;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p2, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$300(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V

    return-void
.end method
