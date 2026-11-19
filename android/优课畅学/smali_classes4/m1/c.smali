.class public Lm1/c;
.super Ll1/a;
.source "SourceFile"


# instance fields
.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ll1/a;-><init>(Landroid/content/Context;Ljava/util/Collection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Lm1/b;

    .line 2
    .line 3
    check-cast p2, Lm1/a;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lm1/c;->g(Lm1/b;Lm1/a;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_adapter_listview_simple_item:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic f(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm1/c;->h(Landroid/view/View;)Lm1/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lm1/b;Lm1/a;I)V
    .locals 1

    .line 1
    iget-object p3, p1, Lm1/b;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p2}, Lm1/a;->b()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lm1/a;->a()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    iget-object p3, p1, Lm1/b;->c:Landroid/widget/ImageView;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lm1/b;->c:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {p2}, Lm1/a;->a()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-object p1, p1, Lm1/b;->c:Landroid/widget/ImageView;

    .line 33
    .line 34
    const/16 p2, 0x8

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public h(Landroid/view/View;)Lm1/b;
    .locals 3

    .line 1
    new-instance v0, Lm1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lm1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/xuexiang/xui/R$id;->ll_content:I

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iput-object v1, v0, Lm1/b;->a:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    sget v1, Lcom/xuexiang/xui/R$id;->tv_title:I

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object v1, v0, Lm1/b;->b:Landroid/widget/TextView;

    .line 25
    .line 26
    sget v1, Lcom/xuexiang/xui/R$id;->iv_icon:I

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/widget/ImageView;

    .line 33
    .line 34
    iput-object p1, v0, Lm1/b;->c:Landroid/widget/ImageView;

    .line 35
    .line 36
    iget p1, p0, Lm1/c;->d:I

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object v1, v0, Lm1/b;->a:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v1, p1, v2, v2, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v0, Lm1/b;->a:Landroid/widget/LinearLayout;

    .line 47
    .line 48
    const/16 v1, 0x10

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_0
    iget-object p1, v0, Lm1/b;->a:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    const/16 v1, 0x11

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method
