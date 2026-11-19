.class final Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->showMomentToast(Landroid/app/Activity;Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$showMsg:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->val$context:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->val$showMsg:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->val$context:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$002(Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;)Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->val$showMsg:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->setShowText(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->show()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->val$showMsg:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->setShowText(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->show()V

    .line 56
    .line 57
    .line 58
    :goto_0
    new-instance v0, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1$1;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1$1;-><init>(Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v2, 0x7d0

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    return-void
.end method
