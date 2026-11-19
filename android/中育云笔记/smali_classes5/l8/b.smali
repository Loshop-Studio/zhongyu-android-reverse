.class public Ll8/b;
.super Ll8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ll8/a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Landroid/widget/TextView;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ll8/b;->r(Landroid/widget/TextView;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g()I
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_adapter_default_flow_tag_item:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic h(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ll8/b;->s(Landroid/view/View;)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public r(Landroid/widget/TextView;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public s(Landroid/view/View;)Landroid/widget/TextView;
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->tv_tag_item:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p1
.end method
