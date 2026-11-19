.class public abstract Lcom/chad/library/adapter/base/BaseNodeAdapter;
.super Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter<",
        "Ln1/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;-><init>(Ljava/util/List;)V

    .line 4
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/chad/library/adapter/base/BaseNodeAdapter;->b:Ljava/util/HashSet;

    .line 5
    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 6
    invoke-static {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: flatData"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public final A(IZZZLjava/lang/Object;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ln1/b;

    .line 10
    .line 11
    instance-of v1, v0, Ln1/a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Ln1/a;

    .line 18
    .line 19
    invoke-virtual {v1}, Ln1/a;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr p1, v3

    .line 30
    invoke-virtual {v1, v2}, Ln1/a;->c(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ln1/b;->a()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Collection;

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {v0}, Ln1/b;->a()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, Ljava/util/Collection;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 p2, 0x0

    .line 63
    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast p2, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-interface {v1, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 78
    .line 79
    .line 80
    if-eqz p4, :cond_3

    .line 81
    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0, p1, p5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 p1, p1, 0x1

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeRemoved(II)V

    .line 90
    .line 91
    .line 92
    return v0

    .line 93
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 94
    .line 95
    .line 96
    :cond_3
    return v0

    .line 97
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, p5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    return v2
.end method

.method public final B(IZZZLjava/lang/Object;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ln1/b;

    .line 10
    .line 11
    instance-of v1, v0, Ln1/a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Ln1/a;

    .line 18
    .line 19
    invoke-virtual {v1}, Ln1/a;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_5

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr v3, p1

    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-virtual {v1, v4}, Ln1/a;->c(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ln1/b;->a()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/Collection;

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v0}, Ln1/b;->a()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast v0, Ljava/util/Collection;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 p2, 0x0

    .line 64
    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    add-int/2addr p1, v4

    .line 77
    check-cast p2, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    if-eqz p4, :cond_3

    .line 83
    .line 84
    if-eqz p3, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0, v3, p5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    add-int/2addr v3, v4

    .line 90
    invoke-virtual {p0, v3, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    .line 91
    .line 92
    .line 93
    return v0

    .line 94
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 95
    .line 96
    .line 97
    :cond_3
    return v0

    .line 98
    :cond_4
    :goto_1
    invoke-virtual {p0, v3, p5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    return v2
.end method

.method public final C(IZZLjava/lang/Object;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ln1/b;

    .line 10
    .line 11
    instance-of v1, v0, Ln1/a;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Ln1/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Ln1/a;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v2, p1

    .line 26
    move v4, p2

    .line 27
    move v5, p3

    .line 28
    move-object v6, p4

    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->A(IZZZLjava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_0
    move v1, p1

    .line 35
    move v3, p2

    .line 36
    move v4, p3

    .line 37
    move-object v5, p4

    .line 38
    const/4 v2, 0x0

    .line 39
    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v5}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->B(IZZZLjava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public final D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ln1/b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    instance-of v2, v1, Ln1/a;

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Ln1/a;

    .line 39
    .line 40
    invoke-virtual {v2}, Ln1/a;->b()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    :cond_1
    invoke-virtual {v1}, Ln1/b;->a()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/util/Collection;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {p0, v2, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    if-eqz p2, :cond_0

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    check-cast v1, Ln1/a;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ln1/a;->c(Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    invoke-virtual {v1}, Ln1/b;->a()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/util/Collection;

    .line 87
    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_5

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {p0, v1, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->D(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/util/Collection;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    return-object v0
.end method

.method public final F(Ln1/b;ILn1/b;)V
    .locals 1

    .line 1
    const-string v0, "parentNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ln1/b;->a()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    instance-of v0, p1, Ln1/a;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p1

    .line 25
    check-cast v0, Ln1/a;

    .line 26
    .line 27
    invoke-virtual {v0}, Ln1/a;->b()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    add-int/2addr p1, p2

    .line 45
    invoke-virtual {p0, p1, p3}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->x(ILn1/b;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method public final G(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lt p1, v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ln1/b;

    .line 22
    .line 23
    invoke-virtual {p1}, Ln1/b;->a()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Collection;

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v0, p1, Ln1/a;

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Ln1/a;

    .line 46
    .line 47
    invoke-virtual {v0}, Ln1/a;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ln1/b;->a()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/util/Collection;

    .line 61
    .line 62
    invoke-static {p0, p1, v3, v2, v3}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v1, p1

    .line 71
    check-cast v1, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_2
    return v1

    .line 82
    :cond_3
    invoke-virtual {p1}, Ln1/b;->a()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    check-cast p1, Ljava/util/Collection;

    .line 90
    .line 91
    invoke-static {p0, p1, v3, v2, v3}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    move-object v1, p1

    .line 100
    check-cast v1, Ljava/util/Collection;

    .line 101
    .line 102
    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 103
    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1

    .line 110
    :cond_4
    :goto_0
    return v1
.end method

.method public final H(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->G(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ln1/b;

    .line 35
    .line 36
    return v0
.end method

.method public I(ILn1/b;)V
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->H(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    filled-new-array {p2}, [Ln1/b;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p2}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p0, p2, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, p2

    .line 29
    check-cast v2, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v1, p1, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    add-int/2addr p1, p2

    .line 45
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, p1

    .line 54
    invoke-virtual {p0, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeRemoved(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr p1, v0

    .line 62
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public bridge synthetic addData(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln1/b;

    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->x(ILn1/b;)V

    return-void
.end method

.method public addData(ILjava/util/Collection;)V
    .locals 2

    const-string v0, "newData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 3
    invoke-static {p0, p2, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 4
    check-cast p2, Ljava/util/Collection;

    invoke-super {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(ILjava/util/Collection;)V

    return-void
.end method

.method public bridge synthetic addData(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ln1/b;

    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->y(Ln1/b;)V

    return-void
.end method

.method public addData(Ljava/util/Collection;)V
    .locals 2

    const-string v0, "newData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 5
    invoke-static {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 6
    check-cast p1, Ljava/util/Collection;

    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    return-void
.end method

.method public isFixedViewType(I)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->isFixedViewType(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/chad/library/adapter/base/BaseNodeAdapter;->b:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public m(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lq1/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->m(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "Please add BaseNodeProvider, no BaseItemProvider!"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public removeAt(I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->H(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr p1, v1

    .line 10
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeRemoved(II)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->compatibilityDataSizeChanged(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic setData(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ln1/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->I(ILn1/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDiffNewData(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/util/List;)V
    .locals 2

    const-string v0, "diffResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->hasEmptyView()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->setNewInstance(Ljava/util/List;)V

    return-void

    .line 6
    :cond_0
    check-cast p2, Ljava/util/Collection;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p2, v1, v0, v1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffNewData(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/util/List;)V

    return-void
.end method

.method public setDiffNewData(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->hasEmptyView()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->setNewInstance(Ljava/util/List;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    check-cast p1, Ljava/util/Collection;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-super {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffNewData(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public setList(Ljava/util/Collection;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, p1, v1, v0, v1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setNewInstance(Ljava/util/List;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    check-cast p1, Ljava/util/Collection;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 v0, 0x2

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, p1, v1, v0, v1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->E(Lcom/chad/library/adapter/base/BaseNodeAdapter;Ljava/util/Collection;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setNewInstance(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public x(ILn1/b;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    filled-new-array {p2}, [Ln1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->addData(ILjava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public y(Ln1/b;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    filled-new-array {p1}, [Ln1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->addData(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final z(Lq1/a;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->m(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
