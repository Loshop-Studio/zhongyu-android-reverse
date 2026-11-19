# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/x0;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/board/c1;


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public g:Ljava/util/List;

.field public h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public i:Ljava/util/List;

.field public j:Lcom/google/protobuf/RepeatedFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/x0;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/x0;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/x0;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/x0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/x0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/x0;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/x0;->f()V

    return-object p0
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/board/x0;

    return-object v0
.end method

.method public final e()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/w1;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x20

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 24
    .line 25
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 26
    .line 27
    and-int/lit8 v1, v1, -0x21

    .line 28
    .line 29
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1902(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1902(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object v1, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 45
    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 49
    .line 50
    and-int/lit8 v1, v1, 0x40

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 61
    .line 62
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 63
    .line 64
    and-int/lit8 v1, v1, -0x41

    .line 65
    .line 66
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 67
    .line 68
    :cond_2
    iget-object v1, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2002(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2002(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    :goto_1
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 82
    .line 83
    if-eqz v1, :cond_8

    .line 84
    .line 85
    and-int/lit8 v2, v1, 0x1

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    iget-wide v2, p0, Lcom/zykj/board/x0;->b:J

    .line 90
    .line 91
    invoke-static {v0, v2, v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2102(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)J

    .line 92
    .line 93
    .line 94
    :cond_4
    and-int/lit8 v2, v1, 0x2

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    iget v2, p0, Lcom/zykj/board/x0;->c:I

    .line 99
    .line 100
    invoke-static {v0, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2202(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I

    .line 101
    .line 102
    .line 103
    :cond_5
    and-int/lit8 v2, v1, 0x4

    .line 104
    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    iget v2, p0, Lcom/zykj/board/x0;->d:F

    .line 108
    .line 109
    invoke-static {v0, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2302(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F

    .line 110
    .line 111
    .line 112
    :cond_6
    and-int/lit8 v2, v1, 0x8

    .line 113
    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    iget v2, p0, Lcom/zykj/board/x0;->e:F

    .line 117
    .line 118
    invoke-static {v0, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2402(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F

    .line 119
    .line 120
    .line 121
    :cond_7
    and-int/lit8 v1, v1, 0x10

    .line 122
    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    iget v1, p0, Lcom/zykj/board/x0;->f:I

    .line 126
    .line 127
    invoke-static {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2502(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I

    .line 128
    .line 129
    .line 130
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 131
    .line 132
    .line 133
    return-object v0
.end method

.method public final ensurePointerCoordsIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x40

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final ensurePointerPropertiesIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/x0;->a:I

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
    iget-object v1, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x20

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/zykj/board/x0;->b:J

    .line 10
    .line 11
    iput v0, p0, Lcom/zykj/board/x0;->c:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, p0, Lcom/zykj/board/x0;->d:F

    .line 15
    .line 16
    iput v1, p0, Lcom/zykj/board/x0;->e:F

    .line 17
    .line 18
    iput v0, p0, Lcom/zykj/board/x0;->f:I

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 36
    .line 37
    and-int/lit8 v0, v0, -0x21

    .line 38
    .line 39
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iput-object v1, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 56
    .line 57
    and-int/lit8 v0, v0, -0x41

    .line 58
    .line 59
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 60
    .line 61
    return-void
.end method

.method public final g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDefaultInstance()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/x0;->i(J)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lcom/zykj/board/x0;->c:I

    .line 36
    .line 37
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 38
    .line 39
    or-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    cmpl-float v0, v0, v1

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0, v0}, Lcom/zykj/board/x0;->j(F)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    cmpl-float v0, v0, v1

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0, v0}, Lcom/zykj/board/x0;->k(F)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/zykj/board/x0;->f:I

    .line 88
    .line 89
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 90
    .line 91
    or-int/lit8 v0, v0, 0x10

    .line 92
    .line 93
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    const/4 v2, 0x1

    .line 102
    const/4 v3, 0x0

    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_c

    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 128
    .line 129
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 130
    .line 131
    and-int/lit8 v0, v0, -0x21

    .line 132
    .line 133
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/x0;->ensurePointerPropertiesIsMutable()V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 140
    .line 141
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_c

    .line 161
    .line 162
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_b

    .line 169
    .line 170
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 173
    .line 174
    .line 175
    iput-object v3, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 176
    .line 177
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iput-object v0, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 182
    .line 183
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 184
    .line 185
    and-int/lit8 v0, v0, -0x21

    .line 186
    .line 187
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 188
    .line 189
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2600()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_a

    .line 194
    .line 195
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 196
    .line 197
    if-nez v0, :cond_9

    .line 198
    .line 199
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 200
    .line 201
    iget-object v4, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 202
    .line 203
    iget v5, p0, Lcom/zykj/board/x0;->a:I

    .line 204
    .line 205
    and-int/lit8 v5, v5, 0x20

    .line 206
    .line 207
    if-eqz v5, :cond_8

    .line 208
    .line 209
    move v5, v2

    .line 210
    goto :goto_1

    .line 211
    :cond_8
    move v5, v1

    .line 212
    :goto_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    invoke-direct {v0, v4, v5, v6, v7}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 221
    .line 222
    .line 223
    iput-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 224
    .line 225
    iput-object v3, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 226
    .line 227
    :cond_9
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_a
    move-object v0, v3

    .line 231
    :goto_2
    iput-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    iget-object v0, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 235
    .line 236
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$1900(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v0, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 241
    .line 242
    .line 243
    :cond_c
    :goto_3
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 244
    .line 245
    if-nez v0, :cond_e

    .line 246
    .line 247
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_13

    .line 256
    .line 257
    iget-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_d

    .line 264
    .line 265
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iput-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 270
    .line 271
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 272
    .line 273
    and-int/lit8 v0, v0, -0x41

    .line 274
    .line 275
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/board/x0;->ensurePointerCoordsIsMutable()V

    .line 279
    .line 280
    .line 281
    iget-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 282
    .line 283
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 288
    .line 289
    .line 290
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_e
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_13

    .line 303
    .line 304
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 305
    .line 306
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_12

    .line 311
    .line 312
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 313
    .line 314
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 315
    .line 316
    .line 317
    iput-object v3, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 318
    .line 319
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iput-object v0, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 324
    .line 325
    iget v0, p0, Lcom/zykj/board/x0;->a:I

    .line 326
    .line 327
    and-int/lit8 v0, v0, -0x41

    .line 328
    .line 329
    iput v0, p0, Lcom/zykj/board/x0;->a:I

    .line 330
    .line 331
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2700()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_11

    .line 336
    .line 337
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 338
    .line 339
    if-nez v0, :cond_10

    .line 340
    .line 341
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 342
    .line 343
    iget-object v4, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 344
    .line 345
    iget v5, p0, Lcom/zykj/board/x0;->a:I

    .line 346
    .line 347
    and-int/lit8 v5, v5, 0x40

    .line 348
    .line 349
    if-eqz v5, :cond_f

    .line 350
    .line 351
    move v1, v2

    .line 352
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    invoke-direct {v0, v4, v1, v2, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 361
    .line 362
    .line 363
    iput-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 364
    .line 365
    iput-object v3, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 366
    .line 367
    :cond_10
    iget-object v3, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 368
    .line 369
    :cond_11
    iput-object v3, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_12
    iget-object v0, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 373
    .line 374
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2000(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 379
    .line 380
    .line 381
    :cond_13
    :goto_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    check-cast p1, Lcom/zykj/board/x0;

    .line 390
    .line 391
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 392
    .line 393
    .line 394
    return-void
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDefaultInstance()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDefaultInstance()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/a2;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 6

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
    const/16 v3, 0x8

    .line 15
    .line 16
    if-eq v1, v3, :cond_a

    .line 17
    .line 18
    const/16 v4, 0x10

    .line 19
    .line 20
    if-eq v1, v4, :cond_9

    .line 21
    .line 22
    const/16 v5, 0x1d

    .line 23
    .line 24
    if-eq v1, v5, :cond_8

    .line 25
    .line 26
    const/16 v5, 0x25

    .line 27
    .line 28
    if-eq v1, v5, :cond_7

    .line 29
    .line 30
    const/16 v3, 0x28

    .line 31
    .line 32
    if-eq v1, v3, :cond_6

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
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    :cond_1
    move v0, v2

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_2
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->parser()Lcom/google/protobuf/Parser;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/board/x0;->ensurePointerCoordsIsMutable()V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->parser()Lcom/google/protobuf/Parser;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/board/x0;->ensurePointerPropertiesIsMutable()V

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iput v1, p0, Lcom/zykj/board/x0;->f:I

    .line 115
    .line 116
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 117
    .line 118
    or-int/2addr v1, v4

    .line 119
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iput v1, p0, Lcom/zykj/board/x0;->e:F

    .line 127
    .line 128
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 129
    .line 130
    or-int/2addr v1, v3

    .line 131
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iput v1, p0, Lcom/zykj/board/x0;->d:F

    .line 140
    .line 141
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 142
    .line 143
    or-int/lit8 v1, v1, 0x4

    .line 144
    .line 145
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, p0, Lcom/zykj/board/x0;->c:I

    .line 154
    .line 155
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 156
    .line 157
    or-int/lit8 v1, v1, 0x2

    .line 158
    .line 159
    iput v1, p0, Lcom/zykj/board/x0;->a:I

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    iput-wide v3, p0, Lcom/zykj/board/x0;->b:J

    .line 168
    .line 169
    iget v1, p0, Lcom/zykj/board/x0;->a:I

    .line 170
    .line 171
    or-int/2addr v1, v2

    .line 172
    iput v1, p0, Lcom/zykj/board/x0;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final i(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/x0;->b:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/x0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/x0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/a2;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 4
    .line 5
    const-class v2, Lcom/zykj/board/x0;

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

.method public final j(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/x0;->d:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/x0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/x0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/x0;->e:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/x0;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/x0;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/x0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 5
    instance-of v0, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {p0, p1}, Lcom/zykj/board/x0;->g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-object p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/x0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/x0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8
    instance-of v0, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    if-eqz v0, :cond_0

    .line 9
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {p0, p1}, Lcom/zykj/board/x0;->g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-object p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/x0;->h(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/board/x0;

    return-object p1
.end method
