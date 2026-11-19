.class Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-interface {v0, v2, p1, v1}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;->onOptionsSelectChanged(III)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-interface {v0, v2, p1, v1}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;->onOptionsSelectChanged(III)V

    :cond_3
    :goto_0
    return-void
.end method
