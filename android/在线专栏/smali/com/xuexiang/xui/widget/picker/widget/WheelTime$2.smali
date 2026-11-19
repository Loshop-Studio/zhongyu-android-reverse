.class Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLunar(IIIZIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le p1, v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    if-ne v1, v2, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object p1

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapDays(I)I

    move-result v2

    invoke-static {v2}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getLunarDays(I)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 5
    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapDays(I)I

    move-result p1

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v1

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->monthDays(II)I

    move-result v3

    invoke-static {v3}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getLunarDays(I)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 7
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->monthDays(II)I

    move-result p1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v1

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->monthDays(II)I

    move-result v3

    invoke-static {v3}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getLunarDays(I)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 9
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->monthDays(II)I

    move-result p1

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    add-int/lit8 p1, p1, -0x1

    if-le v0, p1, :cond_2

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;->onTimeSelectChanged()V

    :cond_3
    return-void
.end method
