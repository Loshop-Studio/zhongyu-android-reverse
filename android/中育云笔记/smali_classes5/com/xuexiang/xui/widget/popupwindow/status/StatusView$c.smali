.class public Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;
.super Ld9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->j(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->d:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->c:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ld9/a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->d:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->c:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->b(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->c:Landroid/view/View;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->d:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/view/animation/Animation;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$c;->d:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
