.class public abstract Lz7/b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/List;

.field public d:Landroid/content/Context;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz7/b;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lz7/b;->e:I

    .line 4
    iput-object p1, p0, Lz7/b;->d:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz7/b;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lz7/b;->e:I

    .line 8
    iput-object p1, p0, Lz7/b;->d:Landroid/content/Context;

    .line 9
    invoke-virtual {p0, p2}, Lz7/b;->e(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final b(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    if-gt p1, v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lz7/b;->e:I

    .line 8
    .line 9
    return-void
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/b;->d:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lz7/b;->e:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

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

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lz7/b;->b(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lz7/b;->c:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
.end method
