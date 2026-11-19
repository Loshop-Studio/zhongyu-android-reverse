.class public Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;
.super Landroid/widget/Toast;
.source "SourceFile"


# instance fields
.field private context:Landroid/content/Context;

.field private noticeText:Landroid/widget/TextView;

.field private toast:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->context:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget v1, Lcom/lljjcoder/style/citypickerview/R$layout;->dialog_alarm_ui:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->noticeText:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->noticeText:Landroid/widget/TextView;

    .line 26
    .line 27
    new-instance v1, Landroid/widget/Toast;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->toast:Landroid/widget/Toast;

    .line 33
    .line 34
    const/16 p1, 0x11

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v1, p1, v2, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->toast:Landroid/widget/Toast;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->toast:Landroid/widget/Toast;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public setShowText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->noticeText:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->toast:Landroid/widget/Toast;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
