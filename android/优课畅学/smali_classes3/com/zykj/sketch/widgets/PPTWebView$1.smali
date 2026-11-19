.class public final Lcom/zykj/sketch/widgets/PPTWebView$1;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/widgets/PPTWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/widgets/PPTWebView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/widgets/PPTWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/PPTWebView$1;->this$0:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/sketch/widgets/PPTWebView$1;->this$0:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/sketch/widgets/PPTWebView;->access$getPptListener$p(Lcom/zykj/sketch/widgets/PPTWebView;)Lcom/zykj/sketch/core/listener/PPTListener;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/PPTListener;->onPageFinished()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
