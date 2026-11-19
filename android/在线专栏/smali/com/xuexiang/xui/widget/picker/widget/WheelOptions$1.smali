.class Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    invoke-interface {p1, v0, v1, v1}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;->onOptionsSelectChanged(III)V

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v2

    new-instance v3, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-direct {v3, v4}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$600(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;->onItemSelected(I)V

    goto :goto_1

    .line 12
    :cond_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v2

    invoke-interface {v2, p1, v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;->onOptionsSelectChanged(III)V

    :cond_4
    :goto_1
    return-void
.end method
