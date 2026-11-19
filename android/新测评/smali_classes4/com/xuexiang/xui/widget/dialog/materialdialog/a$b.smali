.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/widget/CompoundButton;

.field public final b:Landroid/widget/TextView;

.field public final c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->md_control:I

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/CompoundButton;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->a:Landroid/widget/CompoundButton;

    .line 13
    .line 14
    sget v0, Lcom/xuexiang/xui/R$id;->md_title:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->b:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 33
    .line 34
    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ge v0, v1, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/CharSequence;

    .line 67
    .line 68
    :goto_0
    move-object v5, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 79
    .line 80
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v6, 0x0

    .line 89
    move-object v3, p1

    .line 90
    invoke-interface/range {v1 .. v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 33
    .line 34
    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ge v0, v1, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/CharSequence;

    .line 67
    .line 68
    :goto_0
    move-object v5, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 79
    .line 80
    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v6, 0x1

    .line 89
    move-object v3, p1

    .line 90
    invoke-interface/range {v1 .. v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Landroid/view/View;ILjava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1

    .line 95
    :cond_1
    const/4 p1, 0x0

    .line 96
    return p1
.end method
