.class Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AdapterDataSetObserver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$AdapterDataSetObserver;->this$0:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->access$400(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V

    return-void
.end method

.method public onInvalidated()V
    .locals 0

    invoke-super {p0}, Landroid/database/DataSetObserver;->onInvalidated()V

    return-void
.end method
