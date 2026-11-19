.class public final Li3/c;
.super Li3/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/c;->b:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 5
    .line 6
    iput-object p2, p0, Li3/c;->a:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 2
    .line 3
    iget-object v0, p0, Li3/c;->b:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 4
    .line 5
    iput-object p1, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->a:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 6
    .line 7
    iget-object p1, p0, Li3/c;->a:Landroid/view/View;

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
