.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setMenuItem(Landroid/view/MenuItem;)V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$6;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$6;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSearch()V

    const/4 p1, 0x1

    return p1
.end method
