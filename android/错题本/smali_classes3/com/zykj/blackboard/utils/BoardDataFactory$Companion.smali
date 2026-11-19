# RE note 组装 Sketch 的 BoardHead、BoardBody 与独立 Header。buildHead 设置所写版本。
.class public final Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/utils/BoardDataFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JG\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;",
        "",
        "()V",
        "supportLastVersion",
        "",
        "version",
        "buildHead",
        "Lcom/zykj/board/EzyHeader$Header;",
        "width",
        "height",
        "updateTime",
        "",
        "duration",
        "author",
        "Lcom/zykj/board/EzyHeader$Author;",
        "provider",
        "",
        "(IILjava/lang/Long;JLcom/zykj/board/EzyHeader$Author;Ljava/util/List;)Lcom/zykj/board/EzyHeader$Header;",
        "blackboard_release"
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
    invoke-direct {p0}, Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildHead(IILjava/lang/Long;JLcom/zykj/board/EzyHeader$Author;Ljava/util/List;)Lcom/zykj/board/EzyHeader$Header;
    .locals 2
    .param p3    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/board/EzyHeader$Author;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Long;",
            "J",
            "Lcom/zykj/board/EzyHeader$Author;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyHeader$Author;",
            ">;)",
            "Lcom/zykj/board/EzyHeader$Header;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->newBuilder()Lb4/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    iput v1, v0, Lb4/u;->b:I

    .line 7
    .line 8
    iget v1, v0, Lb4/u;->a:I

    .line 9
    .line 10
    or-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iput v1, v0, Lb4/u;->a:I

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 15
    .line 16
    .line 17
    iput p1, v0, Lb4/u;->c:I

    .line 18
    .line 19
    iget p1, v0, Lb4/u;->a:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    iput p1, v0, Lb4/u;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 26
    .line 27
    .line 28
    iput p2, v0, Lb4/u;->d:I

    .line 29
    .line 30
    iget p1, v0, Lb4/u;->a:I

    .line 31
    .line 32
    or-int/lit8 p1, p1, 0x4

    .line 33
    .line 34
    iput p1, v0, Lb4/u;->a:I

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/util/Date;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    iput-wide p1, v0, Lb4/u;->e:J

    .line 49
    .line 50
    iget p1, v0, Lb4/u;->a:I

    .line 51
    .line 52
    or-int/lit8 p1, p1, 0x8

    .line 53
    .line 54
    iput p1, v0, Lb4/u;->a:I

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 57
    .line 58
    .line 59
    iput-wide p4, v0, Lb4/u;->g:J

    .line 60
    .line 61
    iget p1, v0, Lb4/u;->a:I

    .line 62
    .line 63
    or-int/lit8 p1, p1, 0x20

    .line 64
    .line 65
    iput p1, v0, Lb4/u;->a:I

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 68
    .line 69
    .line 70
    if-eqz p3, :cond_0

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    iput-wide p1, v0, Lb4/u;->f:J

    .line 77
    .line 78
    iget p1, v0, Lb4/u;->a:I

    .line 79
    .line 80
    or-int/lit8 p1, p1, 0x10

    .line 81
    .line 82
    iput p1, v0, Lb4/u;->a:I

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 85
    .line 86
    .line 87
    :cond_0
    if-eqz p6, :cond_2

    .line 88
    .line 89
    iget-object p1, v0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 90
    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    iput-object p6, v0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p1, p6}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 97
    .line 98
    .line 99
    :goto_0
    iget p1, v0, Lb4/u;->a:I

    .line 100
    .line 101
    or-int/lit8 p1, p1, 0x40

    .line 102
    .line 103
    iput p1, v0, Lb4/u;->a:I

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 106
    .line 107
    .line 108
    :cond_2
    if-eqz p7, :cond_4

    .line 109
    .line 110
    iget-object p1, v0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 111
    .line 112
    if-nez p1, :cond_3

    .line 113
    .line 114
    invoke-virtual {v0}, Lb4/u;->g()V

    .line 115
    .line 116
    .line 117
    iget-object p1, v0, Lb4/u;->k:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {p7, p1}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-virtual {p1, p7}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lb4/u;->c()Lcom/zykj/board/EzyHeader$Header;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1
.end method
