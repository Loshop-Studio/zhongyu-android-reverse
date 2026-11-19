.class public Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;
.super Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->select(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

.field public final synthetic p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;


# direct methods
.method public constructor <init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFFILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 2
    .line 3
    iput p9, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->n:I

    .line 4
    .line 5
    iput-object p10, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->o:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 6
    .line 7
    invoke-direct/range {p0 .. p8}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;-><init>(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIFFFF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->j:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->n:I

    .line 10
    .line 11
    if-lez p1, :cond_3

    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->a:Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->o:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 20
    .line 21
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->o:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 27
    .line 28
    iput-object v0, p1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->d:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;->i:Z

    .line 32
    .line 33
    iget v0, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->n:I

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, p0, v0}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->b(Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$c;I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 41
    .line 42
    iget-object v0, p1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->o:Landroid/view/View;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->o:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 45
    .line 46
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->removeChildDrawingOrderCallbackIfNecessary(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void

    .line 54
    :cond_3
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper$a;->p:Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/zykj/study/view/itemtouchhelper/ItemTouchHelper;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1
.end method
