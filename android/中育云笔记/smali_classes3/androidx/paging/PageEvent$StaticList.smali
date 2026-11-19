.class public final Landroidx/paging/PageEvent$StaticList;
.super Landroidx/paging/PageEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PageEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StaticList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/paging/PageEvent<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final mediatorLoadStates:Landroidx/paging/LoadStates;

.field private final placeholdersAfter:I

.field private final placeholdersBefore:I

.field private final sourceLoadStates:Landroidx/paging/LoadStates;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            "II)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Landroidx/paging/PageEvent;-><init>(Lkotlin/jvm/internal/n;)V

    .line 2
    iput-object p1, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 3
    iput-object p2, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 4
    iput-object p3, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 5
    iput p4, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 6
    iput p5, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move p6, v0

    :goto_0
    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    return-void
.end method

.method public static synthetic copy$default(Landroidx/paging/PageEvent$StaticList;Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILjava/lang/Object;)Landroidx/paging/PageEvent$StaticList;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Landroidx/paging/PageEvent$StaticList;->copy(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PageEvent$StaticList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Landroidx/paging/LoadStates;
    .locals 1

    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    return-object v0
.end method

.method public final component3()Landroidx/paging/LoadStates;
    .locals 1

    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    return v0
.end method

.method public final copy(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PageEvent$StaticList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            "II)",
            "Landroidx/paging/PageEvent$StaticList<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroidx/paging/PageEvent$StaticList;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/paging/PageEvent$StaticList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    iget-object v1, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    iget-object v3, p1, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    iget-object v3, p1, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    iget-object v3, p1, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    iget v3, p1, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    iget p1, p1, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public filter(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageEvent$StaticList$filter$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageEvent$StaticList$filter$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageEvent$StaticList$filter$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageEvent$StaticList$filter$1;-><init>(Landroidx/paging/PageEvent$StaticList;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$3:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v2, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/Iterator;

    .line 43
    .line 44
    iget-object v4, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/util/Collection;

    .line 47
    .line 48
    iget-object v5, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Lhd/p;

    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/Iterable;

    .line 70
    .line 71
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    move-object v4, v2

    .line 81
    move-object v2, p2

    .line 82
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iput-object p1, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v4, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$2:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p2, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->L$3:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, Landroidx/paging/PageEvent$StaticList$filter$1;->label:I

    .line 101
    .line 102
    invoke-interface {p1, p2, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-ne v5, v1, :cond_3

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_3
    move-object v12, v5

    .line 110
    move-object v5, p1

    .line 111
    move-object p1, p2

    .line 112
    move-object p2, v12

    .line 113
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_4

    .line 120
    .line 121
    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    :cond_4
    move-object p1, v5

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object v7, v4

    .line 127
    check-cast v7, Ljava/util/List;

    .line 128
    .line 129
    iget-object v8, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 130
    .line 131
    iget-object v9, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 132
    .line 133
    iget v10, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 134
    .line 135
    iget v11, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    .line 136
    .line 137
    new-instance v6, Landroidx/paging/PageEvent$StaticList;

    .line 138
    .line 139
    invoke-direct/range {v6 .. v11}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    .line 140
    .line 141
    .line 142
    return-object v6
.end method

.method public flatMap(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageEvent$StaticList$flatMap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageEvent$StaticList$flatMap$1;-><init>(Landroidx/paging/PageEvent$StaticList;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$2:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object v2, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/Collection;

    .line 45
    .line 46
    iget-object v4, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Lhd/p;

    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Iterable;

    .line 68
    .line 69
    new-instance v2, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    move-object v11, p2

    .line 79
    move-object p2, p1

    .line 80
    move-object p1, v11

    .line 81
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iput-object p2, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object p1, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->L$2:Ljava/lang/Object;

    .line 96
    .line 97
    iput v3, v0, Landroidx/paging/PageEvent$StaticList$flatMap$1;->label:I

    .line 98
    .line 99
    invoke-interface {p2, v4, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-ne v4, v1, :cond_3

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_3
    move-object v11, v4

    .line 107
    move-object v4, p2

    .line 108
    move-object p2, v11

    .line 109
    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-static {v2, p2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 112
    .line 113
    .line 114
    move-object p2, v4

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    move-object v6, v2

    .line 117
    check-cast v6, Ljava/util/List;

    .line 118
    .line 119
    iget-object v7, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 120
    .line 121
    iget-object v8, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 122
    .line 123
    iget v9, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 124
    .line 125
    iget v10, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    .line 126
    .line 127
    new-instance v5, Landroidx/paging/PageEvent$StaticList;

    .line 128
    .line 129
    invoke-direct/range {v5 .. v10}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    .line 130
    .line 131
    .line 132
    return-object v5
.end method

.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMediatorLoadStates()Landroidx/paging/LoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholdersAfter()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPlaceholdersBefore()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSourceLoadStates()Landroidx/paging/LoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public map(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/PageEvent$StaticList$map$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PageEvent$StaticList$map$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PageEvent$StaticList$map$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/PageEvent$StaticList$map$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PageEvent$StaticList$map$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PageEvent$StaticList$map$1;-><init>(Landroidx/paging/PageEvent$StaticList;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PageEvent$StaticList$map$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PageEvent$StaticList$map$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$3:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/Collection;

    .line 41
    .line 42
    iget-object v2, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/Iterator;

    .line 45
    .line 46
    iget-object v4, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Ljava/util/Collection;

    .line 49
    .line 50
    iget-object v5, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Lhd/p;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Iterable;

    .line 72
    .line 73
    new-instance v2, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v4, 0xa

    .line 76
    .line 77
    invoke-static {p2, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    move-object v12, p2

    .line 89
    move-object p2, p1

    .line 90
    move-object p1, v2

    .line 91
    move-object v2, v12

    .line 92
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object p2, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object p1, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v2, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p1, v0, Landroidx/paging/PageEvent$StaticList$map$1;->L$3:Ljava/lang/Object;

    .line 109
    .line 110
    iput v3, v0, Landroidx/paging/PageEvent$StaticList$map$1;->label:I

    .line 111
    .line 112
    invoke-interface {p2, v4, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-ne v4, v1, :cond_3

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_3
    move-object v5, p2

    .line 120
    move-object p2, v4

    .line 121
    move-object v4, p1

    .line 122
    :goto_2
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-object p1, v4

    .line 126
    move-object p2, v5

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    move-object v7, p1

    .line 129
    check-cast v7, Ljava/util/List;

    .line 130
    .line 131
    iget-object v8, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 132
    .line 133
    iget-object v9, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 134
    .line 135
    iget v10, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 136
    .line 137
    iget v11, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    .line 138
    .line 139
    new-instance v6, Landroidx/paging/PageEvent$StaticList;

    .line 140
    .line 141
    invoke-direct/range {v6 .. v11}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    .line 142
    .line 143
    .line 144
    return-object v6
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PageEvent$StaticList;->mediatorLoadStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "PageEvent.StaticList with "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, " items (\n                    |   first item: "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v2}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, "\n                    |   last item: "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Landroidx/paging/PageEvent$StaticList;->data:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v2}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v2, "\n                    |   sourceLoadStates: "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Landroidx/paging/PageEvent$StaticList;->sourceLoadStates:Landroidx/paging/LoadStates;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ",\n                    |   placeholdersBefore: "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget v2, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersBefore:I

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ",\n                    |   placeholdersAfter: "

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget v2, p0, Landroidx/paging/PageEvent$StaticList;->placeholdersAfter:I

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, ",\n                    "

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v0, :cond_0

    .line 90
    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, "|   mediatorLoadStates: "

    .line 100
    .line 101
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const/16 v0, 0xa

    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, "|)"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const/4 v1, 0x1

    .line 134
    const/4 v2, 0x0

    .line 135
    invoke-static {v0, v2, v1, v2}, Lqd/s;->p(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0
.end method
