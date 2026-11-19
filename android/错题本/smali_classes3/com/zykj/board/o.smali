# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/o;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:Lcom/zykj/board/EzyRectF$RectF;

.field public e:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public f:Ljava/lang/Object;

.field public g:Lcom/zykj/board/EzyPaint$Paint;

.field public h:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public i:Ljava/util/List;

.field public j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public k:Lcom/zykj/board/EzyMatrix$Matrix;

.field public l:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/zykj/board/o;->c:I

    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4700()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/board/o;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/board/o;->f()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/board/o;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/board/o;->g()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final build()Lcom/google/protobuf/Message;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/o;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public final build()Lcom/google/protobuf/MessageLite;
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/o;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 6
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/o;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/o;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/c;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x20

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 24
    .line 25
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, -0x21

    .line 28
    .line 29
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4902(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4902(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    :goto_0
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 45
    .line 46
    if-eqz v1, :cond_c

    .line 47
    .line 48
    and-int/lit8 v2, v1, 0x1

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5002(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_2
    and-int/lit8 v2, v1, 0x2

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget v2, p0, Lcom/zykj/board/o;->c:I

    .line 62
    .line 63
    invoke-static {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5102(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;I)I

    .line 64
    .line 65
    .line 66
    :cond_3
    and-int/lit8 v2, v1, 0x4

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    iget-object v2, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 71
    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    iget-object v2, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lcom/zykj/board/EzyRectF$RectF;

    .line 82
    .line 83
    :goto_1
    invoke-static {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5202(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 84
    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    const/4 v2, 0x0

    .line 89
    :goto_2
    and-int/lit8 v3, v1, 0x8

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    iget-object v3, p0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5302(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_6
    and-int/lit8 v3, v1, 0x10

    .line 99
    .line 100
    if-eqz v3, :cond_8

    .line 101
    .line 102
    iget-object v3, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 103
    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    iget-object v3, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lcom/zykj/board/EzyPaint$Paint;

    .line 114
    .line 115
    :goto_3
    invoke-static {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5402(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;

    .line 116
    .line 117
    .line 118
    or-int/lit8 v2, v2, 0x2

    .line 119
    .line 120
    :cond_8
    and-int/lit8 v3, v1, 0x40

    .line 121
    .line 122
    if-eqz v3, :cond_a

    .line 123
    .line 124
    iget-object v3, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 125
    .line 126
    if-nez v3, :cond_9

    .line 127
    .line 128
    iget-object v3, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_9
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 136
    .line 137
    :goto_4
    invoke-static {v0, v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5502(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 138
    .line 139
    .line 140
    or-int/lit8 v2, v2, 0x4

    .line 141
    .line 142
    :cond_a
    and-int/lit16 v1, v1, 0x80

    .line 143
    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    iget-object v1, p0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5602(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_b
    invoke-static {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5776(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;I)I

    .line 152
    .line 153
    .line 154
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 155
    .line 156
    .line 157
    return-object v0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/o;->e()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/o;->e()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/o;->e()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/o;->e()V

    return-object p0
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/o;

    return-object v0
.end method

.method public final e()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput v0, p0, Lcom/zykj/board/o;->c:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 24
    .line 25
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 37
    .line 38
    :cond_1
    iget-object v2, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 43
    .line 44
    iput-object v2, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iput-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget v2, p0, Lcom/zykj/board/o;->a:I

    .line 53
    .line 54
    and-int/lit8 v2, v2, -0x21

    .line 55
    .line 56
    iput v2, p0, Lcom/zykj/board/o;->a:I

    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 68
    .line 69
    :cond_3
    iput-object v1, p0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 70
    .line 71
    return-void
.end method

.method public final ensurePointsIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x20

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final f()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->getDefaultInstance()Lcom/zykj/board/EzyPaint$Paint;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v1, v0, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final g()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v1, v0, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDefaultInstance()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDefaultInstance()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/f;->k:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->getDefaultInstance()Lcom/zykj/board/EzyRectF$RectF;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF;

    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v1, v0, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/o;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x20

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getDefaultInstance()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getGraphId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5000(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 25
    .line 26
    or-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5100(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getGraphEnumValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lcom/zykj/board/o;->c:I

    .line 44
    .line 45
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 46
    .line 47
    or-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasOutRect()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getOutRect()Lcom/zykj/board/EzyRectF$RectF;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/zykj/board/o;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 65
    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 69
    .line 70
    and-int/lit8 v1, v1, 0x4

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v1, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->getDefaultInstance()Lcom/zykj/board/EzyRectF$RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eq v1, v2, :cond_3

    .line 83
    .line 84
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 85
    .line 86
    or-int/lit8 v1, v1, 0x4

    .line 87
    .line 88
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/zykj/board/o;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lb4/b1;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Lb4/b1;->g(Lcom/zykj/board/EzyRectF$RectF;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    iput-object v0, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 111
    .line 112
    .line 113
    :goto_0
    iget-object v0, p0, Lcom/zykj/board/o;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 114
    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 118
    .line 119
    or-int/lit8 v0, v0, 0x4

    .line 120
    .line 121
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getContent()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5300(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 141
    .line 142
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 143
    .line 144
    or-int/lit8 v0, v0, 0x8

    .line 145
    .line 146
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasPaint()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v1, p0, Lcom/zykj/board/o;->h:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 162
    .line 163
    if-nez v1, :cond_8

    .line 164
    .line 165
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 166
    .line 167
    and-int/lit8 v1, v1, 0x10

    .line 168
    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    iget-object v1, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 172
    .line 173
    if-eqz v1, :cond_7

    .line 174
    .line 175
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->getDefaultInstance()Lcom/zykj/board/EzyPaint$Paint;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-eq v1, v2, :cond_7

    .line 180
    .line 181
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 182
    .line 183
    or-int/lit8 v1, v1, 0x10

    .line 184
    .line 185
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/zykj/board/o;->f()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Lb4/p0;

    .line 199
    .line 200
    invoke-virtual {v1, v0}, Lb4/p0;->g(Lcom/zykj/board/EzyPaint$Paint;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    iput-object v0, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 208
    .line 209
    .line 210
    :goto_1
    iget-object v0, p0, Lcom/zykj/board/o;->g:Lcom/zykj/board/EzyPaint$Paint;

    .line 211
    .line 212
    if-eqz v0, :cond_9

    .line 213
    .line 214
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 215
    .line 216
    or-int/lit8 v0, v0, 0x10

    .line 217
    .line 218
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 221
    .line 222
    .line 223
    :cond_9
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 224
    .line 225
    if-nez v0, :cond_b

    .line 226
    .line 227
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_e

    .line 236
    .line 237
    iget-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_a

    .line 244
    .line 245
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    iput-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 250
    .line 251
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 252
    .line 253
    and-int/lit8 v0, v0, -0x21

    .line 254
    .line 255
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/board/o;->ensurePointsIsMutable()V

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 262
    .line 263
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 268
    .line 269
    .line 270
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_b
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_e

    .line 283
    .line 284
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_d

    .line 291
    .line 292
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 293
    .line 294
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    iput-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 299
    .line 300
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iput-object v1, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 305
    .line 306
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 307
    .line 308
    and-int/lit8 v1, v1, -0x21

    .line 309
    .line 310
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 311
    .line 312
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5800()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_c

    .line 317
    .line 318
    invoke-virtual {p0}, Lcom/zykj/board/o;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :cond_c
    iput-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_d
    iget-object v0, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 326
    .line 327
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$4900(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 332
    .line 333
    .line 334
    :cond_e
    :goto_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->hasRenderMatrix()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_11

    .line 339
    .line 340
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getRenderMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iget-object v1, p0, Lcom/zykj/board/o;->l:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 345
    .line 346
    if-nez v1, :cond_10

    .line 347
    .line 348
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 349
    .line 350
    and-int/lit8 v1, v1, 0x40

    .line 351
    .line 352
    if-eqz v1, :cond_f

    .line 353
    .line 354
    iget-object v1, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 355
    .line 356
    if-eqz v1, :cond_f

    .line 357
    .line 358
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->getDefaultInstance()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-eq v1, v2, :cond_f

    .line 363
    .line 364
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 365
    .line 366
    or-int/lit8 v1, v1, 0x40

    .line 367
    .line 368
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 369
    .line 370
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Lcom/zykj/board/o;->g()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Lb4/b0;

    .line 382
    .line 383
    invoke-virtual {v1, v0}, Lb4/b0;->g(Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 384
    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_f
    iput-object v0, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_10
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 391
    .line 392
    .line 393
    :goto_4
    iget-object v0, p0, Lcom/zykj/board/o;->k:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 394
    .line 395
    if-eqz v0, :cond_11

    .line 396
    .line 397
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 398
    .line 399
    or-int/lit8 v0, v0, 0x40

    .line 400
    .line 401
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 402
    .line 403
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 404
    .line 405
    .line 406
    :cond_11
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->getFilePath()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-nez v0, :cond_12

    .line 415
    .line 416
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->access$5600(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iput-object v0, p0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 421
    .line 422
    iget v0, p0, Lcom/zykj/board/o;->a:I

    .line 423
    .line 424
    or-int/lit16 v0, v0, 0x80

    .line 425
    .line 426
    iput v0, p0, Lcom/zykj/board/o;->a:I

    .line 427
    .line 428
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 429
    .line 430
    .line 431
    :cond_12
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    check-cast p1, Lcom/zykj/board/o;

    .line 440
    .line 441
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 442
    .line 443
    .line 444
    return-void
.end method

.method public final i(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_b

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v1, v3, :cond_a

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-eq v1, v3, :cond_9

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-eq v1, v4, :cond_8

    .line 25
    .line 26
    const/16 v4, 0x22

    .line 27
    .line 28
    if-eq v1, v4, :cond_7

    .line 29
    .line 30
    const/16 v4, 0x2a

    .line 31
    .line 32
    if-eq v1, v4, :cond_6

    .line 33
    .line 34
    const/16 v3, 0x32

    .line 35
    .line 36
    if-eq v1, v3, :cond_4

    .line 37
    .line 38
    const/16 v3, 0x3a

    .line 39
    .line 40
    if-eq v1, v3, :cond_3

    .line 41
    .line 42
    const/16 v3, 0x42

    .line 43
    .line 44
    if-eq v1, v3, :cond_2

    .line 45
    .line 46
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    :cond_1
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :catch_0
    move-exception p1

    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, Lcom/zykj/board/o;->m:Ljava/lang/Object;

    .line 65
    .line 66
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 67
    .line 68
    or-int/lit16 v1, v1, 0x80

    .line 69
    .line 70
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/o;->g()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 82
    .line 83
    .line 84
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 85
    .line 86
    or-int/lit8 v1, v1, 0x40

    .line 87
    .line 88
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->parser()Lcom/google/protobuf/Parser;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lcom/zykj/board/EzyPointF$PointF;

    .line 100
    .line 101
    iget-object v2, p0, Lcom/zykj/board/o;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 102
    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/zykj/board/o;->ensurePointsIsMutable()V

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Lcom/zykj/board/o;->i:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/o;->f()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 127
    .line 128
    .line 129
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 130
    .line 131
    or-int/2addr v1, v3

    .line 132
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, p0, Lcom/zykj/board/o;->f:Ljava/lang/Object;

    .line 141
    .line 142
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 143
    .line 144
    or-int/lit8 v1, v1, 0x8

    .line 145
    .line 146
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/board/o;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 159
    .line 160
    .line 161
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 162
    .line 163
    or-int/lit8 v1, v1, 0x4

    .line 164
    .line 165
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    iput v1, p0, Lcom/zykj/board/o;->c:I

    .line 174
    .line 175
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 176
    .line 177
    or-int/lit8 v1, v1, 0x2

    .line 178
    .line 179
    iput v1, p0, Lcom/zykj/board/o;->a:I

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, p0, Lcom/zykj/board/o;->b:Ljava/lang/Object;

    .line 188
    .line 189
    iget v1, p0, Lcom/zykj/board/o;->a:I

    .line 190
    .line 191
    or-int/2addr v1, v2

    .line 192
    iput v1, p0, Lcom/zykj/board/o;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 202
    .line 203
    .line 204
    throw p1

    .line 205
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/f;->l:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/o;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/o;->i(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 5
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {p0, p1}, Lcom/zykj/board/o;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    return-object p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/o;->i(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/o;->i(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    if-eqz v0, :cond_0

    .line 9
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    invoke-virtual {p0, p1}, Lcom/zykj/board/o;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    return-object p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/o;->i(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/o;

    return-object p1
.end method
