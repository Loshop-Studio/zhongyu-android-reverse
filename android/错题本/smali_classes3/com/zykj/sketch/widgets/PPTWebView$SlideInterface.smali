.class final Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/widgets/PPTWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SlideInterface"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;",
        "",
        "<init>",
        "(Lcom/zykj/sketch/widgets/PPTWebView;)V",
        "",
        "currentSlide",
        "Ld6/s;",
        "setCurrentSlide",
        "(I)V",
        "total",
        "setTotalCount",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/sketch/widgets/PPTWebView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/widgets/PPTWebView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;->this$0:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final setCurrentSlide(I)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;->this$0:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/widgets/PPTWebView;->access$getPptListener$p(Lcom/zykj/sketch/widgets/PPTWebView;)Lcom/zykj/sketch/core/listener/PPTListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/PPTListener;->currentPage(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setTotalCount(I)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/widgets/PPTWebView$SlideInterface;->this$0:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/widgets/PPTWebView;->access$getPptListener$p(Lcom/zykj/sketch/widgets/PPTWebView;)Lcom/zykj/sketch/core/listener/PPTListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/zykj/sketch/core/listener/PPTListener;->totalPageCount(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
