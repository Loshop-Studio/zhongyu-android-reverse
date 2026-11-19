.class Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getLayout(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

.field final synthetic val$finalRootView:Landroid/view/View;

.field final synthetic val$viewType:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->val$finalRootView:Landroid/view/View;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->val$viewType:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->val$finalRootView:Landroid/view/View;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;->val$viewType:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$900(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    return-void
.end method
