.class public final Lcom/xuexiang/xui/widget/button/a;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/button/CountDownButton;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/button/CountDownButton;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/a;->a:Lcom/xuexiang/xui/widget/button/CountDownButton;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/a;->a:Lcom/xuexiang/xui/widget/button/CountDownButton;

    .line 3
    .line 4
    iput-boolean v0, v1, Lcom/xuexiang/xui/widget/button/CountDownButton;->h:Z

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/button/CountDownButton;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lcom/xuexiang/xui/widget/button/CountDownButton;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onTick(J)V
    .locals 5

    .line 1
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/a;->a:Lcom/xuexiang/xui/widget/button/CountDownButton;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/xuexiang/xui/widget/button/CountDownButton;->d:Ljava/lang/String;

    .line 6
    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    div-long/2addr p1, v3

    .line 10
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
