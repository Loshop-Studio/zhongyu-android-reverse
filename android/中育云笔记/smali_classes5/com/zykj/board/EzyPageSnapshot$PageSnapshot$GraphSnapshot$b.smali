# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:Lcom/zykj/board/EzyRectF$RectF;

.field public g:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public h:Lcom/zykj/board/EzyMatrix$Matrix;

.field public i:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public j:Ljava/util/List;

.field public k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public l:Ljava/lang/Object;

.field public m:I

.field public n:I

.field public o:Lcom/zykj/board/EzyPaint$Paint;

.field public p:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public q:Ljava/lang/Object;

.field public r:Ljava/util/List;

.field public s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 9
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 10
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 11
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 13
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 15
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 16
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 17
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 18
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 19
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 20
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyPageSnapshot$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyPageSnapshot$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;-><init>()V

    return-void
.end method

.method private getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->u()Lcom/zykj/board/EzyRectF$RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->y()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->z()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private y()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->w()Lcom/zykj/board/EzyPaint$Paint;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_3

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
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    :sswitch_0
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 36
    .line 37
    or-int/lit16 v1, v1, 0x800

    .line 38
    .line 39
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->parser()Lcom/google/protobuf/Parser;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/zykj/board/EzyPointF$PointF;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 53
    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p()V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 74
    .line 75
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 76
    .line 77
    or-int/lit16 v1, v1, 0x200

    .line 78
    .line 79
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :sswitch_4
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->y()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 91
    .line 92
    .line 93
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 94
    .line 95
    or-int/lit16 v1, v1, 0x100

    .line 96
    .line 97
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n:I

    .line 105
    .line 106
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 107
    .line 108
    or-int/lit16 v1, v1, 0x80

    .line 109
    .line 110
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m:I

    .line 118
    .line 119
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 120
    .line 121
    or-int/lit8 v1, v1, 0x40

    .line 122
    .line 123
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 131
    .line 132
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 133
    .line 134
    or-int/lit8 v1, v1, 0x20

    .line 135
    .line 136
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :sswitch_8
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->parser()Lcom/google/protobuf/Parser;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 149
    .line 150
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 151
    .line 152
    if-nez v2, :cond_2

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->ensureChildGraphIsMutable()V

    .line 155
    .line 156
    .line 157
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_2
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 178
    .line 179
    .line 180
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 181
    .line 182
    or-int/lit8 v1, v1, 0x8

    .line 183
    .line 184
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :sswitch_a
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 197
    .line 198
    .line 199
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 200
    .line 201
    or-int/lit8 v1, v1, 0x4

    .line 202
    .line 203
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 212
    .line 213
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 214
    .line 215
    or-int/lit8 v1, v1, 0x2

    .line 216
    .line 217
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :sswitch_c
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    .line 226
    .line 227
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 228
    .line 229
    or-int/2addr v1, v2

    .line 230
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 240
    .line 241
    .line 242
    throw p1

    .line 243
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 244
    .line 245
    .line 246
    return-object p0

    .line 247
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_c
        0x10 -> :sswitch_b
        0x1a -> :sswitch_a
        0x22 -> :sswitch_9
        0x2a -> :sswitch_8
        0x32 -> :sswitch_7
        0x38 -> :sswitch_6
        0x40 -> :sswitch_5
        0x4a -> :sswitch_4
        0x52 -> :sswitch_3
        0x5a -> :sswitch_2
        0x62 -> :sswitch_1
    .end sparse-switch
.end method

