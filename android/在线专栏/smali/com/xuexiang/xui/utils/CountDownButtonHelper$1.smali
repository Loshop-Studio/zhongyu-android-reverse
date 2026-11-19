.class Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/utils/CountDownButtonHelper;->initCountDownTimer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/utils/CountDownButtonHelper;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$100(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$000(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$000(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;->onFinished()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$100(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {v1}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$100(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$string;->xui_count_down_finish:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public onTick(J)V
    .locals 2

    const-wide/16 v0, 0xf

    add-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    .line 1
    div-long/2addr p1, v0

    long-to-int p2, p1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {p1}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$000(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {p1}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$000(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/utils/CountDownButtonHelper$OnCountDownListener;->onCountDown(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/utils/CountDownButtonHelper$1;->this$0:Lcom/xuexiang/xui/utils/CountDownButtonHelper;

    invoke-static {p1}, Lcom/xuexiang/xui/utils/CountDownButtonHelper;->access$100(Lcom/xuexiang/xui/utils/CountDownButtonHelper;)Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "s"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
