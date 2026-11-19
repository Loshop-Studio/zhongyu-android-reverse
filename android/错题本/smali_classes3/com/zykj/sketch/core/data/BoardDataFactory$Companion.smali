# RE note 组装 Sketch 的 BoardHead、BoardBody 与独立 Header。buildHead 设置所写版本。
.class public final Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/data/BoardDataFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/data/BoardDataFactory$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00052\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0010J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00112\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020 8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\"R\u0014\u0010(\u001a\u00020 8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008(\u0010\"\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "filterData",
        "",
        "deleteSnapShot",
        "(Ljava/util/List;)Ljava/lang/Iterable;",
        "content",
        "newContentList",
        "Ld6/s;",
        "parseEventAsTask",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V",
        "list",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;",
        "path",
        "parse",
        "(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;)Ljava/util/List;",
        "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;",
        "buildHead",
        "()Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;",
        "data",
        "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;",
        "head",
        "buildCommon",
        "(Ljava/util/List;Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;",
        "boardHead",
        "Lcom/zykj/sketch/SketchHeader$Header;",
        "(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/SketchHeader$Header;",
        "",
        "flag",
        "I",
        "getFlag",
        "()I",
        "setFlag",
        "(I)V",
        "supportLastVersion",
        "version",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;-><init>()V

    return-void
.end method

.method private final deleteSnapShot(Ljava/util/List;)Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)",
            "Ljava/lang/Iterable<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->setFlag(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 25
    .line 26
    sget-object v2, Lcom/zykj/sketch/core/data/BoardDataFactory;->Companion:Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method private final filterData(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :cond_0
    move v2, v1

    .line 11
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_8

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    const/4 v4, -0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    sget-object v5, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    aget v4, v5, v4

    .line 38
    .line 39
    :goto_1
    const/4 v5, 0x1

    .line 40
    if-eq v4, v5, :cond_7

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    if-eq v4, v5, :cond_0

    .line 44
    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 73
    .line 74
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    sget-object v4, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 79
    .line 80
    if-eq v3, v4, :cond_4

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_6

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_6
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_7
    move v2, v5

    .line 115
    goto :goto_0

    .line 116
    :cond_8
    return-object p1
.end method

.method private final parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->getFlag()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eq v1, v2, :cond_2

    .line 46
    .line 47
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->hasGraphSnapshot()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->getFlag()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, "   "

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->getFlag()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    invoke-virtual {p0, v1}, Lcom/zykj/sketch/core/data/BoardDataFactory$Companion;->setFlag(I)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 118
    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "builder.build()"

    .line 156
    .line 157
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    return-void
.end method


# virtual methods
.method public final buildCommon(Ljava/util/List;Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/EzyDrawBoard$BoardHead;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;",
            ")",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "head"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->addAllActionContent(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;

    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    move-result-object p1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;->setBoardHead(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;

    .line 6
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;->setBoardBody(Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;

    .line 7
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    move-result-object p1

    const-string p2, "drawBoard.build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final buildCommon(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)Lcom/zykj/sketch/SketchHeader$Header;
    .locals 3
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$BoardHead;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "boardHead"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/zykj/sketch/SketchHeader$Header;->newBuilder()Lcom/zykj/sketch/SketchHeader$Header$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setVersion(I)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 10
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setWidth(I)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 11
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setHeight(I)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getCreateDate()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setCreateDate(J)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 13
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getUpdateDate()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setUpdateDate(J)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getAuthor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setAuthor(Ljava/lang/String;)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 15
    invoke-virtual {v0}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->getType()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->setType(I)Lcom/zykj/sketch/SketchHeader$Header$Builder;

    .line 16
    invoke-virtual {v0}, Lcom/zykj/sketch/SketchHeader$Header$Builder;->build()Lcom/zykj/sketch/SketchHeader$Header;

    move-result-object p1

    const-string v0, "header.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final buildHead()Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x5

    .line 6
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setVersion(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setType(I)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/Date;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setCreateDate(J)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 23
    .line 24
    .line 25
    const-string v1, ""

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;->setAuthor(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final getFlag()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/core/data/BoardDataFactory;->access$getFlag$cp()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final parse(Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;)Ljava/util/List;
    .locals 1
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$BoardBody;->getActionContentList()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final setFlag(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/zykj/sketch/core/data/BoardDataFactory;->access$setFlag$cp(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
