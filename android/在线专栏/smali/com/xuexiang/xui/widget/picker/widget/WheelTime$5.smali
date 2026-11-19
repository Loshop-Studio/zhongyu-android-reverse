.class Lcom/xuexiang/xui/widget/picker/widget/WheelTime$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(I)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$5;->this$0:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;->onTimeSelectChanged()V

    return-void
.end method
