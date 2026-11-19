.class public final Lcom/zykj/mistake/feature/collection/list/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 14
    sget-object v3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    const/4 v11, 0x0

    .line 15
    sget-object v12, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 16
    const-string v1, "\u6211\u7684\u9519\u9898\u96c6"

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, ""

    const/4 v10, 0x0

    move-object v9, v8

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/zykj/mistake/feature/collection/list/v;-><init>(Ljava/lang/String;ILjava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;)V
    .locals 1

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedCollectionIds"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    .line 4
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 5
    iput-boolean p4, p0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    .line 6
    iput-boolean p5, p0, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    .line 7
    iput-boolean p6, p0, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    .line 8
    iput-boolean p7, p0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    .line 9
    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    .line 11
    iput-boolean p10, p0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    .line 12
    iput-boolean p11, p0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 13
    iput-object p12, p0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;
    .locals 13

    move/from16 v0, p10

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_0

    iget p1, p0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    :cond_0
    move v2, p1

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    move-object v3, p1

    goto :goto_0

    :cond_1
    move-object v3, p2

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    move v4, p1

    goto :goto_1

    :cond_2
    move/from16 v4, p3

    :goto_1
    and-int/lit8 p1, v0, 0x10

    const/4 v5, 0x0

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    goto :goto_2

    :cond_3
    move p1, v5

    :goto_2
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    iget-boolean v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    :cond_4
    move v6, v5

    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    move v7, v5

    goto :goto_3

    :cond_5
    move/from16 v7, p4

    :goto_3
    and-int/lit16 v5, v0, 0x80

    if-eqz v5, :cond_6

    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    move-object v8, v5

    goto :goto_4

    :cond_6
    move-object/from16 v8, p5

    :goto_4
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    move-object v9, v5

    goto :goto_5

    :cond_7
    move-object/from16 v9, p6

    :goto_5
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_8

    iget-boolean v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    move v10, v5

    goto :goto_6

    :cond_8
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_9

    iget-boolean v5, p0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    move v11, v5

    goto :goto_7

    :cond_9
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    move-object v12, v0

    goto :goto_8

    :cond_a
    move-object/from16 v12, p9

    :goto_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string p0, "title"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "items"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "createName"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "createNameError"

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "selectedCollectionIds"

    invoke-static {v12, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/mistake/feature/collection/list/v;

    move v5, p1

    invoke-direct/range {v0 .. v12}, Lcom/zykj/mistake/feature/collection/list/v;-><init>(Ljava/lang/String;ILjava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/collection/list/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/list/v;

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "State(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", totalCount="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", items="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", isRefreshing="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", isLoadingMore="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", hasMore="

    .line 49
    .line 50
    const-string v2, ", showCreateDialog="

    .line 51
    .line 52
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/list/v;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/list/v;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->g:Z

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", createName="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", createNameError="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->i:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", isCreating="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", isSelectionMode="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", selectedCollectionIds="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ")"

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
.end method
