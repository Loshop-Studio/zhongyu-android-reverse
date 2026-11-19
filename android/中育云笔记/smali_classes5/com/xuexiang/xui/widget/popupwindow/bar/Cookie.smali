.class final Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public c:Landroid/widget/LinearLayout;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/widget/ImageView;

.field public i:J

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p2, 0x7d0

    .line 3
    iput-wide p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->i:J

    const/16 p2, 0x50

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->j:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->b(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 5

    .line 1
    sget v0, Lcom/xuexiang/xui/R$attr;->cookieTitleColor:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/g;->e(Landroid/content/Context;II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget v2, Lcom/xuexiang/xui/R$attr;->cookieMessageColor:I

    .line 9
    .line 10
    invoke-static {p1, v2, v1}, Lcom/xuexiang/xui/utils/g;->e(Landroid/content/Context;II)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sget v3, Lcom/xuexiang/xui/R$attr;->cookieActionColor:I

    .line 15
    .line 16
    invoke-static {p1, v3, v1}, Lcom/xuexiang/xui/utils/g;->e(Landroid/content/Context;II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget v3, Lcom/xuexiang/xui/R$attr;->cookieBackgroundColor:I

    .line 21
    .line 22
    sget v4, Lcom/xuexiang/xui/R$color;->cookie_bar_default_bg_color:I

    .line 23
    .line 24
    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {p1, v3, v4}, Lcom/xuexiang/xui/utils/g;->e(Landroid/content/Context;II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->d:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->e:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->g:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->c:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_cookie:I

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/xuexiang/xui/R$id;->cookie:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->c:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    sget v0, Lcom/xuexiang/xui/R$id;->tv_title:I

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->d:Landroid/widget/TextView;

    .line 29
    .line 30
    sget v0, Lcom/xuexiang/xui/R$id;->tv_message:I

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/TextView;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->e:Landroid/widget/TextView;

    .line 39
    .line 40
    sget v0, Lcom/xuexiang/xui/R$id;->iv_icon:I

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Landroid/widget/ImageView;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->f:Landroid/widget/ImageView;

    .line 49
    .line 50
    sget v0, Lcom/xuexiang/xui/R$id;->btn_action:I

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/widget/TextView;

    .line 57
    .line 58
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->g:Landroid/widget/TextView;

    .line 59
    .line 60
    sget v0, Lcom/xuexiang/xui/R$id;->btn_action_with_icon:I

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/widget/ImageView;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->h:Landroid/widget/ImageView;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->a(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->j:I

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v0, p0

    .line 15
    move v1, p1

    .line 16
    move v2, p2

    .line 17
    move v4, p4

    .line 18
    invoke-super/range {v0 .. v5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
