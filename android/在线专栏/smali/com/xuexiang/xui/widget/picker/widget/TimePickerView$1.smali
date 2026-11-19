.class Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->initWheelTime(Landroid/widget/LinearLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTimeSelectChanged()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dateFormat:Ljava/text/DateFormat;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->access$000(Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;)Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->timeSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectChangeListener;

    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectChangeListener;->onTimeSelectChanged(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V

    :goto_0
    return-void
.end method
