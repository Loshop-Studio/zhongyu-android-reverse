.class Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1$1;->this$0:Lcom/lljjcoder/style/citylist/Toast/ToastUtils$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->access$000()Lcom/lljjcoder/style/citylist/Toast/AlarmDailog;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
