.class public Lcom/xuexiang/xui/widget/searchview/d;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filterable;
.implements Lcom/xuexiang/xui/widget/searchview/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/d$a;
    }
.end annotation


# instance fields
.field public c:Ljava/util/List;

.field public d:[Ljava/lang/String;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/view/LayoutInflater;

.field public g:Z

.field public h:Lcom/xuexiang/xui/widget/searchview/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->f:Landroid/view/LayoutInflater;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->c:Ljava/util/List;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/d;->d:[Ljava/lang/String;

    .line 18
    .line 19
    iput-object p3, p0, Lcom/xuexiang/xui/widget/searchview/d;->e:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/searchview/d;->g:Z

    .line 22
    .line 23
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/c;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/xuexiang/xui/widget/searchview/c;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/d;->c(Lcom/xuexiang/xui/widget/searchview/a;)Lcom/xuexiang/xui/widget/searchview/d;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/searchview/d;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/d;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lcom/xuexiang/xui/widget/searchview/a;)Lcom/xuexiang/xui/widget/searchview/d;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->h:Lcom/xuexiang/xui/widget/searchview/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/d;->d:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/searchview/a;->c([Ljava/lang/String;)Lcom/xuexiang/xui/widget/searchview/a;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->h:Lcom/xuexiang/xui/widget/searchview/a;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/xuexiang/xui/widget/searchview/a;->b(Lcom/xuexiang/xui/widget/searchview/a$a;)Lcom/xuexiang/xui/widget/searchview/a;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/d;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/d;->h:Lcom/xuexiang/xui/widget/searchview/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/d;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/d;->f:Landroid/view/LayoutInflater;

    .line 4
    .line 5
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_search_view_suggest_item:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance p3, Lcom/xuexiang/xui/widget/searchview/d$a;

    .line 13
    .line 14
    invoke-direct {p3, p0, p2}, Lcom/xuexiang/xui/widget/searchview/d$a;-><init>(Lcom/xuexiang/xui/widget/searchview/d;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    check-cast p3, Lcom/xuexiang/xui/widget/searchview/d$a;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/d;->getItem(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, p3, Lcom/xuexiang/xui/widget/searchview/d$a;->a:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/d;->g:Z

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p3, Lcom/xuexiang/xui/widget/searchview/d$a;->a:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p3, Lcom/xuexiang/xui/widget/searchview/d$a;->a:Landroid/widget/TextView;

    .line 48
    .line 49
    sget-object p3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 50
    .line 51
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-object p2
.end method
