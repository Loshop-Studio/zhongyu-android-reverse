.class public Lcom/lljjcoder/style/citylist/Toast/ToastUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;
    .locals 1

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$002(Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;)Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;
    .locals 0

    .line 1
    sput-object p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    return-object p0
.end method

.method public static showLongToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 7
    .line 8
    :cond_0
    new-instance v0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->setShowText(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->show()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static showMomentToast(Landroid/app/Activity;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static showShortToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 7
    .line 8
    :cond_0
    new-instance v0, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->setShowText(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, Landroid/widget/Toast;->setDuration(I)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->alarmDialog:Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;->show()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
