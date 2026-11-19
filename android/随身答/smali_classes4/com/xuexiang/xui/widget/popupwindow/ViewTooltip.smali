.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$c;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$e;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$d;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;,
        Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->a:Landroid/view/View;

    .line 5
    .line 6
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->d(Landroid/content/Context;)Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->a:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static e(Landroid/view/View;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public c(I)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    check-cast p1, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public f(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->setPosition(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public g()Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->a:Landroid/view/View;

    .line 26
    .line 27
    new-instance v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$a;

    .line 28
    .line 29
    invoke-direct {v2, p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$a;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;Landroid/view/ViewGroup;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v3, 0x64

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 38
    .line 39
    return-object v0
.end method

.method public h(Ljava/lang/String;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->setText(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
