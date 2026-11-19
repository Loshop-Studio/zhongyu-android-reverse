.class public final synthetic Lf5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/widget/StemWebView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/widget/StemWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/d;->a:Lcom/zykj/mistake/widget/StemWebView;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p0, Lf5/d;->a:Lcom/zykj/mistake/widget/StemWebView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/mistake/widget/StemWebView;->getPageFinishListener()Lr6/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
