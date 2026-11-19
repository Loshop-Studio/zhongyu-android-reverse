.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$1;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$1;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$000(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    const/4 p1, 0x1

    return p1
.end method
