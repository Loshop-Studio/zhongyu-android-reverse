.class public final Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$a;->a:Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$a;->b:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$a;->a:Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;->getContent()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 p2, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "getBytes(...)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, p2

    .line 26
    :goto_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/i;->a([B)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$a;->b:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationDetailBinding;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationDetailBinding;->webView:Landroid/webkit/WebView;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "javascript:window.notificationContent(\'"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, "\')"

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
