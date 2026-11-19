.class public final Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/DocumentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DocumentHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemNoteListBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/document/databinding/ItemNoteListBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lcom/friday/document/databinding/ItemNoteListBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/friday/document/databinding/ItemNoteListBinding;->h:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(ZZZ)V
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const-string v1, "ivOption"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "ivCheck"

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    sget p2, Lcom/friday/document/R$color;->select:I

    .line 34
    .line 35
    invoke-static {p2}, Lz1/b;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget p2, Lcom/friday/document/R$color;->transparent:I

    .line 41
    .line 42
    invoke-static {p2}, Lz1/b;->a(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 50
    .line 51
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->f:Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget-object p3, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 61
    .line 62
    iget-object p3, p3, Lcom/friday/document/databinding/ItemNoteListBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 63
    .line 64
    invoke-static {p3, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object p3, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 71
    .line 72
    iget-object p3, p3, Lcom/friday/document/databinding/ItemNoteListBinding;->f:Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object p3, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 81
    .line 82
    iget-object p3, p3, Lcom/friday/document/databinding/ItemNoteListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    if-eqz p2, :cond_2

    .line 85
    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    sget p1, Lcom/friday/document/R$color;->select:I

    .line 89
    .line 90
    invoke-static {p1}, Lz1/b;->a(I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget p1, Lcom/friday/document/R$color;->transparent:I

    .line 96
    .line 97
    invoke-static {p1}, Lz1/b;->a(I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final d(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 32
    .line 33
    sget v0, Lcom/friday/document/R$drawable;->icon_sync_child_failed:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 49
    .line 50
    sget v0, Lcom/friday/document/R$drawable;->icon_to_be_synced:I

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 64
    .line 65
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 66
    .line 67
    sget v0, Lcom/friday/document/R$drawable;->icon_sync_failed:I

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "time"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;->c:Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/friday/document/databinding/ItemNoteListBinding;->i:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
