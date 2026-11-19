.class final Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.main.drawer.MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1"
    f = "MistakeTagEditorPanel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeTagEditorPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeTagEditorPanel.kt\ncom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n1563#2:410\n1634#2,3:411\n774#2:414\n865#2,2:415\n1869#2:417\n2746#2,3:418\n1870#2:421\n*S KotlinDebug\n*F\n+ 1 MistakeTagEditorPanel.kt\ncom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1\n*L\n78#1:410\n78#1:411,3\n83#1:414\n83#1:415,2\n83#1:417\n85#1:418,3\n83#1:421\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/zykj/mistake/main/a1;

.field label:I


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/a1;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateSet;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/main/a1;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
            ">;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateSet<",
            "Ljava/lang/Long;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$state:Lcom/zykj/mistake/main/a1;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$selectedTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$state:Lcom/zykj/mistake/main/a1;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$selectedTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;-><init>(Lcom/zykj/mistake/main/a1;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateSet;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$state:Lcom/zykj/mistake/main/a1;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    new-instance v4, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v0}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$selectedTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 59
    .line 60
    new-instance v2, Landroidx/navigation/i;

    .line 61
    .line 62
    const/16 v3, 0x11

    .line 63
    .line 64
    invoke-direct {v2, v0, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/collections/y;->Z(Ljava/util/List;Lr6/c;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 79
    .line 80
    new-instance v2, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    move-object v4, v3

    .line 100
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 101
    .line 102
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    new-instance v6, Ljava/lang/Long;

    .line 107
    .line 108
    invoke-direct {v6, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v6}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_1

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    iget-object p1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$selectedTags:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    const/4 v3, 0x0

    .line 128
    :cond_3
    :goto_2
    if-ge v3, v1, :cond_7

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    add-int/lit8 v3, v3, 0x1

    .line 135
    .line 136
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    const/4 v6, 0x6

    .line 143
    if-ge v5, v6, :cond_3

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_4

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 167
    .line 168
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 169
    .line 170
    .line 171
    move-result-wide v7

    .line 172
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 173
    .line 174
    .line 175
    move-result-wide v9

    .line 176
    cmp-long v7, v7, v9

    .line 177
    .line 178
    if-nez v7, :cond_5

    .line 179
    .line 180
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    const/4 v7, -0x1

    .line 185
    if-ne v6, v7, :cond_5

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_6
    :goto_3
    invoke-virtual {p1, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    iget-object p1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 193
    .line 194
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->clear()V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/zykj/mistake/main/drawer/MistakeTagEditorPanelKt$MistakeTagEditorPanel$1$1;->$knownCustomTagIds:Landroidx/compose/runtime/snapshots/SnapshotStateSet;

    .line 198
    .line 199
    check-cast v0, Ljava/util/Collection;

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateSet;->addAll(Ljava/util/Collection;)Z

    .line 202
    .line 203
    .line 204
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 205
    .line 206
    return-object p1

    .line 207
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 210
    .line 211
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1
.end method
