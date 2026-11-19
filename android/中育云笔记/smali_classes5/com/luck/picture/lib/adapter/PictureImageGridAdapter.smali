.class public Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/util/ArrayList;

.field public final c:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public final d:Landroid/content/Context;

.field public e:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->c:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->d:Landroid/content/Context;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_5

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x3

    .line 6
    if-eq p1, v1, :cond_3

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->d:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p1, v1}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    return p1

    .line 19
    :cond_0
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_item_grid_image:I

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->d:Landroid/content/Context;

    .line 23
    .line 24
    const/4 v0, 0x5

    .line 25
    invoke-static {p1, v0}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    return p1

    .line 32
    :cond_2
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_item_grid_audio:I

    .line 33
    .line 34
    return p1

    .line 35
    :cond_3
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->d:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {p1, v0}, Ll6/b;->a(Landroid/content/Context;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    return p1

    .line 44
    :cond_4
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_item_grid_video:I

    .line 45
    .line 46
    return p1

    .line 47
    :cond_5
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_item_grid_camera:I

    .line 48
    .line 49
    return p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public f(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->getItemViewType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 9
    .line 10
    new-instance p2, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$a;

    .line 11
    .line 12
    invoke-direct {p2, p0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$a;-><init>(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->a:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    add-int/lit8 p2, p2, -0x1

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 32
    .line 33
    invoke-virtual {p1, v0, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->k(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x1

    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    return p1

    .line 33
    :cond_2
    invoke-static {p1}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    const/4 p1, 0x4

    .line 40
    return p1

    .line 41
    :cond_3
    const/4 p1, 0x2

    .line 42
    return p1
.end method

.method public h(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->c(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->c:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    invoke-static {p1, p2, v0, v1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->f(Landroid/view/ViewGroup;IILcom/luck/picture/lib/config/PictureSelectionConfig;)Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public i(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public k(Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->e:Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->g(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->h(Landroid/view/ViewGroup;I)Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
