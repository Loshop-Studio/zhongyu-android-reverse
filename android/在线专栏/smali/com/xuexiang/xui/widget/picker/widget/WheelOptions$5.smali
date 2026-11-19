.class Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(I)V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-interface {v0, v1, p1, v2}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;->onOptionsSelectChanged(III)V

    return-void
.end method
