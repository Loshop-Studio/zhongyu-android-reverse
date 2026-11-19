.class final Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:I


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
    .locals 3
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

    const/16 p2, 0x50

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->e:I

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$layout;->xui_layout_cookie:I

    invoke-static {p2, p3, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    sget p2, Lcom/xuexiang/xui/R$id;->cookie:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->a:Landroid/widget/LinearLayout;

    .line 6
    sget p2, Lcom/xuexiang/xui/R$id;->tv_title:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->b:Landroid/widget/TextView;

    .line 7
    sget p2, Lcom/xuexiang/xui/R$id;->tv_message:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->c:Landroid/widget/TextView;

    .line 8
    sget p2, Lcom/xuexiang/xui/R$id;->iv_icon:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 9
    sget p2, Lcom/xuexiang/xui/R$id;->btn_action:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->d:Landroid/widget/TextView;

    .line 10
    sget p2, Lcom/xuexiang/xui/R$id;->btn_action_with_icon:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 11
    sget p2, Lcom/xuexiang/xui/R$attr;->cookieTitleColor:I

    const/4 p3, -0x1

    invoke-static {p1, p2, p3}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p2

    .line 12
    sget v0, Lcom/xuexiang/xui/R$attr;->cookieMessageColor:I

    invoke-static {p1, v0, p3}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result v0

    .line 13
    sget v1, Lcom/xuexiang/xui/R$attr;->cookieActionColor:I

    invoke-static {p1, v1, p3}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    .line 14
    sget v1, Lcom/xuexiang/xui/R$attr;->cookieBackgroundColor:I

    sget v2, Lcom/xuexiang/xui/R$color;->cookie_bar_default_bg_color:I

    .line 15
    invoke-static {p1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    .line 16
    invoke-static {p1, v1, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p1

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->b:Landroid/widget/TextView;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->c:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->d:Landroid/widget/TextView;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->a:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->e:I

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->a:Landroid/widget/LinearLayout;

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
