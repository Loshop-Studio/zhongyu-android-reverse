.class public final Li3/b;
.super Li3/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/b;->c:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 5
    .line 6
    iput-object p2, p0, Li3/b;->a:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Li3/b;->b:Landroid/view/View;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 1
    iget-object p1, p0, Li3/b;->c:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->g:Landroid/view/animation/Animation;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li3/b;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iget-object v1, p0, Li3/b;->b:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->h:Landroid/view/animation/Animation;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
