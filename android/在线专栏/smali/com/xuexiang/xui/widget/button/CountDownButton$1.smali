.class Lcom/xuexiang/xui/widget/button/CountDownButton$1;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/CountDownButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/CountDownButton;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/CountDownButton$1;->this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton$1;->this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/button/CountDownButton;->access$102(Lcom/xuexiang/xui/widget/button/CountDownButton;Z)Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton$1;->this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/button/CountDownButton;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton$1;->this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->access$200(Lcom/xuexiang/xui/widget/button/CountDownButton;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onTick(J)V
    .locals 6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/CountDownButton$1;->this$0:Lcom/xuexiang/xui/widget/button/CountDownButton;

    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->access$000(Lcom/xuexiang/xui/widget/button/CountDownButton;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-wide/16 v4, 0x3e8

    div-long/2addr p1, v4

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v3, p2

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
