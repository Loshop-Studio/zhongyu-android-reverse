.class public abstract Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;
.super Lcom/friday/common/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/friday/common/base/BaseFragment<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/friday/common/base/BaseFragment;->$stable:I

    sput v0, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t(Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;Ljava/util/LinkedHashMap;ZILjava/lang/Object;)Ljava/util/List;
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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->s(Ljava/util/LinkedHashMap;Z)Ljava/util/List;

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
    const-string p1, "Super calls with default arguments not supported in this target, function: getEntityList"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public final q(Lua/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "0"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_8

    .line 17
    .line 18
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Collection;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast v0, Ljava/lang/Iterable;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v4, v3

    .line 58
    check-cast v4, Ln1/b;

    .line 59
    .line 60
    const-string v5, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode"

    .line 61
    .line 62
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v4, Lua/a;

    .line 66
    .line 67
    invoke-virtual {v4}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "11"

    .line 76
    .line 77
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v3, 0x0

    .line 85
    :goto_0
    if-nez v3, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v3, "next(...)"

    .line 109
    .line 110
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    check-cast v0, Ln1/b;

    .line 114
    .line 115
    instance-of v3, v0, Lua/a;

    .line 116
    .line 117
    if-eqz v3, :cond_4

    .line 118
    .line 119
    check-cast v0, Lua/a;

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->q(Lua/a;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    move v0, v2

    .line 127
    :goto_1
    if-eqz v0, :cond_3

    .line 128
    .line 129
    return v1

    .line 130
    :cond_5
    return v2

    .line 131
    :cond_6
    return v1

    .line 132
    :cond_7
    :goto_2
    return v2

    .line 133
    :cond_8
    return v1
.end method

.method public final r(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)Ljava/util/List;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/friday/common/entity/NoteBean;

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lua/a;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p3, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/List;

    .line 38
    .line 39
    add-int/lit8 v4, p4, 0x1

    .line 40
    .line 41
    invoke-virtual {p0, v3, v1, p3, v4}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->r(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v2, v1, v0, p4}, Lua/a;-><init>(Ljava/util/List;Lcom/friday/common/entity/NoteBean;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    return-object p2
.end method

.method public final s(Ljava/util/LinkedHashMap;Z)Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "hashMap"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "0"

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/util/List;

    .line 22
    .line 23
    new-instance v4, Lcom/friday/common/entity/NoteBean;

    .line 24
    .line 25
    const/16 v20, 0x1c00

    .line 26
    .line 27
    const/16 v21, 0x0

    .line 28
    .line 29
    const-string v5, "0"

    .line 30
    .line 31
    const-string v6, "\u6839\u76ee\u5f55"

    .line 32
    .line 33
    const-string v7, "0"

    .line 34
    .line 35
    const-string v8, ""

    .line 36
    .line 37
    const-string v9, "0"

    .line 38
    .line 39
    const-string v10, ""

    .line 40
    .line 41
    const-string v11, ""

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    const-wide/16 v13, 0x0

    .line 45
    .line 46
    const/4 v15, 0x1

    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const-wide/16 v18, 0x0

    .line 52
    .line 53
    invoke-direct/range {v4 .. v21}, Lcom/friday/common/entity/NoteBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJILkotlin/jvm/internal/n;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lua/a;

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    invoke-virtual {v0, v3, v2, v1, v6}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->r(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v5, v1, v4, v2}, Lua/a;-><init>(Ljava/util/List;Lcom/friday/common/entity/NoteBean;I)V

    .line 65
    .line 66
    .line 67
    if-eqz p2, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0, v5}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->u(Lua/a;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public final u(Lua/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    :goto_0
    const/4 v1, -0x1

    .line 32
    if-ge v1, v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "get(...)"

    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    check-cast v1, Ln1/b;

    .line 51
    .line 52
    instance-of v2, v1, Lua/a;

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    check-cast v1, Lua/a;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->q(Lua/a;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Lua/a;->d()Lcom/friday/common/entity/NoteBean;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lcom/friday/common/entity/NoteBean;->getType()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "0"

    .line 73
    .line 74
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Lcom/zykj/cloudhelper/fragment/BaseNoteFragment;->u(Lua/a;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p1}, Lua/a;->a()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    :goto_2
    return-void
.end method