.method public C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->D(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public D(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->G()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 25
    .line 26
    or-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->d(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->K()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->N(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->N()Lcom/zykj/board/EzyRectF$RectF;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->F(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->T()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->M()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->E(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_9

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 100
    .line 101
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 102
    .line 103
    and-int/lit8 v0, v0, -0x11

    .line 104
    .line 105
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->ensureChildGraphIsMutable()V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 112
    .line 113
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_9

    .line 133
    .line 134
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 148
    .line 149
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 154
    .line 155
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 156
    .line 157
    and-int/lit8 v0, v0, -0x11

    .line 158
    .line 159
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 160
    .line 161
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->z()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    goto :goto_1

    .line 172
    :cond_7
    move-object v0, v1

    .line 173
    :goto_1
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_8
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 177
    .line 178
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 183
    .line 184
    .line 185
    :cond_9
    :goto_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_a

    .line 194
    .line 195
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 200
    .line 201
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 202
    .line 203
    or-int/lit8 v0, v0, 0x20

    .line 204
    .line 205
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 206
    .line 207
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 208
    .line 209
    .line 210
    :cond_a
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->U(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 221
    .line 222
    .line 223
    :cond_b
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->I(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 234
    .line 235
    .line 236
    :cond_c
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_d

    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Lcom/zykj/board/EzyPaint$Paint;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->G(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 247
    .line 248
    .line 249
    :cond_d
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_e

    .line 258
    .line 259
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->r(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 264
    .line 265
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 266
    .line 267
    or-int/lit16 v0, v0, 0x200

    .line 268
    .line 269
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 272
    .line 273
    .line 274
    :cond_e
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 275
    .line 276
    if-nez v0, :cond_10

    .line 277
    .line 278
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_13

    .line 287
    .line 288
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_f

    .line 295
    .line 296
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 301
    .line 302
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 303
    .line 304
    and-int/lit16 v0, v0, -0x401

    .line 305
    .line 306
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_f
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p()V

    .line 310
    .line 311
    .line 312
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 313
    .line 314
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 319
    .line 320
    .line 321
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_10
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_13

    .line 334
    .line 335
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 336
    .line 337
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_12

    .line 342
    .line 343
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 344
    .line 345
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 346
    .line 347
    .line 348
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 349
    .line 350
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 355
    .line 356
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 357
    .line 358
    and-int/lit16 v0, v0, -0x401

    .line 359
    .line 360
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 361
    .line 362
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->access$2200()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_11

    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->z()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    :cond_11
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_12
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 376
    .line 377
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 382
    .line 383
    .line 384
    :cond_13
    :goto_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-nez v0, :cond_14

    .line 393
    .line 394
    invoke-static {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->u(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 399
    .line 400
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 401
    .line 402
    or-int/lit16 v0, v0, 0x800

    .line 403
    .line 404
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 405
    .line 406
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 407
    .line 408
    .line 409
    :cond_14
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 414
    .line 415
    .line 416
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 417
    .line 418
    .line 419
    return-object p0
.end method

.method public E(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->n(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x8

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public F(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->v()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->n(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public G(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x100

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->k()Lcom/zykj/board/EzyPaint$Paint;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->x()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->n(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x100

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public I(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public J(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x200

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public K(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public L(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x800

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public M(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public N(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public O(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public P(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x8

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public Q(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x4

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public R(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x100

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public S(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public T(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x20

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public U(I)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x40

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->ensureChildGraphIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->ensureChildGraphIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public e(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final ensureChildGraphIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x10

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->isInitialized()Z

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

.method public final getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x10

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->c()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final i(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 v1, v0, 0x2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->e(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I

    .line 19
    .line 20
    .line 21
    :cond_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/zykj/board/EzyRectF$RectF;

    .line 37
    .line 38
    :goto_0
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 v1, 0x0

    .line 44
    :goto_1
    and-int/lit8 v2, v0, 0x8

    .line 45
    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 60
    .line 61
    :goto_2
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 62
    .line 63
    .line 64
    or-int/lit8 v1, v1, 0x2

    .line 65
    .line 66
    :cond_5
    and-int/lit8 v2, v0, 0x20

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_6
    and-int/lit8 v2, v0, 0x40

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m:I

    .line 80
    .line 81
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->n(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I

    .line 82
    .line 83
    .line 84
    :cond_7
    and-int/lit16 v2, v0, 0x80

    .line 85
    .line 86
    if-eqz v2, :cond_8

    .line 87
    .line 88
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n:I

    .line 89
    .line 90
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I

    .line 91
    .line 92
    .line 93
    :cond_8
    and-int/lit16 v2, v0, 0x100

    .line 94
    .line 95
    if-eqz v2, :cond_a

    .line 96
    .line 97
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 98
    .line 99
    if-nez v2, :cond_9

    .line 100
    .line 101
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/zykj/board/EzyPaint$Paint;

    .line 109
    .line 110
    :goto_3
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->p(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;

    .line 111
    .line 112
    .line 113
    or-int/lit8 v1, v1, 0x4

    .line 114
    .line 115
    :cond_a
    and-int/lit16 v2, v0, 0x200

    .line 116
    .line 117
    if-eqz v2, :cond_b

    .line 118
    .line 119
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {p1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->t(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :cond_b
    and-int/lit16 v0, v0, 0x800

    .line 125
    .line 126
    if-eqz v0, :cond_c

    .line 127
    .line 128
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->v(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_c
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x10

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x11

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 43
    .line 44
    and-int/lit16 v0, v0, 0x400

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 55
    .line 56
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 57
    .line 58
    and-int/lit16 v0, v0, -0x401

    .line 59
    .line 60
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->F(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->F(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->e:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 24
    .line 25
    :cond_0
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 35
    .line 36
    :cond_1
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 41
    .line 42
    iput-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 51
    .line 52
    and-int/lit8 v3, v3, -0x11

    .line 53
    .line 54
    iput v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 55
    .line 56
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l:Ljava/lang/Object;

    .line 57
    .line 58
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->m:I

    .line 59
    .line 60
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->n:I

    .line 61
    .line 62
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 72
    .line 73
    :cond_3
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->q:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 76
    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iput-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 90
    .line 91
    and-int/lit16 v0, v0, -0x401

    .line 92
    .line 93
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 94
    .line 95
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t:Ljava/lang/Object;

    .line 96
    .line 97
    return-object p0
.end method

.method public l()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->j:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x11

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x400

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x400

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public q()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->G()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public r()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 19
    .line 20
    return-object v0
.end method

.method public s()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->t()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->K(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->K(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->S(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->S(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->V(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF;

    .line 19
    .line 20
    return-object v0
.end method

.method public v()Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public w()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->o:Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->k()Lcom/zykj/board/EzyPaint$Paint;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 19
    .line 20
    return-object v0
.end method

.method public x()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->y()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public final z()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->c:I

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0x400

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->r:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->s:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method
