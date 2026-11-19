.class public final Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "*>;>;",
            "Ljava/util/SortedSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ljava/util/Collection;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {p1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public static final transform(Landroidx/compose/ui/text/AnnotatedString;Lhd/q;)Landroidx/compose/ui/text/AnnotatedString;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lhd/q;",
            ")",
            "Landroidx/compose/ui/text/AnnotatedString;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    filled-new-array {v1, v2}, [Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lrc/x0;->e([Ljava/lang/Object;)Ljava/util/TreeSet;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2, v3}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt;->collectRangeTransitions(Ljava/util/List;Ljava/util/SortedSet;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 34
    .line 35
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v4, ""

    .line 39
    .line 40
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v1, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lkotlin/collections/a;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v7, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;

    .line 55
    .line 56
    invoke-direct {v7, v2, p1, p0, v1}, Landroidx/compose/ui/text/JvmAnnotatedString_jvmKt$transform$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/q;Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    const/4 v8, 0x6

    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v4, 0x2

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v3 .. v9}, Lrc/g0;->e1(Ljava/lang/Iterable;IIZLhd/l;ILjava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    move-object v3, p0

    .line 83
    check-cast v3, Ljava/util/Collection;

    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :goto_0
    if-ge v0, v3, :cond_1

    .line 90
    .line 91
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 96
    .line 97
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 98
    .line 99
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    check-cast v7, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    check-cast v4, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-direct {v5, v6, v7, v4}, Landroidx/compose/ui/text/AnnotatedString$Range;-><init>(Ljava/lang/Object;II)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    const/4 p1, 0x0

    .line 155
    :cond_1
    new-instance p0, Landroidx/compose/ui/text/AnnotatedString;

    .line 156
    .line 157
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/lang/String;

    .line 160
    .line 161
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object p0
.end method
