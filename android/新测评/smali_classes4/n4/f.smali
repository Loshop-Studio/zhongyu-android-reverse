.class public final Ln4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln4/f$a;
    }
.end annotation


# static fields
.field public static final e:Ln4/f$a;


# instance fields
.field public final a:Lk4/b;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln4/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln4/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln4/f;->e:Ln4/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lk4/b;)V
    .locals 1

    .line 1
    const-string v0, "graphControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ln4/f;->a:Lk4/b;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Ln4/f;->d:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lc5/j;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln4/f;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Ln4/g;
    .locals 9

    .line 1
    iget-object v0, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ln4/g;

    .line 18
    .line 19
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 20
    .line 21
    invoke-virtual {v0}, Ln4/g;->c()Lq4/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lq4/c;->c()Lq4/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lk4/b;->p(Lq4/c;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 33
    .line 34
    invoke-virtual {v0}, Ln4/g;->a()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1, v2}, Lk4/b;->c(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 42
    .line 43
    invoke-virtual {v0}, Ln4/g;->b()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Lk4/b;->t(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 51
    .line 52
    invoke-virtual {v1}, Lk4/b;->e()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Ln4/f;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x0

    .line 72
    move v4, v3

    .line 73
    :goto_0
    if-ge v4, v2, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    check-cast v5, Lc5/j;

    .line 82
    .line 83
    iget-object v6, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const/4 v7, 0x1

    .line 90
    if-le v6, v7, :cond_1

    .line 91
    .line 92
    move v6, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move v6, v3

    .line 95
    :goto_1
    iget-object v8, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    xor-int/2addr v7, v8

    .line 102
    invoke-interface {v5, v6, v7}, Lc5/j;->a(ZZ)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    return-object v0
.end method

.method public final c(Lq4/a;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 5

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Ln4/g;

    .line 14
    .line 15
    invoke-interface {p1}, Lq4/c;->c()Lq4/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v1, p1, p2, p3}, Ln4/g;-><init>(Lq4/a;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/16 p2, 0xb

    .line 32
    .line 33
    if-le p1, p2, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->removeFirst(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Ln4/f;->d:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const/4 p3, 0x0

    .line 53
    move v0, p3

    .line 54
    :goto_1
    if-ge v0, p2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    check-cast v1, Lc5/j;

    .line 63
    .line 64
    iget-object v2, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/4 v3, 0x1

    .line 71
    if-le v2, v3, :cond_1

    .line 72
    .line 73
    move v2, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move v2, p3

    .line 76
    :goto_2
    iget-object v4, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    xor-int/2addr v3, v4

    .line 83
    invoke-interface {v1, v2, v3}, Lc5/j;->a(ZZ)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    return-void
.end method

.method public final d()Ln4/g;
    .locals 9

    .line 1
    iget-object v0, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-gt v0, v2, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v0, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ln4/g;

    .line 19
    .line 20
    iget-object v3, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ln4/g;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Ln4/g;->c()Lq4/a;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Lq4/c;->c()Lq4/a;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Lk4/b;->p(Lq4/c;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 54
    .line 55
    invoke-virtual {v0}, Ln4/g;->a()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v1, v3}, Lk4/b;->c(I)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 63
    .line 64
    invoke-virtual {v0}, Ln4/g;->b()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1, v3}, Lk4/b;->t(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Ln4/f;->a:Lk4/b;

    .line 72
    .line 73
    invoke-virtual {v1}, Lk4/b;->e()V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Ln4/f;->d:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, 0x0

    .line 83
    move v5, v4

    .line 84
    :goto_0
    if-ge v5, v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    check-cast v6, Lc5/j;

    .line 93
    .line 94
    iget-object v7, p0, Ln4/f;->b:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-le v7, v2, :cond_1

    .line 101
    .line 102
    move v7, v2

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v7, v4

    .line 105
    :goto_1
    iget-object v8, p0, Ln4/f;->c:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    xor-int/2addr v8, v2

    .line 112
    invoke-interface {v6, v7, v8}, Lc5/j;->a(ZZ)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    return-object v0

    .line 117
    :cond_3
    return-object v1
.end method
