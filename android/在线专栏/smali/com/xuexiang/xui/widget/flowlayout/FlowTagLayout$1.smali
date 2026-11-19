.class Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->setChildViewClickListener(ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

.field final synthetic val$childView:Landroid/view/View;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Landroid/view/View;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    iput p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$000(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v0, p1, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagClickListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;

    if-eqz v0, :cond_7

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagClickListener;->onItemClick(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Landroid/view/View;I)V

    goto/16 :goto_3

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$000(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$200(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$300(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v0, p1, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagSelectListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;

    if-eqz v0, :cond_7

    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;->onItemSelect(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;ILjava/util/List;)V

    goto/16 :goto_3

    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    invoke-virtual {v2}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getCount()I

    move-result v2

    if-ge p1, v2, :cond_2

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object v2

    invoke-virtual {v2, p1, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 14
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 15
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$300(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v0, p1, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagSelectListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;

    if-eqz v0, :cond_7

    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;->onItemSelect(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;ILjava/util/List;)V

    goto :goto_3

    .line 20
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$000(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    move-result p1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_7

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 23
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_1

    .line 24
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-virtual {p1, v2, v0}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$childView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 26
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mAdapter:Lcom/xuexiang/xui/widget/flowlayout/BaseTagAdapter;

    invoke-virtual {v0}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$100(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 30
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$300(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->mOnTagSelectListener:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;

    if-eqz v1, :cond_7

    .line 32
    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$1;->val$index:I

    invoke-interface {v1, v0, v2, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$OnTagSelectListener;->onItemSelect(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;ILjava/util/List;)V

    :cond_7
    :goto_3
    return-void
.end method
