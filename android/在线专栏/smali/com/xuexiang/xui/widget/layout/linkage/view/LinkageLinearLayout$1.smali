.class Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout$1;
.super Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandlerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandlerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getVerticalScrollExtent()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    return v0
.end method

.method public getVerticalScrollOffset()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVerticalScrollRange()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageLinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    return v0
.end method

.method public isScrollable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
